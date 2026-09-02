package org.palindrome

/**
 * Creates a list of an integer's digits in order, from most significant
 * to least significant.
 *
 * @param integer integer to be converted to a list of its digits
 * @return list of the integer's digits in order of decreasing significance
 */
fun digitList(integer: Int): List<Int> {
    val intList: MutableList<Int> = mutableListOf()
    for (digit in integer.toString()) {
        intList.add(digit.code - 48)
    }
    return intList.toList()
}


/**
 * Given a list of a positive integer's digits, return a list of digits of the
 * next largest palindromic number.
 *
 * @param digits a list of integer digits in order of decreasing significance
 * @return a list of integer digits for the next largest palindromic integer
 */
fun nextPalindromeDigits(digits: List<Int>): List<Int> {
    val newDigits: MutableList<Int> = digits.toMutableList()
    var highMid: Int = newDigits.count() / 2
    var lowMid: Int = (newDigits.count() - 1) / 2
    while (highMid < newDigits.count() && lowMid >= 0) {
        if (newDigits[highMid] == 9) {
            newDigits[highMid] = 0
            newDigits[lowMid] = 0
            highMid += 1
            lowMid -= 1
        } else {
            newDigits[highMid] += 1
            if (lowMid != highMid) {
                newDigits[lowMid] += 1
            }
            return newDigits.toList()
        }
    }

    val finalDigits: MutableList<Int> = mutableListOf(1)
    for (i in 1 ..< newDigits.count()) {
        finalDigits.add(0)
    }
    finalDigits.add(1)
    return finalDigits.toList()
}


/**
 * Assemble a list of digits into an integer
 *
 * @param digits a list of integer digits in order of decreasing significance
 * @return the integer formed from the list of digits in order
 */
fun assemble(digits: List<Int>): Int {
    var integer: Int = 0
    for (digit in digits) {
        integer = (integer * 10) + digit
    }
    return integer
}


/**
 * Given a positive integer whose digits are a palindrome, find the next
 * number whose digits from a palindrome
 *
 * @param palindromicInt a positive integer whose digits form a palindrome
 * @return the next largest integer whose digits form a palindrome
 */
fun nextPalindrome(palindromicInt: Int): Int {
    val digits: List<Int> = digitList(palindromicInt)
    val nextDigits: List<Int> = nextPalindromeDigits(digits)
    return assemble(nextDigits)
}