package com.appcenterdemorn;

import com.facebook.react.ReactActivity;
//import com.microsoft.appcenter.distribute.Distribute;

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "AppCenterDemoRN";
  }

  // @Override
  // protected void onCreate(Bundle savedInstanceState) {
  //    super();
  //    AppCenter.start(getApplication(), "68ab6b39-7bda-406d-ba86-93547a642b5e", Distribute.class);
  // }

}
