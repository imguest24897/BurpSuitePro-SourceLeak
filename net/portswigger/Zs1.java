package net.portswigger;

@Zsi("Build")
public class Zs1 {
  @Zvd(Zp = "installationType")
  public final Zt5 Za;
  
  @Zvd(Zp = "filename")
  public final String ZX;
  
  @Zvd(Zp = "fileSize")
  public final int ZH;
  
  private static String Zn;
  
  @Zox
  public Zs1(@Zc5(Ze = "installationType") Zt5 paramZt5, @Zc5(Ze = "filename") String paramString, @Zc5(Ze = "fileSize") int paramInt) {
    this.Za = paramZt5;
    this.ZX = paramString;
    this.ZH = paramInt;
  }
  
  public static void ZR(String paramString) {
    Zn = paramString;
  }
  
  public static String ZW() {
    return Zn;
  }
  
  static {
    if (ZW() == null)
      ZR("UEGvCb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zs1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */