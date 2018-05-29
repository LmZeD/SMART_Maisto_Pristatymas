package tk.allstarproduction.smart_maisto_pristatymas;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class DispecherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dispatcher_page);
    }

    //stebeti vairuotojo pozicija
    public void showPosition(View view) {
        Intent intent = new Intent(this, DriverController.class);
        startActivity(intent);
    }
    public void confirmOrder(){
        //
    }
}
