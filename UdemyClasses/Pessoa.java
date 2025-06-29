package UdemyClasses;

public class Pessoa {
    String name;
    double weight;

    public Pessoa (String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void comer (Comida... comidas) {
        for (Comida comida : comidas){
            if (comida != null) {
                this.weight += comida.peso;
            }
            
        }
        
    }
}
