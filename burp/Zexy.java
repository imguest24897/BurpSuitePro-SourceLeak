package burp;

public class Zexy extends Zexe<Zgcd> {
  public void ZN(Zgcd paramZgcd) {
    if (paramZgcd.ZC().size() != 3)
      return; 
    if (!Zl19.ZC(paramZgcd.ZC().get(1)))
      return; 
    Zgcc zgcc = (Zgcc)paramZgcd.ZC().get(1);
    if (Za(zgcc) || ZM(zgcc)) {
      Zgc0 zgc0 = paramZgcd.Zv();
      Zgcu zgcu = (Zgcu)paramZgcd.ZC().get(0);
      Zb(zgc0, zgcu);
    } 
  }
  
  private boolean Za(Zgcc paramZgcc) {
    return ((paramZgcc.ZK()).ZE == Zgho.EQUALS);
  }
  
  private boolean ZM(Zgcc paramZgcc) {
    return ((paramZgcc.ZK()).ZE == Zgho.KEYWORD_IN || (paramZgcc.ZK()).ZE == Zgho.KEYWORD_OF);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zexy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */