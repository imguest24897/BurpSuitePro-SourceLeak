package burp;

public class Zlhj {
  final String ZO;
  
  final String Zn;
  
  final byte Zh;
  
  Zlhj(String paramString1, String paramString2) {
    this(paramString1, paramString2, Zmtd.ZN(paramString2));
  }
  
  private Zlhj(String paramString1, String paramString2, byte paramByte) {
    this.ZO = paramString1;
    this.Zn = paramString2;
    this.Zh = paramByte;
  }
  
  public static Zlhj Zl() {
    return new Zlhj(null, null);
  }
  
  public static Zlhj Zw(Zsxd paramZsxd) {
    return new Zlhj(paramZsxd.ZZ(), Zmtd.Zm(paramZsxd.Zn()), paramZsxd.Zn());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlhj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */