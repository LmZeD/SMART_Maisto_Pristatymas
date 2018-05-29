package tk.allstarproduction.smart_maisto_pristatymas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

import android.view.View;

public class DriversController extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.driver_page);
    }

    public void showPosition(View view) {
        Intent intent = new Intent(this, DriverController.class);
        startActivity(intent);
    }
    //pristatyti prekes
    public void confirmArrival(View view) {
        Intent intent = new Intent(this, DriverController.class);
        startActivity(intent);
    }



}
