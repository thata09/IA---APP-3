package enums;

public enum FurColor {

    BLACK(1, "Preto"),
    WHITE(2, "Branco"),
    ORANGE_TABBY(3, "Tigrado Laranja"),
    GRAY(4, "Cinza"),
    BROWN(5, "Marrom"),
    CALICO(6, "Malhado"),
    SPOTTED(7, "Pintado");

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
        for (FurColor furColor : values()) {
            if (furColor.code == code) {
                return furColor;
            }
        }

        throw new IllegalArgumentException("Invalid FurColor: " + code);
    }
}