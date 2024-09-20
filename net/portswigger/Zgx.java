package net.portswigger;

import java.util.Objects;

@Zt8(Zd = "TaskProgress", ZC = {Zgj.class, Zgu.class}, ZQ = true)
public abstract class Zgx {
  @Zvd(Zp = "taskId")
  public final String Za;
  
  @Zvd(Zp = "scanStatus")
  public final Zdc ZZ;
  
  @Zvd(Zp = "message")
  public final String ZU;
  
  @Zvd(Zp = "errorCode")
  public final Integer Zx;
  
  private static String ZB;
  
  public Zgx(String paramString1, Zdc paramZdc, String paramString2, Integer paramInteger) {
    this.Za = paramString1;
    this.ZZ = paramZdc;
    this.ZU = paramString2;
    this.Zx = paramInteger;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zgu zgu = (Zgu)paramObject;
    return (Objects.equals(this.Za, zgu.Za) && this.ZZ == zgu.ZZ && Objects.equals(this.ZU, zgu.ZU) && Objects.equals(this.Zx, zgu.Zx));
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.Za, this.ZZ, this.ZU, this.Zx });
  }
  
  public static void ZC(String paramString) {
    ZB = paramString;
  }
  
  public static String ZP() {
    return ZB;
  }
  
  static {
    if (ZP() == null)
      ZC("NqgVU"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zgx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */