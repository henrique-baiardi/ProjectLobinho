package com.example.seulobinho

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageRemedioAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    //numero de abas de Fragments
    override fun getCount(): Int {
        return 3
    }

    //exibicao das Fragments
    override fun getItem(position: Int): Fragment {
        return  when(position){
            0 -> RemediosFragment()
            //ConsultasFragment
            1 -> RemediosFragment()
            //ExamesFragment
            2 -> RemediosFragment()
            else -> RemediosFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Remedios"
            1 -> "Consultas"
            2 -> "Exames"
            else -> return super.getPageTitle(position)
        }
    }
}