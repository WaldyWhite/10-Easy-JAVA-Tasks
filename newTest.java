import java.util.Scanner;

class newTest {
    public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);

/*-------------------------------------------------------------
| Program to find maximum of two numbers (if-else)             |
 -------------------------------------------------------------*/

/*     int maxNumber;
    int firstNumber = sc.nextInt();
    int secondNumber = sc.nextInt();

    if(firstNumber > secondNumber) {
         maxNumber = firstNumber;
    } else {
        maxNumber = secondNumber;
    };

    System.out.println("Maximum value: " + maxNumber);
    sc.close();
//--------------------------------------------------------------

/*------------------------------------------------------------
| Program to check profit or loss (if-elseif-else)            |
 ------------------------------------------------------------*/

/*     int inOne = sc.nextInt();
    int inTwo = sc.nextInt();

    if(inOne > inTwo) {
        System.out.println("Profit: " + (inOne - inTwo));
    } else if (inOne < inTwo) {
        System.out.println("loss: " + (inOne - inTwo));
    } else {
        System.out.println("There is no profit or loss");
    } 
    sc.close(); */
//-------------------------------------------------------------

/*----------------------------------------------------------------------------------------------------------------------------------------------------------------------
| Program to display the name of the day of the week by number, using 'switch'. Will throw an error if the entered number is less than 1 or greater than 7.             |
 ----------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
/*     int i = sc.nextInt();
    switch(i) {
        case 1:
            System.out.println ("Monday");
            break;
        case 2:
            System.out.println ("Tuesday");
            break;
        case 3:
            System.out.println ("Wednesday");
            break;
        case 4:
            System.out.println ("Thursday");
            break;
        case 5:
            System.out.println ("Friday");
            break;
        case 6:
            System.out.println ("Saturday");
            break;
        case 7:
            System.out.println ("Sunday");
            break;
        default:
            System.out.println ("Error! You cannot enter a number less than 1 and greater than 8");
        };
            
        sc.close(); */
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*------------------------------------------------------------
| Program to find maximum of two numbers (switch)             |
 ------------------------------------------------------------*/
/*     int maxim;
    int inOne = sc.nextInt();
    int inTwo = sc.nextInt();
    boolean x = (inOne > inTwo);
    switch(x){
        case true:
            maxim = inOne;
            break;
        case false:
            maxim = inTwo;
            break;
    }
    System.out.println(maxim);
    sc.close(); */
//------------------------------------------------------------

/*---------------------------------------------------------------------------------
| Program that prints all integers from 1 to  << n >> using (for). N:1             |
 ---------------------------------------------------------------------------------*/

/* int n = sc.nextInt();
 for(int i = 1; i <= n; i++) {
    if(i == n) {
        System.out.println(i);
    } else { System.out.println(i);
        }
 }  */

//---------------------------------------------------------------------------------

/*---------------------------------------------------------------------------------
|  Program that prints all even integers from 1 to  << n >> using (for). N:2       |
 ---------------------------------------------------------------------------------*/

/*  int n = sc.nextInt();
 for(int i = 1; i <= n; i++) {
    if(i % 2 == 0) {
        System.out.println(i);
    }
 } */

//---------------------------------------------------------------------------------
    }
}