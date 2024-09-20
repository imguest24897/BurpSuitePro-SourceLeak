package burp;

public class Zug extends Zni implements Zz8z {
  @Zzvo(0)
  private int ZD;
  
  @Zzvo(1)
  private int ZL;
  
  @Zzvo(2)
  private boolean Za;
  
  @Zzvo(3)
  private boolean ZW;
  
  @Zzvo(4)
  private boolean Zs;
  
  @Zzvo(5)
  private boolean Zu;
  
  @Zzvo(6)
  private int Zj;
  
  @Zzvo(7)
  private int ZU;
  
  private static int Zo;
  
  public Zlk4 ZqT() {
    return Zlk4.ZC(this.ZD);
  }
  
  public void ZH(Zlk4 paramZlk4) {
    this.ZD = paramZlk4.speed;
  }
  
  public Zeko ZqM() {
    return Zeko.Zw(this.ZL);
  }
  
  public void ZX(Zeko paramZeko) {
    this.ZL = paramZeko.accuracy;
  }
  
  public boolean Zqo() {
    return this.Za;
  }
  
  public void Zi6(boolean paramBoolean) {
    this.Za = paramBoolean;
  }
  
  public boolean Zqb() {
    return this.ZW;
  }
  
  public void Zi9(boolean paramBoolean) {
    this.ZW = paramBoolean;
  }
  
  public boolean Zql() {
    return this.Zs;
  }
  
  public void Ziz(boolean paramBoolean) {
    this.Zs = paramBoolean;
  }
  
  public boolean ZqP() {
    return this.Zu;
  }
  
  public void ZiM(boolean paramBoolean) {
    this.Zu = paramBoolean;
  }
  
  public int ZqB() {
    return this.Zj;
  }
  
  public void Zi4(int paramInt) {
    this.Zj = paramInt;
  }
  
  public int ZqC() {
    return this.ZU;
  }
  
  public void Zic(int paramInt) {
    this.ZU = paramInt;
  }
  
  public Zeu4<? extends Zz8z> ZF() {
    return Zz8z.ZG;
  }
  
  public static void ZBN(int paramInt) {
    Zo = paramInt;
  }
  
  public static int Zax() {
    return Zo;
  }
  
  public static int Zaz() {
    int i = Zax();
    return (i == 0) ? 7 : 0;
  }
  
  static {
    if (Zaz() == 0)
      ZBN(94); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zug.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */