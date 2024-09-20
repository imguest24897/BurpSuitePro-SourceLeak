package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zg.Zfc;
import com.fasterxml.Zg.Zh;
import com.fasterxml.Zg.Zr;
import com.fasterxml.Zg.Zv;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zor.Zb;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zp.Zt;
import java.io.IOException;

public class Za extends Zi<Zb> {
  private static final Za ZD = new Za();
  
  protected Za() {
    super(Zb.class, null);
  }
  
  protected Za(Za paramZa, boolean paramBoolean1, boolean paramBoolean2) {
    super(paramZa, paramBoolean1, paramBoolean2);
  }
  
  protected Zyo<?> ZZ(boolean paramBoolean1, boolean paramBoolean2) {
    return new Za(this, paramBoolean1, paramBoolean2);
  }
  
  public static Zyo<? extends Zb> ZX(Class<?> paramClass) {
    return (Zyo<? extends Zb>)((paramClass == Zr.class) ? Zq.Ze() : ((paramClass == Zh.class) ? Zj.Zj() : ZD));
  }
  
  public Zb Zc(Zyg paramZyg) {
    return (Zb)paramZyg.Zz().ZW();
  }
  
  public Object Zk(Zyg paramZyg) {
    return null;
  }
  
  public Zb Za(Zg paramZg, Zyg paramZyg) throws IOException {
    Zb zb = new Zb();
    Zfc zfc = paramZyg.Zz();
    try {
      switch (paramZg.Zy()) {
        case 1:
          return (Zb)Zl(paramZg, paramZyg, zfc, zb, (Zv<?>)zfc.Ze());
        case 2:
          return (Zb)zfc.Ze();
        case 3:
          return (Zb)Zl(paramZg, paramZyg, zfc, zb, (Zv<?>)zfc.Z_());
        case 5:
          return (Zb)Za(paramZg, paramZyg, zfc, zb);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return ZJ(paramZg, paramZyg);
  }
  
  public Boolean Zu(Zyc paramZyc) {
    return this.ZY;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Za.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */