package burp;

public final class Zrk5 extends Record {
  private final boolean zvi;
  
  private final String zvD;
  
  public Zrk5(boolean paramBoolean, String paramString) {
    this.zvi = paramBoolean;
    this.zvD = paramString;
  }
  
  public static Zrk5 Zw(String paramString) {
    return new Zrk5(true, paramString);
  }
  
  public static Zrk5 ZE(String paramString) {
    return new Zrk5(false, paramString);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zrk5;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zrk5;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zrk5;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public boolean Zvi() {
    return this.zvi;
  }
  
  public String ZvD() {
    return this.zvD;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrk5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */