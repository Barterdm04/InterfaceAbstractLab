package lab2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DB7
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        AdvancedJavaCourse AdvJava = new AdvancedJavaCourse();
        
        AdvJava.setCourseName("Advanced Java 101");
        AdvJava.setCourseNumber("234325");
        AdvJava.setCredits(4);
        AdvJava.setPrerequisites("Introduction to Java");
        System.out.println(AdvJava.toString());
        
        IntroJavaCourse IntJava = new IntroJavaCourse();
        IntJava.setCourseName("Introduction to Java 3");
        IntJava.setCourseNumber("234555");
        IntJava.setCredits(2);
        IntJava.setPrerequisites("Introduction to Programming");
        System.out.println(IntJava.toString());
        
        Course IntPro = new IntroToProgrammingCourse();
        IntPro.setCourseName("Intro to Programming 34");
        IntPro.setCourseNumber("022");
        IntPro.setCredits(4);
        System.out.println(IntPro.toString());
        
        /**
         * I think this architecture is much more useful to use than abstract methods.  
         * This way all methods must be overridden to suit the needs of each subclass
         * 
         * Using the Liskov substitution principle in this case is advantageous for the courses
         * That do not have prerequisites, it won't work for the ones that do.
         * 
         */
    }
    
}
