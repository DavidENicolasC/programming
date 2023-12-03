package Enums;
public class PruebaEnums {
    public static void main(String[] args) {
        indicarNumero( Enums.TRES );

        System.out.println("UNO es:" + Enums.UNO.getNumero());
    }

    private static void indicarNumero( Enums dia ) {
        switch( dia )
        {
            case UNO:
                System.out.println("Es UNO");
                break;
            case DOS:
                System.out.println("Es DOS");
                break;
            case TRES:
                System.out.println("Es TRES");
                break;
            case CUATRO:
                System.out.println("Es CUATRO");
                break;
            case CINCO:
                System.out.println("Es CINCO");
        }
    }
}
