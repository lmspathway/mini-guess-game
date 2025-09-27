package com.lucasmendonca.guessgame

class Player(val name: String) {
    var attempts: Int = 0
    val guesses = mutableListOf<Int>()
}
