package com.fasterxml;

import burp.Zbqc;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zm5;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zy_;
import java.io.Closeable;

public class Zv_ extends Zy_ {
  protected Class<?> Zl;
  
  private static Zbqc[] ZA;
  
  protected Zv_(Zg paramZg, String paramString) {
    this(paramZg, paramString, (Zk)null);
  }
  
  protected Zv_(Zg paramZg, String paramString, Zm5 paramZm5) {
    super((Closeable)paramZg, paramString, paramZm5);
  }
  
  protected Zv_(Zg paramZg, String paramString, Class<?> paramClass) {
    super((Closeable)paramZg, paramString);
    this.Zl = paramClass;
  }
  
  protected Zv_(Zg paramZg, String paramString, Zk paramZk) {
    super((Closeable)paramZg, paramString);
    this.Zl = Zx.ZB(paramZk);
  }
  
  public static Zv_ ZR(Zg paramZg, Zk paramZk, String paramString) {
    return new Zv_(paramZg, paramString, paramZk);
  }
  
  public static Zv_ ZY(Zg paramZg, Class<?> paramClass, String paramString) {
    return new Zv_(paramZg, paramString, paramClass);
  }
  
  public Zv_ ZA(Zk paramZk) {
    this.Zl = paramZk.Zf();
    return this;
  }
  
  public static void Z_(Zbqc[] paramArrayOfZbqc) {
    ZA = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZH() {
    return ZA;
  }
  
  static {
    if (ZH() != null)
      Z_(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zv_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */