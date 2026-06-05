import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gestor {

    private static Map<String, List<Apellido>> provincias = new HashMap<>();

    public Gestor() {
        provincias = new HashMap<>();
    }

    protected static void cargarProvincia(String provincia, String ap1, String ap2, String ap3, String ap4, String ap5, String ap6,String ap7, String ap8) {

        List<Apellido> apellidos = new ArrayList<>();

        apellidos.add(new Apellido(ap1));
        apellidos.add(new Apellido(ap2));
        apellidos.add(new Apellido(ap3));
        apellidos.add(new Apellido(ap4));
        apellidos.add(new Apellido(ap5));
        apellidos.add(new Apellido(ap6));
        apellidos.add(new Apellido(ap7));
        apellidos.add(new Apellido(ap8));

        apellidos = ordenarApellidosBurbuja(apellidos);

        provincias.put(provincia, apellidos);

    }


    public static List<Apellido> ordenarApellidosBurbuja(List<Apellido> apellidos) {
        int n=apellidos.size();

        for(int i=0;i<n-1;i++) {
            for (int j=0;j<n-i-1;j++) {
                String actual=apellidos.get(j).getApellido();
                String siguiente=apellidos.get(j+1).getApellido();

                if (actual.compareTo(siguiente)<0) {
                    Apellido auxiliar=apellidos.get(j);
                    apellidos.set(j,apellidos.get(j+1));
                    apellidos.set(j+1,auxiliar);

                }

            }
        }
        return apellidos;
    }

    public static void mostrarProvincias() {

        for (String p : provincias.keySet()){
            System.out.println("Provincia: " + p +" "+ provincias.get(p));

            }
        }
    }

