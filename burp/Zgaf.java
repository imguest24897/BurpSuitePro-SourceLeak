package burp;

import java.util.Collections;
import java.util.List;
import net.portswigger.Zdo;

public class Zgaf {
  private static Zbqc[] Zd;
  
  public static Zsqx<Zrdb> ZT(Zmzk paramZmzk, List<Zgaq> paramList) {
    boolean bool;
    int i = 0;
    StringBuilder stringBuilder = new StringBuilder();
    Zbqc[] arrayOfZbqc = Za();
    for (Zgaq zgaq : paramList) {
      i |= zgaq.Zy;
      stringBuilder.append(zgaq.ZF());
      if (arrayOfZbqc != null)
        break; 
    } 
    if ((i & 0x4) != 0) {
      bool = true;
    } else if ((i & 0x8) != 0) {
      bool = true;
    } else if ((i & 0x1) != 0) {
      bool = true;
    } else if ((i & 0x2) != 0) {
      bool = true;
    } else {
      bool = true;
    } 
    return new Zx_5(Zzu2.TLS_CERTIFICATE, (byte)0, i, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.CERTIFICATE_DETAILS, stringBuilder.toString()) }), Collections.emptyList(), (byte)3, bool, paramZmzk, Zdo.Za, null);
  }
  
  public static void Zw(Zbqc[] paramArrayOfZbqc) {
    Zd = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Za() {
    return Zd;
  }
  
  static {
    if (Za() != null)
      Zw(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgaf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */