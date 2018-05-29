package tk.allstarproduction.smart_maisto_pristatymas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_page);
    }
    //ataskaita
    public void showStatistics(View view) {
        Intent intent = new Intent(this, StatisticsController.class);
        startActivity(intent);
    }
}
