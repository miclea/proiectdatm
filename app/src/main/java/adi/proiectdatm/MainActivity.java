package adi.proiectdatm;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;




public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}


    public void goToLeft(View view) {
        goToUrl("http://10.0.1.16/?button2"); }

    public void goToRight(View view) {
        goToUrl("http://10.0.1.16/?button3");
    }

    public void goToTemp(View view) {
        goToUrl("http://10.0.1.16/?button1");
    }

    public void goToHum(View view) {
        goToUrl("http://10.0.1.16/button1");
    }

    public void goToPic(View view) {
        goToUrl("http://10.0.1.6/image.jpg");
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}
