package burp;

import java.time.Duration;
import java.util.Set;
import net.portswigger.Zkb;

public class Zs38 {
  private final Zgb6 ZB;
  
  private Set<Zzz1> ZQ;
  
  private Integer Ze;
  
  private Integer Zv;
  
  private Integer Zt;
  
  private Zlgm Zc;
  
  private String Zy;
  
  private boolean ZE;
  
  private boolean ZC;
  
  private boolean ZK;
  
  private boolean Zb;
  
  private boolean ZR;
  
  private boolean ZS = true;
  
  private boolean ZV;
  
  private Ze45 ZZ = Ze45.ATTEMPT_HTTP2;
  
  private boolean ZN = true;
  
  private String ZT;
  
  private long ZP = 10000L;
  
  private boolean ZU = true;
  
  private boolean ZI = true;
  
  private Boolean Zp;
  
  private boolean ZM;
  
  private boolean ZG = true;
  
  private boolean Zd;
  
  private String Z_;
  
  private boolean Zi;
  
  private Zs38(Zgb6 paramZgb6) {
    this.ZB = paramZgb6;
  }
  
  public Zs38 ZX() {
    this.ZE = true;
    return this;
  }
  
  public Zs38 ZQ() {
    this.ZK = true;
    this.ZC = true;
    return this;
  }
  
  public Zs38 Ze(boolean paramBoolean) {
    this.ZR = paramBoolean;
    return this;
  }
  
  public Zs38 ZC(boolean paramBoolean) {
    this.Zb = paramBoolean;
    return this;
  }
  
  public Zs38 Zq(Duration paramDuration) {
    if (paramDuration != null)
      this.Ze = Integer.valueOf((int)paramDuration.toMillis()); 
    return this;
  }
  
  public Zs38 ZW(int paramInt) {
    this.Zv = Integer.valueOf(paramInt);
    return this;
  }
  
  public Zs38 ZI(Duration paramDuration) {
    if (paramDuration != null)
      this.Zv = Integer.valueOf((int)paramDuration.toMillis()); 
    return this;
  }
  
  public Zs38 Zp(Zlgm paramZlgm) {
    this.Zc = paramZlgm;
    return this;
  }
  
  public Zs38 Zd(Set<Zzz1> paramSet) {
    this.ZQ = paramSet;
    return this;
  }
  
  public Zs38 ZV(boolean paramBoolean) {
    this.ZS = paramBoolean;
    return this;
  }
  
  public Zs38 ZU(int paramInt) {
    this.Zt = Integer.valueOf(paramInt);
    return this;
  }
  
  public Zs38 Zq() {
    this.ZV = true;
    return this;
  }
  
  public Zs38 ZX(String paramString) {
    return Zh(Zkb.Zy(paramString));
  }
  
  public Zs38 Zh(byte[] paramArrayOfbyte) {
    this.Zy = (paramArrayOfbyte == null || paramArrayOfbyte.length == 0) ? null : Zkb.ZG(paramArrayOfbyte);
    return this;
  }
  
  public Zs38 Zi(boolean paramBoolean) {
    this.Zp = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public Zs38 Zz(boolean paramBoolean) {
    this.ZM = paramBoolean;
    return this;
  }
  
  public Zs38 Za(boolean paramBoolean) {
    this.ZG = paramBoolean;
    return this;
  }
  
  public Zs38 Zu(boolean paramBoolean) {
    this.Zd = paramBoolean;
    return this;
  }
  
  public Zs38 ZR(String paramString) {
    this.Z_ = paramString;
    return this;
  }
  
  public Zs38 ZM() {
    this.ZZ = Ze45.SUPPRESS_HTTP2;
    return this;
  }
  
  public Zs38 ZV(Ze45 paramZe45) {
    this.ZZ = paramZe45;
    return this;
  }
  
  public Zs38 ZA(boolean paramBoolean) {
    this.ZN = paramBoolean;
    return this;
  }
  
  public Zs38 Zo(String paramString) {
    this.ZT = paramString;
    return this;
  }
  
  public Zs38 Zm(long paramLong) {
    this.ZP = paramLong;
    return this;
  }
  
  public Zs38 Zt(boolean paramBoolean) {
    this.ZU = paramBoolean;
    return this;
  }
  
  public Zs38 ZH(boolean paramBoolean) {
    this.ZI = paramBoolean;
    return this;
  }
  
  public Zs38 ZS() {
    this.Zi = true;
    return this;
  }
  
  public Zts5 Zy() {
    boolean bool = Zxtv.Za();
    if (!bool)
      Zbqc.Zr(new Zbqc[4]); 
    return new Ztg(this.ZB, this.Zv, this.Zt, this.Ze, this.Zc, this.ZQ, this.Zy, this.ZE, this.ZK, this.ZC, this.ZR, this.ZS, this.ZV, this.Zb, this.Zp, this.ZM, this.ZG, this.Zd, this.Z_, this.ZZ, this.ZN, this.ZT, this.ZP, this.ZI, this.ZU, this.Zi);
  }
  
  public static Zs38 ZG(Zgb6 paramZgb6) {
    return new Zs38(paramZgb6);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs38.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */