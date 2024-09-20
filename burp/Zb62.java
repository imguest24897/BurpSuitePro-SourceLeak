package burp;

class Zb62 {
  static final Zxr8<Void> ZL = new Zxr8<>(Zt1n.ZY);
  
  private final Zz1m<Zt1n> Z_;
  
  private final int Zp;
  
  private final Object ZD;
  
  private int Zv;
  
  private int ZW;
  
  private int ZV;
  
  Zb62(Zz1m<Zt1n> paramZz1m, Zlli<Zt1x> paramZlli, Zlli<Zt1o> paramZlli1, int paramInt) {
    this.Z_ = paramZz1m;
    this.Zp = paramInt;
    this.ZW = paramInt;
    this.ZD = new Object();
    paramZlli.ZE(Zt1x.Zl, this::lambda$new$0);
    paramZlli1.ZE(Zt1o.Zt, this::lambda$new$1);
    paramZlli1.ZE(Zt1o.Zx, this::lambda$new$2);
    paramZlli1.ZE(Zt1o.ZH, this::lambda$new$3);
  }
  
  private void ZK(Zbs1 paramZbs1) {
    synchronized (this.ZD) {
      this.Zv = Math.max(this.Zv, paramZbs1.ZO());
      this.ZW = Math.max(this.ZW, paramZbs1.Zc() + this.Zp);
    } 
    ZD();
  }
  
  private void ZP(Zebg paramZebg) {
    synchronized (this.ZD) {
      this.ZV = Math.max(this.ZV, paramZebg.ZaK() + paramZebg.ZaU() + paramZebg.Za8() + paramZebg.Zab());
    } 
    ZD();
  }
  
  private void ZD() {
    Zgg8 zgg8;
    synchronized (this.ZD) {
      zgg8 = new Zgg8(this.Zv, this.ZV, this.ZW);
    } 
    this.Z_.ZD(new Zxr8(Zt1n.ZR, zgg8));
  }
  
  private void ZY() {
    this.Z_.ZD(ZL);
  }
  
  private void ZE() {
    this.Z_.ZD(ZL);
  }
  
  private void lambda$new$3(Zxr8 paramZxr8) {
    ZE();
  }
  
  private void lambda$new$2(Zxr8 paramZxr8) {
    ZY();
  }
  
  private void lambda$new$1(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZP);
  }
  
  private void lambda$new$0(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZK);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb62.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */