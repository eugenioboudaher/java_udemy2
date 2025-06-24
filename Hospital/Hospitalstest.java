package Hospital;

import java.util.ArrayList;

public class Hospitalstest {
    public static void main(String[] args) {
        Hospitals sistema = new Hospitals();

        Hospitals.HospitalUnit h1 = new Hospitals.HospitalUnit("Hospital Geral de Fortaleza", "Público", 200, "Fortaleza", "Ceará", new ArrayList<>());
        Hospitals.HospitalUnit h2 = new Hospitals.HospitalUnit("Hospital São Mateus", "Privado", 150, "Fortaleza", "Ceará", new ArrayList<>());

        sistema.registerHospital(h1);
        sistema.registerHospital(h2);
        sistema.showHospitalsList();


        Patient p1 = new Patient(1, "Amanda", "Feminino", 34, "Gripe", true);
        Patient p2 = new Patient(2, "Carlos", "Masculino", 40, "Fratura", false);
        Patient p3 = new Patient(3, "Fernanda", "Feminino", 29, "Alergia", true);
        Patient p4 = new Patient(4, "Lucas", "Masculino", 50, "Covid-19", false);
        Patient p5 = new Patient(5, "Ricardo", "Masculino", 61, "Hipertensão", true);

        Doctor doctor1 = new Doctor(
                "Pediatria",          
                "Hospital Infantil",    
                "USP",                   
                201,                    
                "Dra. Laura Martins",   
                "F",                    
                38                     
        );

    
        Doctor doctor2 = new Doctor(
            "Ortopedia",
            "Hospital das Clínicas",
            "Unicamp",
            202,
            "Dr. Bruno Ferreira",
            "M",
            46
        );


       
          
    }


}
