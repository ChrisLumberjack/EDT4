package libreria;

/**
 * Clase principal que ejecuta operaciones sobre la librería.
 * En este ejemplo, se simula la compra de un libro y el aumento de saldo,
 * mostrando los resultados en la consola.
 * 
 * LibreriaPerezAriasCristian2425T4 libro = new LibreriaPerezAriasCristian2425T4("Don Quijote de la Mancha", 10, 45, 120);
 * compraQuijotePerezAriasCristian2425T4(libro);
 * aumentarIngresoPerezAriasCristian2425T4(libro);
 * 
 */
public class Main {

    /**
     * Método principal que ejecuta la aplicación.
     *
     * @param args los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        LibreriaPerezAriasCristian2425T4 miLibreriaPerezAriasCristian;
        String x;
        int stock;
        int num;
        double dinero;
        double saldoActual;
        double ingreso;

        // Inicializar la librería con datos del libro
        miLibreriaPerezAriasCristian = new LibreriaPerezAriasCristian2425T4("Don Quijote de la Mancha", 10, 45, 120);

        compraQuijotePerezAriasCristian2425T4(miLibreriaPerezAriasCristian);

        saldoActual = miLibreriaPerezAriasCristian.obtenerSaldo();
        System.out.println("El saldo al comprar el libro es de " + saldoActual);
        x = miLibreriaPerezAriasCristian.obtenerNombre();
        stock = miLibreriaPerezAriasCristian.obtenerStock();
        System.out.println("El libro " + x + " tiene un stock de " + stock + " unidades ahora");

        aumentarIngresoPerezAriasCristian2425T4(miLibreriaPerezAriasCristian);
    }

    /**
     * Realiza la compra de ejemplares de "Don Quijote de la Mancha" y actualiza el stock y el saldo.
     *
     * @param miLibreriaPerezAriasCristian la instancia de la librería que contiene el libro.
     */
    private static void compraQuijotePerezAriasCristian2425T4(LibreriaPerezAriasCristian2425T4 miLibreriaPerezAriasCristian) {
        String x;
        int num;
        double dinero;
        double saldoActual;
        try {
            x = "Don Quijote de la Mancha";
            num = 2;    // Número de ejemplares a comprar
            dinero = miLibreriaPerezAriasCristian.obtenerPrecio();
            saldoActual = miLibreriaPerezAriasCristian.obtenerSaldo();
            System.out.println("El libro " + x + " vale " + dinero + "€");
            System.out.println("El saldo actual de la librería es de " + saldoActual + "€");
            miLibreriaPerezAriasCristian.comprarLibro(num);
        } catch (Exception e) {
            System.out.println("Error en la compra del libro");
        }
    }

    /**
     * Aumenta el saldo de la cuenta de la librería simulando un ingreso.
     *
     * @param miLibreriaPerezAriasCristian la instancia de la librería sobre la cual se aumentará el saldo.
     */
    private static void aumentarIngresoPerezAriasCristian2425T4(LibreriaPerezAriasCristian2425T4 miLibreriaPerezAriasCristian) {
        double ingreso;
        double saldoActual;
        try {
            ingreso = 30.5; // Ingreso que se va a realizar en el saldo de la librería
            miLibreriaPerezAriasCristian.aumentarSaldo(ingreso, "Libro Vendido");
            saldoActual = miLibreriaPerezAriasCristian.obtenerSaldo();
            System.out.println("Tu saldo actual después de ingresar es de " + saldoActual + "€");
        } catch (Exception e) {
            System.out.println("Fallo al obtener el saldo al ingresar");
        }
    }
}
