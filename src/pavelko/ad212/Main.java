package pavelko.ad212;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int number, leftCount=0,rightCount=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an even number");

        if (scanner.hasNextInt()){ //checking if it's a number

            do //parity check
            {
                number=scanner.nextInt();
                if(number%2!=0||number<1)System.out.println("Error, re-enter an even number");
            }
            while(number%2!=0||number<1);

            int[] array = new int[number]; //array creation
            for(int i=0;i<array.length;i++)
            {
                array[i]=(int)(Math.random()*11)-5;
                System.out.print(array[i]+" ");

                if(i<=array.length/2-1) //calculate the sum of modules of the numbers of halves of the array
                {
                    leftCount+=Math.abs(array[i]);
                }
                else
                {
                    rightCount+=Math.abs(array[i]);
                }

                if(i==array.length-1)
                {
                    System.out.println(" ");
                    if(leftCount>rightCount)
                        System.out.println("The sum of the modules of the first half of the array is greater than and equal to "+leftCount);
                    if(rightCount>leftCount)
                        System.out.println("The sum of modules of the second half of the array is greater than and equal to "+rightCount);
                    if(rightCount==leftCount)
                            System.out.println("The sums of the modules of the first and second half are equal");
                }
            }
        }
        else System.out.println("Entered not a number");
    }
}
