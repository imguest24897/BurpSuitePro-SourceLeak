package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zg.Zfc;
import com.fasterxml.Zg.Zr;
import com.fasterxml.Zg.Zv;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import java.io.IOException;

final class Zq extends Zi<Zr> {
  private static final long serialVersionUID = 1L;
  
  protected static final Zq ZR = new Zq();
  
  protected Zq() {
    super(Zr.class, Boolean.valueOf(true));
  }
  
  public static Zq Ze() {
    return ZR;
  }
  
  protected Zq(Zq paramZq, boolean paramBoolean1, boolean paramBoolean2) {
    super(paramZq, paramBoolean1, paramBoolean2);
  }
  
  protected Zyo<?> ZZ(boolean paramBoolean1, boolean paramBoolean2) {
    return new Zq(this, paramBoolean1, paramBoolean2);
  }
  
  public Zr Zn(Zg paramZg, Zyg paramZyg) throws IOException {
    Zfc zfc = paramZyg.Zz();
    if (paramZg.Zp()) {
      Zr zr = zfc.Ze();
      Zl(paramZg, paramZyg, zfc, new Zb(), (Zv<?>)zr);
      return zr;
    } 
    try {
      if (paramZg.ZL(Zl.FIELD_NAME))
        return Za(paramZg, paramZyg, zfc, new Zb()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramZg.ZL(Zl.END_OBJECT))
        return zfc.Ze(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (Zr)paramZyg.ZB(Zr.class, paramZg);
  }
  
  public Zr ZJ(Zg paramZg, Zyg paramZyg, Zr paramZr) throws IOException {
    try {
      if (!paramZg.Zp())
        try {
          return !paramZg.ZL(Zl.FIELD_NAME) ? (Zr)paramZyg.ZB(Zr.class, paramZg) : (Zr)ZS(paramZg, paramZyg, paramZr, new Zb());
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (Zr)ZS(paramZg, paramZyg, paramZr, new Zb());
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */