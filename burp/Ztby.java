package burp;

public final class Ztby {
  private static Zbqc[] Zj;
  
  static void ZM(Zs73 paramZs731, Zs73 paramZs732) {
    paramZs732.ZU(paramZs731.ZTU());
    paramZs732.ZC(paramZs731.ZTF());
    Zbqc[] arrayOfZbqc = Zf();
    paramZs732.Zy(paramZs731.ZTI());
    if (Zbqc.Zwu() == null)
      ZA(new Zbqc[5]); 
  }
  
  public static void ZA(Zbqc[] paramArrayOfZbqc) {
    Zj = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zf() {
    return Zj;
  }
  
  static {
    if (Zf() == null)
      ZA(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztby.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */