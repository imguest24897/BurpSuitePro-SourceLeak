package burp;

public class Zm4y implements Zgbi {
  private Zesp ZL;
  
  private Zesp ZP;
  
  private static int[] Zc;
  
  public Zm4y(Zesp paramZesp1, Zesp paramZesp2) {
    this.ZL = paramZesp1;
    this.ZP = paramZesp2;
  }
  
  public Zesp Zm() {
    return this.ZL;
  }
  
  public Zesp ZX() {
    return this.ZP;
  }
  
  public static void Z_(int[] paramArrayOfint) {
    Zc = paramArrayOfint;
  }
  
  public static int[] Zd() {
    return Zc;
  }
  
  static {
    if (Zd() == null)
      Z_(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm4y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */