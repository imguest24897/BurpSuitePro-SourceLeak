package net.portswigger.devtools.client.impl;

import burp.Zbqc;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zca;
import net.portswigger.browser.Zco;
import net.portswigger.browser.Zd9;
import net.portswigger.browser.Zdi;
import net.portswigger.browser.Zh;
import net.portswigger.browser.Zt2;
import net.portswigger.browser.Zti;
import net.portswigger.browser.Ztj;
import net.portswigger.browser.Ztk;
import net.portswigger.browser.Ztq;
import net.portswigger.devtools.client.Z_;
import net.portswigger.devtools.client.Zd;
import net.portswigger.devtools.client.Zi;
import net.portswigger.devtools.client.Zk;
import net.portswigger.devtools.client.Zn;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.client.Zq;
import net.portswigger.devtools.client.Zt;
import net.portswigger.devtools.protocol.ChromeDevTools;
import net.portswigger.devtools.protocol.types.dom.BoxModel;
import net.portswigger.devtools.protocol.types.dom.Node;
import net.portswigger.devtools.protocol.types.domsnapshot.ComputedStyle;
import net.portswigger.devtools.protocol.types.domsnapshot.DOMNode;
import net.portswigger.devtools.protocol.types.domsnapshot.LayoutTreeNode;
import net.portswigger.devtools.protocol.types.domsnapshot.NameValue;
import net.portswigger.devtools.protocol.types.domsnapshot.Snapshot;
import net.portswigger.devtools.protocol.types.overlay.HighlightConfig;
import net.portswigger.devtools.protocol.types.page.LayoutMetrics;
import net.portswigger.devtools.protocol.types.page.LayoutViewport;
import net.portswigger.devtools.protocol.types.runtime.CallFunctionOn;
import net.portswigger.devtools.protocol.types.runtime.RemoteObject;

public class Zor implements Zh {
  private static final NameValue ZV;
  
  private static final HighlightConfig Zo;
  
  private final Zn ZQ;
  
  private final Integer ZO;
  
  private final Integer ZG;
  
  private static String ZM;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zor(Zn paramZn, Integer paramInteger1, Integer paramInteger2) {
    this.ZQ = Objects.<Zn>requireNonNull(paramZn);
    this.ZO = paramInteger1;
    this.ZG = paramInteger2;
  }
  
  public String Zi() throws Ztk {
    try {
      return (String)this.ZQ.Zz(Zk.ZA(this::lambda$html$0));
    } catch (Zp zp) {
      Zah.Zl((Throwable)zp, Zk_.RETHROWN);
      throw new Zti(zp);
    } catch (Z_ z_) {
      Zah.Zl((Throwable)z_, Zk_.RETHROWN);
      throw new Ztj(z_);
    } catch (Zt zt) {
      Zah.Zl((Throwable)zt, Zk_.RETHROWN);
      throw new Zt2(zt);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
      return "";
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.RETHROWN);
      throw new Ztq(zi);
    } 
  }
  
  public boolean Zm(String paramString) throws Ztk {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lnet/portswigger/devtools/client/Zn;
    //   4: invokestatic ZE : (Lnet/portswigger/devtools/client/Zn;)Lnet/portswigger/devtools/client/impl/Zm4;
    //   7: astore_2
    //   8: aload_0
    //   9: aload_1
    //   10: aload_2
    //   11: invokevirtual Zh : (Ljava/lang/String;Lnet/portswigger/devtools/client/impl/Zm4;)Lnet/portswigger/devtools/protocol/types/runtime/CallFunctionOn;
    //   14: astore_3
    //   15: aload_3
    //   16: getfield result : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   19: getfield value : Lnet/portswigger/Zi7;
    //   22: ifnull -> 60
    //   25: aload_3
    //   26: getfield result : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   29: getfield value : Lnet/portswigger/Zi7;
    //   32: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   37: invokeinterface Zm : ()Z
    //   42: ifeq -> 60
    //   45: goto -> 52
    //   48: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   51: athrow
    //   52: iconst_1
    //   53: goto -> 61
    //   56: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   59: athrow
    //   60: iconst_0
    //   61: istore #4
    //   63: aload_2
    //   64: ifnull -> 78
    //   67: aload_2
    //   68: invokevirtual close : ()V
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   77: athrow
    //   78: iload #4
    //   80: ireturn
    //   81: astore_3
    //   82: aload_2
    //   83: ifnull -> 101
    //   86: aload_2
    //   87: invokevirtual close : ()V
    //   90: goto -> 101
    //   93: astore #4
    //   95: aload_3
    //   96: aload #4
    //   98: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   101: aload_3
    //   102: athrow
    //   103: astore_2
    //   104: aload_2
    //   105: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   108: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   111: aload_2
    //   112: invokestatic ZD : (Ljava/util/concurrent/ExecutionException;)V
    //   115: goto -> 143
    //   118: astore_2
    //   119: aload_2
    //   120: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   123: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   126: invokestatic currentThread : ()Ljava/lang/Thread;
    //   129: invokevirtual interrupt : ()V
    //   132: goto -> 143
    //   135: astore_2
    //   136: aload_2
    //   137: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   140: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   143: iconst_0
    //   144: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	78	103	java/util/concurrent/ExecutionException
    //   0	78	118	java/lang/InterruptedException
    //   0	78	135	java/util/concurrent/TimeoutException
    //   8	63	81	java/lang/Throwable
    //   15	45	48	java/lang/Throwable
    //   25	56	56	java/lang/Throwable
    //   63	71	74	java/lang/Throwable
    //   81	103	103	java/util/concurrent/ExecutionException
    //   81	103	118	java/lang/InterruptedException
    //   81	103	135	java/util/concurrent/TimeoutException
    //   86	90	93	java/lang/Throwable
  }
  
  public String Zi(String paramString) throws Ztk {
    try {
      Zm4 zm4 = Zm4.ZE(this.ZQ);
      try {
        CallFunctionOn callFunctionOn = Zh(paramString, zm4);
        String str = callFunctionOn.result.value.ZP().ZW();
        try {
          if (zm4 != null)
            zm4.close(); 
        } catch (Throwable throwable) {
          throw a(null);
        } 
        return str;
      } catch (Throwable throwable) {
        if (zm4 != null)
          try {
            zm4.close();
          } catch (Throwable throwable1) {
            throwable.addSuppressed(throwable1);
          }  
        throw throwable;
      } 
    } catch (ExecutionException executionException) {
      Zah.Zl(executionException, Zk_.RETHROWN);
      ZD(executionException);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
    } catch (TimeoutException timeoutException) {
      Zah.Zl(timeoutException, Zk_.IGNORED);
    } 
    return null;
  }
  
  private static void ZD(ExecutionException paramExecutionException) throws Ztk {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   4: astore_2
    //   5: aload_2
    //   6: instanceof net/portswigger/devtools/client/Zi
    //   9: ifeq -> 117
    //   12: aload_2
    //   13: checkcast net/portswigger/devtools/client/Zi
    //   16: astore_1
    //   17: aload_1
    //   18: dup
    //   19: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   22: pop
    //   23: astore_2
    //   24: iconst_0
    //   25: istore_3
    //   26: aload_2
    //   27: iload_3
    //   28: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   33: tableswitch default -> 108, 0 -> 60, 1 -> 76, 2 -> 92
    //   60: aload_2
    //   61: checkcast net/portswigger/devtools/client/Z_
    //   64: astore #4
    //   66: new net/portswigger/browser/Ztj
    //   69: dup
    //   70: aload #4
    //   72: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   75: athrow
    //   76: aload_2
    //   77: checkcast net/portswigger/devtools/client/Zp
    //   80: astore #5
    //   82: new net/portswigger/browser/Zti
    //   85: dup
    //   86: aload #5
    //   88: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   91: athrow
    //   92: aload_2
    //   93: checkcast net/portswigger/devtools/client/Zt
    //   96: astore #6
    //   98: new net/portswigger/browser/Zt2
    //   101: dup
    //   102: aload #6
    //   104: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   107: athrow
    //   108: new net/portswigger/browser/Ztq
    //   111: dup
    //   112: aload_1
    //   113: invokespecial <init> : (Ljava/io/IOException;)V
    //   116: athrow
    //   117: new net/portswigger/browser/Ze1
    //   120: dup
    //   121: aload_0
    //   122: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   125: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   128: athrow
  }
  
  private CallFunctionOn Zh(String paramString, Zm4 paramZm4) throws InterruptedException, ExecutionException, TimeoutException {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lnet/portswigger/devtools/client/Zn;
    //   4: aload_0
    //   5: aload_2
    //   6: <illegal opcode> Zy : (Lnet/portswigger/devtools/client/impl/Zor;Lnet/portswigger/devtools/client/impl/Zm4;)Lnet/portswigger/devtools/client/Zs;
    //   11: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   14: invokevirtual ZL : (Lnet/portswigger/devtools/client/Zk;)Ljava/util/concurrent/CompletableFuture;
    //   17: aload_0
    //   18: aload_1
    //   19: aload_2
    //   20: <illegal opcode> apply : (Lnet/portswigger/devtools/client/impl/Zor;Ljava/lang/String;Lnet/portswigger/devtools/client/impl/Zm4;)Ljava/util/function/Function;
    //   25: invokevirtual thenCompose : (Ljava/util/function/Function;)Ljava/util/concurrent/CompletableFuture;
    //   28: aload_0
    //   29: getfield ZQ : Lnet/portswigger/devtools/client/Zn;
    //   32: invokevirtual Zf : ()Ljava/time/Duration;
    //   35: invokevirtual toMillis : ()J
    //   38: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   41: invokevirtual get : (JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    //   44: checkcast net/portswigger/devtools/protocol/types/runtime/CallFunctionOn
    //   47: astore_3
    //   48: aload_3
    //   49: getfield exceptionDetails : Lnet/portswigger/devtools/protocol/types/runtime/ExceptionDetails;
    //   52: ifnull -> 109
    //   55: aload_3
    //   56: getfield exceptionDetails : Lnet/portswigger/devtools/protocol/types/runtime/ExceptionDetails;
    //   59: getfield exception : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   62: ifnull -> 109
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   71: athrow
    //   72: aload_3
    //   73: getfield exceptionDetails : Lnet/portswigger/devtools/protocol/types/runtime/ExceptionDetails;
    //   76: getfield exception : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   79: getfield description : Ljava/lang/String;
    //   82: ifnull -> 109
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   91: athrow
    //   92: aload_3
    //   93: getfield exceptionDetails : Lnet/portswigger/devtools/protocol/types/runtime/ExceptionDetails;
    //   96: getfield exception : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   99: getfield description : Ljava/lang/String;
    //   102: goto -> 111
    //   105: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   108: athrow
    //   109: ldc ''
    //   111: astore #4
    //   113: aload #4
    //   115: invokestatic ZX : (Ljava/lang/String;)Z
    //   118: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   121: aload #4
    //   123: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   126: aload_3
    //   127: areturn
    // Exception table:
    //   from	to	target	type
    //   48	65	68	java/lang/InterruptedException
    //   55	85	88	java/lang/InterruptedException
    //   72	105	105	java/lang/InterruptedException
  }
  
  public void ZP(Path... paramVarArgs) throws Ztk {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lnet/portswigger/devtools/client/Zn;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zy : (Lnet/portswigger/devtools/client/impl/Zor;[Ljava/nio/file/Path;)Lnet/portswigger/devtools/client/Zs;
    //   11: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   14: invokevirtual Zz : (Lnet/portswigger/devtools/client/Zk;)Ljava/lang/Object;
    //   17: pop
    //   18: goto -> 103
    //   21: astore_2
    //   22: aload_2
    //   23: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   26: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   29: new net/portswigger/browser/Zti
    //   32: dup
    //   33: aload_2
    //   34: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   37: athrow
    //   38: astore_2
    //   39: aload_2
    //   40: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   43: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   46: new net/portswigger/browser/Ztj
    //   49: dup
    //   50: aload_2
    //   51: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   54: athrow
    //   55: astore_2
    //   56: aload_2
    //   57: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   60: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   63: new net/portswigger/browser/Zt2
    //   66: dup
    //   67: aload_2
    //   68: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   71: athrow
    //   72: astore_2
    //   73: aload_2
    //   74: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   77: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   80: new net/portswigger/browser/Ztq
    //   83: dup
    //   84: aload_2
    //   85: invokespecial <init> : (Ljava/io/IOException;)V
    //   88: athrow
    //   89: astore_2
    //   90: aload_2
    //   91: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   94: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   97: invokestatic currentThread : ()Ljava/lang/Thread;
    //   100: invokevirtual interrupt : ()V
    //   103: return
    // Exception table:
    //   from	to	target	type
    //   0	18	21	net/portswigger/devtools/client/Zp
    //   0	18	38	net/portswigger/devtools/client/Z_
    //   0	18	55	net/portswigger/devtools/client/Zt
    //   0	18	72	net/portswigger/devtools/client/Zi
    //   0	18	89	java/lang/InterruptedException
  }
  
  public void ZB() throws Zd9, Ztk {
    try {
      this.ZQ.Zz(Zk.ZA(this::lambda$focus$5));
    } catch (Zp zp) {
      Zah.Zl((Throwable)zp, Zk_.RETHROWN);
      throw new Zti(zp);
    } catch (Z_ z_) {
      Zah.Zl((Throwable)z_, Zk_.RETHROWN);
      throw new Ztj(z_);
    } catch (Zd zd) {
      Zah.Zl((Throwable)zd, Zk_.RETHROWN);
      throw new Zd9(zd);
    } catch (Zt zt) {
      Zah.Zl((Throwable)zt, Zk_.RETHROWN);
      throw new Zt2(zt);
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.RETHROWN);
      throw new Ztq(zi);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
    } 
  }
  
  public boolean Zk(Zdi paramZdi) throws Ztk {
    try {
      Optional<Zca> optional = ZH();
      if (optional.isEmpty())
        return false; 
      Zca zca = optional.get();
      Zxt zxt = new Zxt(this.ZQ);
      zxt.ZF(Zco.Zd(zca).Zc(paramZdi));
      zxt.ZF(Zco.Zg(zca));
      return true;
    } catch (Zp zp) {
      Zah.Zl((Throwable)zp, Zk_.RETHROWN);
      throw new Zti(zp);
    } catch (Z_ z_) {
      Zah.Zl((Throwable)z_, Zk_.RETHROWN);
      throw new Ztj(z_);
    } catch (Zt zt) {
      Zah.Zl((Throwable)zt, Zk_.RETHROWN);
      throw new Zt2(zt);
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.RETHROWN);
      throw new Ztq(zi);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
      return false;
    } 
  }
  
  public void ZQ() {
    try {
      this.ZQ.Zz(Zk.ZA(this::lambda$highlight$6));
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.IGNORED);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
    } 
  }
  
  public List<Integer> Zc() throws Zi {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_0
    //   9: getfield ZQ : Lnet/portswigger/devtools/client/Zn;
    //   12: aload_0
    //   13: <illegal opcode> Zy : (Lnet/portswigger/devtools/client/impl/Zor;)Lnet/portswigger/devtools/client/Zs;
    //   18: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   21: invokevirtual ZL : (Lnet/portswigger/devtools/client/Zk;)Ljava/util/concurrent/CompletableFuture;
    //   24: aload_0
    //   25: aload_1
    //   26: <illegal opcode> apply : (Lnet/portswigger/devtools/client/impl/Zor;Ljava/util/List;)Ljava/util/function/Function;
    //   31: invokevirtual thenCompose : (Ljava/util/function/Function;)Ljava/util/concurrent/CompletableFuture;
    //   34: aload_0
    //   35: getfield ZQ : Lnet/portswigger/devtools/client/Zn;
    //   38: invokevirtual Zf : ()Ljava/time/Duration;
    //   41: invokevirtual toMillis : ()J
    //   44: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   47: invokevirtual get : (JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    //   50: pop
    //   51: goto -> 121
    //   54: astore_2
    //   55: aload_2
    //   56: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   59: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   62: aload_2
    //   63: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   66: astore #4
    //   68: aload #4
    //   70: instanceof net/portswigger/devtools/client/Zi
    //   73: ifeq -> 84
    //   76: aload #4
    //   78: checkcast net/portswigger/devtools/client/Zi
    //   81: astore_3
    //   82: aload_3
    //   83: athrow
    //   84: new net/portswigger/browser/Ze1
    //   87: dup
    //   88: aload_2
    //   89: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   92: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   95: athrow
    //   96: astore_2
    //   97: aload_2
    //   98: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   101: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   104: invokestatic currentThread : ()Ljava/lang/Thread;
    //   107: invokevirtual interrupt : ()V
    //   110: goto -> 121
    //   113: astore_2
    //   114: aload_2
    //   115: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   118: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   121: aload_1
    //   122: areturn
    // Exception table:
    //   from	to	target	type
    //   8	51	54	java/util/concurrent/ExecutionException
    //   8	51	96	java/lang/InterruptedException
    //   8	51	113	java/util/concurrent/TimeoutException
  }
  
  private Optional<Zca> ZH() throws Zi, InterruptedException {
    Optional<Zca> optional = Zf();
    byte b = 0;
    String str = ZY();
    while (b < 10) {
      Thread.sleep(10L);
      Optional<Zca> optional1 = Zf();
      try {
        if (optional1.isPresent()) {
          try {
            if (optional.isPresent())
              try {
                if (((Zca)optional1.get()).equals(optional.get()))
                  return optional1; 
              } catch (Zi zi) {
                throw a(null);
              }  
          } catch (Zi zi) {
            throw a(null);
          } 
          optional = optional1;
        } 
      } catch (Zi zi) {
        throw a(null);
      } 
      b++;
      if (str != null)
        break; 
    } 
    return Zf();
  }
  
  private Optional<Zca> Zf() throws Zi, InterruptedException {
    try {
      if (!ZZ())
        return Optional.empty(); 
    } catch (Zi zi) {
      throw a(null);
    } 
    this.ZQ.Zz(Zk.ZA(this::lambda$locateInViewport$14));
    LayoutMetrics layoutMetrics = (LayoutMetrics)this.ZQ.Zz(Zk.ZA(Zor::lambda$locateInViewport$15));
    LayoutViewport layoutViewport = layoutMetrics.layoutViewport;
    List<List<Double>> list = (List)this.ZQ.Zz(Zk.ZA(this::lambda$locateInViewport$16));
    List<Zxg> list1 = Zxg.ZJ(list, layoutViewport);
    return list1.stream().filter(Zxg::ZU).findFirst().map(Zxg::Zs);
  }
  
  public Optional<Zca> Zk() throws Zi, InterruptedException {
    List list = (List)this.ZQ.Zz(Zk.ZA(this::lambda$getLocation$17));
    String str = ZY();
    try {
      if (Zbqc.Zwu() == null)
        Zw("AICTxb"); 
    } catch (Zi zi) {
      throw a(null);
    } 
    return list.stream().map(Zxg::new).findFirst().map(Zxg::Zs);
  }
  
  private boolean ZZ() throws Zi, InterruptedException {
    Snapshot snapshot = (Snapshot)this.ZQ.Zz(Zk.ZA(Zor::lambda$isVisible$18));
    List list = snapshot.domNodes;
    Integer integer = ((Node)this.ZQ.Zz(Zk.ZA(this::lambda$isVisible$19))).backendNodeId;
    Optional optional1 = list.stream().filter(integer::lambda$isVisible$20).findFirst();
    try {
      if (optional1.isEmpty())
        return false; 
    } catch (Zi zi) {
      throw a(null);
    } 
    List<NameValue> list1 = ((DOMNode)optional1.get()).attributes;
    try {
    
    } catch (Zi zi) {
      throw a(null);
    } 
    NameValue nameValue1 = (list1 != null) ? list1.stream().filter(Zor::lambda$isVisible$21).findFirst().orElse(ZV) : ZV;
    try {
    
    } catch (Zi zi) {
      throw a(null);
    } 
    NameValue nameValue2 = (list1 != null) ? list1.stream().filter(Zor::lambda$isVisible$22).findFirst().orElse(ZV) : ZV;
    Objects.requireNonNull(snapshot.layoutTreeNodes);
    Objects.requireNonNull(snapshot.computedStyles);
    Optional optional2 = Optional.<Integer>ofNullable(((DOMNode)optional1.get()).layoutNodeIndex).map(snapshot.layoutTreeNodes::get).map(Zor::lambda$isVisible$23).map(snapshot.computedStyles::get);
    NameValue nameValue3 = optional2.stream().flatMap(Zor::lambda$isVisible$24).filter(Zor::lambda$isVisible$25).findFirst().orElse(ZV);
    NameValue nameValue4 = optional2.stream().flatMap(Zor::lambda$isVisible$26).filter(Zor::lambda$isVisible$27).findFirst().orElse(ZV);
    try {
      if (Zw())
        try {
          if (!nameValue1.value.equals(a(6782, -26512)))
            try {
              if (!nameValue2.value.equals(a(6783, 9370)))
                try {
                  if (!nameValue3.value.equals(a(6781, -12924)))
                    try {
                      if (!nameValue4.value.equals(a(6779, -24822)));
                    } catch (Zi zi) {
                      throw a(null);
                    }  
                } catch (Zi zi) {
                  throw a(null);
                }  
            } catch (Zi zi) {
              throw a(null);
            }  
        } catch (Zi zi) {
          throw a(null);
        }  
    } catch (Zi zi) {
      throw a(null);
    } 
    return false;
  }
  
  private boolean Zw() throws Zi, InterruptedException {
    try {
      BoxModel boxModel = (BoxModel)this.ZQ.Zz(Zk.ZA(this::lambda$hasVisibleBoundingBox$28));
      double d = (boxModel.width.intValue() * boxModel.height.intValue());
      try {
      
      } catch (Zq zq) {
        throw a(null);
      } 
      return (d > 0.0D);
    } catch (Zq zq) {
      Zah.Zl((Throwable)zq, Zk_.IGNORED);
      return false;
    } 
  }
  
  public String toString() {
    a(6773, 3610);
    return a(6773, 3610) + a(6773, 3610) + this.ZO + a(6772, -10470) + this.ZG;
  }
  
  private CompletableFuture lambda$hasVisibleBoundingBox$28(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().getBoxModel(this.ZO, this.ZG, null);
  }
  
  private static boolean lambda$isVisible$27(NameValue paramNameValue) {
    return a(6776, -7893).equals(paramNameValue.name);
  }
  
  private static Stream lambda$isVisible$26(ComputedStyle paramComputedStyle) {
    return paramComputedStyle.properties.stream();
  }
  
  private static boolean lambda$isVisible$25(NameValue paramNameValue) {
    return a(6775, -29252).equals(paramNameValue.name);
  }
  
  private static Stream lambda$isVisible$24(ComputedStyle paramComputedStyle) {
    return paramComputedStyle.properties.stream();
  }
  
  private static Integer lambda$isVisible$23(LayoutTreeNode paramLayoutTreeNode) {
    return paramLayoutTreeNode.styleIndex;
  }
  
  private static boolean lambda$isVisible$22(NameValue paramNameValue) {
    return a(6774, 22367).equals(paramNameValue.name);
  }
  
  private static boolean lambda$isVisible$21(NameValue paramNameValue) {
    return a(6778, -10662).equals(paramNameValue.name);
  }
  
  private static boolean lambda$isVisible$20(Integer paramInteger, DOMNode paramDOMNode) {
    return paramInteger.equals(paramDOMNode.backendNodeId);
  }
  
  private CompletableFuture lambda$isVisible$19(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().describeNode(this.ZO, this.ZG, null, Integer.valueOf(-1), Boolean.valueOf(true));
  }
  
  private static CompletableFuture lambda$isVisible$18(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOMSnapshot().getSnapshot(Arrays.asList(new String[] { a(6780, 8776), a(6777, 25015) }), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false));
  }
  
  private CompletableFuture lambda$getLocation$17(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().getContentQuads(this.ZO, this.ZG, null);
  }
  
  private CompletableFuture lambda$locateInViewport$16(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().getContentQuads(this.ZO, this.ZG, null);
  }
  
  private static CompletableFuture lambda$locateInViewport$15(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getPage().getLayoutMetrics();
  }
  
  private CompletableFuture lambda$locateInViewport$14(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().scrollIntoViewIfNeeded(this.ZO, this.ZG, null, null);
  }
  
  private CompletionStage lambda$getShadowRootNodeIds$13(List paramList, Node paramNode) {
    // Byte code:
    //   0: aload_2
    //   1: getfield shadowRoots : Ljava/util/List;
    //   4: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   9: aload_0
    //   10: aload_1
    //   11: <illegal opcode> apply : (Lnet/portswigger/devtools/client/impl/Zor;Ljava/util/List;)Ljava/util/function/Function;
    //   16: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   21: <illegal opcode> apply : ()Ljava/util/function/IntFunction;
    //   26: invokeinterface toArray : (Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    //   31: checkcast [Ljava/util/concurrent/CompletableFuture;
    //   34: invokestatic allOf : ([Ljava/util/concurrent/CompletableFuture;)Ljava/util/concurrent/CompletableFuture;
    //   37: areturn
  }
  
  private static CompletableFuture[] lambda$getShadowRootNodeIds$12(int paramInt) {
    return new CompletableFuture[paramInt];
  }
  
  private CompletableFuture lambda$getShadowRootNodeIds$11(List paramList, Node paramNode) {
    Objects.requireNonNull(paramList);
    return this.ZQ.ZL(Zk.ZA(paramNode::lambda$getShadowRootNodeIds$8)).thenCompose(this::lambda$getShadowRootNodeIds$10).thenAccept(paramList::add);
  }
  
  private CompletionStage lambda$getShadowRootNodeIds$10(RemoteObject paramRemoteObject) {
    return this.ZQ.ZL(Zk.ZA(paramRemoteObject::lambda$getShadowRootNodeIds$9));
  }
  
  private static CompletableFuture lambda$getShadowRootNodeIds$9(RemoteObject paramRemoteObject, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().requestNode(paramRemoteObject.objectId);
  }
  
  private static CompletableFuture lambda$getShadowRootNodeIds$8(Node paramNode, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().resolveNode(null, paramNode.backendNodeId, null, null);
  }
  
  private CompletableFuture lambda$getShadowRootNodeIds$7(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().describeNode(this.ZO, this.ZG, null, Integer.valueOf(1), Boolean.valueOf(true));
  }
  
  private CompletableFuture lambda$highlight$6(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getOverlay().highlightNode(Zo, this.ZO, this.ZG, null, null);
  }
  
  private CompletableFuture lambda$focus$5(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().focus(this.ZO, this.ZG, null);
  }
  
  private CompletableFuture lambda$setFileInputs$4(Path[] paramArrayOfPath, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().setFileInputFiles((List)Arrays.<Path>stream(paramArrayOfPath).map(Path::toString).collect(Collectors.toList()), this.ZO, this.ZG, null);
  }
  
  private CompletionStage lambda$executeScriptViaDevTools$3(String paramString, Zm4 paramZm4, RemoteObject paramRemoteObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lnet/portswigger/devtools/client/Zn;
    //   4: aload_1
    //   5: aload_3
    //   6: aload_2
    //   7: <illegal opcode> Zy : (Ljava/lang/String;Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;Lnet/portswigger/devtools/client/impl/Zm4;)Lnet/portswigger/devtools/client/Zs;
    //   12: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   15: invokevirtual ZL : (Lnet/portswigger/devtools/client/Zk;)Ljava/util/concurrent/CompletableFuture;
    //   18: areturn
  }
  
  private static CompletableFuture lambda$executeScriptViaDevTools$2(String paramString, RemoteObject paramRemoteObject, Zm4 paramZm4, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getRuntime().callFunctionOn(paramString, paramRemoteObject.objectId, Collections.emptyList(), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), null, paramZm4.ZR(), Boolean.valueOf(false), null, null);
  }
  
  private CompletableFuture lambda$executeScriptViaDevTools$1(Zm4 paramZm4, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().resolveNode(this.ZO, this.ZG, paramZm4.ZR(), null);
  }
  
  private CompletableFuture lambda$html$0(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().getOuterHTML(this.ZO, this.ZG, null);
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic Zw : (Ljava/lang/String;)V
    //   13: ldc 'ú{,©uj\\n÷ÓÕ{9+m%;ð8Â/ç5V98ßz®¡IÒo¥Aòmè¬ÎERO,£\\n¦´Ù¸¶]='
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: iconst_4
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #25
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 146
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: ldc '.:èIcìMßð_Îï3z£¸À¨Yw#g¦Ck'sb(x)É/L1ËÀ'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #16
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #120
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic net/portswigger/devtools/client/impl/Zor.a : [Ljava/lang/String;
    //   135: bipush #12
    //   137: anewarray java/lang/String
    //   140: putstatic net/portswigger/devtools/client/impl/Zor.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #31
    //   218: goto -> 248
    //   221: bipush #64
    //   223: goto -> 248
    //   226: bipush #114
    //   228: goto -> 248
    //   231: bipush #52
    //   233: goto -> 248
    //   236: bipush #10
    //   238: goto -> 248
    //   241: bipush #18
    //   243: goto -> 248
    //   246: bipush #125
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 43, 0 -> 102
    //   304: new net/portswigger/devtools/protocol/types/domsnapshot/NameValue
    //   307: dup
    //   308: ldc ''
    //   310: ldc ''
    //   312: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   315: putstatic net/portswigger/devtools/client/impl/Zor.ZV : Lnet/portswigger/devtools/protocol/types/domsnapshot/NameValue;
    //   318: new net/portswigger/devtools/protocol/types/overlay/HighlightConfig
    //   321: dup
    //   322: aconst_null
    //   323: aconst_null
    //   324: aconst_null
    //   325: aconst_null
    //   326: aconst_null
    //   327: new net/portswigger/devtools/protocol/types/dom/RGBA
    //   330: dup
    //   331: sipush #255
    //   334: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   337: bipush #102
    //   339: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   342: bipush #51
    //   344: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   347: ldc2_w 0.5
    //   350: invokestatic valueOf : (D)Ljava/lang/Double;
    //   353: invokespecial <init> : (Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;)V
    //   356: new net/portswigger/devtools/protocol/types/dom/RGBA
    //   359: dup
    //   360: sipush #255
    //   363: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   366: bipush #102
    //   368: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   371: bipush #51
    //   373: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   376: ldc2_w 0.75
    //   379: invokestatic valueOf : (D)Ljava/lang/Double;
    //   382: invokespecial <init> : (Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;)V
    //   385: new net/portswigger/devtools/protocol/types/dom/RGBA
    //   388: dup
    //   389: sipush #255
    //   392: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   395: bipush #102
    //   397: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   400: bipush #51
    //   402: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   405: dconst_1
    //   406: invokestatic valueOf : (D)Ljava/lang/Double;
    //   409: invokespecial <init> : (Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;)V
    //   412: aconst_null
    //   413: aconst_null
    //   414: aconst_null
    //   415: aconst_null
    //   416: aconst_null
    //   417: aconst_null
    //   418: aconst_null
    //   419: aconst_null
    //   420: aconst_null
    //   421: aconst_null
    //   422: aconst_null
    //   423: invokespecial <init> : (Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lnet/portswigger/devtools/protocol/types/dom/RGBA;Lnet/portswigger/devtools/protocol/types/dom/RGBA;Lnet/portswigger/devtools/protocol/types/dom/RGBA;Lnet/portswigger/devtools/protocol/types/dom/RGBA;Lnet/portswigger/devtools/protocol/types/dom/RGBA;Lnet/portswigger/devtools/protocol/types/dom/RGBA;Lnet/portswigger/devtools/protocol/types/dom/RGBA;Lnet/portswigger/devtools/protocol/types/dom/RGBA;Lnet/portswigger/devtools/protocol/types/overlay/ColorFormat;Lnet/portswigger/devtools/protocol/types/overlay/GridHighlightConfig;Lnet/portswigger/devtools/protocol/types/overlay/FlexContainerHighlightConfig;Lnet/portswigger/devtools/protocol/types/overlay/FlexItemHighlightConfig;Lnet/portswigger/devtools/protocol/types/overlay/ContrastAlgorithm;Lnet/portswigger/devtools/protocol/types/overlay/ContainerQueryContainerHighlightConfig;)V
    //   426: putstatic net/portswigger/devtools/client/impl/Zor.Zo : Lnet/portswigger/devtools/protocol/types/overlay/HighlightConfig;
    //   429: return
  }
  
  public static void Zw(String paramString) {
    ZM = paramString;
  }
  
  public static String ZY() {
    return ZM;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1A7E) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      byte b1 = 11;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */