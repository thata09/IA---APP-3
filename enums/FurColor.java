package enums;

public enum FurColor {

    BLACK(1, "Black"),
    WHITE(2, "White"),
    ORANGE_TABBY(3, "Orange Tabby"),
    GRAY(4, "Gray"),
    BROWN(5, "Brown"),
    CALICO(6, "Calico"),
    SPOTTED(7, "Spotted");

    private final int code;
    private final String displayName;

    FurColor(int code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }

    public int getCode() {
        return code;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static FurColor fromCode(int code) {
        for (FurColor furColor : FurColor.values()) {
            if (furColor.code == code) {
                return furColor;
            }
        }

        throw new IllegalArgumentException("Invalid FurColor: " + code);
    }
}

/*
 * ATIVIDADE — Enum FurColor
 *
 * Crie o enum FurColor seguindo o mesmo modelo do enum TrainingLevel,
 * que foi criado para o cachorro.
 *
 * ------------------------------------------------------------
 * 1. CAMPOS
 *    Declare dois campos privados e finais:
 *      - code        (int)
 *      - displayName (String)
 *
 * ------------------------------------------------------------
 * 2. CONSTANTES
 *    Defina as 7 constantes abaixo, cada uma com seu código e
 *    nome de exibição correspondente:
 *
 *      BLACK        → código 1, nome "Black"
 *      WHITE        → código 2, nome "White"
 *      ORANGE_TABBY → código 3, nome "Orange Tabby"
 *      GRAY         → código 4, nome "Gray"
 *      BROWN        → código 5, nome "Brown"
 *      CALICO       → código 6, nome "Calico"
 *      SPOTTED      → código 7, nome "Spotted"
 *
 * ------------------------------------------------------------
 * 3. CONSTRUTOR
 *    Crie o construtor do enum recebendo (int code, String displayName)
 *    e atribua os valores aos campos correspondentes.
 *
 * ------------------------------------------------------------
 * 4. GETTERS
 *    Implemente:
 *      - getCode()        → retorna o campo code
 *      - getDisplayName() → retorna o campo displayName
 *
 * ------------------------------------------------------------
 * 5. MÉTODO ESTÁTICO fromCode
 *    Implemente o método estático fromCode(int code) que:
 *      - Percorre todas as constantes do enum com um for
 *      - Retorna a constante cujo code seja igual ao parâmetro
 *      - Lança IllegalArgumentException se nenhuma for encontrada
 *        (mensagem sugerida: "Invalid FurColor: " + code)
 */
