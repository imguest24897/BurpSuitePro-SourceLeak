package net.portswigger;

@Zsi("ClientError")
public class Zrme extends Zrm0 implements Zc2 {
  @Zvd(Zp = "code")
  public Integer Zu;
  
  @Zvd(Zp = "error")
  public final String Zx;
  
  @Zox
  public Zrme(@Zc5(Ze = "code", ZS = "null") Integer paramInteger, @Zc5(Ze = "error") String paramString) {
    super(paramString);
    this.Zu = paramInteger;
    this.Zx = paramString;
  }
  
  public Zrme(String paramString) {
    this(null, paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrme.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */