package burp;

import com.fasterxml.Zor.Zc;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

public class Zbvz extends Zbv6 implements Zsq4 {
  private Zx0w ZE;
  
  private Zbv8 Zu;
  
  private Zbv0 ZT;
  
  public Zbvz(Zlfb paramZlfb, Ztj1 paramZtj1) {
    super(paramZlfb, paramZtj1);
  }
  
  protected List<Component> Zc(Ztj1 paramZtj1) {
    ArrayList<Zx0w> arrayList = new ArrayList();
    this.ZE = ZO();
    arrayList.add(this.ZE);
    int i = Zc.Zi();
    this.ZT = new Zbv0();
    arrayList.add(this.ZT);
    this.Zu = new Zbv8();
    arrayList.add(this.Zu);
    if (i != 0)
      Zbqc.Zr(new Zbqc[2]); 
    return (List)arrayList;
  }
  
  public void ZW(String paramString) {
    this.ZE.setText(Zg(paramString));
  }
  
  public void Zh(String paramString) {
    this.ZT.Zc(paramString);
  }
  
  public void ZO(int paramInt) {
    this.ZT.Zb(paramInt);
  }
  
  public void ZK(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.Zu.ZP(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void Zj() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbvz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */