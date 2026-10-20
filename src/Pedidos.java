public class Pedido {

    private int numero;
    private String cliente;
    private double total;
    private String estado;

    private static int contadorPedidos = 0;
    private static double ventasTotales = 0;

    public Pedido(String cliente, double total) {
        contadorPedidos++;
        this.numero = contadorPedidos;
        this.cliente = cliente;
        this.total = total;
        this.estado = "Pendiente";
    }

    public void confirmar() {
        if (!estado.equals("Confirmado")) {
            estado = "Confirmado";
            ventasTotales = ventasTotales + total;
        }
    }

    public String getEstado() {
        return estado;
    }

    public static double getVentasTotales() {
        return ventasTotales;
    }
}