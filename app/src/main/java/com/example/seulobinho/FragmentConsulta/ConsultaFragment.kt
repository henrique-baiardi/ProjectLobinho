package com.example.seulobinho.FragmentConsulta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.seulobinho.R
import com.example.seulobinho.model.Consulta

class ConsultaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_consulta, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listaNovaConsulta: MutableList<Consulta> = mutableListOf (
            Consulta(imagem = null, nome = "Dr. Andre", local = "Hospital 01", horario = "10:00 am"),
            Consulta(imagem = null, nome = "Dr. Bruno", local = "Hospital 02", horario = "8:30 am"),
            Consulta(imagem = null, nome = "Dr. Carlos", local = "Consultorio 01", horario = "2:00 pm")
        )

        val rvConsulta = view.findViewById<RecyclerView>(R.id.listaConsultas)


        val adapterConsulta = ConsultasAdapter(listaNovaConsulta)
        rvConsulta.adapter = adapterConsulta

        rvConsulta.layoutManager = LinearLayoutManager(requireContext())

    }

}