package net.portswigger;

import burp.Zbqc;
import java.util.List;

@Zsi("ApiParameter")
public class Ziu implements Zg6 {
  @Zvd(Zp = "id")
  public final String ZE;
  
  @Zvd(Zp = "endpointId")
  public final String ZW;
  
  @Zvd(Zp = "values")
  public final List<Zm3> ZZ;
  
  @Zox
  public Ziu(@Zc5(Ze = "id") String paramString1, @Zc5(Ze = "endpointId") String paramString2, @Zc5(Ze = "values") List<Zm3> paramList) {
    this.ZE = paramString1;
    this.ZW = paramString2;
    int[] arrayOfInt = Zm3.Zc();
    this.ZZ = paramList;
    if (Zbqc.Zwu() == null)
      Zm3.Zl(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Ziu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */