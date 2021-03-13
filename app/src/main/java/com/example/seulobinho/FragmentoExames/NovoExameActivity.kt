package com.example.seulobinho.FragmentoExames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.seulobinho.MainActivity
import com.example.seulobinho.R
import com.example.seulobinho.model.Exame

class NovoExameActivity : AppCompatActivity() {

    val botaoFinalizarCadastro = findViewById<Button>(R.id.btnCadastrarExame)

    lateinit var nomeExame: EditText
    lateinit var localExame: EditText
    lateinit var horarioExame: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novo_exame)

        botaoFinalizarCadastro.setOnClickListener {
            val nomeDigitado = nomeExame.text.toString()
            val localDigitado = localExame.text.toString()
            val horarioDigitado = horarioExame.text.toString()

            if(nomeDigitado.isEmpty()){
                nomeExame.error = "Campo Vazio"

            } else{
                    val exame = Exame(null,nomeDigitado,localDigitado,horarioDigitado)
                    acaoBtn()
                    redirecionarCadastro(exame)

                }
        }
    }
    fun acaoBtn(){
        Toast.makeText(this, "Exame Cadastrado!", Toast.LENGTH_SHORT).show()
    }

    fun redirecionarCadastro(exame: Exame){

        val chaveNomeExame = "Nome"
        val chaveLocalExame = "Local"
        val chaveHorarioExame = "Horario"

        val destinoActivity = Intent(this, MainActivity::class.java)
        destinoActivity.putExtra(chaveNomeExame, exame.nome)
        destinoActivity.putExtra(chaveLocalExame, exame.local)
        destinoActivity.putExtra(chaveHorarioExame, exame.horario)

        startActivity(destinoActivity)
    }
}