package com.example.seulobinho

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.seulobinho.model.Remedio

class RemediosFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_remedios, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listaNovoRemedio: MutableList<Remedio> = mutableListOf (
            Remedio(imagem = null, nome = "VitaminaC", mensagem = "Tomar ao acordar", horario = "De 8 em 8 horas"),
            Remedio(imagem = null, nome = "Xarope", mensagem = "Depois do almoco", horario = "Uma vez por dia"),
            Remedio(imagem = null, nome = "Solzinho", mensagem = "Sempre pela manha", horario = "De 30 a 45min")
        )

        val rvRemdeios = view.findViewById<RecyclerView>(R.id.listaRemedios)


        val adapterRemedio = RemediosAdapter(listaNovoRemedio)
        rvRemdeios.adapter = adapterRemedio

        rvRemdeios.layoutManager = LinearLayoutManager(requireContext())

    }

//    val nomeRecebido = intent.extras?.get("Nome").toString()
//    val descricaoRecebida = intent.extras?.get("Descricao").toString()
//    val frequenciaRecebida = intent.extras?.get("Frequencia").toString()

//    adapterRemedio.adicionarRemedio(MainActivity.listaNovoRemedio, Remedio(null,nomeRecebido,descricaoRecebida,frequenciaRecebida))

}