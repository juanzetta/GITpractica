package gitpractica

class Site {
    String idSite
    String name
    boolean active


    static  hasMany = [categories:Category]

    static constraints = {

    }
}
