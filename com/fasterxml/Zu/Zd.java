package com.fasterxml.Zu;

import com.fasterxml.Zh.Zp;
import com.fasterxml.Zo.Zr;
import com.fasterxml.Zor.Zf;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyv;
import java.io.Serializable;
import java.util.HashMap;

public class Zd implements Zr, Serializable {
  private static final long serialVersionUID = 1L;
  
  protected HashMap<Zp, Zf> Zi = null;
  
  public Zd Zd(Class<?> paramClass, Zf paramZf) {
    if (this.Zi == null)
      this.Zi = new HashMap<>(); 
    this.Zi.put(new Zp(paramClass), paramZf);
    return this;
  }
  
  public Zf ZX(Zk paramZk, Zyc paramZyc, Zyv paramZyv) {
    return (this.Zi == null) ? null : this.Zi.get(new Zp(paramZk.Zf()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zu\Zd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */