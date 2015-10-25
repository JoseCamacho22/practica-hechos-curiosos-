package josecamacho.hechoscuriosos;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


public class Hecho_Curioso_Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hecho__curioso_);


        final TextView factLabel = (TextView) findViewById(R.id.HechoCuriosoTextView);
        Button showFactButton = (Button) findViewById(R.id.button);
        final RelativeLayout LayoutPrincipal = (RelativeLayout) findViewById(R.id.LayoutPrincipal);

        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Resources res = getResources();
                String[] answers = res.getStringArray(R.array.string_array_hechosCuriosos);
                // Randomly select a fact

                Random randomGenerator = new Random(); //Construct new number Generator
                int randomNumber = randomGenerator.nextInt(answers.length); // limit to numbers of answers
                factLabel.setText(answers[randomNumber]);
            }
        };

        showFactButton.setOnClickListener(listener);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hecho__curioso_, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
