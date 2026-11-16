package lab1;

public class Main {
    public static void main(String[] args){
        Course introToProgrammingCourse = new IntroToProgrammingCourse("Intro to Programming", "101");
        Course introToJavaCourse = new IntroJavaCourse("Intro to Java", "102");
        Course advancedJavaCourse = new AdvancedJavaCourse("Advanced Java", "201");
        introToProgrammingCourse.setCredits(3.0);
        introToJavaCourse.setCredits(3.0);
        advancedJavaCourse.setCredits(3.0);
        introToProgrammingCourse.setPrerequisites("None");
        introToJavaCourse.setPrerequisites("Intro to Programming");
        advancedJavaCourse.setPrerequisites("Intro to Java");
        System.out.println("Course Name: " + introToProgrammingCourse.getCourseName());
        System.out.println("Course Number: " + introToProgrammingCourse.getCourseNumber());
        System.out.println("Prerequisites: " + introToProgrammingCourse.getPrerequisites());
        System.out.println("Course Name: " + introToJavaCourse.getCourseName());
        System.out.println("Course Number: " + introToJavaCourse.getCourseNumber());
        System.out.println("Credits: " + introToJavaCourse.getCredits());
        System.out.println("Prerequisites: " + introToJavaCourse.getPrerequisites());
        System.out.println("Course Name: " + advancedJavaCourse.getCourseName());
        System.out.println("Course Number: " + advancedJavaCourse.getCourseNumber());
        System.out.println("Credits: " + advancedJavaCourse.getCredits());
        System.out.println("Prerequisites: " + advancedJavaCourse.getPrerequisites());
    }
}
