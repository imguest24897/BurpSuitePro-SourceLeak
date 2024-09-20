package burp;

import java.util.ArrayList;
import java.util.List;

class Zrtt extends Zrtd {
  private final List<Zl1r> Zg;
  
  private final List<Zl1r> ZB;
  
  final Zlnh ZF;
  
  Zrtt(Zlnh paramZlnh, Zstu paramZstu1, Zstu paramZstu2, Zs68 paramZs681, Zs68 paramZs682) {
    super(paramZstu1, 0, paramZstu2, 0, null);
    int[] arrayOfInt = Zgim.ZP();
    this.Zg = new ArrayList<>();
    this.ZB = new ArrayList<>();
    this.ZA = ZU(paramZs681);
    this.ZK = ZU(paramZs682);
    ZZ();
    if (Zbqc.Zwu() == null)
      Zgim.Zu(new int[3]); 
  }
  
  protected void Zi(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Zl(paramInt1, paramInt2, 0, 0);
  }
  
  protected void Zj(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Zl(0, 0, paramInt3, paramInt4);
  }
  
  protected void Ze(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!this.ZF.Zc)
      Zl(paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  private void Zl(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int[] arrayOfInt = Zgim.ZP();
    int i = paramInt1;
    while (i < paramInt2) {
      int[] arrayOfInt1 = this.ZA[i];
      this.Zg.add(new Zl1r(arrayOfInt1[0], arrayOfInt1[1]));
      i++;
      if (arrayOfInt != null)
        break; 
    } 
    i = paramInt3;
    while (i < paramInt4) {
      int[] arrayOfInt1 = this.ZK[i];
      this.ZB.add(new Zl1r(arrayOfInt1[0], arrayOfInt1[1]));
      i++;
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  private int[][] ZU(Zs68 paramZs68) {
    Zgim zgim = new Zgim();
    zgim.ZO(0, 0);
    this.ZF.Zw.ZZ(zgim, paramZs68);
    zgim.ZO(paramZs68.Zs, paramZs68.Zs);
    return zgim.Zq();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrtt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */