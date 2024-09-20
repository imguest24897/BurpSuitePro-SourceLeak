package com.fasterxml.Zn;

import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;

public abstract class Zj {
  protected final boolean Zb;
  
  private static String ZJ;
  
  protected Zj(boolean paramBoolean) {
    this.Zb = paramBoolean;
  }
  
  protected Zj(Zj paramZj) {
    this.Zb = paramZj.Zb;
  }
  
  public abstract Zyd<Object> ZO(Class<?> paramClass);
  
  public final Zm Zy(Class<?> paramClass, Zyi paramZyi, Zo paramZo) throws Zy_ {
    Zyd<Object> zyd = paramZyi.Zb(paramClass, paramZo);
    return new Zm(zyd, Zr(paramClass, zyd));
  }
  
  public final Zm ZP(Zk paramZk, Zyi paramZyi, Zo paramZo) throws Zy_ {
    Zyd<Object> zyd = paramZyi.ZW(paramZk, paramZo);
    return new Zm(zyd, Zr(paramZk.Zf(), zyd));
  }
  
  public final Zm Zd(Class<?> paramClass, Zyi paramZyi, Zo paramZo) throws Zy_ {
    Zyd<Object> zyd = paramZyi.Zq(paramClass, paramZo);
    return new Zm(zyd, Zr(paramClass, zyd));
  }
  
  public final Zm ZN(Zk paramZk, Zyi paramZyi, Zo paramZo) throws Zy_ {
    Zyd<Object> zyd = paramZyi.Zo(paramZk, paramZo);
    return new Zm(zyd, Zr(paramZk.Zf(), zyd));
  }
  
  public final Zm ZD(Class<?> paramClass, Zyi paramZyi, Zo paramZo) throws Zy_ {
    Zyd<Object> zyd = paramZyi.ZB(paramClass, paramZo);
    return new Zm(zyd, Zr(paramClass, zyd));
  }
  
  public final Zm Zk(Class<?> paramClass, Zyd<Object> paramZyd) {
    return new Zm(paramZyd, Zr(paramClass, paramZyd));
  }
  
  public final Zm ZT(Zk paramZk, Zyd<Object> paramZyd) {
    return new Zm(paramZyd, Zr(paramZk.Zf(), paramZyd));
  }
  
  public abstract Zj Zr(Class<?> paramClass, Zyd<Object> paramZyd);
  
  public static Zj ZQ() {
    return Zn.ZL;
  }
  
  public static void Zz(String paramString) {
    ZJ = paramString;
  }
  
  public static String Zl() {
    return ZJ;
  }
  
  static {
    if (Zl() != null)
      Zz("fNC0Wb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zn\Zj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */