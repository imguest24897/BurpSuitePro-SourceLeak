package net.portswigger.devtools.client.impl;

import java.util.concurrent.CompletableFuture;
import net.portswigger.browser.Zd6;
import net.portswigger.browser.Zth;
import net.portswigger.browser.Ztm;
import net.portswigger.browser.Zzz;

public interface Zx5 {
  public static final String a;
  
  default CompletableFuture<Void> Zv(Zd6 paramZd6) {
    // Byte code:
    //   0: aload_1
    //   1: astore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: aload_2
    //   5: iload_3
    //   6: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   11: tableswitch default -> 91, -1 -> 91, 0 -> 40, 1 -> 57, 2 -> 74
    //   40: aload_2
    //   41: checkcast net/portswigger/browser/Zzz
    //   44: astore #4
    //   46: aload_0
    //   47: aload #4
    //   49: invokeinterface ZY : (Lnet/portswigger/browser/Zzz;)Ljava/util/concurrent/CompletableFuture;
    //   54: goto -> 112
    //   57: aload_2
    //   58: checkcast net/portswigger/browser/Zth
    //   61: astore #5
    //   63: aload_0
    //   64: aload #5
    //   66: invokeinterface ZX : (Lnet/portswigger/browser/Zth;)Ljava/util/concurrent/CompletableFuture;
    //   71: goto -> 112
    //   74: aload_2
    //   75: checkcast net/portswigger/browser/Ztm
    //   78: astore #6
    //   80: aload_0
    //   81: aload #6
    //   83: invokeinterface ZY : (Lnet/portswigger/browser/Ztm;)Ljava/util/concurrent/CompletableFuture;
    //   88: goto -> 112
    //   91: new java/lang/IllegalArgumentException
    //   94: dup
    //   95: aload_1
    //   96: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   99: getstatic net/portswigger/devtools/client/impl/Zx5.a : Ljava/lang/String;
    //   102: swap
    //   103: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   108: invokespecial <init> : (Ljava/lang/String;)V
    //   111: athrow
    //   112: areturn
  }
  
  CompletableFuture<Void> ZY(Zzz paramZzz);
  
  CompletableFuture<Void> ZX(Zth paramZth);
  
  CompletableFuture<Void> ZY(Ztm paramZtm);
  
  static {
    // Byte code:
    //   0: bipush #94
    //   2: ldc '`WG5N8P] Y\\n1'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/devtools/client/impl/Zx5.a : Ljava/lang/String;
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
    //   80: bipush #107
    //   82: goto -> 112
    //   85: bipush #103
    //   87: goto -> 112
    //   90: bipush #113
    //   92: goto -> 112
    //   95: bipush #10
    //   97: goto -> 112
    //   100: bipush #126
    //   102: goto -> 112
    //   105: bipush #36
    //   107: goto -> 112
    //   110: bipush #10
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zx5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */