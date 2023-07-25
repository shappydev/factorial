fun main() {
    // Take user input
    print("Enter a non-negative integer: ")
    val number = readLine()?.toIntOrNull()

    if (number != null && number >= 0) {
        var factorial = 1L
        for (i in 1..number) {
            factorial *= i
        }
        println("The factorial of $number is $factorial")
    } else {
        println("Factorial is not defined for negative numbers or invalid input.")
    }
}