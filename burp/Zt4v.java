package burp;

import java.util.LinkedList;
import java.util.Queue;

public class Zt4v extends Zt4h {
  Zt4v(Zl7h paramZl7h, Zr69 paramZr69, Zr_4 paramZr_4, Zkl6 paramZkl6, Zz1m<Zt18> paramZz1m, Ztos<Zt35> paramZtos) {
    super(paramZl7h, paramZr69, paramZr_4, paramZkl6, paramZz1m, paramZtos);
  }
  
  public Queue<Zez7> Zf() {
    LinkedList<Zez7> linkedList = new LinkedList();
    Zt(linkedList);
    Zg(linkedList);
    Ze(linkedList);
    Zr(linkedList);
    ZZ(linkedList);
    return linkedList;
  }
  
  protected void Zt(Queue<Zez7> paramQueue) {
    if (this.ZR.ZVf().ZV().isEmpty())
      super.Zt(paramQueue); 
  }
  
  protected void Zg(Queue<Zez7> paramQueue) {
    int[] arrayOfInt = Zt4q.Zh();
    if (!this.ZR.ZVf().ZK()) {
      paramQueue.addAll(ZC(new Zezc(Zj(), this.Zv, this.Zd, this.ZR, null)));
      if (arrayOfInt != null) {
        if (this.ZR.ZVf().Zh().isPresent())
          paramQueue.addAll(ZC(new Zezd(Zj(), this.Zv, this.Zd, this.ZR))); 
        return;
      } 
      return;
    } 
    if (this.ZR.ZVf().Zh().isPresent())
      paramQueue.addAll(ZC(new Zezd(Zj(), this.Zv, this.Zd, this.ZR))); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt4v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */