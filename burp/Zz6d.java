package burp;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.function.BiFunction;

public class Zz6d implements Zefl {
  private final Zxff Zj;
  
  private final Zgb6 Za;
  
  private final Zxj7 Zc;
  
  private final Zbps Zk;
  
  private final Zto1 ZA;
  
  private List<Zgib> ZX = Collections.emptyList();
  
  private List<Zgib> Zs = Collections.emptyList();
  
  private Zbdj ZN;
  
  private EnumSet<Zt8> ZT = EnumSet.allOf(Zt8.class);
  
  private Zg7k Zl = Zg7k.Zo;
  
  private Zr2e Zp = Zr2e.Za;
  
  private Zbxj ZH = Zbxj.ZN;
  
  private boolean ZU = false;
  
  private boolean ZR = false;
  
  Zz6d(Zxff paramZxff, Zgb6 paramZgb6, Zt8u paramZt8u, Zxj7 paramZxj7) {
    this.Zj = paramZxff;
    this.Za = paramZgb6;
    this.Zc = paramZxj7;
    this.Zk = new Zbps(paramZxff, paramZt8u);
    this.ZA = new Zto1();
  }
  
  public Zefl ZA(Zbdf paramZbdf, String paramString) {
    return ZK(paramZbdf, paramString, Zz6d::ZI);
  }
  
  public Zefl ZK(Zbdf paramZbdf, String paramString, BiFunction<Zsmh, Zgsq, Zsmh> paramBiFunction) {
    return ZE(new Zgib[] { new Zbxw(paramString, paramZbdf, paramBiFunction) });
  }
  
  public Zefl Zj(Zbdf paramZbdf, String paramString) {
    return ZE(new Zgib[] { new Zbxn(paramString, paramZbdf) });
  }
  
  public Zefl ZE(Zgib... paramVarArgs) {
    return ZS(Arrays.asList(paramVarArgs));
  }
  
  public Zefl ZS(List<Zgib> paramList) {
    this.ZX = paramList;
    return this;
  }
  
  public Zefl Zp(Zbdf paramZbdf, String paramString) {
    return ZV(paramZbdf, paramString, Zz6d::ZI);
  }
  
  public Zefl ZV(Zbdf paramZbdf, String paramString, BiFunction<Zsmh, Zgsq, Zsmh> paramBiFunction) {
    return ZM(new Zgib[] { new Zbxw(paramString, paramZbdf, paramBiFunction) });
  }
  
  public Zefl ZM(Zgib... paramVarArgs) {
    return ZJ(Arrays.asList(paramVarArgs));
  }
  
  public Zefl ZJ(List<Zgib> paramList) {
    this.Zs = paramList;
    return this;
  }
  
  public Zefl Zh(Zbdj paramZbdj) {
    if (paramZbdj != null) {
      this.ZN = paramZbdj;
      paramZbdj.ZQ(this.Zk);
    } 
    return this;
  }
  
  public Zefl ZB(Zg7k paramZg7k) {
    this.Zl = paramZg7k;
    return this;
  }
  
  public Zefl Zo() {
    return Zf(null, Zs_i.INSPECTOR);
  }
  
  public Zefl Zf(List<Zmon> paramList, Zs_i paramZs_i) {
    Ze3i ze3i = this.Zc.Zp(this.Zk, paramList, paramZs_i, this.ZA);
    this.Zp = ze3i.ZtW();
    this.ZH = ze3i.ZtR();
    return this;
  }
  
  public Zefl Zz() {
    this.ZU = true;
    return this;
  }
  
  public Zefl ZR() {
    this.ZR = true;
    return this;
  }
  
  public Zefl Zq(Zt8... paramVarArgs) {
    this.ZT = EnumSet.copyOf(Arrays.asList(paramVarArgs));
    return this;
  }
  
  public Zbdx Zl() {
    return new Zbdx(this.ZX, this.Zs, this.ZN, this.ZT, this.Zl, this.Zp, this.Zj, this.Zk, this.Za, this.ZH, this.ZU, this.ZR, this.ZA);
  }
  
  private static Zsmh ZI(Zsmh paramZsmh, Zgsq paramZgsq) {
    Ztuo ztuo = new Ztuo(paramZgsq);
    paramZsmh.Zh(ztuo);
    return ztuo.ZB();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz6d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */