package tk.allstarproduction.smart_maisto_pristatymas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class RoleController extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.roles);
    }

    public void openUser(View view) {
        Intent intent = new Intent(this, UserController.class);
        startActivity(intent);
    }
    public void openDisp(View view) {
        Intent intent = new Intent(this, DispatcherController.class);
        startActivity(intent);
    }
    public void openAdmin(View view) {
        Intent intent = new Intent(this, AdminController.class);
        startActivity(intent);
    }
    public void openDriver(View view) {
        Intent intent = new Intent(this, DriversController.class);
        startActivity(intent);
    }
    public void openSupp(View view) {
        Intent intent = new Intent(this, SupplierController.class);
        startActivity(intent);
    }















}
