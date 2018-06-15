package com.example.ncbel.projetoalura.ui

import android.content.Context
import android.support.v4.content.ContextCompat
import android.view.View
import com.example.ncbel.projetoalura.R
import com.example.ncbel.projetoalura.extension.formataParaBrasileiro1
import com.example.ncbel.projetoalura.model.Resumo
import com.example.ncbel.projetoalura.model.Transacao
import kotlinx.android.synthetic.main.resumo_card.view.*
import java.math.BigDecimal

class ResumoView(private val context: Context,
                private val view: View,
                 transacoes: List<Transacao>) {

    private val resumo : Resumo = Resumo(transacoes)
    private val corReceita = ContextCompat.getColor(context, R.color.receita)
    private val corDespesa = ContextCompat.getColor(context, R.color.despesa)

    fun atualiza(){
        adicionaReceita()
        adicionaDespesa()
        adicionaTotal()
    }


    private fun adicionaReceita() {
        val totalReceita = resumo.receita
        with(view.resumo_card_receita) {
            setTextColor(corReceita)
            text = totalReceita.formataParaBrasileiro1()
        }
    }


    private fun adicionaDespesa() {
        val totalDespesa = resumo.despesa
        with(view.resumo_card_despesa){
            setTextColor(corDespesa)
            text = totalDespesa.formataParaBrasileiro1()
        }
    }

    private fun adicionaTotal() {
        val total = resumo.total
        val cor = corPor(total)
        with(view.resumo_card_total) {
            setTextColor(cor)
            text = total.formataParaBrasileiro1()
        }
    }

    private fun corPor(valor: BigDecimal): Int {
        if (valor >= BigDecimal.ZERO) {
            return corReceita
        }
            return corDespesa

    }
}