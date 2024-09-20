package burp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

class Zeej {
  private final Stream<String> ZP;
  
  private Zeej(Stream<String> paramStream) {
    this.ZP = paramStream;
  }
  
  static Zeej ZU(String... paramVarArgs) {
    return new Zeej(Arrays.stream(paramVarArgs));
  }
  
  void Zh(String... paramVarArgs) {
    this.ZP.forEach(paramVarArgs::lambda$to$1);
  }
  
  private static void lambda$to$1(String[] paramArrayOfString, String paramString) {
    ((Set)Zgbw.Zm.computeIfAbsent(paramString, Zeej::lambda$to$0)).addAll(Arrays.asList(paramArrayOfString));
  }
  
  private static Set lambda$to$0(String paramString) {
    return new HashSet();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeej.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */