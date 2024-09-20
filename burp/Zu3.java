package burp;

import java.time.Duration;

public abstract class Zu3 extends Zni implements Zgna {
  @Zzvo(1)
  private int ZH;
  
  @Zzvo(7)
  private String Zt;
  
  @Zzvo(8)
  private String Zs;
  
  @Zzvo(2)
  private String ZU;
  
  @Zzvo(3)
  private String Zc;
  
  @Zzvo(4)
  private volatile boolean ZO;
  
  @Zzvo(5)
  private int Zx;
  
  @Zzvo(6)
  private final Zl5o ZR;
  
  @Zzvo(12)
  private long ZD;
  
  protected Zu3(int paramInt, String paramString1, String paramString2, String paramString3) {
    this(paramInt, paramString1, paramString2, paramString3, null);
  }
  
  protected Zu3(int paramInt, String paramString1, String paramString2, String paramString3, Zl5o paramZl5o) {
    this.ZH = paramInt;
    this.Zt = paramString1;
    this.ZU = paramString2;
    this.Zc = paramString3;
    String[] arrayOfString = Zxvk.ZBq();
    this.ZR = paramZl5o;
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public int ZPo() {
    return this.ZH;
  }
  
  public void Zzv(int paramInt) {
    this.ZH = paramInt;
  }
  
  public String ZPy() {
    if (this.Zt == null)
      this.Zt = Zg1j.Zo(); 
    return this.Zt;
  }
  
  public String ZP6() {
    return this.Zs;
  }
  
  public void Zon(String paramString) {
    this.Zs = paramString;
  }
  
  public String ZPl() {
    return this.ZU;
  }
  
  public void Zou(String paramString) {
    this.ZU = paramString;
  }
  
  public String ZPK() {
    return this.Zc;
  }
  
  public void Zod(String paramString) {
    this.Zc = paramString;
  }
  
  public boolean ZPw() {
    return this.ZO;
  }
  
  public void ZIx(boolean paramBoolean) {
    this.ZO = paramBoolean;
  }
  
  public int ZPm() {
    return this.Zx;
  }
  
  public void ZzT(int paramInt) {
    this.Zx = paramInt;
  }
  
  public Zl5o ZPd() {
    return this.ZR;
  }
  
  public Duration ZPB() {
    return Duration.ofNanos(this.ZD);
  }
  
  public void ZL(Duration paramDuration) {
    this.ZD = (paramDuration == null) ? 0L : paramDuration.toNanos();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zu3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */