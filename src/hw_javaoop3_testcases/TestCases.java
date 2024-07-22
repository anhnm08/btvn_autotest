package hw_javaoop3_testcases;

import hw_javaoop3_common.BaseTest;

public class TestCases extends BaseTest {

    public void loginCMS(){
        System.out.println("TESTCASE FOR LOGIN");

        createDriver("Chrome");

        System.out.println("Navigate to url");
        System.out.println("Enter email & password");
        System.out.println("Click login button");
        System.out.println("Verify the message");

        closeDriver("Chrome");
    }

    public void addCategoryCMS(){
        System.out.println("TESTCASE FOR ADD CATEGORY");

        createDriver("FireFox");
//Login
            System.out.println("Navigate to url");
            System.out.println("Enter email & password");
            System.out.println("Click login button");
            System.out.println("Verify the message");

//Add cete
            System.out.println("Click on the product menu");
            System.out.println("Click on the Category menu");
            System.out.println("Click on the Add New Category button");
            System.out.println("Input data for all fields in add category form");
            System.out.println("Click on the Save button");
            System.out.println("Verify the new category added");


        closeDriver("FireFox");
    }

    public static void main (String[] args){
        TestCases tc = new TestCases();
        tc.loginCMS();
        System.out.println("_______________");
        tc.addCategoryCMS();

    }

}
