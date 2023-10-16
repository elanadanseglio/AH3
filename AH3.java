

/*
Fizzbuzz #1:

Write a Java program that prints numbers from 1 to n. 
For multiples of 3, print "Fizz" instead of the number. 
For multiples of 5, print "Buzz" instead of the number. 
For numbers which are multiples of both 3 and 5, print "FizzBuzz".

Instructions
Write a function fizzBuzz that takes an integer n as a parameter 
and prints the numbers from 1 to n based on the conditions below:

If the number is a multiple of 3, print "Fizz" instead of the 
number.

If the number is a multiple of 5, print "Buzz" instead of the 
number.

If the number is a multiple of both 3 and 5, print "FizzBuzz"
instead of the number.

Implement the function in a way that it follows the given 
specifications.

Example Input: n = 15

Output: 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz

 */
public class AH3 {
    public static void main(String[] args){
        int n = 15;
        fizzBuzz(n);
    }
    public static void fizzBuzz(int n){

        for (int i = 1; i <= n; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0){
                System.out.print("Fizz ");
            } else if (i % 5 == 0){
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }

    }
}
