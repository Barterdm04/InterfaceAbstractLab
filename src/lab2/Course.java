/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 *
 * @author DB7
 */
public interface Course {
    
    
    public abstract String getCourseName();
    
    public void setCourseName(String courseName);
    
    public abstract String getCourseNumber();
    
    public void setCourseNumber(String courseNumber);
    
    public abstract double getCredits();
    
    public void setCredits(double credits);
    
    @Override
    public abstract String toString();
    
}
