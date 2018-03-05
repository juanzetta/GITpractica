package gitpractica

class GrailGitController {

    def index() { }

    def sitios() {
        [sitiosList: Site.list(params), sitiosCount: Site.count()]
    }

    def login() {

        if (params.username == "Jere" && params.password == "Jere" ) {
            flash.message = "Logueado correctamente"
            session.user = "Jere"
        }else{
            render (view:'login')
            flash.message = "Fallo Logueo"
        }
        render (view:'sitios')

    }

    def logout(){
        session.user = null
        redirect(action: 'login')
    }

}
