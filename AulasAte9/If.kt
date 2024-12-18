package AulasAte9

fun main() {

    val num = 30
    if (num > 20) {
        println("Numero maior que 20")
    }
    maiorDeIdade(18)
    maiorDeIdade(15)
}

fun maiorDeIdade(idade: Int) {
    if (idade > 18) {
        println("Maior de idade")
        if (idade > 60) {
            println("Idoso")
        } else if (idade < 10) {
            println("Criança")
        }
    } else {
        println("Menor de idade")
    }
}

fun saudacao(dia: Boolean): String {
    return if (dia) {
        "Bom dia"
    } else {
        "Boa noite"
    }
}