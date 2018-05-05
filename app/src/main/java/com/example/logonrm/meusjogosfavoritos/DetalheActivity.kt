package com.example.logonrm.meusjogosfavoritos

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.example.logonrm.meusjogosfavoritos.model.Jogo
import kotlinx.android.synthetic.main.activity_detalhe.*

class DetalheActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe)
        setSupportActionBar(toolbar)

        val jogo = intent.getParcelableExtra<Jogo>("jogo")
        toolbar_layout.title = jogo.titulo

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }
}
