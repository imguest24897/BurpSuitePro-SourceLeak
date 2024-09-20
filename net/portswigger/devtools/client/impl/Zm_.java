package net.portswigger.devtools.client.impl;

import burp.Zbqc;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.portswigger.browser.Zd;

public final class Zm_ extends Record {
  private final Zd ZXP;
  
  private final Zmg ZX5;
  
  private final List<Zv> ZXU;
  
  public Zm_(Zd paramZd, Zmg paramZmg, List<Zv> paramList) {
    this.ZXP = Objects.<Zd>requireNonNull(paramZd);
    int i = Zv.ZT();
    this.ZX5 = Objects.<Zmg>requireNonNull(paramZmg);
    this.ZXU = (paramList != null) ? paramList : new ArrayList<>();
    if (i != 0)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public static Zm_ Zt(Zmg paramZmg, Zd paramZd, List<Zv> paramList) {
    return new Zm_(paramZd, paramZmg, paramList);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/devtools/client/impl/Zm_;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/devtools/client/impl/Zm_;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/devtools/client/impl/Zm_;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zd ZXP() {
    return this.ZXP;
  }
  
  public Zmg ZX5() {
    return this.ZX5;
  }
  
  public List<Zv> ZXU() {
    return this.ZXU;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zm_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */