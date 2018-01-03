package halil.raso.com.tutorials.dataclasses

fun main(args : Array<String>) { //entry point of any kotlin program.
    val usr1 = User(name = "Halil", age = 32) // we create an object of a data class User
    println(usr1.toString()) // This is equivalent to println(user1).
    val usr2 = usr1.copy(name= "Khalil", age = 31)
    println(usr2) // Will print: User(name=Halil, age=31)
    val usr3 = usr1; // Equivalent to copy mehtod.
    usr3.age= 33;
    println(usr3) // Will print: User(name=Halil, age=33)
    println(usr3.component1())// Getting the first parameter of object.
}

data class User(val name: String, var age: Int)