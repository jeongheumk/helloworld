package king.kwag.helloworld;

import android.app.Activity;
//import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import junit.framework.Assert;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, SubActivity.class);

        intent.putExtra("value", "이히이히이");
        intent.putExtra("data1", 123);
        intent.putExtra("data2", 123.1F);
        intent.putExtra("data3", 'c');
        intent.putExtra("CAU", new ChungAngUniv());

        EditText editId = (EditText) findViewById(R.id.edit_id);
        String id = editId.getText().toString();

        intent.putExtra("입력한 id", id);

        editId.;

        //startActivityForResult(intent,0);

        //finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        switch(requestCode){
            case 0:
                if(data!=null){
                    Toast.makeText(this, data.getStringExtra("서브액티비티의 소감"), Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
