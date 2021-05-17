package com.example.miproyect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton imgP;
    private TextView respuesta;
    private String [] respuestaArray = {"Hazlo", "No tengo una respuesta", "No lo hagas"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencia la Imagen
        imgP = findViewById(R.id.boton);
        //Referencia texto
        respuesta = findViewById(R.id.respuestavista);

        //proceso
        imgP.setOnClickListener(this);
        Toast.makeText(MainActivity.this, "Consulta tu suerte", Toast.LENGHT_SHORT).show();
    }
    @Override
    public void onClick(View v){
        //creacion metodo switch
        switch (v.getId()) {
            case R.id.boton:

                int rand = new Random().nextInt(respuestaArray.length);
                respuesta.setText(respuestaArray[rand]);

                break;
        }
    }
}