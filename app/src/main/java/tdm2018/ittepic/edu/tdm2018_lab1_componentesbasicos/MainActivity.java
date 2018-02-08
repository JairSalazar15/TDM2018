package tdm2018.ittepic.edu.tdm2018_lab1_componentesbasicos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button calcula;
    EditText valorM;
    TextView resultado;
    int num1 = 0,num2 = 0, tot = 0;
    String res = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcula=(Button)findViewById(R.id.btnCalcular);
        valorM=(EditText)findViewById(R.id.editTextMult);
        resultado=(TextView)findViewById(R.id.textViewTabla);

        calcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = valorM.getText().length();
                resultado.setText("Calcular hasta: ");

                res = "";

                //num1  = Integer.parseInt(valorN.getText().toString());
                for(int i = 1 ; i <= 10 ; i++){
                    tot = num2 * i;
                    res += num2 + " x "+ i + " = " + tot + "\n";
                }
                resultado.setText(res);

            }
        });

    }
}
