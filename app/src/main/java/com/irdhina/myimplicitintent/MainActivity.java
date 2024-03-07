package com.irdhina.myimplicitintent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    Button go;
    EditText url;
    String add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        go=findViewById(R.id.btnGo);
        url=findViewById(R.id.etUrl);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add=url.getText().toString();
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(add));
                startActivity(i);
            }
        });
    }
}