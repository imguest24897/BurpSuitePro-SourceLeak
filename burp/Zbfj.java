package burp;

import burp.api.montoya.http.message.params.HttpParameter;
import burp.api.montoya.http.message.params.HttpParameterType;
import java.util.Objects;

class Zbfj implements HttpParameter {
  private final String ZY;
  
  private final String ZD;
  
  private final HttpParameterType ZX;
  
  private static final String a;
  
  private Zbfj(String paramString1, String paramString2, HttpParameterType paramHttpParameterType) {
    this.ZY = paramString1;
    this.ZD = paramString2;
    this.ZX = paramHttpParameterType;
  }
  
  public HttpParameterType type() {
    return this.ZX;
  }
  
  public String name() {
    return this.ZY;
  }
  
  public String value() {
    return this.ZD;
  }
  
  public boolean equals(Object paramObject) {
    HttpParameter httpParameter;
    boolean bool = Zsie.Zv();
    try {
      if (this == paramObject)
        return true; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    if (paramObject instanceof HttpParameter) {
      httpParameter = (HttpParameter)paramObject;
      try {
        if (!bool)
          return false; 
      } catch (UnsupportedOperationException unsupportedOperationException) {
        throw a(null);
      } 
    } else {
      return false;
    } 
    try {
      if (this.ZY.equals(httpParameter.name()))
        try {
          if (Objects.equals(this.ZD, httpParameter.value()))
            try {
              if (this.ZX == httpParameter.type());
            } catch (UnsupportedOperationException unsupportedOperationException) {
              throw a(null);
            }  
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.ZY, this.ZD, this.ZX });
  }
  
  static HttpParameter ZV(String paramString1, String paramString2, HttpParameterType paramHttpParameterType) {
    return new Zbfj(paramString1, paramString2, paramHttpParameterType);
  }
  
  static HttpParameter ZV(IParameter paramIParameter) {
    try {
      switch (paramIParameter.getType()) {
        case 0:
        
        case 1:
        
        case 2:
        
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    throw new UnsupportedOperationException(a);
  }
  
  static HttpParameter Zf(String paramString1, String paramString2) {
    return ZV(paramString1, paramString2, HttpParameterType.URL);
  }
  
  static HttpParameter Zh(String paramString1, String paramString2) {
    return ZV(paramString1, paramString2, HttpParameterType.BODY);
  }
  
  public static HttpParameter Za(String paramString1, String paramString2) {
    return ZV(paramString1, paramString2, HttpParameterType.COOKIE);
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #101
    //   2: ldc 'QRnUvyBUnOvcDnI"uUUnIvdY!K7bPu^$0E\\fd'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbfj.a : Ljava/lang/String;
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
    //   80: bipush #117
    //   82: goto -> 112
    //   85: bipush #84
    //   87: goto -> 112
    //   90: bipush #16
    //   92: goto -> 112
    //   95: bipush #16
    //   97: goto -> 112
    //   100: bipush #100
    //   102: goto -> 112
    //   105: bipush #94
    //   107: goto -> 112
    //   110: bipush #51
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbfj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */