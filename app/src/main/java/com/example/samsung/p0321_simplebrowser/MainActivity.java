package com.example.samsung.p0321_simplebrowser;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUri = (EditText) findViewById(R.id.etUri);

        (findViewById(R.id.btnWeb)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String parsedString = etUri.getText().toString();
                if (parsedString.equals("")) {
                    Toast.makeText(getApplicationContext(), "The datas string is empty!", Toast.LENGTH_SHORT).show();
                    return;
                }
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + parsedString)));
            }
        });
    }
}
