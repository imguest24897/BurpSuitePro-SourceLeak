package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zt26 {
  private final List<Runnable> Zh = new ArrayList<>();
  
  private final Ztwv Zs;
  
  private boolean Za = false;
  
  public Zt26(Ztwv paramZtwv) {
    this.Zs = paramZtwv;
  }
  
  public void Zk(Runnable paramRunnable) {
    // Byte code:
    //   0: invokestatic ZG : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zh : Ljava/util/List;
    //   8: dup
    //   9: astore_3
    //   10: monitorenter
    //   11: aload_0
    //   12: getfield Za : Z
    //   15: ifne -> 33
    //   18: aload_0
    //   19: getfield Zh : Ljava/util/List;
    //   22: aload_1
    //   23: invokeinterface add : (Ljava/lang/Object;)Z
    //   28: pop
    //   29: aload_2
    //   30: ifnull -> 44
    //   33: aload_0
    //   34: getfield Zs : Lburp/Ztwv;
    //   37: aload_1
    //   38: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   43: pop
    //   44: aload_3
    //   45: monitorexit
    //   46: goto -> 56
    //   49: astore #4
    //   51: aload_3
    //   52: monitorexit
    //   53: aload #4
    //   55: athrow
    //   56: return
    // Exception table:
    //   from	to	target	type
    //   11	46	49	finally
    //   49	53	49	finally
  }
  
  public void ZC(List<Runnable> paramList) {
    paramList.forEach(this::Zk);
  }
  
  public void ZK() {
    this.Zs.Zx(this::Zh);
  }
  
  void Zh() {
    String[] arrayOfString = Ztom.ZG();
    synchronized (this.Zh) {
      Iterator<Runnable> iterator = this.Zh.iterator();
      while (iterator.hasNext()) {
        Runnable runnable = iterator.next();
        iterator.remove();
        try {
          runnable.run();
        } catch (Exception exception) {
          Zah.Zl(exception, Zk_.UNEXPECTED);
        } 
        if (arrayOfString != null)
          break; 
      } 
      this.Za = true;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt26.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */