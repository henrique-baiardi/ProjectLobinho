package com.example.seulobinho.FragmentoExames

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.seulobinho.FragmentoExames.ExamesAdapter
import com.example.seulobinho.R
import com.example.seulobinho.model.Exame


class ExamesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_exames, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listaNovoExame: MutableList<Exame> = mutableListOf (
            Exame(imagem = null, nome = "Raio-x", local = "Clinica X", horario = " 8 horas da manha"),
            Exame(imagem = null, nome = "Raio-y", local = "Clinica y", horario = " 9 horas da manha"),
            Exame(imagem = null, nome = "Raio-z", local = "Clinica z", horario = " 10 horas da manha")
        )

        val rvExames = view.findViewById<RecyclerView>(R.id.listaExames)


        val adapterExame = ExamesAdapter(listaNovoExame.asReversed())
        rvExames.adapter = adapterExame

        rvExames.layoutManager = LinearLayoutManager(requireContext())

    }

}