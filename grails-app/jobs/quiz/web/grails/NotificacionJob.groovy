package quiz.web.grails

class NotificacionJob {
    def concurrent = false
    static triggers = {
        simple repeatInterval: 10
    }

    void execute() {
        print "Job run!"
    }
}
