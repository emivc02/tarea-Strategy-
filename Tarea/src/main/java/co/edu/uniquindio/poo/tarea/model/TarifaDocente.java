package co.edu.uniquindio.poo.tarea.model;

public class TarifaDocente {
    private final double VALOR_DIA;

    public TarifaDocente(double valorDia) {
        this.VALOR_DIA = valorDia;
    }

    @Override
    public double calcularCosto(int horas) {
        return VALOR_DIA; // tarifa fija sin importar las horas
    }

    @Override
    public String getNombre() {
        return "Docente / Administrativo";
    }

}
