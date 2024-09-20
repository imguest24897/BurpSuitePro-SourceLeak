package net.portswigger;

import burp.Zbqc;

@Zsi("IssueEvent")
public class Z_g {
  @Zvd(Zp = "id")
  public final String Zz;
  
  @Zvd(Zp = "type")
  public final Zzy ZU;
  
  @Zvd(Zp = "issue")
  public final Zuv ZI;
  
  private static int[] Z_;
  
  @Zox
  public Z_g(@Zc5(Ze = "id") String paramString, @Zc5(Ze = "type") Zzy paramZzy, @Zc5(Ze = "issue") Zuv paramZuv) {
    this.Zz = paramString;
    this.ZU = paramZzy;
    int[] arrayOfInt = ZX();
    this.ZI = paramZuv;
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public static void ZV(int[] paramArrayOfint) {
    Z_ = paramArrayOfint;
  }
  
  public static int[] ZX() {
    return Z_;
  }
  
  static {
    if (ZX() == null)
      ZV(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Z_g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */