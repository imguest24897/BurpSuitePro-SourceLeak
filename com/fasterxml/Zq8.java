package com.fasterxml;

import com.fasterxml.Zo.Zb;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zor.Zyv;
import java.time.Month;

public class Zq8 extends Zb {
  private static final long serialVersionUID = 1L;
  
  private final boolean ZB;
  
  private static String Zw;
  
  public Zq8(boolean paramBoolean) {
    this.ZB = paramBoolean;
  }
  
  public Zyo<?> ZB(Zyc paramZyc, Zk paramZk, Zyv paramZyv, Zyo<?> paramZyo) {
    return (Zyo<?>)((this.ZB && paramZk.ZP(Month.class)) ? new Zqe(paramZyo) : paramZyo);
  }
  
  public static void ZZ(String paramString) {
    Zw = paramString;
  }
  
  public static String Zw() {
    return Zw;
  }
  
  static {
    if (Zw() != null)
      ZZ("HMWSh"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zq8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */