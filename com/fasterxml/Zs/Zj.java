package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zg.Zfc;
import com.fasterxml.Zg.Zh;
import com.fasterxml.Zg.Zv;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import java.io.IOException;

final class Zj extends Zi<Zh> {
  private static final long serialVersionUID = 1L;
  
  protected static final Zj Zh = new Zj();
  
  protected Zj() {
    super(Zh.class, Boolean.valueOf(true));
  }
  
  public static Zj Zj() {
    return Zh;
  }
  
  protected Zj(Zj paramZj, boolean paramBoolean1, boolean paramBoolean2) {
    super(paramZj, paramBoolean1, paramBoolean2);
  }
  
  protected Zyo<?> ZZ(boolean paramBoolean1, boolean paramBoolean2) {
    return new Zj(this, paramBoolean1, paramBoolean2);
  }
  
  public Zh ZU(Zg paramZg, Zyg paramZyg) throws IOException {
    if (paramZg.Zs()) {
      Zfc zfc = paramZyg.Zz();
      Zh zh = zfc.Z_();
      Zl(paramZg, paramZyg, zfc, new Zb(), (Zv<?>)zh);
      return zh;
    } 
    return (Zh)paramZyg.ZB(Zh.class, paramZg);
  }
  
  public Zh ZW(Zg paramZg, Zyg paramZyg, Zh paramZh) throws IOException {
    try {
      if (paramZg.Zs()) {
        Zl(paramZg, paramZyg, paramZyg.Zz(), new Zb(), (Zv<?>)paramZh);
        return paramZh;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (Zh)paramZyg.ZB(Zh.class, paramZg);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */