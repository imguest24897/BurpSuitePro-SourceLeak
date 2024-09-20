package com.fasterxml.Zs;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zm.Zq;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zp.Zt;
import java.io.IOException;

public abstract class Zuy<T> extends Zl<T> {
  private static final long serialVersionUID = 1L;
  
  private static String Zs;
  
  protected Zuy(Class<?> paramClass) {
    super(paramClass);
  }
  
  protected Zuy(Zuy<?> paramZuy) {
    super(paramZuy);
  }
  
  public Zd Zb() {
    return Zd.OtherScalar;
  }
  
  public Boolean Zu(Zyc paramZyc) {
    return Boolean.FALSE;
  }
  
  public Zq Zm() {
    return Zq.CONSTANT;
  }
  
  public Object Zf(Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    return paramZt.ZR(paramZg, paramZyg);
  }
  
  public T ZI(Zg paramZg, Zyg paramZyg, T paramT) throws IOException {
    paramZyg.Zd(this);
    return (T)deserialize(paramZg, paramZyg);
  }
  
  public static void Zb(String paramString) {
    Zs = paramString;
  }
  
  public static String ZL() {
    return Zs;
  }
  
  static {
    if (ZL() == null)
      Zb("q4rD6"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zuy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */