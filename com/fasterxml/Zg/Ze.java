package com.fasterxml.Zg;

import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zb;
import java.util.Iterator;

public final class Ze extends Zd {
  protected Iterator<Zb> Zu;
  
  protected Zb Za;
  
  public Ze(Zb paramZb, Zd paramZd) {
    super(1, paramZd);
    this.Zu = paramZb.Zn();
  }
  
  public Zl Zt() {
    if (!this.Zu.hasNext()) {
      this.Za = null;
      return Zl.END_ARRAY;
    } 
    this.Zb++;
    this.Za = this.Zu.next();
    return this.Za.ZV();
  }
  
  public Zb ZX() {
    return this.Za;
  }
  
  public Zd ZP() {
    return new Ze(this.Za, this);
  }
  
  public Zd Zw() {
    return new Zx(this.Za, this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Ze.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */