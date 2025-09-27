package com.lucasmendonca.guessgame

import kotlin.random.Random

class Game {
    fun start() {
        println("=== Guessing Game ===")
        print("Enter your name: ")
        val name = readLine() ?: "Player"
        val player = Player(name)

        val secretNumber = generateNumber()
        println("Try to guess the secret number (between 1 and 100)!")

        var guessedCorrectly = false

        while (!guessedCorrectly) {
            print("Enter your guess: ")
            val guess = readLine()?.toIntOrNull()

            if (guess == null) {
                println("Please enter a valid number.")
                continue
            }

            player.attempts++
            player.guesses.add(guess)

            when {
                guess < secretNumber -> println("The secret number is HIGHER.")
                guess > secretNumber -> println("The secret number is LOWER.")
                else -> {
                    println("Congratulations, ${player.name}! You guessed it in ${player.attempts} attempts.")
                    guessedCorrectly = true
                }
            }
        }

        println("\n=== Game Summary ===")
        println("Your guesses: ${player.guesses.joinToString(", ")}")
        println("Game over. Thanks for playing!")
    }

    private fun generateNumber(): Int {
        return Random.nextInt(1, 101)
    }
}