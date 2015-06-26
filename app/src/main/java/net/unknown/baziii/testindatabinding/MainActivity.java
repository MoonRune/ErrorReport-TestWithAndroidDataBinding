package net.unknown.baziii.testindatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v8.renderscript.RenderScript;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    net.unknown.baziii.testindatabinding.ViewModeBinding binding =
        DataBindingUtil.setContentView(this, R.layout.activity_main);
    binding.setViewmodel(new net.unknown.baziii.testindatabinding.ViewMode("welcome"));


    RenderScript renderScript = RenderScript.create(this);
    ScriptC_saturation   mScript=new ScriptC_saturation(renderScript);
  }

  @Override public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }
}
