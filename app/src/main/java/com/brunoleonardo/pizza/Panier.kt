package com.brunoleonardo.pizza

import java.io.Serializable

class Panier : Serializable{
    var pizzas: ArrayList<Pizza> = ArrayList<Pizza>()

    fun ajouterPizza(pizza: Pizza) {
        pizzas.add(pizza)
    }

    fun nombreArticles(): Int {
        return pizzas.count()
    }

    fun TotalCommande(): Double {
        var total = 0.0
        for (pizza in pizzas) {
            total += pizza.calculerPrix()
        }
        return total

    }
}