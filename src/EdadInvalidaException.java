class EdadInvalidaException extends Exception {
    private int edadIngresada;

    public EdadInvalidaException(String mensaje, int edadIngresada) {
        super(mensaje);
        this.edadIngresada = edadIngresada;
    }

    public int getEdadIngresada() {
        return edadIngresada;
    }
}
