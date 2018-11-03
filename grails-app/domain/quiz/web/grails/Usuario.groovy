package quiz.web.grails


class Usuario {

    int id_usuario
    String nombre
    String pass
    String apellidos
    String cedula
    String mail
    String fecha_Nacimiento
    boolean admin


    static constraints = {
        pass nullable: false, blank: false, password: true
        mail nullable: false, blank: false, unique: true
    }
    static mapping = {
        id generator:'assigned', name:'id_usuario'
    }
}