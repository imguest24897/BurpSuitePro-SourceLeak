package burp;

import java.util.Set;

class Ztg implements Zts5 {
  private final Zgb6 Zd;
  
  private final Integer ZV;
  
  private final Integer Zh;
  
  private final Integer ZM;
  
  private final Zlgm ZH;
  
  private final Set<Zzz1> ZE;
  
  private final String Zv;
  
  private final boolean Zp;
  
  private final boolean Zq;
  
  private final boolean ZO;
  
  private final boolean ZR;
  
  private final boolean Zo;
  
  private final boolean Zj;
  
  private final boolean ZL;
  
  private final Boolean ZT;
  
  private final boolean Zm;
  
  private final boolean Zt;
  
  private final boolean Zx;
  
  private final String Ze;
  
  private final Ze45 Zk;
  
  private final boolean ZW;
  
  private final String Zr;
  
  private final long Zc;
  
  private final boolean ZB;
  
  private final boolean ZP;
  
  private final boolean ZS;
  
  private Ztg(Zgb6 paramZgb6, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, Zlgm paramZlgm, Set<Zzz1> paramSet, String paramString1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, Boolean paramBoolean, boolean paramBoolean8, boolean paramBoolean9, boolean paramBoolean10, String paramString2, Ze45 paramZe45, boolean paramBoolean11, String paramString3, long paramLong, boolean paramBoolean12, boolean paramBoolean13, boolean paramBoolean14) {
    this.Zd = paramZgb6;
    this.ZV = paramInteger1;
    this.Zh = paramInteger2;
    this.ZM = paramInteger3;
    this.ZH = paramZlgm;
    this.ZE = paramSet;
    this.Zp = paramBoolean1;
    this.Zq = paramBoolean2;
    this.ZO = paramBoolean3;
    this.ZR = paramBoolean4;
    this.Zo = paramBoolean5;
    this.Zj = paramBoolean6;
    this.ZL = paramBoolean7;
    this.Zv = paramString1;
    this.ZT = paramBoolean;
    this.Zm = paramBoolean8;
    this.Zt = paramBoolean9;
    this.Zx = paramBoolean10;
    this.Ze = paramString2;
    this.Zk = paramZe45;
    this.ZW = paramBoolean11;
    this.Zr = paramString3;
    this.Zc = paramLong;
    this.ZB = paramBoolean12;
    this.ZP = paramBoolean13;
    this.ZS = paramBoolean14;
  }
  
  public Zrgq Zp() {
    return this::lambda$sessionHandlingConfiguration$0;
  }
  
  public Zrps Zk() {
    return new Zxri(this);
  }
  
  public Zs7n Zn() {
    return new Zbse(this);
  }
  
  public Zxh ZP() {
    return this::lambda$httpRequestConfiguration$1;
  }
  
  public Zgzx Zz() {
    return new Ztfm(this);
  }
  
  public Zxtv Zg() {
    boolean bool = Zxtv.ZA();
    if (Zbqc.Zwu() == null)
      Zxtv.Zt(!bool); 
    return Zxtv.ZP().Z_(this.ZB).ZR(this.Zk).Ze(this.ZW).Zv(this.Zr).Zt(this.Zc).ZF();
  }
  
  public Zst5 Zv() {
    return new Zz7a(this);
  }
  
  public Zb2 Zr() {
    return new Zljw(this);
  }
  
  private boolean lambda$httpRequestConfiguration$1() {
    return this.Zq;
  }
  
  private Zlgm lambda$sessionHandlingConfiguration$0() {
    return this.ZH;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */