package net.portswigger;

import burp.Zbqc;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class Zgv {
  Queue<Zuz> Zg = new LinkedList<>();
  
  private final Executor Zp;
  
  private Zeh ZT;
  
  private Zi6 Zu;
  
  private Zsp ZM = Zsp.ZV;
  
  private volatile boolean Zv;
  
  public Zgv() {
    this(Executors.newSingleThreadExecutor());
  }
  
  public Zgv(Executor paramExecutor) {
    this.Zp = paramExecutor;
  }
  
  public void Zq(Zeh paramZeh, Zi6 paramZi6, Zsp paramZsp) {
    int i = Zk_.ZG();
    Zuh.Zv((paramZeh != null), Zqf.Zv, 1L);
    Zuh.Zv((paramZi6 != null), Zqf.Zv, 2L);
    Zuh.Zv((this.ZM != null), Zqf.Zv, 3L);
    this.ZT = paramZeh;
    this.Zu = paramZi6;
    this.ZM = paramZsp;
    if (!this.Zg.isEmpty())
      this.Zp.execute(this::lambda$init$0); 
    if (Zbqc.Zwu() == null)
      Zk_.Zl(++i); 
  }
  
  public void ZW() {
    this.Zv = true;
  }
  
  void Zb(Zuz paramZuz) {
    if (this.Zv)
      return; 
    if (this.ZT == null) {
      this.Zg.add(paramZuz);
      return;
    } 
    paramZuz = this.ZM.Za(paramZuz);
    if (this.Zu.Zn(paramZuz))
      this.ZT.Zk(paramZuz); 
  }
  
  private void lambda$init$0() {
    Iterator<Zuz> iterator = this.Zg.iterator();
    int i = Zk_.ZD();
    while (iterator.hasNext()) {
      Zuz zuz = iterator.next();
      try {
        Zb(zuz);
      } catch (Exception exception) {}
      if (i == 0)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zgv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */