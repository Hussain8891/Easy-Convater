package hussainshaikh.com.easyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class dollar extends AppCompatActivity {
    EditText Enter_dollar;
    Button convert;
    TextView Rupees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dollar);

        Enter_dollar = (EditText) findViewById(R.id.enter_dollar);
        convert = (Button) findViewById(R.id.convert_btn);
        Rupees  = (TextView) findViewById(R.id.rupees);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dollars = Enter_dollar.getText().toString();
                Double doubledollars = Double.parseDouble(dollars);
                Double rupees = 73.36 * doubledollars;
                String amount = rupees.toString();

                Rupees.setText(amount);

            }
        });




    }
}