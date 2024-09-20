package com.fasterxml.Zo3;

import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zp.Zt;
import com.fasterxml.Zp.Zz;
import com.fasterxml.Zyc;

public class Zb extends Zt {
  private static final long serialVersionUID = 1L;
  
  public Zb(Zk paramZk1, Zz paramZz, String paramString, boolean paramBoolean, Zk paramZk2) {
    super(paramZk1, paramZz, paramString, paramBoolean, paramZk2);
  }
  
  public Zb(Zb paramZb, Zo paramZo) {
    super(paramZb, paramZo);
  }
  
  public Zt Zf(Zo paramZo) {
    return (paramZo == this.ZU) ? this : new Zb(this, paramZo);
  }
  
  public Zyc Zz() {
    return Zyc.EXTERNAL_PROPERTY;
  }
  
  protected boolean Zw() {
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo3\Zb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */