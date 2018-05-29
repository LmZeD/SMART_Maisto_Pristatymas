package tk.allstarproduction.smart_maisto_pristatymas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class UserController extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_page);
    }

    public void showDriverData(View view) {
        Intent intent = new Intent(this, DriverController.class);
        startActivity(intent);
    }

    public void logout(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    //perziureti prekes
    public void getItemList() {
    }

    //užsakyti prekes
    public void selectProducts() {
    }

    //apmoketi
    public void pay(View view) {

    choosePayment();

}
    //pasirinkti mokejimo buda
    public void choosePayment()
    {
        Intent intent = new Intent(this, PaymentController.class);
        startActivity(intent);
    }

}
