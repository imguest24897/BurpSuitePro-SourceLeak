package burp;

import java.util.Objects;

public class Zzcq<T extends Zgpi<T>> {
  private final Zefg<T> Zx;
  
  private final Object Zf;
  
  private static String[] ZB;
  
  public Zzcq(Zefg<T> paramZefg) {
    this.Zx = paramZefg;
    this.Zf = paramZefg.Zz6();
  }
  
  public void ZY(T paramT) {
    // Byte code:
    //   0: invokestatic Zd : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: getfield Zf : Ljava/lang/Object;
    //   7: dup
    //   8: astore_3
    //   9: monitorenter
    //   10: astore_2
    //   11: aload_0
    //   12: getfield Zx : Lburp/Zefg;
    //   15: aload_0
    //   16: getfield Zx : Lburp/Zefg;
    //   19: invokeinterface size : ()I
    //   24: aload_1
    //   25: invokeinterface add : (ILjava/lang/Object;)V
    //   30: aload_0
    //   31: getfield Zf : Ljava/lang/Object;
    //   34: invokevirtual notifyAll : ()V
    //   37: aload_3
    //   38: monitorexit
    //   39: goto -> 49
    //   42: astore #4
    //   44: aload_3
    //   45: monitorexit
    //   46: aload #4
    //   48: athrow
    //   49: aload_2
    //   50: ifnull -> 60
    //   53: iconst_1
    //   54: anewarray burp/Zbqc
    //   57: invokestatic Zr : ([Lburp/Zbqc;)V
    //   60: return
    // Exception table:
    //   from	to	target	type
    //   11	39	42	finally
    //   42	46	42	finally
  }
  
  public T Zs() {
    // Byte code:
    //   0: invokestatic Zd : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: getfield Zf : Ljava/lang/Object;
    //   7: dup
    //   8: astore_2
    //   9: monitorenter
    //   10: astore_1
    //   11: aload_0
    //   12: getfield Zx : Lburp/Zefg;
    //   15: invokeinterface isEmpty : ()Z
    //   20: ifeq -> 27
    //   23: aconst_null
    //   24: aload_2
    //   25: monitorexit
    //   26: areturn
    //   27: aload_0
    //   28: getfield Zx : Lburp/Zefg;
    //   31: iconst_0
    //   32: invokeinterface remove : (I)Ljava/lang/Object;
    //   37: checkcast burp/Zgpi
    //   40: aload_2
    //   41: monitorexit
    //   42: invokestatic Zwu : ()[Lburp/Zbqc;
    //   45: ifnonnull -> 55
    //   48: iconst_5
    //   49: anewarray java/lang/String
    //   52: invokestatic ZJ : ([Ljava/lang/String;)V
    //   55: areturn
    //   56: astore_3
    //   57: aload_2
    //   58: monitorexit
    //   59: aload_3
    //   60: athrow
    // Exception table:
    //   from	to	target	type
    //   11	26	56	finally
    //   27	42	56	finally
    //   56	59	56	finally
  }
  
  public int Zu() {
    synchronized (this.Zf) {
      return this.Zx.size();
    } 
  }
  
  public boolean ZN() {
    synchronized (this.Zf) {
      return this.Zx.isEmpty();
    } 
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zzcq zzcq = (Zzcq)paramObject;
    return Objects.equals(this.Zx, zzcq.Zx);
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.Zx });
  }
  
  public static void ZJ(String[] paramArrayOfString) {
    ZB = paramArrayOfString;
  }
  
  public static String[] Zd() {
    return ZB;
  }
  
  static {
    if (Zd() != null)
      ZJ(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzcq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */