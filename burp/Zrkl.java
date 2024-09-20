package burp;

public class Zrkl extends Zrko {
  private final Object ZF;
  
  public Zrkl(Object paramObject, String paramString1, String paramString2) {
    super(paramString1, paramString2);
    if (paramObject == null)
      paramObject = Integer.valueOf(0); 
    this.ZF = paramObject;
  }
  
  public void Zi(Zb3t paramZb3t) {
    if (!Zl19.ZD(paramZb3t))
      return; 
    Zgc0 zgc0 = (Zgc0)paramZb3t.ZC().get(0);
    if (ZN(zgc0))
      paramZb3t.Zm(Zxc6.TaintSource, this.ZF); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrkl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */