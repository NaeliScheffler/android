package AulasAte16

interface Funcionarios {
    var salario: Float
    fun bonus(): Float

}

class Gerente(override var salario: Float) : Funcionarios {
    override fun bonus(): Float {
        return salario * 0.5f
    }
}

class Analista(override var salario: Float) : Funcionarios {
    override fun bonus(): Float {
        return salario * 0.3f
    }
}

fun mostraBonus(g: Funcionarios) {
    println(g.bonus())
}



fun main() {
    mostraBonus(Analista(10000f))

    try {

    } catch(e: Exception) {

    }catch (e:NullPointerException){

    }

}