public class Student implements Comparable<Student> {
    private String name;
    private int course;
    private Double average;

    public Student(String studentName, int studentCourse, double studentAverage) {
        this.name = studentName;
        this.course = studentCourse;
        this.average = studentAverage;

    }

    @Override
    public String toString() {
        return this.name + ' ' + course + "курс " + average;
    }

    @Override
    public int compareTo(Student o) {
        if(name.equals(o.name))
            return average.compareTo(o.average);
        else
            return name.compareTo(o.name);
    }
}
