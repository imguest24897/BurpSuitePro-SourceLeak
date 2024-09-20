package com.fasterxml.Zor;

import com.fasterxml.Zb.Zm5;
import com.fasterxml.Zb.Zmt;

public abstract class Zym extends Zmt {
  private static final long serialVersionUID = 3L;
  
  private static String Zg;
  
  protected Zym(String paramString, Zm5 paramZm5, Throwable paramThrowable) {
    super(paramString, paramZm5, paramThrowable);
  }
  
  protected Zym(String paramString) {
    super(paramString);
  }
  
  protected Zym(String paramString, Zm5 paramZm5) {
    this(paramString, paramZm5, null);
  }
  
  protected Zym(String paramString, Throwable paramThrowable) {
    this(paramString, null, paramThrowable);
  }
  
  public abstract void Zc(Object paramObject, String paramString);
  
  public static void ZV(String paramString) {
    Zg = paramString;
  }
  
  public static String ZJ() {
    return Zg;
  }
  
  static {
    if (ZJ() == null)
      ZV("GbuCob"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zym.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */