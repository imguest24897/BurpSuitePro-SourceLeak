package burp;

import java.util.List;

class Zttw implements Zs2i {
  byte[] ZB = null;
  
  int[] ZA = null;
  
  final Zl2 Zy;
  
  final Zrrb ZT;
  
  Zttw(Zrrb paramZrrb, Zl2 paramZl2) {}
  
  public byte ZL() {
    return this.ZT.ZA;
  }
  
  public synchronized byte[] ZE() {
    if (this.ZB == null)
      this.ZB = this.Zy.Zx(this.ZT.ZS, this.ZT.ZA, this.ZT.ZE); 
    return this.ZB;
  }
  
  public synchronized int[] Zm() {
    if (this.ZA == null)
      this.ZA = this.Zy.ZJ(this.ZT.ZS, this.ZT.ZA, this.ZT.Zt); 
    return this.ZA;
  }
  
  public List<Zl1r> ZO() {
    return Zb99.Zh(new Zl1r[] { Zrlp.Zh(Zm()) });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zttw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */