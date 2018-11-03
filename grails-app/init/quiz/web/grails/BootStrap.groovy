package quiz.web.grails

class BootStrap {

    def init = { servletContext ->
        new Usuario(nombre: "admin",apellidos: "admin",cedula: "admin",pass: "admin",admin: true ,mail: "ADMIN@admin.com",fecha_Nacimiento: "19/2/1990" ,edad: 21).save(failOnError:true)
        new NotificacionJob().execute()

    }
    def destroy = {
    }
}
