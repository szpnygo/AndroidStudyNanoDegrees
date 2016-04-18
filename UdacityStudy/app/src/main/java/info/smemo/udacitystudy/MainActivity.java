package info.smemo.udacitystudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnMenuStreamer;
    private Button btnMenuScore;
    private Button btnMenuLibrary;
    private Button btnMenuBigger;
    private Button btnMenuReader;
    private Button btnMenuOwnApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMenuStreamer = (Button)findViewById(R.id.menuStreamer);
        btnMenuScore = (Button)findViewById(R.id.menuScore);
        btnMenuLibrary = (Button)findViewById(R.id.menuLibrary);
        btnMenuBigger = (Button)findViewById(R.id.menuBigger);
        btnMenuReader = (Button)findViewById(R.id.menuReader);
        btnMenuOwnApp = (Button)findViewById(R.id.menuOwnApp);

        btnMenuStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"open spotify streamer",Toast.LENGTH_SHORT).show();
            }
        });

        btnMenuScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"open scores app",Toast.LENGTH_SHORT).show();
            }
        });

        btnMenuLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"open library app",Toast.LENGTH_SHORT).show();
            }
        });

        btnMenuBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"build it bigger",Toast.LENGTH_SHORT).show();
            }
        });

        btnMenuReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"open xyz reader",Toast.LENGTH_SHORT).show();
            }
        });

        btnMenuOwnApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"open my own app!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
