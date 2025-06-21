package UdemyClasses;

public class Dataa {
    
    int dia;
    int mes;
    int ano;

    public  Dataa (int dia, int mes, int ano ) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;        
    }

    public Boolean diaValidator(int valor) {
    return valor >= 1 && valor <= 30;
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
}
