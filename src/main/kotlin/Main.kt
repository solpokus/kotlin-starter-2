package com.learn.kotlin

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin "
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    /*for (i in 1..6) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }*/
    
    val myname = "adian juan r "
    print("Hello my name is ")
    println(myname)
//    println(if (true) "Always true " else "Always false")
    // test commit
    
    // with type data
    var company: String = "organization" // var can be reassigned
    val companies: String = "organizations" //val cannot be reassigned (final)
    
    // without type data
    var companywithout = "organization"

    // Operator
    val firstWord = "First "
    val lastWord = "Last"
    print(firstWord + lastWord)

    val valueA: Int = 10
    val valueB = 20
    print(valueA + valueB)
}
