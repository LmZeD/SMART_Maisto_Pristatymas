package tk.allstarproduction.smart_maisto_pristatymas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;


public class RolesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.roles);
    }

    public void openUser(View view) {
        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);
    }
    public void openDisp(View view) {
        Intent intent = new Intent(this, DispecherActivity.class);
        startActivity(intent);
    }
    public void openAdmin(View view) {
        Intent intent = new Intent(this, AdminActivity.class);
        startActivity(intent);
    }
    public void openDriver(View view) {
        Intent intent = new Intent(this, DriverActivity.class);
        startActivity(intent);
    }
    public void openSupp(View view) {
        Intent intent = new Intent(this, SupplierActivity.class);
        startActivity(intent);
    }















}
