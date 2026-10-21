package co.edu.uniquindio.poo.tarea.model;

public class TarifaEstudiante implements EstrategiaTarifa{
    private final double VALOR_HORA;

    public TarifaEstudiante(double valorHora) {
        this.VALOR_HORA = valorHora;
    }

    @Override
    public double calcularCosto(int horas) {
        return horas * VALOR_HORA;
    }

    @Override
    public String getNombre() {
        return "Estudiante";
    }
}
