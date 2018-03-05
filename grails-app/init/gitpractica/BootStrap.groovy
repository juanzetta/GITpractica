package gitpractica

class BootStrap {

    def init = { servletContext ->
    }
    def destroy = {
    }

    def u1 = new User(name: "Juan", user: "Juan", password: "Juan").save()
    def u2 = new User(name: "Jere", user: "Jere", password: "Jere").save()
    def u3 = new User(name: "Facu", user: "Facu", password: "Facu").save()

    def s1 = new Site(idSite: "MLA", name: "ARGENTINA", active: true).save()
    def s2 = new Site(idSite: "MLX", name: "MEXICO", active: true).save()
    def s3 = new Site(idSite: "MLB", name: "BRASIL", active: true).save()
    def s4 = new Site(idSite: "MLC", name: "COLOMBIA", active: false).save()
    def s5 = new Site(idSite: "MLP", name: "PORTUGAL", active: false).save()

    def c1 = new Category(name: "Autos", urlImage: "https://cdn.browshot.com/static/images/not-found.png", visits: 0, site: s1 ).save()
    def c2 = new Category(name: "Inmuebles", urlImage: "https://cdn.browshot.com/static/images/not-found.png", visits: 0,  site: s1).save()
    def c3 = new Category(name: "Bebes", urlImage: "https://cdn.browshot.com/static/images/not-found.png", visits: 0, site: s1).save()
    def c4 = new Category(name: "Herramientas", urlImage: "https://cdn.browshot.com/static/images/not-found.png", visits: 0, site: s1).save()
    def c5 = new Category(name: "Indumentaria", urlImage: "https://cdn.browshot.com/static/images/not-found.png", visits: 0, site: s1).save()

}
