package andprj.mgureken.com.andproje;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtKa;
    TextView txtSifre;
    Button btnEnter;
    String usrN = "Admin";
    String pswd = "123";
    TextView lblRes;
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtKa = (TextView) findViewById(R.id.txtUsrName2);
        txtSifre = (TextView)findViewById(R.id.txtPassword2);
        txtKa.setText("Admin");
        txtSifre.setText("123");
        btnEnter = (Button) findViewById(R.id.btnOk);
        lblRes = (TextView) findViewById(R.id.lblSonuc);
        sp = (Spinner)findViewById(R.id.spItem);
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enterUser(v);
            }
        });
    }

    private void enterUser(View view)
    {
        if(usrN.equals(txtKa.getText().toString())&&pswd.equals(txtSifre.getText().toString()))
        {
            lblRes.setText("Giris basarili");
            Toast.makeText(this, "Giriş basarili",Toast.LENGTH_LONG).show();
        }
        else
        {
            lblRes.setText("Giris basarisiz");
            Toast.makeText(this, "Giriş basarısız",Toast.LENGTH_LONG).show();
        }
    }
}
