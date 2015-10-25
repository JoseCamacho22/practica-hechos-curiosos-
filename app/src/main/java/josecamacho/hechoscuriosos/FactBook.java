package josecamacho.hechoscuriosos;

import android.content.Context;

import java.util.Random;

/**
 * Created by Jose on 25/10/15.
 */
public class FactBook {

    //devolverá una frase aleatoria en forma de string
    public static String getRandomFact(Context context) {
        String[] answers = context.getResources().getStringArray(R.array.string_array_hechosCuriosos);
        return answers[new Random().nextInt(answers.length)];
    }
}