package gitpractica

class Category {
    String name

    static belongsTo = [site:Site]

    static constraints = {
    }
}
