package org.example.crud

import java.sql.Connection
import java.sql.DriverManager

class EntidadeJDBC (
    val usuario : String,
    val url : String,
    val senha : String
){
    fun conectarComBanco(): Connection?{
        // quando precisa fazer algo que possa falhar
        try{
            val coneccao : Connection = DriverManager.getConnection(
                //quando a classe instanciar os atributos abaixo
                this.url, this.usuario, this.senha
            )
            println("Conectando com sucesso!")
            return coneccao

        } catch (erro: Exception){
            println(erro.printStackTrace())
        }
        return null
    }
}