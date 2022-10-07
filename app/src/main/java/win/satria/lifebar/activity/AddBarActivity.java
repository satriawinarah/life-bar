package win.satria.lifebar.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import win.satria.lifebar.constant.SubtractionType;
import win.satria.lifebar.databinding.ActivityAddBarBinding;

public class AddBarActivity extends AppCompatActivity {

    private ActivityAddBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAddBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Spinner spinSubtractionType = binding.spinnerSubtractionType;
        ArrayAdapter<String> spinSubtractionTypeAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, SubtractionType.ONE_DAY.getNames());
        spinSubtractionTypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinSubtractionType.setAdapter(spinSubtractionTypeAdapter);

        setSupportActionBar(binding.toolbar);
    }
}
