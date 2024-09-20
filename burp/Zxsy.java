package burp;

public abstract class Zxsy extends Zxsr implements Zzem {
  private static int Zq;
  
  public Zxsy(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public int ZB() {
    return this.Za.Zx(this, Zklw.ZQ);
  }
  
  public Ztkk Zg() {
    return this.Za.<Ztkk>ZJ(this, Zklw.ZX);
  }
  
  public byte ZaP() {
    return this.Za.ZL(this, Zklw.ZN);
  }
  
  public void ZB(byte paramByte) {
    this.Za.Zc(this, Zklw.ZN, paramByte);
  }
  
  public String ZIx() {
    return this.Za.ZJ(this, Zklw.Zu);
  }
  
  public void Zxg(String paramString) {
    this.Za.Zn(this, Zklw.Zu, paramString);
  }
  
  public boolean Zi() {
    return this.Za.Zi(this, Zklw.ZM);
  }
  
  public void Ze(boolean paramBoolean) {
    this.Za.ZH(this, Zklw.ZM, paramBoolean);
  }
  
  public Zeu4<? extends Zzem> ZF() {
    return Zp;
  }
  
  public static void ZA(int paramInt) {
    Zq = paramInt;
  }
  
  public static int ZH() {
    return Zq;
  }
  
  public static int ZR() {
    int i = ZH();
    return (i == 0) ? 62 : 0;
  }
  
  static {
    if (ZR() != 0)
      ZA(97); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxsy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */