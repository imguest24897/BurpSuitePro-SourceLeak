package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zkhp {
  private String Ze;
  
  private String ZB;
  
  private Zz3o Zf;
  
  private String ZM;
  
  private String Zy;
  
  private String ZW;
  
  private final List<String> Zc = new LinkedList<>();
  
  private final List<Zz_b> ZQ = new ArrayList<>();
  
  private final List<Zzjv> ZX = new ArrayList<>();
  
  public Zkhp Zy(List<? extends Zz_b> paramList) {
    this.ZQ.addAll(paramList);
    return this;
  }
  
  public Zkhp Zn(List<Zzjv> paramList) {
    this.ZX.addAll(paramList);
    return this;
  }
  
  public Zkhp Zm(String paramString) {
    this.Ze = paramString;
    return this;
  }
  
  public Zkhp Zl(Zz3o paramZz3o) {
    this.Zf = paramZz3o;
    return this;
  }
  
  public Zkhp ZG(String paramString) {
    this.ZB = paramString;
    return this;
  }
  
  public Zkhp ZM(String paramString) {
    this.ZM = paramString;
    return this;
  }
  
  public Zkhp ZS(String paramString) {
    this.Zy = paramString;
    return this;
  }
  
  public Zkhp ZU(String paramString) {
    this.ZW = paramString;
    return this;
  }
  
  public Zkhp Zg(List<String> paramList) {
    this.Zc.addAll(paramList);
    return this;
  }
  
  public Zr5n ZW() {
    Zyu<Zt8g> zyu = new Zyu<>(Zt8g.ZG);
    Zyu<Zz_b> zyu1 = new Zyu<>(Zz_b.Zk, this.ZQ.size());
    zyu1.addAll(this.ZQ);
    int[] arrayOfInt = Zmxe.ZH();
    Zr2a zr2a = Zr2a.Zw(zyu, zyu1);
    Zyu<Zgpi> zyu2 = new Zyu<>(Zzjv.Zy, this.ZX.size());
    zyu2.addAll((Collection)this.ZX);
    Zuh.Zb((this.Zf != null), Zqf.Zk);
    Zuh.Zb((this.Zf == Zz3o.FORM || this.Zf == Zz3o.SUBMIT || this.Zy != null || this.ZW != null || !this.Zc.isEmpty()), Zqf.Zk);
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[4]); 
    return new Zjh(this.Ze, this.ZB, this.Zf, this.ZM, this.Zy, this.ZW, Zmxe.Zw(this.Zc), (Zefg)zyu2, zr2a);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkhp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */