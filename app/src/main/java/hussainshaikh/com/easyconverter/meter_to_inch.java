package hussainshaikh.com.easyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class meter_to_inch extends AppCompatActivity {
    EditText enterinmeter;
    Button convertToinch;
    TextView inches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter_to_inch);

        enterinmeter = (EditText) findViewById(R.id.enter_meter);
        convertToinch = (Button) findViewById(R.id.convert_to_inch_btn);
        inches = (TextView) findViewById(R.id.inch);

        convertToinch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (enterinmeter.getText().toString().isEmpty()){
                    Toast.makeText(meter_to_inch.this, "Please enter valid data in meter", Toast.LENGTH_SHORT).show();
                }else {
                    String meter = enterinmeter.getText().toString();
                    Double meters = Double.parseDouble(meter);
                    Double ans  = 39.37 * meters;
                    String result = ans.toString();

                    inches.setText(result + "   Inches");


                }
            }
        });


    }
}