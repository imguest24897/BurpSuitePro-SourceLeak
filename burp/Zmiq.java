package burp;

final class Zmiq extends Record {
  private final Zble zdp;
  
  private final String zd1;
  
  private Zmiq(Zble paramZble, String paramString) {
    this.zdp = paramZble;
    this.zd1 = paramString;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zmiq;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zmiq;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zmiq;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zble Zdp() {
    return this.zdp;
  }
  
  public String Zd1() {
    return this.zd1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmiq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */