public class MainFallas {
    public static void main(String[] args) {

        Gestor.cargarSectores("Russafa",new Falla("Cuba-Literato Azorín",120000,false),new Falla("Cadiz-Denia",8000,true));
        Gestor.cargarSectores("Eixample",new Falla("Reino de Valencia",95000,false),new  Falla("Almirante  Cadarso",45000,false));
        Gestor.cargarSectores("La Seu",new Falla("Falla del Pilar",5000,false),new Falla("Plaza de la Reina",3500,false),new Falla("Trinitat",7500,false));

        Gestor.limpiarSectorePobre("Russafa",5000);
        Gestor.limpiarSectorePobre("Eixample",5000);
        Gestor.limpiarSectorePobre("La Seu",5000);

        Gestor.mostrarResultado();



    }
}
