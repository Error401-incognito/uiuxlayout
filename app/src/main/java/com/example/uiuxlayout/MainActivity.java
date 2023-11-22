// MainActivity.java
package com.example.uiuxlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to UI components
        textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);

        // Set click listener for the button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle button click
                String inputText = editText.getText().toString();
                if (!inputText.isEmpty()) {
                    textView.setText("Hello, " + inputText + "!");
                } else {
                    showSnackbar("Please enter a name.");
                }
            }
        });
    }

    private void showSnackbar(String message) {
        Snackbar.make(findViewById(android.R.id.content), message, Snackbar.LENGTH_SHORT).show();
    }
}
