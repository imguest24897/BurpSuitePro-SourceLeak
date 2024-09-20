package net.portswigger.devtools.client.impl;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import net.portswigger.browser.Zc7;
import net.portswigger.browser.Zjt;
import net.portswigger.browser.Zth;
import net.portswigger.browser.Ztm;
import net.portswigger.browser.Zzz;
import net.portswigger.devtools.client.Zk;
import net.portswigger.devtools.client.Zn;
import net.portswigger.devtools.protocol.ChromeDevTools;
import net.portswigger.devtools.protocol.types.fetch.HeaderEntry;
import net.portswigger.devtools.protocol.types.network.ErrorReason;

public class Zmz implements Zx5 {
  private final Zn ZH;
  
  private final Zjt ZA;
  
  private static final String b;
  
  public Zmz(Zn paramZn, Zjt paramZjt) {
    this.ZH = Objects.<Zn>requireNonNull(paramZn);
    this.ZA = Objects.<Zjt>requireNonNull(paramZjt);
  }
  
  public CompletableFuture<Void> ZY(Zzz paramZzz) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual ZzC : ()Ljava/lang/String;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull -> 16
    //   9: aload_2
    //   10: invokevirtual isBlank : ()Z
    //   13: ifeq -> 39
    //   16: getstatic net/portswigger/browser/Zds.WARNING : Lnet/portswigger/browser/Zds;
    //   19: getstatic net/portswigger/devtools/client/impl/Zmz.b : Ljava/lang/String;
    //   22: iconst_1
    //   23: anewarray java/lang/Object
    //   26: dup
    //   27: iconst_0
    //   28: aload_1
    //   29: invokevirtual Zz3 : ()I
    //   32: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   35: aastore
    //   36: invokestatic Zp : (Lnet/portswigger/browser/Zds;Ljava/lang/String;[Ljava/lang/Object;)V
    //   39: aload_1
    //   40: invokevirtual Zzf : ()Ljava/util/List;
    //   43: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   48: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   53: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   58: invokestatic toList : ()Ljava/util/stream/Collector;
    //   61: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   66: checkcast java/util/List
    //   69: astore_3
    //   70: aload_0
    //   71: getfield ZH : Lnet/portswigger/devtools/client/Zn;
    //   74: aload_0
    //   75: aload_1
    //   76: aload_3
    //   77: aload_2
    //   78: <illegal opcode> Zy : (Lnet/portswigger/devtools/client/impl/Zmz;Lnet/portswigger/browser/Zzz;Ljava/util/List;Ljava/lang/String;)Lnet/portswigger/devtools/client/Zs;
    //   83: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   86: invokevirtual ZL : (Lnet/portswigger/devtools/client/Zk;)Ljava/util/concurrent/CompletableFuture;
    //   89: areturn
  }
  
  public CompletableFuture<Void> ZX(Zth paramZth) {
    return this.ZH.ZL(Zk.ZA(this::lambda$visit$2));
  }
  
  public CompletableFuture<Void> ZY(Ztm paramZtm) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZA : Lnet/portswigger/browser/Zjt;
    //   4: invokevirtual ZX : ()Ljava/util/List;
    //   7: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   12: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   17: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   22: invokestatic toList : ()Ljava/util/stream/Collector;
    //   25: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   30: checkcast java/util/List
    //   33: astore_2
    //   34: aload_1
    //   35: invokevirtual ZXC : ()Ljava/util/List;
    //   38: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   43: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   48: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   53: aload_2
    //   54: dup
    //   55: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   58: pop
    //   59: <illegal opcode> accept : (Ljava/util/List;)Ljava/util/function/Consumer;
    //   64: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   69: aload_0
    //   70: getfield ZH : Lnet/portswigger/devtools/client/Zn;
    //   73: aload_0
    //   74: aload_2
    //   75: <illegal opcode> Zy : (Lnet/portswigger/devtools/client/impl/Zmz;Ljava/util/List;)Lnet/portswigger/devtools/client/Zs;
    //   80: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   83: invokevirtual ZL : (Lnet/portswigger/devtools/client/Zk;)Ljava/util/concurrent/CompletableFuture;
    //   86: areturn
  }
  
  private CompletableFuture lambda$visit$5(List paramList, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getFetch().continueRequest(this.ZA.ZU().ZSY(), null, null, null, paramList, Boolean.valueOf(false));
  }
  
  private static HeaderEntry lambda$visit$4(Zc7 paramZc7) {
    return new HeaderEntry(paramZc7.ZRz(), paramZc7.ZRO());
  }
  
  private static HeaderEntry lambda$visit$3(Zc7 paramZc7) {
    return new HeaderEntry(paramZc7.ZRz(), paramZc7.ZRO());
  }
  
  private CompletableFuture lambda$visit$2(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getFetch().failRequest(this.ZA.ZU().ZSY(), ErrorReason.ABORTED);
  }
  
  private CompletableFuture lambda$visit$1(Zzz paramZzz, List paramList, String paramString, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getFetch().fulfillRequest(this.ZA.ZU().ZSY(), Integer.valueOf(paramZzz.Zz3()), paramList, null, paramZzz.ZzA(), paramString);
  }
  
  private static HeaderEntry lambda$visit$0(Zc7 paramZc7) {
    return new HeaderEntry(paramZc7.ZRz(), paramZc7.ZRO());
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: ldc 'vkE9jh\\bP?|hG%}J|@\\r_lkJk_?|o\\tYlj[yBlz@|D(7[\\b^!|yD>|\88qFk@X uzDW%wJ8\\nUlp[8_lxZlIA>vYq-9\}X.uJ8]9|84\\fX?9Fk@ pJ4@\\rElnFt\\fDW x[8ElkJrElmG}@T?i@v pD}@.pH8S57KDP>|a?l]}@^99KwCElnNvDE#9Hq-9_pB)&'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/devtools/client/impl/Zmz.b : Ljava/lang/String;
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
    //   80: bipush #66
    //   82: goto -> 112
    //   85: bipush #23
    //   87: goto -> 112
    //   90: bipush #33
    //   92: goto -> 112
    //   95: bipush #22
    //   97: goto -> 112
    //   100: bipush #110
    //   102: goto -> 112
    //   105: bipush #106
    //   107: goto -> 112
    //   110: bipush #63
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zmz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */