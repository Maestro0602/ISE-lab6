

public class Subject {

    public static final int MAX_CREDIT = 6;

    private String code;
    private String name;
    private int credit;

    public Subject(String code, String name, int credit) {
        this.code = code;
        setName(name); 
        this.credit = credit;
    }
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

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
}
