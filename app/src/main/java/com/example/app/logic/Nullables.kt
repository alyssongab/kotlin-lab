package com.example.app.logic

fun main() {
/*    var favoriteActor: String = "Alysson";
    favoriteActor = null;
    Null cannot be a value of a non-null type 'String'*/

    // para declarar variaveis nullables, usa-se "?" (safe call operator) depois do tipo:
    var meuNome: String? = "Alysson";
    println(meuNome?.length);

    meuNome = null;
    println(meuNome);

    // non-null assertion operator (!!)
    // println(meuNome!!.length);
    // garante que a variavel NAO vai ser nula, independente de ela realmente ser ou nao.

    // elvis operator (?:)
    // permite adicionar um valor default para quando safe-call operator (?.) retornar null
    var name: String = "Messi";
    val lengthOfName = name?.length ?: 0;
    println("Numero de caracteres do nome: $lengthOfName");
}