package hussainshaikh.com.easyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Exammarks extends AppCompatActivity {
    EditText enter_marks,total_marks;
    Button submitbtn;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exammarks);

        enter_marks = (EditText) findViewById(R.id.enter_marks);
        total_marks = (EditText) findViewById(R.id.enter_subject_marks);
        result = (TextView) findViewById(R.id.result_text);
        submitbtn = (Button) findViewById(R.id.submit_btn);

        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (enter_marks.getText().toString().isEmpty() || total_marks.getText().toString().isEmpty()){
                    Toast.makeText(Exammarks.this, "Please enter valid input", Toast.LENGTH_SHORT).show();
                }else{
                    float marks = Float.parseFloat(enter_marks.getText().toString());
                    float percent = marks * 100;
                    float answer = percent/Float.parseFloat(total_marks.getText().toString());

                    result.setText(Float.toString(answer));

                }
            }
        });
    }
}