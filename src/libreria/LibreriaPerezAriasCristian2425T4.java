package libreria;

/**
 * Representa una librería con información sobre un libro, su stock, precio y saldo en la cuenta.
 * Esta clase permite obtener información del libro, así como actualizar el saldo y gestionar la compra.
 * 
 * LibreriaPerezAriasCristian2425T4 libro = new LibreriaPerezAriasCristian2425T4("Don Quijote de la Mancha", 10, 45, 120);
 * System.out.println("Nombre: " + libro.obtenerNombre());
 * libro.comprarLibro(2);
 * 
 * @author  Cristian Pérez Arias
 */
public class LibreriaPerezAriasCristian2425T4 {

    private String nom;      // Nombre del libro
    private int cantidad;    // Cantidad de ejemplares en stock
    private double precio;   // Precio unitario del libro
    private double saldo;    // Saldo en la cuenta de la librería

    /**
     * Constructor sin argumentos.
     */
    public LibreriaPerezAriasCristian2425T4() {
    }

    /**
     * Constructor con parámetros para inicializar todas las propiedades.
     *
     * @param nom      el nombre del libro.
     * @param cantidad la cantidad de ejemplares en stock.
     * @param precio   el precio unitario del libro.
     * @param saldo    el saldo inicial en la cuenta de la librería.
     */
    public LibreriaPerezAriasCristian2425T4(String nom, int cantidad, double precio, double saldo) {
        this.nom = nom;
        this.cantidad = cantidad;
        this.precio = precio;
        this.saldo = saldo;
    }

    /**
     * Devuelve el nombre del libro.
     *
     * @return el nombre del libro.
     */
    public String obtenerNombre() {
        return getNom();
    }

    /**
     * Devuelve el precio del libro.
     *
     * @return el precio unitario del libro.
     */
    public double obtenerPrecio() {
        return getPrecio();
    }

    /**
     * Devuelve la cantidad de libros disponibles en stock.
     *
     * @return el número de ejemplares disponibles.
     */
    public int obtenerStock() {
        return getCantidad();
    }

    /**
     * Devuelve el saldo actual en la cuenta de la librería.
     *
     * @return el saldo en la cuenta.
     */
    public double obtenerSaldo() {
        return getSaldo();
    }

    /**
     * Aumenta el saldo de la cuenta de la librería.
     *
     * @param saldomas la cantidad a ingresar (debe ser mayor que cero).
     * @param concepto el concepto por el que se incrementa el saldo.
     * @throws Exception si el valor ingresado es 0 o negativo.
     */
    public void aumentarSaldo(double saldomas, String concepto) throws Exception {
        if (saldomas <= 0) {
            throw new Exception("No se puede ingresar 0 o una cantidad negativa");
        }
        setSaldo(getSaldo() + saldomas);
    }

    /**
     * Realiza la compra de un ejemplar del libro, actualizando el stock y el saldo.
     *
     * @param canti el número de ejemplares a comprar (debe ser mayor que cero).
     * @throws Exception si se intenta comprar una cantidad negativa,
     *                   si no hay suficiente stock o si no hay suficiente saldo.
     */
    public void comprarLibro(int canti) throws Exception {
        if (canti <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa de libros");
        }
        if (getCantidad() >= canti) {
            if (getSaldo() <= getPrecio()) {
                throw new Exception("No hay suficiente saldo para comprar");
            } else {
                setCantidad(getCantidad() - canti);
                setSaldo(getSaldo() + (getPrecio() * canti));
            }
        } else {
            throw new Exception("No se pueden comprar más libros de los que hay disponibles");
        }
    }

    /**
     * Obtiene el nombre del libro.
     *
     * @return el nombre del libro.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Establece el nombre del libro.
     *
     * @param nom el nombre a asignar.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Obtiene la cantidad de libros en stock.
     *
     * @return la cantidad de libros disponibles.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad de libros en stock.
     *
     * @param cantidad la cantidad a asignar.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el precio del libro.
     *
     * @return el precio unitario.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del libro.
     *
     * @param precio el precio a asignar.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el saldo de la cuenta de la librería.
     *
     * @return el saldo.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta de la librería.
     *
     * @param saldo el saldo a asignar.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
