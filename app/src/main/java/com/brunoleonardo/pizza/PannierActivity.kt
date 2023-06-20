package com.brunoleonardo.pizza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.brunoleonardo.pizza.databinding.ActivityPannierBinding

class PannierActivity : AppCompatActivity() {
    lateinit var binding: ActivityPannierBinding
    lateinit var panier: Panier

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPannierBinding.inflate(layoutInflater)
        setContentView(binding.root)

        panier = intent.getSerializableExtra("panier") as Panier

        var adaptateur : ArrayAdapter<Pizza> = ArrayAdapter(this, android.R.layout.simple_list_item_1, panier.pizzas)

        binding.commandes.adapter = adaptateur

        binding.nbarticle.text = panier.nombreArticles().toString()
        binding.total.text = panier.TotalCommande().toString()
    }
}