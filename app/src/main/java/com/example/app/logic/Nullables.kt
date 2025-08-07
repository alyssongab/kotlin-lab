package com.example.app.logic

fun main() {
/*    var favoriteActor: String = "Alysson";
    favoriteActor = null;
    Null cannot be a value of a non-null type 'String'*/

    // para declarar variaveis nullables, usa-se "?" depois do tipo:
    var meuNome: String? = "Alysson";
    println(meuNome?.length);

    meuNome = null;
    println(meuNome);

    // non-null assertion operator (!!)
    // println(meuNome!!.length);
    // garante que a variavel NAO vai ser nula, independente de ela realmente ser ou nao.
}