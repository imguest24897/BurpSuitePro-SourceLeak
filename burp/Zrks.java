package burp;

import java.util.Iterator;

class Zrks implements Iterator<Zggb> {
  private final Iterator<Boolean> Zm = this.ZB.Zl.iterator();
  
  private int Zb = 0;
  
  private int Zv = 0;
  
  final Zsob ZB;
  
  Zrks(Zsob paramZsob) {}
  
  public boolean hasNext() {
    return this.Zm.hasNext();
  }
  
  public Zggb ZS() {
    int i = Zsob.Zl();
    boolean bool = ((Boolean)this.Zm.next()).booleanValue();
    int j = bool ? this.Zv : this.Zb;
    if (bool) {
      this.Zv++;
      if (i == 0) {
        this.Zb++;
        return new Zggb(bool, j);
      } 
      return new Zggb(bool, j);
    } 
    this.Zb++;
    return new Zggb(bool, j);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrks.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */