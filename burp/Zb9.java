package burp;

class Zb9 {
  private final Zbnt Zq;
  
  private final Zmzk Zy;
  
  private final String Zi;
  
  private final Zrdu Zv;
  
  private final String ZW;
  
  private Zb9(Zbnt paramZbnt, Zmzk paramZmzk, String paramString1, Zrdu paramZrdu, String paramString2) {
    this.Zq = paramZbnt;
    this.Zy = paramZmzk;
    this.Zi = paramString1;
    this.Zv = paramZrdu;
    this.ZW = paramString2;
  }
  
  byte[] ZH(byte[] paramArrayOfbyte) {
    Zz1p zz1p = Zekx.Zu(this.Zy, paramArrayOfbyte, (byte)2, this.Zq);
    return Zljl.ZO(paramArrayOfbyte, zz1p, this.Zi, this.ZW, (this.Zv != null), false, this.Zv, (this.Zv == null), null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */