package org.palindrome

/**
 * Run unit tests on the digitList function in the file Palindrome.kt,
 * which is meant to take a positive integer and return a list of its
 * digits in order of descending significance.
 *
 * @throws RuntimeException if a test fails
 */
fun testDigitList() {
    val inputs: List<Int> = listOf(
        4,          // testing a single-digit number
        0,          // testing a 0
        9999,       // testing a longer number
        876545678   // testing a much longer number
    )

    val expectedOutputs: List<List<Int>> = listOf(
        listOf(4),                  // input: 4
        listOf(0),                  // input: 0
        listOf(9,9,9,9),            // input: 9999
        listOf(8,7,6,5,4,5,6,7,8)   // input: 876545678
    )

    for (i in inputs.indices) {
        if (digitList(inputs[i]) != expectedOutputs[i]) {
            throw RuntimeException("Failed test for input ${inputs[i]} in digitList")
        }
    }

    println("All tests passed for digitList")
}


/**
 * Run unit tests on the nextPalindromeDigits function in the file
 * Palindrome.kt, which is meant to take a list of the digits of a
 * palindromic integer and return the list of digits of the next
 * largest palindrome.
 *
 * @throws RuntimeException if a test fails
 */
fun testNextPalindromeDigits() {
    val inputs: List<List<Int>> = listOf(
        listOf(4),                  // testing a single-digit number
        listOf(0),                  // testing zero
        listOf(9,9,9,9),            // testing a number with nines
        listOf(2,9,9,2),            // testing a number with nines in the middle
        listOf(8,7,6,5,4,5,6,7,8)   // testing a number with a ton of digits
    )

    val expectedOutputs: List<List<Int>> = listOf(
        listOf(5),                  // input: [4]
        listOf(1),                  // input: [0]
        listOf(1,0,0,0,1),          // input: [9,9,9,9]
        listOf(3,0,0,3),            // input: [2,9,9,2]
        listOf(8,7,6,5,5,5,6,7,8)   // input: [8,7,6,5,4,5,6,7,8]
    )

    for (i in inputs.indices) {
        if (nextPalindromeDigits(inputs[i]) != expectedOutputs[i]) {
            throw RuntimeException("Failed test for input ${inputs[i]} in nextPalindromeDigits")
        }
    }

    println("All tests passed for nextPalindromeDigits")
}


/**
 * Run unit tests on the assemble function in the file Palindrome.kt,
 * which is meant to take a list of single-digit integers and return
 * an integer composed of those digits in order.
 *
 * @throws RuntimeException if a test fails
 */
fun testAssemble() {
    val inputs: List<List<Int>> = listOf(
        listOf(4),                  // testing a single-digit number
        listOf(0),                  // testing a 0
        listOf(9,9,9,9),            // testing a longer number
        listOf(8,7,6,5,4,5,6,7,8)   // testing a much longer number
    )

    val expectedOutputs: List<Int> = listOf(
        4,          // input: [4]
        0,          // input: [0]
        9999,       // input: [9,9,9,9]
        876545678   // input: [8,7,6,5,4,5,6,7,8]
    )

    for (i in inputs.indices) {
        if (assemble(inputs[i]) != expectedOutputs[i]) {
            throw RuntimeException("Failed test for input ${inputs[i]} in assemble")
        }
    }

    println("All tests passed for assemble")
}


/**
 * Run unit tests on the nextPalindrome function in the file Palindrome.kt,
 * which takes a palindromic integer and returns the next largest
 * palindromic integer.
 *
 * @throws RuntimeException if a test fails
 */
fun testNextPalindrome() {
    val inputs: List<Int> = listOf(
        4,          // testing a single-digit number
        0,          // testing a 0
        9999,       // testing a number with nines
        2992,       // testing a number with nines in the middle
        876545678   // testing a number with a ton of digits
    )

    val expectedOutputs: List<Int> = listOf(
        5,          // input: 4
        1,          // input: 0
        10001,      // input: 9999
        3003,       // input: 2992
        876555678   // input: 876545678
    )

    for (i in inputs.indices) {
        if (nextPalindrome(inputs[i]) != expectedOutputs[i]) {
            throw RuntimeException("Failed test for input ${inputs[i]} in nextPalindrome")
        }
    }

    println("All tests passed for nextPalindrome")
}