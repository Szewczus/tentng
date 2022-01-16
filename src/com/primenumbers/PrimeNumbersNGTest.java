package com.primenumbers;

import static org.testng.Assert.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PrimeNumbersNGTest {
    public PrimeNumbersNGTest() {
    }

    @Test(dataProvider = "parametryTestFloorRootValue")
    public void testFloorRootValue(double expectedResult,int a){
        System.out.println("testFloorRootValue...");
        CommonOperations commonOperations = new CommonOperations();
        double result = commonOperations.floorRootValue(a);
        assertEquals(expectedResult, result);
    }
    @DataProvider(name = "parametryTestFloorRootValue")
    public static Object [][] parametryTestFloorRootValue(){
        return new Object[][] {{2, 4}};
    }

    @Test(dataProvider = "parametry")
    public void testCreateTable( int a, int b) {
        System.out.println("testCreateTable...");
        int x = 1;
        PrimeNumbers instance = new PrimeNumbers();
        int[][] expResult = new int[1][2];
        expResult[0][0]=a;
        expResult[0][1]=b;
        int[][] result = instance.createTable(x);
        assertEquals(result, expResult);
    }

    @DataProvider(name = "parametry")
    public static Object [][] number(){
        return new Object[][] {{2, 1}};
    }

    @Test(dataProvider = "parametry")
    public void testMarkNonPrimeFromTable(int a, int b) {
        System.out.println("testMarkNonPrimeFromTable...");
        int[][] numbersTable = {{2, 1}};
        int range = 3;
        PrimeNumbers instance = new PrimeNumbers();
        int[][] expResult = new int[1][2];
        expResult[0][0]=a;
        expResult[0][1]=b;
        int[][] result = instance.markNonPrimeFromTable(numbersTable, range);
        assertEquals(result, expResult);
    }
    @Test(dataProvider = "parametry")
    public void testShowPrimeNumbers(int a, int b) {
        System.out.println("showPrimeNumbers...");
        int[][] numbersTable = new int[1][2];
        numbersTable[0][0]=a;
        numbersTable[0][1]=b;
        PrimeNumbers instance = new PrimeNumbers();
        assertEquals(instance.showPrimeNumbers(numbersTable), "|2");
    }

    @Test(dataProvider = "parametryIsDivisible")
    public void isDivisible(int a,int b, boolean expectedResult){
        System.out.println("testFloorRootValue...");
        CommonOperations commonOperations = new CommonOperations();
        boolean result = commonOperations.isDivisible(b, a);
        assertEquals(expectedResult, result);
    }

    @DataProvider(name = "parametryIsDivisible")
    public static Object [][] parametryIsDivisible(){
        return new Object[][] {{2, 4, true}};
    }


}
