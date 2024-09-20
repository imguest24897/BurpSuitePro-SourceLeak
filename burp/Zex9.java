package burp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class Zex9 extends Record {
  private final String zmJ;
  
  private final String zmH;
  
  public Zex9(String paramString1, String paramString2) {
    this.zmJ = paramString1;
    this.zmH = paramString2;
  }
  
  public static List<Zex9> ZQ(byte[] paramArrayOfbyte) {
    return (List<Zex9>)Arrays.<String>stream((new String(paramArrayOfbyte)).split("&")).map(Zex9::ZJ).collect(Collectors.toList());
  }
  
  public static Zex9 ZJ(String paramString) {
    if (paramString.contains("=")) {
      int i = paramString.indexOf("=");
      String str1 = paramString.substring(0, i);
      String str2 = paramString.substring(i + 1);
      return new Zex9(str1, str2);
    } 
    return new Zex9(paramString, null);
  }
  
  public String toString() {
    return this.zmJ + "=" + this.zmJ;
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zex9;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zex9;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String ZmJ() {
    return this.zmJ;
  }
  
  public String ZmH() {
    return this.zmH;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zex9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */