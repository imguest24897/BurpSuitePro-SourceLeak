package burp;

class Zzcj extends Zzcf {
  final Zlgp ZH;
  
  private Zzcj(Zlgp paramZlgp) {}
  
  public void ZP() {
    this.ZH.ZV.Zo(this);
    Zbsv.Zb(this::lambda$onTestCaseAdded$1);
  }
  
  private void lambda$onTestCaseAdded$1() {
    this.ZH.Zb.ZP(this.ZH.Za);
    this.ZH.ZX.forEach(this::lambda$onTestCaseAdded$0);
  }
  
  private void lambda$onTestCaseAdded$0(Zebp paramZebp) {
    paramZebp.ZN(this.ZH);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzcj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */