package com.fasterxml.Ze;

import com.fasterxml.Zb.Zm5;
import com.fasterxml.Zo.Zz7;
import com.fasterxml.Zor.Zk;
import java.io.IOException;

public abstract class Z_ {
  private final Zz7 ZW;
  
  private final Class<?> ZS;
  
  private static String[] ZO;
  
  public Z_(Zz7 paramZz7, Class<?> paramClass) {
    this.ZW = paramZz7;
    this.ZS = paramClass;
  }
  
  public Z_(Zz7 paramZz7, Zk paramZk) {
    this.ZW = paramZz7;
    this.ZS = paramZk.Zf();
  }
  
  public Zm5 ZA() {
    return this.ZW.ZD();
  }
  
  public Class<?> Zi() {
    return this.ZS;
  }
  
  public abstract void Zv(Object paramObject1, Object paramObject2) throws IOException;
  
  public boolean Zy(Object paramObject) {
    return paramObject.equals(this.ZW.ZB());
  }
  
  public static void Zu(String[] paramArrayOfString) {
    ZO = paramArrayOfString;
  }
  
  public static String[] ZI() {
    return ZO;
  }
  
  static {
    if (ZI() != null)
      Zu(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Z_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */