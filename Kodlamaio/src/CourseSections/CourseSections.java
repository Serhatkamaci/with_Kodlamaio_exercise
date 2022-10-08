package CourseSections;
import ILogger.ILogger;
public class CourseSections{

    private int courseID;
    private String courseName;
    private int unitPrice;
    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) throws Exception {
        if(unitPrice<0)
        {
            throw new Exception("Kurs fiyati 0'dan kucuk olamaz!");
        }
        else
        {
            this.unitPrice = unitPrice;
        }

    }
}
