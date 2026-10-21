package co.edu.uniquindio.poo.tarea.model;
public class Ticket {

    private String id;
    private int horas;
    private EstrategiaTarifa estrategia;

    public Ticket(String id, int horas, EstrategiaTarifa estrategia) {
        this.id = id;
        this.horas = horas;
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaTarifa estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularTotal() {
        return estrategia.calcularCosto(horas);
    }

    public void mostrarResumen() {
        System.out.println("Id: " + id);
        System.out.println("Tipo de usuario: " + estrategia.getNombre());
        System.out.println("Horas: " + horas);
        System.out.println("Total a pagar: $" + calcularTotal());
    }
}
