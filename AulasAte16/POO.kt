package AulasAte16

class Pessoa(val anoNascimento: Int, var nome: String) {

    var doc: String = ""

    constructor(anoNascimento: Int, nome: String, doc: String) : this(1995, "Indefinido") {
        this.doc = doc
    }

    fun dormir() {

    }

    fun acordar() {

    }
}


fun main() {


    var pessoa: Pessoa = Pessoa(2001, "Fulano")
    pessoa.nome
    pessoa.dormir()
    pessoa.acordar()
    pessoa.doc
}