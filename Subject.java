/**
 * ------------------------------------------------------------
 * Class Name   : Subject
 * Author       : Theng vanheng
 * Created Date : 2025-12-30
 * Description  : Represents a Year 2 subject/course.
 *                Demonstrates coding standards, constants,
 *                naming conventions, and exception handling.
 * ------------------------------------------------------------
 */

public class Subject {

    // ===================== CONSTANTS =====================
    public static final int MAX_CREDIT = 6;

    // ===================== ATTRIBUTES =====================
    private String code;
    private String name;
    private int credit;

    // ===================== CONSTRUCTOR =====================
    public Subject(String code, String name, int credit) {
        this.code = code;
        setName(name); // validate using setter
        this.credit = credit;
    }

    // ===================== GETTERS =====================
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    // ===================== SETTERS =====================
    /**
     * Sets subject name.
     * @param name subject name
     * @throws IllegalArgumentException if name is null or empty
     */
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Subject name cannot be null or empty.");
        }
        this.name = name;
    }

    // ===================== MAIN METHOD (TESTING) =====================
    public static void main(String[] args) {
        try {
            Subject subject = new Subject("SE201", "Software Engineering", 3);

            System.out.println("Subject Code   : " + subject.getCode());
            System.out.println("Subject Name   : " + subject.getName());
            System.out.println("Subject Credit : " + subject.getCredit());

            // Uncomment to test exception
            // subject.setName("");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
