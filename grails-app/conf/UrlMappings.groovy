class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
		
		"/admin/refresh"(controller:'admin', action: 'refresh')
		"/sideways"(view:'/sideways/index')
		"/sideways2"(view:'/sideways/clickmode')
        "/"(controller:'home')
        "500"(view:'/errors/500')
        "403"(view:'/errors/403')
        "404"(view:'/errors/404')
        "503"(view:'/errors/503')
	}
}
