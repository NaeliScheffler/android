package AulasAte16

fun main() {
    val set1: Set<String> = setOf<String>("Paris", "Berlin", "Madrid", "Madrid")
    val set2: MutableSet<String> = mutableSetOf<String>()

    set2.add("São Paulo")
    set2.contains("São Paulo")
    set2.remove("São Paulo")

    set2.clear()
    set2.size
}