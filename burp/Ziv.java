package burp;

import burp.api.montoya.core.BurpSuiteEdition;

public class Ziv implements Zgs1 {
  private final Zzxi Zr;
  
  private static int[] ZP;
  
  public Ziv(Zzxi paramZzxi) {
    this.Zr = paramZzxi;
  }
  
  public BurpSuiteEdition Zq() {
    int[] arrayOfInt = Zp();
    Zra1 zra1 = this.Zr.ZM();
    boolean bool = (zra1 == Zra1.EXECUTION_MODE_ENTERPRISE_AGENT || zra1 == Zra1.EXECUTION_MODE_ENTERPRISE_SERVER) ? true : false;
    if (bool)
      return BurpSuiteEdition.ENTERPRISE_EDITION; 
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[3]); 
    return BurpSuiteEdition.PROFESSIONAL;
  }
  
  public static void ZQ(int[] paramArrayOfint) {
    ZP = paramArrayOfint;
  }
  
  public static int[] Zp() {
    return ZP;
  }
  
  static {
    if (Zp() == null)
      ZQ(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ziv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */