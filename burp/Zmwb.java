package burp;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.Segment;

class Zmwb {
  private static final Zmwb ZA = new Zmwb();
  
  private final List<Segment> Zx = new ArrayList<>(5);
  
  public static Zmwb ZK() {
    return ZA;
  }
  
  public static Segment Zj() {
    return ZK().ZE();
  }
  
  public static void ZJ(Segment paramSegment) {
    ZK().Zw(paramSegment);
  }
  
  public Segment ZE() {
    synchronized (this) {
      int i = this.Zx.size();
      if (i > 0)
        return this.Zx.remove(i - 1); 
    } 
    return new Zz0h();
  }
  
  public void Zw(Segment paramSegment) {
    if (paramSegment instanceof Zz0h)
      synchronized (this) {
        paramSegment.array = null;
        paramSegment.count = 0;
        this.Zx.add(paramSegment);
      }  
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmwb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */