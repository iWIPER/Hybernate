package co.develhope.hybernate.entities;

import javax.persistence.*;

@Entity
@Table(name = "enrollments")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn (name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private School schoolClass;

    public Enrollment(){
    }

    public Enrollment(Long id, Student student, School schoolClass){
        this.id = id;
        this.student = student;
        this.schoolClass = schoolClass;
    }

    public School getSchoolClass(){
        return schoolClass;
    }

    public void setSchoolClass(School schoolClass){
        this.schoolClass = schoolClass;
    }

    public Student getStudent(){
        return student;
    }

    public void setStudent(Student student){
        this.student = student;
    }
}