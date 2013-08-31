package com.example.textview_colaborativo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        Button btn_evelin = (Button) findViewById(R.id.btn_evelyn);
        btn_evelin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Evelik  eve = new Evelik();
                String hola = eve.getText();

                TextView text = (TextView) findViewById(R.id.textView1);
                text.setText(hola);
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	// terminar la aplicacion cuando se salga de la actividad	
	public void onDestroy(){
		System.exit(0);
		// este comentario no estaba antes
	}

	public void samuelprueba(){
		System.exit(0);
		// este es un ejemplo
	}
	public void funcionAlejandro(View v){
		TextView text = (TextView) findViewById(R.id.textView1);
		text.setText("la funcion de alejandro modifico esto");
	}
}
