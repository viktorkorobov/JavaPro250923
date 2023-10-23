package phonebook;

public class Recording {
    private String Name;
    private String number;

    public Recording(String name, String number) {
        Name = name;
        this.number = number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
