package burp;

import java.time.Duration;

public abstract class Zxvk extends Zxsr implements Zgna {
  private static String[] Zr;
  
  protected Zxvk(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public int ZPo() {
    return this.Za.Zx(this, Zkpa.ZS);
  }
  
  public void Zzv(int paramInt) {
    this.Za.ZM(this, Zkpa.ZS, paramInt);
  }
  
  public String ZPy() {
    String str = this.Za.Zf(this, Zkpa.Zf);
    if (str == null)
      str = Zg1j.Zo(); 
    return str;
  }
  
  public String ZP6() {
    return this.Za.Zf(this, Zkpa.Zx);
  }
  
  public void Zon(String paramString) {
    this.Za.Zi(this, Zkpa.Zx, paramString);
  }
  
  public String ZPl() {
    return this.Za.ZJ(this, Zkpa.Zr);
  }
  
  public void Zou(String paramString) {
    this.Za.Zn(this, Zkpa.Zr, paramString);
  }
  
  public String ZPK() {
    return this.Za.ZJ(this, Zkpa.ZW);
  }
  
  public void Zod(String paramString) {
    this.Za.Zn(this, Zkpa.ZW, paramString);
  }
  
  public boolean ZPw() {
    return this.Za.Zi(this, Zkpa.Zn);
  }
  
  public void ZIx(boolean paramBoolean) {
    this.Za.ZH(this, Zkpa.Zn, paramBoolean);
  }
  
  public int ZPm() {
    return this.Za.Zx(this, Zkpa.ZG);
  }
  
  public void ZzT(int paramInt) {
    this.Za.ZM(this, Zkpa.ZG, paramInt);
  }
  
  public Zl5o ZPd() {
    return this.Za.<Zl5o>ZJ(this, Zkpa.ZK);
  }
  
  public Duration ZPB() {
    return Duration.ofNanos(this.Za.ZL(this, Zkpa.Zv));
  }
  
  public void ZL(Duration paramDuration) {
    String[] arrayOfString = ZBq();
    this.Za.ZV(this, Zkpa.Zv, (paramDuration == null) ? 0L : paramDuration.toNanos());
    if (Zbqc.Zwu() == null)
      Za(new String[4]); 
  }
  
  public static void Za(String[] paramArrayOfString) {
    Zr = paramArrayOfString;
  }
  
  public static String[] ZBq() {
    return Zr;
  }
  
  static {
    if (ZBq() != null)
      Za(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxvk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */