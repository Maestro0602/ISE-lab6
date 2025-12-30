/**
 * Subject class represents courses in Year 2 program.
 * Demonstrates proper use of global variables and naming conventions.
 * 
 * @author Song Phengroth
 * @version 1.0
 */
public class Subjects {
    
    // Example 1: Constants
    public static final double GST_RATE = 0.05;
    
    // Example 2: Static variables exposed via getters
    private static final double tuitionFee = 1500.0;
    
    public static double getTuitionFee() {
        return tuitionFee;
    }
    
    // Instance variables
    private String subjectcode;
    private String subjectname;
    private int credithours;
    private String instructor;
    
    /**
     * Default constructor.
     */
    public Subjects() {
        this.subjectcode = "";
        this.subjectname = "";
        this.credithours = 0;
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
    public Subjects(String subjectcode, String subjectname, int credithours, String instructor) {
        this.subjectcode = subjectcode;
        this.subjectname = subjectname;
        this.credithours = credithours;
        this.instructor = instructor;
    }
    
    // Getters and Setters
    
    public String getSubjectCode() {
        return subjectcode;
    }
    
    public void setSubjectCode(String subjectcode) {
        this.subjectcode = subjectcode;
    }
    
    public String getSubjectName() {
        return subjectname;
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
        this.subjectname = subjectname;
    }
    
    public int getCreditHours() {
        return credithours;
    }
    
    public void setCreditHours(int creditHours) {
        this.credithours = credithours;
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
                subjectcode, subjectname, credithours, instructor, tuitionFee);
    }
    
    public static void main(String[] args) {
        System.out.println("GST Rate: " + GST_RATE);
        System.out.println("Tuition Fee: $" + Subjects.getTuitionFee());
        
        Subjects subject1 = new Subjects("CS201", "Data Structures", 3, "Dr. Smith");
        System.out.println("\n" + subject1);
        System.out.println("Total Fee with GST: $" + subject1.calculateTotalFee());
    }
}