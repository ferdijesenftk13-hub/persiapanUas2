
package javaapplication_oopjey;

/**
 *
 * @author jey
 */
 public class Course {
 
    private String code;
    private String courseName;
    private int sks;
    private int semester;

    public Course(String code, 
            String courseName, 
            int sks,
            int semester) {
        this.code = code;
        this.courseName = courseName;
        this.sks = sks;
        this.semester = semester;
    }

    public String toString() {
        return this.courseName;
    }

    public String getCode() {
        return code;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getSKS() {
        return sks;
    }
}
    

