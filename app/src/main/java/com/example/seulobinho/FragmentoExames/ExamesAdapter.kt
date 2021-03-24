package com.example.seulobinho.FragmentoExames

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.seulobinho.R
import com.example.seulobinho.model.Exame

class ExamesAdapter(private val listaExames: MutableList<Exame>) : RecyclerView.Adapter<ExamesAdapter.viewHolder>() {

    class viewHolder(view: View) : RecyclerView.ViewHolder(view){
        val nomeExame: TextView = view.findViewById(R.id.txtNomeExame)
        val localExame: TextView = view.findViewById(R.id.txtLocalExame)
        val horarioExame: TextView = view.findViewById(R.id.txtHorarioExame)
        val imagemExame: ImageView = view.findViewById(R.id.imgExame)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_exame, parent, false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
//---Reverter a lista || listaExames.reverse()---
// sugestao sandy: add item asReaverse() | na activity ou em um ciclo de vida especifico

        listaExames[position].imagem?.let {
            holder.imagemExame.setImageBitmap(it)
        }
        holder.nomeExame.text = listaExames[position].nome
        holder.localExame.text = listaExames[position].local
        holder.horarioExame.text = listaExames[position].horario
    }

    override fun getItemCount(): Int {
        return listaExames.size
    }
}