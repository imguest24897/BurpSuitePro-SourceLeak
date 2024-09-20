package burp;

import java.util.Arrays;

public class Zb8 extends Zr5 {
  private final int ZK;
  
  Zb8(Zefx paramZefx) {
    super(paramZefx);
    this.ZK = paramZefx.ZZ(Zb8::Zh).size();
  }
  
  public boolean Zr(Zefx paramZefx) {
    if (!super.Zr(paramZefx))
      return false; 
    int i = paramZefx.ZZ(Zb8::Zh).size();
    return (Arrays.equals(paramZefx.ZF().Zd4(), this.ZY.ZF().Zd4()) && i == this.ZK);
  }
  
  private static boolean Zh(Zlou paramZlou) {
    return (paramZlou.Zx == Zrdu.URL_PARAM || paramZlou.Zx.ZO());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */