
package javaapplication_oopjey;

/**
 *
 * @author jey
 */
 public class KRS {
   
    private Course course;
    private double score;
    private String grade;
    private Lecturer lecture; // Diubah jadi huruf kecil biar rapi dan konsisten
    private int semester;     // Diubah jadi huruf kecil (standard Java)

    public KRS(Course course, double score) {
        this.course = course;
        this.score = score;
        this.grade = setGrade();
    }
    public void setLecture(Lecturer lecture) {
        this.lecture = lecture;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }
    public Lecturer getLecture() {
        return this.lecture;
    }
    public Course getCourse() {
        return course;
    }
    public double getScore() {
        return score;
    }
    public String getGrade() {
        return grade;
    }
    public String setGrade() {
        if (score >= 85)
            return "A";
        else if (score >= 75)
            return "B";
        else if (score >= 60)
            return "C";
        else
            return "D";
    }
}
