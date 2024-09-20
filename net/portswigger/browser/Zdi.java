package net.portswigger.browser;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class Zdi implements Iterable<Zz2> {
  public static final Zdi ZG = new Zdi(Collections.emptySet());
  
  private final Set<Zz2> Zs;
  
  private static int[] Zh;
  
  public static Zdi Zk(Zz2... paramVarArgs) {
    return (paramVarArgs.length == 0) ? ZG : new Zdi(Set.of(paramVarArgs));
  }
  
  public Zdi(Set<Zz2> paramSet) {
    this.Zs = paramSet;
  }
  
  public Iterator<Zz2> iterator() {
    return this.Zs.iterator();
  }
  
  static {
    Zb(new int[3]);
  }
  
  public static void Zb(int[] paramArrayOfint) {
    Zh = paramArrayOfint;
  }
  
  public static int[] Zb() {
    return Zh;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zdi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */