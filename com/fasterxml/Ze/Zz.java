package com.fasterxml.Ze;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zo.Zv;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zq_;
import com.fasterxml.Zys;
import java.io.IOException;
import java.io.Serializable;

public class Zz implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected final Zk ZI;
  
  public final Zr ZV;
  
  public final Zys<?> Zj;
  
  public final Zq_ ZL;
  
  protected final Zyo<Object> Zl;
  
  public final Zv Zm;
  
  protected Zz(Zk paramZk, Zr paramZr, Zys<?> paramZys, Zyo<?> paramZyo, Zv paramZv, Zq_ paramZq_) {
    this.ZI = paramZk;
    this.ZV = paramZr;
    this.Zj = paramZys;
    this.ZL = paramZq_;
    this.Zl = (Zyo)paramZyo;
    this.Zm = paramZv;
  }
  
  public static Zz ZK(Zk paramZk, Zr paramZr, Zys<?> paramZys, Zyo<?> paramZyo, Zv paramZv, Zq_ paramZq_) {
    return new Zz(paramZk, paramZr, paramZys, paramZyo, paramZv, paramZq_);
  }
  
  public Zyo<Object> ZP() {
    return this.Zl;
  }
  
  public Zk ZS() {
    return this.ZI;
  }
  
  public boolean ZI() {
    return this.Zj.Zp();
  }
  
  public boolean ZW(String paramString, Zg paramZg) {
    return this.Zj.Zg(paramString, paramZg);
  }
  
  public Object ZB(Zg paramZg, Zyg paramZyg) throws IOException {
    return this.Zl.deserialize(paramZg, paramZyg);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */