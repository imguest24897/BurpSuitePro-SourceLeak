package burp;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

public class Zbvn extends Zbv6 implements Zsq4 {
  private final Zt0s Zq;
  
  private Zx0w Zm;
  
  private Zbvo ZI;
  
  private Zbv8 ZX;
  
  public Zbvn(Zlfb paramZlfb, Zt0s paramZt0s, Ztj1 paramZtj1) {
    super(paramZlfb, paramZtj1);
    this.Zq = paramZt0s;
  }
  
  protected List<Component> Zc(Ztj1 paramZtj1) {
    ArrayList<Zx0w> arrayList = new ArrayList();
    this.Zm = ZO();
    arrayList.add(this.Zm);
    this.ZI = new Zbvo(((Ztr3)paramZtj1.ZG()).ZPp(), this::Zi);
    arrayList.add(this.ZI);
    String str = Zl2b.ZS();
    this.ZX = new Zbv8();
    arrayList.add(this.ZX);
    if (str == null)
      Zbqc.Zr(new Zbqc[4]); 
    return (List)arrayList;
  }
  
  public void ZK(boolean paramBoolean) {
    this.ZI.Zc(paramBoolean);
  }
  
  public void ZN(String paramString) {
    this.Zm.setText(Zg(paramString));
  }
  
  public void Zw(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.ZX.ZP(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private void Zi() {
    this.Zq.Zj();
  }
  
  public void Zj() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbvn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */