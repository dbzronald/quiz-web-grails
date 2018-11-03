package quiz.web.grails

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/eventos/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
