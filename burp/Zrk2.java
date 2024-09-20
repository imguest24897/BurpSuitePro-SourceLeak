package burp;

import java.util.List;

class Zrk2 {
  private final Zg4y ZY;
  
  private final Zlka ZV;
  
  private final Zmv7 ZT;
  
  Zrk2(Zg4y paramZg4y, Zlka paramZlka, Zmv7 paramZmv7) {
    this.ZY = paramZg4y;
    this.ZV = paramZlka;
    this.ZT = paramZmv7;
  }
  
  List<Zxs9> ZJ(Zrp0 paramZrp0, Zszw paramZszw) {
    // Byte code:
    //   0: invokestatic ZG : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_1
    //   5: new burp/Zx8w
    //   8: dup
    //   9: aload_0
    //   10: aload_2
    //   11: invokespecial <init> : (Lburp/Zrk2;Lburp/Zszw;)V
    //   14: invokeinterface Zv : (Lburp/Zsl5;)Ljava/lang/Object;
    //   19: checkcast java/util/List
    //   22: astore #4
    //   24: aload #4
    //   26: invokeinterface isEmpty : ()Z
    //   31: ifeq -> 61
    //   34: aload_0
    //   35: getfield ZT : Lburp/Zmv7;
    //   38: getstatic burp/Zrp6.TRACE : Lburp/Zrp6;
    //   41: getstatic burp/Zlq7.NO_STEPS_AVAILABLE : Lburp/Zlq7;
    //   44: iconst_1
    //   45: anewarray java/lang/Object
    //   48: dup
    //   49: iconst_0
    //   50: aload_1
    //   51: aastore
    //   52: invokeinterface Zy : (Lburp/Zrp6;Lburp/Zlq7;[Ljava/lang/Object;)V
    //   57: aload_3
    //   58: ifnull -> 159
    //   61: aload_0
    //   62: getfield ZT : Lburp/Zmv7;
    //   65: getstatic burp/Zrp6.TRACE : Lburp/Zrp6;
    //   68: getstatic burp/Zlq7.AVAILABLE_STEPS : Lburp/Zlq7;
    //   71: iconst_2
    //   72: anewarray java/lang/Object
    //   75: dup
    //   76: iconst_0
    //   77: aload_1
    //   78: aastore
    //   79: dup
    //   80: iconst_1
    //   81: aload #4
    //   83: invokeinterface size : ()I
    //   88: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   91: aastore
    //   92: invokeinterface Zy : (Lburp/Zrp6;Lburp/Zlq7;[Ljava/lang/Object;)V
    //   97: aload #4
    //   99: invokeinterface iterator : ()Ljava/util/Iterator;
    //   104: astore #5
    //   106: aload #5
    //   108: invokeinterface hasNext : ()Z
    //   113: ifeq -> 159
    //   116: aload #5
    //   118: invokeinterface next : ()Ljava/lang/Object;
    //   123: checkcast burp/Zxs9
    //   126: astore #6
    //   128: aload_0
    //   129: getfield ZT : Lburp/Zmv7;
    //   132: getstatic burp/Zrp6.TRACE : Lburp/Zrp6;
    //   135: getstatic burp/Zlq7.PRINT_STEPS : Lburp/Zlq7;
    //   138: iconst_1
    //   139: anewarray java/lang/Object
    //   142: dup
    //   143: iconst_0
    //   144: aload #6
    //   146: invokevirtual toString : ()Ljava/lang/String;
    //   149: aastore
    //   150: invokeinterface Zy : (Lburp/Zrp6;Lburp/Zlq7;[Ljava/lang/Object;)V
    //   155: aload_3
    //   156: ifnull -> 106
    //   159: aload #4
    //   161: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrk2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */