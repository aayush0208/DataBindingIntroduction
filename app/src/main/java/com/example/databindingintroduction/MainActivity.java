package com.example.databindingintroduction;
import android.databinding.DataBindingUtil;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

        import com.example.databindingintroduction.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        //setContentView(R.layout.activity_main);

        binding.showDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student student = new Student("Aayush",12,"6th","B+",R.drawable.fido);
                binding.setStudent(student);
            }
        });
    }

}
