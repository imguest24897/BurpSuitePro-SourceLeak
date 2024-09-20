package net.portswigger;

import burp.Zbqc;

@Zsi("RequestResponse")
public class Zia {
  @Zvd(Zp = "url")
  public final String Zp;
  
  @Zvd(Zp = "request")
  public final Zca[] Zq;
  
  @Zvd(Zp = "response")
  public final Zca[] Zy;
  
  @Zvd(Zp = "wasRedirectFollowed")
  public final boolean Zf;
  
  @Zvd(Zp = "requestTime")
  public final long Zu;
  
  @Zvd(Zp = "comment")
  public final String ZP;
  
  @Zox
  public Zia(@Zc5(Ze = "url") String paramString1, @Zc5(Ze = "request") Zca[] paramArrayOfZca1, @Zc5(Ze = "response", ZS = "null") Zca[] paramArrayOfZca2, @Zc5(Ze = "wasRedirectFollowed") boolean paramBoolean, @Zc5(Ze = "requestTime") long paramLong, @Zc5(Ze = "comment", ZS = "null") String paramString2) {
    this.Zp = paramString1;
    this.Zq = paramArrayOfZca1;
    this.Zy = paramArrayOfZca2;
    this.Zf = paramBoolean;
    this.Zu = paramLong;
    String[] arrayOfString = Zuv.Za();
    this.ZP = paramString2;
    if (Zbqc.Zwu() == null)
      Zuv.ZR(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zia.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */