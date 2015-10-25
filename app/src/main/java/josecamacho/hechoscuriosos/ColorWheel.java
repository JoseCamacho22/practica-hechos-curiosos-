package josecamacho.hechoscuriosos;

import android.content.Context;
import android.graphics.Color;

import java.util.Random;

/**
 * Created by Jose on 25/10/15.
 */
public class ColorWheel {

    //devolverá un color aleatorio en forma de entero (utilizar el método parseColor de la clase Color).
    public int getRandomColor(Context context) {
        String[] colores = context.getResources().getStringArray(R.array.string_array_colores);
        return Color.parseColor(colores[new Random().nextInt(colores.length)]);

    }

}
