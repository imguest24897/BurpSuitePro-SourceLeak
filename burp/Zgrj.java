package burp;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class Zgrj extends MouseAdapter implements TreeSelectionListener, KeyListener, Zzyl {
  private final Component Zt;
  
  private final Zs0g Zf;
  
  private final Zz1m<Zt1_> Zp;
  
  private final Ztwv Zv;
  
  private final Zg6q Ze;
  
  private final Zrhs ZK;
  
  private Zrdb ZI;
  
  private DefaultMutableTreeNode Zj;
  
  private final Zor ZG;
  
  private final DefaultTreeModel ZS;
  
  private final DefaultMutableTreeNode Zl;
  
  private final Zzq6 ZV;
  
  private final Map<Object, Zpg> ZT;
  
  private Zmzk Zz;
  
  private final Object Zg;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zgrj(Component paramComponent, Zerg paramZerg, Zs0g paramZs0g, Zg6q paramZg6q, Zrhs paramZrhs, Zz1m<Zt1_> paramZz1m, Ztwv paramZtwv, Zkl6 paramZkl6, Zm6x paramZm6x) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield Zt : Ljava/awt/Component;
    //   9: aload_0
    //   10: aload_3
    //   11: putfield Zf : Lburp/Zs0g;
    //   14: aload_0
    //   15: aload #4
    //   17: putfield Ze : Lburp/Zg6q;
    //   20: invokestatic ZL : ()[Lburp/Zbqc;
    //   23: aload_0
    //   24: aload #5
    //   26: putfield ZK : Lburp/Zrhs;
    //   29: aload_0
    //   30: aload #6
    //   32: putfield Zp : Lburp/Zz1m;
    //   35: aload_0
    //   36: aload #7
    //   38: putfield Zv : Lburp/Ztwv;
    //   41: aload_0
    //   42: new java/util/HashMap
    //   45: dup
    //   46: invokespecial <init> : ()V
    //   49: putfield ZT : Ljava/util/Map;
    //   52: astore #10
    //   54: aload_0
    //   55: new javax/swing/tree/DefaultMutableTreeNode
    //   58: dup
    //   59: ldc ''
    //   61: invokespecial <init> : (Ljava/lang/Object;)V
    //   64: putfield Zl : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   67: aload_0
    //   68: new javax/swing/tree/DefaultTreeModel
    //   71: dup
    //   72: aload_0
    //   73: getfield Zl : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   76: invokespecial <init> : (Ljavax/swing/tree/TreeNode;)V
    //   79: putfield ZS : Ljavax/swing/tree/DefaultTreeModel;
    //   82: aload_0
    //   83: new burp/Zor
    //   86: dup
    //   87: aload_0
    //   88: getfield ZS : Ljavax/swing/tree/DefaultTreeModel;
    //   91: invokespecial <init> : (Ljavax/swing/tree/TreeModel;)V
    //   94: putfield ZG : Lburp/Zor;
    //   97: aload_0
    //   98: getfield ZG : Lburp/Zor;
    //   101: sipush #-14953
    //   104: sipush #14214
    //   107: invokestatic a : (II)Ljava/lang/String;
    //   110: invokevirtual setName : (Ljava/lang/String;)V
    //   113: aload_0
    //   114: getfield ZG : Lburp/Zor;
    //   117: aload_0
    //   118: invokevirtual Zu : (Lburp/Zzyl;)V
    //   121: aload_0
    //   122: getfield ZG : Lburp/Zor;
    //   125: invokevirtual getSelectionModel : ()Ljavax/swing/tree/TreeSelectionModel;
    //   128: iconst_4
    //   129: invokeinterface setSelectionMode : (I)V
    //   134: aload_0
    //   135: getfield ZG : Lburp/Zor;
    //   138: new burp/Zet1
    //   141: dup
    //   142: aload #4
    //   144: invokeinterface Zy : ()Lburp/Zxgq;
    //   149: getfield allowContextMenuAndHotkeyActions : Z
    //   152: invokespecial <init> : (Z)V
    //   155: invokevirtual setCellRenderer : (Ljavax/swing/tree/TreeCellRenderer;)V
    //   158: aload_0
    //   159: getfield ZG : Lburp/Zor;
    //   162: aload_0
    //   163: invokevirtual addTreeSelectionListener : (Ljavax/swing/event/TreeSelectionListener;)V
    //   166: invokestatic ZG : ()Z
    //   169: ifne -> 256
    //   172: aload #4
    //   174: invokeinterface Zy : ()Lburp/Zxgq;
    //   179: getfield allowContextMenuAndHotkeyActions : Z
    //   182: ifeq -> 225
    //   185: aload_0
    //   186: new burp/Zzq6
    //   189: dup
    //   190: aload_0
    //   191: aload #4
    //   193: aload_2
    //   194: aload_1
    //   195: aload #8
    //   197: invokeinterface ZB : ()Lburp/Zbnt;
    //   202: aload #8
    //   204: aload #9
    //   206: invokespecial <init> : (Lburp/Zgrj;Lburp/Zg6q;Lburp/Zerg;Ljava/awt/Component;Lburp/Zbnt;Lburp/Zkl6;Lburp/Zm6x;)V
    //   209: putfield ZV : Lburp/Zzq6;
    //   212: aload_0
    //   213: getfield ZG : Lburp/Zor;
    //   216: aload_0
    //   217: invokevirtual addMouseListener : (Ljava/awt/event/MouseListener;)V
    //   220: aload #10
    //   222: ifnonnull -> 230
    //   225: aload_0
    //   226: aconst_null
    //   227: putfield ZV : Lburp/Zzq6;
    //   230: aload #4
    //   232: invokeinterface Zy : ()Lburp/Zxgq;
    //   237: getfield allowDelete : Z
    //   240: ifeq -> 261
    //   243: aload_0
    //   244: getfield ZG : Lburp/Zor;
    //   247: aload_0
    //   248: invokevirtual addKeyListener : (Ljava/awt/event/KeyListener;)V
    //   251: aload #10
    //   253: ifnonnull -> 261
    //   256: aload_0
    //   257: aconst_null
    //   258: putfield ZV : Lburp/Zzq6;
    //   261: aload_0
    //   262: new java/lang/Object
    //   265: dup
    //   266: invokespecial <init> : ()V
    //   269: putfield Zg : Ljava/lang/Object;
    //   272: return
  }
  
  private Zpg Zb(Zrdb paramZrdb) {
    Object object = Zv(paramZrdb);
    Zpg zpg = this.ZT.get(object);
    if (zpg == null) {
      zpg = new Zpg(Zrf1.Za, this.ZS, (this.Zz != null), (this.Ze.Zy()).allowContextMenuAndHotkeyActions);
      this.ZT.put(object, zpg);
    } 
    return zpg;
  }
  
  private Zpg Zt(Zrdb paramZrdb) {
    Object object = Zv(paramZrdb);
    return this.ZT.get(object);
  }
  
  private Object Zv(Zrdb paramZrdb) {
    return paramZrdb.Za6().ZH() ? (new Zew8(paramZrdb)).ZZV() : paramZrdb.Za6();
  }
  
  void ZS(Collection<Zrdb> paramCollection, Zbfx paramZbfx) {
    // Byte code:
    //   0: invokestatic ZL : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield Zg : Ljava/lang/Object;
    //   8: dup
    //   9: astore #4
    //   11: monitorenter
    //   12: aload_0
    //   13: aconst_null
    //   14: putfield Zz : Lburp/Zmzk;
    //   17: iconst_1
    //   18: istore #5
    //   20: aload_1
    //   21: invokeinterface iterator : ()Ljava/util/Iterator;
    //   26: astore #6
    //   28: aload #6
    //   30: invokeinterface hasNext : ()Z
    //   35: ifeq -> 118
    //   38: aload #6
    //   40: invokeinterface next : ()Ljava/lang/Object;
    //   45: checkcast burp/Zrdb
    //   48: astore #7
    //   50: aload_2
    //   51: invokeinterface Zz : ()Z
    //   56: ifeq -> 63
    //   59: aload #4
    //   61: monitorexit
    //   62: return
    //   63: iload #5
    //   65: ifeq -> 86
    //   68: aload_0
    //   69: aload #7
    //   71: invokeinterface ZaB : ()Lburp/Zmzk;
    //   76: putfield Zz : Lburp/Zmzk;
    //   79: iconst_0
    //   80: istore #5
    //   82: aload_3
    //   83: ifnonnull -> 114
    //   86: aload_0
    //   87: getfield Zz : Lburp/Zmzk;
    //   90: aload #7
    //   92: invokeinterface ZaB : ()Lburp/Zmzk;
    //   97: invokeinterface ZF : (Ljava/lang/Object;)Z
    //   102: ifne -> 114
    //   105: aload_0
    //   106: aconst_null
    //   107: putfield Zz : Lburp/Zmzk;
    //   110: aload_3
    //   111: ifnonnull -> 118
    //   114: aload_3
    //   115: ifnonnull -> 28
    //   118: aload_0
    //   119: getfield ZT : Ljava/util/Map;
    //   122: invokeinterface clear : ()V
    //   127: aload_0
    //   128: getfield Zl : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   131: invokevirtual removeAllChildren : ()V
    //   134: aload_1
    //   135: invokeinterface iterator : ()Ljava/util/Iterator;
    //   140: astore #6
    //   142: aload #6
    //   144: invokeinterface hasNext : ()Z
    //   149: ifeq -> 183
    //   152: aload #6
    //   154: invokeinterface next : ()Ljava/lang/Object;
    //   159: checkcast burp/Zrdb
    //   162: astore #7
    //   164: aload_0
    //   165: aload #7
    //   167: invokevirtual Zb : (Lburp/Zrdb;)Lburp/Zpg;
    //   170: astore #8
    //   172: aload #8
    //   174: aload #7
    //   176: invokevirtual ZW : (Lburp/Zrdb;)V
    //   179: aload_3
    //   180: ifnonnull -> 142
    //   183: aload_0
    //   184: getfield ZT : Ljava/util/Map;
    //   187: invokeinterface values : ()Ljava/util/Collection;
    //   192: invokeinterface iterator : ()Ljava/util/Iterator;
    //   197: astore #6
    //   199: aload #6
    //   201: invokeinterface hasNext : ()Z
    //   206: ifeq -> 230
    //   209: aload #6
    //   211: invokeinterface next : ()Ljava/lang/Object;
    //   216: checkcast burp/Zpg
    //   219: astore #7
    //   221: aload #7
    //   223: invokevirtual ZZ : ()V
    //   226: aload_3
    //   227: ifnonnull -> 199
    //   230: aload_0
    //   231: getfield ZT : Ljava/util/Map;
    //   234: invokeinterface values : ()Ljava/util/Collection;
    //   239: invokeinterface iterator : ()Ljava/util/Iterator;
    //   244: astore #6
    //   246: aload #6
    //   248: invokeinterface hasNext : ()Z
    //   253: ifeq -> 291
    //   256: aload #6
    //   258: invokeinterface next : ()Ljava/lang/Object;
    //   263: checkcast burp/Zpg
    //   266: astore #7
    //   268: aload_2
    //   269: invokeinterface Zz : ()Z
    //   274: ifeq -> 281
    //   277: aload #4
    //   279: monitorexit
    //   280: return
    //   281: aload_0
    //   282: aload #7
    //   284: invokevirtual ZI : (Lburp/Zpg;)V
    //   287: aload_3
    //   288: ifnonnull -> 246
    //   291: aload_0
    //   292: getfield ZS : Ljavax/swing/tree/DefaultTreeModel;
    //   295: aload_0
    //   296: getfield Zl : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   299: invokevirtual nodeStructureChanged : (Ljavax/swing/tree/TreeNode;)V
    //   302: aload_1
    //   303: invokeinterface isEmpty : ()Z
    //   308: ifne -> 324
    //   311: aload_0
    //   312: getfield ZG : Lburp/Zor;
    //   315: iconst_0
    //   316: iconst_0
    //   317: invokevirtual setSelectionInterval : (II)V
    //   320: aload_3
    //   321: ifnonnull -> 336
    //   324: aload_0
    //   325: getfield Zp : Lburp/Zz1m;
    //   328: invokestatic Zv : ()Lburp/Zxr8;
    //   331: invokeinterface ZD : (Lburp/Zxr8;)V
    //   336: aload_0
    //   337: <illegal opcode> run : (Lburp/Zgrj;)Ljava/lang/Runnable;
    //   342: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   345: aload #4
    //   347: monitorexit
    //   348: goto -> 359
    //   351: astore #9
    //   353: aload #4
    //   355: monitorexit
    //   356: aload #9
    //   358: athrow
    //   359: return
    // Exception table:
    //   from	to	target	type
    //   12	62	351	finally
    //   63	280	351	finally
    //   281	348	351	finally
    //   351	356	351	finally
  }
  
  void Zj(Collection<Zrdb> paramCollection) {
    Zbqc[] arrayOfZbqc = Zxaf.ZL();
    synchronized (this.Zg) {
      for (Zrdb zrdb : paramCollection) {
        Zpg zpg = Zt(zrdb);
        if (zpg != null) {
          zpg.Zs(zrdb);
          if (zrdb.equals(this.ZI)) {
            this.ZI = zpg;
            this.Zj = zpg.Zi();
          } 
        } 
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
  }
  
  void ZH(Collection<Zrdb> paramCollection) {
    // Byte code:
    //   0: invokestatic ZL : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zg : Ljava/lang/Object;
    //   8: dup
    //   9: astore_3
    //   10: monitorenter
    //   11: aload_1
    //   12: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   17: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   22: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   27: invokeinterface toList : ()Ljava/util/List;
    //   32: astore #4
    //   34: aload #4
    //   36: invokeinterface size : ()I
    //   41: aload_1
    //   42: invokeinterface size : ()I
    //   47: if_icmpne -> 54
    //   50: iconst_1
    //   51: goto -> 55
    //   54: iconst_0
    //   55: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   58: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   61: aload #4
    //   63: astore_1
    //   64: aload_0
    //   65: getfield Zl : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   68: invokevirtual getChildCount : ()I
    //   71: ifne -> 85
    //   74: aload_0
    //   75: aload_1
    //   76: getstatic burp/Zbfx.Zd : Lburp/Zbfx;
    //   79: invokevirtual ZS : (Ljava/util/Collection;Lburp/Zbfx;)V
    //   82: aload_3
    //   83: monitorexit
    //   84: return
    //   85: new java/util/HashSet
    //   88: dup
    //   89: invokespecial <init> : ()V
    //   92: astore #5
    //   94: new java/util/HashSet
    //   97: dup
    //   98: invokespecial <init> : ()V
    //   101: astore #6
    //   103: aconst_null
    //   104: astore #7
    //   106: aload_1
    //   107: invokeinterface iterator : ()Ljava/util/Iterator;
    //   112: astore #8
    //   114: aload #8
    //   116: invokeinterface hasNext : ()Z
    //   121: ifeq -> 225
    //   124: aload #8
    //   126: invokeinterface next : ()Ljava/lang/Object;
    //   131: checkcast burp/Zrdb
    //   134: astore #9
    //   136: aload_0
    //   137: aload #9
    //   139: invokevirtual Zt : (Lburp/Zrdb;)Lburp/Zpg;
    //   142: astore #10
    //   144: aload #10
    //   146: ifnonnull -> 171
    //   149: aload_0
    //   150: aload #9
    //   152: invokevirtual Zb : (Lburp/Zrdb;)Lburp/Zpg;
    //   155: astore #10
    //   157: aload #6
    //   159: aload #10
    //   161: invokeinterface add : (Ljava/lang/Object;)Z
    //   166: pop
    //   167: aload_2
    //   168: ifnonnull -> 214
    //   171: aload #5
    //   173: aload #10
    //   175: invokeinterface add : (Ljava/lang/Object;)Z
    //   180: pop
    //   181: aload #10
    //   183: aload_0
    //   184: getfield ZI : Lburp/Zrdb;
    //   187: invokevirtual equals : (Ljava/lang/Object;)Z
    //   190: ifne -> 210
    //   193: aload #10
    //   195: invokevirtual ZX : ()Lburp/Zrdb;
    //   198: aload_0
    //   199: getfield ZI : Lburp/Zrdb;
    //   202: invokeinterface equals : (Ljava/lang/Object;)Z
    //   207: ifeq -> 214
    //   210: aload #10
    //   212: astore #7
    //   214: aload #10
    //   216: aload #9
    //   218: invokevirtual ZN : (Lburp/Zrdb;)V
    //   221: aload_2
    //   222: ifnonnull -> 114
    //   225: aload #5
    //   227: invokeinterface iterator : ()Ljava/util/Iterator;
    //   232: astore #8
    //   234: aload #8
    //   236: invokeinterface hasNext : ()Z
    //   241: ifeq -> 333
    //   244: aload #8
    //   246: invokeinterface next : ()Ljava/lang/Object;
    //   251: checkcast burp/Zpg
    //   254: astore #9
    //   256: aload_0
    //   257: getfield Zl : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   260: aload #9
    //   262: invokevirtual Zi : ()Ljavax/swing/tree/DefaultMutableTreeNode;
    //   265: invokevirtual getIndex : (Ljavax/swing/tree/TreeNode;)I
    //   268: istore #10
    //   270: iconst_0
    //   271: istore #11
    //   273: iload #11
    //   275: iload #10
    //   277: if_icmpge -> 329
    //   280: aload_0
    //   281: getfield Zl : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   284: iload #11
    //   286: invokevirtual getChildAt : (I)Ljavax/swing/tree/TreeNode;
    //   289: checkcast javax/swing/tree/DefaultMutableTreeNode
    //   292: invokevirtual getUserObject : ()Ljava/lang/Object;
    //   295: checkcast burp/Zpg
    //   298: astore #12
    //   300: aload #9
    //   302: aload #12
    //   304: invokevirtual ZV : (Lburp/Zrdb;)I
    //   307: ifge -> 322
    //   310: aload_0
    //   311: aload #9
    //   313: iload #11
    //   315: invokevirtual ZC : (Lburp/Zpg;I)V
    //   318: aload_2
    //   319: ifnonnull -> 329
    //   322: iinc #11, 1
    //   325: aload_2
    //   326: ifnonnull -> 273
    //   329: aload_2
    //   330: ifnonnull -> 234
    //   333: aload #6
    //   335: invokeinterface iterator : ()Ljava/util/Iterator;
    //   340: astore #8
    //   342: aload #8
    //   344: invokeinterface hasNext : ()Z
    //   349: ifeq -> 374
    //   352: aload #8
    //   354: invokeinterface next : ()Ljava/lang/Object;
    //   359: checkcast burp/Zpg
    //   362: astore #9
    //   364: aload_0
    //   365: aload #9
    //   367: invokevirtual ZI : (Lburp/Zpg;)V
    //   370: aload_2
    //   371: ifnonnull -> 342
    //   374: aload #7
    //   376: ifnull -> 413
    //   379: aload_0
    //   380: aload #7
    //   382: invokevirtual ZX : ()Lburp/Zrdb;
    //   385: putfield ZI : Lburp/Zrdb;
    //   388: aload_0
    //   389: aload #7
    //   391: invokevirtual Zi : ()Ljavax/swing/tree/DefaultMutableTreeNode;
    //   394: putfield Zj : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   397: aload_0
    //   398: getfield Zp : Lburp/Zz1m;
    //   401: aload_0
    //   402: getfield ZI : Lburp/Zrdb;
    //   405: invokestatic Ze : (Lburp/Zrdb;)Lburp/Zxr8;
    //   408: invokeinterface ZD : (Lburp/Zxr8;)V
    //   413: aload_0
    //   414: invokevirtual ZF : ()V
    //   417: aload_0
    //   418: <illegal opcode> run : (Lburp/Zgrj;)Ljava/lang/Runnable;
    //   423: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   426: aload_3
    //   427: monitorexit
    //   428: goto -> 438
    //   431: astore #13
    //   433: aload_3
    //   434: monitorexit
    //   435: aload #13
    //   437: athrow
    //   438: return
    // Exception table:
    //   from	to	target	type
    //   11	84	431	finally
    //   85	428	431	finally
    //   431	435	431	finally
  }
  
  private void ZC(Zpg paramZpg, int paramInt) {
    DefaultMutableTreeNode defaultMutableTreeNode = paramZpg.Zi();
    boolean bool = this.ZG.isExpanded(new TreePath((Object[])defaultMutableTreeNode.getPath()));
    this.ZS.removeNodeFromParent(defaultMutableTreeNode);
    this.ZS.insertNodeInto(defaultMutableTreeNode, this.Zl, paramInt);
    if (bool)
      this.ZG.expandPath(new TreePath((Object[])defaultMutableTreeNode.getPath())); 
  }
  
  private void ZI(Zpg paramZpg) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zl : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   4: invokevirtual getChildCount : ()I
    //   7: istore_3
    //   8: invokestatic ZL : ()[Lburp/Zbqc;
    //   11: iconst_0
    //   12: istore #4
    //   14: astore_2
    //   15: iload #4
    //   17: aload_0
    //   18: getfield Zl : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   21: invokevirtual getChildCount : ()I
    //   24: if_icmpge -> 70
    //   27: aload_0
    //   28: getfield Zl : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   31: iload #4
    //   33: invokevirtual getChildAt : (I)Ljavax/swing/tree/TreeNode;
    //   36: checkcast javax/swing/tree/DefaultMutableTreeNode
    //   39: invokevirtual getUserObject : ()Ljava/lang/Object;
    //   42: checkcast burp/Zpg
    //   45: astore #5
    //   47: aload_1
    //   48: aload #5
    //   50: invokevirtual ZV : (Lburp/Zrdb;)I
    //   53: ifge -> 63
    //   56: iload #4
    //   58: istore_3
    //   59: aload_2
    //   60: ifnonnull -> 70
    //   63: iinc #4, 1
    //   66: aload_2
    //   67: ifnonnull -> 15
    //   70: aload_0
    //   71: getfield ZS : Ljavax/swing/tree/DefaultTreeModel;
    //   74: aload_1
    //   75: invokevirtual Zi : ()Ljavax/swing/tree/DefaultMutableTreeNode;
    //   78: aload_0
    //   79: getfield Zl : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   82: iload_3
    //   83: invokevirtual insertNodeInto : (Ljavax/swing/tree/MutableTreeNode;Ljavax/swing/tree/MutableTreeNode;I)V
    //   86: return
  }
  
  public Component Z_() {
    return this.ZG;
  }
  
  void ZW(Collection<Zrdb> paramCollection) {
    // Byte code:
    //   0: invokestatic ZL : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zg : Ljava/lang/Object;
    //   8: dup
    //   9: astore_3
    //   10: monitorenter
    //   11: aload_1
    //   12: invokeinterface isEmpty : ()Z
    //   17: ifne -> 30
    //   20: aload_0
    //   21: getfield Zl : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   24: invokevirtual getChildCount : ()I
    //   27: ifne -> 33
    //   30: aload_3
    //   31: monitorexit
    //   32: return
    //   33: new java/util/HashSet
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: astore #4
    //   42: new java/util/HashSet
    //   45: dup
    //   46: invokespecial <init> : ()V
    //   49: astore #5
    //   51: aconst_null
    //   52: astore #6
    //   54: aload_1
    //   55: invokeinterface iterator : ()Ljava/util/Iterator;
    //   60: astore #7
    //   62: aload #7
    //   64: invokeinterface hasNext : ()Z
    //   69: ifeq -> 202
    //   72: aload #7
    //   74: invokeinterface next : ()Ljava/lang/Object;
    //   79: checkcast burp/Zrdb
    //   82: astore #8
    //   84: aload_0
    //   85: aload #8
    //   87: invokevirtual Zv : (Lburp/Zrdb;)Ljava/lang/Object;
    //   90: astore #9
    //   92: aload_0
    //   93: getfield ZT : Ljava/util/Map;
    //   96: aload #9
    //   98: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   103: checkcast burp/Zpg
    //   106: astore #10
    //   108: aload #10
    //   110: ifnonnull -> 116
    //   113: goto -> 62
    //   116: aload #10
    //   118: invokevirtual ZX : ()Lburp/Zrdb;
    //   121: aload_0
    //   122: getfield ZI : Lburp/Zrdb;
    //   125: invokeinterface equals : (Ljava/lang/Object;)Z
    //   130: ifeq -> 137
    //   133: aload #10
    //   135: astore #6
    //   137: aload #10
    //   139: aload #8
    //   141: invokevirtual Zs : (Lburp/Zrdb;)V
    //   144: aload #10
    //   146: invokevirtual Zf : ()I
    //   149: ifne -> 188
    //   152: aload_0
    //   153: getfield ZT : Ljava/util/Map;
    //   156: aload #9
    //   158: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   163: pop
    //   164: aload #5
    //   166: aload #10
    //   168: invokeinterface add : (Ljava/lang/Object;)Z
    //   173: pop
    //   174: aload #4
    //   176: aload #10
    //   178: invokeinterface remove : (Ljava/lang/Object;)Z
    //   183: pop
    //   184: aload_2
    //   185: ifnonnull -> 198
    //   188: aload #4
    //   190: aload #10
    //   192: invokeinterface add : (Ljava/lang/Object;)Z
    //   197: pop
    //   198: aload_2
    //   199: ifnonnull -> 62
    //   202: iconst_0
    //   203: istore #7
    //   205: aconst_null
    //   206: astore #8
    //   208: aload #5
    //   210: invokeinterface iterator : ()Ljava/util/Iterator;
    //   215: astore #9
    //   217: aload #9
    //   219: invokeinterface hasNext : ()Z
    //   224: ifeq -> 268
    //   227: aload #9
    //   229: invokeinterface next : ()Ljava/lang/Object;
    //   234: checkcast burp/Zpg
    //   237: astore #10
    //   239: aload_0
    //   240: getfield ZS : Ljavax/swing/tree/DefaultTreeModel;
    //   243: aload #10
    //   245: invokevirtual Zi : ()Ljavax/swing/tree/DefaultMutableTreeNode;
    //   248: invokevirtual removeNodeFromParent : (Ljavax/swing/tree/MutableTreeNode;)V
    //   251: aload #10
    //   253: aload #6
    //   255: invokevirtual equals : (Ljava/lang/Object;)Z
    //   258: ifeq -> 264
    //   261: iconst_1
    //   262: istore #7
    //   264: aload_2
    //   265: ifnonnull -> 217
    //   268: new java/util/HashMap
    //   271: dup
    //   272: invokespecial <init> : ()V
    //   275: astore #9
    //   277: aload #4
    //   279: invokeinterface iterator : ()Ljava/util/Iterator;
    //   284: astore #10
    //   286: aload #10
    //   288: invokeinterface hasNext : ()Z
    //   293: ifeq -> 364
    //   296: aload #10
    //   298: invokeinterface next : ()Ljava/lang/Object;
    //   303: checkcast burp/Zpg
    //   306: astore #11
    //   308: aload #11
    //   310: invokevirtual Zi : ()Ljavax/swing/tree/DefaultMutableTreeNode;
    //   313: astore #12
    //   315: aload_0
    //   316: getfield ZG : Lburp/Zor;
    //   319: new javax/swing/tree/TreePath
    //   322: dup
    //   323: aload #12
    //   325: invokevirtual getPath : ()[Ljavax/swing/tree/TreeNode;
    //   328: invokespecial <init> : ([Ljava/lang/Object;)V
    //   331: invokevirtual isExpanded : (Ljavax/swing/tree/TreePath;)Z
    //   334: istore #13
    //   336: aload #9
    //   338: aload #11
    //   340: iload #13
    //   342: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   345: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   350: pop
    //   351: aload_0
    //   352: getfield ZS : Ljavax/swing/tree/DefaultTreeModel;
    //   355: aload #12
    //   357: invokevirtual removeNodeFromParent : (Ljavax/swing/tree/MutableTreeNode;)V
    //   360: aload_2
    //   361: ifnonnull -> 286
    //   364: aload #4
    //   366: invokeinterface iterator : ()Ljava/util/Iterator;
    //   371: astore #10
    //   373: aload #10
    //   375: invokeinterface hasNext : ()Z
    //   380: ifeq -> 476
    //   383: aload #10
    //   385: invokeinterface next : ()Ljava/lang/Object;
    //   390: checkcast burp/Zpg
    //   393: astore #11
    //   395: aload_0
    //   396: aload #11
    //   398: invokevirtual ZI : (Lburp/Zpg;)V
    //   401: aload #9
    //   403: aload #11
    //   405: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   410: checkcast java/lang/Boolean
    //   413: invokevirtual booleanValue : ()Z
    //   416: ifeq -> 441
    //   419: aload_0
    //   420: getfield ZG : Lburp/Zor;
    //   423: new javax/swing/tree/TreePath
    //   426: dup
    //   427: aload #11
    //   429: invokevirtual Zi : ()Ljavax/swing/tree/DefaultMutableTreeNode;
    //   432: invokevirtual getPath : ()[Ljavax/swing/tree/TreeNode;
    //   435: invokespecial <init> : ([Ljava/lang/Object;)V
    //   438: invokevirtual expandPath : (Ljavax/swing/tree/TreePath;)V
    //   441: aload #11
    //   443: aload #6
    //   445: invokevirtual equals : (Ljava/lang/Object;)Z
    //   448: ifne -> 468
    //   451: aload #11
    //   453: invokevirtual ZX : ()Lburp/Zrdb;
    //   456: aload_0
    //   457: getfield ZI : Lburp/Zrdb;
    //   460: invokeinterface equals : (Ljava/lang/Object;)Z
    //   465: ifeq -> 472
    //   468: aload #11
    //   470: astore #8
    //   472: aload_2
    //   473: ifnonnull -> 373
    //   476: iload #7
    //   478: ifne -> 494
    //   481: aload_1
    //   482: aload_0
    //   483: getfield ZI : Lburp/Zrdb;
    //   486: invokeinterface contains : (Ljava/lang/Object;)Z
    //   491: ifeq -> 520
    //   494: aload_0
    //   495: aconst_null
    //   496: putfield ZI : Lburp/Zrdb;
    //   499: aload_0
    //   500: aconst_null
    //   501: putfield Zj : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   504: aload_0
    //   505: getfield Zp : Lburp/Zz1m;
    //   508: invokestatic Zv : ()Lburp/Zxr8;
    //   511: invokeinterface ZD : (Lburp/Zxr8;)V
    //   516: aload_2
    //   517: ifnonnull -> 559
    //   520: aload #8
    //   522: ifnull -> 559
    //   525: aload_0
    //   526: aload #8
    //   528: invokevirtual ZX : ()Lburp/Zrdb;
    //   531: putfield ZI : Lburp/Zrdb;
    //   534: aload_0
    //   535: aload #8
    //   537: invokevirtual Zi : ()Ljavax/swing/tree/DefaultMutableTreeNode;
    //   540: putfield Zj : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   543: aload_0
    //   544: getfield Zp : Lburp/Zz1m;
    //   547: aload_0
    //   548: getfield ZI : Lburp/Zrdb;
    //   551: invokestatic Ze : (Lburp/Zrdb;)Lburp/Zxr8;
    //   554: invokeinterface ZD : (Lburp/Zxr8;)V
    //   559: aload_0
    //   560: invokevirtual ZF : ()V
    //   563: aload_0
    //   564: <illegal opcode> run : (Lburp/Zgrj;)Ljava/lang/Runnable;
    //   569: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   572: aload_3
    //   573: monitorexit
    //   574: goto -> 584
    //   577: astore #14
    //   579: aload_3
    //   580: monitorexit
    //   581: aload #14
    //   583: athrow
    //   584: return
    // Exception table:
    //   from	to	target	type
    //   11	32	577	finally
    //   33	574	577	finally
    //   577	581	577	finally
  }
  
  private void ZO(Collection<Zrdb> paramCollection, byte paramByte) {
    Zf(paramCollection, true, paramByte);
  }
  
  private void ZU(Collection<Zrdb> paramCollection) {
    Zbqc[] arrayOfZbqc = Zxaf.ZL();
    for (Zrdb zrdb : paramCollection) {
      ZO(Collections.singletonList(zrdb), Zls9.Zh(zrdb.ZaJ()));
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private void ZJ(Collection<Zrdb> paramCollection, byte paramByte) {
    Zf(paramCollection, false, paramByte);
  }
  
  private void Zv(Collection<Zrdb> paramCollection) {
    Zbqc[] arrayOfZbqc = Zxaf.ZL();
    for (Zrdb zrdb : paramCollection) {
      ZJ(Collections.singletonList(zrdb), Zewc.Z_(zrdb.Zac()));
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private void Zf(Collection<Zrdb> paramCollection, boolean paramBoolean, byte paramByte) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zv : Lburp/Ztwv;
    //   4: aload_0
    //   5: aload_1
    //   6: iload_2
    //   7: iload_3
    //   8: <illegal opcode> run : (Lburp/Zgrj;Ljava/util/Collection;ZB)Ljava/lang/Runnable;
    //   13: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   18: pop
    //   19: return
  }
  
  void ZN(Collection<Zrdb> paramCollection) {
    Zbqc[] arrayOfZbqc = Zxaf.ZL();
    synchronized (this.Zg) {
      HashSet<Zpg> hashSet = new HashSet();
      boolean bool1 = false;
      for (Zrdb zrdb : paramCollection) {
        Zpg zpg = Zt(zrdb);
        if (zpg != null) {
          hashSet.add(zpg);
          if (zpg.equals(this.ZI))
            bool1 = true; 
        } 
        if (zrdb.equals(this.ZI))
          bool1 = true; 
        if (arrayOfZbqc == null)
          break; 
      } 
      if (hashSet.isEmpty())
        return; 
      for (Zpg zpg : hashSet) {
        zpg.ZA();
        if (arrayOfZbqc == null)
          break; 
      } 
      int i = this.Zl.getChildCount();
      byte b = 0;
      boolean bool2 = true;
      while (bool2 && b++ < i) {
        bool2 = false;
        byte b1 = 0;
        while (b1 < i - 1) {
          Zpg zpg1 = (Zpg)((DefaultMutableTreeNode)this.Zl.getChildAt(b1)).getUserObject();
          Zpg zpg2 = (Zpg)((DefaultMutableTreeNode)this.Zl.getChildAt(b1 + 1)).getUserObject();
          if (zpg1.ZV(zpg2) > 0) {
            ZC(zpg2, b1);
            bool2 = true;
          } 
          b1++;
          if (arrayOfZbqc == null)
            break; 
        } 
        if (arrayOfZbqc == null)
          break; 
      } 
      if (bool1)
        this.Zp.ZD(Zt1_.Ze(this.ZI)); 
      ZF();
      SwingUtilities.invokeLater(this::lambda$showNewIssues$0);
    } 
  }
  
  private void ZF() {
    this.ZG.setSelectionPath((this.Zj == null) ? null : new TreePath((Object[])this.Zj.getPath()));
  }
  
  private void Zd(List<Zg7t> paramList, List<Zrdb> paramList1) {
    // Byte code:
    //   0: invokestatic ZL : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield Ze : Lburp/Zg6q;
    //   8: invokeinterface Zy : ()Lburp/Zxgq;
    //   13: getfield allowDelete : Z
    //   16: ifeq -> 28
    //   19: aload_2
    //   20: invokeinterface isEmpty : ()Z
    //   25: ifeq -> 29
    //   28: return
    //   29: aload_1
    //   30: invokeinterface size : ()I
    //   35: iconst_1
    //   36: if_icmple -> 54
    //   39: sipush #-14955
    //   42: sipush #10967
    //   45: invokestatic a : (II)Ljava/lang/String;
    //   48: astore #4
    //   50: aload_3
    //   51: ifnonnull -> 152
    //   54: aload_2
    //   55: invokeinterface size : ()I
    //   60: iconst_1
    //   61: if_icmple -> 104
    //   64: sipush #-14956
    //   67: sipush #25712
    //   70: invokestatic a : (II)Ljava/lang/String;
    //   73: iconst_1
    //   74: anewarray java/lang/Object
    //   77: dup
    //   78: iconst_0
    //   79: aload_1
    //   80: iconst_0
    //   81: invokeinterface get : (I)Ljava/lang/Object;
    //   86: checkcast burp/Zg7t
    //   89: invokeinterface toString : ()Ljava/lang/String;
    //   94: aastore
    //   95: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   98: astore #4
    //   100: aload_3
    //   101: ifnonnull -> 152
    //   104: getstatic burp/Zrf1.Za : Lburp/Zzb4;
    //   107: aload_2
    //   108: iconst_0
    //   109: invokeinterface get : (I)Ljava/lang/Object;
    //   114: checkcast burp/Zrdb
    //   117: invokeinterface ZK : (Lburp/Zrdb;)Lburp/Zree;
    //   122: invokeinterface ZZV : ()Ljava/lang/String;
    //   127: astore #5
    //   129: sipush #-14959
    //   132: sipush #21515
    //   135: invokestatic a : (II)Ljava/lang/String;
    //   138: iconst_1
    //   139: anewarray java/lang/Object
    //   142: dup
    //   143: iconst_0
    //   144: aload #5
    //   146: aastore
    //   147: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   150: astore #4
    //   152: aload_0
    //   153: getfield Zt : Ljava/awt/Component;
    //   156: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   159: sipush #-14954
    //   162: sipush #19996
    //   165: invokestatic a : (II)Ljava/lang/String;
    //   168: iconst_1
    //   169: anewarray java/lang/Object
    //   172: dup
    //   173: iconst_0
    //   174: aload #4
    //   176: aastore
    //   177: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   180: invokestatic ZY : (Ljava/awt/Component;Ljava/lang/Object;)Z
    //   183: ifne -> 187
    //   186: return
    //   187: getstatic burp/Zrrh.SCANNER_ISSUES_DELETE : Lburp/Zrrh;
    //   190: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   193: aload_0
    //   194: getfield Zp : Lburp/Zz1m;
    //   197: aload_2
    //   198: invokestatic ZP : (Ljava/util/Collection;)Lburp/Zxr8;
    //   201: invokeinterface ZD : (Lburp/Zxr8;)V
    //   206: return
  }
  
  public void valueChanged(TreeSelectionEvent paramTreeSelectionEvent) {
    synchronized (this.Zg) {
      TreePath treePath = paramTreeSelectionEvent.getNewLeadSelectionPath();
      if (treePath != null) {
        Zg7t zg7t = (Zg7t)treePath.getLastPathComponent();
        this.ZI = zg7t.ZH();
        this.Zj = (DefaultMutableTreeNode)zg7t;
        this.Zp.ZD(Zt1_.Ze(this.ZI));
      } 
    } 
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      Zw(paramMouseEvent); 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      Zw(paramMouseEvent); 
  }
  
  private void Zw(MouseEvent paramMouseEvent) {
    List<Zg7t> list = ZN(paramMouseEvent);
    List<Zrdb> list1 = Zu(list);
    this.ZV.Z_(list, list1, paramMouseEvent);
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    if (!(this.Ze.Zy()).allowContextMenuAndHotkeyActions)
      return true; 
    List<Zg7t> list = ZN((MouseEvent)null);
    List<Zrdb> list1 = Zu(list);
    return Zj(paramInt, list, list1);
  }
  
  public boolean Zj(int paramInt, List<Zg7t> paramList, List<Zrdb> paramList1) {
    if (!(this.Ze.Zy()).allowContextMenuAndHotkeyActions)
      return false; 
    switch (paramInt) {
      case 530688:
        this.Zf.Zu(paramList1);
        return true;
      case 531200:
        ZO(paramList1, (byte)4);
        return true;
      case 531216:
        ZO(paramList1, (byte)3);
        return true;
      case 531232:
        ZO(paramList1, (byte)2);
        return true;
      case 531248:
        ZO(paramList1, (byte)1);
        return true;
      case 531264:
        ZO(paramList1, (byte)-1);
        return true;
      case 531280:
        ZO(paramList1, (byte)0);
        return true;
      case 531296:
        ZU(paramList1);
        return true;
      case 531456:
        ZJ(paramList1, (byte)3);
        return true;
      case 531472:
        ZJ(paramList1, (byte)2);
        return true;
      case 531488:
        ZJ(paramList1, (byte)1);
        return true;
      case 531504:
        ZJ(paramList1, (byte)0);
        return true;
      case 531520:
        Zv(paramList1);
        return true;
      case 530944:
        Zd(paramList, paramList1);
        return true;
      case 527168:
      case 530176:
      case 530432:
        return (!(this.Ze.Zy()).allowDashboardViewActions || this.ZK.Z_(paramInt));
    } 
    return false;
  }
  
  public void keyTyped(KeyEvent paramKeyEvent) {}
  
  public void keyPressed(KeyEvent paramKeyEvent) {
    if ((this.Ze.Zy()).allowDelete && paramKeyEvent.getKeyCode() == 127) {
      List<Zg7t> list = ZN((MouseEvent)null);
      List<Zrdb> list1 = Zu(list);
      Zd(list, list1);
    } 
  }
  
  public void keyReleased(KeyEvent paramKeyEvent) {}
  
  private List<Zg7t> ZN(MouseEvent paramMouseEvent) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZL : ()[Lburp/Zbqc;
    //   11: aload_0
    //   12: getfield ZG : Lburp/Zor;
    //   15: invokevirtual getSelectionPaths : ()[Ljavax/swing/tree/TreePath;
    //   18: astore #4
    //   20: astore_2
    //   21: aload #4
    //   23: ifnull -> 101
    //   26: aload_1
    //   27: ifnull -> 37
    //   30: aload #4
    //   32: arraylength
    //   33: iconst_1
    //   34: if_icmple -> 101
    //   37: aload #4
    //   39: astore #5
    //   41: aload #5
    //   43: arraylength
    //   44: istore #6
    //   46: iconst_0
    //   47: istore #7
    //   49: iload #7
    //   51: iload #6
    //   53: if_icmpge -> 97
    //   56: aload #5
    //   58: iload #7
    //   60: aaload
    //   61: astore #8
    //   63: aload #8
    //   65: invokevirtual getLastPathComponent : ()Ljava/lang/Object;
    //   68: astore #9
    //   70: aload #9
    //   72: instanceof burp/Zg7t
    //   75: ifeq -> 90
    //   78: aload_3
    //   79: aload #9
    //   81: checkcast burp/Zg7t
    //   84: invokeinterface add : (Ljava/lang/Object;)Z
    //   89: pop
    //   90: iinc #7, 1
    //   93: aload_2
    //   94: ifnonnull -> 49
    //   97: aload_2
    //   98: ifnonnull -> 154
    //   101: aload_1
    //   102: ifnull -> 154
    //   105: aload_0
    //   106: getfield ZG : Lburp/Zor;
    //   109: aload_1
    //   110: invokevirtual getX : ()I
    //   113: aload_1
    //   114: invokevirtual getY : ()I
    //   117: invokevirtual getClosestPathForLocation : (II)Ljavax/swing/tree/TreePath;
    //   120: astore #5
    //   122: aload #5
    //   124: ifnull -> 154
    //   127: aload #5
    //   129: invokevirtual getLastPathComponent : ()Ljava/lang/Object;
    //   132: astore #6
    //   134: aload #6
    //   136: instanceof burp/Zg7t
    //   139: ifeq -> 154
    //   142: aload_3
    //   143: aload #6
    //   145: checkcast burp/Zg7t
    //   148: invokeinterface add : (Ljava/lang/Object;)Z
    //   153: pop
    //   154: aload_3
    //   155: areturn
  }
  
  private List<Zrdb> Zu(List<Zg7t> paramList) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZL : ()[Lburp/Zbqc;
    //   11: aload_1
    //   12: invokeinterface iterator : ()Ljava/util/Iterator;
    //   17: astore #4
    //   19: astore_2
    //   20: aload #4
    //   22: invokeinterface hasNext : ()Z
    //   27: ifeq -> 119
    //   30: aload #4
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast burp/Zg7t
    //   40: astore #5
    //   42: aload #5
    //   44: instanceof burp/Zl3u
    //   47: ifeq -> 67
    //   50: aload #5
    //   52: checkcast burp/Zl3u
    //   55: astore #6
    //   57: aload #6
    //   59: aload_3
    //   60: invokevirtual Zb : (Ljava/util/Collection;)V
    //   63: aload_2
    //   64: ifnonnull -> 115
    //   67: aload #5
    //   69: instanceof burp/Zs0o
    //   72: ifeq -> 98
    //   75: aload #5
    //   77: checkcast burp/Zs0o
    //   80: astore #7
    //   82: aload_3
    //   83: aload #7
    //   85: invokevirtual ZH : ()Lburp/Zrdb;
    //   88: invokeinterface add : (Ljava/lang/Object;)Z
    //   93: pop
    //   94: aload_2
    //   95: ifnonnull -> 115
    //   98: iconst_0
    //   99: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   102: aload #5
    //   104: invokeinterface getClass : ()Ljava/lang/Class;
    //   109: invokevirtual toString : ()Ljava/lang/String;
    //   112: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   115: aload_2
    //   116: ifnonnull -> 20
    //   119: aload_3
    //   120: areturn
  }
  
  private void lambda$setScreenSignificance$3(Collection paramCollection, boolean paramBoolean, byte paramByte) {
    // Byte code:
    //   0: new java/util/HashSet
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #5
    //   9: invokestatic ZL : ()[Lburp/Zbqc;
    //   12: aload_1
    //   13: invokeinterface iterator : ()Ljava/util/Iterator;
    //   18: astore #6
    //   20: astore #4
    //   22: aload #6
    //   24: invokeinterface hasNext : ()Z
    //   29: ifeq -> 174
    //   32: aload #6
    //   34: invokeinterface next : ()Ljava/lang/Object;
    //   39: checkcast burp/Zrdb
    //   42: astore #7
    //   44: iload_2
    //   45: ifeq -> 112
    //   48: iload_3
    //   49: ifne -> 62
    //   52: aload #7
    //   54: invokeinterface Zaw : ()B
    //   59: goto -> 63
    //   62: iload_3
    //   63: istore #8
    //   65: aload #7
    //   67: invokeinterface ZaJ : ()B
    //   72: iload #8
    //   74: if_icmpne -> 80
    //   77: goto -> 22
    //   80: aload #7
    //   82: iload #8
    //   84: invokeinterface ZT : (B)V
    //   89: iload #8
    //   91: iconst_m1
    //   92: if_icmpne -> 101
    //   95: getstatic burp/Zrrh.SCANNER_ISSUES_SET_SEVERITY_FALSE_POSITIVE : Lburp/Zrrh;
    //   98: goto -> 104
    //   101: getstatic burp/Zrrh.SCANNER_ISSUES_SET_SEVERITY : Lburp/Zrrh;
    //   104: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   107: aload #4
    //   109: ifnonnull -> 159
    //   112: iload_3
    //   113: ifne -> 126
    //   116: aload #7
    //   118: invokeinterface Zak : ()B
    //   123: goto -> 127
    //   126: iload_3
    //   127: istore #8
    //   129: aload #7
    //   131: invokeinterface Zac : ()B
    //   136: iload #8
    //   138: if_icmpne -> 144
    //   141: goto -> 22
    //   144: aload #7
    //   146: iload #8
    //   148: invokeinterface Zx : (B)V
    //   153: getstatic burp/Zrrh.SCANNER_ISSUES_SET_CONFIDENCE : Lburp/Zrrh;
    //   156: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   159: aload #5
    //   161: aload #7
    //   163: invokeinterface add : (Ljava/lang/Object;)Z
    //   168: pop
    //   169: aload #4
    //   171: ifnonnull -> 22
    //   174: aload #5
    //   176: invokeinterface isEmpty : ()Z
    //   181: ifne -> 198
    //   184: aload_0
    //   185: getfield Zp : Lburp/Zz1m;
    //   188: aload #5
    //   190: invokestatic ZX : (Ljava/util/Collection;)Lburp/Zxr8;
    //   193: invokeinterface ZD : (Lburp/Zxr8;)V
    //   198: return
  }
  
  private void lambda$showNewIssues$0() {
    Zmse.ZF(this.ZG);
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ÅfÈ¿ïbFþ¸¡ò®hð,-ÍÂo·<7(&D¹$ÓûW©à©ó'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #19
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #40
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'yè,ÇY')+6;oµe'|üå¶ßÎìæVåo}Ã\\fdO¿¨¡ø\\t'âqo¯o'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #35
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #103
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zgrj.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zgrj.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #12
    //   214: goto -> 243
    //   217: bipush #120
    //   219: goto -> 243
    //   222: iconst_5
    //   223: goto -> 243
    //   226: bipush #66
    //   228: goto -> 243
    //   231: bipush #71
    //   233: goto -> 243
    //   236: bipush #87
    //   238: goto -> 243
    //   241: bipush #66
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC595) & 0xFFFF;
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
      char c = 'á';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgrj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */