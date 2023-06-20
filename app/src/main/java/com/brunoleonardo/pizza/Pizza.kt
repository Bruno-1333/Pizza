package com.brunoleonardo.pizza

import java.io.Serializable
import java.util.ArrayList

public class Pizza (var type : String, var taille: String, var ingredients: ArrayList<String>) :
    Serializable {
    override fun toString(): String {
        return "type='$type\n" +
                "taille : $taille\n" +
                "ingredients : $ingredients\n" +
                "prix : ${calculerPrix()}"

    }

    fun calculerPrix(): Double {
        var prix = 0.0
        when (taille) {
            "P" -> prix = 5.0
            "M" -> prix = 7.0
            "L" -> prix = 9.0
            "XL" -> prix = 11.0
            "XXL" -> prix = 13.0
        }
        return prix
    }
}