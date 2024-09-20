package burp;

import java.util.List;

public class Zzsf extends Zzpg {
  public Zzsf(Zk5 paramZk5, Zb3t paramZb3t) {
    super(paramZk5, paramZb3t);
  }
  
  public List<Zb3t> ZH(List<Zb3t> paramList) {
    // Byte code:
    //   0: invokestatic Zr : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZC : Lburp/Zb3t;
    //   8: invokeinterface ZC : ()Ljava/util/List;
    //   13: invokeinterface size : ()I
    //   18: lookupswitch default -> 56, 3 -> 50, 7 -> 44
    //   44: iconst_5
    //   45: istore_3
    //   46: aload_2
    //   47: ifnull -> 59
    //   50: iconst_2
    //   51: istore_3
    //   52: aload_2
    //   53: ifnull -> 59
    //   56: bipush #6
    //   58: istore_3
    //   59: aload_0
    //   60: getfield ZC : Lburp/Zb3t;
    //   63: invokeinterface ZC : ()Ljava/util/List;
    //   68: iload_3
    //   69: invokeinterface get : (I)Ljava/lang/Object;
    //   74: checkcast burp/Zb3t
    //   77: astore #4
    //   79: aload #4
    //   81: invokestatic Ze : (Lburp/Zb3t;)Z
    //   84: ifne -> 96
    //   87: iconst_0
    //   88: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   91: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   94: aload_1
    //   95: areturn
    //   96: aload_0
    //   97: getfield ZR : Ljava/util/List;
    //   100: aload_0
    //   101: getfield Zy : Lburp/Zk5;
    //   104: aload_0
    //   105: getfield ZC : Lburp/Zb3t;
    //   108: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   111: aload #4
    //   113: invokevirtual Zf : (Ljava/util/List;Lburp/Zb3t;)Ljava/util/List;
    //   116: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   121: pop
    //   122: aload_0
    //   123: getfield Zy : Lburp/Zk5;
    //   126: invokevirtual Zt : ()Lburp/Zgca;
    //   129: astore #5
    //   131: aload_0
    //   132: getfield ZR : Ljava/util/List;
    //   135: invokeinterface iterator : ()Ljava/util/Iterator;
    //   140: astore #6
    //   142: aload #6
    //   144: invokeinterface hasNext : ()Z
    //   149: ifeq -> 179
    //   152: aload #6
    //   154: invokeinterface next : ()Ljava/lang/Object;
    //   159: checkcast burp/Zb3t
    //   162: astore #7
    //   164: aload_0
    //   165: getfield Zy : Lburp/Zk5;
    //   168: aload #7
    //   170: aload #5
    //   172: invokevirtual Zv : (Lburp/Zb3t;Lburp/Zb3t;)V
    //   175: aload_2
    //   176: ifnull -> 142
    //   179: aload_0
    //   180: getfield ZR : Ljava/util/List;
    //   183: invokeinterface clear : ()V
    //   188: aload_1
    //   189: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzsf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */