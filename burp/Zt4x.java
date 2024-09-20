package burp;

import java.util.Objects;

final class Zt4x extends Record {
  private final Zrp0 ZA;
  
  private final Zeu9 ZZ;
  
  private final Zszw Zc;
  
  private final String ZY_;
  
  private final String ZYf;
  
  private final String ZYc;
  
  private final Zebg ZYa;
  
  private final int ZY2;
  
  private final Zrlg ZL;
  
  private final long ZYg;
  
  private Zt4x(Zrp0 paramZrp0, Zeu9 paramZeu9, Zszw paramZszw, String paramString1, String paramString2, String paramString3, Zebg paramZebg, int paramInt, Zrlg paramZrlg, long paramLong) {
    this.ZA = paramZrp0;
    this.ZZ = paramZeu9;
    this.Zc = paramZszw;
    this.ZY_ = paramString1;
    this.ZYf = paramString2;
    this.ZYc = paramString3;
    this.ZYa = paramZebg;
    this.ZY2 = paramInt;
    this.ZL = paramZrlg;
    this.ZYg = paramLong;
  }
  
  String ZY6() {
    return (this.ZL == null) ? null : this.ZL.ZW;
  }
  
  boolean Zo(Zeu9 paramZeu9, Zszw paramZszw) {
    return (Objects.equals(paramZeu9, this.ZZ) && Objects.equals(paramZszw, this.Zc));
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zt4x;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zt4x;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zt4x;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String ZY_() {
    return this.ZY_;
  }
  
  public String ZYf() {
    return this.ZYf;
  }
  
  public String ZYc() {
    return this.ZYc;
  }
  
  public Zebg ZYa() {
    return this.ZYa;
  }
  
  public int ZY2() {
    return this.ZY2;
  }
  
  public long ZYg() {
    return this.ZYg;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt4x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */