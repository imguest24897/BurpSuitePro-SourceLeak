package net.portswigger;

import burp.Zbqc;

@Zsi("IssueDefinition")
public class Z_n {
  @Zvd(Zp = "issueTypeId")
  public final String Z_;
  
  @Zvd(Zp = "name")
  public final String Zy;
  
  @Zvd(Zp = "description")
  public final String Zn;
  
  @Zvd(Zp = "remediation")
  public final String ZZ;
  
  @Zvd(Zp = "references")
  public final String Zk;
  
  @Zvd(Zp = "vulnerabilityClassifications")
  public final String ZD;
  
  @Zvd(Zp = "retired")
  public final boolean Zs;
  
  private static int[] ZF;
  
  @Zox
  public Z_n(@Zc5(Ze = "issueTypeId") String paramString1, @Zc5(Ze = "name") String paramString2, @Zc5(Ze = "description") String paramString3, @Zc5(Ze = "remediation", ZS = "null") String paramString4, @Zc5(Ze = "references", ZS = "null") String paramString5, @Zc5(Ze = "vulnerabilityClassifications", ZS = "null") String paramString6, @Zc5(Ze = "retired", ZS = "false") boolean paramBoolean) {
    this.Z_ = paramString1;
    this.Zy = paramString2;
    this.Zn = paramString3;
    this.ZZ = paramString4;
    int[] arrayOfInt = ZX();
    this.Zk = paramString5;
    this.ZD = paramString6;
    this.Zs = paramBoolean;
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public static void Zx(int[] paramArrayOfint) {
    ZF = paramArrayOfint;
  }
  
  public static int[] ZX() {
    return ZF;
  }
  
  static {
    if (ZX() == null)
      Zx(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Z_n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */