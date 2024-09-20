package burp;

import java.io.IOException;
import java.net.InetAddress;
import net.portswigger.Zah;
import net.portswigger.Zby;
import net.portswigger.Zgn;
import net.portswigger.Zk_;
import net.portswigger.Zng;
import net.portswigger.Zqf;
import net.portswigger.Zsg;
import net.portswigger.Zuh;

public class Zzvf {
  private final Zby ZE;
  
  private final Zem0 ZI;
  
  private final Zmx0 ZM;
  
  public Zzvf(Zby paramZby, Zem0 paramZem0, Zmx0 paramZmx0) {
    this.ZE = paramZby;
    this.ZI = paramZem0;
    this.ZM = paramZmx0;
  }
  
  Zgn ZI(Zgdu paramZgdu) throws IOException {
    Zzgc zzgc = new Zzgc(this);
    Zzqi zzqi = paramZgdu.ZF();
    Runnable runnable = this::lambda$build$0;
    Zng zng = (new Zng(zzqi.ZQ, (Zsg)zzgc)).ZM(runnable);
    try {
      switch (Zlfq.ZH[zzqi.Zj.ordinal()]) {
        case 1:
          return zng.ZP(InetAddress.getByAddress(new byte[] { 0, 0, 0, 0 })).Zz();
        case 2:
          return zng.ZP(InetAddress.getByName(zzqi.Zf)).Zz();
        default:
          Zuh.ZT(false, Zqf.Zk, zzqi.Zj.toString());
          break;
        case 3:
          break;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return zng.Zz();
  }
  
  private void lambda$build$0() {
    try {
      Ztyh.ZR(this.ZI.<Zskh>Zr(Zskh.class));
    } catch (Zen0 zen0) {
      Zah.Zl(zen0, Zk_.IGNORED);
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzvf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */