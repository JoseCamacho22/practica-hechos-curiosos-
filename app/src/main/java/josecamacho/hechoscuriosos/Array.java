package josecamacho.hechoscuriosos;

import java.util.Random;

/**
 * Created by Jose on 19/10/15.
 */
public class Array {

    String[] lista = {

            "Las hormigas se estiran cuando se despiertan por la mañana.",
            "Las avestruces pueden correr más rápido que los caballos.",
            "Las medallas de oro de los juegos olímpicos están hechas de plata.",
            "Naciste con 300 huesos, pero en la edad adulta tendrás solo 206.",
            "Toma unos 8 minutos en llegar la luz del sol a la tierra.",
            "Algunas plantas de bambu pueden crecer hasta un metro al dia.",
            "El estado de Florida es más grande que Inglaterra.",
            "Algunos pingüinos pueden saltar de 2 a 3 metros por encima del aguar.",
            "De media se tarda 66 días en tomar un nuevo hábito.",
            "Los mamuts seguian caminando sobre la tierra en la época en que se construyeron las grandes pirámides."

    };

    String getContenido() {
        String listado = "";
        Random generadorNumber = new Random();
        int number = generadorNumber.nextInt(10);
        listado = lista[number];
        return listado;

    }

}
