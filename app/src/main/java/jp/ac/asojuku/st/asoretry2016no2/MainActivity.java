package jp.ac.asojuku.st.asoretry2016no2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button googleBtn = (Button) findViewById(R.id.btn_gg);
        Button mailBtn = (Button) findViewById(R.id.btn_mail);

        googleBtn.setOnClickListener(this);
        mailBtn.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btn_gg:
                Uri uri = Uri.parse("http://google.com");
                intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
            case R.id.btn_mail:
                intent = new Intent(MainActivity.this, SendMail.class);
                startActivity(intent);
                break;
        }
    }


}