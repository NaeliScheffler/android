package AulasAte16

fun main() {
    val p = Pessoa(2001, "Naeli")
    p.acordar()
    p.dormir()

    with(p) {
        this.acordar()
        this.dormir()
    }
}