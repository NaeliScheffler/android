package att6

fun main() {
    var i = 0
    for (i in 1.. 50) {
       if (i % 3 == 0 && i % 5 != 0) {
           println("Buzz ")
       } else if (i % 5 == 0 && i % 3 != 0) {
           println("Fizz ")
       }else if (i % 5 == 0 && i % 3 == 0){
           println("FizzBuzz ")
       } else{
           print("$i ")
       }

    }
}