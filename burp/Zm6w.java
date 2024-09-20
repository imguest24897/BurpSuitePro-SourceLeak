package burp;

import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

public class Zm6w {
  private final Zr_4 Zf;
  
  private final Zz28 ZG;
  
  private final Ztg4 ZZ;
  
  private final Zbnt Zx;
  
  private final Zzzt Zj;
  
  private final Zey9 Zl;
  
  private final Set<Zm31> Zn;
  
  private boolean ZR;
  
  private boolean Zq;
  
  private boolean Zw;
  
  private boolean ZY;
  
  private boolean ZN;
  
  private boolean Zt;
  
  private boolean Z_;
  
  private boolean Za;
  
  private boolean Zp;
  
  private boolean ZB;
  
  private boolean ZJ;
  
  private boolean Zb;
  
  private Zljz Zh;
  
  private Zewu ZQ;
  
  public Zm6w(Zr_4 paramZr_4, Ztg4 paramZtg4) {
    this(paramZr_4, Zslu.ZY, paramZtg4, null, null, null);
  }
  
  public Zm6w(Zr_4 paramZr_4, Ztg4 paramZtg4, Zbnt paramZbnt, Zey9 paramZey9) {
    this(paramZr_4, Zslu.ZY, paramZtg4, paramZbnt, null, paramZey9);
  }
  
  public Zm6w(Zr_4 paramZr_4, Zz28 paramZz28, Ztg4 paramZtg4, Zbnt paramZbnt, Zzzt paramZzzt, Zey9 paramZey9) {
    this.Zf = paramZr_4;
    this.ZG = paramZz28;
    this.ZZ = paramZtg4;
    this.Zx = paramZbnt;
    this.Zj = paramZzzt;
    this.Zl = paramZey9;
    this.Zn = Collections.newSetFromMap(new IdentityHashMap<>());
  }
  
  public Zm6w Zy(boolean paramBoolean) {
    this.ZR = !paramBoolean;
    return this;
  }
  
  public Zm6w Zg(boolean paramBoolean) {
    this.Zq = !paramBoolean;
    return this;
  }
  
  public Zm6w Zo(boolean paramBoolean) {
    this.Zw = !paramBoolean;
    return this;
  }
  
  public Zm6w ZE(boolean paramBoolean) {
    this.ZY = !paramBoolean;
    return this;
  }
  
  public Zm6w ZW(boolean paramBoolean) {
    this.ZN = !paramBoolean;
    return this;
  }
  
  public Zm6w Zd(boolean paramBoolean) {
    this.Zt = !paramBoolean;
    return this;
  }
  
  public Zm6w ZL(boolean paramBoolean) {
    this.Z_ = !paramBoolean;
    return this;
  }
  
  public Zm6w ZU(boolean paramBoolean) {
    this.Za = !paramBoolean;
    return this;
  }
  
  public Zm6w ZG(boolean paramBoolean) {
    this.Zp = !paramBoolean;
    return this;
  }
  
  public Zm6w Zf(boolean paramBoolean) {
    this.ZB = paramBoolean;
    return this;
  }
  
  public Zm6w ZH(boolean paramBoolean) {
    this.ZJ = paramBoolean;
    return this;
  }
  
  public Zm6w ZU(Zm31... paramVarArgs) {
    this.Zn.addAll(Arrays.asList(paramVarArgs));
    return this;
  }
  
  public Zm6w Zw(Zljz paramZljz) {
    this.Zh = paramZljz;
    return this;
  }
  
  public Zm6w ZT() {
    this.Zb = true;
    return this;
  }
  
  public Zlu6 Zo() throws Zev3 {
    try {
    
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    Zewu zewu = (Zewu)(this.Zb ? new Zz2y() : new Zs5u(this.ZZ));
    try {
      if (this.Zf != null)
        try {
          if (this.Zf.Zi());
        } catch (Zev3 zev3) {
          throw a(null);
        }  
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    this.ZQ = new Zvoe(zewu);
    return new Zlu6(this);
  }
  
  private static Zev3 a(Zev3 paramZev3) {
    return paramZev3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm6w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */