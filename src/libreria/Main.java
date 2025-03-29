
package libreria;

public class Main {
  
    public static void main(String[] args) {
        LibreriaPerezAriasCristian2425T4 miLibreriaPerezAriasCristian;
        String x;
        int stock;
        int num;
        double dinero;
        double saldoActual;
        double ingreso;
        
        miLibreriaPerezAriasCristian = new LibreriaPerezAriasCristian2425T4("Don Quijote de la Mancha", 10, 45, 120);

        compraQuijotePerezAriasCristian2425T4(miLibreriaPerezAriasCristian);
        
        saldoActual = miLibreriaPerezAriasCristian.obtenerSaldo();
        System.out.println("El saldo al comprar el libro es de "+ saldoActual );        
        x = miLibreriaPerezAriasCristian.obtenerNombre();
        stock = miLibreriaPerezAriasCristian.obtenerStock();
        System.out.println("El libro "+x+" tiene un stock de "+stock+" unidades ahora");
        
        aumentarIngresoPerezAriasCristian2425T4(miLibreriaPerezAriasCristian);
    }

    private static void aumentarIngresoPerezAriasCristian2425T4(LibreriaPerezAriasCristian2425T4 miLibreriaPerezAriasCristian) {
        double ingreso;
        double saldoActual;
        try
        {
            ingreso = 30.5; //Ingreso que se va a realizar en el saldo de la librería
            miLibreriaPerezAriasCristian.aumentarSaldo(ingreso, "Libro Vendido");
            saldoActual = miLibreriaPerezAriasCristian.obtenerSaldo();
            System.out.println("Tu saldo actual después de ingresar es de "+saldoActual+"€");
        } catch (Exception e)
        {
            System.out.println("Fallo al obtener el saldo al ingresar");
        }
    }

    private static void compraQuijotePerezAriasCristian2425T4(LibreriaPerezAriasCristian2425T4 miLibreriaPerezAriasCristian) {
        String x;
        int num;
        double dinero;
        double saldoActual;
        try
        {
            x = "Don Quijote de la Mancha";
            num = 2;    //Número de ejemplares a comprar
            dinero = miLibreriaPerezAriasCristian.obtenerPrecio();
            saldoActual = miLibreriaPerezAriasCristian.obtenerSaldo();
            System.out.println("El libro "+x+" vale "+dinero+"€");
            System.out.println("El saldo actual de la librería es de "+saldoActual+"€");
            miLibreriaPerezAriasCristian.comprarLibro(num);
            
        } catch (Exception e)
        {
            System.out.println("Error en la compra del libro");
        }
    }
}
