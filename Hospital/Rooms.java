package Hospital;

public class Rooms {
    private String name;
    private int capacity;
    private Boolean surgeryCenter;

    public Rooms (String name, int capacity, Boolean surgeryCenter) {
        this.name = name;
        this.capacity = capacity;
        this.surgeryCenter = surgeryCenter;
    }

    public Rooms () {}

    public void setName (String name) {
        this.name = name;        
    }

    public void setCapacity (int capacity) {
        this.capacity = capacity;        
    }

    public void setSurgeryCenter (Boolean value) {
        this.surgeryCenter = value;        
    }

    public String getName () {
        return this.name;
    }
    
    public int getCapacity () {
        return this.capacity;
    }
    
    public Boolean getSurgeryCanter () {
        return this.surgeryCenter;
    }
}
