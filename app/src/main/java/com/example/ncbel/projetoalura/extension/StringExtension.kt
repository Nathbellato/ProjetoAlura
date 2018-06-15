package com.example.ncbel.projetoalura.extension

//verifica se a string categoria é grande,
// se for ela mantem o formato ocultando uma parte da frase
fun String.limitaEmAte(caracteres: Int) : String {
    if (this.length> caracteres){
        val primeiroCaracter = 0
        return "${this.substring(primeiroCaracter,caracteres)}..."
    }
    return this
}