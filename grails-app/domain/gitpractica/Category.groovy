package gitpractica

class Category {
    String name
    String urlImage

    static belongsTo = [site:Site]

    static constraints = {
    }
}
