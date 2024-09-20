package burp;

public class Zt3i {
  private final String ZD;
  
  private final String Zm;
  
  private final String Zh;
  
  private final Zzav ZP;
  
  private final Zmtz Zi;
  
  private final Zzr7 Zx;
  
  private final Zryz ZA;
  
  private static int[] ZY;
  
  public Zt3i(String paramString1, String paramString2, String paramString3, Zzav paramZzav, Zmtz paramZmtz) {
    this.ZD = paramString1;
    this.Zm = paramString2;
    this.Zh = paramString3;
    this.ZP = paramZzav;
    this.Zi = paramZmtz;
    this.Zx = new Zzr7(paramZzav, paramZmtz);
    this.ZA = new Zryz(paramString1, this.Zx);
  }
  
  public String ZN() {
    return this.ZD;
  }
  
  public String ZF() {
    return this.Zm;
  }
  
  public String Zm() {
    return this.Zh;
  }
  
  public Zzr7 Zh() {
    return this.Zx;
  }
  
  public Zryz ZT() {
    return this.ZA;
  }
  
  public static void ZQ(int[] paramArrayOfint) {
    ZY = paramArrayOfint;
  }
  
  public static int[] Zu() {
    return ZY;
  }
  
  static {
    if (Zu() != null)
      ZQ(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt3i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */