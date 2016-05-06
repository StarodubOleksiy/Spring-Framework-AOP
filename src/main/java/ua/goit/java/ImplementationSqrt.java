package ua.goit.java;

/**
 * Created by Администратор on 25.04.16.
 */
import CalculatorLibrary.*;
public class ImplementationSqrt implements Calculator {
   public String calculate(String input) throws Exception
   {
       String values[] = input.split(" ");
     if(!new StringToNumberValidator().isValid(values[1]))
        throw new Exception();
       String result = new String();
       result+= Math.sqrt(Double.parseDouble(values[1]));

     return result;
   }
}
