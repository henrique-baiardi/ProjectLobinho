package com.example.seulobinho.model

import android.graphics.Bitmap

data class Exame(var imagem: Bitmap? = null, val nome:String? = null, var local:String? = null, val horario:String? = null) {
}
