package burp;

public abstract class Zf8 extends Zni implements Zrho {
  @Zzvo(1)
  public final Zeib ZR;
  
  private final Ztfy Ze;
  
  private static boolean Zu;
  
  protected Zf8(Zeib paramZeib, Ztfy paramZtfy) {
    this.ZR = paramZeib;
    this.Ze = paramZtfy;
  }
  
  public Ztfy ZAX() {
    return this.Ze;
  }
  
  public Zm6i ZAA() {
    return this.ZR.Zja();
  }
  
  public Zeib ZAl() {
    return this.ZR;
  }
  
  public boolean equals(Object paramObject) {
    return Zl65.Zf(this, paramObject);
  }
  
  public String toString() {
    return Zl65.ZV(this);
  }
  
  public boolean Zt(Zeib paramZeib) {
    return Zl65.ZC(this, paramZeib);
  }
  
  @Zzvo(2)
  private int Zi8() {
    return this.Ze.id;
  }
  
  public static void Zw(boolean paramBoolean) {
    Zu = paramBoolean;
  }
  
  public static boolean Zib() {
    return Zu;
  }
  
  public static boolean Zi7() {
    boolean bool = Zib();
    return !bool;
  }
  
  static {
    if (!Zi7())
      Zw(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zf8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */