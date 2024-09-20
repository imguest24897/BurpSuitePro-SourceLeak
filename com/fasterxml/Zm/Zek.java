package com.fasterxml.Zm;

import com.fasterxml.Zh.Zp;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zor.Zyv;
import com.fasterxml.Zoz.Zia;
import java.io.Serializable;

public class Zek implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected transient Zu<Zp, Zr> ZT = new Zu<>(20, 200);
  
  public Zr ZH(Zk paramZk, Zf<?> paramZf) {
    return Zl(paramZk.Zf(), paramZf);
  }
  
  public Zr Zl(Class<?> paramClass, Zf<?> paramZf) {
    Zp zp = new Zp(paramClass);
    Zr zr = this.ZT.ZM(zp);
    if (zr != null)
      return zr; 
    Zyv zyv = paramZf.Zv(paramClass);
    Zt zt = paramZf.ZK();
    Zia zia = zyv.Zo();
    zr = zt.Zo(zia);
    if (zr == null || !zr.ZA())
      zr = Zr.Zf(paramClass.getSimpleName()); 
    this.ZT.Zm(zp, zr);
    return zr;
  }
  
  protected Object readResolve() {
    return new Zek();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Zek.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */