package burp;

import java.util.List;
import java.util.Queue;
import java.util.function.Supplier;

public class Zm6x {
  private final ThreadLocal<Zmkg> ZW;
  
  private final Zetr ZX;
  
  private final Zk9d ZJ;
  
  private final Zxxz ZE;
  
  private final Zlac Zv;
  
  private final Zgzs Zu;
  
  private static String ZT;
  
  public Zm6x() {
    this(new Zrt2());
  }
  
  Zm6x(Zrt2 paramZrt2) {
    this.ZJ = paramZrt2.Zy;
    this.ZE = new Zxxz(new Zmkp(this, paramZrt2.Zy), paramZrt2.Zx, paramZrt2.Zw, paramZrt2.Zr);
    this.Zu = new Zgzs(paramZrt2.Zi);
    this.ZX = new Zetr(this.Zu);
    String str = Ze();
    this.Zv = new Zlac(this.Zu);
    this.ZW = ThreadLocal.withInitial(Zmkg::new);
    if (str == null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public void ZK(Zmt5<?>... paramVarArgs) {
    // Byte code:
    //   0: invokestatic Ze : ()Ljava/lang/String;
    //   3: aload_0
    //   4: getfield ZX : Lburp/Zetr;
    //   7: dup
    //   8: astore_3
    //   9: monitorenter
    //   10: astore_2
    //   11: aload_1
    //   12: astore #4
    //   14: aload #4
    //   16: arraylength
    //   17: istore #5
    //   19: iconst_0
    //   20: istore #6
    //   22: iload #6
    //   24: iload #5
    //   26: if_icmpge -> 49
    //   29: aload #4
    //   31: iload #6
    //   33: aaload
    //   34: astore #7
    //   36: aload_0
    //   37: aload #7
    //   39: invokevirtual ZK : (Lburp/Zmt5;)V
    //   42: iinc #6, 1
    //   45: aload_2
    //   46: ifnonnull -> 22
    //   49: aload_3
    //   50: monitorexit
    //   51: goto -> 61
    //   54: astore #8
    //   56: aload_3
    //   57: monitorexit
    //   58: aload #8
    //   60: athrow
    //   61: return
    // Exception table:
    //   from	to	target	type
    //   11	51	54	finally
    //   54	58	54	finally
  }
  
  public <T> Zmt5<T> ZP(Class<T> paramClass, Zxjl<T> paramZxjl) {
    return ZJ(paramClass, Zehw.ASYNC, false, paramZxjl);
  }
  
  public <T> Zmt5<T> ZO(Class<T> paramClass, Zehw paramZehw, Zxjl<T> paramZxjl) {
    return ZJ(paramClass, paramZehw, false, paramZxjl);
  }
  
  public <T> Zmt5<T> ZJ(Class<T> paramClass, Zehw paramZehw, boolean paramBoolean, Zxjl<T> paramZxjl) {
    Zm67<T> zm67 = new Zm67<>(paramClass, paramZehw, paramBoolean, paramZxjl);
    ZK((Zmt5<?>[])new Zmt5[] { zm67 });
    return zm67;
  }
  
  public void Ze(Zmt5<?>... paramVarArgs) {
    this.ZX.ZK(paramVarArgs);
  }
  
  public void ZB(Object paramObject) {
    Zmkg zmkg = this.ZW.get();
    Queue<Object> queue = zmkg.ZF;
    String str = Ze();
    queue.add(paramObject);
    if (!zmkg.ZK) {
      zmkg.ZK = true;
      try {
        while (!queue.isEmpty()) {
          ZR(queue.poll());
          if (str == null)
            break; 
        } 
      } finally {
        zmkg.ZK = false;
      } 
    } 
  }
  
  public void Zj(Object paramObject) {
    this.Zv.ZW(paramObject);
    ZB(paramObject);
  }
  
  private void ZK(Zmt5<?> paramZmt5) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZX : Lburp/Zetr;
    //   4: aload_1
    //   5: invokevirtual ZR : (Lburp/Zmt5;)Lburp/Zb4k;
    //   8: astore_2
    //   9: aload_0
    //   10: getfield Zv : Lburp/Zlac;
    //   13: aload_2
    //   14: invokevirtual Zd : (Lburp/Zmt5;)Ljava/util/List;
    //   17: aload_0
    //   18: aload_2
    //   19: <illegal opcode> accept : (Lburp/Zm6x;Lburp/Zb4k;)Ljava/util/function/Consumer;
    //   24: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   29: return
  }
  
  private void ZR(Object paramObject) throws Error {
    boolean bool = false;
    List<Class<?>> list = this.Zu.Zh(paramObject.getClass());
    String str = Ze();
    for (Class<?> clazz : list) {
      bool |= ZC(paramObject, clazz);
      if (str == null)
        break; 
    } 
    try {
      if (!bool)
        this.ZJ.Zb(this, paramObject); 
    } catch (Error error) {
      throw a(null);
    } 
  }
  
  private boolean ZC(Object paramObject, Class<?> paramClass) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZX : Lburp/Zetr;
    //   4: aload_2
    //   5: invokevirtual ZR : (Ljava/lang/Class;)Ljava/util/List;
    //   8: astore_3
    //   9: aload_3
    //   10: ifnull -> 37
    //   13: aload_3
    //   14: invokeinterface isEmpty : ()Z
    //   19: ifne -> 37
    //   22: aload_3
    //   23: aload_0
    //   24: aload_1
    //   25: <illegal opcode> accept : (Lburp/Zm6x;Ljava/lang/Object;)Ljava/util/function/Consumer;
    //   30: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   35: iconst_1
    //   36: ireturn
    //   37: iconst_0
    //   38: ireturn
  }
  
  private void lambda$postSingleEventForEventType$1(Object paramObject, Zb4k paramZb4k) {
    this.ZE.ZJ(new Zrxp(paramObject, paramZb4k));
  }
  
  private void lambda$subscribe$0(Zb4k paramZb4k, Object paramObject) {
    this.ZE.ZJ(new Zrxp(paramObject, paramZb4k));
  }
  
  public static void ZE(String paramString) {
    ZT = paramString;
  }
  
  public static String Ze() {
    return ZT;
  }
  
  private static Error a(Error paramError) {
    return paramError;
  }
  
  static {
    if (Ze() == null)
      ZE("KOGUob"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm6x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */