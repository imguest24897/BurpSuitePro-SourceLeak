package burp;

import burp.api.montoya.scanner.audit.insertionpoint.AuditInsertionPointProvider;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.SwingUtilities;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zg_8 {
  private final Zeu1 Zs;
  
  private final AuditInsertionPointProvider Zc;
  
  private final Zskh ZS;
  
  private final Ztwv Zv;
  
  private final Zkl6 Zd;
  
  private final Zzqf ZO;
  
  private final Zr_4 ZP = new Zruo();
  
  public Zg_8(Zeu1 paramZeu1, AuditInsertionPointProvider paramAuditInsertionPointProvider, Zskh paramZskh, Ztwv paramZtwv, Zkl6 paramZkl6, Zzqf paramZzqf) {
    this.Zs = paramZeu1;
    this.Zc = paramAuditInsertionPointProvider;
    this.ZS = paramZskh;
    this.Zv = paramZtwv;
    this.Zd = paramZkl6;
    this.ZO = paramZzqf;
  }
  
  public AuditInsertionPointProvider ZP() {
    return this.Zc;
  }
  
  public List<Zxs7> Zv(IHttpRequestResponse paramIHttpRequestResponse, AtomicInteger paramAtomicInteger) {
    AtomicReference<List<Zxs7>> atomicReference = new AtomicReference();
    Zl8j zl8j = new Zl8j(this, paramIHttpRequestResponse, paramAtomicInteger, atomicReference);
    try {
    
    } catch (InterruptedException interruptedException) {
      throw a(null);
    } 
    Zuh.Zb(!SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    synchronized (zl8j) {
      this.Zv.Zx(zl8j);
      try {
        zl8j.wait();
      } catch (InterruptedException interruptedException) {
        Zah.Zl(interruptedException, Zk_.IGNORED);
      } 
    } 
    return atomicReference.get();
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg_8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */