package jp.ac.asojuku.st.asoretry2016no2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class SendMail extends Activity implements View.OnClickListener{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mailSendBtn = (Button)findViewById(R.id.mailSendBtn);
        mailSendBtn.setOnClickListener(this);
    }



    @Override
    public void onClick(View v){

        EditText editText = (EditText) findViewById(R.id.mailText);
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:1501022@st.asojuku.ac.jp"));
        intent.putExtra(Intent.EXTRA_TEXT, editText.getText());
        startActivity(intent);
    }

}