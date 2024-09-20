package burp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.swing.SwingUtilities;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zbsv {
  private static String Ze;
  
  public static void Zb(Runnable paramRunnable) {
    // Byte code:
    //   0: invokestatic ZD : ()Ljava/lang/String;
    //   3: astore_1
    //   4: invokestatic isEventDispatchThread : ()Z
    //   7: ifeq -> 27
    //   10: aload_0
    //   11: invokeinterface run : ()V
    //   16: aload_1
    //   17: ifnonnull -> 77
    //   20: goto -> 27
    //   23: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   26: athrow
    //   27: aload_0
    //   28: invokestatic invokeAndWait : (Ljava/lang/Runnable;)V
    //   31: goto -> 77
    //   34: astore_2
    //   35: aload_2
    //   36: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   39: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   42: invokestatic currentThread : ()Ljava/lang/Thread;
    //   45: invokevirtual interrupt : ()V
    //   48: goto -> 77
    //   51: astore_2
    //   52: aload_2
    //   53: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   56: ifnull -> 70
    //   59: aload_2
    //   60: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   63: goto -> 71
    //   66: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   69: athrow
    //   70: aload_2
    //   71: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   74: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   77: return
    // Exception table:
    //   from	to	target	type
    //   4	20	23	java/lang/InterruptedException
    //   27	31	34	java/lang/InterruptedException
    //   27	31	51	java/lang/Exception
    //   52	66	66	java/lang/InterruptedException
  }
  
  public static void Ze() {
    Zb(Zbsv::lambda$awaitSwingThreadCompletion$0);
  }
  
  public static void Zk(long paramLong, TimeUnit paramTimeUnit) {
    String str = ZD();
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    try {
      executorService.submit(Zbsv::Ze).get(paramLong, paramTimeUnit);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } finally {
      executorService.shutdownNow();
    } 
    try {
      if (str == null)
        Zbqc.Zr(new Zbqc[2]); 
    } catch (Exception exception) {
      throw a(null);
    } 
  }
  
  public static void ZH(Runnable paramRunnable) {
    SwingUtilities.invokeLater(paramRunnable::lambda$invokeWhenEventQueueDrained$1);
  }
  
  private static void lambda$invokeWhenEventQueueDrained$1(Runnable paramRunnable) {
    SwingUtilities.invokeLater(paramRunnable);
  }
  
  private static void lambda$awaitSwingThreadCompletion$0() {}
  
  public static void Zi(String paramString) {
    Ze = paramString;
  }
  
  public static String ZD() {
    return Ze;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    if (ZD() == null)
      Zi("RZtRsc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbsv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */