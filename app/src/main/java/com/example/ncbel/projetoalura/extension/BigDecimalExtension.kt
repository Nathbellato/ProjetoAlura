package com.example.ncbel.projetoalura.extension

import com.example.ncbel.projetoalura.model.Resumo
import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.Locale

fun BigDecimal.formataParaBrasileiro1(): String {
    val formatoBrasileiro = DecimalFormat
            .getCurrencyInstance(Locale("pt", "br"))
    return formatoBrasileiro.format(this)
            .replace("R$", "R$ ")
            .replace("-R$ ","R$ -")




}

