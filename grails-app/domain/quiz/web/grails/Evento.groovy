package quiz.web.grails

class Evento {

    int id_evento
    String nombre;
    String descripcion
    String fecha_inicio
    String fecha_fin
    int edad

    static constraints = {

    }
    static mapping = {
        id generator:'assigned', name:'id_evento'
    }
}
