package burp;

import java.util.Set;

public class Zb8b implements Zkbn {
  private final String ZR;
  
  private final boolean ZF;
  
  private final Zmf_ Zm;
  
  private final Set<Zmln> Zn;
  
  private static String[] Zd;
  
  Zb8b(Zrve paramZrve) {
    this(paramZrve.Zd(), paramZrve.ZU(), paramZrve.ZR(), paramZrve.Zw().<Zmln>toArray(new Zmln[0]));
  }
  
  public Zb8b(String paramString, boolean paramBoolean, Zmf_ paramZmf_, Zmln... paramVarArgs) {
    this.ZR = paramString;
    this.ZF = paramBoolean;
    this.Zm = paramZmf_;
    this.Zn = Zb99.Zn(paramVarArgs);
  }
  
  public String Zd() {
    return this.ZR;
  }
  
  public Set<Zmln> Zw() {
    return this.Zn;
  }
  
  public boolean ZU() {
    return this.ZF;
  }
  
  public Zmf_ ZR() {
    return this.Zm;
  }
  
  public static void ZB(String[] paramArrayOfString) {
    Zd = paramArrayOfString;
  }
  
  public static String[] ZH() {
    return Zd;
  }
  
  static {
    if (ZH() != null)
      ZB(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb8b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */