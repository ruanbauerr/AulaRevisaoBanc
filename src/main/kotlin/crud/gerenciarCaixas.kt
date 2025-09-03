package org.example.crud

import org.example.entidades.CaixaDAgua
import org.example.enumeradores.Cor
import org.example.enumeradores.Material

fun criarTabelaCaixa(){
    val conectar = EntidadeJDBC(
        url = "jdbc:postgresql://localhost:5432/aula04",
        usuario = "postgres",
        senha = "5432"
    )

    //coloque o nome da tabela o mesmo nome da entidade

    val sql = "CREATE TABLE IF NOT EXISTS CaixaDAgua" +
            " (id serial NOT NULL PRIMARY KEY," +
            " material varchar(255)," +
            " cor varchar(255)," +
            " capacidade float," +
            " largura float," +
            " altura float," +
            " profundidade float" +
            ")"//cada coluna da tabela precisa ter o mesmo no dos atributos da entidade

    val banco = conectar.conectarComBanco()
    val enviarParaBanco = banco!!.createStatement().execute(sql)

    println(enviarParaBanco)// Se retornar false ou 1, deu certo

    banco.close()

}

fun cadastrarCaixa(){

    println("Escolha o material do qual a caixa é composta:")
    println("1- PVC")
    println("2-Tijolo")
    println("3-Fibra")
    val opcao = readln().toInt()
    var material : Material
    when (opcao) {
        1-> material = Material.PVC
        2-> material = Material.TIJOLO
        3-> material = Material.FIBRA
        else-> material = Material.FIBRA
    }
    println("escolha a cor da caixa:")
    println("1- AZUL")
    println("2- CINZA")
    println("3- AMARELO")
    println("4- PRETO")
    val opcaoCor = readln().toInt()
    var cor : Cor
    when (opcaoCor) {
        1-> cor = Cor.AZUL
        2-> cor = Cor.CINZA
        3-> cor = Cor.AMARELO
        4-> cor = Cor.PRETO
        else -> cor = Cor.AZUL
    }
    println("Digite a capacidade da caixa em litros:")
    val capacidade = readln().toDouble()
    println("Digite a Altura:")
    val altura = readln().toDouble()
    println("Digite a Largura: ")
    val largura = readln().toDouble()
    println("Digite a Profundidade: ")
    val profundidade = readln().toDouble()

    //salvar as variaveis agora dentro da classe
    CaixaDAgua(
        material = material,
        cor = cor,
        capacidade = capacidade,
        altura = altura,
        largura = largura,
        profundidade = profundidade,

    )

}
fun editarCaixa(){

}
fun listarCaixas(){

}
fun excluirCaixa(){

}