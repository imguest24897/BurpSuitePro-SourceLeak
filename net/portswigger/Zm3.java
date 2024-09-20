package net.portswigger;

import java.util.List;

@Zsi("ApiValue")
public class Zm3 implements Zt4 {
  @Zvd(Zp = "value")
  public final List<String> ZR;
  
  private static int[] ZJ;
  
  @Zox
  public Zm3(@Zc5(Ze = "value") List<String> paramList) {
    this.ZR = paramList;
  }
  
  public static void Zl(int[] paramArrayOfint) {
    ZJ = paramArrayOfint;
  }
  
  public static int[] Zc() {
    return ZJ;
  }
  
  static {
    if (Zc() == null)
      Zl(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zm3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */