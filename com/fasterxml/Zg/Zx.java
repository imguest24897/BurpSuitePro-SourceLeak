package com.fasterxml.Zg;

import com.fasterxml.Zb.Ze;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zb;
import java.util.Iterator;
import java.util.Map;

public final class Zx extends Zd {
  protected Iterator<Map.Entry<String, Zb>> Zs;
  
  protected Map.Entry<String, Zb> ZS;
  
  protected boolean ZZ;
  
  public Zx(Zb paramZb, Zd paramZd) {
    super(2, paramZd);
    this.Zs = paramZb.Zj();
    this.ZZ = true;
  }
  
  public Zl Zt() {
    if (this.ZZ) {
      if (!this.Zs.hasNext()) {
        this.Zg = null;
        this.ZS = null;
        return Zl.END_OBJECT;
      } 
      this.Zb++;
      this.ZZ = false;
      this.ZS = this.Zs.next();
      this.Zg = (this.ZS == null) ? null : this.ZS.getKey();
      return Zl.FIELD_NAME;
    } 
    this.ZZ = true;
    return ((Zb)this.ZS.getValue()).ZV();
  }
  
  public Zb ZX() {
    return (this.ZS == null) ? null : this.ZS.getValue();
  }
  
  public Zd ZP() {
    return new Ze(ZX(), this);
  }
  
  public Zd Zw() {
    return new Zx(ZX(), this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Zx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */