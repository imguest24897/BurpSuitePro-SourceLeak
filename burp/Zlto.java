package burp;

import java.io.IOException;

class Zlto implements Zti0 {
  private final StringBuilder Zc;
  
  private final Zb0h ZE;
  
  Zlto(Zb0h paramZb0h) {
    this.ZE = paramZb0h;
    this.Zc = new StringBuilder(1000);
  }
  
  public void ZK(String paramString) throws IOException {
    this.Zc.append(paramString);
  }
  
  public void ZY() {
    this.ZE.ZR(this.Zc.toString());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlto.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */