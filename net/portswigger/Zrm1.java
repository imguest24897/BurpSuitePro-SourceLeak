package net.portswigger;

@Zsi("ServerError")
public class Zrm1 extends Zrm0 implements Zc2 {
  @Zvd(Zp = "code")
  public final Integer ZR;
  
  @Zvd(Zp = "error")
  public final String ZK;
  
  @Zox
  public Zrm1(@Zc5(Ze = "code", ZS = "null") Integer paramInteger, @Zc5(Ze = "error") String paramString) {
    super(paramString);
    this.ZR = paramInteger;
    this.ZK = paramString;
  }
  
  public Zrm1(String paramString) {
    this(null, paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrm1.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */