package burp;

public final class Zkhk {
  private static Zbqc[] Zc;
  
  static void Zc(Zrss paramZrss1, Zrss paramZrss2) {
    paramZrss2.ZWK(paramZrss1.ZAs());
    paramZrss2.ZV(paramZrss1.Zm7());
  }
  
  public static void Zy(Zbqc[] paramArrayOfZbqc) {
    Zc = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZD() {
    return Zc;
  }
  
  static {
    if (ZD() != null)
      Zy(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkhk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */