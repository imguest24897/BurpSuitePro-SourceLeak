package burp;

import java.util.LinkedList;
import java.util.List;
import net.portswigger.Zen;

public class Ze2n implements Zs51 {
  private final Zlhe ZE;
  
  private final List<Zx> ZI;
  
  private final Zb25 ZM;
  
  private final String ZW;
  
  private final int Zf;
  
  private boolean Zo;
  
  Ze2n(Zlhe paramZlhe, Zb25 paramZb25, String paramString, int paramInt) {
    this.ZE = paramZlhe;
    this.ZM = paramZb25;
    this.ZW = paramString;
    this.Zf = paramInt;
    this.ZI = new LinkedList<>();
    this.Zo = paramZb25.ZV();
  }
  
  public void Zl(Zen paramZen, byte[] paramArrayOfbyte1, List<byte[]> paramList, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    String[] arrayOfString = Zgzu.Zk();
    if (this.Zo) {
      this.ZE.Zk(this.ZM, paramZen, paramArrayOfbyte1, paramList, paramArrayOfbyte2, paramArrayOfbyte3, this.ZW, this.Zf);
      if (arrayOfString != null) {
        this.ZI.add(new Zx(paramZen, paramArrayOfbyte1, paramList, paramArrayOfbyte2, paramArrayOfbyte3));
        return;
      } 
      return;
    } 
    this.ZI.add(new Zx(paramZen, paramArrayOfbyte1, paramList, paramArrayOfbyte2, paramArrayOfbyte3));
  }
  
  void Zm() {
    this.ZI.clear();
  }
  
  void ZX() {
    this.Zo = true;
  }
  
  void Zy() {
    this.ZI.forEach(this::lambda$flush$0);
  }
  
  private void lambda$flush$0(Zx paramZx) {
    this.ZE.Zk(this.ZM, paramZx.ZZ, paramZx.Zq, paramZx.Zg, paramZx.Zl, paramZx.Zh, this.ZW, this.Zf);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze2n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */