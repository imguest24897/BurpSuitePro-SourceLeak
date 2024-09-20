package burp;

public class Zrkj extends Zrko {
  final Zsw6 Zw;
  
  Zrkj(Zsw6 paramZsw6, String paramString1, String paramString2) {
    super(paramString1, paramString2);
    this.Zw = paramZsw6;
  }
  
  public void Zi(Zb3t paramZb3t) {
    if (!Zl19.ZR(paramZb3t) || Zl19.ZD(paramZb3t.ZI()))
      return; 
    Zgc0 zgc0 = (Zgc0)paramZb3t;
    if (ZN(zgc0)) {
      Ztyn ztyn = Zes8.ZE(zgc0);
      if (ztyn != null)
        ztyn.Zm(Zxc6.TaintSink, (this.Zw == null) ? Integer.valueOf(0) : this.Zw); 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrkj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */