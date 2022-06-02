public class App {
    public static void main(String[] args) throws Exception {

            //--- IF ---//

        int numeroIf = 0;

        if (numeroIf == 0){
            System.out.println("Es 0");
        } else if (numeroIf > 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");
        }
            //--- WHILE  ---//

        int numeroWhile = 0;

        while (numeroWhile < 3){
            numeroWhile = numeroWhile + 1;

            System.out.println(numeroWhile);
        }
            //--- DO WHILE ---//

        do {
            numeroWhile = numeroWhile + 1;

            System.out.println(numeroWhile);        
        } while (numeroWhile < 3);
        
            //--- FOR ---//

        for (int numeroFor = 0; numeroFor < 3; numeroFor++) {
            System.out.println(numeroFor);
        }
            //--- SWITCH ---//

        String Estacion = "Primavera";

        switch (Estacion) {
            case "Verano":
                System.out.println(Estacion);
                break;

            case "Invierno":
                System.out.println(Estacion);
                break;

            case "Primavera":
                System.out.println(Estacion);
                break;

            case "Otoño":
                System.out.println(Estacion);
                break;
            default:
                System.out.println("El texto introducido es erroneo, ingrese una estacion del año con la primera letra mayuscula");
        }
    }    

}
