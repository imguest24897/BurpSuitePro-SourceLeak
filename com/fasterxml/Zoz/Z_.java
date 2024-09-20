package com.fasterxml.Zoz;

import com.fasterxml.Zh.Zy;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zb;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zy7;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyv;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class Z_ extends Zg implements Serializable {
  private static final long serialVersionUID = 2L;
  
  private static final Class<?> Zg = Object.class;
  
  private static final Class<?> Zu = String.class;
  
  private static final Class<?> Zo = Zb.class;
  
  protected static final Zic Zn = Zic.Zc(null, (Zk)Zy.Zz(String.class), Zio.ZV(Zu));
  
  protected static final Zic Zh = Zic.Zc(null, (Zk)Zy.Zz(boolean.class), Zio.ZV(boolean.class));
  
  protected static final Zic Zs = Zic.Zc(null, (Zk)Zy.Zz(int.class), Zio.ZV(int.class));
  
  protected static final Zic ZC = Zic.Zc(null, (Zk)Zy.Zz(long.class), Zio.ZV(long.class));
  
  protected static final Zic Z_ = Zic.Zc(null, (Zk)Zy.Zz(Object.class), Zio.ZV(Zg));
  
  public Zic Zy(Zy7 paramZy7, Zk paramZk, Zij paramZij) {
    Zic zic = ZC((Zf<?>)paramZy7, paramZk);
    if (zic == null) {
      zic = Zv((Zf<?>)paramZy7, paramZk);
      if (zic == null)
        zic = Zic.ZP(ZZ((Zf<?>)paramZy7, paramZk, paramZij, true)); 
    } 
    return zic;
  }
  
  public Zic ZE(Zyc paramZyc, Zk paramZk, Zij paramZij) {
    Zic zic = ZC((Zf<?>)paramZyc, paramZk);
    if (zic == null) {
      zic = Zv((Zf<?>)paramZyc, paramZk);
      if (zic == null)
        zic = Zic.Zm(ZZ((Zf<?>)paramZyc, paramZk, paramZij, false)); 
    } 
    return zic;
  }
  
  public Zic ZC(Zyc paramZyc, Zk paramZk, Zij paramZij, Zyv paramZyv) {
    return Zic.Zm(Zt((Zf<?>)paramZyc, paramZk, paramZij, paramZyv, false));
  }
  
  public Zic ZL(Zyc paramZyc, Zk paramZk, Zij paramZij) {
    Zic zic = ZC((Zf<?>)paramZyc, paramZk);
    if (zic == null) {
      zic = Zv((Zf<?>)paramZyc, paramZk);
      if (zic == null)
        zic = Zic.Zm(ZZ((Zf<?>)paramZyc, paramZk, paramZij, false)); 
    } 
    return zic;
  }
  
  public Zic Za(Zf<?> paramZf, Zk paramZk, Zij paramZij) {
    Zic zic = ZC(paramZf, paramZk);
    if (zic == null)
      zic = Zic.Zc(paramZf, paramZk, Zv(paramZf, paramZk, paramZij)); 
    return zic;
  }
  
  protected Zh ZZ(Zf<?> paramZf, Zk paramZk, Zij paramZij, boolean paramBoolean) {
    Zia zia = Zv(paramZf, paramZk, paramZij);
    Zz zz = paramZk.Zv() ? paramZf.ZA().Za(paramZf, zia) : paramZf.ZA().ZI(paramZf, zia);
    return ZQ(paramZf, zia, paramZk, paramBoolean, zz);
  }
  
  protected Zh Zt(Zf<?> paramZf, Zk paramZk, Zij paramZij, Zyv paramZyv, boolean paramBoolean) {
    Zia zia = Zv(paramZf, paramZk, paramZij);
    Zz zz = paramZf.ZA().ZH(paramZf, zia, paramZyv);
    return ZQ(paramZf, zia, paramZk, paramBoolean, zz);
  }
  
  protected Zh ZQ(Zf<?> paramZf, Zia paramZia, Zk paramZk, boolean paramBoolean, Zz paramZz) {
    return new Zh(paramZf, paramBoolean, paramZk, paramZia, paramZz);
  }
  
  protected Zic ZC(Zf<?> paramZf, Zk paramZk) {
    Class<int> clazz = paramZk.Zf();
    if (clazz.isPrimitive()) {
      if (clazz == int.class)
        return Zs; 
      if (clazz == long.class)
        return ZC; 
      if (clazz == boolean.class)
        return Zh; 
    } else if (Zx.ZK(clazz)) {
      if (clazz == Zg)
        return Z_; 
      if (clazz == Zu)
        return Zn; 
      if (clazz == Integer.class)
        return Zs; 
      if (clazz == Long.class)
        return ZC; 
      if (clazz == Boolean.class)
        return Zh; 
    } else if (Zo.isAssignableFrom(clazz)) {
      return Zic.Zc(paramZf, paramZk, Zio.ZV(clazz));
    } 
    return null;
  }
  
  protected boolean Zu(Zk paramZk) {
    if (!paramZk.ZH() || paramZk.ZC())
      return false; 
    Class<?> clazz = paramZk.Zf();
    return (Zx.ZK(clazz) && (Collection.class.isAssignableFrom(clazz) || Map.class.isAssignableFrom(clazz)));
  }
  
  protected Zic Zv(Zf<?> paramZf, Zk paramZk) {
    return Zu(paramZk) ? Zic.Zc(paramZf, paramZk, Zv(paramZf, paramZk, (Zij)paramZf)) : null;
  }
  
  protected Zia Zv(Zf<?> paramZf, Zk paramZk, Zij paramZij) {
    return Zio.ZB(paramZf, paramZk, paramZij);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Z_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */