package burp;

public class Zgig {
  private static String[] Zs;
  
  public Zzxc Zv(String paramString) {
    String[] arrayOfString = Zg();
    try {
      switch (Zkcv.Zr[Zeng.Zx(paramString).ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      if (Zbqc.Zwu() == null)
        ZS(new String[5]); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return (new Zego()).ZJ(paramString);
  }
  
  public static void ZS(String[] paramArrayOfString) {
    Zs = paramArrayOfString;
  }
  
  public static String[] Zg() {
    return Zs;
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
  
  static {
    if (Zg() != null)
      ZS(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */