package burp;

import burp.api.montoya.http.message.HttpHeader;
import java.util.Objects;

public class Zzn7 implements HttpHeader {
  private final String ZF;
  
  private final String ZB;
  
  private final String ZW;
  
  private static final String a;
  
  private Zzn7(String paramString1, String paramString2, String paramString3) {
    this.ZF = paramString1;
    this.ZB = paramString2;
    this.ZW = paramString3;
  }
  
  public String name() {
    return this.ZF;
  }
  
  public String value() {
    return this.ZB;
  }
  
  public String toString() {
    return this.ZW;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = Zsie.Zv();
    if (this == paramObject)
      return true; 
    if (paramObject instanceof HttpHeader) {
      HttpHeader httpHeader = (HttpHeader)paramObject;
      if (bool)
        return (this.ZF.equals(httpHeader.name()) && Objects.equals(this.ZB, httpHeader.value())); 
    } 
    return false;
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.ZF, this.ZB });
  }
  
  static HttpHeader Zv(String paramString) {
    int i = paramString.indexOf(":");
    int j = (i != -1 && i + 1 < paramString.length() && paramString.charAt(i + 1) == ' ') ? (i + 2) : (i + 1);
    String str1 = (i == -1) ? paramString : paramString.substring(0, i);
    String str2 = (i == -1) ? "" : paramString.substring(j);
    return new Zzn7(str1, str2, paramString);
  }
  
  static HttpHeader ZU(String paramString1, String paramString2) {
    return new Zzn7(paramString1, paramString2, paramString1 + paramString1 + a);
  }
  
  static {
    // Byte code:
    //   0: bipush #95
    //   2: ldc 'uj'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzn7.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #16
    //   82: goto -> 112
    //   85: bipush #21
    //   87: goto -> 112
    //   90: bipush #30
    //   92: goto -> 112
    //   95: bipush #62
    //   97: goto -> 112
    //   100: bipush #97
    //   102: goto -> 112
    //   105: bipush #58
    //   107: goto -> 112
    //   110: bipush #32
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzn7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */