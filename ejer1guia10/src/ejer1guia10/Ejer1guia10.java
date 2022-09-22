package ejer1guia10;

import clase.Animal;
import clase.Caballo;
import clase.Gato;
import clase.Perro;

public class Ejer1guia10 {

    public static void main(String[] args) {
        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro1.Alimentarse();
        Animal perro2 = new Perro("Teddy", "croquetas", 10, "chihuahua");
        perro2.Alimentarse();
        Animal gato1 = new Gato("Pelusa", "galletas", 15, "siames");
        gato1.Alimentarse();
        Animal caballo1 = new Caballo("Spark", "pasto", 25, "fino");
        caballo1.Alimentarse();
    }

}
