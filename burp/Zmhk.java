package burp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Zmhk implements Zl77 {
  private final List<Zr97> ZI = new CopyOnWriteArrayList<>();
  
  public Zgg0 ZW(Zeew paramZeew) {
    return new Zr_q(this, paramZeew);
  }
  
  public Zgg0 Za(Zeew paramZeew, int paramInt) {
    return new Zsmd(this, paramZeew, paramInt);
  }
  
  public void ZE(Zr97 paramZr97) {
    this.ZI.add(paramZr97);
  }
  
  public void ZX(Zr97 paramZr97) {
    this.ZI.remove(paramZr97);
  }
  
  public void ZZ(Zesy paramZesy) {
    int i = Zesy.ZP();
    for (Zr97 zr97 : this.ZI) {
      zr97.ZZ(paramZesy);
      if (i != 0)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmhk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */