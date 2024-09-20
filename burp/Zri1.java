package burp;

import java.util.Collections;
import java.util.List;

class Zri1 {
  private final Zr_4 Zt;
  
  private final Ze3n ZR;
  
  private final Zxs7 ZY;
  
  private final Zbnt ZH;
  
  private final Zbf4 ZN;
  
  private Zx_5 Zu;
  
  private boolean Zv;
  
  private Zri1(Zr_4 paramZr_4, Zbnt paramZbnt, Ze3n paramZe3n, Zxs7 paramZxs7, Zbf4 paramZbf4) {
    this.Zt = paramZr_4;
    this.ZH = paramZbnt;
    this.ZN = paramZbf4;
    this.ZR = paramZe3n;
    this.ZY = paramZxs7;
  }
  
  void Zi(Zewx paramZewx, byte[] paramArrayOfbyte) {
    this.Zu = (Zx_5)this.ZN.ZZ(paramZewx).Zt(this.ZR, this.ZY, null, Zbll.Zu(paramZewx, paramArrayOfbyte), Collections.emptyList());
    this.Zv = false;
  }
  
  void ZQ(Zewx paramZewx, byte[] paramArrayOfbyte, List<Zer0> paramList, Zer0 paramZer0) {
    String str = Zmit.ZH();
    byte b = Zb47.Zy(this.Zu, paramZer0);
    if (Zh() || !this.Zv || Zz(b)) {
      Zbll zbll = Zbll.Zu(paramZewx, paramArrayOfbyte);
      zbll.ZP = (new Zkoa(paramZewx, this.ZH, true, 0L, this.Zt.<Zmzk>ZH(paramZewx.ZW()))).Z_(paramZer0);
      Zx_5 zx_5 = (Zx_5)this.ZN.ZZ(paramZewx).Zt(this.ZR, this.ZY, paramZer0, zbll, paramList);
      if (Zh(zx_5))
        zx_5.ZM((byte)2); 
      this.Zu = zx_5;
      this.Zv = !zbll.ZP.isEmpty();
      if (str != null) {
        this.Zu.ZM(b);
        return;
      } 
      return;
    } 
    this.Zu.ZM(b);
  }
  
  void ZS(Zz4_ paramZz4_) {
    paramZz4_.Zz(this.Zu);
  }
  
  private boolean Zz(byte paramByte) {
    return (paramByte == 2 && this.Zu.ZK() == 1);
  }
  
  private boolean Zh() {
    return (this.Zu == null);
  }
  
  private boolean Zh(Zx_5 paramZx_5) {
    return (this.Zu != null && ((this.Zu.ZK() == 0 && paramZx_5.ZK() == 1) || (paramZx_5.ZK() == 0 && this.Zu.ZK() == 1)));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zri1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */