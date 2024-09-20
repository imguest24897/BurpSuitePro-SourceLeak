package burp;

import java.util.regex.Pattern;

public class Zvr implements Zmt0 {
  private final Pattern ZF;
  
  Zvr(Pattern paramPattern) {
    this.ZF = paramPattern;
  }
  
  public boolean ZA(Zstu paramZstu) {
    return this.ZF.matcher(paramZstu.Zis()).find();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zvr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */