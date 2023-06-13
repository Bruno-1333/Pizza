class Pizza {

    var taille: String = ""
    var ingredients : Array<String> = arrayOf()
    var type: String = ""

    // constructeur
    constructor(taille: String, ingredients: Array<String>, type: String) {
        this.taille = taille
        this.ingredients = ingredients
        this.type = type
    }
    // constructeur vide
    constructor() {
        this.taille = ""
        this.ingredients = arrayOf()
        this.type = ""
    }

    // mathodo pour calculer le prix
    fun calculerPrix(): Double {
        var prix: Double = 0.0
        when (this.taille) {
            "radioP" -> prix = 10.0
            "radioM" -> prix = 15.0
            "radioL" -> prix = 20.0
            "radioXL" -> prix = 25.0
            "radioXXL" -> prix = 30.0


        }
        prix = ingredients.size * 2 + prix
        return prix
    }






}