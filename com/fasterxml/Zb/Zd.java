package com.fasterxml.Zb;

import java.io.IOException;

public abstract class Zd extends IOException {
  private static final long serialVersionUID = 123L;
  
  private static boolean ZU;
  
  protected Zd(String paramString) {
    super(paramString);
  }
  
  protected Zd(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public abstract Zm5 ZD();
  
  public abstract String ZU();
  
  public abstract Object Zn();
  
  public static void ZM(boolean paramBoolean) {
    ZU = paramBoolean;
  }
  
  public static boolean ZR() {
    return ZU;
  }
  
  public static boolean Zm() {
    boolean bool = ZR();
    return !bool;
  }
  
  static {
    if (!Zm())
      ZM(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zb\Zd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */