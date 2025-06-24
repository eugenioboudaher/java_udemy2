package UdemyClasses;

public class Dataa {
    
    int dia = 1;
    int mes = 1;
    int ano = 2025;

    public  Dataa (int dia, int mes, int ano ) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;        
    }

    public Dataa () {};

    public Boolean diaValidator(int valor) {
    return valor >= 1 && valor <= 31;
}


    public  Boolean setDay (int value) {
        if (diaValidator(value)) {
           this.dia = value;
           return true;
        }else {
            System.out.println("Dia inválido");
            return false;
        }
        
    }

    public int getDay () {
        return dia;
    }
    public int getMonth () {
        return mes;
    }
    public int getYear () {
        return ano;
    }

    public String getData() {
        return String.format("%d / %d / %d", getDay(), getMonth(),getYear());
    }
}
