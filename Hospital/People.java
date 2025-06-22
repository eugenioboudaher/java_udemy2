package Hospital;

public class People {
    private int id;
    private String name;
    private String sex;
    private int age; 

    public People () {};

    public  People (int id, String name, String sex, int age){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public int getId () {
        return this.id;
    }

    public String getName () {
        return this.name;
    }
    public String getSex () {
        return this.sex;
    }
    public int getAge () {
        return this.age;
    }

    public void setId() {
        this.id += 1;
    }

    public void setName (String name) {
        this.name = name;
    }
    
    public void setSex (String sex) {
        this.sex = sex;
    }
    public void setAge (int age) {
        this.age = age;
    }

}


