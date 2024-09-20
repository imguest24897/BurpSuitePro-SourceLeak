package burp;

public class Zlaq {
  private final Zm3g Za;
  
  private final Zlal ZC;
  
  public Zlaq(Zm3g paramZm3g, Zskh paramZskh, Zt8u paramZt8u, Zezx paramZezx) {
    this(paramZm3g, new Zlal(paramZskh, paramZt8u, paramZezx));
  }
  
  public Zlaq(Zm3g paramZm3g, Zlal paramZlal) {
    this.Za = paramZm3g;
    this.ZC = paramZlal;
  }
  
  public void ZC(Zmf_ paramZmf_, String... paramVarArgs) {
    paramZmf_.Zg(this.ZC);
    Zmf_ zmf_ = paramZmf_.ZV(paramVarArgs);
    if (zmf_.iterator().hasNext())
      this.Za.Zd(zmf_); 
  }
  
  public Zmf_ Zd(String... paramVarArgs) {
    Zzkm zzkm = new Zzkm();
    this.Za.Zl(zzkm);
    return zzkm.ZV(paramVarArgs);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlaq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */