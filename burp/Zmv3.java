package burp;

public class Zmv3 implements Zlza {
  final Zrdu Zb;
  
  final String Zl;
  
  final String ZL;
  
  final int ZW;
  
  final int Zs;
  
  final int ZO;
  
  final int Zu;
  
  static Zmv3 Zp(Zt8g paramZt8g) {
    return new Zmv3(paramZt8g.ZbQ(), paramZt8g.Zns(), paramZt8g.Zbn(), paramZt8g.Zba(), paramZt8g.ZbZ(), paramZt8g.Zbl(), paramZt8g.Zb2());
  }
  
  static Zmv3 ZR(Zmv3 paramZmv3, String paramString1, String paramString2) {
    int i = paramZmv3.ZW;
    int j = i + paramString1.length();
    int k = paramZmv3.ZO + j - paramZmv3.Zs + ((paramZmv3.ZO == paramZmv3.Zs) ? 1 : 0);
    int m = k + paramString2.length();
    return new Zmv3(paramZmv3.Zb, paramString1, paramString2, i, j, k, m);
  }
  
  static Zmv3 Zl(String paramString1, String paramString2, int paramInt) {
    int i = paramInt + paramString1.length();
    int j = i + 1;
    int k = j + paramString2.length();
    return new Zmv3(Zrdu.BODY_PARAM_URL_ENCODED, paramString1, paramString2, paramInt, i, j, k);
  }
  
  static Zmv3 Zp(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return new Zmv3(Zrdu.BODY_PARAM_MULTIPART, paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private Zmv3(Zrdu paramZrdu, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.Zb = paramZrdu;
    this.Zl = paramString1;
    this.ZL = paramString2;
    this.ZW = paramInt1;
    this.Zs = paramInt2;
    this.ZO = paramInt3;
    this.Zu = paramInt4;
  }
  
  public String Zp() {
    return this.Zl;
  }
  
  public String ZP() {
    return this.ZL;
  }
  
  public Zb6u Zc() {
    return new Zb6u(Zeup.BODY_PARAM, this.Zl, this.ZL);
  }
  
  public String toString() {
    return this.Zl + "=" + this.Zl;
  }
  
  Zmv3 ZV(int paramInt) {
    return new Zmv3(this.Zb, this.Zl, this.ZL, this.ZW + paramInt, this.Zs + paramInt, this.ZO + paramInt, this.Zu + paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmv3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */