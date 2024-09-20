package com.fasterxml.Zb;

import java.io.IOException;

public abstract class Zmd extends Zmj implements Zu {
  private static String[] ZI;
  
  public abstract Zmk version();
  
  public abstract <T> T ZB(Zg paramZg, Class<T> paramClass) throws IOException;
  
  public abstract void ZZ(Zf paramZf, Object paramObject) throws IOException;
  
  public abstract <T extends Za> T Zz(Zg paramZg) throws IOException;
  
  public abstract Zg ZF(Za paramZa);
  
  public abstract <T> T Zi(Za paramZa, Class<T> paramClass) throws Zmt;
  
  @Deprecated
  public Zmi ZG() {
    return ZE();
  }
  
  public Zmi ZE() {
    return ZG();
  }
  
  public static void Zh(String[] paramArrayOfString) {
    ZI = paramArrayOfString;
  }
  
  public static String[] Zp() {
    return ZI;
  }
  
  static {
    if (Zp() != null)
      Zh(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zb\Zmd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */