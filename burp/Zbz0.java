package burp;

public class Zbz0 implements Zs79 {
  private final Zl7h ZR;
  
  private final Zlz4 Z_;
  
  private final Zgq5 ZT;
  
  public Zbz0(Zzep paramZzep, Zlz4 paramZlz4, Zgq5 paramZgq5) {
    this.ZR = paramZzep.ZnH();
    this.Z_ = paramZlz4;
    this.ZT = paramZgq5;
  }
  
  public int ZO() {
    return this.Z_.ZO() + this.ZT.ZO();
  }
  
  public int Zc() {
    return this.Z_.Zc() + this.ZT.Zc();
  }
  
  public void ZT() {
    String str = Zb_x.ZE();
    if (!this.ZR.ZVg()) {
      this.Z_.ZT();
      if (str != null) {
        this.ZT.ZT();
        return;
      } 
      return;
    } 
    this.ZT.ZT();
  }
  
  public void Z_() {
    String str = Zb_x.ZE();
    if (!this.ZR.ZVg()) {
      this.Z_.Z_();
      if (str != null) {
        this.ZT.Z_();
        return;
      } 
      return;
    } 
    this.ZT.Z_();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbz0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */