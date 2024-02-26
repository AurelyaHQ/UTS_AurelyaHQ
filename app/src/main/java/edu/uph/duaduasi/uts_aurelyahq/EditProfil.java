package edu.uph.duaduasi.uts_aurelyahq;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class EditProfil extends AppCompatActivity {
    private EditText NIM;
    private EditText Nama;
    private EditText Jurusan;
    private EditText Intake;
    private EditText Kampus;
    private RadioGroup Status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profil);

        NIM = findViewById(R.id.NIM);
        Nama = findViewById(R.id.Nama);
        Jurusan = findViewById(R.id.Jurusan);
        Intake = findViewById(R.id.Intake);
        Kampus = findViewById(R.id.Kampus);
        Status = findViewById(R.id.Status);

        // Inisialisasi Button
        Button Submit = findViewById(R.id.Submit);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Show Toast with input views
                showToast();
            }
        });
    }

    private void showToast() {
        // Get input value
        String nim = NIM.getText().toString();
        String nama = Nama.getText().toString();
        String jurusan = Jurusan.getText().toString();
        String intake = Intake.getText().toString();
        String kampus = Kampus.getText().toString();
        String status = getSelectedRadioButtonText();

        // Create message for Toast
        String message = "NIM: " + nim + "\n" +
                "Nama: " + nama + "\n" +
                "Jurusan: " + jurusan + "\n" +
                "Intake: " + intake + "\n" +
                "Kampus: " + kampus + "\n" +
                "Status: " + status;

        // Show the Toast
        // Show the horizontal Toast
        Toast toast = Toast.makeText(EditProfil.this, message, Toast.LENGTH_LONG);
        toast.show();
    }

        private String getSelectedRadioButtonText() {
        int selectedId = Status.getCheckedRadioButtonId();
        RadioButton selectedRadioButton = findViewById(selectedId);
        return selectedRadioButton != null ? selectedRadioButton.getText().toString() : "";
    }
}