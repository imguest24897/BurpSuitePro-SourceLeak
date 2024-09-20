package burp;

import java.util.List;

public class Ztuq implements Zgtz {
  private final int[] ZS;
  
  public Ztuq(int... paramVarArgs) {
    this.ZS = paramVarArgs;
  }
  
  public List<Zb3t> ZO(List<Zb3t> paramList) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic Zz : ()I
    //   11: iconst_0
    //   12: istore #4
    //   14: istore_2
    //   15: iload #4
    //   17: aload_1
    //   18: invokeinterface size : ()I
    //   23: if_icmpge -> 90
    //   26: aload_1
    //   27: iload #4
    //   29: invokeinterface get : (I)Ljava/lang/Object;
    //   34: checkcast burp/Zb3t
    //   37: astore #5
    //   39: aload_0
    //   40: getfield ZS : [I
    //   43: iload #4
    //   45: invokestatic Zp : ([II)I
    //   48: iflt -> 74
    //   51: aload #5
    //   53: invokeinterface Zk : ()Z
    //   58: ifeq -> 83
    //   61: aload_3
    //   62: aload #5
    //   64: invokeinterface add : (Ljava/lang/Object;)Z
    //   69: pop
    //   70: iload_2
    //   71: ifeq -> 83
    //   74: aload_3
    //   75: aload #5
    //   77: invokeinterface add : (Ljava/lang/Object;)Z
    //   82: pop
    //   83: iinc #4, 1
    //   86: iload_2
    //   87: ifeq -> 15
    //   90: aload_3
    //   91: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztuq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */