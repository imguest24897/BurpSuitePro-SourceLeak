package burp;

import java.awt.Window;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

public class Zkb3 {
  private final AtomicBoolean Zd;
  
  private final Supplier<Zl_q> Zn;
  
  private final Zeaw ZX;
  
  private final Zrgm Zf;
  
  private final Zeg4 ZN;
  
  public Zkb3(boolean paramBoolean, Supplier<Zl_q> paramSupplier, Zeaw paramZeaw, Zrgm paramZrgm, Zeg4 paramZeg4) {
    this.Zd = new AtomicBoolean(paramBoolean);
    this.Zn = paramSupplier;
    this.ZX = paramZeaw;
    this.Zf = paramZrgm;
    this.ZN = paramZeg4;
  }
  
  public void ZI(Window paramWindow) {
    // Byte code:
    //   0: invokestatic ZN : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Zn : Ljava/util/function/Supplier;
    //   8: invokeinterface get : ()Ljava/lang/Object;
    //   13: checkcast burp/Zl_q
    //   16: invokeinterface ZK : ()Z
    //   21: ifeq -> 52
    //   24: aload_0
    //   25: getfield ZX : Lburp/Zeaw;
    //   28: invokevirtual ZE : ()Z
    //   31: ifeq -> 43
    //   34: aload_0
    //   35: aload_1
    //   36: invokevirtual Za : (Ljava/awt/Window;)V
    //   39: iload_2
    //   40: ifne -> 57
    //   43: aload_0
    //   44: aload_1
    //   45: invokevirtual Zi : (Ljava/awt/Window;)V
    //   48: iload_2
    //   49: ifne -> 57
    //   52: aload_0
    //   53: aload_1
    //   54: invokevirtual Zf : (Ljava/awt/Window;)V
    //   57: return
  }
  
  private void Za(Window paramWindow) {
    boolean bool = this.Zf.Zv();
    if (this.Zd.getAndSet(false) && bool) {
      Zr7x zr7x = new Zr7x(paramWindow, this::lambda$performOnResultsClosePersistedAttackBehaviour$0);
      zr7x.setVisible(true);
    } 
    ((Zl_q)this.Zn.get()).ZJ();
  }
  
  private void Zf(Window paramWindow) {
    // Byte code:
    //   0: invokestatic ZD : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Zf : Lburp/Zrgm;
    //   8: invokeinterface ZH : ()Lburp/Zmc;
    //   13: astore_3
    //   14: getstatic burp/Zso6.ZC : [I
    //   17: aload_3
    //   18: invokevirtual ordinal : ()I
    //   21: iaload
    //   22: tableswitch default -> 150, 1 -> 48, 2 -> 75, 3 -> 102
    //   48: getstatic burp/Zrrh.INTRUDER_ATTACK_CLOSE_RESULTS_RUNNING_CONTINUE_IN_BACKGROUND : Lburp/Zrrh;
    //   51: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   54: aload_0
    //   55: getfield Zn : Ljava/util/function/Supplier;
    //   58: invokeinterface get : ()Ljava/lang/Object;
    //   63: checkcast burp/Zl_q
    //   66: invokeinterface ZJ : ()V
    //   71: iload_2
    //   72: ifeq -> 150
    //   75: getstatic burp/Zrrh.INTRUDER_ATTACK_CLOSE_RESULTS_RUNNING_DELETE_TASK : Lburp/Zrrh;
    //   78: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   81: aload_0
    //   82: getfield Zn : Ljava/util/function/Supplier;
    //   85: invokeinterface get : ()Ljava/lang/Object;
    //   90: checkcast burp/Zl_q
    //   93: invokeinterface Za : ()V
    //   98: iload_2
    //   99: ifeq -> 150
    //   102: getstatic burp/Zrrh.INTRUDER_ATTACK_CLOSE_RESULTS_RUNNING_ASK : Lburp/Zrrh;
    //   105: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   108: new burp/Zr7w
    //   111: dup
    //   112: aload_1
    //   113: aload_0
    //   114: getfield Zn : Ljava/util/function/Supplier;
    //   117: invokeinterface get : ()Ljava/lang/Object;
    //   122: checkcast burp/Zl_q
    //   125: aload_0
    //   126: getfield Zf : Lburp/Zrgm;
    //   129: dup
    //   130: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   133: pop
    //   134: <illegal opcode> accept : (Lburp/Zrgm;)Ljava/util/function/Consumer;
    //   139: invokespecial <init> : (Ljava/awt/Window;Lburp/Zl_q;Ljava/util/function/Consumer;)V
    //   142: astore #4
    //   144: aload #4
    //   146: iconst_1
    //   147: invokevirtual setVisible : (Z)V
    //   150: return
  }
  
  private void Zi(Window paramWindow) {
    // Byte code:
    //   0: invokestatic ZN : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Zf : Lburp/Zrgm;
    //   8: invokeinterface ZS : ()Lburp/Zgui;
    //   13: astore_3
    //   14: getstatic burp/Zso6.ZU : [I
    //   17: aload_3
    //   18: invokevirtual ordinal : ()I
    //   21: iaload
    //   22: tableswitch default -> 222, 1 -> 52, 2 -> 109, 3 -> 136, 4 -> 163
    //   52: getstatic burp/Zrrh.INTRUDER_ATTACK_CLOSE_RESULTS_FINISHED_SAVE_TO_PROJECT_FILE : Lburp/Zrrh;
    //   55: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   58: aload_0
    //   59: getfield ZX : Lburp/Zeaw;
    //   62: invokevirtual Zz : ()Z
    //   65: ifeq -> 88
    //   68: aload_0
    //   69: getfield ZN : Lburp/Zeg4;
    //   72: getstatic burp/Zeg4.Zp : Ljava/lang/Runnable;
    //   75: getstatic burp/Zssw.CLOSE : Lburp/Zssw;
    //   78: invokeinterface ZM : (Ljava/lang/Runnable;Lburp/Zssw;)Ljava/util/concurrent/Future;
    //   83: pop
    //   84: iload_2
    //   85: ifne -> 222
    //   88: aload_0
    //   89: getfield Zn : Ljava/util/function/Supplier;
    //   92: invokeinterface get : ()Ljava/lang/Object;
    //   97: checkcast burp/Zl_q
    //   100: invokeinterface ZJ : ()V
    //   105: iload_2
    //   106: ifne -> 222
    //   109: getstatic burp/Zrrh.INTRUDER_ATTACK_CLOSE_RESULTS_FINISHED_KEEP_MEMORY : Lburp/Zrrh;
    //   112: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   115: aload_0
    //   116: getfield Zn : Ljava/util/function/Supplier;
    //   119: invokeinterface get : ()Ljava/lang/Object;
    //   124: checkcast burp/Zl_q
    //   127: invokeinterface ZJ : ()V
    //   132: iload_2
    //   133: ifne -> 222
    //   136: getstatic burp/Zrrh.INTRUDER_ATTACK_CLOSE_RESULTS_FINISHED_DELETE_TASK : Lburp/Zrrh;
    //   139: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   142: aload_0
    //   143: getfield Zn : Ljava/util/function/Supplier;
    //   146: invokeinterface get : ()Ljava/lang/Object;
    //   151: checkcast burp/Zl_q
    //   154: invokeinterface Za : ()V
    //   159: iload_2
    //   160: ifne -> 222
    //   163: getstatic burp/Zrrh.INTRUDER_ATTACK_CLOSE_RESULTS_FINISHED_ASK : Lburp/Zrrh;
    //   166: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   169: new burp/Zr7z
    //   172: dup
    //   173: aload_1
    //   174: aload_0
    //   175: getfield Zn : Ljava/util/function/Supplier;
    //   178: invokeinterface get : ()Ljava/lang/Object;
    //   183: checkcast burp/Zl_q
    //   186: aload_0
    //   187: getfield ZN : Lburp/Zeg4;
    //   190: aload_0
    //   191: getfield Zf : Lburp/Zrgm;
    //   194: dup
    //   195: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   198: pop
    //   199: <illegal opcode> accept : (Lburp/Zrgm;)Ljava/util/function/Consumer;
    //   204: aload_0
    //   205: getfield ZX : Lburp/Zeaw;
    //   208: invokevirtual Zz : ()Z
    //   211: invokespecial <init> : (Ljava/awt/Window;Lburp/Zl_q;Lburp/Zeg4;Ljava/util/function/Consumer;Z)V
    //   214: astore #4
    //   216: aload #4
    //   218: iconst_1
    //   219: invokevirtual setVisible : (Z)V
    //   222: return
  }
  
  private void lambda$performOnResultsClosePersistedAttackBehaviour$0() {
    this.Zf.ZJ(false);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkb3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */