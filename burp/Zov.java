package burp;

import java.util.List;

public class Zov implements Zgtz {
  private final int[] Zc;
  
  public Zov(int... paramVarArgs) {
    this.Zc = paramVarArgs;
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
    //   23: if_icmpge -> 85
    //   26: aload_1
    //   27: iload #4
    //   29: invokeinterface get : (I)Ljava/lang/Object;
    //   34: checkcast burp/Zb3t
    //   37: astore #5
    //   39: aload_0
    //   40: getfield Zc : [I
    //   43: iload #4
    //   45: invokestatic Zp : ([II)I
    //   48: iflt -> 69
    //   51: aload_3
    //   52: aload #5
    //   54: invokeinterface ZC : ()Ljava/util/List;
    //   59: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   64: pop
    //   65: iload_2
    //   66: ifeq -> 78
    //   69: aload_3
    //   70: aload #5
    //   72: invokeinterface add : (Ljava/lang/Object;)Z
    //   77: pop
    //   78: iinc #4, 1
    //   81: iload_2
    //   82: ifeq -> 15
    //   85: aload_3
    //   86: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zov.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */