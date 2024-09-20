package burp;

import java.awt.Window;

public class Zm6c implements Zvoj {
  private final Zr1m Zj;
  
  private final String[] ZP;
  
  private final Zedo Zm;
  
  private final Zxwy Zr;
  
  public Zm6c(Zr1m paramZr1m, String[] paramArrayOfString, Zedo paramZedo, Zxwy paramZxwy) {
    this.Zj = paramZr1m;
    int i = Zlp_.Zd();
    this.ZP = paramArrayOfString;
    this.Zm = paramZedo;
    this.Zr = paramZxwy;
    if (Zbqc.Zwu() == null)
      Zlp_.ZF(++i); 
  }
  
  public void ZX() {
    this.Zj.Zl(this.ZP);
    this.Zm.Zt2();
  }
  
  public void Zs(Window paramWindow, String paramString) {
    this.Zr.ZS(this.Zj, paramWindow, paramString, this.ZP);
  }
  
  public void ZQ(Window paramWindow, String paramString) {
    this.Zj.ZN(paramWindow, paramString, this.ZP);
    this.Zm.Zt2();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm6c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */