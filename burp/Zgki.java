package burp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

class Zgki {
  private final Stream<String> Zn;
  
  private Zgki(Stream<String> paramStream) {
    this.Zn = paramStream;
  }
  
  static Zgki ZV(String... paramVarArgs) {
    return new Zgki(Arrays.stream(paramVarArgs));
  }
  
  void ZM(String... paramVarArgs) {
    this.Zn.forEach(paramVarArgs::lambda$to$1);
  }
  
  private static void lambda$to$1(String[] paramArrayOfString, String paramString) {
    ((Set)Zrfv.Zh.computeIfAbsent(paramString, Zgki::lambda$to$0)).addAll(Arrays.asList(paramArrayOfString));
  }
  
  private static Set lambda$to$0(String paramString) {
    return new HashSet();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgki.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */