package Hospital;

import java.time.LocalDateTime;

public class Appointment {
    private Doctor doctor;
    private Patient pacient;
    private Rooms room;
    private LocalDateTime dateTime;

    public Appointment(Doctor doctor, Patient patient, Rooms room, LocalDateTime dateTime) {
        this.doctor = doctor;
        this.pacient = patient;
        this.room = room;
        this.dateTime = dateTime;
    }


    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }


    public Patient getPacient() {
        return pacient;
    }

    public void setPacient(Patient pacient) {
        this.pacient = pacient;
    }


    public Rooms getRoom() {
        return room;
    }

    public void setRoom(Rooms room) {
        this.room = room;
    }


    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
