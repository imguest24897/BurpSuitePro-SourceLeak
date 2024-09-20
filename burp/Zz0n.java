package burp;

import java.time.Duration;
import java.util.Set;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zl0;
import net.portswigger.Zrzg;
import net.portswigger.Zs4;
import net.portswigger.Zsy;
import net.portswigger.browser.Zjb;
import net.portswigger.browser.service.Zi;

public interface Zz0n {
  Zl0 ZM();
  
  Zrgd ZP();
  
  Zsy ZU();
  
  Zs4 Zc();
  
  Zzxi Zr();
  
  Ztwv Zj();
  
  Zb0h ZD();
  
  Zrzg ZR();
  
  Zi Zo();
  
  Set<Zjb> ZN();
  
  void ZX(long paramLong) throws InterruptedException;
  
  default void ZZ(Duration paramDuration) {
    try {
      ZX(paramDuration.toMillis());
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz0n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */