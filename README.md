# palindrome-kotlin-translation
This is a translation of Python code to Kotlin for Olin College's 
Data Structures and Algorithms course. The Python code can be found in 
`palindrome.py`, and the Kotlin code (functions, unit tests, and main 
file) can be found in `/src/main/kotlin/`.

I wrote the original Python code for Olin's Software Design course last 
semester, and the goal was to take one palindromic number and find the 
next largest one using a few functions. A palindromic number is a number 
whose digits are the same forwards and backwards.  

The first function is `digitList`, which converts an integer into a
list of its digits in order. This was accomplished in a single line in 
both Python and Kotlin, using a list comprehension in Python and the 
map function in Kotlin. The syntax in Python feels a little more
readable to me, but both were very simple. No complaints here.  

The second function is the most complicated, `nextPalindromeDigits`. 
It takes a list of a palindromic number's digits, and uses them to find 
the digits of the next palindromic number. The implementation was very 
similar in both languages, although it was annoying to convert between
Lists and MutableLists in Kotlin. I don't fully understand why both types 
are necessary, or why immutable lists are the default. The biggest 
difference was at the end, where what took me one line (the return line) in 
Python wound up taking me 6 lines in Kotlin. Python allows much simpler 
syntax for list formation, so I could just return 
`[1] + (len(digits) - 1) * [0] + [1]` in Python when the number had 9s for all 
of its digits (i.e. 999 becomes 1001). Kotlin didn't allow  this syntax, so I 
used a for loop to do the same thing. This required a very specific piece of 
functionality that isn't needed often, but Python made that a bit easier than 
Kotlin, so Python wins this one.  

The third function is `assemble`, which takes a list of digits and combines 
them into one integer. The implementation was simple in Python, using a for 
loop to assemble the integer. It was actually simpler in Kotlin, needing just 
one line with the reduce function. I was familiar with the equivalent 
JavaScript function, so this was easier to implement in Kotlin. Or maybe it's 
just stolen valor from JavaScript?  

The fourth and final function is `nextPalindrome`, which uses the other three 
functions to take in a palindromic integer and return the next largest 
palindromic integer. The implementation is just calling the three previous 
functions, so it didn't change at all between Python and Kotlin. I added a 
line to throw an exception when the passed-in integer is not a palindrome for 
practice throwing exceptions in Kotlin, which was pretty simple. This was the 
easiest function to implement. 

The unit tests were simple to implement, similar to how we were taught to do 
them in Python in Software Design. It was convenient to share functions between 
packages without an import statement in Kotlin, although I worry about encapsulation 
between files. I also worry that multidimensional lists could be hard to work with 
in Kotlin, as `List<List<Int>>` felt a little clunky to write.  

All in all, translating wasn't as daunting of a task as I thought it would be. 
Kotlin is fairly intuitive, and my knowledge of TypeScript and Java made it 
fairly easy to learn. The hardest part was working with IntelliJ IDEA and realizing 
that I needed a whole Kotlin project, not just a script in order to share functions 
between files. I still don't see the advantage to using Kotlin instead of 
TypeScript, Java, or Python, but it wasn't as difficult to work with as I expected.