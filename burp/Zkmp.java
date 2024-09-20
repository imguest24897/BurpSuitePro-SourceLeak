package burp;

public abstract class Zkmp {
  private final String Zf;
  
  private static int[] ZU;
  
  public Zkmp(String paramString) {
    this.Zf = paramString;
  }
  
  public String ZS() {
    return this.Zf;
  }
  
  public abstract int Zv();
  
  public static void Zf(int[] paramArrayOfint) {
    ZU = paramArrayOfint;
  }
  
  public static int[] ZE() {
    return ZU;
  }
  
  static {
    if (ZE() == null)
      Zf(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkmp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */