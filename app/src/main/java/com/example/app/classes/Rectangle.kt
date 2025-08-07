package com.example.app.classes

// exemplo com o construtor secundario
class Rectangle(val width: Double, val height: Double) {
    val area: Double = width * height

    init {
        println("Retângulo criado com L: $width, A: $height")
    }

    // construtor secundario pra criar quadrado
    // ele delega para o construtor primário usando 'this()'
    constructor(size: Double) : this(size, size) {
        // corpo do construtor secundário é executado depois do bloco init
        println("--> Este é um quadrado de área $area")
    }
}