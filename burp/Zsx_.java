package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

class Zsx_ {
  private final Ze3n Z_;
  
  private final Zstu Zn;
  
  Zsx_(Ze3n paramZe3n) {
    this.Z_ = paramZe3n;
    this.Zn = paramZe3n.ZL().Za();
  }
  
  Ztk8 ZX(int paramInt) {
    // Byte code:
    //   0: new java/util/HashMap
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZZ : ()I
    //   11: aload_0
    //   12: getfield Z_ : Lburp/Ze3n;
    //   15: invokevirtual ZL : ()Lburp/Zb6q;
    //   18: invokeinterface Zs : ()I
    //   23: istore #4
    //   25: aload_0
    //   26: getfield Zn : Lburp/Zstu;
    //   29: iload #4
    //   31: iload_1
    //   32: invokeinterface Zb : (II)Lburp/Zstu;
    //   37: invokestatic Zv : (Lburp/Zstu;)Ljava/util/Set;
    //   40: astore #5
    //   42: new burp/Zgq
    //   45: dup
    //   46: invokespecial <init> : ()V
    //   49: astore #6
    //   51: aload #5
    //   53: invokeinterface iterator : ()Ljava/util/Iterator;
    //   58: astore #7
    //   60: istore_2
    //   61: aload #7
    //   63: invokeinterface hasNext : ()Z
    //   68: ifeq -> 131
    //   71: aload #7
    //   73: invokeinterface next : ()Ljava/lang/Object;
    //   78: checkcast burp/Zg52
    //   81: astore #8
    //   83: aload_3
    //   84: aload #8
    //   86: invokevirtual ZOd : ()Ljava/lang/String;
    //   89: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   94: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   99: checkcast java/util/List
    //   102: iload #4
    //   104: aload #8
    //   106: invokevirtual ZOM : ()I
    //   109: iadd
    //   110: iload #4
    //   112: aload #8
    //   114: invokevirtual ZOv : ()I
    //   117: iadd
    //   118: invokestatic Zj : (II)Lburp/Zl1r;
    //   121: invokeinterface add : (Ljava/lang/Object;)Z
    //   126: pop
    //   127: iload_2
    //   128: ifeq -> 61
    //   131: aload_3
    //   132: aload_0
    //   133: aload_3
    //   134: aload #6
    //   136: <illegal opcode> accept : (Lburp/Zsx_;Ljava/util/Map;Lburp/Zgq;)Ljava/util/function/BiConsumer;
    //   141: invokeinterface forEach : (Ljava/util/function/BiConsumer;)V
    //   146: aload #6
    //   148: invokestatic Zy : (Lburp/Zgq;)Lburp/Ztk8;
    //   151: areturn
  }
  
  private void lambda$checkForSSNs$1(Map paramMap, Zgq<Zrdb> paramZgq, String paramString, List paramList) {
    Zvow zvow = this.Z_.Zt().Z_((Collection<Zl1r>)paramMap.get(paramString));
    paramZgq.Zu(Zz63.Zc(this.Z_.Za(), this.Z_.ZN(), zvow, paramString));
  }
  
  private static List lambda$checkForSSNs$0(String paramString) {
    return new ArrayList();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsx_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */