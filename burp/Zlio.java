package burp;

import java.util.List;

public class Zlio {
  private static final Zbwk ZZ = Zlio::lambda$static$0;
  
  private final Zz3r Zs;
  
  private final List<Zxj3> Zw;
  
  private final List<Zthd> ZQ;
  
  protected final boolean Zv;
  
  protected final Zbwk ZF;
  
  protected Zlio(Zm4c<?> paramZm4c) {
    this.Zs = paramZm4c.ZV;
    this.Zw = paramZm4c.ZW;
    this.ZQ = paramZm4c.ZX;
    this.Zv = paramZm4c.ZU;
    this.ZF = paramZm4c.ZK ? ZZ : Zbwk.ZI;
  }
  
  public List<Zg8y> ZW(Zski paramZski, Zs68 paramZs68) {
    // Byte code:
    //   0: invokestatic Zj : ()I
    //   3: istore_3
    //   4: new burp/Zbju
    //   7: dup
    //   8: aload_0
    //   9: getfield Zv : Z
    //   12: aload_0
    //   13: getfield ZF : Lburp/Zbwk;
    //   16: invokespecial <init> : (ZLburp/Zbwk;)V
    //   19: astore #4
    //   21: aload_2
    //   22: getfield Zd : Ljava/util/List;
    //   25: ifnonnull -> 32
    //   28: aconst_null
    //   29: goto -> 39
    //   32: aload_2
    //   33: getfield Zd : Ljava/util/List;
    //   36: invokestatic ZN : (Ljava/util/List;)Ljava/lang/String;
    //   39: astore #5
    //   41: aload_1
    //   42: aload_2
    //   43: getfield ZH : Lburp/Zk8m;
    //   46: aload #5
    //   48: aconst_null
    //   49: aload_2
    //   50: aconst_null
    //   51: invokestatic Zw : (Lburp/Zski;Lburp/Zk8m;Ljava/lang/String;Lnet/portswigger/browser/Zcv;Ljava/lang/Object;Lnet/portswigger/browser/Zjq;)Lburp/Zmfc;
    //   54: astore #6
    //   56: aload_0
    //   57: getfield Zw : Ljava/util/List;
    //   60: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   65: aload #6
    //   67: <illegal opcode> test : (Lburp/Zmfc;)Ljava/util/function/Predicate;
    //   72: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   77: aload #6
    //   79: aload #4
    //   81: <illegal opcode> accept : (Lburp/Zmfc;Lburp/Zbju;)Ljava/util/function/Consumer;
    //   86: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   91: aload #4
    //   93: invokevirtual ZT : ()Ljava/util/List;
    //   96: invokestatic Zwu : ()[Lburp/Zbqc;
    //   99: ifnonnull -> 109
    //   102: iinc #3, 1
    //   105: iload_3
    //   106: invokestatic Zj : (I)V
    //   109: areturn
  }
  
  protected void ZP(Zz3o paramZz3o, Zlve paramZlve, Zbju paramZbju) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zs : Lburp/Zz3r;
    //   4: aload_2
    //   5: invokevirtual ZJ : (Lburp/Zlve;)Z
    //   8: ifeq -> 23
    //   11: aload_0
    //   12: getfield Zs : Lburp/Zz3r;
    //   15: aload_2
    //   16: aload_3
    //   17: invokevirtual ZA : (Lburp/Zlve;Lburp/Zbju;)Z
    //   20: ifne -> 71
    //   23: aload_0
    //   24: getfield Zw : Ljava/util/List;
    //   27: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   32: aload_1
    //   33: aload_2
    //   34: <illegal opcode> test : (Lburp/Zz3o;Lburp/Zlve;)Ljava/util/function/Predicate;
    //   39: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   44: aload_2
    //   45: aload_3
    //   46: <illegal opcode> accept : (Lburp/Zlve;Lburp/Zbju;)Ljava/util/function/Consumer;
    //   51: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   56: aload_2
    //   57: invokevirtual ZO : ()Ljava/util/Optional;
    //   60: aload_0
    //   61: aload_1
    //   62: aload_3
    //   63: <illegal opcode> accept : (Lburp/Zlio;Lburp/Zz3o;Lburp/Zbju;)Ljava/util/function/Consumer;
    //   68: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   71: return
  }
  
  private void lambda$getOutboundEdges$7(Zz3o paramZz3o, Zbju paramZbju, Zt70 paramZt70) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Ljava/util/List;
    //   4: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   9: aload_1
    //   10: aload_3
    //   11: <illegal opcode> test : (Lburp/Zz3o;Lburp/Zt70;)Ljava/util/function/Predicate;
    //   16: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   21: aload_3
    //   22: aload_2
    //   23: <illegal opcode> accept : (Lburp/Zt70;Lburp/Zbju;)Ljava/util/function/Consumer;
    //   28: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   33: return
  }
  
  private static void lambda$getOutboundEdges$6(Zt70 paramZt70, Zbju paramZbju, Zthd paramZthd) {
    paramZthd.Zj(paramZt70, paramZbju);
  }
  
  private static boolean lambda$getOutboundEdges$5(Zz3o paramZz3o, Zt70 paramZt70, Zthd paramZthd) {
    return paramZthd.Z_(paramZz3o, paramZt70);
  }
  
  private static void lambda$getOutboundEdges$4(Zlve paramZlve, Zbju paramZbju, Zxj3 paramZxj3) {
    paramZxj3.Zj(paramZlve.ZJ(), paramZbju);
  }
  
  private static boolean lambda$getOutboundEdges$3(Zz3o paramZz3o, Zlve paramZlve, Zxj3 paramZxj3) {
    return paramZxj3.Z_(paramZz3o, paramZlve.ZJ());
  }
  
  private static void lambda$getAllOutboundEdges$2(Zmfc<?> paramZmfc, Zbju paramZbju, Zxj3 paramZxj3) {
    paramZxj3.Zj(paramZmfc, paramZbju);
  }
  
  private static boolean lambda$getAllOutboundEdges$1(Zmfc<?> paramZmfc, Zxj3 paramZxj3) {
    return paramZxj3.Z_(Zz3o.FOYER, paramZmfc);
  }
  
  private static Zmkk lambda$static$0(Zg8y paramZg8y) {
    return (paramZg8y instanceof Zlvj) ? Zmkk.ZR() : Zmkk.Zy(Zlmk.NOT_REQUESTABLE);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlio.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */