package net.portswigger.devtools.client.impl;

import java.lang.ref.Cleaner;
import java.util.Objects;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zc3;
import net.portswigger.browser.Zeu;
import net.portswigger.browser.Ztf;
import net.portswigger.browser.service.Za;
import net.portswigger.devtools.client.Zi;
import net.portswigger.devtools.client.impl.connection.Zl;
import net.portswigger.devtools.client.impl.connection.local.Zv;
import net.portswigger.devtools.client.impl.connection.local.process.chrome.Zf;
import net.portswigger.devtools.client.impl.connection.local.process.chrome.binary.Zv;

public class Zxe implements Za {
  private static final Cleaner Zd = Cleaner.create();
  
  private final Zv ZG;
  
  public Zxe(Zv paramZv) {
    this.ZG = paramZv;
  }
  
  public Zeu Za(Zc3 paramZc3) throws Ztf {
    try {
    
    } catch (Ztf ztf) {
      throw a(null);
    } 
    return paramZc3.Zr() ? ZH(paramZc3) : ZI(paramZc3);
  }
  
  private Zxc ZH(Zc3 paramZc3) throws Ztf {
    Zv zv = new Zv(this.ZG);
    Zl zl = zv.ZE(paramZc3);
    try {
      Zxc zxc = new Zxc(paramZc3, zl);
      Objects.requireNonNull(zl);
      Zd.register(zxc, zl::Zd);
      return zxc;
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.RETHROWN);
      zl.Zd();
      Thread.currentThread().interrupt();
      throw new Ztf(interruptedException);
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.RETHROWN);
      zl.Zd();
      throw new Ztf(zi);
    } 
  }
  
  private Z_ ZI(Zc3 paramZc3) throws Ztf {
    Zf zf = new Zf(this.ZG, paramZc3);
    return new Z_(zf);
  }
  
  private static Ztf a(Ztf paramZtf) {
    return paramZtf;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zxe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */