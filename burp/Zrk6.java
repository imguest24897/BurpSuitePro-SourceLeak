package burp;

public class Zrk6 extends Zrko {
  private final Object ZC;
  
  public Zrk6(Object paramObject, String paramString1, String paramString2) {
    super(paramString1, paramString2);
    if (paramObject == null)
      paramObject = Integer.valueOf(0); 
    this.ZC = paramObject;
  }
  
  public void Zi(Zb3t paramZb3t) {
    if (!Zl19.ZR(paramZb3t) || Zl19.ZD(paramZb3t.ZI()))
      return; 
    Zgc0 zgc0 = (Zgc0)paramZb3t;
    if (ZN(zgc0))
      zgc0.Zm(Zxc6.TaintSource, this.ZC); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrk6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */