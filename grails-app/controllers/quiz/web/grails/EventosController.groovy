package quiz.web.grails

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.concurrent.TimeUnit

class EventosController {

    def index() {
        def eventos = Eventos.list()

        render(view: "index",model: [eventos:eventos])

    }
    def form() {
    }
    def save() {
        def event = new Eventos(params)

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm")
        Date date = new Date()
        Date firstDate = dateFormat.parse(event.fecha_ini)
        Date secondDate = dateFormat.parse(dateFormat.format(date))

        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime())
        event.tiempo_ini = Math.ceil(TimeUnit.MINUTES.convert(diffInMillies, TimeUnit.MILLISECONDS))



        event.save(failOnError:true)
        def eventos = Eventos.list()
        render(view: "index",model: [eventos:eventos])
    }
    def crear(){
        render(view:"crear")
    }
}
