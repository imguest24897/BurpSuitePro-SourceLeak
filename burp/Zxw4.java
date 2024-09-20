package burp;

import java.io.IOException;

public class Zxw4 implements Zk5_ {
  public final Zsh8 ZF;
  
  public final Zip Zl;
  
  private static int Zp;
  
  public Zxw4(Zsh8 paramZsh8, Zip paramZip) {
    this.ZF = paramZsh8;
    this.Zl = paramZip;
  }
  
  public void Zl() {
    this.ZF.ZPO();
    this.Zl.ZC();
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    this.ZF.ZS(paramZs4f);
    this.Zl.ZS(paramZs4f);
  }
  
  public static void ZT(int paramInt) {
    Zp = paramInt;
  }
  
  public static int Zt() {
    return Zp;
  }
  
  public static int Ze() {
    int i = Zt();
    return (i == 0) ? 1 : 0;
  }
  
  static {
    if (Ze() == 0)
      ZT(55); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxw4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */