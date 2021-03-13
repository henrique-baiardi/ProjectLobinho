package com.example.seulobinho

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import com.example.seulobinho.FragmentRemedio.NovoRemedioActivity
import com.example.seulobinho.FragmentRemedio.RemediosAdapter
import com.example.seulobinho.model.Remedio
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//

        val tabLayout = findViewById<TabLayout>(R.id.meuTabLayout)
        val viewPager = findViewById<ViewPager>(R.id.mineViewPage)

        viewPager.adapter = PagesAdapter(supportFragmentManager)
        tabLayout.setupWithViewPager(viewPager)
        
//-------------------------------------------------------------------------------------------------------
        val addRemedio = findViewById<Button>(R.id.btnCadastrar)

        val botaoCadastrarRemedio = findViewById<Button>(R.id.btnAddRemedio)
        botaoCadastrarRemedio.setOnClickListener {

            Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show()

            val destinoActivity = Intent(this, NovoRemedioActivity::class.java)
            startActivity(destinoActivity)
        }

/////////-------------------A GABIARRA DA RAINHA-------------------------------------------------------------

//        val nomeRecebido = intent.extras?.get("Nome").toString()
//        val descricaoRecebida = intent.extras?.get("Descricao").toString()
//        val frequenciaRecebida = intent.extras?.get("Frequencia").toString()
//
////        if(listaNovoRemedio.isEmpty()){
//        adapterRemedio.adicionarRemedio(MainActivity.listaNovoRemedio, Remedio(null,nomeRecebido,descricaoRecebida,frequenciaRecebida))
////        }

/////////-------------------A GABIARRA DA RAINHA-------------------------------------------------------------



    }//--FIM ONCREATE--//
    companion object{
        val listaRemediosAD = mutableListOf<Remedio>()
    }


}
