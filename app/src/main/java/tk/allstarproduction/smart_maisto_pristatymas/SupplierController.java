package tk.allstarproduction.smart_maisto_pristatymas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SupplierController extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.supplier_page);


    }
    public void showOrders(View view) {
        Intent intent = new Intent(this, DriverController.class);
        startActivity(intent);
    }
    public void confirmOrder(View view) {
        Intent intent = new Intent(this, OrderController.class);
        startActivity(intent);
    }

}
