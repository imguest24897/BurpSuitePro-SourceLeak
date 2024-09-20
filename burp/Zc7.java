package burp;

public class Zc7 extends Zni implements Zmwr {
  private final Zl2w Zz;
  
  @Zzvo(1)
  private final Ztu8 Zi;
  
  @Zzvo(2)
  private final String Zt;
  
  @Zzvo(3)
  private final String ZR;
  
  public Zc7(Zl2w paramZl2w, String paramString1, String paramString2) {
    this(paramZl2w, null, paramString1, paramString2);
  }
  
  public Zc7(Zl2w paramZl2w, Ztu8 paramZtu8, String paramString1, String paramString2) {
    this.Zz = paramZl2w;
    this.Zi = paramZtu8;
    this.Zt = paramString1;
    this.ZR = paramString2;
  }
  
  public Zl2w ZhK() {
    return this.Zz;
  }
  
  public Ztu8 ZhB() {
    return this.Zi;
  }
  
  public String Zh4() {
    return this.Zt;
  }
  
  public String Zh1() {
    return this.ZR;
  }
  
  public String toString() {
    return Zzib.ZB(this);
  }
  
  @Zzvo(0)
  private byte ZVu() {
    return this.Zz.persistedForm;
  }
  
  public Zeu4<Zmwr> ZF() {
    return Zr;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zc7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */