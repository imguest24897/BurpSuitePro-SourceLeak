package burp;

public abstract class Zse9<T> implements Zs0y<T> {
  private static boolean Z_;
  
  public Zs0y<T> ZW(Zs0y<T> paramZs0y) {
    return new Zsa0<>(this, paramZs0y);
  }
  
  public Zs0y<T> Zh(Zs0y<T> paramZs0y) {
    return new Zsa_<>(this, paramZs0y);
  }
  
  public Zs0y<T> ZB(Zs0y<T> paramZs0y) {
    return new Zsas<>(this, paramZs0y);
  }
  
  public Zs0y<T> ZJ() {
    return new Zsap<>(this);
  }
  
  public String toString() {
    return getClass().getSimpleName();
  }
  
  public static void ZH(boolean paramBoolean) {
    Z_ = paramBoolean;
  }
  
  public static boolean Zd() {
    return Z_;
  }
  
  public static boolean ZS() {
    boolean bool = Zd();
    return !bool;
  }
  
  static {
    if (!Zd())
      ZH(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zse9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */