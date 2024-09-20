package burp;

import net.portswigger.Zsy;

public class Zrwt implements Zp {
  private final Ze3n ZF;
  
  private final Zkq4 ZD;
  
  private final Zt4j Zf;
  
  private final Ztu0 Zp;
  
  public Zrwt(Zsy paramZsy, Zbjl paramZbjl, int paramInt, Ze3n paramZe3n, Zkq4 paramZkq4, Zesv paramZesv, Zr_4 paramZr_4, Zbnt paramZbnt) {
    this.ZF = paramZe3n;
    this.ZD = paramZkq4;
    boolean bool = Zxor.ZX();
    this.Zp = new Ztu0();
    this.Zf = new Zt4j(paramZe3n, paramZbjl, new Zml_(paramZsy, this.Zp, paramZbjl, paramInt, paramZe3n.ZM().Zgv()), paramZesv, paramZr_4, paramZbnt);
    if (bool)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public void Zg(Zz4_ paramZz4_) {
    this.Zf.Zg(paramZz4_, this.Zp);
  }
  
  public void ZW(Zmz6 paramZmz6, Zly1 paramZly1, long paramLong) {
    this.Zf.ZQ(paramZmz6, paramZly1, paramLong, this.Zp);
  }
  
  public boolean ZD(Zmaj paramZmaj) {
    return (this.ZD.ZS(Zzu2.XML_INJECTION, Zr3z.COLLABORATOR_BASED) && (Zlp9.Za(Ztwf.Zx, paramZmaj.Zy.ZN()) || Zlp9.Za(Ztwo.ZE, paramZmaj.Zy.ZN())));
  }
  
  public void ZF(Zmaj paramZmaj) {
    Zxs7 zxs7 = this.ZF.ZS().Zt(paramZmaj.Zy.Zk());
    if (zxs7 == null || (zxs7.ZZ(this.ZD) && Zg6o.Zx(zxs7)))
      return; 
    this.Zp.Zr(paramZmaj);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrwt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */