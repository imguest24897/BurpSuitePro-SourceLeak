package burp;

public class Zgxt<T> extends Zgxr<T> {
  private final Zln7<T> Zp;
  
  private final Runnable Zo;
  
  private Zgxt(Zln7<T> paramZln7, Runnable paramRunnable) {
    this.Zp = paramZln7;
    this.Zo = paramRunnable;
  }
  
  public static <T> void Zu(Zln7<T> paramZln7, Runnable paramRunnable) {
    paramZln7.Zb(new Zgxt<>(paramZln7, paramRunnable));
  }
  
  public void Za() {
    this.Zp.ZA(this);
    this.Zo.run();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgxt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */