package burp;

import java.util.Collections;
import java.util.List;

class Zti6 {
  private final Zbdf Zw;
  
  private final Zbxw ZR;
  
  Zti6(Zbdf paramZbdf, Zbxw paramZbxw) {
    this.Zw = paramZbdf;
    this.ZR = paramZbxw;
  }
  
  void ZX(Zkv5 paramZkv5) {
    this.Zw.ZX(List.of(paramZkv5));
    if (paramZkv5.startOffset() != 0 || paramZkv5.endOffset() != 0)
      this.Zw.Ze(paramZkv5.startOffset(), paramZkv5.startOffset()); 
  }
  
  void ZU() {
    this.Zw.ZX(Collections.emptyList());
  }
  
  void ZV(byte[] paramArrayOfbyte) {
    this.Zw.ZN(paramArrayOfbyte, Zgu3.HTTP_REQUEST);
  }
  
  void ZX(String paramString) {
    this.ZR.ZQ(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zti6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */