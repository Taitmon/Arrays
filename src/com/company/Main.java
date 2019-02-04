package com.company;
import static com.company.ArrayUtil.*;
public class Main
{

    public static void main(String[] args)
    {
        int[] values1 = new int [3];
        values1[0] = 1;
        values1[1] = 5;
        values1[2] = 9;

        int[] values2 = new int [5];
        values2[0] = 5;
        values2[1] = 2;
        values2[2] = 9;
        values2[3] = 8;
        values2[4] = 0;

        int [] values3 = new int [5];
        values3[0] = 5;
        values3[1] = 8;
        values3[2] = 21;
        values3[3] = 19;
        values3[4] = 2;

        int[] values4 = new int [3];
        values4[0] = -1;
        values4[1] = -5;
        values4[2] = -3;

        int[] values5 = new int [4];
        values5[0] = 78;
        values5[1] = 23;
        values5[2] = 9;
        values5[3] = 34;

        double[] values6 = new double [4];
        values6[0] = 34.2;
        values6[1] = 18.0;
        values6[2] = 12.5;
        values6[3] = 13.1;

        double[] values7 = new double [4];
        values7[0] = 10;
        values7[1] = 15;
        values7[2] = 20;
        values7[3] = 15;

        int[] array10 = new int[10];
        array10[0] = 4;
        array10[3] = 2;
        array10[9] = 4;

        String[] string10 = new String[10];
        string10[0] = "Hi";
        string10[3] = "Hello";
        string10[9] = "Bye";

//Array values printed.
        System.out.println("The numbers in the first array are: ");
        printArray(values1);
        System.out.println("The numbers in the second array are: ");
        printArray(values2);
        System.out.println("The numbers in array10 are: ");
        printArray(array10);
        System.out.println("The values in string10 are: ");
        printArray(string10);

//Total values.
        int total1 = arrayTotal(values1);
        int total2 = arrayTotal(values2);
        System.out.println("The sum of a number in the first array are " + total1);
        System.out.println("The sum of a number in the first array are " + total2);
//Max values.
        int max1 = arrayMax(values1);
        int max2 = arrayMax(values2);
        int max3 = arrayMax(values3);
        int max4 = arrayMax(values4);
        System.out.println("The max number in the first array is " + max1);
        System.out.println("The max number in the second array is " + max2);
        System.out.println("The max number in the third array is " + max3);
        System.out.println("The max number in the forth array is " + max4);
// index of max values.
        int index1 = arrayMaxIndex(values1);
        int index2 = arrayMaxIndex(values3);
        int index3 = arrayMaxIndex(values5);
        System.out.println("The index of the max number in the first array is " + index1);
        System.out.println("The index of the max number in the third array is " + index2);
        System.out.println("The index of the max number in the fifth array is " +index3);
// average of values in array.
        double average1 = arrayAverage(values6);
        double average2 = arrayAverage(values7);
        System.out.println("The average of the 6th array is " + average1);
        System.out.println("The average of the 6th array is " + average2);



    }
}
