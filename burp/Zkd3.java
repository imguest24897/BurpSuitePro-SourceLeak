package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Zkd3 {
  private boolean ZU;
  
  private boolean Zl;
  
  private boolean ZV;
  
  private boolean ZS;
  
  private boolean ZX;
  
  private boolean Zn;
  
  private boolean Zv;
  
  public Zkd3 Zv(boolean paramBoolean) {
    this.ZU = paramBoolean;
    return this;
  }
  
  public Zkd3 ZZ(boolean paramBoolean) {
    this.Zl = paramBoolean;
    return this;
  }
  
  public Zkd3 Zh(boolean paramBoolean) {
    this.ZV = paramBoolean;
    return this;
  }
  
  public Zkd3 Zu(boolean paramBoolean) {
    this.ZS = paramBoolean;
    return this;
  }
  
  public Zkd3 ZX(boolean paramBoolean) {
    this.ZX = paramBoolean;
    return this;
  }
  
  public Zkd3 Zp(boolean paramBoolean) {
    this.Zn = paramBoolean;
    return this;
  }
  
  public Zkd3 Zj(boolean paramBoolean) {
    this.Zv = paramBoolean;
    return this;
  }
  
  public Zx4z Zh() {
    ArrayList<Ztsf> arrayList = new ArrayList();
    if (this.ZU)
      arrayList.add(Ztsf.EMPTY_REQUEST); 
    if (this.Zl)
      arrayList.add(Ztsf.TARGET_MISSING); 
    if (this.ZX)
      arrayList.add(Ztsf.PROTOCOL_MISMATCH); 
    if (this.ZS)
      arrayList.add(Ztsf.HTTP_SERVICE_MISMATCH); 
    if (this.ZV)
      arrayList.add(Ztsf.WEBSOCKET_TAB_IN_GROUP); 
    if (this.Zn)
      arrayList.add(Ztsf.HTTP1_KEEP_ALIVE_ENABLED); 
    if (this.Zv)
      arrayList.add(Ztsf.HTTP2_CONNECTION_POOLING_DISABLED); 
    if (arrayList.isEmpty())
      return Zx4z.Zi; 
    HashMap<Object, Object> hashMap = new HashMap<>();
    hashMap.put(Zb2t.SEND, Collections.emptyList());
    hashMap.put(Zb2t.SEND_SEQUENCE, arrayList.stream().filter(Zkd3::lambda$build$0).toList());
    hashMap.put(Zb2t.SEND_ON_SINGLE_CONNECTION, arrayList.stream().filter(Zkd3::lambda$build$1).toList());
    hashMap.put(Zb2t.SEND_PARALLEL, arrayList.stream().filter(Zkd3::lambda$build$2).toList());
    return new Zx4z((Map)hashMap);
  }
  
  private static boolean lambda$build$2(Ztsf paramZtsf) {
    return paramZtsf.ZW(Zb2t.SEND_PARALLEL);
  }
  
  private static boolean lambda$build$1(Ztsf paramZtsf) {
    return paramZtsf.ZW(Zb2t.SEND_ON_SINGLE_CONNECTION);
  }
  
  private static boolean lambda$build$0(Ztsf paramZtsf) {
    return paramZtsf.ZW(Zb2t.SEND_SEQUENCE);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkd3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */