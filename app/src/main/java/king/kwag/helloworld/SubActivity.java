package king.kwag.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Kwag on 2016-06-24.
 */
public class SubActivity extends Activity {
    int data_int;
    float data_float;
    char data_char;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        TextView data1 = (TextView)findViewById(R.id.data1);
        TextView data2 = (TextView)findViewById(R.id.data2);
        TextView data3 = (TextView)findViewById(R.id.data3);

        Intent intent = getIntent();
        String data = intent.getStringExtra("입력한 id");
        data_int=intent.getIntExtra("data1", 0);
        data_float = intent.getFloatExtra("data2", 0.0F);
        data_char = intent.getCharExtra("data3", 'a');
        ChungAngUniv cau = (ChungAngUniv) intent.getSerializableExtra("CAU");

        Toast.makeText(this, cau.getName(), Toast.LENGTH_SHORT).show();

        data1.setText(Integer.toString(data_int));
        data2.setText(Float.toString(data_float));
        data3.setText(Character.toString(data_char));

        Intent sendData = new Intent();
        sendData.putExtra("서브액티비티의 소감", "졸라쉬워");
        setResult(0, sendData);
    }

    public void onClick(View view) {
        finish();
    }

    public void onData1(View view) {
        Toast.makeText(this, Integer.toString(data_int), Toast.LENGTH_SHORT).show();
    }

    public void onData2(View view) {
        Toast.makeText(this, Float.toString(data_float), Toast.LENGTH_SHORT).show();
    }

    public void onData3(View view) {
        Toast.makeText(this, Character.toString(data_char), Toast.LENGTH_SHORT).show();
    }
}
