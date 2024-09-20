package burp;

import java.util.List;

public class Zsw1 implements Zsh_ {
  private final Ze3n Zv;
  
  private final Zesv ZQ;
  
  private final Zbjl Zy;
  
  private final Zz4_ ZM;
  
  private static boolean Zc;
  
  public Zsw1(Ze3n paramZe3n, Zesv paramZesv, Zbjl paramZbjl, Zz4_ paramZz4_) {
    this.Zv = paramZe3n;
    this.ZQ = paramZesv;
    this.Zy = paramZbjl;
    this.ZM = paramZz4_;
  }
  
  public void Zk(Zroy paramZroy, Zer0 paramZer0, List<Zer0> paramList, Zxs7 paramZxs7, Zzwz paramZzwz, Zlp9 paramZlp9) {
    Ze26 ze26 = new Ze26(this.Zv, this.ZQ, paramZxs7, this.Zy);
    Zbll zbll = ze26.ZY(paramZroy, paramZzwz, paramZer0, paramList, paramZlp9);
    boolean bool = ZQ();
    if (zbll != null)
      this.ZM.Zz(paramZzwz.ZZ(zbll.Zk).Zt(this.Zv, paramZxs7, paramZer0, zbll, paramList)); 
    if (!bool)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public static void ZF(boolean paramBoolean) {
    Zc = paramBoolean;
  }
  
  public static boolean ZQ() {
    return Zc;
  }
  
  public static boolean Zv() {
    boolean bool = ZQ();
    return !bool;
  }
  
  static {
    if (Zv())
      ZF(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsw1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */