package com.fasterxml.Zn;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zk.Zi;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;

public final class Zl extends Zyd<Object> implements Zi {
  protected final Za ZP;
  
  protected final Zyd<Object> ZN;
  
  public Zl(Za paramZa, Zyd<?> paramZyd) {
    this.ZP = paramZa;
    this.ZN = (Zyd)paramZyd;
  }
  
  public void serialize(Object paramObject, Zf paramZf, Zyi paramZyi) throws IOException {
    this.ZN.Zo(paramObject, paramZf, paramZyi, this.ZP);
  }
  
  public void Zo(Object paramObject, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    this.ZN.Zo(paramObject, paramZf, paramZyi, paramZa);
  }
  
  public Class<Object> Zz() {
    return Object.class;
  }
  
  public Zyd<?> Za(Zyi paramZyi, Zo paramZo) throws Zy_ {
    Zyd<Object> zyd = this.ZN;
    if (zyd instanceof Zi)
      zyd = paramZyi.ZR(zyd, paramZo); 
    try {
      if (zyd == this.ZN)
        return this; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return new Zl(this.ZP, zyd);
  }
  
  public Za Zx() {
    return this.ZP;
  }
  
  private static Zy_ a(Zy_ paramZy_) {
    return paramZy_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zn\Zl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */