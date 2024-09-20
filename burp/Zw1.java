package burp;

public class Zw1 extends Zni implements Zraj {
  @Zzvo(1)
  private final String ZB;
  
  private final Zx8r ZL;
  
  @Zzvo(3)
  private final Zmkf ZR;
  
  private static int[] Zi;
  
  Zw1(String paramString, Zx8r paramZx8r, Zmkf paramZmkf) {
    this.ZB = paramString;
    this.ZL = paramZx8r;
    this.ZR = paramZmkf;
  }
  
  public String ZCm() {
    return this.ZB;
  }
  
  public Zx8r ZCX() {
    return (this.ZL == null) ? Zx8r.NONE : this.ZL;
  }
  
  public Zmkf ZCy() {
    return this.ZR;
  }
  
  public Zeu4<Zraj> ZF() {
    return Zraj.Zu;
  }
  
  @Zzvo(2)
  private byte ZCW() {
    return ZCX().ZT();
  }
  
  public static void ZG(int[] paramArrayOfint) {
    Zi = paramArrayOfint;
  }
  
  public static int[] ZCe() {
    return Zi;
  }
  
  static {
    if (ZCe() == null)
      ZG(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zw1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */