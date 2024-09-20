package burp;

public class Zzqv {
  private static int[] Z_;
  
  public static boolean ZR(Zzys paramZzys, Object paramObject) {
    if (Zewd.ZI(paramZzys, (Zgpi)paramObject))
      return true; 
    if (paramObject == null || paramZzys.getClass() != paramObject.getClass())
      return false; 
    Zzys zzys = (Zzys)paramObject;
    return (paramZzys.ZdT() == zzys.ZdT() && paramZzys.Zdy() == zzys.Zdy() && paramZzys.ZNH().equals(zzys.ZNH()) && paramZzys.ZNJ().equals(zzys.ZNJ()));
  }
  
  public static void Z_(int[] paramArrayOfint) {
    Z_ = paramArrayOfint;
  }
  
  public static int[] ZD() {
    return Z_;
  }
  
  static {
    if (ZD() == null)
      Z_(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzqv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */