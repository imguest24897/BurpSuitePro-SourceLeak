package com.fasterxml.Zd;

import com.fasterxml.Zj.Zf;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zoz.Zia;
import com.fasterxml.Zoz.Zik;
import java.util.List;

public class Zn {
  private static boolean ZM;
  
  public static String[] Zr(Class<?> paramClass) {
    return Zs.ZQ().Zl(paramClass);
  }
  
  public static Zik ZK(Zia paramZia, Zt paramZt, Zf<?> paramZf, List<String> paramList) {
    return (new Zc(paramZia, paramZt, paramZf)).Zr(paramList);
  }
  
  public static void Zj(boolean paramBoolean) {
    ZM = paramBoolean;
  }
  
  public static boolean ZB() {
    return ZM;
  }
  
  public static boolean Zx() {
    boolean bool = ZB();
    return !bool;
  }
  
  static {
    if (!Zx())
      Zj(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zd\Zn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */