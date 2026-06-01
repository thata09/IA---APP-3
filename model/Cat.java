package model;

import enums.FurColor;
import enums.Habitat;

public class Cat extends Animal {

    private int lives;
    private FurColor furColor;
    private boolean isIndoor;
    private String favoriteFood;
    private int purringFrequency;
    private boolean isNeutered;

    // Construtor
    public Cat(String name,
               int age,
               double weight,
               FurColor furColor,
               boolean isIndoor,
               String favoriteFood,
               int purringFrequency,
               boolean isNeutered) {

        super(name, 30, age, weight,
              isIndoor ? Habitat.DOMESTIC : Habitat.URBAN,
              !isIndoor);

        this.lives = 7;
        this.furColor = furColor;
        this.isIndoor = isIndoor;
        this.favoriteFood = favoriteFood;
        this.purringFrequency = purringFrequency;
        this.isNeutered = isNeutered;
    }

    // Sobrescreve makeSound()
    @Override
    public void makeSound() {
        System.out.println(getName() + " diz: Miau! (ronronando a " + purringFrequency + " Hz)");
    }

    // Sobrescreve sleep()
    @Override
    public void sleep() {
        System.out.println(getName() + " encontra o lugar mais quente e dorme por 14 horas.");
    }

    // Sobrecarga move(int distance, int speed)
    public void move(int distance, int speed) {
        System.out.println(getName() + " saltou " + distance + " metros a " + speed + " km/h.");
    }

    // Sobrecarga move(int distance, String target)
    public void move(int distance, String target) {
        System.out.println(getName() + " se aproximou silenciosamente " + distance + " metros em direção a " + target + ".");
    }

    // Método ronronar
    public void purr() {
        System.out.println(getName() + " está ronronando a " + purringFrequency + " Hz... purrr~");
    }

    // Método perder vida
    public void loseLife() {
        if (lives > 0) {
            lives--;
            System.out.println(getName() + " perdeu uma vida! Vidas restantes: " + lives);
        } else {
            System.out.println(getName() + " não tem mais vidas restantes.");
        }
    }

    // Sobrescreve displayInfo()
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vidas: " + lives);
        System.out.println("Cor do Pelo: " + furColor.getDisplayName());
        System.out.println("Gato de Interior: " + isIndoor);
        System.out.println("Comida Favorita: " + favoriteFood);
        System.out.println("Frequência de Ronronar: " + purringFrequency + " Hz");
        System.out.println("Castrado: " + isNeutered);
    }

    // Getters
    public int getLives() {
        return lives;
    }

    public FurColor getFurColor() {
        return furColor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public int getPurringFrequency() {
        return purringFrequency;
    }

    public boolean isNeutered() {
        return isNeutered;
    }
}
/*
 * ATIVIDADE — Classe Cat
 *
 * Crie a classe Cat seguindo o mesmo modelo da classe Dog,
 * que foi criada para o cachorro.
 *
 * ------------------------------------------------------------
 * 1. HERANÇA
 *    Cat deve estender a classe Animal.
 *
 * ------------------------------------------------------------
 * 2. CAMPOS (atributos privados)
 *    Declare os seguintes campos:
 *      - lives             (int)     — número de vidas do gato
 *      - furColor          (FurColor) — cor do pelo (use o enum FurColor)
 *      - isIndoor          (boolean) — se é gato de interior
 *      - favoriteFood      (String)  — comida favorita
 *      - purringFrequency  (int)     — frequência de ronronar em Hz
 *      - isNeutered        (boolean) — se é castrado
 *
 *    Lembre-se de importar o enum FurColor e a classe Habitat.
 *
 * ------------------------------------------------------------
 * 3. CONSTRUTOR
 *    Crie o construtor recebendo:
 *      (String name, int age, double weight, FurColor furColor,
 *       boolean isIndoor, String favoriteFood,
 *       int purringFrequency, boolean isNeutered)
 *
 *    Chame o construtor da superclasse com:
 *      super(name, 30, age, weight,
 *            isIndoor ? Habitat.DOMESTIC : Habitat.URBAN,
 *            !isIndoor)
 *
 *    Inicialize o campo lives com 7.
 *    Inicialize os demais campos com os parâmetros recebidos.
 *
 * ------------------------------------------------------------
 * 4. OVERRIDE — makeSound()
 *    Sobrescreva o método makeSound() de Animal.
 *    A saída deve conter o nome do gato, a palavra "Meow" e
 *    a frequência de ronronar em Hz.
 *    Exemplo: "Whiskers says: Meow! (purring at 25 Hz)"
 *
 * ------------------------------------------------------------
 * 5. OVERRIDE — sleep()
 *    Sobrescreva o método sleep() de Animal.
 *    A saída deve indicar que o gato procura o lugar mais quente
 *    e dorme por 14 horas.
 *    Exemplo: "Whiskers finds the warmest spot and sleeps for 14 hours."
 *
 * ------------------------------------------------------------
 * 6. OVERLOAD — move (sobrecargas)
 *    O método move(int distance) já está herdado de Animal.
 *    Crie duas novas versões sobrecarregadas:
 *
 *    a) move(int distance, int speed)
 *       Imprime que o gato deu um salto de 'distance' metros
 *       a 'speed' km/h.
 *       Exemplo: "Whiskers leaped 3 meters at 40 km/h."
 *
 *    b) move(int distance, String target)
 *       Imprime que o gato se aproximou silenciosamente de
 *       'target' por 'distance' metros.
 *       Exemplo: "Whiskers silently stalked 2 meters toward the mouse."
 *
 * ------------------------------------------------------------
 * 7. MÉTODO purr()
 *    Crie um método público purr() que imprime o nome do gato
 *    e sua frequência de ronronar.
 *    Exemplo: "Whiskers is purring at 25 Hz... purrr~"
 *
 * ------------------------------------------------------------
 * 8. MÉTODO loseLife()
 *    Crie um método público loseLife() que:
 *      - Se lives > 0: decrementa lives e imprime quantas vidas restam.
 *        Exemplo: "Whiskers lost a life! Lives remaining: 6"
 *      - Senão: imprime que o gato não tem mais vidas.
 *        Exemplo: "Whiskers has no lives left."
 *
 * ------------------------------------------------------------
 * 9. OVERRIDE — displayInfo()
 *    Sobrescreva displayInfo() chamando super.displayInfo() primeiro
 *    e depois imprimindo os campos específicos do gato:
 *      - lives, furColor (use getDisplayName()), isIndoor,
 *        favoriteFood, purringFrequency e isNeutered.
 *
 * ------------------------------------------------------------
 * 10. GETTERS
 *    Implemente getters para todos os campos:
 *      getLives(), getFurColor(), isIndoor(), getFavoriteFood(),
 *      getPurringFrequency(), isNeutered()
 */
