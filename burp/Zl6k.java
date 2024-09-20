package burp;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class Zl6k implements Zzkg {
  private final Deque<Zsij> ZL;
  
  private final Set<Long> ZN;
  
  private final Object ZK;
  
  private int ZT;
  
  public Zl6k() {
    this(new ArrayDeque<>(), new HashSet<>(), 0);
  }
  
  private Zl6k(Deque<Zsij> paramDeque, Set<Long> paramSet, int paramInt) {
    this.ZL = paramDeque;
    this.ZN = paramSet;
    this.ZT = paramInt;
    this.ZK = new Object();
  }
  
  public void Zn(Zsij paramZsij) {
    synchronized (this.ZK) {
      if (!this.ZN.add(Long.valueOf(paramZsij.ZM2())))
        return; 
      this.ZT++;
      if (this.ZL.size() < 50)
        this.ZL.add(paramZsij); 
    } 
  }
  
  public boolean ZR() {
    synchronized (this.ZK) {
      return !this.ZL.isEmpty();
    } 
  }
  
  public Zsij ZE() {
    synchronized (this.ZK) {
      return this.ZL.pop();
    } 
  }
  
  int ZD() {
    synchronized (this.ZK) {
      return this.ZT;
    } 
  }
  
  public void ZW() {
    synchronized (this.ZK) {
      this.ZL.clear();
      this.ZN.clear();
      this.ZT = 0;
    } 
  }
  
  public Zl6k Zu() {
    synchronized (this.ZK) {
      return new Zl6k(new ArrayDeque<>(this.ZL), new HashSet<>(this.ZN), this.ZT);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl6k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */