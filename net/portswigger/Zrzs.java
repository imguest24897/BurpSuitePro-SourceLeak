package net.portswigger;

import burp.Zbqc;
import java.util.Objects;

public final class Zrzs extends Record implements Zrm9 {
  private final String ZH;
  
  private final Zle Zr;
  
  private final String Zz;
  
  public Zrzs(String paramString1, Zle paramZle, String paramString2) {
    this.ZH = paramString1;
    this.Zr = paramZle;
    this.Zz = paramString2;
  }
  
  public boolean equals(Object paramObject) {
    Zbqc[] arrayOfZbqc = Zk0.Zu();
    if (this == paramObject)
      return true; 
    if (paramObject instanceof Zrzs) {
      Zrzs zrzs = (Zrzs)paramObject;
      if (arrayOfZbqc == null)
        return (Objects.equals(this.ZH, zrzs.ZH) && this.Zr == zrzs.Zr && Objects.equals(this.Zz, zrzs.Zz)); 
    } 
    return false;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zrzs;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zrzs;)I
    //   6: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrzs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */