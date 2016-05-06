package ua.goit.java;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


public class MainTest {
    @Test
    public void testIsValid() {
     /*   System.out.println("isValid");
        Number number = -4;
        NumberValidator instance = new NumberValidator();
        boolean expResult = false;
        boolean result = instance.isValid(number);
        assertEquals(expResult, result);
        number = 100;
        expResult = true;
        result = instance.isValid(number);


        Main main = new Main();

        assertEquals(expResult, result);*/

    }
    @Test
    public void testIsValidString() {
      /*  System.out.println("isValid");
        String str1 = "1";
        StringToNumberValidator instance = new StringToNumberValidator();
        boolean expResult = true;
        boolean result = instance.isValid(str1);
        assertEquals(expResult, result);
        String str2 = "2fgh";
        expResult = false;
        result = instance.isValid(str2);
        assertEquals(expResult, result);*/
    }
    @Test
    public void testGetValidResults() throws Exception {
      /*  System.out.println("getValidResults");
        List<Number> listOfNumbers2 = new ArrayList();
        listOfNumbers2.add(-45.12);
        listOfNumbers2.add(56.45);
        Task<Number> testTask2 = new TaskImpl(listOfNumbers2);
        Validator validator = new NumberValidator();
        Executor<Number> testExecutor = new  ExecutorImpl<Number>(validator);
        testExecutor.addTask(testTask2);

        Number expResult = 56.45;
        testExecutor.execute();
        Number result = testExecutor.getValidResults().get(0);
        assertEquals(expResult, result);*/
        // TODO review the generated test code and remove the default call to fail.

    }
}