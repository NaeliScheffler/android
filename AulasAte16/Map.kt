package AulasAte16

fun main() {

    val map1 = mapOf<String, String>(Pair("França", "Paris"), Pair("Brasil", "Brasília"))
    val map2 = mutableMapOf<String, String>(Pair("França", "Paris"), Pair("Brasil", "Brasília"))

    println(map1.entries)
    println(map1.values)

    map2["Alemanha"] = "Berlin"
    println(map2)

    map2.remove("Alemanha")
    map2.contains("Alemanha")
    map2.clear()

}