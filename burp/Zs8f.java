package burp;

import java.util.LinkedList;
import java.util.List;

public class Zs8f {
  private final Zk9m ZJ;
  
  private final Zgsh ZV;
  
  public static final List<Zs8f> Zq = new LinkedList<>();
  
  private Zs8f(Zk9m paramZk9m, Zgsh paramZgsh) {
    this.ZJ = paramZk9m;
    this.ZV = paramZgsh;
  }
  
  public Zk9m Zw() {
    return this.ZJ;
  }
  
  public Zgsh Zr() {
    return this.ZV;
  }
  
  public String toString() {
    return "[" + this.ZV.name() + "/" + this.ZJ.name() + "]";
  }
  
  static {
    for (Zk9m zk9m : Zk9m.values()) {
      for (Zgsh zgsh : Zgsh.values()) {
        if (zk9m.ZT(zgsh))
          Zq.add(new Zs8f(zk9m, zgsh)); 
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs8f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */