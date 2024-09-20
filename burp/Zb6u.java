package burp;

import java.util.List;

public class Zb6u {
  public final Zeup Zv;
  
  public final String ZQ;
  
  public final String ZI;
  
  public final String Zy;
  
  public final boolean ZJ;
  
  private static int[] ZY;
  
  Zb6u(Zeup paramZeup, String paramString1, String paramString2) {
    this.Zv = paramZeup;
    this.ZQ = paramString1;
    this.ZI = paramString2;
    this.Zy = paramZeup.initialTranscoder.ZM(paramString2);
    this.ZJ = paramZeup.showNameInDetails;
  }
  
  public Zb6u ZV(String paramString1, String paramString2) {
    return new Zb6u(this.Zv, paramString1, paramString2);
  }
  
  public List<Ztkm> ZY(boolean paramBoolean) {
    return Zt4w.ZB(paramBoolean, this.ZI, this.Zv.initialTranscoder, this.Zy);
  }
  
  public static void Zb(int[] paramArrayOfint) {
    ZY = paramArrayOfint;
  }
  
  public static int[] ZI() {
    return ZY;
  }
  
  static {
    if (ZI() != null)
      Zb(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb6u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */