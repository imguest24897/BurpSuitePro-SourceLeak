package net.portswigger.devtools.client.impl;

import java.util.List;
import net.portswigger.browser.Zdx;
import net.portswigger.devtools.client.Zf;

public interface Zxi {
  void Zp(Zdx paramZdx);
  
  void ZI(Zw paramZw, Object paramObject);
  
  void Zo(Zmf paramZmf, Zf<?> paramZf);
  
  void Zl(Zxf paramZxf, Throwable paramThrowable);
  
  void ZP();
  
  static Zxi ZC() {
    return new Zox(Zz());
  }
  
  private static List<Za> Zz() {
    return List.of(new Zi(), new Zl(), new Zn(), Zp.Zy());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zxi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */