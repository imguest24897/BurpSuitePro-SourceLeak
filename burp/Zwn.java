package burp;

import java.math.RoundingMode;
import java.text.NumberFormat;

public class Zwn extends Zni implements Zl_n {
  private final Zr_4 ZG;
  
  @Zzvo(0)
  private Zxck ZZ;
  
  @Zzvo(1)
  private boolean ZS;
  
  @Zzvo(6)
  private boolean Zv;
  
  @Zzvo(2)
  private int ZE;
  
  @Zzvo(3)
  private int Zk;
  
  @Zzvo(4)
  private int Zd;
  
  @Zzvo(5)
  private int ZW;
  
  @Zzvo(7)
  private int Z_;
  
  public Zwn(NumberFormat paramNumberFormat, Zr_4 paramZr_4) {
    this.ZG = paramZr_4;
    int i = Zth3.ZK();
    Zth3.ZP(paramNumberFormat, this, paramZr_4);
    if (Zbqc.Zwu() == null)
      Zth3.Zd(++i); 
  }
  
  public NumberFormat ZXN() {
    return Zth3.Zo(this);
  }
  
  public boolean ZXd() {
    return Zth3.ZT(this);
  }
  
  public Zxck ZXQ() {
    return this.ZZ;
  }
  
  public void ZY(Zxck paramZxck) {
    this.ZZ = paramZxck;
  }
  
  public boolean ZX1() {
    return this.ZS;
  }
  
  public void Zw(boolean paramBoolean) {
    this.ZS = paramBoolean;
  }
  
  public boolean ZXu() {
    return this.Zv;
  }
  
  public void ZP(boolean paramBoolean) {
    this.Zv = paramBoolean;
  }
  
  public int ZX3() {
    return this.ZE;
  }
  
  public void ZHY(int paramInt) {
    this.ZE = paramInt;
  }
  
  public int ZXH() {
    return this.Zk;
  }
  
  public void ZHS(int paramInt) {
    this.Zk = paramInt;
  }
  
  public int ZXT() {
    return this.Zd;
  }
  
  public void ZHf(int paramInt) {
    this.Zd = paramInt;
  }
  
  public int ZXA() {
    return this.ZW;
  }
  
  public void ZHK(int paramInt) {
    this.ZW = paramInt;
  }
  
  public RoundingMode ZXK() {
    return RoundingMode.valueOf(this.Z_);
  }
  
  public void Zi(RoundingMode paramRoundingMode) {
    this.Z_ = paramRoundingMode.ordinal();
  }
  
  public void ZXg() {
    Zth3.ZY(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zwn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */