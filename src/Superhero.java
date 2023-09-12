public class Superhero {
    private String name;
    private String realName;
    private String superPower;
    private int yearCreate;
    private String isHuman;
    private double strength;

    public Superhero(String name, String realName, String superPower, int yearCreate, String isHuman, double strength) {
        this.name = name;
        this.realName = realName;
        this.superPower = superPower;
        this.yearCreate = yearCreate;
        this.isHuman = isHuman;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }
    public String getRealName() {
        return realName;
    }
    public String getSuperPower() {
        return superPower;
    }
    public int getYearCreate() {
        return yearCreate;
    }
    public String getIsHuman() {
        return isHuman;
    }
    public double getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "name='" + name + '\'' +
                ", realName='" + realName + '\'' +
                ", superPower='" + superPower + '\'' +
                ", yearCreate=" + yearCreate +
                ", isHuman=" + isHuman +
                ", strength=" + strength +
                '}';
    }
}

