package com.example.seulobinho.FragmentRemedio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.seulobinho.MainActivity
import com.example.seulobinho.R
import com.example.seulobinho.model.Remedio

class RemediosFragment : Fragment() {

    lateinit var adapter: RemediosAdapter

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

        MainActivity.listaRemediosAD.add(Remedio())//criar o remedio"

        val rvRemdeios = view.findViewById<RecyclerView>(R.id.listaRemedios)


        adapter = RemediosAdapter(MainActivity.listaRemediosAD)
        rvRemdeios.adapter = adapter

        rvRemdeios.layoutManager = LinearLayoutManager(requireContext())

    }

    //ativa sempre aque voltar a essa frag| atualiza
    override fun onResume() {
        super.onResume()
        //controlar esse resume com if
        adapter.notifyDataSetChanged()
    }







    // criar o comunicador e pegar seus dados
    //val model = ViewModelProviders.of(activity!!).get(Communicator::class.java)
    //arguments bundle|

//add na view mas nao funciona para a fragment =/
//    val nomeRecebido = intent.extras?.get("Nome").toString()
//    val descricaoRecebida = intent.extras?.get("Descricao").toString()
//    val frequenciaRecebida = intent.extras?.get("Frequencia").toString()
//
//    adapterRemedio.adicionarRemedio(MainActivity.listaNovoRemedio, Remedio(null,nomeRecebido,descricaoRecebida,frequenciaRecebida))

}