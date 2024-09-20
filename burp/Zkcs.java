package burp;

import java.util.List;

public class Zkcs implements Zsh_ {
  private final Ze3n Zx;
  
  private final Zesv ZN;
  
  private final Zbjl ZJ;
  
  private final Zz4_ ZF;
  
  public Zkcs(Ze3n paramZe3n, Zesv paramZesv, Zbjl paramZbjl, Zz4_ paramZz4_) {
    this.Zx = paramZe3n;
    this.ZN = paramZesv;
    this.ZJ = paramZbjl;
    this.ZF = paramZz4_;
  }
  
  public void Zk(Zroy paramZroy, Zer0 paramZer0, List<Zer0> paramList, Zxs7 paramZxs7, Zzwz paramZzwz, Zlp9 paramZlp9) {
    Ze26 ze26 = new Ze26(this.Zx, this.ZN, paramZxs7, this.ZJ);
    Zbll zbll = ze26.ZY(paramZroy, paramZzwz, paramZer0, paramList, paramZlp9);
    boolean bool = Zsw1.Zv();
    if (zbll != null)
      this.ZF.Zz((new Zk1v()).Zt(this.Zx, paramZxs7, paramZer0, zbll, paramList)); 
    if (Zbqc.Zwu() == null)
      Zsw1.ZF(!bool); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkcs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */