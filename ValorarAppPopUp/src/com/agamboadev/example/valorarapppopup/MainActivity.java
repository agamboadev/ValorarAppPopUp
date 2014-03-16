package com.agamboadev.example.valorarapppopup;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Valora la aplicación en Google Play!")
               .setCancelable(false)
               .setPositiveButton("Bien, ir a Google Play", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                        Intent goToMarket = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.agamboadev.jokaldiappfree"));
                        startActivity(goToMarket);
                   }
               })
               .setNegativeButton("Ahora no", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
        	       		dialog.cancel();
                   }
               });
        alert.create();
        alert.show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
