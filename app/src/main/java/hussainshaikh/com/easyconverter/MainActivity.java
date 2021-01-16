package hussainshaikh.com.easyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1,meterToinches,marks_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.dollar_btn1);
        meterToinches = (Button) findViewById(R.id.meter_btn);
        marks_btn = (Button) findViewById(R.id.marks_btn);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),dollar.class);
                startActivity(intent);
            }
        });
        meterToinches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),meter_to_inch.class));
            }
        });
        marks_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Exammarks.class);
                startActivity(intent);
            }
        });


    }
}