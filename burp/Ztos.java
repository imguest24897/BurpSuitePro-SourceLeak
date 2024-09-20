package burp;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public class Ztos<E extends Zt3y> implements Zz1m<E>, Zlli<E> {
  private final Zt3y Zw;
  
  private final Map<Zlnb<?>, List<Zz1x>> ZF;
  
  private static String[] Zl;
  
  public Ztos(Zt3y paramZt3y) {
    this.Zw = paramZt3y;
    this.ZF = new ConcurrentHashMap<>();
  }
  
  public <T> void ZD(Zxr8<T> paramZxr8) throws Zz_h {
    Zlnb<T> zlnb = paramZxr8.Zq();
    try {
      if (!this.Zw.Zl(zlnb))
        throw new Zz_h(zlnb); 
    } catch (Zz_h zz_h) {
      throw a(null);
    } 
    List list = this.ZF.get(zlnb);
    try {
      if (list != null)
        list.forEach(paramZxr8::lambda$publish$0); 
    } catch (Zz_h zz_h) {
      throw a(null);
    } 
  }
  
  public <T> Zgrn Zo(Zlnb<T> paramZlnb, Consumer<Zxr8<T>> paramConsumer, Executor paramExecutor, Zrij paramZrij) throws Zz_h {
    // Byte code:
    //   0: invokestatic ZF : ()I
    //   3: istore #5
    //   5: aload_0
    //   6: getfield Zw : Lburp/Zt3y;
    //   9: aload_1
    //   10: invokevirtual Zl : (Lburp/Zlnb;)Z
    //   13: ifne -> 29
    //   16: new burp/Zz_h
    //   19: dup
    //   20: aload_1
    //   21: invokespecial <init> : (Lburp/Zlnb;)V
    //   24: athrow
    //   25: invokestatic a : (Lburp/Zz_h;)Lburp/Zz_h;
    //   28: athrow
    //   29: aload_0
    //   30: getfield ZF : Ljava/util/Map;
    //   33: aload_1
    //   34: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   39: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   44: checkcast java/util/List
    //   47: astore #6
    //   49: new burp/Zz1x
    //   52: dup
    //   53: aload_2
    //   54: aload_3
    //   55: aload #4
    //   57: invokespecial <init> : (Ljava/util/function/Consumer;Ljava/util/concurrent/Executor;Lburp/Zrij;)V
    //   60: astore #7
    //   62: aload #6
    //   64: aload #7
    //   66: invokeinterface add : (Ljava/lang/Object;)Z
    //   71: pop
    //   72: aload #6
    //   74: invokestatic sort : (Ljava/util/List;)V
    //   77: aload #6
    //   79: aload #7
    //   81: <illegal opcode> ZZ : (Ljava/util/List;Lburp/Zz1x;)Lburp/Zgrn;
    //   86: iload #5
    //   88: ifne -> 105
    //   91: iconst_4
    //   92: anewarray burp/Zbqc
    //   95: invokestatic Zr : ([Lburp/Zbqc;)V
    //   98: goto -> 105
    //   101: invokestatic a : (Lburp/Zz_h;)Lburp/Zz_h;
    //   104: athrow
    //   105: areturn
    // Exception table:
    //   from	to	target	type
    //   5	25	25	burp/Zz_h
    //   62	98	101	burp/Zz_h
  }
  
  private static void lambda$subscribe$2(List paramList, Zz1x paramZz1x) {
    paramList.remove(paramZz1x);
  }
  
  private static List lambda$subscribe$1(Zlnb paramZlnb) {
    return new CopyOnWriteArrayList();
  }
  
  private static void lambda$publish$0(Zxr8<?> paramZxr8, Zz1x paramZz1x) {
    paramZz1x.ZX(paramZxr8);
  }
  
  public static void ZW(String[] paramArrayOfString) {
    Zl = paramArrayOfString;
  }
  
  public static String[] Za() {
    return Zl;
  }
  
  private static Zz_h a(Zz_h paramZz_h) {
    return paramZz_h;
  }
  
  static {
    if (Za() == null)
      ZW(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztos.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */