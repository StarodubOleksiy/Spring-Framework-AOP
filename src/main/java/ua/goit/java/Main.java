package ua.goit.java;

import CalculatorLibrary.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.ObjectFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.*;



public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public void showResult(String calculateString,String result)
    {
        System.out.println(calculateString+" = "+result);
    }

    public void execute() throws Exception{
        LOGGER.info("Loading Main.execute()");
        Calculator calculator = new ImplementationAddSubstract();
        LOGGER.info("Runnung new ImplementationAddSubstract().calculate(1458+9632)");
        LOGGER.info("Result 1458+9632 = "+calculator.calculate("1458+9632"));
        calculator = null;
        calculator = new ImplementationMultiplicationDivision();
        LOGGER.info("Runnung new ImplementationMultiplicationDivision().calculate(458*632)");
        LOGGER.info("Result 458*632 = " + calculator.calculate("458*632"));
        calculator = null;
        calculator = new ImplementationSqrt();
        LOGGER.info("Runnung new ImplementationSqrt().calculate(6561)");
        LOGGER.info("Result sqrt(6561) = " + calculator.calculate("sqrt 6561"));


    }


    public static void main(String[] args)throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml","aop-context.xml");
       Main main = applicationContext.getBean("main",Main.class);
      main.execute();

    }

}
