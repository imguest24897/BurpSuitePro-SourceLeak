package net.portswigger.devtools.client.impl;

import burp.Zbqc;
import burp.Zlnb;
import burp.Ztos;
import burp.Zxr8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zcq;
import net.portswigger.browser.Zdm;
import net.portswigger.browser.Ze9;
import net.portswigger.browser.Zh;
import net.portswigger.browser.Zs;
import net.portswigger.browser.Zti;
import net.portswigger.browser.Ztj;
import net.portswigger.browser.Ztk;
import net.portswigger.browser.Ztq;
import net.portswigger.devtools.client.Z_;
import net.portswigger.devtools.client.Zi;
import net.portswigger.devtools.client.Zk;
import net.portswigger.devtools.client.Zn;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.client.Zy;
import net.portswigger.devtools.protocol.ChromeDevTools;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.types.dom.Node;
import net.portswigger.devtools.protocol.types.dom.PerformSearch;
import net.portswigger.devtools.protocol.types.runtime.CallFunctionOn;
import net.portswigger.devtools.protocol.types.runtime.PropertyDescriptor;
import net.portswigger.devtools.protocol.types.runtime.RemoteObject;

public class Zon implements Zdm {
  private final Ztos<Zcq> ZH;
  
  private final Zn ZP;
  
  private static final String a;
  
  public Zon(Ztos<Zcq> paramZtos, Zn paramZn) {
    this.ZH = paramZtos;
    this.ZP = Objects.<Zn>requireNonNull(paramZn);
  }
  
  private <T extends Zl> Zp<T> Zl(Zlnb<Void> paramZlnb) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> Zy : (Lnet/portswigger/devtools/client/impl/Zon;Lburp/Zlnb;)Lnet/portswigger/devtools/protocol/Zp;
    //   7: areturn
  }
  
  public CompletableFuture<?> Zg() throws Zi {
    this.ZP.Zn(this::lambda$initialise$1);
    this.ZP.Zn(this::lambda$initialise$2);
    String str = Zxy.Zx();
    try {
      this.ZP.Zn(this::lambda$initialise$3);
      this.ZP.Zn(this::lambda$initialise$4);
      this.ZP.Zn(this::lambda$initialise$5);
      if (str == null)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (Zi zi) {
      throw a(null);
    } 
    return CompletableFuture.allOf((CompletableFuture<?>[])new CompletableFuture[] { this.ZP.ZL(Zk.ZA(Zon::lambda$initialise$6)), this.ZP.ZL(Zk.ZA(Zon::lambda$initialise$7)), this.ZP.ZL(Zk.ZA(Zon::lambda$initialise$8)), this.ZP.ZL(Zk.ZA(Zon::lambda$initialise$9)) });
  }
  
  public List<Zh> ZB(Zs paramZs) {
    return (List<Zh>)ZH(paramZs).stream().map(this::lambda$locate$10).collect(Collectors.toList());
  }
  
  private List<Integer> ZH(Zs paramZs) {
    try {
      this.ZP.Zh(Zk.ZA(Zon::lambda$performSearch$11), Zy.ZX());
      PerformSearch performSearch = (PerformSearch)this.ZP.Zz(Zk.ZA(paramZs::lambda$performSearch$12));
      try {
        if (performSearch.resultCount.intValue() > 0) {
          List list = (List)this.ZP.Zz(Zk.ZA(performSearch::lambda$performSearch$13));
          return (List)list.stream().filter(Objects::nonNull).filter(Zon::lambda$performSearch$14).collect(Collectors.toList());
        } 
      } finally {
        this.ZP.ZL(Zk.ZA(performSearch::lambda$performSearch$15));
      } 
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.COMMON_RUNTIME_FAILURE);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
    } 
    return Collections.emptyList();
  }
  
  public List<Zh> ZO(Zs paramZs, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZP : Lnet/portswigger/devtools/client/Zn;
    //   4: invokestatic ZE : (Lnet/portswigger/devtools/client/Zn;)Lnet/portswigger/devtools/client/impl/Zm4;
    //   7: astore_3
    //   8: aload_1
    //   9: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   12: aload_0
    //   13: <illegal opcode> apply : (Lnet/portswigger/devtools/client/impl/Zon;)Ljava/util/function/Function;
    //   18: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   21: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   26: invokevirtual flatMap : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   29: aload_0
    //   30: <illegal opcode> apply : (Lnet/portswigger/devtools/client/impl/Zon;)Ljava/util/function/Function;
    //   35: invokevirtual flatMap : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   38: aload_0
    //   39: <illegal opcode> get : (Lnet/portswigger/devtools/client/impl/Zon;)Ljava/util/function/Supplier;
    //   44: invokevirtual orElseGet : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   47: checkcast java/lang/Integer
    //   50: astore #4
    //   52: aload_0
    //   53: getfield ZP : Lnet/portswigger/devtools/client/Zn;
    //   56: aload #4
    //   58: aload_3
    //   59: <illegal opcode> Zy : (Ljava/lang/Integer;Lnet/portswigger/devtools/client/impl/Zm4;)Lnet/portswigger/devtools/client/Zs;
    //   64: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   67: invokevirtual Zz : (Lnet/portswigger/devtools/client/Zk;)Ljava/lang/Object;
    //   70: checkcast net/portswigger/devtools/protocol/types/runtime/RemoteObject
    //   73: astore #5
    //   75: aload_0
    //   76: getfield ZP : Lnet/portswigger/devtools/client/Zn;
    //   79: aload_2
    //   80: aload #5
    //   82: aload_3
    //   83: <illegal opcode> Zy : (Ljava/lang/String;Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;Lnet/portswigger/devtools/client/impl/Zm4;)Lnet/portswigger/devtools/client/Zs;
    //   88: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   91: invokevirtual Zz : (Lnet/portswigger/devtools/client/Zk;)Ljava/lang/Object;
    //   94: checkcast net/portswigger/devtools/protocol/types/runtime/CallFunctionOn
    //   97: astore #6
    //   99: aload #6
    //   101: ifnull -> 252
    //   104: aload #6
    //   106: getfield result : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   109: ifnull -> 252
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   118: athrow
    //   119: aload #6
    //   121: getfield result : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   124: getfield objectId : Ljava/lang/String;
    //   127: ifnull -> 252
    //   130: goto -> 137
    //   133: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   136: athrow
    //   137: aload_0
    //   138: getfield ZP : Lnet/portswigger/devtools/client/Zn;
    //   141: aload #6
    //   143: <illegal opcode> Zy : (Lnet/portswigger/devtools/protocol/types/runtime/CallFunctionOn;)Lnet/portswigger/devtools/client/Zs;
    //   148: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   151: invokevirtual Zz : (Lnet/portswigger/devtools/client/Zk;)Ljava/lang/Object;
    //   154: checkcast net/portswigger/devtools/protocol/types/runtime/Properties
    //   157: astore #7
    //   159: aload #7
    //   161: getfield result : Ljava/util/List;
    //   164: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   169: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   174: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   179: aload_0
    //   180: <illegal opcode> apply : (Lnet/portswigger/devtools/client/impl/Zon;)Ljava/util/function/Function;
    //   185: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   190: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   195: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   200: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   205: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   210: aload_0
    //   211: <illegal opcode> apply : (Lnet/portswigger/devtools/client/impl/Zon;)Ljava/util/function/Function;
    //   216: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   221: invokestatic toList : ()Ljava/util/stream/Collector;
    //   224: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   229: checkcast java/util/List
    //   232: astore #8
    //   234: aload_3
    //   235: ifnull -> 249
    //   238: aload_3
    //   239: invokevirtual close : ()V
    //   242: goto -> 249
    //   245: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   248: athrow
    //   249: aload #8
    //   251: areturn
    //   252: aload_3
    //   253: ifnull -> 292
    //   256: aload_3
    //   257: invokevirtual close : ()V
    //   260: goto -> 292
    //   263: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   266: athrow
    //   267: astore #4
    //   269: aload_3
    //   270: ifnull -> 289
    //   273: aload_3
    //   274: invokevirtual close : ()V
    //   277: goto -> 289
    //   280: astore #5
    //   282: aload #4
    //   284: aload #5
    //   286: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   289: aload #4
    //   291: athrow
    //   292: goto -> 320
    //   295: astore_3
    //   296: aload_3
    //   297: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   300: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   303: goto -> 320
    //   306: astore_3
    //   307: aload_3
    //   308: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   311: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   314: invokestatic currentThread : ()Ljava/lang/Thread;
    //   317: invokevirtual interrupt : ()V
    //   320: invokestatic emptyList : ()Ljava/util/List;
    //   323: areturn
    // Exception table:
    //   from	to	target	type
    //   0	249	295	net/portswigger/devtools/client/Zi
    //   0	249	306	java/lang/InterruptedException
    //   8	234	267	java/lang/Throwable
    //   99	112	115	java/lang/Throwable
    //   104	130	133	java/lang/Throwable
    //   234	242	245	java/lang/Throwable
    //   252	263	263	java/lang/Throwable
    //   252	292	295	net/portswigger/devtools/client/Zi
    //   252	292	306	java/lang/InterruptedException
    //   273	277	280	java/lang/Throwable
  }
  
  public void ZZ() throws Ztk {
    try {
      this.ZP.Zh(Zk.ZA(Zon::lambda$nudgeDocument$30), Zy.ZX());
    } catch (Zp zp) {
      Zah.Zl((Throwable)zp, Zk_.RETHROWN);
      throw new Zti(zp);
    } catch (Z_ z_) {
      Zah.Zl((Throwable)z_, Zk_.RETHROWN);
      throw new Ztj(z_);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.RETHROWN);
      throw new Ztq(zi);
    } 
  }
  
  public List<Zh> Za(Zh paramZh, Ze9 paramZe9) {
    String str = Zxy.Zx();
    if (paramZh instanceof Zor) {
      Zor zor = (Zor)paramZh;
      try {
        if (str != null) {
          try {
            ArrayList<Zor> arrayList = new ArrayList();
            for (Integer integer : zor.Zc()) {
              for (Integer integer1 : ZI(integer, paramZe9)) {
                Zor zor1 = new Zor(this.ZP, integer1, null);
                arrayList.add(zor1);
                if (str == null)
                  break; 
              } 
              if (str == null)
                break; 
            } 
            return (List)arrayList;
          } catch (InterruptedException interruptedException) {
            Zah.Zl(interruptedException, Zk_.IGNORED);
            Thread.currentThread().interrupt();
          } catch (Zi zi) {
            Zah.Zl((Throwable)zi, Zk_.COMMON_RUNTIME_FAILURE);
          } 
          return Collections.emptyList();
        } 
        throw new ClassCastException(a);
      } catch (InterruptedException interruptedException) {
        throw a(null);
      } 
    } 
    throw new ClassCastException(a);
  }
  
  private List<Integer> ZI(Integer paramInteger, Ze9 paramZe9) throws InterruptedException, Zi {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZP : Lnet/portswigger/devtools/client/Zn;
    //   4: aload_1
    //   5: aload_2
    //   6: <illegal opcode> Zy : (Ljava/lang/Integer;Lnet/portswigger/browser/Ze9;)Lnet/portswigger/devtools/client/Zs;
    //   11: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   14: invokevirtual Zz : (Lnet/portswigger/devtools/client/Zk;)Ljava/lang/Object;
    //   17: checkcast java/util/List
    //   20: areturn
  }
  
  private static <T> T ZX(Zn paramZn, Zk<T> paramZk) {
    try {
      return (T)paramZn.Zz(paramZk);
    } catch (Zi|InterruptedException zi) {
      Zah.Zl((Throwable)zi, Zk_.COMMON_RUNTIME_FAILURE);
      return null;
    } 
  }
  
  private static CompletableFuture lambda$performShadowDomSearch$32(Integer paramInteger, Ze9 paramZe9, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().querySelectorAll(paramInteger, paramZe9.ZU());
  }
  
  private static CompletableFuture lambda$rootNode$31(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().getDocument(Integer.valueOf(-1), Boolean.valueOf(false));
  }
  
  private static CompletableFuture lambda$nudgeDocument$30(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().getDocument(Integer.valueOf(-1), Boolean.valueOf(false));
  }
  
  private Zor lambda$locateWithJavascript$29(Integer paramInteger) {
    return new Zor(this.ZP, paramInteger, null);
  }
  
  private static boolean lambda$locateWithJavascript$28(Integer paramInteger) {
    try {
    
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return (paramInteger.intValue() > 0);
  }
  
  private Integer lambda$locateWithJavascript$27(PropertyDescriptor paramPropertyDescriptor) {
    return ZX(this.ZP, Zk.ZA(paramPropertyDescriptor::lambda$locateWithJavascript$26));
  }
  
  private static CompletableFuture lambda$locateWithJavascript$26(PropertyDescriptor paramPropertyDescriptor, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().requestNode(paramPropertyDescriptor.value.objectId);
  }
  
  private static boolean lambda$locateWithJavascript$25(PropertyDescriptor paramPropertyDescriptor) {
    return paramPropertyDescriptor.enumerable.booleanValue();
  }
  
  private static CompletableFuture lambda$locateWithJavascript$24(CallFunctionOn paramCallFunctionOn, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getRuntime().getProperties(paramCallFunctionOn.result.objectId, Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false));
  }
  
  private static CompletableFuture lambda$locateWithJavascript$23(String paramString, RemoteObject paramRemoteObject, Zm4 paramZm4, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getRuntime().callFunctionOn(paramString, paramRemoteObject.objectId, Collections.emptyList(), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), null, paramZm4.ZR(), Boolean.valueOf(false), null, null);
  }
  
  private static CompletableFuture lambda$locateWithJavascript$22(Integer paramInteger, Zm4 paramZm4, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().resolveNode(null, paramInteger, paramZm4.ZR(), null);
  }
  
  private Integer lambda$locateWithJavascript$21() {
    return ((Node)ZX(this.ZP, Zk.ZA(Zon::lambda$locateWithJavascript$20))).backendNodeId;
  }
  
  private static CompletableFuture lambda$locateWithJavascript$20(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().getDocument();
  }
  
  private Optional lambda$locateWithJavascript$19(Integer paramInteger) {
    return Optional.<Node>ofNullable(ZX(this.ZP, Zk.ZA(paramInteger::lambda$locateWithJavascript$17))).map(Zon::lambda$locateWithJavascript$18);
  }
  
  private static Integer lambda$locateWithJavascript$18(Node paramNode) {
    try {
    
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return (paramNode.contentDocument != null) ? paramNode.contentDocument.backendNodeId : paramNode.backendNodeId;
  }
  
  private static CompletableFuture lambda$locateWithJavascript$17(Integer paramInteger, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().describeNode(paramInteger, null, null, null, null);
  }
  
  private static Optional lambda$locateWithJavascript$16(List paramList) {
    return paramList.stream().findFirst();
  }
  
  private static CompletableFuture lambda$performSearch$15(PerformSearch paramPerformSearch, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().discardSearchResults(paramPerformSearch.searchId);
  }
  
  private static boolean lambda$performSearch$14(Integer paramInteger) {
    try {
    
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return (paramInteger.intValue() > 0);
  }
  
  private static CompletableFuture lambda$performSearch$13(PerformSearch paramPerformSearch, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().getSearchResults(paramPerformSearch.searchId, Integer.valueOf(0), paramPerformSearch.resultCount);
  }
  
  private static CompletableFuture lambda$performSearch$12(Zs paramZs, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().performSearch(paramZs.ZU());
  }
  
  private static CompletableFuture lambda$performSearch$11(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().getDocument(Integer.valueOf(-1), Boolean.valueOf(false));
  }
  
  private Zor lambda$locate$10(Integer paramInteger) {
    return new Zor(this.ZP, paramInteger, null);
  }
  
  private static CompletableFuture lambda$initialise$9(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getOverlay().enable();
  }
  
  private static CompletableFuture lambda$initialise$8(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOMStorage().enable();
  }
  
  private static CompletableFuture lambda$initialise$7(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().enable();
  }
  
  private static CompletableFuture lambda$initialise$6(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOMSnapshot().enable();
  }
  
  private Zs lambda$initialise$5(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    return paramChromeDevTools.getDOM().onAttributeModified(Zl(Zcq.Zj));
  }
  
  private Zs lambda$initialise$4(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    return paramChromeDevTools.getDOM().onChildNodeCountUpdated(Zl(Zcq.Zj));
  }
  
  private Zs lambda$initialise$3(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    return paramChromeDevTools.getDOM().onChildNodeRemoved(Zl(Zcq.Zj));
  }
  
  private Zs lambda$initialise$2(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    return paramChromeDevTools.getDOM().onChildNodeInserted(Zl(Zcq.Zj));
  }
  
  private Zs lambda$initialise$1(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    return paramChromeDevTools.getDOM().onDocumentUpdated(Zl(Zcq.Zm));
  }
  
  private void lambda$handleDocumentEvent$0(Zlnb paramZlnb, Zl paramZl) {
    this.ZH.ZD(new Zxr8(paramZlnb, null));
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: bipush #111
    //   2: ldc ';O0,'J 1/'!I(.'R9#hF\\rS655<F\\r:{). -4+!R63>+-I;>5"$B'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/devtools/client/impl/Zon.a : Ljava/lang/String;
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
    //   80: bipush #39
    //   82: goto -> 112
    //   85: bipush #72
    //   87: goto -> 112
    //   90: bipush #12
    //   92: goto -> 112
    //   95: bipush #28
    //   97: goto -> 112
    //   100: bipush #48
    //   102: goto -> 112
    //   105: bipush #52
    //   107: goto -> 112
    //   110: bipush #41
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zon.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */