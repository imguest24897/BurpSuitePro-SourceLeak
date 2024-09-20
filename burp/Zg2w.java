package burp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Zg2w implements Zric {
  private final Zk1r ZP;
  
  public Zg2w(String... paramVarArgs) {
    HashSet<String> hashSet = new HashSet();
    hashSet.addAll(Arrays.asList(paramVarArgs));
    this.ZP = new Zk1r(hashSet);
  }
  
  public boolean Z_(String paramString) {
    return !this.ZP.Zh(paramString.toLowerCase());
  }
  
  public boolean Z_(Set<String> paramSet) {
    Zbqc[] arrayOfZbqc = Zems.Ze();
    Set<String> set = this.ZP.Zw(paramSet);
    if (Zbqc.Zwu() == null)
      Zems.Zx(new Zbqc[2]); 
    return (set.size() < paramSet.size());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg2w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */