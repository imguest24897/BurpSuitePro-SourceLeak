package burp;

import java.util.List;

class Zlpr {
  private boolean Zo = false;
  
  private final List<byte[]> ZI;
  
  public Zlpr(List<byte[]> paramList) {
    this.ZI = paramList;
  }
  
  public void Zw(String paramString) {
    Zn(paramString.getBytes());
  }
  
  public void Zn(byte[] paramArrayOfbyte) {
    this.ZI.add(paramArrayOfbyte);
  }
  
  public void ZX() {
    this.Zo = true;
  }
  
  public boolean Zi() {
    return this.Zo;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlpr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */