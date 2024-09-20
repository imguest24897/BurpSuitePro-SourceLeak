package burp;

public final class Zszl extends Record {
  private final Zsua ZU5;
  
  private final String ZU9;
  
  private final String ZUD;
  
  private final Runnable ZUj;
  
  private final boolean ZUk;
  
  public Zszl(Zsua paramZsua, String paramString) {
    this(paramZsua, paramString, null, null, true);
  }
  
  public Zszl(Zsua paramZsua, String paramString1, String paramString2, Runnable paramRunnable, boolean paramBoolean) {
    this.ZU5 = paramZsua;
    this.ZU9 = paramString1;
    this.ZUD = paramString2;
    this.ZUj = paramRunnable;
    this.ZUk = paramBoolean;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zszl;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zszl;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zszl;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zsua ZU5() {
    return this.ZU5;
  }
  
  public String ZU9() {
    return this.ZU9;
  }
  
  public String ZUD() {
    return this.ZUD;
  }
  
  public Runnable ZUj() {
    return this.ZUj;
  }
  
  public boolean ZUk() {
    return this.ZUk;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zszl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */