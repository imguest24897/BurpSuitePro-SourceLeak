package com.fasterxml.Ze;

import com.fasterxml.Zga;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zq_;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Zw {
  protected Object Z_;
  
  protected final Zga ZS;
  
  protected LinkedList<Z_> Zx;
  
  protected Zq_ ZJ;
  
  public Zw(Zga paramZga) {
    this.ZS = paramZga;
  }
  
  public void Zp(Zq_ paramZq_) {
    this.ZJ = paramZq_;
  }
  
  public Zga Zh() {
    return this.ZS;
  }
  
  public void Zk(Z_ paramZ_) {
    if (this.Zx == null)
      this.Zx = new LinkedList<>(); 
    this.Zx.add(paramZ_);
  }
  
  public void ZE(Object paramObject) throws IOException {
    this.ZJ.Zp(this.ZS, paramObject);
    this.Z_ = paramObject;
    String[] arrayOfString = Z_.ZI();
    Object object = this.ZS.key;
    if (this.Zx != null) {
      Iterator<Z_> iterator = this.Zx.iterator();
      this.Zx = null;
      while (iterator.hasNext()) {
        ((Z_)iterator.next()).Zv(object, paramObject);
        if (arrayOfString != null)
          break; 
      } 
    } 
  }
  
  public Object Zp() {
    return this.Z_ = this.ZJ.ZF(this.ZS);
  }
  
  public boolean ZX() {
    return (this.Zx != null && !this.Zx.isEmpty());
  }
  
  public Iterator<Z_> Zf() {
    return (this.Zx == null) ? Collections.<Z_>emptyList().iterator() : this.Zx.iterator();
  }
  
  public boolean Zq(Zyg paramZyg) {
    return false;
  }
  
  public String toString() {
    return String.valueOf(this.ZS);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */