package burp;

class Zbxo {
  private final int Zb;
  
  private final boolean ZE;
  
  private int ZS;
  
  private boolean Zq;
  
  private Zbxo(int paramInt, boolean paramBoolean) {
    this.Zb = paramInt;
    this.ZE = paramBoolean;
  }
  
  static Zbxo ZE(int paramInt) {
    return new Zbxo(paramInt, true);
  }
  
  static Zbxo Zd(int paramInt) {
    return new Zbxo(paramInt, false);
  }
  
  private Zbxo Zr(int paramInt) {
    this.ZS = paramInt;
    this.Zq = true;
    return this;
  }
  
  private Zbxo ZZ(int paramInt) {
    this.ZS = paramInt;
    this.Zq = false;
    return this;
  }
  
  private Zzin ZS() {
    return new Zzin(this.Zb, this.ZE, this.ZS, this.Zq, true);
  }
  
  private Zzin Zg() {
    return new Zzin(this.Zb, this.ZE, this.ZS, this.Zq, false);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbxo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */