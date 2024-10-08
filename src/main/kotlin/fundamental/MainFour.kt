package com.learn.kotlin.fundamental

fun main(args: Array<String>) {
    val openHours = 7
    val now = 20
    val office: String
//    if (now > openHours){
//        office = "Office already open"
//    } else {
//        office = "Office is closed"
//    }
    
    // If expression return value
//    office = if (now > openHours){
//        "Office already open"
//    } else {
//        "Office is closed"
//    }
    
    office = if (now > 7){
        "Office already open"
    } else if (now == openHours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }
    
    
    
    println(office)
}