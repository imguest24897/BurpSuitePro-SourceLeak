package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Zku3 implements Zln1 {
  private static final Set<? extends Zvs> ZC = Zb99.Zn((Zvs[])new Zzu2[] { Zzu2.PYTHON_CODE_INJECTION, Zzu2.RUBY_CODE_INJECTION, Zzu2.PHP_CODE_INJECTION, Zzu2.PERL_CODE_INJECTION });
  
  private final Ztai ZA;
  
  private final Zln1 Zj;
  
  Zku3(Zkq4 paramZkq4, Zlk4 paramZlk4) {
    this.ZA = paramZkq4;
    this.Zj = new Zrfi(paramZlk4);
  }
  
  public List<Zllr> ZV() {
    return this.Zj.ZV();
  }
  
  public List<Zllr> Zn() {
    return this.Zj.Zn();
  }
  
  public List<Zllr> Zc() {
    return this.Zj.Zc();
  }
  
  public List<Zllr> ZW() {
    return this.ZA.ZS(Zzu2.OS_COMMAND_INJECTION, Zr3z.TIME_BASED) ? this.Zj.ZW() : Collections.<Zllr>emptyList();
  }
  
  public List<Zllr> Zv() {
    return (this.ZA.ZN(new Zvs[] { Zzu2.UNIDENTIFIED_CODE_INJECTION, Zzu2.RUBY_CODE_INJECTION, Zzu2.PERL_CODE_INJECTION }) || this.ZA.ZS(Zzu2.PHP_CODE_INJECTION, Zr3z.TIME_BASED)) ? this.Zj.Zv() : Collections.<Zllr>emptyList();
  }
  
  public List<Zllr> ZU() {
    return ZA(this.Zj.ZU());
  }
  
  public List<Zllr> ZA() {
    return ZA(this.Zj.ZA());
  }
  
  public List<Zllr> Zx() {
    return ZA(this.Zj.Zx());
  }
  
  public List<Zllr> Zp(String paramString) {
    return ZA(this.Zj.Zp(paramString));
  }
  
  private List<Zllr> ZA(List<Zllr> paramList) {
    ArrayList<Zllr> arrayList = new ArrayList();
    Iterator<Zllr> iterator = paramList.iterator();
    String str = Zm0n.ZX();
    while (iterator.hasNext()) {
      Zllr zllr = iterator.next();
      boolean bool = this.ZA.ZS(zllr.ZM.ZU, zllr.ZM.ZN);
      if (ZC.contains(zllr.ZM.ZU))
        bool |= this.ZA.Zr(Zzu2.UNIDENTIFIED_CODE_INJECTION); 
      if (bool)
        arrayList.add(zllr); 
      if (str != null)
        break; 
    } 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zku3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */