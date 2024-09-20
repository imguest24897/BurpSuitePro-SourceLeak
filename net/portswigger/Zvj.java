package net.portswigger;

import java.util.Optional;

public abstract class Zvj implements Zm0 {
  private static final String a;
  
  public final Optional<Zto<Zif, Zat>> ZR(Zat paramZat) throws Zrml {
    // Byte code:
    //   0: aload_1
    //   1: getfield ZX : Ljava/lang/String;
    //   4: ldc '/'
    //   6: invokevirtual equals : (Ljava/lang/Object;)Z
    //   9: ifeq -> 20
    //   12: invokestatic empty : ()Ljava/util/Optional;
    //   15: areturn
    //   16: invokestatic a : (Lnet/portswigger/Zrml;)Lnet/portswigger/Zrml;
    //   19: athrow
    //   20: aload_1
    //   21: getfield ZX : Ljava/lang/String;
    //   24: bipush #47
    //   26: iconst_1
    //   27: invokevirtual indexOf : (II)I
    //   30: istore_2
    //   31: iload_2
    //   32: iconst_m1
    //   33: if_icmpne -> 98
    //   36: getstatic net/portswigger/Zvj.ZC : Ljava/util/regex/Pattern;
    //   39: aload_1
    //   40: getfield ZX : Ljava/lang/String;
    //   43: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   46: astore_3
    //   47: aload_3
    //   48: invokevirtual matches : ()Z
    //   51: ifeq -> 87
    //   54: new net/portswigger/Zrml
    //   57: dup
    //   58: getstatic net/portswigger/Zvj.a : Ljava/lang/String;
    //   61: iconst_1
    //   62: anewarray java/lang/Object
    //   65: dup
    //   66: iconst_0
    //   67: aload_3
    //   68: iconst_1
    //   69: invokevirtual group : (I)Ljava/lang/String;
    //   72: aastore
    //   73: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   76: invokestatic Zb : (Ljava/lang/String;)Lnet/portswigger/Zu0;
    //   79: invokespecial <init> : (Lnet/portswigger/Zu0;)V
    //   82: athrow
    //   83: invokestatic a : (Lnet/portswigger/Zrml;)Lnet/portswigger/Zrml;
    //   86: athrow
    //   87: new net/portswigger/Zrml
    //   90: dup
    //   91: invokestatic Zo : ()Lnet/portswigger/Zu0;
    //   94: invokespecial <init> : (Lnet/portswigger/Zu0;)V
    //   97: athrow
    //   98: iload_2
    //   99: iconst_1
    //   100: isub
    //   101: istore_3
    //   102: iload_3
    //   103: iflt -> 131
    //   106: new net/portswigger/Zl5
    //   109: dup
    //   110: aload_1
    //   111: getfield ZX : Ljava/lang/String;
    //   114: iconst_1
    //   115: iload_3
    //   116: iconst_1
    //   117: iadd
    //   118: invokevirtual substring : (II)Ljava/lang/String;
    //   121: invokespecial <init> : (Ljava/lang/String;)V
    //   124: goto -> 134
    //   127: invokestatic a : (Lnet/portswigger/Zrml;)Lnet/portswigger/Zrml;
    //   130: athrow
    //   131: getstatic net/portswigger/Zl5.ZZ : Lnet/portswigger/Zl5;
    //   134: astore #4
    //   136: aload_0
    //   137: aload #4
    //   139: invokevirtual ZK : (Lnet/portswigger/Zl5;)Ljava/util/Optional;
    //   142: aload_1
    //   143: iload_3
    //   144: <illegal opcode> apply : (Lnet/portswigger/Zat;I)Ljava/util/function/Function;
    //   149: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   152: areturn
    // Exception table:
    //   from	to	target	type
    //   0	16	16	net/portswigger/Zrml
    //   47	83	83	net/portswigger/Zrml
    //   102	127	127	net/portswigger/Zrml
  }
  
  private static Zto lambda$authenticate$0(Zat paramZat, int paramInt, Zif paramZif) {
    return Zto.ZM(paramZif, paramZat.Zm(paramZat.ZX.substring(paramInt + 1)));
  }
  
  private static Zrml a(Zrml paramZrml) {
    return paramZrml;
  }
  
  static {
    // Byte code:
    //   0: bipush #31
    //   2: ldc 'h!Pr'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/Zvj.a : Ljava/lang/String;
    //   11: goto -> 154
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
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #89
    //   82: goto -> 112
    //   85: bipush #44
    //   87: goto -> 112
    //   90: bipush #27
    //   92: goto -> 112
    //   95: bipush #60
    //   97: goto -> 112
    //   100: bipush #66
    //   102: goto -> 112
    //   105: bipush #100
    //   107: goto -> 112
    //   110: bipush #40
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zvj.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */