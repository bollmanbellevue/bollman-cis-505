public class Student {
    /*
    - Include private variables for the fields
    - Add getter/setter methods for the class properties
    - Two constructors: 
        o A default constructor
        o A parameterized constructor with the class’s properties
    - Override the toString() method with the properties
     */

    private String firstName;
    private String lastName;
    private String course;
    private String grade;

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student() {
        setFirstName("");
        setLastName("");
        setCourse("");
        setGrade("");
    }

    public Student(String firstName, String lastName, String course, String grade) {
        setFirstName(firstName);
        setLastName(lastName);
        setCourse(course);
        setGrade(grade);
    }

    public String toString() {
        return String.format("Name: %s, %s\nCourse: %s\nLetter Grade: %s", lastName, firstName,
                course, grade);
    }
}
