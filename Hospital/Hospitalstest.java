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
}
