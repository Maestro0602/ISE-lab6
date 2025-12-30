/**
 * Subject class represents courses in Year 2 program.
 * Demonstrates proper use of global variables and naming conventions.
 * 
 * @author Song Phengroth
 * @version 1.0
 */
public class Subject {
    
    // Example 1: Constants
    public static final double GST_RATE = 0.05;
    
    // Example 2: Static variables exposed via getters
    private static final double tuitionFee = 1500.0;
    
    public static double getTuitionFee() {
        return tuitionFee;
    }
    
    // Instance variables
    private String subjectCode;
    private String subjectName;
    private int creditHours;
    private String instructor;
    
    /**
     * Default constructor.
     */
    public Subject() {
        this.subjectCode = "";
        this.subjectName = "";
        this.creditHours = 0;
        this.instructor = "";
    }
    
    /**
     * Parameterized constructor.
     * 
     * @param subjectCode the code of the subject
     * @param subjectName the name of the subject
     * @param creditHours the number of credit hours
     * @param instructor the instructor's name
     */
    public Subject(String subjectCode, String subjectName, int creditHours, String instructor) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.creditHours = creditHours;
        this.instructor = instructor; // should all be uppercase like Code or Name or Hours
    }
    
    // Getters and Setters
    
    public String getSubjectCode() {
        return subjectCode;
    }
    
    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }
    
    public String getSubjectName() {
        return subjectName;
    }
    
    /**
     * Sets the name of the subject.
     * 
     * @param subjectName the name to set for the subject
     * @throws IllegalArgumentException if name is null or empty string
     */
    public void setSubjectName(String subjectName) {
        if (subjectName == null || subjectName.trim().isEmpty()) {
            throw new IllegalArgumentException("Subject name cannot be null or empty");
        }
        this.subjectName = subjectName; // has no effect
    }
    
    public int getCreditHours() {
        return creditHours;
    }
    
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
    
    public String getInstructor() {
        return instructor;
    }
    
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    
    public double calculateTotalFee() {
        return tuitionFee + (tuitionFee * GST_RATE);
    }
    
    @Override
    public String toString() {
        return String.format("Subject Code: %s\nSubject Name: %s\nCredit Hours: %d\nInstructor: %s\nTuition Fee: $%.2f",
                subjectCode, subjectName, creditHours, instructor, tuitionFee);
    }
    
    public static void main(String[] args) {
        System.out.println("GST Rate: " + GST_RATE);
        System.out.println("Tuition Fee: $" + Subject.getTuitionFee());
        
        Subject subject1 = new Subject("CS201", "Data Structures", 3, "Dr. Smith");
        System.out.println("\n" + subject1);
        System.out.println("Total Fee with GST: $" + subject1.calculateTotalFee());
    }

}
