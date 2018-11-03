package quiz.web.grails

import grails.databinding.BindingFormat

class Eventos {


    String nombre
    String descripcion
    float tiempo_ini
    String fecha_ini

    String fecha_fin
    int edad
    List<Usuario> registrados

    static constraints = {
        registrados nullable: true, blank: true
    }


}

