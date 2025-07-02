package Hospital;

import java.time.LocalDateTime;


public class Hospitalstest {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Cardiology", "Heart", "Harvard", 1, "Dr. Alice", "F", 45);
        Doctor doctor2 = new Doctor("Neurology", "Brain", "Stanford", 2, "Dr. Bob", "M", 50);
        Doctor doctor3 = new Doctor("Pediatrics", "Children", "Yale", 3, "Dr. Carol", "F", 40);

        // Criando alguns pacientes
        Patient patient1 = new Patient(101, "John Doe", "M", 30, "Flu", false);
        Patient patient2 = new Patient(102, "Jane Smith", "F", 25, "Migraine", false);
        Patient patient3 = new Patient(103, "Tom Brown", "M", 12, "Checkup", false);

        // Criando algumas salas (Rooms) — vou supor uma classe simples Rooms
        Rooms room1 = new Rooms(201, "Surgery");
        Rooms room2 = new Rooms(202, "Consultation");
        Rooms room3 = new Rooms(203, "Pediatrics");

        // Criando appointments
        Appointment appointment1 = new Appointment(doctor1, patient1, room1, LocalDateTime.now());
        Appointment appointment2 = new Appointment(doctor2, patient2, room2, LocalDateTime.now().plusHours(2));
        Appointment appointment3 = new Appointment(doctor3, patient3, room3, LocalDateTime.now().plusDays(1));

        // Exibindo
        appointment1.showAppointment();
        System.out.println("------------");
        appointment2.showAppointment();
        System.out.println("------------");
        appointment3.showAppointment();
    }
}

// Rooms (exemplo básico)
        class Rooms {
            private int number;
            private String type;

            public Rooms(int number, String type) {
                this.number = number;
                this.type = type;
            }

            public String toString() {
                return String.format("Room #%d - %s", number, type);
            }


       
          
    }



