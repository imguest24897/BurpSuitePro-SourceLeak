package net.portswigger;

import java.io.IOException;
import java.io.InputStream;

public class Zus {
  private final Zhy Zm;
  
  private final Zll Zt;
  
  private final Zgd ZP;
  
  private final Z_1 ZC;
  
  private static int[] ZN;
  
  public Zus(Zhy paramZhy, Zll paramZll, Zgd paramZgd, Z_1 paramZ_1) {
    this.Zm = paramZhy;
    this.Zt = paramZll;
    this.ZP = paramZgd;
    this.ZC = paramZ_1;
  }
  
  public static Zus ZN() {
    return new Zus(new Zol(), new Zmi(), Zus::lambda$defaultParser$0, new Ztm());
  }
  
  public Zom Zp(InputStream paramInputStream) throws IOException, Zib {
    return this.Zm.Zi(paramInputStream);
  }
  
  public Zvw Zn(InputStream paramInputStream) throws IOException, Zib {
    return this.Zt.ZM(paramInputStream, this.ZP, Zve.RESPONSE);
  }
  
  public byte[] ZO(Zvw paramZvw, InputStream paramInputStream) throws IOException, Zib {
    return this.ZC.Zn(paramZvw, paramInputStream);
  }
  
  private static boolean lambda$defaultParser$0(Zvw paramZvw, String paramString1, String paramString2) throws Zib {
    return true;
  }
  
  public static void ZL(int[] paramArrayOfint) {
    ZN = paramArrayOfint;
  }
  
  public static int[] Zk() {
    return ZN;
  }
  
  static {
    if (Zk() != null)
      ZL(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zus.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */