package burp;

import java.io.IOException;
import java.net.Socket;
import java.util.EnumSet;

class Zrg6 extends Zrgf implements Zth_ {
  Zrg6(Socket paramSocket1, Socket paramSocket2, Ztwv paramZtwv) throws IOException {
    super(paramSocket1, paramSocket2, paramZtwv);
  }
  
  public void ZI(Zlm paramZlm) {
    this.Zv.ZE(paramZlm);
  }
  
  public void Zl(Zlm paramZlm) {
    this.Zv.ZE(paramZlm);
  }
  
  public int ZR() {
    return Zs5a.Zk.getAndIncrement();
  }
  
  public boolean Zy() {
    return false;
  }
  
  public boolean Zb(Ze3o paramZe3o) {
    return true;
  }
  
  public EnumSet<Ze3o> Zn() {
    return EnumSet.allOf(Ze3o.class);
  }
  
  public void Zv(Zt95 paramZt95) {
    paramZt95.Zi(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrg6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */