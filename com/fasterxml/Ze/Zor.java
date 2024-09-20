package com.fasterxml.Ze;

import com.fasterxml.Zo.Zzb;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zv6;
import java.io.Serializable;

public class Zor implements Zzb, Serializable {
  private static final long serialVersionUID = 1L;
  
  protected final Zr Zi;
  
  protected final Zk ZT;
  
  protected Zor(Zr paramZr, Zk paramZk) {
    this.Zi = paramZr;
    this.ZT = paramZk;
  }
  
  public static Zor ZA(Zo paramZo) {
    return Zc(paramZo, paramZo.Zp());
  }
  
  public static Zor Zc(Zo paramZo, Zk paramZk) {
    return new Zor(paramZo.ZS(), paramZk);
  }
  
  public static Zor ZF(Zk paramZk) {
    return new Zor(null, paramZk);
  }
  
  public Object Zj(Zyg paramZyg) throws Zy_ {
    throw Zv6.Zk(paramZyg, this.Zi, this.ZT);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */