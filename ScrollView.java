package org.insatandroidclub.formation.scrollview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class ScrollView extends Activity {

	 @Override 
     public void onCreate(Bundle savedInstanceState) { 
                super.onCreate(savedInstanceState); 
                setContentView(R.layout.main); 
                TextView view = (TextView) findViewById(R.id.TextView02); 
                String s = ""; 
                 for (int i = 0; i < 100; i++) { 
                         s += "formation.insatAndroidClub"; 
                  } 
                 view.setText(s); 
      } 
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
