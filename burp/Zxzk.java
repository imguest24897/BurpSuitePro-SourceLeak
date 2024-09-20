package burp;

import java.util.List;

public class Zxzk implements Zgtz {
  private final int[] Zs;
  
  public Zxzk(int... paramVarArgs) {
    this.Zs = paramVarArgs;
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
    //   23: if_icmpge -> 93
    //   26: aload_1
    //   27: iload #4
    //   29: invokeinterface get : (I)Ljava/lang/Object;
    //   34: checkcast burp/Zb3t
    //   37: astore #5
    //   39: aload_0
    //   40: getfield Zs : [I
    //   43: iload #4
    //   45: invokestatic Zp : ([II)I
    //   48: iflt -> 77
    //   51: aload #5
    //   53: invokestatic ZR : (Lburp/Zb3t;)Z
    //   56: ifeq -> 77
    //   59: aload_3
    //   60: aload #5
    //   62: invokeinterface ZC : ()Ljava/util/List;
    //   67: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   72: pop
    //   73: iload_2
    //   74: ifeq -> 86
    //   77: aload_3
    //   78: aload #5
    //   80: invokeinterface add : (Ljava/lang/Object;)Z
    //   85: pop
    //   86: iinc #4, 1
    //   89: iload_2
    //   90: ifeq -> 15
    //   93: aload_3
    //   94: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxzk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */