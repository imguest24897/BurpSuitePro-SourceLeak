package burp;

import java.util.Arrays;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Zgfo extends Zg85 {
  private int ZB;
  
  private Consumer<Integer> Zh;
  
  private int ZY;
  
  private int Zf;
  
  private int Zg;
  
  private Set<Integer> Zb;
  
  private boolean Z_;
  
  private Consumer<Boolean> Za;
  
  public void ZI() {
    ZO(Zgfo::lambda$configure$0, Zgfo::lambda$configure$1, 0, 2147483647, 0, new int[0]);
  }
  
  public void Zs(Consumer<Integer> paramConsumer, Consumer<Boolean> paramConsumer1) {
    Zu(paramConsumer, paramConsumer1, 0, 2147483647);
  }
  
  public void ZO(Consumer<Integer> paramConsumer, Consumer<Boolean> paramConsumer1, int paramInt1, int paramInt2, int paramInt3, int... paramVarArgs) {
    this.Zg = paramInt3;
    this.Zb = Arrays.stream(paramVarArgs).boxed().collect((Collector)Collectors.toSet());
    this.Z_ = true;
    Zu(paramConsumer, paramConsumer1, paramInt1, paramInt2);
  }
  
  public void Zu(Consumer<Integer> paramConsumer, Consumer<Boolean> paramConsumer1, int paramInt1, int paramInt2) {
    this.Zh = paramConsumer;
    this.ZY = paramInt1;
    this.Zf = paramInt2;
    this.Za = paramConsumer1;
    addKeyListener(new Zxod(this));
  }
  
  void Zl() {
    // Byte code:
    //   0: invokestatic ZM : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: invokevirtual getText : ()Ljava/lang/String;
    //   8: astore_2
    //   9: aload_2
    //   10: invokevirtual isEmpty : ()Z
    //   13: ifeq -> 86
    //   16: aload_0
    //   17: getfield Z_ : Z
    //   20: ifeq -> 62
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   29: athrow
    //   30: aload_0
    //   31: aload_0
    //   32: getfield Zg : I
    //   35: invokevirtual Zt : (I)V
    //   38: aload_0
    //   39: getfield Za : Ljava/util/function/Consumer;
    //   42: iconst_1
    //   43: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   46: invokeinterface accept : (Ljava/lang/Object;)V
    //   51: iload_1
    //   52: ifne -> 164
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: aload_0
    //   63: getfield Za : Ljava/util/function/Consumer;
    //   66: iconst_0
    //   67: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   70: invokeinterface accept : (Ljava/lang/Object;)V
    //   75: iload_1
    //   76: ifne -> 164
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   85: athrow
    //   86: aload_2
    //   87: ldc '-'
    //   89: invokevirtual equals : (Ljava/lang/Object;)Z
    //   92: ifeq -> 110
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   101: athrow
    //   102: iconst_0
    //   103: goto -> 114
    //   106: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: aload_2
    //   111: invokestatic parseInt : (Ljava/lang/String;)I
    //   114: istore_3
    //   115: aload_0
    //   116: iload_3
    //   117: invokevirtual Zt : (I)V
    //   120: aload_0
    //   121: getfield Za : Ljava/util/function/Consumer;
    //   124: iload_3
    //   125: aload_0
    //   126: getfield ZY : I
    //   129: if_icmplt -> 155
    //   132: iload_3
    //   133: aload_0
    //   134: getfield Zf : I
    //   137: if_icmpgt -> 155
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   146: athrow
    //   147: iconst_1
    //   148: goto -> 156
    //   151: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   154: athrow
    //   155: iconst_0
    //   156: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   159: invokeinterface accept : (Ljava/lang/Object;)V
    //   164: goto -> 188
    //   167: astore_3
    //   168: aload_3
    //   169: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   172: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   175: aload_0
    //   176: getfield Za : Ljava/util/function/Consumer;
    //   179: iconst_0
    //   180: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   183: invokeinterface accept : (Ljava/lang/Object;)V
    //   188: return
    // Exception table:
    //   from	to	target	type
    //   9	23	26	java/lang/Exception
    //   9	164	167	java/lang/Exception
    //   16	55	58	java/lang/Exception
    //   30	79	82	java/lang/Exception
    //   62	95	98	java/lang/Exception
    //   86	106	106	java/lang/Exception
    //   115	140	143	java/lang/Exception
    //   132	151	151	java/lang/Exception
  }
  
  public int ZE() {
    return this.ZB;
  }
  
  public void ZM(int paramInt) {
    boolean bool = (this.Z_ && (paramInt == this.Zg || this.Zb.contains(Integer.valueOf(paramInt)))) ? true : false;
    this.ZB = bool ? this.Zg : paramInt;
    setText(bool ? "" : String.valueOf(paramInt));
  }
  
  private void Zt(int paramInt) {
    this.ZB = paramInt;
    this.Zh.accept(Integer.valueOf(paramInt));
  }
  
  private static void lambda$configure$1(Boolean paramBoolean) {}
  
  private static void lambda$configure$0(Integer paramInteger) {}
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgfo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */