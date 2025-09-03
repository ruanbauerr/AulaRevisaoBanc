package org.example.entidades

import java.math.BigDecimal

class Servico(
    val valorDoservico: BigDecimal,
    val ferramentas: String,
    val funcionarios: Funcionario,
    val tempo: Double,
    val dataInstalacao: String,
    val localInstalacao: String,
    val cliente: String,
    val notaServico: Double,


    ) {
}