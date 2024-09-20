package burp;

public class Zm8y {
  private final String ZQ;
  
  private final String Zc;
  
  private final Zk97 Zj;
  
  private static String[] ZD;
  
  public Zm8y(String paramString1, String paramString2, Zk97 paramZk97) {
    this.ZQ = paramString1;
    this.Zc = paramString2;
    String[] arrayOfString = Zm();
    this.Zj = paramZk97;
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public String ZD() {
    return this.ZQ;
  }
  
  public String ZK() {
    return this.Zc;
  }
  
  public Zk97 ZQ() {
    return this.Zj;
  }
  
  public static void Zg(String[] paramArrayOfString) {
    ZD = paramArrayOfString;
  }
  
  public static String[] Zm() {
    return ZD;
  }
  
  static {
    if (Zm() == null)
      Zg(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm8y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */