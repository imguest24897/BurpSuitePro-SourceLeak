package net.portswigger.devtools.client.impl;

import java.util.List;
import net.portswigger.browser.Zdx;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.protocol.domains.CSS;
import net.portswigger.devtools.protocol.domains.DOM;
import net.portswigger.devtools.protocol.domains.DOMSnapshot;
import net.portswigger.devtools.protocol.domains.Emulation;
import net.portswigger.devtools.protocol.domains.Fetch;
import net.portswigger.devtools.protocol.domains.Network;
import net.portswigger.devtools.protocol.domains.Page;
import net.portswigger.devtools.protocol.domains.Security;
import net.portswigger.devtools.protocol.domains.Target;

public class Zp implements Za {
  private static final List<String> Zl = List.of(Target.class.getSimpleName(), Fetch.class.getSimpleName(), Network.class.getSimpleName(), Page.class.getSimpleName(), DOM.class.getSimpleName(), DOMSnapshot.class.getSimpleName(), CSS.class.getSimpleName(), Security.class.getSimpleName(), Emulation.class.getSimpleName());
  
  private final List<String> ZC = Zl;
  
  private static int[] Zr;
  
  public static Zp Zy() {
    return new Zp();
  }
  
  private Zp() {}
  
  public Zp(List<String> paramList) {}
  
  public boolean Zp(Zxf paramZxf) {
    return this.ZC.contains(paramZxf.ZO().name().Zr());
  }
  
  public void Zc(Zdx paramZdx, Zmf paramZmf, Zf<?> paramZf) {
    paramZdx.ZH(Zxx.Zn().ZY(paramZmf, paramZf));
  }
  
  public void ZG(Zdx paramZdx, Zw paramZw, Object paramObject) {
    paramZdx.ZH(Zxx.Zn().ZI(paramZw, paramObject));
  }
  
  public void Zm(Zdx paramZdx, Zxf paramZxf, Throwable paramThrowable) {
    paramZdx.ZH(paramThrowable.toString());
  }
  
  static {
    Zk(new int[5]);
  }
  
  public static void Zk(int[] paramArrayOfint) {
    Zr = paramArrayOfint;
  }
  
  public static int[] ZS() {
    return Zr;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */