package burp;

import java.io.IOException;
import java.net.Socket;
import java.util.EnumSet;

class Zrgl extends Zrgf implements Zth_ {
  private final int Zs;
  
  Zrgl(Zlit paramZlit, byte[] paramArrayOfbyte, Socket paramSocket1, Socket paramSocket2, Ztwv paramZtwv, Zbp5 paramZbp5) throws IOException {
    super(paramSocket1, paramSocket2, paramZtwv);
    this.Zs = paramZbp5.ZD(paramZlit, paramArrayOfbyte, this);
  }
  
  public void ZI(Zlm paramZlm) {
    this.Zv.ZE(paramZlm);
  }
  
  public void Zl(Zlm paramZlm) {
    this.Zv.ZE(paramZlm);
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
  
  public int ZR() {
    return this.Zs;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrgl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */