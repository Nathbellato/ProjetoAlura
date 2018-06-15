package com.example.ncbel.projetoalura.model

import java.math.BigDecimal
import java.util.Calendar

class Transacao (val valor: BigDecimal,
                 val categoria: String = "Indefinido",
                 val tipo: Tipo,
                 val data: Calendar = Calendar.getInstance())

