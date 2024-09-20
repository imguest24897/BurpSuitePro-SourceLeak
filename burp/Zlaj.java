package burp;

public final class Zlaj extends Record {
  private final boolean ZTM;
  
  private final String ZT3;
  
  public static Zlaj ZX = new Zlaj(true, "");
  
  private static boolean Zf;
  
  public Zlaj(boolean paramBoolean, String paramString) {
    this.ZTM = paramBoolean;
    this.ZT3 = paramString;
  }
  
  public static Zlaj Zb(String paramString) {
    return new Zlaj(false, paramString);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zlaj;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zlaj;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zlaj;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public boolean ZTM() {
    return this.ZTM;
  }
  
  public String ZT3() {
    return this.ZT3;
  }
  
  static {
    ZE(false);
  }
  
  public static void ZE(boolean paramBoolean) {
    Zf = paramBoolean;
  }
  
  public static boolean ZT() {
    return Zf;
  }
  
  public static boolean ZTu() {
    boolean bool = ZT();
    return !bool;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlaj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */