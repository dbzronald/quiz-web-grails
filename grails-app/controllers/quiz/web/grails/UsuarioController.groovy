package quiz.web.grails

class UsuarioController {

    def form() {
    }
    def save() {
        def person = new Usuario(params)
        person.save()
        render "Success!"
    }
}
