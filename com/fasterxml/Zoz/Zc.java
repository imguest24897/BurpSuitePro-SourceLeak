package com.fasterxml.Zoz;

import com.fasterxml.Zgy;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zor.Zyb;
import com.fasterxml.Zz_;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public abstract class Zc implements Zo, Serializable {
  private static final long serialVersionUID = 1L;
  
  protected final Zyb Zq;
  
  protected transient List<Zr> Zx;
  
  private static String[] ZU;
  
  protected Zc(Zyb paramZyb) {
    this.Zq = (paramZyb == null) ? Zyb.Zf : paramZyb;
  }
  
  protected Zc(Zc paramZc) {
    this.Zq = paramZc.Zq;
  }
  
  public boolean ZW() {
    return this.Zq.ZT();
  }
  
  public Zyb ZO() {
    return this.Zq;
  }
  
  public Zgy ZN(Zf<?> paramZf, Class<?> paramClass) {
    Zgy zgy1 = paramZf.Zy(paramClass);
    Zgy zgy2 = null;
    Zt zt = paramZf.ZK();
    if (zt != null) {
      Ziz ziz = ZQ();
      if (ziz != null)
        zgy2 = zt.ZY(ziz); 
    } 
    return (zgy1 == null) ? ((zgy2 == null) ? ZK : zgy2) : ((zgy2 == null) ? zgy1 : zgy1.Zx(zgy2));
  }
  
  public Zz_ Zj(Zf<?> paramZf, Class<?> paramClass) {
    Zt zt = paramZf.ZK();
    Ziz ziz = ZQ();
    if (ziz == null)
      return paramZf.Zi(paramClass); 
    Zz_ zz_1 = paramZf.ZU(paramClass, ziz.ZN());
    if (zt == null)
      return zz_1; 
    Zz_ zz_2 = zt.Zp(ziz);
    return (zz_1 == null) ? zz_2 : zz_1.ZI(zz_2);
  }
  
  public List<Zr> ZR(Zf<?> paramZf) {
    List<Zr> list = this.Zx;
    if (list == null) {
      Zt zt = paramZf.ZK();
      if (zt != null) {
        Ziz ziz = ZQ();
        if (ziz != null)
          list = zt.Ze(ziz); 
      } 
      if (list == null)
        list = Collections.emptyList(); 
      this.Zx = list;
    } 
    return list;
  }
  
  public static void Za(String[] paramArrayOfString) {
    ZU = paramArrayOfString;
  }
  
  public static String[] Zu() {
    return ZU;
  }
  
  static {
    if (Zu() == null)
      Za(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */