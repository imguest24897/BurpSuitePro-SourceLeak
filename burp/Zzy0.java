package burp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Zzy0 implements Zric {
  private final Zk1r ZW;
  
  public Zzy0(String... paramVarArgs) {
    HashSet<String> hashSet = new HashSet();
    hashSet.addAll(Arrays.asList(paramVarArgs));
    this.ZW = new Zk1r(hashSet);
  }
  
  public boolean Z_(String paramString) {
    return this.ZW.Zh(paramString.toLowerCase());
  }
  
  public boolean Z_(Set<String> paramSet) {
    Set<String> set = this.ZW.Zw(paramSet);
    return !set.isEmpty();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzy0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */