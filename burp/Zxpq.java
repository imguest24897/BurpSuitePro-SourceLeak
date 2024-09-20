package burp;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

class Zxpq {
  private final Object ZO = new Object();
  
  private final Deque<Zron> Zl = new LinkedList<>();
  
  Zxpq(Zron paramZron) {
    this.Zl.add(paramZron);
  }
  
  Zron Za() {
    synchronized (this.ZO) {
      return this.Zl.pollFirst();
    } 
  }
  
  void Zi(Zron paramZron) {
    synchronized (this.ZO) {
      this.Zl.addLast(paramZron);
    } 
  }
  
  boolean Zk() {
    synchronized (this.ZO) {
      return !this.Zl.isEmpty();
    } 
  }
  
  void Zf() {
    int[] arrayOfInt = Zlqg.Zy();
    synchronized (this.ZO) {
      List list = this.Zl.stream().filter(Zron::ZD).toList();
      Objects.requireNonNull(this.Zl);
      list.forEach(this.Zl::remove);
      list.forEach(Zxpq::lambda$removeStaleConnections$0);
    } 
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  boolean ZL() {
    synchronized (this.ZO) {
      return this.Zl.stream().anyMatch(Zron::ZD);
    } 
  }
  
  private static void lambda$removeStaleConnections$0(Zron paramZron) {
    Zsdz.ZQ(paramZron.ZW.ZY());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxpq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */