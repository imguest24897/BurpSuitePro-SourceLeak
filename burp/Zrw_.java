package burp;

public final class Zrw_ extends Record {
  private final int ZP;
  
  private final boolean ZN;
  
  private final String ZE;
  
  private final byte ZU;
  
  private final short ZH;
  
  private final short Zw;
  
  private final Zbug ZW;
  
  public Zrw_(int paramInt, boolean paramBoolean, String paramString, byte paramByte, short paramShort1, short paramShort2, Zbug paramZbug) {
    this.ZP = paramInt;
    this.ZN = paramBoolean;
    this.ZE = paramString;
    this.ZU = paramByte;
    this.ZH = paramShort1;
    this.Zw = paramShort2;
    this.ZW = paramZbug;
  }
  
  public static Zrw_ Zj(Zrnc paramZrnc) {
    return new Zrw_(paramZrnc.Zd() ? paramZrnc.Zf().hashCode() : 0, paramZrnc.Zd(), paramZrnc.ZK(), paramZrnc.ZZ().Zi(), paramZrnc.ZA(), paramZrnc.ZP(), Zbug.ZZ(paramZrnc));
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zrw_;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zrw_;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zrw_;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public boolean ZN() {
    return this.ZN;
  }
  
  public Zbug ZW() {
    return this.ZW;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrw_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */