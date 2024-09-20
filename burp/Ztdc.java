package burp;

import java.util.ArrayList;
import java.util.List;

public class Ztdc {
  private final List<Zeye> Zt = new ArrayList<>();
  
  private final List<Zeye> ZS;
  
  private final List<Zeye> ZV;
  
  private final List<Zeye> Zu;
  
  private final Zs31 Zs;
  
  private final Ztee Zy;
  
  private final Ztai Zr;
  
  private static int[] ZC;
  
  public Ztdc(Zs31 paramZs31, Ztee paramZtee, Ztai paramZtai) {
    int[] arrayOfInt = Zt();
    this.ZS = new ArrayList<>();
    this.ZV = new ArrayList<>();
    this.Zu = new ArrayList<>();
    this.Zs = paramZs31;
    this.Zy = paramZtee;
    this.Zr = paramZtai;
    if (Zbqc.Zwu() == null)
      ZK(new int[5]); 
  }
  
  public void Zs(Zeye paramZeye) {
    if (this.Zr.Zr(Zzu2.CROSS_ORIGIN_RESOURCE_SHARING_ARBITRARY_ORIGIN))
      this.Zt.add(paramZeye); 
  }
  
  public boolean Zp(Zeye paramZeye) {
    int[] arrayOfInt = Zt();
    if (!paramZeye.ZX())
      return false; 
    if (this.Zs.Zc().equals(paramZeye.Zx.Zc()))
      return false; 
    for (Zeye zeye : this.Zt) {
      if (!paramZeye.ZW(zeye))
        return false; 
      if (arrayOfInt == null)
        break; 
    } 
    return true;
  }
  
  public void Zx(Zeye paramZeye) {
    this.ZS.add(paramZeye);
  }
  
  public void ZR() {
    int[] arrayOfInt = Zt();
    for (Zeye zeye : this.Zt) {
      this.Zy.Zz(zeye);
      if (arrayOfInt == null) {
        Zbqc.Zr(new Zbqc[5]);
        break;
      } 
    } 
    for (Zeye zeye : this.ZS) {
      this.Zy.ZW(zeye);
      if (arrayOfInt == null)
        break; 
    } 
    for (Zeye zeye : this.Zu) {
      this.Zy.ZS(zeye);
      if (arrayOfInt == null)
        break; 
    } 
    if (this.Zt.isEmpty())
      for (Zeye zeye : this.ZV) {
        this.Zy.Zv(zeye);
        if (arrayOfInt == null)
          break; 
      }  
  }
  
  public boolean Zy() {
    return !this.Zt.isEmpty();
  }
  
  void ZM(Zeye paramZeye) {
    if (this.Zu.isEmpty() && this.Zr.Zr(Zzu2.CROSS_ORIGIN_RESOURCE_SHARING))
      this.Zu.add(paramZeye); 
  }
  
  void ZR(Zeye paramZeye) {
    if (this.ZV.isEmpty() && this.Zr.Zr(Zzu2.CROSS_ORIGIN_RESOURCE_SHARING_UNTRUSTED_ORIGIN_TRUSTED))
      this.ZV.add(paramZeye); 
  }
  
  public static void ZK(int[] paramArrayOfint) {
    ZC = paramArrayOfint;
  }
  
  public static int[] Zt() {
    return ZC;
  }
  
  static {
    if (Zt() == null)
      ZK(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztdc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */