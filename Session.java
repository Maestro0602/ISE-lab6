package ise;
/**
 * ------------------------------------------------------------
 * Class Name   : Session
 * Author       : Theng vanheng
 * Created Date : 2025-12-30
 * Description  : Represents a Year 2 class session.
 *                Demonstrates coding standards, constants,
 *                naming conventions, and exception handling.
 * ------------------------------------------------------------
 */
public class Session {

    // ===================== ATTRIBUTES =====================
    private int startTime;
    private int endTime;

    // ===================== CONSTRUCTOR =====================
    public Session(int startTime, int endTime) {
        setDuration(startTime, endTime);
    }

    // ===================== GETTERS =====================
    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    // ===================== METHODS =====================
    /**
     * Sets session duration.
     * @param startTime start hour (integer)
     * @param endTime end hour (integer)
     * @throws IllegalArgumentException if startTime >= endTime
     */
    public void setDuration(int startTime, int endTime) {
        if (startTime >= endTime) {
            throw new IllegalArgumentException(
                "Start time must be less than end time."
            );
        }
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // ===================== MAIN METHOD (TESTING) =====================
    public static void main(String[] args) {
        try {
            Session session = new Session(9, 11);

            System.out.println("Session Start Time : " + session.getStartTime());
            System.out.println("Session End Time   : " + session.getEndTime());

            // Uncomment to test exception
            // session.setDuration(14, 12);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
