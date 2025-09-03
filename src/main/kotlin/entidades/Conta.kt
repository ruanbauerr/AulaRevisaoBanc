package org.example.entidades

import java.math.BigDecimal

class Conta(
    val pessoa: Pessoa,
    var saldo: BigDecimal,
    val id: Long //numero da conta

) {

}