package Hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospitals {
    List<HospitalUnit> hospitalsList = new ArrayList<>();

    public void registerHospital(HospitalUnit hospital) {
        hospitalsList.add(hospital);
    }
    public void showHospitalsList() {
        for (HospitalUnit i : hospitalsList) {
            System.out.printf("Name: %s \n", i.getName());
            System.out.printf("Type: %s \n", i.getType());
            System.out.printf("Capacity: %d rooms available \n", i.getNumberOfRooms());
            System.out.printf("City: %s \n", i.getCity());
            System.out.printf("State: %s \n", i.getState());
            System.out.println("=================================================================");

        };
    }


    public static class HospitalUnit {
        private String name;
        private String type;
        private int numberOfRooms;
        private String city;
        private String state;


        public HospitalUnit(String name, String type, int numberOfRooms, String city, String state) {
            this.name = name;
            this.type = type;
            this.numberOfRooms = numberOfRooms;
            this.city = city;
            this.state = state;
        }


        public HospitalUnit() {}


        public void setName(String name) {
            this.name = name;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setNumberOfRooms(int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setState(String state) {
            this.state = state;
        }


        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public int getNumberOfRooms() {
            return numberOfRooms;
        }

        public String getCity() {
            return city;
        }

        public String getState() {
            return state;
        }
    }
}
