package net.unknown.baziii.testindatabinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import net.unknown.baziii.testindatabinding.BR;

/**
 * Created by baziii on 15/6/21.
 */
public class ViewMode extends BaseObservable {
  private String helloworld;

  @Bindable public String getHelloworld() {
    return helloworld;
  }

  public void setHelloworld(String helloworld) {
    this.helloworld = helloworld;
    notifyPropertyChanged(BR.helloworld);
  }

  public ViewMode(String helloworld) {
    this.helloworld = helloworld;
  }
}
