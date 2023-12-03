package Enums;

public enum Enums {
    UNO(1),
    DOS(2),
    TRES(3),
    CUATRO(4),
    CINCO(5);

    private final int numerointerno;

    Enums(int numero) {
        this.numerointerno = numero;
    }

    public int getNumero() {
        return this.numerointerno;
    }
}
