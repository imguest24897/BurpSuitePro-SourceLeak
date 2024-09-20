package burp;

import java.util.Collection;
import java.util.HashSet;

class Zta9 {
  private final Ze3n Zw;
  
  Zta9(Ze3n paramZe3n) {
    this.Zw = paramZe3n;
  }
  
  void Zn(int paramInt, Zgq<Zrdb> paramZgq) {
    // Byte code:
    //   0: new java/util/HashMap
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: aload_0
    //   10: getfield Zw : Lburp/Ze3n;
    //   13: invokevirtual ZL : ()Lburp/Zb6q;
    //   16: invokeinterface Zs : ()I
    //   21: istore #5
    //   23: aload_0
    //   24: getfield Zw : Lburp/Ze3n;
    //   27: invokevirtual ZL : ()Lburp/Zb6q;
    //   30: invokeinterface Za : ()Lburp/Zstu;
    //   35: astore #6
    //   37: invokestatic ZZ : ()I
    //   40: aload #6
    //   42: iload #5
    //   44: iload_1
    //   45: invokeinterface Zb : (II)Lburp/Zstu;
    //   50: invokestatic Zo : (Lburp/Zstu;)Ljava/util/Set;
    //   53: astore #7
    //   55: istore_3
    //   56: aload #7
    //   58: invokeinterface iterator : ()Ljava/util/Iterator;
    //   63: astore #8
    //   65: aload #8
    //   67: invokeinterface hasNext : ()Z
    //   72: ifeq -> 140
    //   75: aload #8
    //   77: invokeinterface next : ()Ljava/lang/Object;
    //   82: checkcast burp/Zs13
    //   85: astore #9
    //   87: aload #4
    //   89: aload #9
    //   91: invokevirtual ZHH : ()Ljava/lang/String;
    //   94: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   99: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   104: checkcast java/util/Collection
    //   107: astore #10
    //   109: aload #10
    //   111: iload #5
    //   113: aload #9
    //   115: invokevirtual ZHv : ()I
    //   118: iadd
    //   119: iload #5
    //   121: aload #9
    //   123: invokevirtual ZHF : ()I
    //   126: iadd
    //   127: invokestatic Zj : (II)Lburp/Zl1r;
    //   130: invokeinterface add : (Ljava/lang/Object;)Z
    //   135: pop
    //   136: iload_3
    //   137: ifeq -> 65
    //   140: aload #4
    //   142: aload_0
    //   143: aload_2
    //   144: <illegal opcode> accept : (Lburp/Zta9;Lburp/Zgq;)Ljava/util/function/BiConsumer;
    //   149: invokeinterface forEach : (Ljava/util/function/BiConsumer;)V
    //   154: return
  }
  
  private void lambda$checkForCCNs$1(Zgq<Zrdb> paramZgq, String paramString, Collection<Zl1r> paramCollection) {
    Zvow zvow = this.Zw.Zt().Z_(paramCollection);
    paramZgq.Zu(Zmrt.ZN(this.Zw.Za(), this.Zw.ZN(), zvow, paramString));
  }
  
  private static Collection lambda$checkForCCNs$0(String paramString) {
    return new HashSet();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zta9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */