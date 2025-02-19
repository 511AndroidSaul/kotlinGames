package com.example.saul.games

fun main(){
    println("Ingresa el número para saber si es primo o no")

    var numero = readlnOrNull()?.toIntOrNull()
    var primo = false
    var j = 0
    var isValidInput = numero != null

    while(!isValidInput){
        println("Entrada no valida, ingrese un número válido")
        numero = readlnOrNull()?.toIntOrNull()
        isValidInput = numero != null
    }


    for (i in 1..numero!!){
        if (numero % i == 0){
            j = j+1
        }else{
            j = j
        }

    }
    primo = j == 2

//    if(j == 2){
//        primo = true
//
//    }
//    else{
//        primo = false
//    }
    if(primo){
        println("el numero es primo")
    }else{
        println("el numero no es primo")
    }
}