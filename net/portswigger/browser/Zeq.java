package net.portswigger.browser;

import burp.Zbqc;
import java.time.Duration;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class Zeq implements Zv {
  private static final Zv Zj = new Zeb();
  
  private final Zq Zk;
  
  private final int ZO;
  
  private final BlockingQueue<Zv> ZT;
  
  private final AtomicReference<Zv> Zm;
  
  private final AtomicBoolean Zf;
  
  private static int Zd;
  
  public Zeq(Zq paramZq, int paramInt) {
    this(paramZq, paramInt, null);
  }
  
  public Zeq(Zq paramZq, int paramInt, Zv paramZv) {
    int i = ZP();
    this.Zk = paramZq;
    this.ZO = paramInt;
    this.ZT = new LinkedBlockingQueue<>();
    this.Zm = new AtomicReference<>(paramZv);
    this.Zf = new AtomicBoolean();
    if (i != 0)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public void Zz(Zv paramZv) {
    this.ZT.add(paramZv);
  }
  
  public void ZW() throws InterruptedException {
    synchronized (this) {
      ZV();
    } 
  }
  
  public void Zf() {
    this.Zf.set(true);
    Za(Zv::Zf);
    this.ZT.forEach(Zv::Zf);
    this.ZT.add(Zj);
    int i = ZT();
    if (Zbqc.Zwu() == null)
      Zs(++i); 
  }
  
  private void ZV() throws InterruptedException {
    byte b = 0;
    do {
      Za(Zv::ZW);
      this.Zm.set(null);
    } while (b++ < this.ZO && Ze(this.Zk.Zj()));
  }
  
  private boolean Ze(Duration paramDuration) throws InterruptedException {
    try {
      if (this.Zf.get())
        return false; 
    } catch (InterruptedException interruptedException) {
      throw a(null);
    } 
    Zv zv = this.ZT.poll(paramDuration.toMillis(), TimeUnit.MILLISECONDS);
    try {
      if (zv == null)
        return false; 
    } catch (InterruptedException interruptedException) {
      throw a(null);
    } 
    this.Zm.set(zv);
    return true;
  }
  
  private <E extends Exception> void Za(Zjj<E> paramZjj) throws E {
    Zv zv = this.Zm.get();
    try {
      if (zv != null)
        paramZjj.ZR(zv); 
    } catch (Exception exception) {
      throw (E)a(null);
    } 
  }
  
  static {
    Zs(0);
  }
  
  public static void Zs(int paramInt) {
    Zd = paramInt;
  }
  
  public static int ZP() {
    return Zd;
  }
  
  public static int ZT() {
    int i = ZP();
    return (i == 0) ? 101 : 0;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zeq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */