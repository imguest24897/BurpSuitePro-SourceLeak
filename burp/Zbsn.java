package burp;

public final class Zbsn extends Record {
  private final String ZW;
  
  private final String Zs;
  
  public Zbsn(String paramString1, String paramString2) {
    this.ZW = paramString1;
    this.Zs = paramString2;
  }
  
  public String Zs() {
    return this.ZW + "§" + this.ZW;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zbsn;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zbsn;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zbsn;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbsn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */