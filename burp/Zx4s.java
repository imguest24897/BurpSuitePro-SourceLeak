package burp;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryType;
import javax.management.ListenerNotFoundException;
import javax.management.Notification;
import javax.management.NotificationEmitter;
import javax.management.NotificationListener;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zx4s implements Ztu3 {
  private NotificationListener Zs;
  
  private static final String a;
  
  public Zx4s(Zlnd paramZlnd) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic ZK : ()[I
    //   7: invokestatic getMemoryPoolMXBeans : ()Ljava/util/List;
    //   10: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   15: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   20: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   25: invokeinterface findFirst : ()Ljava/util/Optional;
    //   30: astore_3
    //   31: astore_2
    //   32: aload_3
    //   33: invokevirtual isPresent : ()Z
    //   36: ifeq -> 105
    //   39: aload_3
    //   40: invokevirtual get : ()Ljava/lang/Object;
    //   43: checkcast java/lang/management/MemoryPoolMXBean
    //   46: astore #4
    //   48: aload #4
    //   50: aload #4
    //   52: invokeinterface getUsage : ()Ljava/lang/management/MemoryUsage;
    //   57: invokevirtual getMax : ()J
    //   60: ldc2_w 95
    //   63: lmul
    //   64: ldc2_w 100
    //   67: ldiv
    //   68: invokeinterface setUsageThreshold : (J)V
    //   73: aload_0
    //   74: aload_0
    //   75: aload_1
    //   76: <illegal opcode> handleNotification : (Lburp/Zx4s;Lburp/Zlnd;)Ljavax/management/NotificationListener;
    //   81: putfield Zs : Ljavax/management/NotificationListener;
    //   84: invokestatic getMemoryMXBean : ()Ljava/lang/management/MemoryMXBean;
    //   87: checkcast javax/management/NotificationEmitter
    //   90: aload_0
    //   91: getfield Zs : Ljavax/management/NotificationListener;
    //   94: aconst_null
    //   95: aconst_null
    //   96: invokeinterface addNotificationListener : (Ljavax/management/NotificationListener;Ljavax/management/NotificationFilter;Ljava/lang/Object;)V
    //   101: aload_2
    //   102: ifnonnull -> 117
    //   105: aload_0
    //   106: aconst_null
    //   107: putfield Zs : Ljavax/management/NotificationListener;
    //   110: iconst_0
    //   111: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   114: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   117: return
  }
  
  public void ZY() {
    if (this.Zs != null)
      try {
        ((NotificationEmitter)ManagementFactory.getMemoryMXBean()).removeNotificationListener(this.Zs, null, null);
      } catch (ListenerNotFoundException listenerNotFoundException) {
        Zah.Zl(listenerNotFoundException, Zk_.UNEXPECTED);
      } finally {
        this.Zs = null;
      }  
  }
  
  private void lambda$new$1(Zlnd paramZlnd, Notification paramNotification, Object paramObject) {
    if (paramNotification.getType().equals(a)) {
      paramZlnd.ZV();
      ZY();
    } 
  }
  
  private static boolean lambda$new$0(MemoryPoolMXBean paramMemoryPoolMXBean) {
    return (paramMemoryPoolMXBean.getType() == MemoryType.HEAP && paramMemoryPoolMXBean.isUsageThresholdSupported());
  }
  
  static {
    // Byte code:
    //   0: bipush #83
    //   2: ldc ''iTM3'xE<\\fhrO hk\\bE!)sTE*#zD'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zx4s.a : Ljava/lang/String;
    //   11: goto -> 153
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #43
    //   82: goto -> 111
    //   85: bipush #21
    //   87: goto -> 111
    //   90: bipush #76
    //   92: goto -> 111
    //   95: bipush #34
    //   97: goto -> 111
    //   100: bipush #41
    //   102: goto -> 111
    //   105: bipush #115
    //   107: goto -> 111
    //   110: iconst_1
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx4s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */