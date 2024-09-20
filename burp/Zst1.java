package burp;

class Zst1 {
  private final Zm99 ZG;
  
  private final Zm99 ZV;
  
  private int ZA;
  
  private int Zv;
  
  Zst1(Zt00 paramZt00, int paramInt) {
    this.ZG = new Zm99("8".repeat(paramInt));
    this.ZG.ZE(paramZt00);
    this.ZA = (this.ZG.getPreferredSize()).width;
    this.ZV = new Zm99("8".repeat(paramInt));
    this.ZV.ZE(paramZt00);
    this.Zv = (this.ZV.getPreferredSize()).width;
  }
  
  void ZD(Zt00 paramZt00) {
    this.ZG.setFont(paramZt00.ZV());
    this.ZA = (this.ZG.getPreferredSize()).width;
    this.ZV.setFont(paramZt00.ZV());
    this.Zv = (this.ZV.getPreferredSize()).width;
  }
  
  int Zj() {
    return this.ZA;
  }
  
  int Zn() {
    return this.Zv;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zst1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */