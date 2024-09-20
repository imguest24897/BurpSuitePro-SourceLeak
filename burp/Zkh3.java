package burp;

import net.portswigger.Zkb;

public class Zkh3 {
  private final Zg3s Zh;
  
  private final Zzzt ZB;
  
  private final Zzv6 Zp;
  
  private final Zey9 ZV;
  
  public Zkh3(Zg3s paramZg3s, Zzzt paramZzzt, Zzv6 paramZzv6, Zey9 paramZey9) {
    this.Zh = paramZg3s;
    this.ZB = paramZzzt;
    this.Zp = paramZzv6;
    this.ZV = paramZey9;
  }
  
  public Zma9 ZV(Zmzk paramZmzk, String paramString) {
    Zax zax = new Zax(paramZmzk, Zkb.Zy(paramString));
    byte[] arrayOfByte = this.Zp.ZL(zax);
    return Zm(paramZmzk, arrayOfByte);
  }
  
  public Zma9 ZU(Zmzk paramZmzk, byte[] paramArrayOfbyte) {
    return Zm(paramZmzk, paramArrayOfbyte);
  }
  
  private Zma9 Zm(Zmzk paramZmzk, byte[] paramArrayOfbyte) {
    Zk75 zk75 = new Zk75(paramZmzk.ZJ1(), paramZmzk.ZJO(), paramZmzk.ZJZ(), paramArrayOfbyte);
    Zma9 zma9 = this.Zh.Zd(zk75);
    if (zma9.ZM == Zr42.CONNECTED) {
      Zefx zefx = this.ZV.ZY(paramZmzk, paramArrayOfbyte);
      this.ZB.Zd(zefx.ZF(), paramArrayOfbyte, zma9.ZJ, Zeew.EXTENDER);
    } 
    return zma9;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkh3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */