package org.example.entidades

import org.example.enumeradores.Sexo

class Cliente(
    nome: String,
    idade: Int,
    cpf: Long,
    endereco: String,
    sexo: Sexo,
    val pedidos: Array<String>
) : Pessoa(
    nome = nome,
    idade = idade,
    cpf = cpf,
    endereco = endereco,
    sexo = sexo,

    ) {


}