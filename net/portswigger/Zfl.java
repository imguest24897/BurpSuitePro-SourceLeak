package net.portswigger;

import burp.Zbqc;

@Zsi("BasicAuthentication")
public final class Zfl extends Zf5 implements Zlf {
  @Zvd(Zp = "username")
  public final String ZO;
  
  @Zvd(Zp = "password")
  public final String ZB;
  
  @Zox
  public Zfl(@Zc5(Ze = "wasDetected") boolean paramBoolean, @Zc5(Ze = "label") String paramString1, @Zc5(Ze = "username") String paramString2, @Zc5(Ze = "password") String paramString3) {
    super(paramBoolean, paramString1);
    this.ZO = paramString2;
    boolean bool = Zf5.Zp();
    this.ZB = paramString3;
    if (Zbqc.Zwu() == null)
      Zf5.Zu(!bool); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zfl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */