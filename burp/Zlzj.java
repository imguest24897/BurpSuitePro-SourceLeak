package burp;

import burp.api.montoya.scanner.ScanCheck;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.SwingUtilities;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zlzj {
  private final Zeu1 Zc;
  
  private final Zbnt ZS;
  
  private final Zr_4 Zb;
  
  private final ScanCheck ZT;
  
  private final Zskh ZV;
  
  private final Ztwv Zm;
  
  private final int Zy;
  
  private final Zkl6 ZF;
  
  private final Zmk0 ZZ;
  
  private final Ztx8 ZR;
  
  private final Zzqf ZA;
  
  private final Zz3j Zt;
  
  private final Zm6x ZG;
  
  private static int Zx;
  
  public Zlzj(Zeu1 paramZeu1, ScanCheck paramScanCheck, Zbnt paramZbnt, Zskh paramZskh, Ztwv paramZtwv, Zr_4 paramZr_4, int paramInt, Zkl6 paramZkl6, Zmk0 paramZmk0, Ztx8 paramZtx8, Zzqf paramZzqf, Zz3j paramZz3j, Zm6x paramZm6x) {
    this.ZA = paramZzqf;
    this.Zc = paramZeu1;
    this.ZT = paramScanCheck;
    this.ZS = paramZbnt;
    this.ZV = paramZskh;
    this.Zm = paramZtwv;
    this.Zb = paramZr_4;
    this.Zy = paramInt;
    this.ZF = paramZkl6;
    this.ZZ = paramZmk0;
    this.ZR = paramZtx8;
    this.Zt = paramZz3j;
    this.ZG = paramZm6x;
  }
  
  public ScanCheck Zr() {
    return this.ZT;
  }
  
  public void Zo(Ze3n paramZe3n, Zz1i paramZz1i, Zgq<Zrdb> paramZgq, Zmfj paramZmfj) {
    ZK(paramZe3n, paramZz1i, false, paramZgq, paramZmfj, null, null, null, -1);
  }
  
  public void Za(Ze3n paramZe3n, Zz1i paramZz1i, Zgq<Zrdb> paramZgq, Zmfj paramZmfj, Zxs7 paramZxs7, Zo1 paramZo1, Ztpx paramZtpx, int paramInt) {
    ZK(paramZe3n, paramZz1i, true, paramZgq, paramZmfj, paramZxs7, paramZo1, paramZtpx, paramInt);
  }
  
  private void ZK(Ze3n paramZe3n, Zz1i paramZz1i, boolean paramBoolean, Zgq<Zrdb> paramZgq, Zmfj paramZmfj, Zxs7 paramZxs7, Zo1 paramZo1, Ztpx paramZtpx, int paramInt) {
    Zleg zleg = Zleg.Zn(paramZz1i, paramZe3n, paramZtpx, this.ZZ.ZO(paramInt), this.Zt);
    Zl_0 zl_0 = new Zl_0(this, paramBoolean, paramZo1, zleg, paramZmfj, paramZxs7, paramZe3n, paramZgq);
    try {
    
    } catch (InterruptedException interruptedException) {
      throw a(null);
    } 
    Zuh.Zb(!SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    synchronized (zl_0) {
      this.Zm.Zx(zl_0);
      try {
        zl_0.wait();
      } catch (InterruptedException interruptedException) {
        Zah.Zl(interruptedException, Zk_.IGNORED);
      } 
    } 
    Optional<Zsc2> optional = zleg.Za();
    try {
      if (optional.isPresent())
        throw (Zsc2)optional.get(); 
    } catch (InterruptedException interruptedException) {
      throw a(null);
    } 
  }
  
  public Zl4m ZL(Zrdb paramZrdb1, Zrdb paramZrdb2) {
    AtomicReference<Zl4m> atomicReference = new AtomicReference<>(Zl4m.ZX);
    Zt23 zt23 = new Zt23(this, paramZrdb1, paramZrdb2, atomicReference);
    try {
    
    } catch (InterruptedException interruptedException) {
      throw a(null);
    } 
    Zuh.Zb(!SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    synchronized (zt23) {
      this.Zm.Zx(zt23);
      try {
        zt23.wait();
      } catch (InterruptedException interruptedException) {
        Zah.Zl(interruptedException, Zk_.IGNORED);
      } 
    } 
    return atomicReference.get();
  }
  
  public static void ZR(int paramInt) {
    Zx = paramInt;
  }
  
  public static int ZZ() {
    return Zx;
  }
  
  public static int ZY() {
    int i = ZZ();
    try {
      if (i == 0)
        return 50; 
    } catch (Zsc2 zsc2) {
      throw a(null);
    } 
    return 0;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    if (ZY() == 0)
      ZR(7); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlzj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */