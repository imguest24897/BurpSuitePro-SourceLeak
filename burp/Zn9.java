package burp;

public class Zn9 extends Zni implements Zrb5 {
  @Zzvo(0)
  private String Ze;
  
  private static int[] ZL;
  
  public String ZJ() {
    return (this.Ze == null) ? "" : this.Ze;
  }
  
  public void Ze(String paramString) {
    this.Ze = paramString;
  }
  
  public Zeu4<Zrb5> ZF() {
    return Zrb5.Zh;
  }
  
  public static void ZI(int[] paramArrayOfint) {
    ZL = paramArrayOfint;
  }
  
  public static int[] Zs() {
    return ZL;
  }
  
  static {
    if (Zs() == null)
      ZI(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zn9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */