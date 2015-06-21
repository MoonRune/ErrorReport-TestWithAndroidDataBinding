package net.unknown.baziii.testindatabinding;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.TextView;

/**
 * Created by baziii on 15/6/21.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
  private MainActivity activity;
  public MainActivityTest() {
    super(MainActivity.class);
  }
  public MainActivityTest(Class<MainActivity> activityClass) {
    super(activityClass);
  }

  @Override protected void setUp() throws Exception {
    super.setUp();
    activity = getActivity();
  }

  @SmallTest
  public void testWelcome(){
    assertEquals(((TextView) activity.findViewById(R.id.welcome)).getText().toString(),"welcome");
  }
}
