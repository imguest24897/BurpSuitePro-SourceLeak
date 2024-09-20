package net.portswigger;

@Zsi("HookedMethod")
public class Zgr {
  @Zvd(Zp = "platform")
  public final int Zy;
  
  @Zvd(Zp = "targetApi")
  public final int ZI;
  
  @Zvd(Zp = "signature")
  public final String Zz;
  
  @Zvd(Zp = "targetParameter")
  public final String ZR;
  
  @Zvd(Zp = "targetParameterValue")
  public final String ZU;
  
  @Zvd(Zp = "stackTrace")
  public final String Zr;
  
  @Zox
  public Zgr(@Zc5(Ze = "platform") int paramInt1, @Zc5(Ze = "targetApi") int paramInt2, @Zc5(Ze = "signature") String paramString1, @Zc5(Ze = "targetParameter", ZS = "null") String paramString2, @Zc5(Ze = "targetParameterValue", ZS = "null") String paramString3, @Zc5(Ze = "stackTrace", ZS = "null") String paramString4) {
    this.Zy = paramInt1;
    this.ZI = paramInt2;
    this.Zz = paramString1;
    this.ZR = paramString2;
    this.ZU = paramString3;
    this.Zr = paramString4;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zgr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */