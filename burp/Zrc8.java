package burp;

public abstract class Zrc8 implements Zstg {
  protected final Zio Zx;
  
  private static int[] ZM;
  
  protected Zrc8(Zio paramZio) {
    this.Zx = paramZio;
  }
  
  public static void Zr(int[] paramArrayOfint) {
    ZM = paramArrayOfint;
  }
  
  public static int[] Zp() {
    return ZM;
  }
  
  static {
    if (Zp() == null)
      Zr(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrc8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */