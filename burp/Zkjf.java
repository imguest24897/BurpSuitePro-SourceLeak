package burp;

import java.awt.Container;
import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zkjf {
  private static final Container ZZ = new Container();
  
  public static void ZO(Runnable paramRunnable) {
    int[] arrayOfInt = Zg00.Zk();
    if (EventQueue.isDispatchThread()) {
      paramRunnable.run();
      if (arrayOfInt == null) {
        ZQ(paramRunnable);
        return;
      } 
      return;
    } 
    ZQ(paramRunnable);
  }
  
  private static void ZQ(Runnable paramRunnable) {
    try {
      EventQueue.invokeAndWait(paramRunnable);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
    } catch (InvocationTargetException invocationTargetException) {
      Throwable throwable = invocationTargetException.getCause();
      try {
      
      } catch (InterruptedException interruptedException) {
        throw a(null);
      } 
      Zah.Zl((throwable != null) ? throwable : invocationTargetException, Zk_.UNEXPECTED);
    } 
  }
  
  public static Object Zy() {
    return ZZ.getTreeLock();
  }
  
  public static void Zb(Runnable paramRunnable) {
    synchronized (Zy()) {
      paramRunnable.run();
    } 
  }
  
  public static <T> T Zj(Supplier<T> paramSupplier) {
    synchronized (Zy()) {
      return paramSupplier.get();
    } 
  }
  
  public static boolean ZC(BooleanSupplier paramBooleanSupplier) {
    synchronized (Zy()) {
      return paramBooleanSupplier.getAsBoolean();
    } 
  }
  
  public static int Zp(IntSupplier paramIntSupplier) {
    synchronized (Zy()) {
      return paramIntSupplier.getAsInt();
    } 
  }
  
  private static void lambda$getOnDispatchThread$0(AtomicReference paramAtomicReference, Supplier paramSupplier) {
    paramAtomicReference.set(paramSupplier.get());
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkjf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */