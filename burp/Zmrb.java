package burp;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

class Zmrb {
  private final Zrgd ZY;
  
  private final Map<String, Zeir> ZM = new ConcurrentHashMap<>();
  
  public Zmrb(Zrgd paramZrgd) {
    this.ZY = paramZrgd;
  }
  
  public Optional<Zeir> Zy(Zlit paramZlit) {
    return Optional.ofNullable(this.ZM.get(Zmg3.ZD(paramZlit)));
  }
  
  public void ZF(Zlit paramZlit, long paramLong1, long paramLong2, int paramInt) {
    Zeir zeir = ZW(paramZlit, paramLong1, paramInt, paramInt - 1);
    synchronized (zeir) {
      zeir.ZU(paramLong2);
    } 
  }
  
  private Zeir ZV(Zlit paramZlit, long paramLong, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface Zdz : ()Lburp/Zmzk;
    //   6: invokeinterface toString : ()Ljava/lang/String;
    //   11: astore #6
    //   13: aload_0
    //   14: getfield ZM : Ljava/util/Map;
    //   17: dup
    //   18: astore #7
    //   20: monitorenter
    //   21: new java/util/concurrent/atomic/AtomicBoolean
    //   24: dup
    //   25: iconst_0
    //   26: invokespecial <init> : (Z)V
    //   29: astore #8
    //   31: aload_0
    //   32: getfield ZM : Ljava/util/Map;
    //   35: invokeinterface values : ()Ljava/util/Collection;
    //   40: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   45: aload #6
    //   47: lload_2
    //   48: iload #4
    //   50: <illegal opcode> test : (Ljava/lang/String;JI)Ljava/util/function/Predicate;
    //   55: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   60: invokeinterface findFirst : ()Ljava/util/Optional;
    //   65: aload_0
    //   66: aload #8
    //   68: aload #6
    //   70: lload_2
    //   71: iload #4
    //   73: iload #5
    //   75: <illegal opcode> get : (Lburp/Zmrb;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/lang/String;JII)Ljava/util/function/Supplier;
    //   80: invokevirtual orElseGet : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   83: checkcast burp/Zeir
    //   86: astore #9
    //   88: aload #8
    //   90: invokevirtual get : ()Z
    //   93: ifeq -> 123
    //   96: aload_0
    //   97: getfield ZM : Ljava/util/Map;
    //   100: invokeinterface values : ()Ljava/util/Collection;
    //   105: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   110: invokeinterface distinct : ()Ljava/util/stream/Stream;
    //   115: invokeinterface count : ()J
    //   120: goto -> 126
    //   123: ldc2_w -1
    //   126: lstore #10
    //   128: aload_0
    //   129: getfield ZM : Ljava/util/Map;
    //   132: aload_1
    //   133: invokestatic ZD : (Lburp/Zlit;)Ljava/lang/String;
    //   136: aload #9
    //   138: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   143: pop
    //   144: aload #8
    //   146: invokevirtual get : ()Z
    //   149: ifeq -> 194
    //   152: aload_0
    //   153: getfield ZM : Ljava/util/Map;
    //   156: invokeinterface values : ()Ljava/util/Collection;
    //   161: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   166: invokeinterface distinct : ()Ljava/util/stream/Stream;
    //   171: invokeinterface count : ()J
    //   176: lstore #12
    //   178: lload #12
    //   180: lload #10
    //   182: lcmp
    //   183: ifeq -> 194
    //   186: getstatic burp/Zv8r.NETWORK_RATE_LIMIT_HEADER_BUCKETS : Lburp/Zv8r;
    //   189: lload #12
    //   191: invokestatic Zi : (Lnet/portswigger/Zzr;J)V
    //   194: aload #9
    //   196: aload #7
    //   198: monitorexit
    //   199: areturn
    //   200: astore #14
    //   202: aload #7
    //   204: monitorexit
    //   205: aload #14
    //   207: athrow
    // Exception table:
    //   from	to	target	type
    //   21	199	200	finally
    //   200	205	200	finally
  }
  
  public void ZX(Zlit paramZlit, long paramLong1, long paramLong2, int paramInt1, int paramInt2) {
    Zeir zeir = ZW(paramZlit, paramLong1, paramInt1, paramInt2);
    synchronized (zeir) {
      zeir.ZU(paramLong2);
      if (paramInt2 < zeir.ZZ)
        zeir.ZK(paramInt2); 
    } 
  }
  
  private Zeir ZW(Zlit paramZlit, long paramLong, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual Zy : (Lburp/Zlit;)Ljava/util/Optional;
    //   5: aload_0
    //   6: aload_1
    //   7: lload_2
    //   8: iload #4
    //   10: iload #5
    //   12: <illegal opcode> get : (Lburp/Zmrb;Lburp/Zlit;JII)Ljava/util/function/Supplier;
    //   17: invokevirtual orElseGet : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   20: checkcast burp/Zeir
    //   23: astore #6
    //   25: lload_2
    //   26: aload #6
    //   28: invokevirtual ZB : ()J
    //   31: lcmp
    //   32: ifeq -> 57
    //   35: aload #6
    //   37: lload_2
    //   38: invokevirtual ZG : (J)V
    //   41: aload #6
    //   43: iload #5
    //   45: invokevirtual ZK : (I)V
    //   48: aload_0
    //   49: aload_1
    //   50: aload #6
    //   52: invokevirtual ZH : (Lburp/Zlit;Lburp/Zeir;)Lburp/Zeir;
    //   55: astore #6
    //   57: aload #6
    //   59: areturn
  }
  
  private Zeir ZH(Zlit paramZlit, Zeir paramZeir) {
    Optional<Zeir> optional = this.ZM.values().stream().filter(paramZeir::lambda$mergeBucketIfAlreadyExists$3).filter(paramZeir::lambda$mergeBucketIfAlreadyExists$4).findFirst();
    if (optional.isPresent()) {
      this.ZM.put(Zmg3.ZD(paramZlit), optional.get());
      return optional.get();
    } 
    return paramZeir;
  }
  
  private static boolean lambda$mergeBucketIfAlreadyExists$4(Zeir paramZeir1, Zeir paramZeir2) {
    return paramZeir2.equals(paramZeir1);
  }
  
  private static boolean lambda$mergeBucketIfAlreadyExists$3(Zeir paramZeir1, Zeir paramZeir2) {
    return (paramZeir2 != paramZeir1);
  }
  
  private Zeir lambda$updateOrCreateBucket$2(Zlit paramZlit, long paramLong, int paramInt1, int paramInt2) {
    return ZV(paramZlit, paramLong, paramInt1, paramInt2);
  }
  
  private Zeir lambda$matchToFingerprint$1(AtomicBoolean paramAtomicBoolean, String paramString, long paramLong, int paramInt1, int paramInt2) {
    paramAtomicBoolean.set(true);
    return new Zeir(this, paramString, paramLong, paramInt1, paramInt2);
  }
  
  private static boolean lambda$matchToFingerprint$0(String paramString, long paramLong, int paramInt, Zeir paramZeir) {
    return (paramZeir.ZR.equals(paramString) && paramLong == paramZeir.ZB() && paramInt == paramZeir.Zh());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmrb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */