import java.util.Scanner;

import java.util.*;

public class Num2WordsRecur {

static String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

static String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

public static void main(String args[]) {

int number = 0;

Scanner SCinput = new Scanner(System.in);

System.out.println("Please type an integer number(max upto 9 digits): ");

try {

number = SCinput.nextInt();

System.out.print("Number in words: "+numToWord(number));

} catch (Exception e) {

System.out.println("Please enter a valid number");

}

SCinput.close();
}

private static String numToWord(int number)

{

String words = ""; //variable to hold string representation of number

if (number == 0) // base case for recursion

return "zero";

// if number is less than zero

if (number < 0)

return "minus " + numToWord(Math.abs(number));

if ((number / 10000000) > 0)

{

words += numToWord(number / 10000000) + " crores ";

number %= 10000000;

}

if ((number / 100000) > 0)

{

words += numToWord(number / 100000) + " lacs ";

number %= 100000;

}

if ((number / 1000) > 0)

{

words += numToWord(number / 1000) + " thousand ";

number %= 1000;

}

if ((number / 100) > 0)

{

words += numToWord(number / 100) + " hundred ";

number %= 100;

}

if (number > 0)

{

if (number < 20)

words += unitsArray[number];

else

{

words += tensArray[number / 10];

if ((number % 10) > 0)

words += " " + unitsArray[number % 10];

}

}

return words;

}

}
