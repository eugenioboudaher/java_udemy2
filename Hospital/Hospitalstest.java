package Hospital;

public class Hospitalstest {
    public static void main(String[] args) {
        Hospitals sistema = new Hospitals();

        Hospitals.HospitalUnit h1 = new Hospitals.HospitalUnit(
            "Hospital São Lucas", "Geral", 150, "São Paulo", "SP");

        Hospitals.HospitalUnit h2 = new Hospitals.HospitalUnit(
            "Hospital Vida", "Pediátrico", 80, "Rio de Janeiro", "RJ");

        Hospitals.HospitalUnit h3 = new Hospitals.HospitalUnit(
            "Hospital Santa Cruz", "Oncológico", 120, "Belo Horizonte", "MG");

        Hospitals.HospitalUnit h4 = new Hospitals.HospitalUnit(
            "Hospital da Mulher", "Maternidade", 60, "Recife", "PE");

        Hospitals.HospitalUnit h5 = new Hospitals.HospitalUnit(
            "Hospital Regional", "Traumatologia", 200, "Curitiba", "PR");

        sistema.registerHospital(h1);
        sistema.registerHospital(h2);
        sistema.registerHospital(h3);
        sistema.registerHospital(h4);
        sistema.registerHospital(h5);

        sistema.showHospitalsList();

        

        
    }

    Patient p1 = new Patient(1, "Amanda", "Feminino", 34, "Gripe", true);
    Patient p2 = new Patient(2, "Carlos", "Masculino", 40, "Fratura", false);
    Patient p3 = new Patient(3, "Fernanda", "Feminino", 29, "Alergia", true);
    Patient p4 = new Patient(4, "Lucas", "Masculino", 50, "Covid-19", false);
    Patient p5 = new Patient(5, "Ricardo", "Masculino", 61, "Hipertensão", true);
}
