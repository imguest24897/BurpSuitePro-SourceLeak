package burp;

import javax.swing.JComponent;

class Zbs7 {
  private final Ze_8 Zj;
  
  private final Zey9 Zg;
  
  Zbs7(Ze_8 paramZe_8, Zey9 paramZey9) {
    this.Zj = paramZe_8;
    this.Zg = paramZey9;
  }
  
  JComponent ZC(byte[] paramArrayOfbyte, Zbdf paramZbdf) {
    String str = ZD(paramZbdf.ZT(), this.Zg);
    Zyf zyf = Zyf.Zy(paramArrayOfbyte);
    JComponent jComponent = this.Zj.Zt(str, zyf);
    jComponent.addMouseListener(paramZbdf);
    return jComponent;
  }
  
  private static String ZD(Zmgv paramZmgv, Zey9 paramZey9) {
    if (paramZmgv == null)
      return null; 
    Zbr zbr = paramZmgv.Zo3();
    if (zbr == null || zbr.Zd())
      return null; 
    Zefx zefx = zbr.ZP(paramZmgv.Zod(), paramZey9);
    Zlit zlit = zefx.ZF();
    return (zlit == null) ? null : zlit.Zdw();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbs7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */