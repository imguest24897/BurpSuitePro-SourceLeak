package burp;

import javax.swing.text.TabExpander;

public class Zse3 implements TabExpander {
  private final int Zl;
  
  private final int ZK;
  
  private float Zw;
  
  public Zse3(int paramInt1, int paramInt2, Zzkh paramZzkh) {
    this.Zl = paramInt1;
    this.ZK = paramInt2;
    Zt(paramZzkh);
  }
  
  void Zt(Zzkh paramZzkh) {
    this.Zw = paramZzkh.Zm(' ');
  }
  
  public float nextTabStop(float paramFloat, int paramInt) {
    if (Zm() == 0.0F)
      return paramFloat; 
    int i = (int)Math.floor(((paramFloat - this.Zl) / Zm()));
    return this.Zl + (i + 1) * Zm();
  }
  
  float Zm() {
    return this.ZK * this.Zw;
  }
  
  int Zj(float paramFloat) {
    return (int)Math.max(0.0D, Math.floor((paramFloat / Zm())));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zse3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */