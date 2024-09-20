package burp;

class Zrtr extends Zrtd {
  private final Zgpo ZP;
  
  private final Zgpo Zc;
  
  Zrtr(Zg3t paramZg3t, Zstu paramZstu1, Zstu paramZstu2, Zs68 paramZs681, Zs68 paramZs682) {
    super(paramZstu1, 0, paramZstu2, 0, null);
    Zgmu zgmu1 = new Zgmu();
    Zgmu zgmu2 = new Zgmu();
    int[] arrayOfInt = Zgim.ZP();
    this.ZA = ZY(paramZs681, zgmu1);
    this.ZK = ZY(paramZs682, zgmu2);
    this.ZP = new Zgpo(zgmu1.ZZ());
    this.Zc = new Zgpo(zgmu2.ZZ());
    ZZ();
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  protected void Zi(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ZO(paramInt1, paramInt2, 0, 0);
  }
  
  protected void Zj(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ZO(0, 0, paramInt3, paramInt4);
  }
  
  protected void Ze(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ZO(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private void ZO(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int[] arrayOfInt = Zgim.ZP();
    int i = paramInt1;
    while (i < paramInt2) {
      this.ZP.ZU(i);
      i++;
      if (arrayOfInt != null)
        break; 
    } 
    i = paramInt3;
    while (i < paramInt4) {
      this.Zc.ZU(i);
      i++;
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  private int[][] ZY(Zs68 paramZs68, Zgmw paramZgmw) {
    Zgim zgim = new Zgim();
    zgim.ZO(0, 0);
    paramZgmw.ZZ(zgim, paramZs68);
    zgim.ZO(paramZs68.Zs, paramZs68.Zs);
    return zgim.Zq();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrtr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */