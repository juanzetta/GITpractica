package gitpractica

class Site {
    int idSite
    String name
    boolean active


    static  hasMany = [categories:Category]

    static constraints = {

    }
}
