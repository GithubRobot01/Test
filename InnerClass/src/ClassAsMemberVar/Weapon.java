package ClassAsMemberVar;

public class Weapon {
    private String code; //武器代号

    public Weapon(String code) {
        this.code = code;
    }

    public Weapon() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
