package com.brunoleonardo.pizza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.brunoleonardo.pizza.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding // binding pour lier le

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)//recuperer le layout, root est le layout principal

        var tabPizza: Array<String> = arrayOf("Pizza Napolitaine", "Pizza 6 Fromage", "Pizza Bacon", "Pizza Sicilienne", "Pizza Peperoni") // tableau d'ingredients

        var pizzaAdapter: ArrayAdapter<String> = // adapter pour afficher le tableau d'ingredients
            ArrayAdapter(this, android.R.layout.simple_list_item_1, tabPizza) // adapter pour afficher le tableau d'ingredients dans une liste simple

        binding.listePizza.adapter = pizzaAdapter // binding pour lier le layout

        binding.listePizza.setOnItemClickListener { parent, view, position, id -> // creation d'un listener pour la liste
            var donnee = binding.listePizza.getItemAtPosition(position).toString() // recupere la donnee selectionnee
            Toast.makeText(this, "Pizza: $donnee", Toast.LENGTH_SHORT).show() // affiche la donnee selectionnee
        } //
    }
}