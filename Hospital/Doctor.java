package Hospital;

public class Doctor extends People {
    private String specialty;
    private String area;
    private String college;

    public Doctor () {
        super();
    }

    public Doctor (String specialty, String area, String college, int id, String name, String sex, int age) {
        super(id, name, sex, age);
        this.specialty = specialty;
        this.area = area;
        this.college = college;
    }

    public String getSpecialty() {
        return this.specialty;
    }
    
    public String getArea() {
        return this.area;
    }
    public String getCollege() {
        return this.college;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    
    public void setArea(String area) {
        this.area = area;
    }
    
    public void setCollege(String college) {
        this.college = college;
    }

    

}
