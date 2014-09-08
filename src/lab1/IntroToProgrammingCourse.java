package lab1;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends Course {
    @Override
    public String toString(){
        return "Introduction to Programming Course: " + this.getCourseName() + "\n Course num: " + this.getCourseNumber() + "\n Credits: " 
                + this.getCredits();
    }
}
