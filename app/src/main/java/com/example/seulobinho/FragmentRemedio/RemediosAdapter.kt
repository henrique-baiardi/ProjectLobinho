package com.example.seulobinho.FragmentRemedio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.seulobinho.R
import com.example.seulobinho.model.Remedio

class RemediosAdapter( private val listaRemedios: MutableList<Remedio>) : RecyclerView.Adapter<RemediosAdapter.viewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_remedio, parent, false)
        return viewHolder(view)
    }

    class viewHolder(view: View) : RecyclerView.ViewHolder(view){
        val nomeRemedio: TextView = view.findViewById(R.id.txtNomeRemedio)
        val descricaoRemedio: TextView = view.findViewById(R.id.txtDescricaoRemedio)
        val horarioRemedio: TextView = view.findViewById(R.id.txtDespertadorRemedio)
        val imagemRemedio: ImageView = view.findViewById(R.id.imgRemedio)

    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
//-------------Disposicao da Lista RV---------------------------------
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
