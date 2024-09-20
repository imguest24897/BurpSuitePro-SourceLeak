package burp;

import net.portswigger.Zkb;

public class Zgp3 implements Zm3k {
  private final long Zd;
  
  private final Zgsg ZW;
  
  private final int Zs;
  
  private final String ZB;
  
  private final byte[] Zb;
  
  private final Zmzk Zy;
  
  private final Zstu Zm;
  
  private final Zgsq ZF;
  
  private Zstu Zu;
  
  public Zgp3(Zgsg paramZgsg, int paramInt, String paramString1, String paramString2, Zmzk paramZmzk, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, Zr_4 paramZr_4, long paramLong, Zgsq paramZgsq) {
    this.Zd = paramLong;
    this.ZW = paramZgsg;
    this.Zs = paramInt;
    this.ZB = paramString1;
    this.Zb = Zkb.Zy(paramString2);
    this.Zy = paramZmzk;
    this.Zm = (paramArrayOfbyte1 == null) ? null : paramZr_4.ZZ(paramArrayOfbyte1);
    this.Zu = (paramArrayOfbyte2 == null) ? null : paramZr_4.ZZ(paramArrayOfbyte2);
    this.ZF = paramZgsq;
  }
  
  public long Zg() {
    return this.Zd;
  }
  
  public Zgsg ZA() {
    return this.ZW;
  }
  
  public int ZV() {
    return this.Zs;
  }
  
  public String Zv() {
    return this.ZB;
  }
  
  public byte[] ZF() {
    return this.Zb;
  }
  
  public Zmzk ZJ() {
    return this.Zy;
  }
  
  public Zstu ZH() {
    return this.Zm;
  }
  
  public Zstu Zb() {
    return this.Zu;
  }
  
  public void Zx(Zstu paramZstu) {
    this.Zu = paramZstu;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgp3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */