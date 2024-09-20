package burp;

class Zeeu {
  private final Object Zb = new Object();
  
  private Zln7<?> ZS;
  
  Zln7<?> Zo() {
    synchronized (this.Zb) {
      if (this.ZS != null)
        this.ZS.ZH(); 
      return this.ZS = new Zmt4(Zeeu::lambda$createFilter$0);
    } 
  }
  
  void Zs(Zln7<?> paramZln7, Runnable paramRunnable) {
    synchronized (this.Zb) {
      if (this.ZS == paramZln7) {
        paramRunnable.run();
        this.ZS = null;
      } 
    } 
  }
  
  private static boolean lambda$createFilter$0(Object paramObject) {
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeeu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */