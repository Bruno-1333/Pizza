package com.brunoleonardo.pizza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.RadioButton
import android.widget.Toast
import com.brunoleonardo.pizza.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding // binding pour lier le
    var pizzaCourante: Pizza = Pizza("", "", ArrayList<String>()) // creation d'une pizza vide
    var panier: Panier = Panier() // creation d'un panier vide

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)//recuperer le layout, root est le layout principal

        binding.ingredient1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                pizzaCourante.ingredients.add(buttonView.text.toString())
            } else {
                pizzaCourante.ingredients.remove(buttonView.text.toString())
            }
            binding.recap.text = pizzaCourante.toString()
        }

        binding.ingredient2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                pizzaCourante.ingredients.add(buttonView.text.toString())
            } else {
                pizzaCourante.ingredients.remove(buttonView.text.toString())
            }
            binding.recap.text = pizzaCourante.toString()
        }

        binding.ingredient3.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                pizzaCourante.ingredients.add(buttonView.text.toString())
            } else {
                pizzaCourante.ingredients.remove(buttonView.text.toString())
            }
            binding.recap.text = pizzaCourante.toString()
        }

        binding.ingredient4.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                pizzaCourante.ingredients.add(buttonView.text.toString())
            } else {
                pizzaCourante.ingredients.remove(buttonView.text.toString())
            }
            binding.recap.text = pizzaCourante.toString()
        }

        binding.ingredient5.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                pizzaCourante.ingredients.add(buttonView.text.toString())
            } else {
                pizzaCourante.ingredients.remove(buttonView.text.toString())
            }
            binding.recap.text = pizzaCourante.toString()
        }

        binding.ingredient6.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                pizzaCourante.ingredients.add(buttonView.text.toString())
            } else {
                pizzaCourante.ingredients.remove(buttonView.text.toString())
            }
            binding.recap.text = pizzaCourante.toString()
        }

        binding.listePizza.setOnItemClickListener { parent, view, position, id ->
           pizzaCourante.type = binding.listePizza.getItemAtPosition(position).toString()
            binding.recap.text = pizzaCourante.toString()
        }

        binding.btnAjouterPanier.setOnClickListener {
            // verifier si la pizza est complete avec un type et une taille
            panier.ajouterPizza(pizzaCourante)
            pizzaCourante = Pizza("", "", ArrayList<String>())
            Toast.makeText(this, "Pizza ajoutée au panier", Toast.LENGTH_SHORT).show()
            //vider les ingredients
            binding.ingredient1.isChecked = false
            binding.ingredient2.isChecked = false
            binding.ingredient3.isChecked = false
            binding.ingredient4.isChecked = false
            binding.ingredient5.isChecked = false
            binding.ingredient6.isChecked = false
            //vider le type
            binding.listePizza.clearChoices()
            //vider la taille
            binding.radioP.isChecked = false
            binding.radioM.isChecked = false
            binding.radioL.isChecked = false
            binding.radioXL.isChecked = false
            binding.radioXXL.isChecked = false

            //vider le recap
            binding.recap.text = pizzaCourante.toString()

            //vider le type
            binding.listePizza.clearChoices()

        }

        binding.btnVoirPanier.setOnClickListener {
            var intent = Intent(this, PannierActivity::class.java)
            intent.putExtra("panier", panier)
            startActivity(intent)
        }
    }

    fun actionRadio(view: View) {
        pizzaCourante.taille = (view as RadioButton).text.toString()


    }
}
