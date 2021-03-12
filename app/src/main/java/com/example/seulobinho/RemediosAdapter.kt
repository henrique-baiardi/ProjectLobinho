package com.example.seulobinho

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.get
import androidx.core.view.size
import androidx.recyclerview.widget.RecyclerView
import com.example.seulobinho.model.Remedio

class RemediosAdapter( private val listaRemedios: MutableList<Remedio>) : RecyclerView.Adapter<RemediosAdapter.viewHolder>(){

    fun adicionarRemedio(lista: MutableList<Remedio>,novoRemedio: Remedio){
        if (novoRemedio.nome == "null" && novoRemedio.mensagem == "null" && novoRemedio.horario == "null" && novoRemedio.imagem == null) {

        }else{
            lista.add(novoRemedio)
            notifyDataSetChanged()
        }
    }

    class viewHolder(view: View) : RecyclerView.ViewHolder(view){
        val nomeRemedio: TextView = view.findViewById(R.id.txtNomeRemedio)
        val descricaoRemedio: TextView = view.findViewById(R.id.txtDescricaoRemedio)
        val horarioRemedio: TextView = view.findViewById(R.id.txtDespertadorRemedio)
        val imagemRemedio: ImageView = view.findViewById(R.id.imgRemedio)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_remedio, parent, false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
//-------------Quero reverter a lista tt----------------------------------------------------------------
//            listaRemedios.reverse()
            listaRemedios[position].imagem?.let {
                holder.imagemRemedio.setImageBitmap(it)
            }
            holder.nomeRemedio.text = listaRemedios[position].nome
            holder.descricaoRemedio.text = listaRemedios[position].mensagem
            holder.horarioRemedio.text = listaRemedios[position].horario
    }

    override fun getItemCount(): Int {
        return listaRemedios.size
    }
}