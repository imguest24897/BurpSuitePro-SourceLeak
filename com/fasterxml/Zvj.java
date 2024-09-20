package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyv;
import com.fasterxml.Zoz.Zp;
import java.io.Closeable;

public class Zvj extends Zy_ {
  protected final Zk Zk;
  
  protected transient Zyv Zd;
  
  protected transient Zp ZG;
  
  protected Zvj(Zg paramZg, String paramString, Zk paramZk) {
    super((Closeable)paramZg, paramString);
    this.Zk = paramZk;
    this.Zd = null;
    this.ZG = null;
  }
  
  protected Zvj(Zf paramZf, String paramString, Zk paramZk) {
    super((Closeable)paramZf, paramString);
    this.Zk = paramZk;
    this.Zd = null;
    this.ZG = null;
  }
  
  protected Zvj(Zg paramZg, String paramString, Zyv paramZyv, Zp paramZp) {
    super((Closeable)paramZg, paramString);
    this.Zk = (paramZyv == null) ? null : paramZyv.Zf();
    this.Zd = paramZyv;
    this.ZG = paramZp;
  }
  
  protected Zvj(Zf paramZf, String paramString, Zyv paramZyv, Zp paramZp) {
    super((Closeable)paramZf, paramString);
    this.Zk = (paramZyv == null) ? null : paramZyv.Zf();
    this.Zd = paramZyv;
    this.ZG = paramZp;
  }
  
  public static Zvj Zz(Zg paramZg, String paramString, Zyv paramZyv, Zp paramZp) {
    return new Zvj(paramZg, paramString, paramZyv, paramZp);
  }
  
  public static Zvj Z_(Zg paramZg, String paramString, Zk paramZk) {
    return new Zvj(paramZg, paramString, paramZk);
  }
  
  public static Zvj ZG(Zf paramZf, String paramString, Zyv paramZyv, Zp paramZp) {
    return new Zvj(paramZf, paramString, paramZyv, paramZp);
  }
  
  public static Zvj Zx(Zf paramZf, String paramString, Zk paramZk) {
    return new Zvj(paramZf, paramString, paramZk);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zvj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */