package burp;

import java.awt.Component;

public final class Zsso extends Record {
  private final String zkM;
  
  private final Component zk3;
  
  private static int Zb;
  
  public Zsso(String paramString, Component paramComponent) {
    this.zkM = paramString;
    this.zk3 = paramComponent;
  }
  
  public static Zsso ZU(String paramString1, String paramString2) {
    return Za(paramString1, new Zm99(paramString2));
  }
  
  public static Zsso Za(String paramString, Component paramComponent) {
    return new Zsso(paramString, paramComponent);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zsso;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zsso;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zsso;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String ZkM() {
    return this.zkM;
  }
  
  public Component Zk3() {
    return this.zk3;
  }
  
  public static void Zm(int paramInt) {
    Zb = paramInt;
  }
  
  public static int ZkH() {
    return Zb;
  }
  
  public static int Zk() {
    int i = ZkH();
    return (i == 0) ? 56 : 0;
  }
  
  static {
    if (ZkH() != 0)
      Zm(74); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsso.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */