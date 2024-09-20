package burp;

import java.util.List;

public class Zkqm implements Zgtz {
  private final int[] ZQ;
  
  public Zkqm(int... paramVarArgs) {
    this.ZQ = paramVarArgs;
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
    //   23: if_icmpge -> 103
    //   26: aload_1
    //   27: iload #4
    //   29: invokeinterface get : (I)Ljava/lang/Object;
    //   34: checkcast burp/Zb3t
    //   37: astore #5
    //   39: aload_0
    //   40: getfield ZQ : [I
    //   43: iload #4
    //   45: invokestatic Zp : ([II)I
    //   48: iflt -> 87
    //   51: aload #5
    //   53: invokeinterface Zk : ()Z
    //   58: ifeq -> 87
    //   61: aload #5
    //   63: invokestatic ZR : (Lburp/Zb3t;)Z
    //   66: ifeq -> 87
    //   69: aload_3
    //   70: aload #5
    //   72: invokeinterface ZC : ()Ljava/util/List;
    //   77: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   82: pop
    //   83: iload_2
    //   84: ifeq -> 96
    //   87: aload_3
    //   88: aload #5
    //   90: invokeinterface add : (Ljava/lang/Object;)Z
    //   95: pop
    //   96: iinc #4, 1
    //   99: iload_2
    //   100: ifeq -> 15
    //   103: aload_3
    //   104: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkqm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */