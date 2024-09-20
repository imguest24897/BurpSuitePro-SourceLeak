package com.fasterxml.Zor;

import com.fasterxml.Zb.Zmk;
import com.fasterxml.Zb.Zu;
import java.util.Collections;

public abstract class Za implements Zu {
  public abstract String ZW();
  
  public abstract Zmk version();
  
  public Object Zn() {
    return getClass().getName();
  }
  
  public abstract void setupModule(Zs paramZs);
  
  public Iterable<? extends Za> Zx() {
    return Collections.emptyList();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Za.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */