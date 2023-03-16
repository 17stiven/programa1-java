public class Factura extends Precio{
    private String emisor;
    private String cliente;

    public Factura(String emisor, String cliente) {
        this.emisor = emisor;
        this.cliente = cliente;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEmisor() {
        return emisor;
    }

    public String getCliente() {
        return cliente;
    }

    public void imprimirFactura(){
        System.out.println("Información de la factura");
        System.out.println("Nombre del emisor: "+this.getEmisor());
        System.out.println("Nombre del cliente: "+this.getCliente());
    }
}
