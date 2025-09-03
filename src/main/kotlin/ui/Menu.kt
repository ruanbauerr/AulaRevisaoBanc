package org.example.ui

fun menu(){
  do{
      println("1-Cadastrar Caixa D'Agua ")
      println("2-Editar Caixa D'Agua ")
      println("3-Listar Caixa D'Agua ")
      println("4-Excluir Caixa D'Agua ")
      println("0- Sair")

      val opcao= readln().toInt()
      when (opcao) {
          0-> println("Saindo...")
          1 -> println("Cadastrando caixa...")
          2 -> println("Editando caixa...")
          3 -> println("Listar caixas...")
          4 -> println("Excluindo caixa...")
          else -> println("Opção invalida")
      }
  } while (opcao !=0 )
}