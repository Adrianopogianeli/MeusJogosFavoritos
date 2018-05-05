package com.example.logonrm.meusjogosfavoritos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.logonrm.meusjogosfavoritos.model.Jogo

class ListaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)
    }

    fun getJogos(): List<Jogo>{
        return listOf(
                Jogo(getString(R.string.titulo_god_of_war),
                        getString(R.string.descricao_god_of_war),
                        2018,
                        R.drawable.godofwar)
        )
    }

}
