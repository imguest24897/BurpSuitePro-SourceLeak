package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Zg75 implements Zbxr<Zmg6> {
  private final Ze3n Zk;
  
  private final Map<Integer, Set<Integer>> ZD;
  
  private final Ztai Zi;
  
  private final Zbnt Zf;
  
  private final Collection<Zb09> ZV;
  
  private static boolean Zh;
  
  public Zg75(Ze3n paramZe3n, Ztai paramZtai, Zbnt paramZbnt) {
    this.Zk = paramZe3n;
    this.Zi = paramZtai;
    this.Zf = paramZbnt;
    this.ZD = new HashMap<>();
    this.ZV = Collections.synchronizedSet(new HashSet<>());
  }
  
  public Ze3n ZO() {
    return this.Zk;
  }
  
  Set<Integer> ZY(Zxs7 paramZxs7) {
    int i = Zly1.ZQ(paramZxs7, this.Zk);
    return this.ZD.get(Integer.valueOf(i));
  }
  
  public void Zt(Zxs7 paramZxs7, Zx_5 paramZx_5) {
    Zb(paramZxs7, paramZx_5.ZN());
  }
  
  public void Zb(Zxs7 paramZxs7, Zvs paramZvs) {
    int i = Zly1.ZQ(paramZxs7, this.Zk);
    Set<Integer> set = this.ZD.computeIfAbsent(Integer.valueOf(i), Zg75::lambda$issueFound$0);
    set.add(Integer.valueOf(paramZvs.ZS()));
  }
  
  public Zmg6 Zi(Zxs7 paramZxs7, Zzkd paramZzkd, Zmhe paramZmhe, Zrj paramZrj, Zz4_ paramZz4_) {
    return new Zmg6(this.Zk, this.Zk, this.Zi, paramZzkd, paramZxs7, paramZmhe, paramZrj, paramZz4_, this.Zf);
  }
  
  public Collection<Zb09> ZF() {
    return this.ZV;
  }
  
  private static Set lambda$issueFound$0(Integer paramInteger) {
    return new HashSet();
  }
  
  public static void ZB(boolean paramBoolean) {
    Zh = paramBoolean;
  }
  
  public static boolean Zo() {
    return Zh;
  }
  
  public static boolean Zt() {
    boolean bool = Zo();
    return !bool;
  }
  
  static {
    if (Zo())
      ZB(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg75.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */