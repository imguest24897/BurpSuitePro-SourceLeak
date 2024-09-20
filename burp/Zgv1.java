package burp;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zli;
import net.portswigger.Zmw;
import net.portswigger.Zrzt;

public class Zgv1 {
  private final Map<String, String> Zd;
  
  private final InetAddress Zx;
  
  private final Zb25 Zy;
  
  private final String Za;
  
  private final byte[] ZV;
  
  private final int Zj;
  
  private String ZU;
  
  private static URL ZR;
  
  public Zgv1(byte[] paramArrayOfbyte, InetAddress paramInetAddress, Zb25 paramZb25, String paramString, int paramInt) {
    int[] arrayOfInt = Zken.Zd();
    this.ZU = "";
    this.ZV = paramArrayOfbyte;
    this.Zx = paramInetAddress;
    this.Zy = paramZb25;
    this.Za = paramString;
    this.Zj = paramInt;
    this.Zd = new HashMap<>();
    int i = Zj(paramArrayOfbyte, 0);
    try {
      if (i == -1)
        return; 
    } catch (MalformedURLException malformedURLException) {
      throw a(null);
    } 
    try {
      if (paramArrayOfbyte[i] == 32)
        try {
          if (paramArrayOfbyte.length != i) {
            int j = Zj(paramArrayOfbyte, i + 1);
            try {
              if (j == -1)
                return; 
            } catch (MalformedURLException malformedURLException) {
              throw a(null);
            } 
            String str = Zkb.ZG(Zmw.Zz(paramArrayOfbyte, i + 1, j));
            try {
              URL uRL = new URL(ZR, str);
              this.ZU = uRL.getPath();
              String str1 = uRL.getQuery();
              if (str1 != null) {
                String[] arrayOfString1 = str1.split("&");
                String[] arrayOfString2 = arrayOfString1;
                int k = arrayOfString2.length;
                byte b = 0;
                while (b < k) {
                  String str2 = arrayOfString2[b];
                  String[] arrayOfString = str2.split("=");
                  if (arrayOfString.length == 2) {
                    String str3 = arrayOfString[0];
                    String str4 = arrayOfString[1];
                    try {
                      if (str3.length() > 0)
                        try {
                          if (str4.length() > 0)
                            this.Zd.put(str3, Zrzt.ZJ(str4)); 
                        } catch (MalformedURLException malformedURLException) {
                          throw a(null);
                        }  
                    } catch (MalformedURLException malformedURLException) {
                      throw a(null);
                    } 
                  } 
                  b++;
                  if (arrayOfInt == null)
                    break; 
                } 
              } 
            } catch (MalformedURLException malformedURLException) {
              Zah.Zl(malformedURLException, Zk_.IGNORED);
              this.ZU = "";
            } 
            return;
          } 
          return;
        } catch (MalformedURLException malformedURLException) {
          throw a(null);
        }  
    } catch (MalformedURLException malformedURLException) {
      throw a(null);
    } 
  }
  
  private int Zj(byte[] paramArrayOfbyte, int paramInt) {
    return Zli.ZU(paramArrayOfbyte, (byte)32, paramInt, paramArrayOfbyte.length);
  }
  
  public String ZQ() {
    return this.Za;
  }
  
  public int Zt() {
    return this.Zj;
  }
  
  public String Zp() {
    return this.ZU;
  }
  
  public Zb25 ZC() {
    return this.Zy;
  }
  
  public InetAddress Zx() {
    return this.Zx;
  }
  
  public byte[] ZM() {
    return this.ZV;
  }
  
  public String Zf(String paramString) {
    return this.Zd.get(paramString);
  }
  
  static {
    // Byte code:
    //   0: bipush #62
    //   2: ldc 'oqfbT~pr8:#wfz43hw\\rb7\\ti`'
    //   4: iconst_m1
    //   5: goto -> 12
    //   8: astore_0
    //   9: goto -> 154
    //   12: dup_x2
    //   13: pop
    //   14: invokevirtual toCharArray : ()[C
    //   17: dup_x1
    //   18: arraylength
    //   19: dup_x2
    //   20: pop
    //   21: iconst_0
    //   22: istore_1
    //   23: dup2_x1
    //   24: pop2
    //   25: dup_x2
    //   26: iconst_1
    //   27: if_icmpgt -> 128
    //   30: dup2
    //   31: swap
    //   32: iload_1
    //   33: dup2_x1
    //   34: caload
    //   35: swap
    //   36: iload_1
    //   37: bipush #7
    //   39: irem
    //   40: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #57
    //   82: goto -> 112
    //   85: bipush #59
    //   87: goto -> 112
    //   90: bipush #82
    //   92: goto -> 112
    //   95: bipush #40
    //   97: goto -> 112
    //   100: bipush #102
    //   102: goto -> 112
    //   105: bipush #69
    //   107: goto -> 112
    //   110: bipush #111
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #1, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 33
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_1
    //   132: if_icmpgt -> 30
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
    //   154: new java/net/URL
    //   157: dup
    //   158: aload_0
    //   159: invokespecial <init> : (Ljava/lang/String;)V
    //   162: putstatic burp/Zgv1.ZR : Ljava/net/URL;
    //   165: goto -> 180
    //   168: astore_2
    //   169: aload_2
    //   170: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   173: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   176: aconst_null
    //   177: putstatic burp/Zgv1.ZR : Ljava/net/URL;
    //   180: return
    // Exception table:
    //   from	to	target	type
    //   154	165	168	java/net/MalformedURLException
  }
  
  private static MalformedURLException a(MalformedURLException paramMalformedURLException) {
    return paramMalformedURLException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgv1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */