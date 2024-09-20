package burp;

public class Zem4<T extends Zm9j> {
  private final Zt4r<T> Zl;
  
  private Zem4(Zt4r<T> paramZt4r) {
    this.Zl = paramZt4r;
  }
  
  static <T extends Zm9j> Zem4<T> Zm(Zt4r<T> paramZt4r) {
    return new Zem4<>(paramZt4r);
  }
  
  public static <T extends Zm9j> Zem4<T> Zy() {
    return new Zem4<>(null);
  }
  
  public boolean Zv() {
    return (this.Zl != null);
  }
  
  public boolean Zb(Zem4<?> paramZem4) {
    return (this.Zl != null) ? ((paramZem4.Zl == null || this.Zl.ZS(paramZem4.Zl))) : false;
  }
  
  public Zt4r<T> Zk() {
    return this.Zl;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zem4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */