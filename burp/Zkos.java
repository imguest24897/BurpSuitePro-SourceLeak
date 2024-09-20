package burp;

import java.util.Set;

final class Zkos extends Record {
  private final int ZV;
  
  private final Zeu9 Zo;
  
  private final Zeu9 zt;
  
  private final Zrp0 ZR;
  
  private final Zlru ZH;
  
  private final Zszw zf;
  
  private final Zszw zg;
  
  private final Set<Zszw> ZC;
  
  Zkos(int paramInt, Zeu9 paramZeu91, Zeu9 paramZeu92, Zrp0 paramZrp0, Zlru paramZlru, Zszw paramZszw1, Zszw paramZszw2, Set<Zszw> paramSet) {
    this.ZV = paramInt;
    this.Zo = paramZeu91;
    this.zt = paramZeu92;
    this.ZR = paramZrp0;
    this.ZH = paramZlru;
    this.zf = paramZszw1;
    this.zg = paramZszw2;
    this.ZC = paramSet;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zkos;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zkos;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zkos;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public int ZV() {
    return this.ZV;
  }
  
  public Zeu9 Zt() {
    return this.zt;
  }
  
  public Zrp0 ZR() {
    return this.ZR;
  }
  
  public Zlru ZH() {
    return this.ZH;
  }
  
  public Zszw Zf() {
    return this.zf;
  }
  
  public Zszw Zg() {
    return this.zg;
  }
  
  public Set<Zszw> ZC() {
    return this.ZC;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkos.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */