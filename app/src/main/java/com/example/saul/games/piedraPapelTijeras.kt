package com.example.saul.games

fun main(){
    println("por favor ingresa un numero del 1 al tres donde " +
            "(1. piedra, 2. Tijera y 3.papel")

    var choiceInput = readlnOrNull()?.toIntOrNull()
    var isValidInput = choiceInput != null && choiceInput in 1..3
//    if(choiceInput != null && choiceInput in 1..3){
//        isValidInput = true
//    }
    while(!isValidInput){
        println("Entrada no valida por favor ingresa un numero del 1 al 3")
            choiceInput = readlnOrNull()?.toIntOrNull()
            isValidInput = choiceInput != null && choiceInput in 1..3
    }
    print("el videojuego se ejecuto")
    val computerChoice = (1..3).random()
    val computerChoiceString = when{
        computerChoice == 1 -> "piedra"
        computerChoice == 2 -> "tijeras"
        computerChoice == 3 -> "papel"
        else -> "sin seleccion"

    }
    println("la computadora eligió $computerChoiceString")

    val winner = when{
        choiceInput == computerChoice -> "Empate"
        choiceInput == 1 && computerChoice ==2 -> "El jugador"
        choiceInput == 2 && computerChoice == 3 -> "El jugador"
        choiceInput == 3 && computerChoice == 1 -> "El jugador"
        else -> "Computadora"



    }
    println("el ganador es $winner")
}