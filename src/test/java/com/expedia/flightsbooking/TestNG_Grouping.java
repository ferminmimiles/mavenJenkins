package com.expedia.flightsbooking;

import org.testng.annotations.*;

public class TestNG_Grouping {
    @BeforeClass
    public void beforeClass(){
        System.out.println("\nThis method runs before any class");
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(){
        System.out.println("\nThis method runs before every method");
    }

    @Test(groups = {"Sedan","BMW"})
    public void BMW3Series(){
        System.out.println("BMW 3 SERIES Test");
    }

    @Test(groups = {"Sedan","BMW"})
    public void BMWX3(){
        System.out.println("BMW X3 Test");
    }

    @Test(groups = {"Sedan","Audi"})
    public void AudiA6(){
        System.out.println("Audi A6 Test");
    }

    @Test(groups = {"Sedan","Honda"})
    public void HondaAccord(){
        System.out.println("Honda Accord Test");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("\nThis method runs after every method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This method runs after any class");
    }
}
