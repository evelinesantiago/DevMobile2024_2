package com.example.profileapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializando componentes
        val profileImage = findViewById<ImageView>(R.id.profileImage)
        val nameText = findViewById<TextView>(R.id.nameText)
        val descriptionText = findViewById<TextView>(R.id.descriptionText)
        val currentJobText = findViewById<TextView>(R.id.currentJobText)
        val experienceLayout = findViewById<LinearLayout>(R.id.experienceLayout)

        // Definindo informações de perfil
        nameText.text = "Veveta"
        descriptionText.text = "Estudante motivada e proativa com sólida base em python, javascript, react. " +
                                "Possuo forte interesse na área de desenvolvimento web, ciência de dados e " +
                                "Busco aplicar meus conhecimentos em um ambiente desafiador e inovador "
        currentJobText.text = "Emprego atual: à procura de um"

        // Lista de experiências
        val experiencias = listOf(
            "Analista de dados - Empresa Vevis",
            "Atendimento ao suporte técnico - Empresa Vp"
        )

        // Adicionando experiências dinamicamente
        for (experiencia in experiencias) {
            val textView = TextView(this)
            textView.text = experiencia
            textView.textSize = 16f
            experienceLayout.addView(textView)
        }

        profileImage.setOnClickListener {
            Toast.makeText(this, "Foto de Perfil", Toast.LENGTH_SHORT).show()
        }
    }
}