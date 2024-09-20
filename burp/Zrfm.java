package burp;

import net.portswigger.Zm2;

public final class Zrfm extends Record {
  private final Ze45 ZK9;
  
  private final boolean ZKJ;
  
  private final boolean ZKV;
  
  private final Zrj8 ZKE;
  
  public Zrfm(Ze45 paramZe45, boolean paramBoolean1, boolean paramBoolean2, Zrj8 paramZrj8) {
    if (!paramBoolean1)
      Zm2.ZC(Zrrh.PROXY_OPTIONS_MISC_UNZIP_RESPONSES_DISABLED); 
    this.ZK9 = paramZe45;
    this.ZKJ = paramBoolean1;
    this.ZKV = paramBoolean2;
    this.ZKE = paramZrj8;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zrfm;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zrfm;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zrfm;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Ze45 ZK9() {
    return this.ZK9;
  }
  
  public boolean ZKJ() {
    return this.ZKJ;
  }
  
  public boolean ZKV() {
    return this.ZKV;
  }
  
  public Zrj8 ZKE() {
    return this.ZKE;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrfm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */