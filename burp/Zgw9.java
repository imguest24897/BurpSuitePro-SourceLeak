package burp;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Zgw9 {
  public static String ZX(byte[] paramArrayOfbyte, String paramString) {
    Zbqc[] arrayOfZbqc = Zz_d.ZV();
    if (paramArrayOfbyte == null || paramArrayOfbyte.length == 0 || paramString == null || paramString.length() == 0)
      return null; 
    String str = paramString.toLowerCase(Locale.ENGLISH);
    int i = paramArrayOfbyte.length;
    int j = 0;
    byte b = 0;
    while (b < i) {
      if (b + 1 < i && paramArrayOfbyte[b] == 13 && paramArrayOfbyte[b + 1] == 10) {
        String str1 = new String(paramArrayOfbyte, j, b - j, StandardCharsets.US_ASCII);
        if (str1.toLowerCase(Locale.ENGLISH).startsWith(str))
          return str1; 
        if (b + 3 < i && paramArrayOfbyte[b + 2] == 13 && paramArrayOfbyte[b + 3] == 10)
          return null; 
        j = b + 2;
      } 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgw9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */