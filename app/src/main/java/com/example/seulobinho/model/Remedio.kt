package com.example.seulobinho.model

import android.graphics.Bitmap

data class Remedio(var imagem: Bitmap? = null, val nome:String? = null, var mensagem:String? = null, val horario:String? = null) {
}