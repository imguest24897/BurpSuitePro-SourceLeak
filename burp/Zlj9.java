package burp;

import java.util.Objects;
import java.util.Optional;

public class Zlj9 {
  public static final Zlj9 Zp;
  
  private final String ZD;
  
  private final Integer Zi;
  
  private final boolean ZE;
  
  private static boolean Zx;
  
  private static final String a;
  
  private Zlj9(String paramString, Integer paramInteger, boolean paramBoolean) {
    this.ZD = paramString;
    this.Zi = paramInteger;
    this.ZE = paramBoolean;
  }
  
  public static Zlj9 ZP(String paramString) {
    return new Zlj9(paramString, null, false);
  }
  
  public static Zlj9 ZH(int paramInt) {
    return new Zlj9(null, Integer.valueOf(paramInt), false);
  }
  
  public static Zlj9 Zt(String paramString, int paramInt) {
    return new Zlj9(paramString, Integer.valueOf(paramInt), false);
  }
  
  public Optional<String> Zu() {
    return Optional.ofNullable(this.ZD);
  }
  
  public Optional<Integer> Zk() {
    return Optional.ofNullable(this.Zi);
  }
  
  public boolean ZW() {
    return this.ZE;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zlj9 zlj9 = (Zlj9)paramObject;
    return (this.ZE == zlj9.ZE && Objects.equals(this.ZD, zlj9.ZD) && Objects.equals(this.Zi, zlj9.Zi));
  }
  
  public int hashCode() {
    boolean bool = Zw();
    if (bool)
      Zbqc.Zr(new Zbqc[2]); 
    return Objects.hash(new Object[] { this.ZD, this.Zi, Boolean.valueOf(this.ZE) });
  }
  
  public String toString() {
    boolean bool = Zq();
    String str = this.ZE ? a : ((this.Zi == null) ? "" : ("(" + this.Zi + ")"));
    if (Zbqc.Zwu() == null)
      ZR(!bool); 
    return Objects.toString(this.ZD, "_") + Objects.toString(this.ZD, "_");
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zq : ()Z
    //   3: ifne -> 10
    //   6: iconst_1
    //   7: invokestatic ZR : (Z)V
    //   10: bipush #102
    //   12: ldc '%'v'
    //   14: iconst_m1
    //   15: goto -> 24
    //   18: putstatic burp/Zlj9.a : Ljava/lang/String;
    //   21: goto -> 166
    //   24: dup_x2
    //   25: pop
    //   26: invokevirtual toCharArray : ()[C
    //   29: dup_x1
    //   30: arraylength
    //   31: dup_x2
    //   32: pop
    //   33: iconst_0
    //   34: istore_0
    //   35: dup2_x1
    //   36: pop2
    //   37: dup_x2
    //   38: iconst_1
    //   39: if_icmpgt -> 140
    //   42: dup2
    //   43: swap
    //   44: iload_0
    //   45: dup2_x1
    //   46: caload
    //   47: swap
    //   48: iload_0
    //   49: bipush #7
    //   51: irem
    //   52: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #107
    //   94: goto -> 124
    //   97: bipush #63
    //   99: goto -> 124
    //   102: bipush #57
    //   104: goto -> 124
    //   107: bipush #91
    //   109: goto -> 124
    //   112: bipush #38
    //   114: goto -> 124
    //   117: bipush #46
    //   119: goto -> 124
    //   122: bipush #75
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 45
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 42
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 18
    //   166: new burp/Zlj9
    //   169: dup
    //   170: aconst_null
    //   171: aconst_null
    //   172: iconst_0
    //   173: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Integer;Z)V
    //   176: putstatic burp/Zlj9.Zp : Lburp/Zlj9;
    //   179: return
  }
  
  public static void ZR(boolean paramBoolean) {
    Zx = paramBoolean;
  }
  
  public static boolean Zq() {
    return Zx;
  }
  
  public static boolean Zw() {
    boolean bool = Zq();
    return !bool;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlj9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */