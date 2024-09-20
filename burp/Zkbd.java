package burp;

class Zkbd implements Zrbu {
  private final int Zc;
  
  private final int ZF;
  
  private final Zbjl ZY;
  
  private final Zkfj Zj;
  
  private final Ztai Zl;
  
  Zkbd(Ztai paramZtai, Zbjl paramZbjl, int paramInt1, int paramInt2, Zkfj paramZkfj) {
    this.Zl = paramZtai;
    this.ZY = paramZbjl;
    this.Zc = paramInt1;
    this.ZF = paramInt2;
    this.Zj = paramZkfj;
  }
  
  public Zzwz Zc(Zxs7 paramZxs7) {
    return Zkgq.Zj(this.Zc, this.ZF, this.Zl, this.ZY, paramZxs7, this.Zj);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkbd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */