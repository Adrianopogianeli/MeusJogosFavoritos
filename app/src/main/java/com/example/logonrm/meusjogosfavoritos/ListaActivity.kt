package com.example.logonrm.meusjogosfavoritos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import android.widget.Toast
import com.example.logonrm.meusjogosfavoritos.model.Jogo
import com.example.logonrm.meusjogosfavoritos.model.JogoAdapter
import kotlinx.android.synthetic.main.activity_lista.*

class ListaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)


        rvJogos.adapter = JogoAdapter(this, getJogos(), {
            Toast.makeText(this,it.titulo,Toast.LENGTH_LONG).show()

            val intentDetalhe = Intent(this,DetalheActivity::class.java)

            intentDetalhe.putExtra("jogo", it)

            startActivity(intentDetalhe)

        },{
            Toast.makeText(this,"Delete ${it.titulo}",
                    Toast.LENGTH_LONG).show()
        })
        rvJogos.layoutManager = LinearLayoutManager(this)

    }

    fun getJogos(): List<Jogo>{
        return listOf(
                Jogo(getString(R.string.titulo_god_of_war),
                        getString(R.string.descricao_god_of_war),
                        2018,
                        R.drawable.godofwar,
                        R.drawable.godofwarbanner)
        )
    }

}
