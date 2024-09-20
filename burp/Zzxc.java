package burp;

import java.util.List;
import java.util.Optional;
import net.portswigger.Zzi;

public class Zzxc {
  private final Zsvm Zr;
  
  private final List<Exception> Zc;
  
  private final Zzi ZN;
  
  private final String ZP;
  
  public Zzxc(Zsvm paramZsvm, List<Exception> paramList, Zzi paramZzi, String paramString) {
    this.Zr = paramZsvm;
    this.Zc = paramList;
    String[] arrayOfString = Zgig.Zg();
    this.ZN = paramZzi;
    this.ZP = paramString;
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public List<Exception> Zz() {
    return this.Zc;
  }
  
  public Optional<Zsvm> Z_() {
    return Optional.ofNullable(this.Zr);
  }
  
  public Optional<String> ZZ() {
    return this.ZN.ZX();
  }
  
  public Optional<String> ZI() {
    return this.ZN.ZB();
  }
  
  public Optional<String> Za() {
    return Optional.ofNullable(this.ZP);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzxc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */