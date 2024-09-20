package net.portswigger.devtools.client.impl;

import burp.Zbqc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import net.portswigger.Zlz;
import net.portswigger.browser.Zc4;
import net.portswigger.browser.Zdb;
import net.portswigger.browser.Ze6;
import net.portswigger.browser.Zel;
import net.portswigger.browser.Zjn;
import net.portswigger.browser.Zt3;
import net.portswigger.browser.Ztk;
import net.portswigger.devtools.client.Zi;
import net.portswigger.devtools.client.Zk;
import net.portswigger.devtools.client.Zn;
import net.portswigger.devtools.protocol.ChromeDevTools;
import net.portswigger.devtools.protocol.types.accessibility.AXNode;
import net.portswigger.devtools.protocol.types.domdebugger.EventListener;
import net.portswigger.devtools.protocol.types.domsnapshot.DOMNode;
import net.portswigger.devtools.protocol.types.domsnapshot.LayoutTreeNode;
import net.portswigger.devtools.protocol.types.domsnapshot.NameValue;
import net.portswigger.devtools.protocol.types.domsnapshot.Snapshot;
import net.portswigger.devtools.protocol.types.page.FrameTree;
import net.portswigger.devtools.protocol.types.page.NavigationEntry;
import net.portswigger.devtools.protocol.types.page.NavigationHistory;
import net.portswigger.devtools.protocol.types.runtime.CallFunctionOn;
import net.portswigger.devtools.protocol.types.runtime.RemoteObject;

public class Zx7 implements Zdb {
  private static final Set<String> Z_;
  
  private static final Set<String> Zd;
  
  private final String Zs;
  
  private final String ZJ;
  
  private final String ZZ;
  
  private final String Zr;
  
  private final String ZP;
  
  private final Zj ZB;
  
  private static String ZY;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zx7(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, Zj paramZj) {
    this.Zs = paramString1;
    this.ZJ = paramString2;
    this.ZZ = paramString3;
    this.Zr = paramString4;
    this.ZP = paramString5;
    this.ZB = paramZj;
  }
  
  public static Zx7 Zd(Zn paramZn, Ze6 paramZe6) throws Ztk, Zi, InterruptedException {
    NavigationHistory navigationHistory = (NavigationHistory)paramZn.Zz(Zk.ZA(Zx7::lambda$snapshot$0));
    String str1 = ZT();
    NavigationEntry navigationEntry = navigationHistory.entries.get(navigationHistory.currentIndex.intValue());
    Zr zr = ZD(navigationEntry);
    String str2 = Zk(paramZn);
    Zj zj = ZX(paramZn, paramZe6, str2);
    String str3 = Za(zj);
    try {
      if (Zbqc.Zwu() == null)
        Zw("DAZu8b"); 
    } catch (Ztk ztk) {
      throw a(null);
    } 
    return new Zx7(zr.ZD, zr.ZX, str2, navigationEntry.title, str3, zj);
  }
  
  private static Zr ZD(NavigationEntry paramNavigationEntry) {
    String str1 = paramNavigationEntry.url;
    if (a(-5446, 2533).equals(str1))
      return Zr.Zz(); 
    String[] arrayOfString = str1.split("#", 2);
    String str2 = arrayOfString[0];
    String str3 = (arrayOfString.length == 2) ? arrayOfString[1] : null;
    return new Zr(str2, str3);
  }
  
  private static String Zk(Zn paramZn) throws InterruptedException, Zi {
    FrameTree frameTree = (FrameTree)paramZn.Zz(Zk.ZA(Zx7::lambda$getCurrentPageMimeType$1));
    try {
    
    } catch (InterruptedException interruptedException) {
      throw a(null);
    } 
    return (frameTree != null) ? frameTree.frame.mimeType : null;
  }
  
  private static String Za(Zt3 paramZt3) throws Ztk {
    try {
      if (paramZt3 != null)
        try {
          if (paramZt3.ZZ().isPresent())
            return ((Zel)paramZt3.ZZ().get()).Zq().Zi(); 
        } catch (Ztk ztk) {
          throw a(null);
        }  
    } catch (Ztk ztk) {
      throw a(null);
    } 
    return null;
  }
  
  private static Zj ZX(Zn paramZn, Ze6 paramZe6, String paramString) throws InterruptedException, Zi {
    String str = ZT();
    try {
      if (paramString != null)
        try {
          if (paramString.toLowerCase().contains(a(-5443, 24520)))
            try {
              if (!paramString.toLowerCase().contains(a(-5458, 13767))) {
                Snapshot snapshot = (Snapshot)paramZn.Zz(Zk.ZA(Zx7::lambda$findHtmlFeatures$2));
                Zk zk = null;
                if (paramZe6.Zf())
                  zk = Zk.ZF((List<AXNode>)paramZn.Zz(Zk.ZA(Zx7::lambda$findHtmlFeatures$3))); 
                List list = snapshot.domNodes;
                List<LayoutTreeNode> list1 = snapshot.layoutTreeNodes;
                Zm4 zm4 = Zm4.ZE(paramZn);
                try {
                  ArrayList<Zel> arrayList = new ArrayList();
                  for (DOMNode dOMNode : list) {
                    arrayList.add(ZK(paramZn, dOMNode, zk, paramZe6, list1, zm4));
                    if (str != null)
                      break; 
                  } 
                  Zj zj = new Zj(arrayList);
                  try {
                    if (zm4 != null)
                      zm4.close(); 
                  } catch (Throwable throwable) {
                    throw a(null);
                  } 
                  return zj;
                } catch (Throwable throwable) {
                  if (zm4 != null)
                    try {
                      zm4.close();
                    } catch (Throwable throwable1) {
                      throwable.addSuppressed(throwable1);
                    }  
                  throw throwable;
                } 
              } 
              return null;
            } catch (Throwable throwable) {
              throw a(null);
            }  
        } catch (Throwable throwable) {
          throw a(null);
        }  
    } catch (Throwable throwable) {
      throw a(null);
    } 
    return null;
  }
  
  private static Zel ZK(Zn paramZn, DOMNode paramDOMNode, Zk paramZk, Ze6 paramZe6, List<LayoutTreeNode> paramList, Zm4 paramZm4) throws Zi, InterruptedException {
    // Byte code:
    //   0: aload_1
    //   1: getfield layoutNodeIndex : Ljava/lang/Integer;
    //   4: ifnull -> 31
    //   7: aload #4
    //   9: aload_1
    //   10: getfield layoutNodeIndex : Ljava/lang/Integer;
    //   13: invokevirtual intValue : ()I
    //   16: invokeinterface get : (I)Ljava/lang/Object;
    //   21: checkcast net/portswigger/devtools/protocol/types/domsnapshot/LayoutTreeNode
    //   24: goto -> 32
    //   27: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   30: athrow
    //   31: aconst_null
    //   32: astore #6
    //   34: aload_3
    //   35: invokevirtual ZY : ()Z
    //   38: ifeq -> 55
    //   41: aload_0
    //   42: aload_1
    //   43: aload #5
    //   45: invokestatic ZQ : (Lnet/portswigger/devtools/client/Zn;Lnet/portswigger/devtools/protocol/types/domsnapshot/DOMNode;Lnet/portswigger/devtools/client/impl/Zm4;)Ljava/util/Map;
    //   48: goto -> 59
    //   51: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   54: athrow
    //   55: aload_1
    //   56: invokestatic ZA : (Lnet/portswigger/devtools/protocol/types/domsnapshot/DOMNode;)Ljava/util/Map;
    //   59: astore #7
    //   61: aload_0
    //   62: aload_1
    //   63: aload #5
    //   65: invokestatic ZA : (Lnet/portswigger/devtools/client/Zn;Lnet/portswigger/devtools/protocol/types/domsnapshot/DOMNode;Lnet/portswigger/devtools/client/impl/Zm4;)Ljava/util/List;
    //   68: astore #8
    //   70: aload_1
    //   71: getfield backendNodeId : Ljava/lang/Integer;
    //   74: astore #9
    //   76: aload_1
    //   77: getfield nodeName : Ljava/lang/String;
    //   80: astore #10
    //   82: aload_1
    //   83: getfield inputValue : Ljava/lang/String;
    //   86: astore #11
    //   88: aload_1
    //   89: invokestatic Zu : (Lnet/portswigger/devtools/protocol/types/domsnapshot/DOMNode;)Ljava/util/Map;
    //   92: astore #12
    //   94: aload_1
    //   95: getfield isClickable : Ljava/lang/Boolean;
    //   98: ifnull -> 126
    //   101: aload_1
    //   102: getfield isClickable : Ljava/lang/Boolean;
    //   105: invokevirtual booleanValue : ()Z
    //   108: ifeq -> 126
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   117: athrow
    //   118: iconst_1
    //   119: goto -> 127
    //   122: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   125: athrow
    //   126: iconst_0
    //   127: istore #13
    //   129: getstatic net/portswigger/devtools/client/impl/Zx7.Zd : Ljava/util/Set;
    //   132: aload #10
    //   134: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
    //   137: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   140: invokeinterface contains : (Ljava/lang/Object;)Z
    //   145: istore #14
    //   147: aload #6
    //   149: aload_3
    //   150: invokestatic ZI : (Lnet/portswigger/devtools/protocol/types/domsnapshot/LayoutTreeNode;Lnet/portswigger/browser/Ze6;)Z
    //   153: istore #15
    //   155: aload_1
    //   156: aload_2
    //   157: aload #10
    //   159: aload #12
    //   161: invokestatic Zr : (Lnet/portswigger/devtools/protocol/types/domsnapshot/DOMNode;Lnet/portswigger/devtools/client/impl/Zk;Ljava/lang/String;Ljava/util/Map;)Ljava/util/Optional;
    //   164: astore #16
    //   166: aload_1
    //   167: getfield childNodeIndexes : Ljava/util/List;
    //   170: ifnull -> 184
    //   173: aload_1
    //   174: getfield childNodeIndexes : Ljava/util/List;
    //   177: goto -> 187
    //   180: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   183: athrow
    //   184: invokestatic emptyList : ()Ljava/util/List;
    //   187: astore #17
    //   189: new net/portswigger/devtools/client/impl/Zc
    //   192: dup
    //   193: aload_0
    //   194: aload #9
    //   196: invokevirtual intValue : ()I
    //   199: aload #10
    //   201: aload #12
    //   203: aload #7
    //   205: iload #13
    //   207: iload #15
    //   209: iload #14
    //   211: aload #16
    //   213: aconst_null
    //   214: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   217: checkcast net/portswigger/browser/Zjn
    //   220: aload #11
    //   222: aload #17
    //   224: aload #8
    //   226: invokespecial <init> : (Lnet/portswigger/devtools/client/Zn;ILjava/lang/String;Ljava/util/Map;Ljava/util/Map;ZZZLnet/portswigger/browser/Zjn;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V
    //   229: areturn
    // Exception table:
    //   from	to	target	type
    //   0	27	27	net/portswigger/devtools/client/Zi
    //   34	51	51	net/portswigger/devtools/client/Zi
    //   94	111	114	net/portswigger/devtools/client/Zi
    //   101	122	122	net/portswigger/devtools/client/Zi
    //   166	180	180	net/portswigger/devtools/client/Zi
  }
  
  private static Optional<Zjn> Zr(DOMNode paramDOMNode, Zk paramZk, String paramString, Map<String, String> paramMap) {
    if (paramZk != null) {
      Optional<Zjn> optional = ZC(paramZk, paramDOMNode);
      if (optional.isPresent())
        return optional; 
    } 
    return ZX(paramString, paramDOMNode.nodeValue, paramMap);
  }
  
  private static List<AXNode> Zj(Zk paramZk, AXNode paramAXNode) {
    return paramZk.Zn(paramAXNode);
  }
  
  private static String ZN(Zk paramZk, AXNode paramAXNode) {
    String str = "";
    if (paramAXNode.name != null && paramAXNode.name.value != null)
      str = paramAXNode.name.value.ZP().ZW().strip(); 
    if (!str.isBlank())
      return str; 
    List<AXNode> list = Zj(paramZk, paramAXNode);
    return list.stream().map(paramZk::lambda$getTextFor$4).map(String::strip).filter(Zx7::lambda$getTextFor$5).collect(Collectors.joining(" "));
  }
  
  private static Optional<Zjn> ZC(Zk paramZk, DOMNode paramDOMNode) {
    AXNode aXNode = paramZk.ZA(paramDOMNode.backendNodeId);
    if (aXNode == null)
      return Optional.empty(); 
    String str = ZN(paramZk, aXNode);
    return str.isBlank() ? Optional.empty() : Optional.of(new Zjn(Zc4.INNER_TEXT, str, true));
  }
  
  private static Map<String, List<String>> ZQ(Zn paramZn, DOMNode paramDOMNode, Zm4 paramZm4) throws Zi, InterruptedException {
    // Byte code:
    //   0: invokestatic ZT : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_1
    //   5: getfield eventListeners : Ljava/util/List;
    //   8: ifnull -> 331
    //   11: aload_1
    //   12: getfield eventListeners : Ljava/util/List;
    //   15: invokeinterface isEmpty : ()Z
    //   20: ifne -> 331
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   29: athrow
    //   30: aload_1
    //   31: getfield eventListeners : Ljava/util/List;
    //   34: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   39: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   44: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   49: ifeq -> 331
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   58: athrow
    //   59: new java/util/HashMap
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: astore #4
    //   68: aload_0
    //   69: aload_1
    //   70: aload_2
    //   71: <illegal opcode> Zy : (Lnet/portswigger/devtools/protocol/types/domsnapshot/DOMNode;Lnet/portswigger/devtools/client/impl/Zm4;)Lnet/portswigger/devtools/client/Zs;
    //   76: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   79: invokevirtual Zz : (Lnet/portswigger/devtools/client/Zk;)Ljava/lang/Object;
    //   82: checkcast net/portswigger/devtools/protocol/types/runtime/RemoteObject
    //   85: astore #5
    //   87: aload_0
    //   88: aload_2
    //   89: <illegal opcode> Zy : (Lnet/portswigger/devtools/client/impl/Zm4;)Lnet/portswigger/devtools/client/Zs;
    //   94: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   97: invokevirtual Zz : (Lnet/portswigger/devtools/client/Zk;)Ljava/lang/Object;
    //   100: pop
    //   101: aload_0
    //   102: aload #5
    //   104: <illegal opcode> Zy : (Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;)Lnet/portswigger/devtools/client/Zs;
    //   109: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   112: invokevirtual Zz : (Lnet/portswigger/devtools/client/Zk;)Ljava/lang/Object;
    //   115: checkcast java/util/List
    //   118: astore #6
    //   120: aload #6
    //   122: invokeinterface iterator : ()Ljava/util/Iterator;
    //   127: astore #7
    //   129: aload #7
    //   131: invokeinterface hasNext : ()Z
    //   136: ifeq -> 315
    //   139: aload #7
    //   141: invokeinterface next : ()Ljava/lang/Object;
    //   146: checkcast net/portswigger/devtools/protocol/types/domdebugger/EventListener
    //   149: astore #8
    //   151: aload #8
    //   153: getfield handler : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   156: ifnull -> 311
    //   159: sipush #-5471
    //   162: sipush #-29272
    //   165: invokestatic a : (II)Ljava/lang/String;
    //   168: aload #8
    //   170: getfield type : Ljava/lang/String;
    //   173: invokevirtual equals : (Ljava/lang/Object;)Z
    //   176: ifeq -> 311
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   185: athrow
    //   186: aload_0
    //   187: aload #8
    //   189: aload_2
    //   190: <illegal opcode> Zy : (Lnet/portswigger/devtools/protocol/types/domdebugger/EventListener;Lnet/portswigger/devtools/client/impl/Zm4;)Lnet/portswigger/devtools/client/Zs;
    //   195: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   198: invokevirtual Zz : (Lnet/portswigger/devtools/client/Zk;)Ljava/lang/Object;
    //   201: checkcast net/portswigger/devtools/protocol/types/runtime/CallFunctionOn
    //   204: astore #9
    //   206: aload #9
    //   208: getfield result : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   211: ifnull -> 311
    //   214: aload #9
    //   216: getfield result : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   219: getfield value : Lnet/portswigger/Zi7;
    //   222: ifnull -> 311
    //   225: goto -> 232
    //   228: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   231: athrow
    //   232: aload #9
    //   234: getfield result : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   237: getfield value : Lnet/portswigger/Zi7;
    //   240: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   245: invokeinterface Zr : ()Z
    //   250: ifeq -> 311
    //   253: goto -> 260
    //   256: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   259: athrow
    //   260: aload #4
    //   262: aload #8
    //   264: getfield type : Ljava/lang/String;
    //   267: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   272: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   277: checkcast java/util/List
    //   280: aload #9
    //   282: getfield result : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   285: getfield value : Lnet/portswigger/Zi7;
    //   288: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   293: invokeinterface ZW : ()Ljava/lang/String;
    //   298: invokeinterface add : (Ljava/lang/Object;)Z
    //   303: pop
    //   304: goto -> 311
    //   307: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   310: athrow
    //   311: aload_3
    //   312: ifnull -> 129
    //   315: goto -> 328
    //   318: astore #5
    //   320: aload #5
    //   322: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   325: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   328: aload #4
    //   330: areturn
    //   331: invokestatic emptyMap : ()Ljava/util/Map;
    //   334: areturn
    // Exception table:
    //   from	to	target	type
    //   4	23	26	net/portswigger/devtools/client/Zt
    //   11	52	55	net/portswigger/devtools/client/Zt
    //   68	315	318	net/portswigger/devtools/client/Zt
    //   151	179	182	net/portswigger/devtools/client/Zt
    //   206	225	228	net/portswigger/devtools/client/Zt
    //   214	253	256	net/portswigger/devtools/client/Zt
    //   232	304	307	net/portswigger/devtools/client/Zt
  }
  
  private static Map<String, List<String>> ZA(DOMNode paramDOMNode) {
    String str = ZT();
    if (paramDOMNode.eventListeners != null && !paramDOMNode.eventListeners.isEmpty()) {
      HashMap<Object, Object> hashMap = new HashMap<>();
      for (EventListener eventListener : paramDOMNode.eventListeners) {
        ((List<String>)hashMap.computeIfAbsent(eventListener.type, Zx7::lambda$findEventListenerPositions$12)).add("" + eventListener.lineNumber + ";" + eventListener.lineNumber);
        if (str != null)
          break; 
      } 
    } 
    return Collections.emptyMap();
  }
  
  private static List<Integer> ZA(Zn paramZn, DOMNode paramDOMNode, Zm4 paramZm4) throws Zi, InterruptedException {
    // Byte code:
    //   0: invokestatic ZT : ()Ljava/lang/String;
    //   3: astore_3
    //   4: getstatic net/portswigger/devtools/client/impl/Zx7.Z_ : Ljava/util/Set;
    //   7: aload_1
    //   8: getfield nodeName : Ljava/lang/String;
    //   11: invokeinterface contains : (Ljava/lang/Object;)Z
    //   16: ifne -> 27
    //   19: invokestatic emptyList : ()Ljava/util/List;
    //   22: areturn
    //   23: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   26: athrow
    //   27: new java/util/LinkedList
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: astore #4
    //   36: aload_0
    //   37: aload_1
    //   38: aload_2
    //   39: <illegal opcode> Zy : (Lnet/portswigger/devtools/protocol/types/domsnapshot/DOMNode;Lnet/portswigger/devtools/client/impl/Zm4;)Lnet/portswigger/devtools/client/Zs;
    //   44: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   47: invokevirtual Zz : (Lnet/portswigger/devtools/client/Zk;)Ljava/lang/Object;
    //   50: checkcast net/portswigger/devtools/protocol/types/runtime/RemoteObject
    //   53: astore #5
    //   55: aload_0
    //   56: aload #5
    //   58: aload_2
    //   59: <illegal opcode> Zy : (Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;Lnet/portswigger/devtools/client/impl/Zm4;)Lnet/portswigger/devtools/client/Zs;
    //   64: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   67: invokevirtual Zz : (Lnet/portswigger/devtools/client/Zk;)Ljava/lang/Object;
    //   70: checkcast net/portswigger/devtools/protocol/types/runtime/CallFunctionOn
    //   73: astore #6
    //   75: aload #6
    //   77: getfield result : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   80: ifnull -> 331
    //   83: aload #6
    //   85: getfield result : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   88: getfield type : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObjectType;
    //   91: getstatic net/portswigger/devtools/protocol/types/runtime/RemoteObjectType.UNDEFINED : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObjectType;
    //   94: if_acmpeq -> 331
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   103: athrow
    //   104: aload #6
    //   106: getfield result : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   109: getfield preview : Lnet/portswigger/devtools/protocol/types/runtime/ObjectPreview;
    //   112: ifnull -> 331
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   121: athrow
    //   122: aload #6
    //   124: getfield result : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   127: getfield preview : Lnet/portswigger/devtools/protocol/types/runtime/ObjectPreview;
    //   130: getfield properties : Ljava/util/List;
    //   133: ifnull -> 331
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   142: athrow
    //   143: aload #6
    //   145: getfield result : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   148: getfield preview : Lnet/portswigger/devtools/protocol/types/runtime/ObjectPreview;
    //   151: getfield properties : Ljava/util/List;
    //   154: invokeinterface isEmpty : ()Z
    //   159: ifne -> 331
    //   162: goto -> 169
    //   165: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   168: athrow
    //   169: aload #6
    //   171: getfield result : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   174: getfield preview : Lnet/portswigger/devtools/protocol/types/runtime/ObjectPreview;
    //   177: getfield properties : Ljava/util/List;
    //   180: invokeinterface size : ()I
    //   185: istore #7
    //   187: iconst_0
    //   188: istore #8
    //   190: iload #8
    //   192: iload #7
    //   194: if_icmpge -> 331
    //   197: iload #8
    //   199: istore #9
    //   201: aload_0
    //   202: iload #9
    //   204: aload #6
    //   206: aload_2
    //   207: <illegal opcode> Zy : (ILnet/portswigger/devtools/protocol/types/runtime/CallFunctionOn;Lnet/portswigger/devtools/client/impl/Zm4;)Lnet/portswigger/devtools/client/Zs;
    //   212: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   215: invokevirtual Zz : (Lnet/portswigger/devtools/client/Zk;)Ljava/lang/Object;
    //   218: checkcast net/portswigger/devtools/protocol/types/runtime/CallFunctionOn
    //   221: astore #10
    //   223: aload #10
    //   225: getfield result : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   228: ifnull -> 324
    //   231: aload #10
    //   233: getfield result : Lnet/portswigger/devtools/protocol/types/runtime/RemoteObject;
    //   236: getfield objectId : Ljava/lang/String;
    //   239: ifnull -> 324
    //   242: goto -> 249
    //   245: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   248: athrow
    //   249: aload_0
    //   250: aload #10
    //   252: <illegal opcode> Zy : (Lnet/portswigger/devtools/protocol/types/runtime/CallFunctionOn;)Lnet/portswigger/devtools/client/Zs;
    //   257: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   260: invokevirtual Zz : (Lnet/portswigger/devtools/client/Zk;)Ljava/lang/Object;
    //   263: checkcast net/portswigger/devtools/protocol/types/dom/Node
    //   266: astore #11
    //   268: sipush #-5456
    //   271: sipush #24508
    //   274: invokestatic a : (II)Ljava/lang/String;
    //   277: aload #11
    //   279: getfield nodeName : Ljava/lang/String;
    //   282: invokevirtual equals : (Ljava/lang/Object;)Z
    //   285: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   288: aload #11
    //   290: getfield nodeName : Ljava/lang/String;
    //   293: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   296: aload #11
    //   298: getfield backendNodeId : Ljava/lang/Integer;
    //   301: ifnull -> 324
    //   304: aload #4
    //   306: aload #11
    //   308: getfield backendNodeId : Ljava/lang/Integer;
    //   311: invokeinterface add : (Ljava/lang/Object;)Z
    //   316: pop
    //   317: goto -> 324
    //   320: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   323: athrow
    //   324: iinc #8, 1
    //   327: aload_3
    //   328: ifnull -> 190
    //   331: goto -> 344
    //   334: astore #5
    //   336: aload #5
    //   338: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   341: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   344: aload #4
    //   346: areturn
    // Exception table:
    //   from	to	target	type
    //   4	23	23	net/portswigger/devtools/client/Zt
    //   36	331	334	net/portswigger/devtools/client/Zt
    //   75	97	100	net/portswigger/devtools/client/Zt
    //   83	115	118	net/portswigger/devtools/client/Zt
    //   104	136	139	net/portswigger/devtools/client/Zt
    //   122	162	165	net/portswigger/devtools/client/Zt
    //   223	242	245	net/portswigger/devtools/client/Zt
    //   268	317	320	net/portswigger/devtools/client/Zt
  }
  
  private static Map<String, String> Zu(DOMNode paramDOMNode) {
    return (Map<String, String>)((List)Optional.<List>ofNullable(paramDOMNode.attributes).orElseGet(Collections::emptyList)).stream().collect(Collectors.toMap(Zx7::lambda$getElementAttributes$17, Zx7::lambda$getElementAttributes$18, Zx7::lambda$getElementAttributes$19));
  }
  
  private static boolean ZI(LayoutTreeNode paramLayoutTreeNode, Ze6 paramZe6) {
    return paramZe6.ZB() ? true : ((paramLayoutTreeNode != null && paramLayoutTreeNode.boundingBox != null && paramLayoutTreeNode.boundingBox.height.doubleValue() != 0.0D && paramLayoutTreeNode.boundingBox.width.doubleValue() != 0.0D));
  }
  
  private static Optional<Zjn> ZX(String paramString1, String paramString2, Map<String, String> paramMap) {
    if (a(-5447, -13481).equalsIgnoreCase(paramString1))
      return Zw(Zc4.INNER_TEXT, paramString2); 
    if (a(-5464, 25325).equalsIgnoreCase(paramString1) || (a(-5441, -23214).equalsIgnoreCase(paramString1) && a(-5452, -7049).equalsIgnoreCase(paramMap.get(a(-5454, 1454)))))
      return Zw(Zc4.ALT_TEXT, paramMap.get(a(-5457, 14984))).or(paramMap::lambda$getElementText$20); 
    if (a(-5441, -23214).equalsIgnoreCase(paramString1)) {
      if (paramMap.containsKey(a(-5448, 22794)))
        return Zw(Zc4.VALUE_ATTRIBUTE, paramMap.get(a(-5469, 27122))); 
      if (a(-5472, -4885).equalsIgnoreCase(paramMap.get(a(-5445, 6298))))
        return Zw(Zc4.IMPLICIT, a(-5451, 22961)); 
    } 
    return Optional.empty();
  }
  
  private static Optional<Zjn> Zw(Zc4 paramZc4, String paramString) {
    return Optional.<String>ofNullable(paramString).map(String::trim).filter(Zlz::Zr).map(paramZc4::lambda$formatElementText$21);
  }
  
  public Optional<String> Zr() {
    return Optional.ofNullable(this.Zs);
  }
  
  public Optional<String> ZX() {
    return Optional.ofNullable(this.ZJ);
  }
  
  public Optional<String> ZS() {
    return Optional.ofNullable(this.ZZ);
  }
  
  public Optional<String> Zo() {
    return Optional.ofNullable(this.Zr);
  }
  
  public Optional<String> Zh() {
    return Optional.ofNullable(this.ZP);
  }
  
  public Optional<Zt3> Zz() {
    return Optional.ofNullable(this.ZB);
  }
  
  private static Zjn lambda$formatElementText$21(Zc4 paramZc4, String paramString) {
    return new Zjn(paramZc4, paramString, false);
  }
  
  private static Optional lambda$getElementText$20(Map paramMap) {
    return Zw(Zc4.IMG_SRC, (String)paramMap.get(a(-5460, -882)));
  }
  
  private static String lambda$getElementAttributes$19(String paramString1, String paramString2) {
    return paramString1;
  }
  
  private static String lambda$getElementAttributes$18(NameValue paramNameValue) {
    return paramNameValue.value;
  }
  
  private static String lambda$getElementAttributes$17(NameValue paramNameValue) {
    return paramNameValue.name.toLowerCase();
  }
  
  private static CompletableFuture lambda$getDisplayElementIds$16(CallFunctionOn paramCallFunctionOn, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().describeNode(null, null, paramCallFunctionOn.result.objectId, null, null);
  }
  
  private static CompletableFuture lambda$getDisplayElementIds$15(int paramInt, CallFunctionOn paramCallFunctionOn, Zm4 paramZm4, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getRuntime().callFunctionOn(a(-5462, -31206) + a(-5462, -31206) + paramInt, paramCallFunctionOn.result.objectId, new ArrayList(), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), null, paramZm4.ZR(), Boolean.valueOf(false), null, null);
  }
  
  private static CompletableFuture lambda$getDisplayElementIds$14(RemoteObject paramRemoteObject, Zm4 paramZm4, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getRuntime().callFunctionOn(a(-5465, 31196), paramRemoteObject.objectId, new ArrayList(), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), null, paramZm4.ZR(), Boolean.valueOf(false), null, null);
  }
  
  private static CompletableFuture lambda$getDisplayElementIds$13(DOMNode paramDOMNode, Zm4 paramZm4, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().resolveNode(null, paramDOMNode.backendNodeId, paramZm4.ZR(), null);
  }
  
  private static List lambda$findEventListenerPositions$12(String paramString) {
    return new LinkedList();
  }
  
  private static List lambda$findEventListenerNames$11(String paramString) {
    return new LinkedList();
  }
  
  private static CompletableFuture lambda$findEventListenerNames$10(EventListener paramEventListener, Zm4 paramZm4, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getRuntime().callFunctionOn(a(-5463, -15488), paramEventListener.handler.objectId, new ArrayList(), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), null, paramZm4.ZR(), Boolean.valueOf(false), null, null);
  }
  
  private static CompletableFuture lambda$findEventListenerNames$9(RemoteObject paramRemoteObject, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOMDebugger().getEventListeners(paramRemoteObject.objectId);
  }
  
  private static CompletableFuture lambda$findEventListenerNames$8(Zm4 paramZm4, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getRuntime().evaluate(a(-5470, -14162), paramZm4.ZR(), Boolean.valueOf(false), Boolean.valueOf(false), null, Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), null, Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), null, null);
  }
  
  private static CompletableFuture lambda$findEventListenerNames$7(DOMNode paramDOMNode, Zm4 paramZm4, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().resolveNode(null, paramDOMNode.backendNodeId, paramZm4.ZR(), null);
  }
  
  private static boolean lambda$findEventListenerNames$6(EventListener paramEventListener) {
    return a(-5459, 10072).equals(paramEventListener.type);
  }
  
  private static boolean lambda$getTextFor$5(String paramString) {
    return !paramString.isBlank();
  }
  
  private static String lambda$getTextFor$4(Zk paramZk, AXNode paramAXNode) {
    return ZN(paramZk, paramAXNode);
  }
  
  private static CompletableFuture lambda$findHtmlFeatures$3(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getAccessibility().getFullAXTree();
  }
  
  private static CompletableFuture lambda$findHtmlFeatures$2(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOMSnapshot().getSnapshot(new ArrayList(), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false));
  }
  
  private static CompletableFuture lambda$getCurrentPageMimeType$1(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getPage().getFrameTree();
  }
  
  private static CompletableFuture lambda$snapshot$0(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getPage().getNavigationHistory();
  }
  
  static {
    // Byte code:
    //   0: bipush #31
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: aconst_null
    //   10: ldc 'þ)«z{¸ÐÿÏL%gð¥9EFv5<³Ù=1Ã^©\\b?\\r3ÁÃ{9B;q%ã¿­@gË!HR3Kºø:¶88_t©RâÊ{(^s/&zV*®è)G4HK³Hº´Ãòÿ¤oº¿´~Sï?{½òr¤l&P»é"¡1\\b@¥O2ªcs¦süvûc6Kâæðá!X£ñ°@r8ûÊ6yD,ÚÉPÉf'Ò)ö*ðÎÇðê\\rVÚH¾>Qµ\\rÄ ;"'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic Zw : (Ljava/lang/String;)V
    //   22: iconst_5
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #112
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
    //   71: ldc '¸óÒë)\\f8.g¸}ÛÅpTµw<ÿ{Ö¼+ÃÒ²\\fÔÒIAÓ'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #8
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #43
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
    //   132: putstatic net/portswigger/devtools/client/impl/Zx7.a : [Ljava/lang/String;
    //   135: bipush #31
    //   137: anewarray java/lang/String
    //   140: putstatic net/portswigger/devtools/client/impl/Zx7.b : [Ljava/lang/String;
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
    //   216: bipush #32
    //   218: goto -> 248
    //   221: bipush #44
    //   223: goto -> 248
    //   226: bipush #44
    //   228: goto -> 248
    //   231: bipush #38
    //   233: goto -> 248
    //   236: bipush #72
    //   238: goto -> 248
    //   241: bipush #113
    //   243: goto -> 248
    //   246: bipush #30
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
    //   304: sipush #-5455
    //   307: sipush #27948
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: sipush #-5444
    //   316: sipush #32116
    //   319: invokestatic a : (II)Ljava/lang/String;
    //   322: sipush #-5461
    //   325: sipush #28741
    //   328: invokestatic a : (II)Ljava/lang/String;
    //   331: sipush #-5450
    //   334: sipush #22823
    //   337: invokestatic a : (II)Ljava/lang/String;
    //   340: sipush #-5468
    //   343: sipush #13188
    //   346: invokestatic a : (II)Ljava/lang/String;
    //   349: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;
    //   352: putstatic net/portswigger/devtools/client/impl/Zx7.Z_ : Ljava/util/Set;
    //   355: sipush #-5441
    //   358: sipush #-23214
    //   361: invokestatic a : (II)Ljava/lang/String;
    //   364: sipush #-5442
    //   367: sipush #-14932
    //   370: invokestatic a : (II)Ljava/lang/String;
    //   373: sipush #-5453
    //   376: sipush #-891
    //   379: invokestatic a : (II)Ljava/lang/String;
    //   382: sipush #-5467
    //   385: sipush #19427
    //   388: invokestatic a : (II)Ljava/lang/String;
    //   391: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;
    //   394: putstatic net/portswigger/devtools/client/impl/Zx7.Zd : Ljava/util/Set;
    //   397: return
  }
  
  public static void Zw(String paramString) {
    ZY = paramString;
  }
  
  public static String ZT() {
    return ZY;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFEAB9) & 0xFFFF;
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
      byte b1 = 77;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zx7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */