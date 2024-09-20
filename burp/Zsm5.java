package burp;

import java.util.concurrent.ExecutionException;
import javax.swing.SwingWorker;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zsm5 extends SwingWorker<Zt4u, Void> {
  final Zrej Zc;
  
  final Zmp1 ZW;
  
  final Zbgy ZA;
  
  Zsm5(Zbgy paramZbgy, Zrej paramZrej, Zmp1 paramZmp1) {}
  
  protected Zt4u Zq() throws Exception {
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    try {
      if (classLoader == null)
        Thread.currentThread().setContextClassLoader(getClass().getClassLoader()); 
    } catch (Exception exception) {
      throw a(null);
    } 
    return this.ZA.ZS.ZI(this.ZA.ZZ, this.Zc, this.ZW, this.ZA.Zg, this.ZA.Zq, this.ZA.ZW, this.ZA.Zk, this.ZA.Zn, this.ZA.Zs, this.ZA.ZR, this.ZA.Zc, this.ZA.ZI, this.ZA.ZP, this.ZA.Zl, this.ZA.Z_);
  }
  
  protected void done() {
    String[] arrayOfString = Zrk1.ZT();
    try {
      Zt4u zt4u = get();
      try {
        if (zt4u != null) {
          try {
            this.ZA.ZG.ZK(this.ZA);
            if (arrayOfString != null)
              try {
                if (this.ZW.ZZ)
                  this.ZA.ZG.ZK(Zmg9.PROJECT_WIZARD_EXITED); 
              } catch (InterruptedException interruptedException) {
                throw a(null);
              }  
          } catch (InterruptedException interruptedException) {
            throw a(null);
          } 
          return;
        } 
      } catch (InterruptedException interruptedException) {
        throw a(null);
      } 
      try {
        if (this.ZW.ZZ)
          this.ZA.ZG.ZK(Zmg9.PROJECT_WIZARD_EXITED); 
      } catch (InterruptedException interruptedException) {
        throw a(null);
      } 
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
    } catch (ExecutionException executionException) {
      try {
      
      } catch (InterruptedException interruptedException) {
        throw a(null);
      } 
      Throwable throwable = (executionException.getCause() == null) ? executionException : executionException.getCause();
      try {
      
      } catch (InterruptedException interruptedException) {
        throw a(null);
      } 
      Zah.Zl(throwable, (throwable instanceof Ze0d) ? Zk_.USER_ERROR : Zk_.UNEXPECTED);
      String str = throwable.getMessage();
      this.ZA.ZG.ZX(str);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsm5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */