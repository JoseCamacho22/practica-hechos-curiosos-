package josecamacho.hechoscuriosos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class Hecho_Curioso_Activity extends AppCompatActivity {
    FactBook factBook = new FactBook();
    ColorWheel colorWhell = new ColorWheel();
    RelativeLayout layoutPrincipal;
    TextView hechoCuriosoTextView;
    Button otroHechoButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hecho__curioso_);

        layoutPrincipal = (RelativeLayout) findViewById(R.id.LayoutPrincipal);
        hechoCuriosoTextView = (TextView) findViewById(R.id.HechoCuriosoTextView);
        otroHechoButton = (Button) findViewById(R.id.button);


        Toast toast = Toast.makeText(this, "Mostrar hecho Curisoso", Toast.LENGTH_LONG);
        toast.show();


    }


    //metodo que se ejecuta cuando se pulsa el boton

    public void factButtonAction(View view) {
        hechoCuriosoTextView.setText(factBook.getRandomFact(this));
        int color = colorWhell.getRandomColor(this);
        layoutPrincipal.setBackgroundColor(color);
        otroHechoButton.setTextColor(color);

    }
}



