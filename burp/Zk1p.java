package burp;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zk1p {
  private final CountDownLatch Zc = new CountDownLatch(1);
  
  private volatile boolean Zh;
  
  final Zb3e Zu;
  
  private Zk1p(Zb3e paramZb3e) {}
  
  public void ZA(List<Zeu1> paramList, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zu : Lburp/Zb3e;
    //   4: getfield ZI : Lburp/Ztwv;
    //   7: aload_0
    //   8: aload_1
    //   9: iload_2
    //   10: <illegal opcode> run : (Lburp/Zk1p;Ljava/util/List;Z)Ljava/lang/Runnable;
    //   15: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   20: pop
    //   21: return
  }
  
  public void ZD() {
    this.Zh = true;
  }
  
  private void ZE() {
    try {
      this.Zc.await();
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
    } 
  }
  
  private void lambda$load$0(List paramList, boolean paramBoolean) {
    int i = Zl9.ZK();
    try {
      this.Zu.Z_.ZQ();
      if (paramList != null) {
        for (Zeu1 zeu1 : paramList) {
          try {
            if (this.Zh)
              break; 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          try {
            if (!this.Zu.Z_.Za(zeu1)) {
              if (zeu1.ZR())
                zeu1 = this.Zu.Z_.Zy(zeu1); 
              try {
                this.Zu.Z_.Zc(zeu1);
                if (zeu1.Zc() && paramBoolean)
                  try {
                    this.Zu.Z_.Zz(zeu1, false, false);
                  } catch (Throwable throwable) {
                    try {
                      Zah.Zl(throwable, Zk_.COMMON_RUNTIME_FAILURE);
                      if (!zeu1.ZP())
                        Zmgc.LOAD_EXTENSION_FAILED.ZV(this.Zu.ZB, new Object[] { zeu1.ZN() }); 
                    } catch (Throwable throwable1) {
                      throw a(null);
                    } 
                  }  
              } catch (Throwable throwable) {
                throw a(null);
              } 
            } 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          if (i == 0)
            break; 
        } 
        try {
          if (!this.Zh)
            this.Zu.Z_.Zn(); 
        } catch (Throwable throwable) {
          throw a(null);
        } 
      } 
    } finally {
      this.Zc.countDown();
    } 
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk1p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */