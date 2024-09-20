package burp;

import java.util.Objects;

class Zxst extends Zxsr implements Zrb5 {
  Zxst(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public String ZJ() {
    int[] arrayOfInt = Zn9.Zs();
    String str = this.Za.Zz(this, Zklx.ZA);
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[4]); 
    return Objects.<String>requireNonNullElse(str, "");
  }
  
  public void Ze(String paramString) {
    this.Za.ZR(this, Zklx.ZA, paramString);
  }
  
  public Zeu4<Zrb5> ZF() {
    return Zrb5.Zh;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxst.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */