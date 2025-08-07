package com.example.app.classes

fun main(){
/*    val smartTv = SmartDevice();
    smartTv.turnOn();
    smartTv.turnOff();*/

    val pessoaOk = Person("Alysson", 22, "agb@email.com");

    try{
        val pessoaError = Person("Gabriel", 10, "agb@email.com");
    }
    catch(e: IllegalStateException){
        println(e.message);
    }

    val rect = Rectangle(10.0, 5.0) //  construtor primário
    println("---")
    val square = Rectangle(7.0) // construtor secundario
}