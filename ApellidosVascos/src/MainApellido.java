public class MainApellido {
    public static void main(String[] args) {
        String provincia;
        // Carga de Gipuzkoa
        Gestor.cargarProvincia("Gipuzkoa", "Zubizarreta", "Aguirre", "Belastegui", "Gabilondo",
                "Iturbe", "Ochotorena", "Salazar", "Elezcano");
        // Carga de Bizkaia
        Gestor.cargarProvincia("Bizkaia", "Abasolo", "Urrutia", "Echevarría", "Goikoetxea", "Ibarra",
                "Lertxundi", "Mendizabal", "Zallo");
        // Carga de Araba
        Gestor.cargarProvincia("Araba", "Vitoria", "Ortiz de Zárate", "Orueta", "Gámiz", "Basterra",
                "Amescua", "Zárate", "Uribe");

        Gestor.mostrarProvincias();
    }
}
