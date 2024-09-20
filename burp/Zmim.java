package burp;

import java.util.Iterator;

class Zmim implements Iterator<Integer> {
  int Zr = 0;
  
  final Zx9y ZF;
  
  Zmim(Zx9y paramZx9y) {}
  
  public boolean hasNext() {
    return (this.Zr < this.ZF.ZL);
  }
  
  public Integer Zp() {
    return Integer.valueOf(this.ZF.ZV.get(this.Zr++));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmim.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */