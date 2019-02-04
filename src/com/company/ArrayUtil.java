package com.company;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUtil
{
    public static void printArray(int [] values)
    {
        for (int value: values)
        {
            System.out.println(value);
        }
    }
    public static void printArray(String [] values)
    {
        for (String value: values)
        {
            System.out.println(value);
        }
    }

    public static int arrayTotal (int[] values)
    {
       int total = 0;
       for (int value: values)
       {
           total = total + value;
       }
       return total;
    }


    public static int arrayMax(int[] values)
    {
        int maxFoundSoFar = values[0];

        for (int i = 1; i < values.length; i++)
        {
            if (values[i] > maxFoundSoFar)
            {
                maxFoundSoFar = values[i];
            }
        }

        return maxFoundSoFar;
    }

    public static int arrayMaxIndex(int[] values)
    {
        int indexOfMaxValue = 0;

        for (int i = 1; i < values.length; i++)
        {
            if (values[i] > values[indexOfMaxValue])
            {
                indexOfMaxValue = i;
            }
        }

        return indexOfMaxValue;

    }

    public static double arrayAverage(double[] values)
    {
        double total = 0.0;
        for (double value:values)
        {
            total = total + value;
        }
        double average = total / values.length;

        return average;
    }


}
