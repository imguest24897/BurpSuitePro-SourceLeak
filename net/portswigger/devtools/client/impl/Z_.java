package net.portswigger.devtools.client.impl;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import net.portswigger.browser.Ze5;
import net.portswigger.browser.Zeu;
import net.portswigger.browser.Zj9;
import net.portswigger.browser.Zo;
import net.portswigger.devtools.client.impl.connection.local.process.chrome.Zf;

public final class Z_ implements Zeu {
  private final Ze5 Zj;
  
  private final Zf Zd;
  
  private final Zmj Zo;
  
  public Z_(Zf paramZf) {
    this.Zj = new Zo9(paramZf.Zv().Z_().ZT());
    this.Zd = Objects.<Zf>requireNonNull(paramZf);
    this.Zo = new Zmj(paramZf.ZB());
    this.Zd.ZS(this::ZP);
  }
  
  public Ze5 ZR() {
    return this.Zj;
  }
  
  public Zj9 ZM() {
    throw new UnsupportedOperationException();
  }
  
  public boolean Zo() {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return !this.Zd.Zl();
  }
  
  public boolean ZK(long paramLong, TimeUnit paramTimeUnit) throws InterruptedException {
    return this.Zd.ZM(paramLong, paramTimeUnit);
  }
  
  public Zo Zq() {
    return this.Zo;
  }
  
  public void ZP() {
    this.Zd.ZU();
    this.Zo.Zp();
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Z_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */