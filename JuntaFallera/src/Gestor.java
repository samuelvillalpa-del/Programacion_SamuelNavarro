import java.util.*;

public class Gestor {

    private static Map<String, List<Falla>> sectores;

    public Gestor() {
        this.sectores = new HashMap<>();
    }

    public static void cargarSectores(String sector, Falla... monumentos) {

        List<Falla> fallas = new ArrayList<>();

        for (Falla falla : monumentos) {
            fallas.add(falla);
        }

        sectores.put(sector, fallas);
    }

    public static void limpiarSectorePobre(String sector, int presupuestoMinimo) {
        int totalRepartir = 0;

        List<Falla> fallas = sectores.get(sector);

        Iterator<Falla> iterator = fallas.iterator();
        while (iterator.hasNext()) {
            Falla falla = iterator.next();
            if (falla.getPresupuesto() < presupuestoMinimo) {
                iterator.remove();
                totalRepartir++;
            }

            if(fallas.isEmpty()||totalRepartir>0){
                int total = totalRepartir / fallas.size();
                Iterator<Falla> iterator2 = fallas.iterator();
                while (iterator2.hasNext()) {
                    Falla falla2 = iterator2.next();
                    falla2.presupuesto += total;
                }

            }

        }
    }

    public static void mostrarResultado() {

        for (String fallas : sectores.keySet()){
            System.out.println("Provincia: " + fallas +" "+ sectores.get(fallas));

        }

    }
}
