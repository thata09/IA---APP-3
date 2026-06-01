package app;

import enums.FurColor;
import model.Cat;

public class Main {

    public static void main(String[] args) {

        Cat gato = new Cat(
                "Mingau",
                3,
                4.5,
                FurColor.ORANGE_TABBY,
                true,
                "Ração Premium",
                25,
                true
        );

        System.out.println("=== TESTE DO GATO ===");

        gato.displayInfo();

        System.out.println("\n=== SOM ===");
        gato.makeSound();

        System.out.println("\n=== SONO ===");
        gato.sleep();

        System.out.println("\n=== MOVIMENTAÇÃO ===");
        gato.move(5);
        gato.move(3, 40);
        gato.move(2, "rato");

        System.out.println("\n=== RONRONAR ===");
        gato.purr();

        System.out.println("\n=== PERDER VIDAS ===");
        gato.loseLife();
        gato.loseLife();
        gato.loseLife();

        System.out.println("\n=== INFORMAÇÕES ATUALIZADAS ===");
        gato.displayInfo();
    }
}