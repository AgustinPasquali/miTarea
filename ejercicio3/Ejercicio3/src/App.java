public class App {
    public static void main(String[] args) throws Exception {
        int resultado = 0;
        resultado = suma( 4, 12, 19094);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.AddPuertas();
        System.out.println(miCoche.puerta);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;

    }

    
 }

class Coche {
    public int puerta = 0;
    
    public void AddPuertas() {
        this.puerta++;
    }
}
