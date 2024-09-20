package burp;

import java.util.List;

public class Zs22 implements Zgtz {
  public List<Zb3t> ZO(List<Zb3t> paramList) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZB : ()I
    //   11: aload_1
    //   12: invokeinterface iterator : ()Ljava/util/Iterator;
    //   17: astore #4
    //   19: istore_2
    //   20: aload #4
    //   22: invokeinterface hasNext : ()Z
    //   27: ifeq -> 81
    //   30: aload #4
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast burp/Zb3t
    //   40: astore #5
    //   42: aload #5
    //   44: invokestatic ZR : (Lburp/Zb3t;)Z
    //   47: ifeq -> 68
    //   50: aload_3
    //   51: aload #5
    //   53: invokeinterface ZC : ()Ljava/util/List;
    //   58: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   63: pop
    //   64: iload_2
    //   65: ifne -> 77
    //   68: aload_3
    //   69: aload #5
    //   71: invokeinterface add : (Ljava/lang/Object;)Z
    //   76: pop
    //   77: iload_2
    //   78: ifne -> 20
    //   81: aload_3
    //   82: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs22.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */