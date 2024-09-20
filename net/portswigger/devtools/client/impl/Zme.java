package net.portswigger.devtools.client.impl;

import java.util.Collections;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import net.portswigger.Zrmq;
import net.portswigger.browser.Ze_;
import net.portswigger.browser.Zel;
import net.portswigger.browser.Ztk;
import net.portswigger.devtools.client.Zn;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.ChromeDevTools;
import net.portswigger.devtools.protocol.types.runtime.RemoteObject;

public class Zme implements Ze_ {
  private final Zn Zw;
  
  private static final String a;
  
  public Zme(Zn paramZn) {
    this.Zw = paramZn;
  }
  
  public Zrmq Zo(String paramString) throws Ztk {
    return Zy(paramString, false);
  }
  
  public Zrmq ZN(String paramString) throws Ztk {
    return Zy(paramString, true);
  }
  
  private Zrmq Zy(String paramString, boolean paramBoolean) throws Ztk {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zw : Lnet/portswigger/devtools/client/Zn;
    //   4: aload_1
    //   5: iload_2
    //   6: <illegal opcode> Zy : (Ljava/lang/String;Z)Lnet/portswigger/devtools/client/Zs;
    //   11: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   14: invokevirtual Zz : (Lnet/portswigger/devtools/client/Zk;)Ljava/lang/Object;
    //   17: checkcast net/portswigger/devtools/protocol/types/runtime/Evaluate
    //   20: astore_3
    //   21: aload_3
    //   22: getfield exceptionDetails : Lnet/portswigger/devtools/protocol/types/runtime/ExceptionDetails;
    //   25: ifnull -> 47
    //   28: new net/portswigger/browser/Zt1
    //   31: dup
    //   32: aload_3
    //   33: getfield exceptionDetails : Lnet/portswigger/devtools/protocol/types/runtime/ExceptionDetails;
    //   36: getfield text : Ljava/lang/String;
    //   39: invokespecial <init> : (Ljava/lang/String;)V
    //   42: athrow
    //   43: invokestatic a : (Lnet/portswigger/devtools/client/Zp;)Lnet/portswigger/devtools/client/Zp;
    //   46: athrow
    //   47: aload_3
    //   48: getfield result : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   51: ifnonnull -> 69
    //   54: new net/portswigger/browser/Zt1
    //   57: dup
    //   58: getstatic net/portswigger/devtools/client/impl/Zme.a : Ljava/lang/String;
    //   61: invokespecial <init> : (Ljava/lang/String;)V
    //   64: athrow
    //   65: invokestatic a : (Lnet/portswigger/devtools/client/Zp;)Lnet/portswigger/devtools/client/Zp;
    //   68: athrow
    //   69: aload_3
    //   70: getfield result : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   73: getfield value : Lnet/portswigger/Zi7;
    //   76: ifnull -> 98
    //   79: aload_3
    //   80: getfield result : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   83: getfield value : Lnet/portswigger/Zi7;
    //   86: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   91: goto -> 106
    //   94: invokestatic a : (Lnet/portswigger/devtools/client/Zp;)Lnet/portswigger/devtools/client/Zp;
    //   97: athrow
    //   98: invokestatic ZE : ()Lnet/portswigger/Zmp;
    //   101: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   106: areturn
    //   107: astore_3
    //   108: aload_3
    //   109: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   112: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   115: new net/portswigger/browser/Zti
    //   118: dup
    //   119: aload_3
    //   120: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   123: athrow
    //   124: astore_3
    //   125: aload_3
    //   126: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   129: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   132: new net/portswigger/browser/Ztj
    //   135: dup
    //   136: aload_3
    //   137: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   140: athrow
    //   141: astore_3
    //   142: aload_3
    //   143: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   146: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   149: new net/portswigger/browser/Ztq
    //   152: dup
    //   153: aload_3
    //   154: invokespecial <init> : (Ljava/io/IOException;)V
    //   157: athrow
    //   158: astore_3
    //   159: aload_3
    //   160: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   163: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   166: invokestatic currentThread : ()Ljava/lang/Thread;
    //   169: invokevirtual interrupt : ()V
    //   172: new net/portswigger/browser/Ze1
    //   175: dup
    //   176: aload_3
    //   177: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   180: athrow
    // Exception table:
    //   from	to	target	type
    //   0	106	107	net/portswigger/devtools/client/Zp
    //   0	106	124	net/portswigger/devtools/client/Z_
    //   0	106	141	net/portswigger/devtools/client/Zi
    //   0	106	158	java/lang/InterruptedException
    //   21	43	43	net/portswigger/devtools/client/Zp
    //   47	65	65	net/portswigger/devtools/client/Zp
    //   69	94	94	net/portswigger/devtools/client/Zp
  }
  
  private static CompletableFuture lambda$evaluate$4(String paramString, boolean paramBoolean, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getRuntime().evaluate(paramString, null, null, null, null, null, null, null, Boolean.valueOf(paramBoolean), null, null, null, null, null, null, null);
  }
  
  private CompletionStage lambda$callFunctionOn$3(String paramString, Zm4 paramZm4, RemoteObject paramRemoteObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zw : Lnet/portswigger/devtools/client/Zn;
    //   4: aload_1
    //   5: aload_3
    //   6: aload_2
    //   7: <illegal opcode> Zy : (Ljava/lang/String;Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;Lnet/portswigger/devtools/client/impl/Zm4;)Lnet/portswigger/devtools/client/Zs;
    //   12: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   15: invokevirtual ZL : (Lnet/portswigger/devtools/client/Zk;)Ljava/util/concurrent/CompletableFuture;
    //   18: areturn
  }
  
  private static CompletableFuture lambda$callFunctionOn$2(String paramString, RemoteObject paramRemoteObject, Zm4 paramZm4, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getRuntime().callFunctionOn(paramString, paramRemoteObject.objectId, Collections.emptyList(), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), null, paramZm4.ZR(), Boolean.valueOf(false), null, null);
  }
  
  private static CompletableFuture lambda$callFunctionOn$1(Zel paramZel, Zm4 paramZm4, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().resolveNode(null, Integer.valueOf(paramZel.Zt()), paramZm4.ZR(), null);
  }
  
  private static CompletableFuture lambda$resumeDebugger$0(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getRuntime().runIfWaitingForDebugger();
  }
  
  private static Zp a(Zp paramZp) {
    return paramZp;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: ldc '.(xFrEI\\f3'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic net/portswigger/devtools/client/impl/Zme.a : Ljava/lang/String;
    //   10: goto -> 154
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 128
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #100
    //   82: goto -> 112
    //   85: bipush #67
    //   87: goto -> 112
    //   90: bipush #92
    //   92: goto -> 112
    //   95: bipush #48
    //   97: goto -> 112
    //   100: bipush #19
    //   102: goto -> 112
    //   105: bipush #50
    //   107: goto -> 112
    //   110: bipush #56
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 34
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 31
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
    //   151: goto -> 7
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zme.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */