package UdemyClasses;

public class Circulo {
    double raio;
    static final double pi = 3.14;

    Circulo (double raio) {
        this.raio = raio;
        
    }

    double area () {
        return pi * Math.pow(raio, 2);
    }
}
