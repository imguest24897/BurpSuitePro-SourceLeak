package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zgy4 implements Zg5c {
  private final Zxs7 Zh;
  
  private final List<Zl1r> Zc;
  
  private byte[] Zl;
  
  private Zlvf ZL;
  
  public Zgy4(Ztbx paramZtbx) {
    this.Zh = paramZtbx.Zl;
    String[] arrayOfString = Zmdu.ZY();
    this.Zc = new ArrayList<>(paramZtbx.ZL().ZV().ZY().ZO());
    this.ZL = paramZtbx.ZL().ZV();
    this.Zl = paramZtbx.ZL().ZY();
    if (Zbqc.Zwu() == null)
      Zmdu.ZU(new String[5]); 
  }
  
  public Zxs7 Zd() {
    return this.Zh;
  }
  
  public Zmdu Z_() {
    return this.ZL.<Zmdu>Za(Zmdu.REFLECTED, Zmdu.STORED);
  }
  
  public List<Zl1r> Zr() {
    return Collections.unmodifiableList(this.Zc);
  }
  
  public Zlfv<? extends Zgkc> Zs(List<Zznw> paramList, Zvow paramZvow, List<Zvow> paramList1, String paramString1, String paramString2) {
    String[] arrayOfString = Zmdu.ZY();
    Zuh.Zb((this.Zl != null), Zqf.Zk);
    Zei8<?> zei8 = this.ZL.Zq(new Zz25(this.Zl, 0), paramZvow.ZB(), paramZvow.Zi());
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[5]); 
    return new Zrky(paramList, zei8, paramList1, paramString1, paramString2);
  }
  
  public void ZL(Zlvf paramZlvf, byte[] paramArrayOfbyte) {
    this.ZL = paramZlvf;
    this.Zl = paramArrayOfbyte;
    this.Zc.clear();
    this.Zc.addAll(paramZlvf.ZY().ZO());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgy4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */