package burp;

class Zl98 implements Zg90 {
  private final Zg90 ZW;
  
  private final Runnable ZF;
  
  Zl98(Zg90 paramZg90, Runnable paramRunnable) {
    this.ZW = paramZg90;
    this.ZF = paramRunnable;
  }
  
  public void Zf(int[] paramArrayOfint) {
    this.ZF.run();
    this.ZW.Zf(paramArrayOfint);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl98.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */