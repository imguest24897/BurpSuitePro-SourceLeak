package burp;

import java.util.List;

class Zlix implements Zg5o {
  private final Zefx ZN;
  
  private final Zlit Zc;
  
  private final boolean Zv;
  
  private final boolean Zj;
  
  private final boolean Zg;
  
  private final boolean Ze;
  
  private final List<String> Zy;
  
  private final boolean ZS;
  
  private final Zey9 ZK;
  
  private Zefx ZC;
  
  public Zlix(Zefx paramZefx, Zlit paramZlit, boolean paramBoolean1, List<String> paramList, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, Zey9 paramZey9) {
    this.ZN = paramZefx;
    this.Zc = paramZlit;
    this.Zv = paramBoolean2;
    this.Zj = paramBoolean4;
    this.Zg = paramBoolean5;
    this.Ze = (paramBoolean1 && paramList != null && !paramList.isEmpty());
    this.Zy = paramList;
    this.ZS = paramBoolean3;
    this.ZK = paramZey9;
  }
  
  public void Zs(Zr6q paramZr6q) {
    Zmgp zmgp = new Zmgp(this.ZN, this.Zc, this.Zv, this.Zj, this.Zg, this.Ze, this.Zy, this.ZS, this.ZK);
    this.ZC = zmgp.Zt();
  }
  
  public void ZS(Zr6h paramZr6h) {
    Zgj9 zgj9 = new Zgj9(this.ZN, this.Zc, this.Zj, this.Zg, this.Ze, this.Zy, this.ZS, this.ZK);
    this.ZC = zgj9.ZA(paramZr6h);
  }
  
  public Zefx Zz() {
    return this.ZC;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlix.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */