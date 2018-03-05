package gitpractica

class BootStrap {

    def init = { servletContext ->
    }
    def destroy = {
    }

    def u1 = new User(name: "Juan", user: "Juan", password: "Juan")
    def u2 = new User(name: "Jere", user: "Jere", password: "Jere")
    def u3 = new User(name: "Facu", user: "Facu", password: "Facu")

    def s1 = new Site(idSite: "MLA", name: "ARGENTINA", active: true)
    def s2 = new Site(idSite: "MLX", name: "MEXICO", active: true)
    def s3 = new Site(idSite: "MLB", name: "BRASIL", active: true)
    def s4 = new Site(idSite: "MLC", name: "COLOMBIA", active: false)
    def s5 = new Site(idSite: "MLP", name: "PORTUGAL", active: false)

    def c1 = new Category(name: "Autos", urlImage: "https://cdn.browshot.com/static/images/not-found.png", visits: 0)
    def c2 = new Category(name: "Inmuebles", urlImage: "https://cdn.browshot.com/static/images/not-found.png", visits: 0)
    def c3 = new Category(name: "Bebes", urlImage: "https://cdn.browshot.com/static/images/not-found.png", visits: 0)
    def c4 = new Category(name: "Herramientas", urlImage: "https://cdn.browshot.com/static/images/not-found.png", visits: 0)
    def c5 = new Category(name: "Indumentaria", urlImage: "https://cdn.browshot.com/static/images/not-found.png", visits: 0)

}
