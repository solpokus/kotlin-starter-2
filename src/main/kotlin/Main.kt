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
    
    // ------------
    // Start Kotlin Fundamental
    
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
//    print(firstWord + lastWord)

    val valueA: Int = 10
    val valueB = 20
//    print(valueA + valueB)
    
    
    // char
    var character = 'A'

//    val characters: Char = 'ABC'   // Incorrect character literal (only 1 character)
    
    // char can be increment & decrement , bcs char is represented from unicode
//    println("Vocal 1 " + character++)
//    println("Vocal 2 " + character++)
//    println("Vocal 3 " + character)
    
    // Indexing with string
    val text = "Organic"
    val firstChar = text[3]
    
//    println("The 4ft $text is $firstChar")
    
    // loop
    for (char in text){
//        print("$char ")
    }

    val line = "Line 1\n" +
            "Line 2\n" +
            "Line 3\n" +
            "Line 4\n"
    
    val lines = """
        Line 1
        Line 2
        Line 3 =
    Line 4
    """.trimIndent()
//    print(lines)


    // String template
    val names = "Kotlin"
//    print("My name is " + names)
    // same as
//    print("My name is $name")
    
    val old = 3
//    print("My name is $name, im $old years old")

    val hour = 7
    print("Office ${if (hour > 7) "already close" else "is open"}")
    
    
    // ------------
    // End Kotlin Fundamental
    
}
