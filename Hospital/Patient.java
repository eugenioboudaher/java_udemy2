package Hospital;

public class Patient extends People {
    private String diagnoses;
    private Boolean discharge;

    public Patient () {
        super();
    }

    public Patient (int id, String name, String sex, int age, String diagnoses, Boolean discharge) {
        super(id, name, sex, age);
        this.diagnoses = diagnoses;
        this.discharge = discharge;
    }

    public String getDiagnosis () {
        return this.diagnoses;
    }
    
    public Boolean getDischarge () {
        return this.discharge;
    }

    public void setDiagnosis (String diagnosis) {
        this.diagnoses = diagnosis;
    }
    
    public void setDischarge (Boolean discharge) {
        this.discharge = true;
    }

    @Override
    public String toString() {
        return String.format("Patient: %s, ID: %d, Diagnosis: %s, Discharge: %s",
            getName(), getId(), getDiagnosis(), getDischarge());
}


}
