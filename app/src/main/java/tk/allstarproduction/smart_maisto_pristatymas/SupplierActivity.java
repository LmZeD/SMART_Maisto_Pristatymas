package tk.allstarproduction.smart_maisto_pristatymas;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SupplierActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.supplier_page);


    }
    public void receiveOrder(View view) {
        Intent intent = new Intent(this, DriverController.class);
        startActivity(intent);
    }
    public void giveOrder(View view) {
        Intent intent = new Intent(this, DriverController.class);
        startActivity(intent);
    }

}