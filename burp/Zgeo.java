package burp;

class Zgeo extends Zgb5 {
  final Runnable ZW;
  
  Zgeo(Zkc0 paramZkc0, Zvo6 paramZvo6, Zb0h paramZb0h, Zrfb paramZrfb, Runnable paramRunnable) {
    super(paramZvo6, paramZb0h, paramZrfb);
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    if (paramInt == 141648) {
      this.ZW.run();
      return true;
    } 
    return super.ZI(paramInt, paramObject);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgeo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */