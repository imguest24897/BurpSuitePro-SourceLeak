package com.fasterxml.Zn;

import com.fasterxml.Zb.Zj;
import com.fasterxml.Zgk;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zys;

public final class Zt {
  public final Zk Zn;
  
  public final Zj Zd;
  
  public final Zys<?> Zx;
  
  public final Zyd<Object> Z_;
  
  public final boolean Zi;
  
  protected Zt(Zk paramZk, Zj paramZj, Zys<?> paramZys, Zyd<?> paramZyd, boolean paramBoolean) {
    this.Zn = paramZk;
    this.Zd = paramZj;
    this.Zx = paramZys;
    this.Z_ = (Zyd)paramZyd;
    this.Zi = paramBoolean;
  }
  
  public static Zt ZR(Zk paramZk, Zr paramZr, Zys<?> paramZys, boolean paramBoolean) {
    String str = (paramZr == null) ? null : paramZr.Zb();
    Zgk zgk = (str == null) ? null : new Zgk(str);
    return new Zt(paramZk, (Zj)zgk, paramZys, null, paramBoolean);
  }
  
  public Zt Zb(Zyd<?> paramZyd) {
    return new Zt(this.Zn, this.Zd, this.Zx, paramZyd, this.Zi);
  }
  
  public Zt ZB(boolean paramBoolean) {
    return (paramBoolean == this.Zi) ? this : new Zt(this.Zn, this.Zd, this.Zx, this.Z_, paramBoolean);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zn\Zt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */