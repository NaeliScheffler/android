package AulasAte16

fun main() {

    var forma1 = FormaData(10, 8)
    var forma2 = FormaData(10, 8)
    println(forma1.equals(forma2))
    println(forma1.toString())
    println(forma1.hashCode())
    println("----------")
    println(forma2.toString())
    println(forma2.hashCode())

    forma2 = forma1.copy()
}

class Forma(val a: Int, val b: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is Forma) {
            return (other.a == this.a && other.b == this.b)
        }
        return false
    }

    override fun toString(): String {
        return "${this.a}+${this.b}"
    }
}

data class FormaData(val a: Int, val b: Int)