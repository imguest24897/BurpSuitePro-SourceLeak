package burp;

import java.util.Objects;
import javax.swing.JComponent;
import net.portswigger.Zqf;
import net.portswigger.Zto;
import net.portswigger.Zuh;

public class Ze_8 {
  private final Zsi7 ZD;
  
  private final Ztwv Zv;
  
  private Zxkq ZR;
  
  public Ze_8(Zsi7 paramZsi7, Ztwv paramZtwv) {
    this.ZD = Objects.<Zsi7>requireNonNull(paramZsi7);
    this.Zv = Objects.<Ztwv>requireNonNull(paramZtwv);
  }
  
  public void Zf(Zxkq paramZxkq) {
    this.ZR = paramZxkq;
  }
  
  public JComponent Zt(String paramString, Zstu paramZstu) {
    Zuh.Zb(this.Zv.Zu(), Zqf.ZF);
    Zto<String, Zstu> zto = Zto.ZM(paramString, paramZstu);
    Zr3d zr3d = new Zr3d(this.ZD, this.Zv, this.ZR.Zg(paramZstu), zto);
    String str = Zxrn.Zg();
    if (Zbqc.Zwu() == null)
      Zxrn.Zp("PR8Ufb"); 
    return zr3d.ZB();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze_8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */