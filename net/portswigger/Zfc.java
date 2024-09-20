package net.portswigger;

import burp.Zbqc;
import java.util.List;

@Zsi("Update")
public class Zfc {
  @Zvd(Zp = "productType")
  public final Zce Zq;
  
  @Zvd(Zp = "version")
  public final String Zu;
  
  @Zvd(Zp = "isStable")
  @Deprecated
  public final boolean ZF;
  
  @Zvd(Zp = "description")
  public final String Ze;
  
  @Zvd(Zp = "releaseNotesUrl")
  public final String ZI;
  
  @Zvd(Zp = "builds")
  public final List<Zs1> Zp;
  
  @Zvd(Zp = "number")
  public final Integer ZG;
  
  @Zox
  public Zfc(@Zc5(Ze = "productType") Zce paramZce, @Zc5(Ze = "version") String paramString1, @Zc5(Ze = "isStable") boolean paramBoolean, @Zc5(Ze = "description") String paramString2, @Zc5(Ze = "releaseNotesUrl") String paramString3, @Zc5(Ze = "builds") List<Zs1> paramList, @Zc5(Ze = "number") Integer paramInteger) {
    this.Zq = paramZce;
    this.Zu = paramString1;
    this.ZF = paramBoolean;
    String str = Zs1.ZW();
    this.Ze = paramString2;
    this.ZI = paramString3;
    this.Zp = paramList;
    this.ZG = paramInteger;
    if (Zbqc.Zwu() == null)
      Zs1.ZR("L6fhf"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zfc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */