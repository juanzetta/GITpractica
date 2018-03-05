package gitpractica

class Site {
    String name
    String apellido

    static  hasMany = [categories:Category]

    static constraints = {
    }
}
