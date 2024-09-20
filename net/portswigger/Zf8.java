package net.portswigger;

import burp.Zbqc;

@Zsi("ApiKeyAuthentication")
public final class Zf8 extends Zf5 implements Zlf {
  @Zvd(Zp = "destination")
  public final Zde ZJ;
  
  @Zvd(Zp = "targetParameterName")
  public final String ZP;
  
  @Zvd(Zp = "key")
  public final String Zr;
  
  @Zox
  public Zf8(@Zc5(Ze = "wasDetected") boolean paramBoolean, @Zc5(Ze = "label") String paramString1, @Zc5(Ze = "destination") Zde paramZde, @Zc5(Ze = "targetParameterName") String paramString2, @Zc5(Ze = "key") String paramString3) {
    super(paramBoolean, paramString1);
    this.ZJ = paramZde;
    this.ZP = paramString2;
    this.Zr = paramString3;
    boolean bool = Zf5.Zv();
    if (!bool)
      Zbqc.Zr(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zf8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */