package net.portswigger.browser;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zij;

public final class Zzz extends Record implements Zd6 {
  private final int zz3;
  
  private final String zzC;
  
  private final List<Zc7> zzf;
  
  private final Zij zzA;
  
  public Zzz(int paramInt, String paramString, List<Zc7> paramList, Zij paramZij) {
    this.zz3 = paramInt;
    this.zzC = paramString;
    this.zzf = paramList;
    String str = Zec.ZB();
    this.zzA = paramZij;
    if (Zbqc.Zwu() == null)
      Zec.ZZ("VF7gDc"); 
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/browser/Zzz;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/browser/Zzz;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/browser/Zzz;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public int Zz3() {
    return this.zz3;
  }
  
  public String ZzC() {
    return this.zzC;
  }
  
  public List<Zc7> Zzf() {
    return this.zzf;
  }
  
  public Zij ZzA() {
    return this.zzA;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zzz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */