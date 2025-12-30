package ise;

public class Session {

    // ===================== ATTRIBUTES =====================
    private int startTime;
    private int endTime;
    private String sessionName; // NEW ATTRIBUTE, but not initialized

    // ===================== CONSTRUCTOR =====================
    public Session(int startTime, int endTime) {
        setDuration(startTime, endTime);
        // BUG: forgot to initialize sessionName, could cause NullPointerException later
    }

    // ===================== GETTERS =====================
    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public String getSessionName() {
        return sessionName.toUpperCase(); // BUG: sessionName may be null
    }

    // ===================== METHODS =====================
    public void setDuration(int startTime, int endTime) {
        // setDuration() allows negative times, which may not make sense for a session.
        if (startTime >= endTime) {
            throw new IllegalArgumentException(
                "Start time must be less than end time."
            );
        }
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // BUG: Unused method
    public void printSessionInfo() {
        System.out.println("Session: " + sessionName + " | " + startTime + "-" + endTime);
    }

    // ===================== MAIN METHOD (TESTING) =====================
    public static void main(String[] args) {
        try {
            Session session = new Session(9, 11);

            System.out.println("Session Start Time : " + session.getStartTime());
            System.out.println("Session End Time   : " + session.getEndTime());
            
            // BUG: Uncommenting this will cause exception, but message is unclear
            // session.setDuration(14, 12);

            // BUG: Calling getSessionName will throw NullPointerException
            System.out.println("Session Name: " + session.getSessionName());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
