package com.example.seulobinho.FragmentConsulta

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.seulobinho.R
import com.example.seulobinho.model.Consulta

class ConsultasAdapter (private val listaConsultas: MutableList<Consulta>) : RecyclerView.Adapter<ConsultasAdapter.viewHolder>() {
    fun adicionarRemedio(lista: MutableList<Consulta>, novaConsulta: Consulta){
//        if (novoRemedio.nome == "null" && novoRemedio.mensagem == "null" && novoRemedio.horario == "null" && novoRemedio.imagem == null) {
//        }else{
        lista.add(novaConsulta)
        notifyDataSetChanged()
//        }
    }

    class viewHolder(view: View) : RecyclerView.ViewHolder(view){
        val nomeMedicoConsulta: TextView = view.findViewById(R.id.txtNomeConsulta)
        val localConsulta: TextView = view.findViewById(R.id.txtLocalConsulta)
        val horarioConsulta: TextView = view.findViewById(R.id.txtHorarioConsulta)
        val imagemMedicoConsulta: ImageView = view.findViewById(R.id.imgConsulta)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_consulta, parent, false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
//-------------Quero reverter a lista tt----------------------------------------------------------------
//            listaRemedios.reverse()
        listaConsultas[position].imagem?.let {
            holder.imagemMedicoConsulta.setImageBitmap(it)
        }
        holder.nomeMedicoConsulta.text = listaConsultas[position].nome
        holder.localConsulta.text = listaConsultas[position].local
        holder.horarioConsulta.text = listaConsultas[position].horario
    }

    override fun getItemCount(): Int {
        return listaConsultas.size
    }
}