package burp;

import java.util.ArrayList;
import java.util.List;

class Zbwd implements Zzgp {
  private Zb3t ZC;
  
  final Zxr9 Zm;
  
  private Zbwd(Zxr9 paramZxr9) {}
  
  public void ZT(int paramInt) {
    this.Zm.Zy.Zy(new Zss1(paramInt, new Zgcc(this.Zm.ZG.Zk())));
    this.Zm.ZG.Zq();
  }
  
  public void ZR(int paramInt) {
    Zl30 zl30 = this.Zm.ZD.Zw().get(paramInt - 1);
    List<Zb3t> list = ZW(zl30.ZT().size());
    this.ZC = zl30.Zw(list);
    Zr9_ zr9_ = zl30.ZC();
    this.Zm.Zu.ZK(((Zss1)this.Zm.Zy.ZP()).Zi, zr9_, this.Zm.ZS);
  }
  
  public void Zh(int paramInt) {
    this.Zm.Zy.Zy(new Zss1(paramInt, this.ZC));
  }
  
  public void Zf() {
    this.Zm.Zf = true;
  }
  
  public void Ze() {
    this.Zm.ZN = !this.Zm.Zm.ZX(this.Zm, this.Zm.Zy, this.Zm.ZG);
  }
  
  private List<Zb3t> ZW(int paramInt) {
    ArrayList<Zb3t> arrayList = new ArrayList(paramInt);
    byte b = 0;
    boolean bool = Zse4.ZM();
    while (b < paramInt) {
      arrayList.add(0, ((Zss1)this.Zm.Zy.Zc()).Zu);
      b++;
      if (!bool)
        break; 
    } 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbwd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */