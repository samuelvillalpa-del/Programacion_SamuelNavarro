public class Falla {

    protected String nombre;
    protected int presupuesto;
    protected boolean esInfantil;

    public Falla(String nombre, int presupuesto, boolean esInfantil) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.esInfantil = esInfantil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public boolean isEsInfantil() {
        return esInfantil;
    }

    public void setEsInfantil(boolean esInfantil) {
        this.esInfantil = esInfantil;
    }

    @Override
    public String toString() {
        return nombre+" "+presupuesto+" "+esInfantil;
    }
}
