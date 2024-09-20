package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zzwv implements Zm4g {
  private final Zmzk Zl;
  
  private final String ZO;
  
  private final byte ZG;
  
  private final Zxs7 ZR;
  
  private final byte[] ZW;
  
  private final byte[] ZX;
  
  private final Zvow Zs;
  
  private final Zvow Zz;
  
  private Zrwf Za;
  
  private byte ZE;
  
  private Zzwv(Zmzk paramZmzk, String paramString, byte paramByte1, Zxs7 paramZxs7, byte paramByte2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, Zvow paramZvow1, Zvow paramZvow2, Zrwf paramZrwf) {
    this.Zl = paramZmzk;
    this.ZO = paramString;
    this.ZG = paramByte1;
    this.ZR = paramZxs7;
    this.ZE = paramByte2;
    this.ZW = paramArrayOfbyte1;
    this.ZX = paramArrayOfbyte2;
    this.Zs = paramZvow1;
    this.Zz = paramZvow2;
    this.Za = paramZrwf;
  }
  
  public int ZR() {
    return 0;
  }
  
  public byte ZU() {
    return this.ZE;
  }
  
  public Zx_5 Zx() {
    switch (Zm5n.ZH[this.Za.ordinal()]) {
      case 1:
        return Zr1w.Za(this.Zl, this.ZO, this.ZG, this.ZW, this.Zs, this.ZR);
      case 2:
        return Zr1w.ZP(this.Zl, this.ZO, this.ZG, this.ZE, this.ZW, this.ZX, this.Zs, this.Zz, this.ZR);
    } 
    Zuh.ZT(false, Zqf.Zk, this.Za.name());
    return null;
  }
  
  public boolean ZA() {
    return true;
  }
  
  public Zrwf ZG() {
    return this.Za;
  }
  
  public static Zzwv ZH(Zmzk paramZmzk, String paramString, byte paramByte, Zvow paramZvow, Zxs7 paramZxs7, byte[] paramArrayOfbyte) {
    return new Zzwv(paramZmzk, paramString, paramByte, paramZxs7, (byte)2, paramArrayOfbyte, null, paramZvow, null, Zrwf.IN_BAND);
  }
  
  public static Zzwv Zw(Zmzk paramZmzk, String paramString, Zxs7 paramZxs7, byte paramByte, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, Zvow paramZvow1, Zvow paramZvow2) {
    return new Zzwv(paramZmzk, paramString, (byte)0, paramZxs7, paramByte, paramArrayOfbyte1, paramArrayOfbyte2, paramZvow1, paramZvow2, Zrwf.DIFFABLE);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzwv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */