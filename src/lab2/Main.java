package lab2;

import lab1.Course;

public class Main {
    public static void main(String[] args){
        Courseable introToProg = new IntroToProgrammingCourse("Intro to Programming", "101");
        Courseable advancedJavaCourse = new AdvancedJavaCourse("Intro to Java", "102");
        advancedJavaCourse.setPrerequisites("Intro to Programming");
        Courseable introJavaCourse = new IntroJavaCourse("Advanced Java", "201");
        introJavaCourse.setPrerequisites("Intro to Programming");

        introToProg.setPrerequisites("None");
        java.util.List<Courseable> courses = new java.util.ArrayList<>();
        courses.add(introToProg);
        courses.add(advancedJavaCourse);
        courses.add(introJavaCourse);
        for (Courseable course : courses) {
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Course Number: " + course.getCourseNumber());
            System.out.println("Credits: " + course.getCredits());
            System.out.println("Prerequisites: " + course.getPrerequisites());
        }
    }
}
