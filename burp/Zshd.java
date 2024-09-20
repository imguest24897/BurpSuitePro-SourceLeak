package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zli;
import net.portswigger.Zmw;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zshd implements Zbx0 {
  private final Zl44 ZY;
  
  private final Zmzk Zb;
  
  private final byte[] ZM;
  
  private final Zbnt Za;
  
  private final Zerg Zr;
  
  private final Zgb6 ZE;
  
  private final Zskh Zw;
  
  private boolean ZI;
  
  Zshd(Zl44 paramZl44, Zerg paramZerg, Zgb6 paramZgb6, Zskh paramZskh, Zbnt paramZbnt, Zlit paramZlit) {
    Zuh.Zb((paramZerg != null), Zqf.Zx);
    this.ZY = paramZl44;
    this.Zr = paramZerg;
    this.ZE = paramZgb6;
    this.Zw = paramZskh;
    this.Za = paramZbnt;
    this.Zb = paramZlit.Zdz();
    this.ZM = new byte[(paramZlit.ZdH()).length];
    System.arraycopy(paramZlit.ZdH(), 0, this.ZM, 0, this.ZM.length);
    Zmw.Zq(this.ZM);
  }
  
  public void Zx() {
    try {
      this.Zr.ZA().Zo(this, null);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    try {
      this.Zr.ZJ().Zu(this);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    try {
      this.Zr.Zm().ZR(this);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public void ZP() {
    this.ZI = true;
  }
  
  public boolean Zp(Zll9 paramZll9) {
    String str = Zl41.ZU();
    try {
      if (this.ZI)
        return true; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      Zstu zstu = paramZll9.ZoO();
      if (zstu != null) {
        Ztdi ztdi = this.Zr.ZA().ZZ();
        Zs68 zs68 = Zbwc.Zt((Zlit)null, zstu, Zt0k.HTML_ANALYSIS, this.Za);
        List<Zsq8> list = Zm46.Zl(paramZll9.ZlL(), zs68, zstu, null, ztdi, this.Za, this.ZE.ZU0());
        boolean bool = false;
        ArrayList<Zkv5> arrayList = new ArrayList();
        for (Zsq8 zsq8 : list) {
          try {
            if (!zsq8.ZZ.Zdz().equals(this.Zb))
              continue; 
          } catch (Exception exception) {
            throw a(null);
          } 
          if (Zli.ZC(zsq8.ZZ.ZdH(), this.ZM, false, 0)) {
            bool = true;
            try {
              if (zsq8.ZJ != -1)
                ZG(arrayList, zsq8.ZJ, zsq8.Zv); 
            } catch (Exception exception) {
              throw a(null);
            } 
          } 
          if (str != null)
            break; 
        } 
        try {
          if (bool)
            this.ZY.Zv(new Zmjs(paramZll9, arrayList)); 
        } catch (Exception exception) {
          throw a(null);
        } 
        Ztyh.Zc();
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } catch (OutOfMemoryError outOfMemoryError) {
      Zah.Zl(outOfMemoryError, Zk_.COMMON_RUNTIME_FAILURE);
      Ztyh.ZR(this.Zw);
    } 
    return this.ZI;
  }
  
  public boolean Zi(Zeew paramZeew, Zll9 paramZll9) {
    Zuh.Zb(false, Zqf.ZC);
    return false;
  }
  
  private static void ZG(List<Zkv5> paramList, int paramInt1, int paramInt2) {
    String str = Zl41.ZU();
    for (Zkv5 zkv5 : paramList) {
      if (zkv5.startOffset() == paramInt1 && zkv5.endOffset() == paramInt2)
        return; 
      if (str != null)
        break; 
    } 
    paramList.add(new Zlsh(paramInt1, paramInt2));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zshd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */