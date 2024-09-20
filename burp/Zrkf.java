package burp;

public class Zrkf extends Zrko {
  final Zsw6 Zj;
  
  private final int ZF;
  
  Zrkf(Zsw6 paramZsw6, String paramString1, String paramString2, int paramInt) {
    super(paramString1, paramString2);
    this.Zj = paramZsw6;
    this.ZF = paramInt;
  }
  
  public void Zi(Zb3t paramZb3t) {
    if (!Zl19.ZD(paramZb3t))
      return; 
    Zgcs zgcs = (Zgcs)paramZb3t;
    Zgc0 zgc0 = (Zgc0)zgcs.ZC().get(0);
    if (ZN(zgc0)) {
      int i = this.ZF * 2 + 1;
      Zgc3 zgc3 = (Zgc3)paramZb3t.ZC().get(1);
      if (zgc3.ZC().size() > i + 1) {
        Zgc0 zgc01 = (Zgc0)zgc3.ZC().get(i);
        zgc01.Zm(Zxc6.TaintSink, (this.Zj == null) ? Integer.valueOf(0) : this.Zj);
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrkf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */