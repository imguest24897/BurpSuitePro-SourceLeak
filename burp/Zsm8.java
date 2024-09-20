package burp;

import java.util.Arrays;
import javax.swing.JMenuItem;

public class Zsm8 {
  private final String Zx;
  
  private final Iterable<JMenuItem> ZO;
  
  public Zsm8(String paramString, JMenuItem... paramVarArgs) {
    this(paramString, Arrays.asList(paramVarArgs));
  }
  
  public Zsm8(String paramString, Iterable<JMenuItem> paramIterable) {
    this.Zx = paramString;
    this.ZO = paramIterable;
  }
  
  public Ze01 ZK() {
    Ze0u ze0u = new Ze0u(this.Zx);
    Zkj9 zkj9 = new Zkj9();
    ze0u.addMouseListener(new Zvm(this, zkj9, ze0u));
    return ze0u;
  }
  
  public Zztv ZH() {
    Zztv zztv = new Zztv(this.Zx);
    zztv.addMenuListener(new Zmje(this, zztv));
    return zztv;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsm8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */