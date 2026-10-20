public class MainPedidos {

    public static void main(String[] args) {

        Pedidos pedido = new Pedidos("Carlos", 120.50);

        System.out.println("Estado: " + pedido.getEstado());
        System.out.println("Ventas totales: " + Pedidos.getVentasTotales());

        pedido.confirmar();
        System.out.println("Estado: " + pedido.getEstado());
        System.out.println("Ventas totales: " + Pedidos.getVentasTotales());

        pedido.confirmar();
        System.out.println("Ventas totales: " + Pedidos.getVentasTotales());
    }
}