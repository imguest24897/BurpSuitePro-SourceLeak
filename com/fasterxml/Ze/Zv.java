package com.fasterxml.Ze;

import com.fasterxml.Zor.Zi;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyb;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zoz.Ziz;
import java.io.IOException;

public class Zv extends Zi {
  private static final long serialVersionUID = 1L;
  
  protected final Object ZL;
  
  public Zv(Zr paramZr, Zk paramZk, Ziz paramZiz, Object paramObject) {
    super(paramZr, paramZk, null, paramZiz, Zyb.Zo);
    this.ZL = paramObject;
  }
  
  public Object ZI(Zyg paramZyg, Object paramObject) throws Zy_ {
    return paramZyg.ZQ(this.ZL, (Zo)this, paramObject);
  }
  
  public void Zd(Zyg paramZyg, Object paramObject) throws IOException {
    this.ZS.ZL(paramObject, ZI(paramZyg, paramObject));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */