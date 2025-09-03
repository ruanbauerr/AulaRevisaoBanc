package org.example.entidades

import org.example.enumeradores.Setor
import org.example.enumeradores.Sexo
import java.math.BigDecimal

class Funcionario(
    nome: String,
    idade: Int,
    cpf: Long,
    endereco: String,
    sexo: Sexo,
    val funcao: String,
    val experiencia: Int,
    val habilidade: String,
    val salario: BigDecimal,
    val setor: Setor

) : Pessoa(
    nome = nome,
    idade = idade,
    cpf = cpf,
    endereco = endereco,
    sexo = sexo,

    ) {
    //COMPORTAMENTOS DO PROFISSIONAL
    fun instalarCaixaDAgua(clt: Funcionario) {
        if (clt.setor.equals(Setor.MONTAGEM)) {
            println("Profissional habilitado")
        } else {
            println("Profissional desqualificado")
        }
    }

    //o poliformismo nada mais é do que fazer um SOBREESCRITA do metodo que esta na superclasse
    override fun receberConta(conta: Conta, aPagar: BigDecimal) {
        conta.saldo = conta.saldo.subtract(aPagar)
    }
}
