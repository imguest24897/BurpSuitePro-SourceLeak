package burp;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.swing.SwingUtilities;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbct extends Zbqc {
  private static final Ze9n ZG;
  
  private static final Ze9n Zi;
  
  private static final Ze9n Zt;
  
  private final Zbqc Zr;
  
  private final Zm99 ZC;
  
  private final Zm99 Zn;
  
  private final Zx0x ZE;
  
  private final Zexh ZB;
  
  private final Ze01 Zu;
  
  private final Zm9h Zx;
  
  private final Zm6 ZR;
  
  private Ztdz Zz;
  
  private File ZY;
  
  private CompletableFuture<Zlaj> ZJ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbct(String paramString1, String paramString2, Zm6 paramZm6, Supplier<File> paramSupplier) {
    // Byte code:
    //   0: invokestatic ZTu : ()Z
    //   3: aload_0
    //   4: new java/awt/BorderLayout
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   14: istore #5
    //   16: aload_0
    //   17: getstatic burp/Ztdz.INITIAL : Lburp/Ztdz;
    //   20: putfield Zz : Lburp/Ztdz;
    //   23: aload_0
    //   24: aload_3
    //   25: putfield ZR : Lburp/Zm6;
    //   28: new burp/Zm99
    //   31: dup
    //   32: aload_1
    //   33: invokespecial <init> : (Ljava/lang/String;)V
    //   36: astore #6
    //   38: aload #6
    //   40: new javax/swing/border/EmptyBorder
    //   43: dup
    //   44: iconst_0
    //   45: iconst_0
    //   46: iconst_5
    //   47: iconst_0
    //   48: invokespecial <init> : (IIII)V
    //   51: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   54: aload_0
    //   55: aload #6
    //   57: sipush #25854
    //   60: sipush #12046
    //   63: invokestatic a : (II)Ljava/lang/String;
    //   66: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   69: aload_0
    //   70: new burp/Zbcy
    //   73: dup
    //   74: aload_0
    //   75: invokespecial <init> : (Lburp/Zbct;)V
    //   78: putfield Zr : Lburp/Zbqc;
    //   81: aload_0
    //   82: getfield Zr : Lburp/Zbqc;
    //   85: getstatic burp/Zlkk.FILE_UPLOAD_BACKGROUND : Lburp/Zlkk;
    //   88: invokevirtual Zl : (Lburp/Zlkk;)V
    //   91: aload_0
    //   92: getfield Zr : Lburp/Zbqc;
    //   95: new javax/swing/BoxLayout
    //   98: dup
    //   99: aload_0
    //   100: getfield Zr : Lburp/Zbqc;
    //   103: iconst_1
    //   104: invokespecial <init> : (Ljava/awt/Container;I)V
    //   107: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   110: new java/awt/dnd/DropTarget
    //   113: dup
    //   114: invokespecial <init> : ()V
    //   117: astore #7
    //   119: aload #7
    //   121: new burp/Zs71
    //   124: dup
    //   125: aload_0
    //   126: invokespecial <init> : (Lburp/Zbct;)V
    //   129: invokevirtual addDropTargetListener : (Ljava/awt/dnd/DropTargetListener;)V
    //   132: goto -> 155
    //   135: astore #8
    //   137: aload #8
    //   139: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   142: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   145: new java/lang/RuntimeException
    //   148: dup
    //   149: aload #8
    //   151: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   154: athrow
    //   155: aload_0
    //   156: getfield Zr : Lburp/Zbqc;
    //   159: aload #7
    //   161: invokevirtual setDropTarget : (Ljava/awt/dnd/DropTarget;)V
    //   164: aload_0
    //   165: new burp/Zm99
    //   168: dup
    //   169: getstatic burp/Zbct.ZG : Lburp/Ze9n;
    //   172: invokespecial <init> : (Ljavax/swing/Icon;)V
    //   175: putfield ZC : Lburp/Zm99;
    //   178: aload_0
    //   179: getfield ZC : Lburp/Zm99;
    //   182: ldc 0.5
    //   184: invokevirtual setAlignmentX : (F)V
    //   187: aload_0
    //   188: new burp/Zm99
    //   191: dup
    //   192: sipush #25840
    //   195: sipush #-1278
    //   198: invokestatic a : (II)Ljava/lang/String;
    //   201: invokespecial <init> : (Ljava/lang/String;)V
    //   204: putfield Zn : Lburp/Zm99;
    //   207: aload_0
    //   208: getfield Zn : Lburp/Zm99;
    //   211: sipush #25848
    //   214: sipush #18938
    //   217: invokestatic a : (II)Ljava/lang/String;
    //   220: invokevirtual setName : (Ljava/lang/String;)V
    //   223: aload_0
    //   224: getfield Zn : Lburp/Zm99;
    //   227: getstatic burp/Zt00.TITLE_BOLD_FONT : Lburp/Zt00;
    //   230: invokevirtual ZE : (Lburp/Zt00;)V
    //   233: aload_0
    //   234: getfield Zn : Lburp/Zm99;
    //   237: ldc 0.5
    //   239: invokevirtual setAlignmentX : (F)V
    //   242: aload_0
    //   243: new burp/Zx0s
    //   246: dup
    //   247: aload_0
    //   248: invokespecial <init> : (Lburp/Zbct;)V
    //   251: putfield ZE : Lburp/Zx0x;
    //   254: aload_0
    //   255: getfield ZE : Lburp/Zx0x;
    //   258: sipush #25847
    //   261: sipush #-21425
    //   264: invokestatic a : (II)Ljava/lang/String;
    //   267: invokevirtual setName : (Ljava/lang/String;)V
    //   270: aload_0
    //   271: getfield ZE : Lburp/Zx0x;
    //   274: iconst_0
    //   275: invokevirtual setEditable : (Z)V
    //   278: aload_0
    //   279: getfield ZE : Lburp/Zx0x;
    //   282: new burp/Zmjt
    //   285: dup
    //   286: invokespecial <init> : ()V
    //   289: invokevirtual setCaret : (Ljavax/swing/text/Caret;)V
    //   292: aload_0
    //   293: getfield ZE : Lburp/Zx0x;
    //   296: sipush #25842
    //   299: sipush #-19009
    //   302: invokestatic a : (II)Ljava/lang/String;
    //   305: invokevirtual setContentType : (Ljava/lang/String;)V
    //   308: aload_0
    //   309: getfield ZE : Lburp/Zx0x;
    //   312: sipush #25845
    //   315: sipush #-19092
    //   318: invokestatic a : (II)Ljava/lang/String;
    //   321: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   324: invokevirtual putClientProperty : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   327: aload_0
    //   328: getfield ZE : Lburp/Zx0x;
    //   331: getstatic burp/Zt00.TITLE_BOLD_FONT : Lburp/Zt00;
    //   334: invokevirtual ZN : (Lburp/Zt00;)V
    //   337: aload_0
    //   338: getfield ZE : Lburp/Zx0x;
    //   341: ldc 0.5
    //   343: invokevirtual setAlignmentX : (F)V
    //   346: aload_0
    //   347: getfield ZE : Lburp/Zx0x;
    //   350: getstatic burp/Zlkk.FILE_UPLOAD_ERROR : Lburp/Zlkk;
    //   353: invokevirtual Ze : (Lburp/Zlkk;)V
    //   356: aload_0
    //   357: getfield ZE : Lburp/Zx0x;
    //   360: aconst_null
    //   361: invokevirtual setDropTarget : (Ljava/awt/dnd/DropTarget;)V
    //   364: aload_0
    //   365: getfield ZE : Lburp/Zx0x;
    //   368: iconst_0
    //   369: invokevirtual setOpaque : (Z)V
    //   372: aload_0
    //   373: new burp/Zexh
    //   376: dup
    //   377: invokespecial <init> : ()V
    //   380: putfield ZB : Lburp/Zexh;
    //   383: aload_0
    //   384: getfield ZB : Lburp/Zexh;
    //   387: sipush #25846
    //   390: sipush #16481
    //   393: invokestatic a : (II)Ljava/lang/String;
    //   396: invokevirtual setName : (Ljava/lang/String;)V
    //   399: aload_0
    //   400: getfield ZB : Lburp/Zexh;
    //   403: new java/awt/Dimension
    //   406: dup
    //   407: sipush #178
    //   410: iconst_5
    //   411: invokespecial <init> : (II)V
    //   414: invokevirtual setMaximumSize : (Ljava/awt/Dimension;)V
    //   417: aload_0
    //   418: getfield ZB : Lburp/Zexh;
    //   421: new java/awt/Dimension
    //   424: dup
    //   425: sipush #178
    //   428: iconst_5
    //   429: invokespecial <init> : (II)V
    //   432: invokevirtual setPreferredSize : (Ljava/awt/Dimension;)V
    //   435: aload_0
    //   436: getfield ZB : Lburp/Zexh;
    //   439: iconst_1
    //   440: invokevirtual setIndeterminate : (Z)V
    //   443: aload_0
    //   444: getfield ZB : Lburp/Zexh;
    //   447: getstatic burp/Zlkk.FILE_UPLOAD_PROGRESS_FOREGROUND : Lburp/Zlkk;
    //   450: invokevirtual ZX : (Lburp/Zlkk;)V
    //   453: aload_0
    //   454: getfield ZB : Lburp/Zexh;
    //   457: ldc 0.5
    //   459: invokevirtual setAlignmentX : (F)V
    //   462: aload_0
    //   463: new burp/Ze01
    //   466: dup
    //   467: aload_2
    //   468: invokespecial <init> : (Ljava/lang/String;)V
    //   471: putfield Zu : Lburp/Ze01;
    //   474: aload_0
    //   475: getfield Zu : Lburp/Ze01;
    //   478: sipush #25843
    //   481: sipush #-32737
    //   484: invokestatic a : (II)Ljava/lang/String;
    //   487: invokevirtual setName : (Ljava/lang/String;)V
    //   490: aload_0
    //   491: getfield Zu : Lburp/Ze01;
    //   494: ldc 0.5
    //   496: invokevirtual setAlignmentX : (F)V
    //   499: aload_0
    //   500: getfield Zu : Lburp/Ze01;
    //   503: getstatic burp/Zlkk.FILE_UPLOAD_BACKGROUND : Lburp/Zlkk;
    //   506: invokevirtual Zj : (Lburp/Zlkk;)V
    //   509: aload_0
    //   510: getfield Zu : Lburp/Ze01;
    //   513: aload_0
    //   514: aload #4
    //   516: <illegal opcode> actionPerformed : (Lburp/Zbct;Ljava/util/function/Supplier;)Ljava/awt/event/ActionListener;
    //   521: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   524: aload_0
    //   525: new burp/Zm9h
    //   528: dup
    //   529: invokespecial <init> : ()V
    //   532: putfield Zx : Lburp/Zm9h;
    //   535: aload_0
    //   536: getfield Zx : Lburp/Zm9h;
    //   539: sipush #25851
    //   542: sipush #32701
    //   545: invokestatic a : (II)Ljava/lang/String;
    //   548: aload_0
    //   549: <illegal opcode> accept : (Lburp/Zbct;)Ljava/util/function/Consumer;
    //   554: invokevirtual Zf : (Ljava/lang/String;Ljava/util/function/Consumer;)V
    //   557: aload_0
    //   558: getfield Zx : Lburp/Zm9h;
    //   561: getstatic burp/Zt00.TITLE_UNDERLINE_FONT : Lburp/Zt00;
    //   564: invokevirtual ZE : (Lburp/Zt00;)V
    //   567: aload_0
    //   568: getfield Zx : Lburp/Zm9h;
    //   571: ldc 0.5
    //   573: invokevirtual setAlignmentX : (F)V
    //   576: aload_0
    //   577: invokevirtual Zm : ()V
    //   580: aload_0
    //   581: aload_0
    //   582: getfield Zr : Lburp/Zbqc;
    //   585: sipush #25844
    //   588: sipush #-4586
    //   591: invokestatic a : (II)Ljava/lang/String;
    //   594: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   597: iload #5
    //   599: ifne -> 616
    //   602: iconst_1
    //   603: anewarray burp/Zbqc
    //   606: invokestatic Zr : ([Lburp/Zbqc;)V
    //   609: goto -> 616
    //   612: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   615: athrow
    //   616: return
    // Exception table:
    //   from	to	target	type
    //   119	132	135	java/util/TooManyListenersException
    //   155	609	612	java/util/TooManyListenersException
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    Arrays.<Component>stream(getComponents()).forEach(paramBoolean::lambda$setEnabled$2);
  }
  
  private void Zo(Ztdz paramZtdz) {
    // Byte code:
    //   0: invokestatic isEventDispatchThread : ()Z
    //   3: getstatic net/portswigger/Zqf.ZF : Lnet/portswigger/Zqf;
    //   6: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   9: aload_0
    //   10: aload_1
    //   11: putfield Zz : Lburp/Ztdz;
    //   14: aload_0
    //   15: getfield Zz : Lburp/Ztdz;
    //   18: getstatic burp/Ztdz.INITIAL : Lburp/Ztdz;
    //   21: invokevirtual equals : (Ljava/lang/Object;)Z
    //   24: ifne -> 47
    //   27: aload_0
    //   28: getfield Zz : Lburp/Ztdz;
    //   31: getstatic burp/Ztdz.ERROR : Lburp/Ztdz;
    //   34: invokevirtual equals : (Ljava/lang/Object;)Z
    //   37: ifeq -> 63
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   46: athrow
    //   47: aload_0
    //   48: getfield ZR : Lburp/Zm6;
    //   51: invokeinterface ZW : ()V
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   62: athrow
    //   63: aload_0
    //   64: getfield ZC : Lburp/Zm99;
    //   67: aload_0
    //   68: invokevirtual ZJ : ()Z
    //   71: ifeq -> 84
    //   74: getstatic burp/Zbct.Zi : Lburp/Ze9n;
    //   77: goto -> 87
    //   80: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   83: athrow
    //   84: getstatic burp/Zbct.ZG : Lburp/Ze9n;
    //   87: invokevirtual setIcon : (Ljavax/swing/Icon;)V
    //   90: aload_0
    //   91: getfield Zn : Lburp/Zm99;
    //   94: aload_0
    //   95: getfield ZY : Ljava/io/File;
    //   98: ifnull -> 115
    //   101: aload_0
    //   102: getfield ZY : Ljava/io/File;
    //   105: invokevirtual getName : ()Ljava/lang/String;
    //   108: goto -> 124
    //   111: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   114: athrow
    //   115: sipush #25850
    //   118: sipush #-15004
    //   121: invokestatic a : (II)Ljava/lang/String;
    //   124: invokevirtual setText : (Ljava/lang/String;)V
    //   127: aload_0
    //   128: getfield Zx : Lburp/Zm9h;
    //   131: aload_1
    //   132: getstatic burp/Ztdz.PROCESSING : Lburp/Ztdz;
    //   135: if_acmpne -> 154
    //   138: sipush #25841
    //   141: sipush #-24833
    //   144: invokestatic a : (II)Ljava/lang/String;
    //   147: goto -> 163
    //   150: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   153: athrow
    //   154: sipush #25855
    //   157: sipush #5474
    //   160: invokestatic a : (II)Ljava/lang/String;
    //   163: invokevirtual setText : (Ljava/lang/String;)V
    //   166: aload_0
    //   167: invokevirtual Zm : ()V
    //   170: return
    // Exception table:
    //   from	to	target	type
    //   0	40	43	java/lang/RuntimeException
    //   27	56	59	java/lang/RuntimeException
    //   63	80	80	java/lang/RuntimeException
    //   87	111	111	java/lang/RuntimeException
    //   124	150	150	java/lang/RuntimeException
  }
  
  private void Zm() {
    // Byte code:
    //   0: invokestatic ZTu : ()Z
    //   3: aload_0
    //   4: getfield Zr : Lburp/Zbqc;
    //   7: invokevirtual removeAll : ()V
    //   10: istore_1
    //   11: aload_0
    //   12: getfield Zr : Lburp/Zbqc;
    //   15: invokestatic createVerticalGlue : ()Ljava/awt/Component;
    //   18: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   21: pop
    //   22: aload_0
    //   23: getfield Zr : Lburp/Zbqc;
    //   26: aload_0
    //   27: getfield ZC : Lburp/Zm99;
    //   30: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   33: pop
    //   34: aload_0
    //   35: getfield Zr : Lburp/Zbqc;
    //   38: bipush #12
    //   40: invokestatic createVerticalStrut : (I)Ljava/awt/Component;
    //   43: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   46: pop
    //   47: aload_0
    //   48: getfield Zr : Lburp/Zbqc;
    //   51: aload_0
    //   52: getfield Zn : Lburp/Zm99;
    //   55: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   58: pop
    //   59: aload_0
    //   60: getfield Zr : Lburp/Zbqc;
    //   63: bipush #12
    //   65: invokestatic createVerticalStrut : (I)Ljava/awt/Component;
    //   68: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   71: pop
    //   72: aload_0
    //   73: getfield Zz : Lburp/Ztdz;
    //   76: getstatic burp/Ztdz.ERROR : Lburp/Ztdz;
    //   79: invokevirtual equals : (Ljava/lang/Object;)Z
    //   82: ifeq -> 121
    //   85: aload_0
    //   86: getfield Zr : Lburp/Zbqc;
    //   89: aload_0
    //   90: getfield ZE : Lburp/Zx0x;
    //   93: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   96: pop
    //   97: aload_0
    //   98: getfield Zr : Lburp/Zbqc;
    //   101: bipush #12
    //   103: invokestatic createVerticalStrut : (I)Ljava/awt/Component;
    //   106: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   109: pop
    //   110: iload_1
    //   111: ifne -> 173
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   120: athrow
    //   121: aload_0
    //   122: getfield Zz : Lburp/Ztdz;
    //   125: getstatic burp/Ztdz.PROCESSING : Lburp/Ztdz;
    //   128: invokevirtual equals : (Ljava/lang/Object;)Z
    //   131: ifeq -> 173
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   140: athrow
    //   141: aload_0
    //   142: getfield Zr : Lburp/Zbqc;
    //   145: aload_0
    //   146: getfield ZB : Lburp/Zexh;
    //   149: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   152: pop
    //   153: aload_0
    //   154: getfield Zr : Lburp/Zbqc;
    //   157: bipush #12
    //   159: invokestatic createVerticalStrut : (I)Ljava/awt/Component;
    //   162: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   165: pop
    //   166: goto -> 173
    //   169: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   172: athrow
    //   173: aload_0
    //   174: invokevirtual ZJ : ()Z
    //   177: ifeq -> 203
    //   180: aload_0
    //   181: getfield Zr : Lburp/Zbqc;
    //   184: aload_0
    //   185: getfield Zx : Lburp/Zm9h;
    //   188: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   191: pop
    //   192: iload_1
    //   193: ifne -> 222
    //   196: goto -> 203
    //   199: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   202: athrow
    //   203: aload_0
    //   204: getfield Zr : Lburp/Zbqc;
    //   207: aload_0
    //   208: getfield Zu : Lburp/Ze01;
    //   211: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   214: pop
    //   215: goto -> 222
    //   218: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   221: athrow
    //   222: aload_0
    //   223: getfield Zr : Lburp/Zbqc;
    //   226: invokestatic createVerticalGlue : ()Ljava/awt/Component;
    //   229: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   232: pop
    //   233: aload_0
    //   234: invokevirtual Zk : ()V
    //   237: aload_0
    //   238: invokevirtual updateUI : ()V
    //   241: return
    // Exception table:
    //   from	to	target	type
    //   11	114	117	java/lang/RuntimeException
    //   85	134	137	java/lang/RuntimeException
    //   121	166	169	java/lang/RuntimeException
    //   173	196	199	java/lang/RuntimeException
    //   180	215	218	java/lang/RuntimeException
  }
  
  private void Zk() {
    try {
      if (this.Zr != null) {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        Zlkk zlkk = this.Zz.equals(Ztdz.ERROR) ? Zlkk.FILE_UPLOAD_ERROR : Zlkk.FILE_UPLOAD_BORDER;
        this.Zr.setBorder(new CompoundBorder(new Zxz5(zlkk, 1, 8, 2, 3), new EmptyBorder(10, 10, 10, 10)));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private void Zz(File paramFile) {
    this.ZY = paramFile;
    Zo(Ztdz.PROCESSING);
    this.ZJ = this.ZR.Zy(paramFile);
    this.ZJ.thenAcceptAsync(this::lambda$processFile$5).exceptionally(this::lambda$processFile$7).whenComplete(this::lambda$processFile$8);
  }
  
  private void ZK(String paramString) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    this.ZE.setText(a(25853, 28341) + a(25853, 28341) + paramString);
    this.ZE.setCaretPosition(1);
    this.ZE.insertIcon(Zt);
    Zo(Ztdz.ERROR);
  }
  
  private boolean ZJ() {
    try {
      if (!this.Zz.equals(Ztdz.PROCESSING)) {
        try {
          if (this.Zz.equals(Ztdz.FILE_SELECTED));
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private void lambda$processFile$8(Void paramVoid, Throwable paramThrowable) {
    this.ZJ = null;
  }
  
  private Void lambda$processFile$7(Throwable paramThrowable) {
    try {
      Zah.Zl(paramThrowable, Zk_.UNEXPECTED);
      if (this.ZJ != null)
        try {
          if (!this.ZJ.isCancelled())
            SwingUtilities.invokeLater(this::lambda$processFile$6); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return null;
  }
  
  private void lambda$processFile$6() {
    ZK(a(25849, -19599));
  }
  
  private void lambda$processFile$5(Zlaj paramZlaj) {
    // Byte code:
    //   0: invokestatic ZTu : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: invokevirtual ZTM : ()Z
    //   8: ifeq -> 31
    //   11: aload_0
    //   12: <illegal opcode> run : (Lburp/Zbct;)Ljava/lang/Runnable;
    //   17: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   20: iload_2
    //   21: ifne -> 48
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: aload_0
    //   32: aload_1
    //   33: <illegal opcode> run : (Lburp/Zbct;Lburp/Zlaj;)Ljava/lang/Runnable;
    //   38: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   47: athrow
    //   48: return
    // Exception table:
    //   from	to	target	type
    //   4	24	27	java/lang/RuntimeException
    //   11	41	44	java/lang/RuntimeException
  }
  
  private void lambda$processFile$4(Zlaj paramZlaj) {
    ZK(paramZlaj.ZT3());
  }
  
  private void lambda$processFile$3() {
    Zo(Ztdz.FILE_SELECTED);
  }
  
  private static void lambda$setEnabled$2(boolean paramBoolean, Component paramComponent) {
    paramComponent.setEnabled(paramBoolean);
  }
  
  private void lambda$new$1(MouseEvent paramMouseEvent) {
    try {
      this.ZY = null;
      if (this.ZJ != null)
        this.ZJ.cancel(true); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Zo(Ztdz.INITIAL);
  }
  
  private void lambda$new$0(Supplier<File> paramSupplier, ActionEvent paramActionEvent) {
    File file = paramSupplier.get();
    try {
      if (file != null)
        Zz(file); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÆÒ¨¶c¶D Ùå§zììàÆ.@\Õb\\tÚôÃ|â)$\\fÜÕw­lêó¦¡Il³\\fL ½5jµ°7-¿´T¥ý!F¼ÂJZ"P=°3 m\\b2mÌD¯ù»\\nù4¨¹ªÁ\\tAb¬ñùåkPzeøðµ`MÓ4"Üù<òoÓèüZjM5å|àÛðlq:rí0FÙUc0ô|9B§lÇ"v½Û«/ò\é×\\tO¼±\\r®Ûr¶ÎóýñÈædïe\\nA»pôW:ï2gDª¯Ò,wÃ%ä'ýsÓs2óñw.¼ôjµ<ýe-p¤æê£¾*K %(ic"&ð|hïýo\\f¼`ÊyúRDÜÆ{ÉÂT)4ãd\\n»=D`Um~±^ÐÙä(ðqk&=è_ôc0k³ÉLMH:øíkÚM¿>»ØhÄ«v;§{Íâ>p8 ;æîuE÷ÕFdËùN^a7Ð"esÞicî"S7¥áÑCÞ/²a6'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #18
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #8
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'Þ·Yó88øD'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #7
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
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
    //   128: putstatic burp/Zbct.a : [Ljava/lang/String;
    //   131: bipush #16
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbct.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #55
    //   214: goto -> 244
    //   217: bipush #30
    //   219: goto -> 244
    //   222: bipush #50
    //   224: goto -> 244
    //   227: bipush #125
    //   229: goto -> 244
    //   232: bipush #84
    //   234: goto -> 244
    //   237: bipush #44
    //   239: goto -> 244
    //   242: bipush #57
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: new burp/Ze3m
    //   303: dup
    //   304: getstatic burp/Zeuf.UPLOAD : Lburp/Zeuf;
    //   307: getstatic burp/Zlkk.FOREGROUND : Lburp/Zlkk;
    //   310: invokespecial <init> : (Lburp/Zeuf;Lburp/Zlkk;)V
    //   313: getstatic burp/Zmcx.EXTRA_EXTRA_LARGE_LINE_SIZE : Lburp/Zmcx;
    //   316: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   319: invokevirtual Z_ : ()Lburp/Ze9n;
    //   322: putstatic burp/Zbct.ZG : Lburp/Ze9n;
    //   325: new burp/Ze3m
    //   328: dup
    //   329: getstatic burp/Zeuf.NOTES : Lburp/Zeuf;
    //   332: getstatic burp/Zlkk.FOREGROUND : Lburp/Zlkk;
    //   335: invokespecial <init> : (Lburp/Zeuf;Lburp/Zlkk;)V
    //   338: getstatic burp/Zmcx.EXTRA_EXTRA_LARGE_LINE_SIZE : Lburp/Zmcx;
    //   341: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   344: invokevirtual Z_ : ()Lburp/Ze9n;
    //   347: putstatic burp/Zbct.Zi : Lburp/Ze9n;
    //   350: new burp/Ze3m
    //   353: dup
    //   354: getstatic burp/Zeuf.WARNING : Lburp/Zeuf;
    //   357: getstatic burp/Zlkk.FILE_UPLOAD_ERROR : Lburp/Zlkk;
    //   360: invokespecial <init> : (Lburp/Zeuf;Lburp/Zlkk;)V
    //   363: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   366: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   369: invokevirtual Z_ : ()Lburp/Ze9n;
    //   372: putstatic burp/Zbct.Zt : Lburp/Ze9n;
    //   375: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x64F0) & 0xFFFF;
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
      char c = '×';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbct.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */