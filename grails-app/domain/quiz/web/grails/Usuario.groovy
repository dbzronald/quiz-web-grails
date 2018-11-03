package quiz.web.grails


class Usuario {


    String nombre
    String pass
    String apellidos
    String cedula
    String mail
    String fecha_Nacimiento
    int edad
    boolean admin
    List<Eventos> eventosList


    static constraints = {
        pass nullable: false, blank: false, password: true
        mail nullable: false, blank: false, unique: true
        eventosList nullable: true
    }
    static mapping = {

    }
}