package quiz.web.grails

import org.springframework.web.servlet.ModelAndView

class UsuarioController {

    def form() {
    }
    def save() {
        def person = new Usuario(params)
        person.save()
        def usuarios = Usuario.getAll()
        render(view:  "index",model:[Usuarios: usuarios ])
    }
    def index(){
        def usuarios = Usuario.getAll()
        render(view:  "index",model:[Usuarios: usuarios ])
    }
    def crear(){
        render(view:"crearUsuario")
    }

}
