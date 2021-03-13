package com.example.seulobinho.FragmentRemedio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.seulobinho.MainActivity
import com.example.seulobinho.R
import com.example.seulobinho.model.Remedio

class NovoRemedioActivity : AppCompatActivity() {

    lateinit var nomeRemedio:EditText
    lateinit var descricaoRemedio:EditText
    lateinit var frequenciaDose:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novo_remedio)


        val botaoFinalizarCadastro = findViewById<Button>(R.id.btnCadastrar)

        //tirar da val daqui e por antes do onCreate
        nomeRemedio = findViewById(R.id.edtNomeRemedio)
        descricaoRemedio = findViewById(R.id.edtDescricaoRemdeio)
        frequenciaDose = findViewById(R.id.edtFrequencia)

        botaoFinalizarCadastro.setOnClickListener {
            val nomeDigitado = nomeRemedio.text.toString()
            val descricaoDigitada = descricaoRemedio.text.toString()
            val frequenciaDigitada = frequenciaDose.text.toString()

            if(nomeDigitado.isEmpty()){
                nomeRemedio.error = "Campo Vazio"

            } else
                if (frequenciaDigitada.isEmpty()){
                    frequenciaDose.error = "Campo vazio"
                } else{
                    val remedio = Remedio(null,nomeDigitado,descricaoDigitada,frequenciaDigitada)
                    acaoBtn()
                    redirecionarCadastro(remedio)

                }
        }

    }

    fun acaoBtn(){
        Toast.makeText(this, "Remedio Cadastrado!", Toast.LENGTH_SHORT).show()
    }

   fun redirecionarCadastro(remedio: Remedio){
//
//        val chaveNomeRemedio = "Nome"
//        val chaveTextoRemedio = "Descricao"
//        val chaveFrequenciaRemedio = "Frequencia"
//
//        val destinoActivity = Intent(this, MainActivity::class.java)
//        destinoActivity.putExtra(chaveNomeRemedio, remedio.nome)
//        destinoActivity.putExtra(chaveTextoRemedio, remedio.mensagem)
//        destinoActivity.putExtra(chaveFrequenciaRemedio, remedio.horario)
//
//        startActivity(destinoActivity)
       MainActivity.listaRemediosAD.add(remedio)
       finish()
   }


}