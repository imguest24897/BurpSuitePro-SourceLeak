package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zz01 {
  private final Zlnv ZZ;
  
  private final Zra1 Zi;
  
  public Zz01(Zlnv paramZlnv, Zra1 paramZra1) {
    this.ZZ = paramZlnv;
    this.Zi = paramZra1;
  }
  
  public Zkvo Zj(String paramString, Object[] paramArrayOfObject) {
    String str2 = (String)paramArrayOfObject[0];
    String str3 = (String)paramArrayOfObject[1];
    String str1 = Ztph.Zr();
    long l = ((Long)paramArrayOfObject[2]).longValue();
    int i = ((Integer)paramArrayOfObject[3]).intValue();
    Ze9m ze9m = Ze9m.Zx((paramArrayOfObject.length > 4) ? (String)paramArrayOfObject[4] : null);
    boolean bool = (paramArrayOfObject.length > 5) ? Integer.parseInt((String)paramArrayOfObject[5]) : false;
    String str4 = (paramArrayOfObject.length > 6) ? (String)paramArrayOfObject[6] : null;
    Zxje zxje = ZS(paramString, str4);
    if (str1 == null)
      Zbqc.Zr(new Zbqc[2]); 
    return new Zg2f(paramString, str2, str3, l, i, ze9m, bool, str4, zxje, this.ZZ);
  }
  
  private Zxje ZS(String paramString1, String paramString2) {
    if (paramString2 != null)
      try {
        Object[] arrayOfObject = this.ZZ.Zt(paramString2, Zra1.EXECUTION_MODE_ENTERPRISE_AGENT);
        return Zxje.ZF(((Long)arrayOfObject[2]).longValue());
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.IGNORED);
        return Zxje.ZX();
      } finally {
        try {
          this.ZZ.Zt(paramString1, this.Zi);
        } catch (Exception exception) {
          Zah.Zl(exception, Zk_.IMPOSSIBLE);
        } 
      }  
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz01.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */