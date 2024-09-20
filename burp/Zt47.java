package burp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.BooleanSupplier;

public class Zt47 extends Zt4h {
  private static final String c;
  
  Zt47(Zl7h paramZl7h, Zr69 paramZr69, Zr_4 paramZr_4, Zkl6 paramZkl6, Zz1m<Zt18> paramZz1m, Ztos<Zt35> paramZtos) {
    super(paramZl7h, paramZr69, paramZr_4, paramZkl6, paramZz1m, paramZtos);
  }
  
  public Queue<Zez7> Zf() {
    LinkedList<Zez7> linkedList = new LinkedList();
    Zt(linkedList);
    Zg(linkedList);
    Zx(linkedList);
    Ze(linkedList);
    Zr(linkedList);
    ZZ(linkedList);
    return linkedList;
  }
  
  private void Zx(Queue<Zez7> paramQueue) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZR : Lburp/Zl7h;
    //   4: invokeinterface ZVf : ()Lburp/Ztfk;
    //   9: invokeinterface Zx : ()Ljava/util/Optional;
    //   14: aload_0
    //   15: aload_1
    //   16: <illegal opcode> accept : (Lburp/Zt47;Ljava/util/Queue;)Ljava/util/function/Consumer;
    //   21: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   24: return
  }
  
  private void lambda$addAllSyntheticCredentialsScenes$1(Queue<Zez7> paramQueue, Zx44 paramZx44) {
    paramQueue.addAll(ZC(new Zezg(Zj(), this.Zv, this.ZR, this.Zd, paramZx44)));
    BooleanSupplier booleanSupplier = this::lambda$addAllSyntheticCredentialsScenes$0;
    paramQueue.addAll(ZQ(paramZx44, c, booleanSupplier));
  }
  
  private boolean lambda$addAllSyntheticCredentialsScenes$0() {
    return (this.ZR.ZVx().ZPC() != null);
  }
  
  static {
    // Byte code:
    //   0: bipush #78
    //   2: ldc 'YxU~)!'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zt47.c : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #101
    //   82: goto -> 111
    //   85: bipush #87
    //   87: goto -> 111
    //   90: bipush #117
    //   92: goto -> 111
    //   95: bipush #84
    //   97: goto -> 111
    //   100: bipush #8
    //   102: goto -> 111
    //   105: iconst_2
    //   106: goto -> 111
    //   109: bipush #53
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt47.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */