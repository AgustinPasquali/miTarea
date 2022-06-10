public class App {
    public static void main(String[] args) throws Exception {
        Cliente miCliente = new Cliente();

        miCliente.setEdad(19);
        miCliente.setNombre("Roman");
        miCliente.setTelefono(1127796354);
        miCliente.setCredito(150.048);

        Trabajador miTrabajador = new Trabajador();

        miTrabajador.setNombre("Quique");
        miTrabajador.setEdad(52);
        miTrabajador.setTelefono(1138597331);
        miTrabajador.setSalario(50.353);


        System.out.println(miCliente.getNombre()+" de "+miCliente.getEdad()+" años.");
        System.out.println("Su numero de telefono es "+miCliente.getTelefono()+" y solicito un credito por $"+miCliente.getCredito()+" pesos argentinos.");
        
        System.out.println(miTrabajador.getNombre()+" de "+miTrabajador.getEdad()+" años.");
        System.out.println("Le pagamos $"+miTrabajador.getSalario()+" pesos por mes y su telefono es el "+miTrabajador.getTelefono()+".");
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}

class Cliente extends Persona {
    private double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito(){
        return this.credito;
    }
}

final class Trabajador extends Persona{
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }
}