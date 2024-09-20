package burp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zsbk implements Zrmw {
  final List<Zzi8> Zd = new ArrayList<>();
  
  final Zsm9 Zz;
  
  final Zemb ZL;
  
  Zsbk(Zemb paramZemb, Zsm9 paramZsm9) {}
  
  public void Zo(Zzi8 paramZzi8) {
    try {
      if (this.Zd.contains(paramZzi8))
        return; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      this.Zz.ZH(paramZzi8);
      this.Zd.add(paramZzi8);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
    } 
  }
  
  public void ZV(Zb0p paramZb0p) {
    Zxyc zxyc = new Zxyc(this.ZL.Zt, this.ZL.ZG, this.ZL.Zu, this.ZL.ZP);
    paramZb0p.ZC(zxyc);
  }
  
  public void Zu(Zsnv paramZsnv) {
    Zxyc zxyc = new Zxyc(this.ZL.Zt, this.ZL.ZG, this.ZL.Zu, this.ZL.ZP);
    paramZsnv.ZC(zxyc);
  }
  
  public void ZD(Zzj5 paramZzj5) {
    Zxyc zxyc = new Zxyc(this.ZL.Zt, this.ZL.ZG, this.ZL.Zu, this.ZL.ZP);
    paramZzj5.ZC(zxyc);
  }
  
  public void Zj(Zrkg paramZrkg) {
    paramZrkg.ZR(this.ZL.Zt, this.ZL.ZG, this.ZL.Zu, this.ZL.ZP);
  }
  
  public void ZM(Zlhn paramZlhn) {
    try {
      paramZlhn.Zw(this.ZL.Zt);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsbk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */