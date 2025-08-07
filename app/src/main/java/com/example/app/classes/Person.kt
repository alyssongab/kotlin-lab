package com.example.app.classes

// construtores em kotlin: construtor primario
class Person(val name: String, val age: Int, val email: String) {
    // caso alguma logica precise ser feita na inicializacao, pode-se usar o bloco init
    init{
        if(age < 0) {
            throw IllegalArgumentException("Idade invalida");
        }
        println("Objeto Person criado para $name com $age anos, email: $email")
    }
}