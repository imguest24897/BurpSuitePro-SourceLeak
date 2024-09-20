package burp;

import java.util.Iterator;

public class Zxza implements Iterator<Zgl_> {
  private final Zif Zk;
  
  private int Zy = 0;
  
  public Zxza(Zif paramZif) {
    this.Zk = paramZif;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.Zy < this.Zk.size());
  }
  
  public Zgl_ Ze() {
    return this.Zk.ZBY(this.Zy++);
  }
  
  public void remove() {
    try {
      if (this.Zy == 0)
        throw new IllegalStateException(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.Zk.ZBA(--this.Zy);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxza.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */