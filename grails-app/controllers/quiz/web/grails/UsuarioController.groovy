package quiz.web.grails

import org.springframework.web.servlet.ModelAndView

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.concurrent.TimeUnit

class UsuarioController {

    def form() {
    }
    def save() {
        def person = new Usuario(params)

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy")
        Date date = new Date()
        Date firstDate = dateFormat.parse(person.fecha_Nacimiento)
        Date secondDate = dateFormat.parse(dateFormat.format(date))



        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime())
        person.edad = Math.ceil(TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS))/365

        person.save()
        def usuarios = Usuario.list()
        render(view:  "index",model:[Usuarios: usuarios ])
    }
    def index(){
        def usuarios = Usuario.list()
        render(view:  "index",model:[Usuarios: usuarios ])
    }
    def crear(){
        render(view:"crearUsuario")
    }

}
