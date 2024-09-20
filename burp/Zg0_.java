package burp;

class Zg0_ implements Ztk5 {
  final Zbd7 ZO;
  
  private Zg0_(Zbd7 paramZbd7) {}
  
  public void ZW() {
    this.ZO.Zc();
  }
  
  public void ZJ() {
    this.ZO.Zw();
  }
  
  public void ZH() {
    if (this.ZO.ZE.size() != 1)
      return; 
    int i = ((Integer)this.ZO.ZE.getFirst()).intValue();
    this.ZO.ZE.set(0, Integer.valueOf(i - 1));
    this.ZO.ZX.ZY(i);
  }
  
  public void ZM() {
    if (this.ZO.ZE.size() != 1)
      return; 
    int i = ((Integer)this.ZO.ZE.getFirst()).intValue();
    this.ZO.ZE.set(0, Integer.valueOf(i + 1));
    this.ZO.ZX.ZO(i);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg0_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */