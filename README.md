# Overview

This project is a **Guessing Game** written in Kotlin.  
The goal is to create an interactive console application where the program randomly generates a secret number between 1 and 100, and the player has to guess the number. After each guess, the game will tell the player if the secret number is higher or lower, until the player guesses correctly. At the end, the game displays how many attempts were made and shows a list of all guesses.

The purpose of writing this software was to practice and demonstrate several Kotlin language features, including:
- Variables (`val` and `var`)
- Expressions
- Conditionals (`if` and `when`)
- Loops (`while`)
- Functions
- Classes
- Collections (`MutableList` to store guesses)

Through this project, I learned how to structure a simple Kotlin application, separate logic into multiple files, and use collections and control flow effectively.

[Software Demo Video](http://youtube.link.goes.here)

# Development Environment

- **IDE / Editor:** Visual Studio Code with Kotlin Language extension  
- **Compiler:** Kotlin Compiler (`kotlinc`)  
- **Runtime:** Java Virtual Machine (JVM)  
- **Language:** Kotlin (JVM version)  
- **Libraries:** Standard Kotlin library (no external dependencies)

### Running the Program
You can compile and run the program from the terminal in two steps:

```bash
kotlinc *.kt -d out
kotlin -classpath out com.lucasmendonca.guessgame.MainKt
```

### Future Work
- Add support for multiple players in the same session and display a ranking.
- Implement input validation to prevent invalid or negative numbers.
- Add difficulty levels (easy, medium, hard) with different number ranges.
- Write unit tests to verify the game logic automatically.