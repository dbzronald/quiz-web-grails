package quiz.web.grails

class BootStrap {

    def init = { servletContext ->
        new Usuario(nombre: "admin",apellidos: "admin",cedula: "admin",pass: "admin",admin: true ,mail: "ADMIN@admin.com",fecha_Nacimiento: "19/2/1990").save(failOnError:true)

    }
    def destroy = {
    }
}
