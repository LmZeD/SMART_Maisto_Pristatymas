package tk.allstarproduction.smart_maisto_pristatymas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showDriverData(View view) {
        Intent intent = new Intent(this, DriverController.class);
        startActivity(intent);
    }

}
