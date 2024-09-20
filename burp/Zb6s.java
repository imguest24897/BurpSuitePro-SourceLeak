package burp;

import java.util.ArrayList;

public class Zb6s implements Zm9n {
  private final Ztai ZV;
  
  private final Zmhe ZP;
  
  private final Zbjl Zn;
  
  private final Ze3n Zy;
  
  private final Zxs7 ZN;
  
  private final Zbnt ZM;
  
  private final Zmg6 ZU;
  
  public Zb6s(Ztai paramZtai, Zmhe paramZmhe, Zbjl paramZbjl, Ze3n paramZe3n, Zxs7 paramZxs7, Zbnt paramZbnt, Zmg6 paramZmg6) {
    this.ZV = paramZtai;
    this.ZP = paramZmhe;
    this.Zn = paramZbjl;
    this.Zy = paramZe3n;
    this.ZN = paramZxs7;
    this.ZM = paramZbnt;
    this.ZU = paramZmg6;
  }
  
  public Zbsl Zp() {
    return Zbsl.APIP_SvgAndPdfFileUpload;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    int[] arrayOfInt = Zkgq.Zr();
    ArrayList<Ztm4> arrayList = new ArrayList();
    if (this.ZV.Zr(Zzu2.INPUT_RETRIEVAL_REFLECTED) || this.ZV.ZS(Zzu2.XSS_REFLECTED, Zr3z.CLIENT_SIDE_BREAKOUT) || (this.ZV.ZS(Zzu2.XSS_STORED, Zr3z.COLLABORATOR_BASED) && this.Zn.ZG())) {
      arrayList.add(Zkgq.ZF(paramZrj.Zg(), this.Zy.ZM().Zgv(), this.Zn, this.ZN, this.ZV, this.ZU.Zh()));
      arrayList.add(Zkgq.Zj(paramZrj.Zg(), this.Zy.ZM().Zgv(), this.ZV, this.Zn, this.ZN, null));
    } 
    for (Ztm4 ztm4 : arrayList) {
      for (Zew4 zew4 : ztm4.ZK()) {
        zew4.Ze(this.ZN, this.ZP, paramZz4_, this.Zy, this.ZM);
        if (arrayOfInt == null)
          break; 
      } 
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  public boolean Zf() {
    return Zlep.ZJ(this.ZN);
  }
  
  public String toString() {
    return Zp().name();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb6s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */