package burp;

import java.util.Objects;
import java.util.regex.Pattern;

public interface Zkq2 {
  boolean ZA(String paramString);
  
  static Zkq2 Zd(String paramString) {
    Objects.requireNonNull(paramString);
    return paramString::equals;
  }
  
  static Zkq2 ZV(String paramString) {
    Pattern pattern = Pattern.compile(paramString);
    return pattern::lambda$regex$0;
  }
  
  static Zkq2 ZW() {
    return Zkq2::lambda$catchAll$1;
  }
  
  private static boolean lambda$catchAll$1(String paramString) {
    return true;
  }
  
  private static boolean lambda$regex$0(Pattern paramPattern, String paramString) {
    return paramPattern.matcher(paramString).matches();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkq2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */