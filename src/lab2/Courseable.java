package lab2;

public abstract interface Courseable {
    public String getCourseName();
    public  String getCourseNumber();
    public double getCredits();
    public String getPrerequisites();
    public void setPrerequisites(String prerequisites);
}
