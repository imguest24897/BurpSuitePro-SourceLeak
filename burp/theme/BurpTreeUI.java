package burp.theme;

import burp.Zrt;
import com.formdev.flatlaf.ui.FlatTreeUI;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.tree.TreePath;

public class BurpTreeUI extends FlatTreeUI {
  private static final int ICON_SPACING = 2;
  
  private static final float EXPAND_CLICK_TOLERANCE = 0.2F;
  
  private Color lineColour;
  
  private Color selectedLineColour;
  
  private int spaceAfterBlob;
  
  private int roundedLineRadius;
  
  private int horizontalLineLength;
  
  private int rightChildIndent;
  
  private int blobSize;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static ComponentUI createUI(JComponent paramJComponent) {
    return (ComponentUI)new BurpTreeUI();
  }
  
  public void paint(Graphics paramGraphics, JComponent paramJComponent) {
    // Byte code:
    //   0: invokestatic Zk : ()I
    //   3: istore_3
    //   4: aload_0
    //   5: getfield treeState : Ljavax/swing/tree/AbstractLayoutCache;
    //   8: ifnonnull -> 12
    //   11: return
    //   12: aload_0
    //   13: invokevirtual useRoundedLines : ()Z
    //   16: istore #4
    //   18: iload #4
    //   20: ifeq -> 44
    //   23: aload_0
    //   24: invokestatic calculateSpaceAfterBlob : ()I
    //   27: putfield spaceAfterBlob : I
    //   30: aload_0
    //   31: invokestatic calculateRoundedLineRadius : ()I
    //   34: putfield roundedLineRadius : I
    //   37: aload_0
    //   38: invokestatic calculateBlobSize : ()I
    //   41: putfield blobSize : I
    //   44: aload_0
    //   45: invokestatic calculateHorizontalLineLength : ()I
    //   48: putfield horizontalLineLength : I
    //   51: aload_0
    //   52: aload_0
    //   53: invokevirtual calculateRightChildIndent : ()I
    //   56: putfield rightChildIndent : I
    //   59: iload #4
    //   61: ifeq -> 84
    //   64: aload_0
    //   65: getstatic burp/Zlkk.TREE_LINE : Lburp/Zlkk;
    //   68: invokevirtual ZS : ()Ljava/awt/Color;
    //   71: putfield lineColour : Ljava/awt/Color;
    //   74: aload_0
    //   75: getstatic burp/Zlkk.TREE_LINE_SELECTED : Lburp/Zlkk;
    //   78: invokevirtual ZS : ()Ljava/awt/Color;
    //   81: putfield selectedLineColour : Ljava/awt/Color;
    //   84: aload_1
    //   85: invokevirtual getClipBounds : ()Ljava/awt/Rectangle;
    //   88: astore #5
    //   90: aload_0
    //   91: aload_0
    //   92: getfield tree : Ljavax/swing/JTree;
    //   95: iconst_0
    //   96: aload #5
    //   98: getfield y : I
    //   101: invokevirtual getClosestPathForLocation : (Ljavax/swing/JTree;II)Ljavax/swing/tree/TreePath;
    //   104: astore #6
    //   106: aload_0
    //   107: getfield treeState : Ljavax/swing/tree/AbstractLayoutCache;
    //   110: aload #6
    //   112: invokevirtual getVisiblePathsFrom : (Ljavax/swing/tree/TreePath;)Ljava/util/Enumeration;
    //   115: astore #7
    //   117: aload #7
    //   119: ifnull -> 863
    //   122: aload_0
    //   123: getfield tree : Ljavax/swing/JTree;
    //   126: invokevirtual getInsets : ()Ljava/awt/Insets;
    //   129: astore #8
    //   131: iload #4
    //   133: ifeq -> 146
    //   136: new java/util/HashSet
    //   139: dup
    //   140: invokespecial <init> : ()V
    //   143: goto -> 147
    //   146: aconst_null
    //   147: astore #9
    //   149: iload #4
    //   151: ifeq -> 164
    //   154: new java/util/ArrayList
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: goto -> 165
    //   164: aconst_null
    //   165: astore #10
    //   167: iload #4
    //   169: ifeq -> 182
    //   172: new java/util/ArrayList
    //   175: dup
    //   176: invokespecial <init> : ()V
    //   179: goto -> 183
    //   182: aconst_null
    //   183: astore #11
    //   185: iload #4
    //   187: ifeq -> 221
    //   190: aload #6
    //   192: invokevirtual getParentPath : ()Ljavax/swing/tree/TreePath;
    //   195: astore #12
    //   197: aload #12
    //   199: ifnull -> 221
    //   202: aload #9
    //   204: aload #12
    //   206: invokevirtual add : (Ljava/lang/Object;)Z
    //   209: pop
    //   210: aload #12
    //   212: invokevirtual getParentPath : ()Ljavax/swing/tree/TreePath;
    //   215: astore #12
    //   217: iload_3
    //   218: ifeq -> 197
    //   221: new java/awt/Rectangle
    //   224: dup
    //   225: invokespecial <init> : ()V
    //   228: astore #12
    //   230: aload_0
    //   231: invokevirtual isRootVisible : ()Z
    //   234: istore #13
    //   236: aload_0
    //   237: getfield treeState : Ljavax/swing/tree/AbstractLayoutCache;
    //   240: aload #6
    //   242: invokevirtual getRowForPath : (Ljavax/swing/tree/TreePath;)I
    //   245: istore #14
    //   247: aload #7
    //   249: invokeinterface hasMoreElements : ()Z
    //   254: ifeq -> 672
    //   257: aload #7
    //   259: invokeinterface nextElement : ()Ljava/lang/Object;
    //   264: checkcast javax/swing/tree/TreePath
    //   267: astore #15
    //   269: aload #15
    //   271: ifnonnull -> 277
    //   274: goto -> 672
    //   277: aload_0
    //   278: getfield treeState : Ljavax/swing/tree/AbstractLayoutCache;
    //   281: aload #15
    //   283: aload #12
    //   285: invokevirtual getBounds : (Ljavax/swing/tree/TreePath;Ljava/awt/Rectangle;)Ljava/awt/Rectangle;
    //   288: astore #16
    //   290: aload #16
    //   292: ifnonnull -> 298
    //   295: goto -> 672
    //   298: aload #16
    //   300: dup
    //   301: getfield x : I
    //   304: aload #8
    //   306: getfield left : I
    //   309: iadd
    //   310: putfield x : I
    //   313: aload #16
    //   315: dup
    //   316: getfield y : I
    //   319: aload #8
    //   321: getfield top : I
    //   324: iadd
    //   325: putfield y : I
    //   328: aload #16
    //   330: aload #16
    //   332: getfield width : I
    //   335: aload_2
    //   336: invokevirtual getWidth : ()I
    //   339: aload #16
    //   341: getfield x : I
    //   344: isub
    //   345: invokestatic min : (II)I
    //   348: putfield width : I
    //   351: aload_0
    //   352: getfield treeModel : Ljavax/swing/tree/TreeModel;
    //   355: aload #15
    //   357: invokevirtual getLastPathComponent : ()Ljava/lang/Object;
    //   360: invokeinterface isLeaf : (Ljava/lang/Object;)Z
    //   365: istore #17
    //   367: iload #17
    //   369: ifne -> 388
    //   372: aload_0
    //   373: getfield treeState : Ljavax/swing/tree/AbstractLayoutCache;
    //   376: aload #15
    //   378: invokevirtual getExpandedState : (Ljavax/swing/tree/TreePath;)Z
    //   381: ifeq -> 388
    //   384: iconst_1
    //   385: goto -> 389
    //   388: iconst_0
    //   389: istore #18
    //   391: iload #17
    //   393: ifne -> 412
    //   396: aload_0
    //   397: getfield tree : Ljavax/swing/JTree;
    //   400: aload #15
    //   402: invokevirtual hasBeenExpanded : (Ljavax/swing/tree/TreePath;)Z
    //   405: ifeq -> 412
    //   408: iconst_1
    //   409: goto -> 413
    //   412: iconst_0
    //   413: istore #19
    //   415: aload_0
    //   416: aload_1
    //   417: aload #5
    //   419: aload #8
    //   421: aload #16
    //   423: aload #15
    //   425: iload #14
    //   427: iload #18
    //   429: iload #19
    //   431: iload #17
    //   433: invokevirtual paintRow : (Ljava/awt/Graphics;Ljava/awt/Rectangle;Ljava/awt/Insets;Ljava/awt/Rectangle;Ljavax/swing/tree/TreePath;IZZZ)V
    //   436: iload #4
    //   438: ifeq -> 520
    //   441: aload #15
    //   443: invokevirtual getParentPath : ()Ljavax/swing/tree/TreePath;
    //   446: astore #20
    //   448: aload #20
    //   450: ifnull -> 461
    //   453: aload #9
    //   455: aload #20
    //   457: invokevirtual add : (Ljava/lang/Object;)Z
    //   460: pop
    //   461: aload #20
    //   463: ifnonnull -> 476
    //   466: iload #13
    //   468: ifeq -> 520
    //   471: iload #14
    //   473: ifne -> 520
    //   476: new java/awt/Rectangle
    //   479: dup
    //   480: aload #16
    //   482: invokespecial <init> : (Ljava/awt/Rectangle;)V
    //   485: astore #21
    //   487: iload #14
    //   489: istore #22
    //   491: aload #10
    //   493: aload_0
    //   494: aload_1
    //   495: aload #5
    //   497: aload #8
    //   499: aload #21
    //   501: aload #15
    //   503: iload #22
    //   505: iload #18
    //   507: iload #19
    //   509: iload #17
    //   511: <illegal opcode> run : (Lburp/theme/BurpTreeUI;Ljava/awt/Graphics;Ljava/awt/Rectangle;Ljava/awt/Insets;Ljava/awt/Rectangle;Ljavax/swing/tree/TreePath;IZZZ)Ljava/lang/Runnable;
    //   516: invokevirtual add : (Ljava/lang/Object;)Z
    //   519: pop
    //   520: aload_0
    //   521: invokevirtual getExpandedIcon : ()Ljavax/swing/Icon;
    //   524: astore #20
    //   526: aload #15
    //   528: invokevirtual getPathCount : ()I
    //   531: iconst_1
    //   532: isub
    //   533: istore #21
    //   535: aload #20
    //   537: ifnull -> 555
    //   540: aload_0
    //   541: iload #14
    //   543: iload #21
    //   545: invokevirtual shouldPaintExpandControl : (II)Z
    //   548: ifeq -> 555
    //   551: iconst_1
    //   552: goto -> 556
    //   555: iconst_0
    //   556: istore #22
    //   558: iload #22
    //   560: ifeq -> 637
    //   563: iload #4
    //   565: ifeq -> 616
    //   568: new java/awt/Rectangle
    //   571: dup
    //   572: aload #16
    //   574: invokespecial <init> : (Ljava/awt/Rectangle;)V
    //   577: astore #23
    //   579: iload #14
    //   581: istore #24
    //   583: aload #11
    //   585: aload_0
    //   586: aload_1
    //   587: aload #5
    //   589: aload #8
    //   591: aload #23
    //   593: aload #15
    //   595: iload #24
    //   597: iload #18
    //   599: iload #19
    //   601: iload #17
    //   603: <illegal opcode> run : (Lburp/theme/BurpTreeUI;Ljava/awt/Graphics;Ljava/awt/Rectangle;Ljava/awt/Insets;Ljava/awt/Rectangle;Ljavax/swing/tree/TreePath;IZZZ)Ljava/lang/Runnable;
    //   608: invokevirtual add : (Ljava/lang/Object;)Z
    //   611: pop
    //   612: iload_3
    //   613: ifeq -> 637
    //   616: aload_0
    //   617: aload_1
    //   618: aload #5
    //   620: aload #8
    //   622: aload #16
    //   624: aload #15
    //   626: iload #14
    //   628: iload #18
    //   630: iload #19
    //   632: iload #17
    //   634: invokevirtual paintExpandControl : (Ljava/awt/Graphics;Ljava/awt/Rectangle;Ljava/awt/Insets;Ljava/awt/Rectangle;Ljavax/swing/tree/TreePath;IZZZ)V
    //   637: aload #16
    //   639: getfield y : I
    //   642: aload #16
    //   644: getfield height : I
    //   647: iadd
    //   648: aload #5
    //   650: getfield y : I
    //   653: aload #5
    //   655: getfield height : I
    //   658: iadd
    //   659: if_icmplt -> 665
    //   662: goto -> 672
    //   665: iinc #14, 1
    //   668: iload_3
    //   669: ifeq -> 247
    //   672: iload #4
    //   674: ifeq -> 863
    //   677: aload_1
    //   678: invokestatic setRenderingHints : (Ljava/awt/Graphics;)[Ljava/lang/Object;
    //   681: astore #15
    //   683: aload #9
    //   685: invokevirtual iterator : ()Ljava/util/Iterator;
    //   688: astore #16
    //   690: aload #16
    //   692: invokeinterface hasNext : ()Z
    //   697: ifeq -> 728
    //   700: aload #16
    //   702: invokeinterface next : ()Ljava/lang/Object;
    //   707: checkcast javax/swing/tree/TreePath
    //   710: astore #17
    //   712: aload_0
    //   713: aload_1
    //   714: aload #5
    //   716: aload #8
    //   718: aload #17
    //   720: iconst_0
    //   721: invokevirtual paintVerticalPartOfLeg : (Ljava/awt/Graphics;Ljava/awt/Rectangle;Ljava/awt/Insets;Ljavax/swing/tree/TreePath;Z)V
    //   724: iload_3
    //   725: ifeq -> 690
    //   728: aload #10
    //   730: invokevirtual iterator : ()Ljava/util/Iterator;
    //   733: astore #16
    //   735: aload #16
    //   737: invokeinterface hasNext : ()Z
    //   742: ifeq -> 768
    //   745: aload #16
    //   747: invokeinterface next : ()Ljava/lang/Object;
    //   752: checkcast java/lang/Runnable
    //   755: astore #17
    //   757: aload #17
    //   759: invokeinterface run : ()V
    //   764: iload_3
    //   765: ifeq -> 735
    //   768: aload #15
    //   770: ifnull -> 779
    //   773: aload_1
    //   774: aload #15
    //   776: invokestatic resetRenderingHints : (Ljava/awt/Graphics;[Ljava/lang/Object;)V
    //   779: aload #11
    //   781: invokevirtual iterator : ()Ljava/util/Iterator;
    //   784: astore #16
    //   786: aload #16
    //   788: invokeinterface hasNext : ()Z
    //   793: ifeq -> 819
    //   796: aload #16
    //   798: invokeinterface next : ()Ljava/lang/Object;
    //   803: checkcast java/lang/Runnable
    //   806: astore #17
    //   808: aload #17
    //   810: invokeinterface run : ()V
    //   815: iload_3
    //   816: ifeq -> 786
    //   819: aload_0
    //   820: invokevirtual highlightSelectedPath : ()Z
    //   823: ifeq -> 863
    //   826: aload_0
    //   827: getfield tree : Ljavax/swing/JTree;
    //   830: invokevirtual getSelectionPath : ()Ljavax/swing/tree/TreePath;
    //   833: astore #16
    //   835: aload #16
    //   837: ifnull -> 863
    //   840: aload_0
    //   841: aload_1
    //   842: aload #5
    //   844: aload #8
    //   846: aload #16
    //   848: iconst_1
    //   849: invokevirtual paintVerticalPartOfLeg : (Ljava/awt/Graphics;Ljava/awt/Rectangle;Ljava/awt/Insets;Ljavax/swing/tree/TreePath;Z)V
    //   852: aload #16
    //   854: invokevirtual getParentPath : ()Ljavax/swing/tree/TreePath;
    //   857: astore #16
    //   859: iload_3
    //   860: ifeq -> 835
    //   863: aload_0
    //   864: aload_1
    //   865: invokevirtual paintDropLine : (Ljava/awt/Graphics;)V
    //   868: aload_0
    //   869: getfield rendererPane : Ljavax/swing/CellRendererPane;
    //   872: invokevirtual removeAll : ()V
    //   875: return
  }
  
  private static int calculateSpaceAfterBlob() {
    return (int)Zrt.ZH();
  }
  
  private static int calculateRoundedLineRadius() {
    return (int)Zrt.ZH();
  }
  
  private static int calculateHorizontalLineLength() {
    return (int)(Zrt.ZH() * 2.0F);
  }
  
  private int calculateRightChildIndent() {
    Icon icon = getExpandedIcon();
    int i = ((icon != null) ? icon.getIconWidth() : 0) + 2;
    byte b = useRoundedLines() ? this.spaceAfterBlob : 0;
    return this.horizontalLineLength + b + i;
  }
  
  private static int calculateBlobSize() {
    int i = (int)(Zrt.ZH() / 1.25F);
    if (i % 2 == 0)
      i++; 
    return i;
  }
  
  private void paintVerticalPartOfLeg(Graphics paramGraphics, Rectangle paramRectangle, Insets paramInsets, TreePath paramTreePath, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Zk : ()I
    //   3: istore #6
    //   5: aload_0
    //   6: invokevirtual useRoundedLines : ()Z
    //   9: ifne -> 13
    //   12: return
    //   13: aload #4
    //   15: invokevirtual getPathCount : ()I
    //   18: iload #5
    //   20: ifeq -> 27
    //   23: iconst_2
    //   24: goto -> 28
    //   27: iconst_1
    //   28: isub
    //   29: istore #7
    //   31: iload #7
    //   33: ifne -> 44
    //   36: aload_0
    //   37: invokevirtual isRootVisible : ()Z
    //   40: ifne -> 44
    //   43: return
    //   44: aload_3
    //   45: getfield left : I
    //   48: aload_0
    //   49: iload #7
    //   51: invokevirtual getVerticalLineX : (I)I
    //   54: iadd
    //   55: istore #8
    //   57: aload_2
    //   58: getfield x : I
    //   61: istore #9
    //   63: aload_2
    //   64: getfield x : I
    //   67: aload_2
    //   68: getfield width : I
    //   71: iconst_1
    //   72: isub
    //   73: iadd
    //   74: istore #10
    //   76: iload #8
    //   78: iload #9
    //   80: if_icmplt -> 386
    //   83: iload #8
    //   85: iload #10
    //   87: if_icmpgt -> 386
    //   90: aload_2
    //   91: getfield y : I
    //   94: istore #11
    //   96: aload_2
    //   97: getfield y : I
    //   100: aload_2
    //   101: getfield height : I
    //   104: iadd
    //   105: istore #12
    //   107: aload_0
    //   108: aload_0
    //   109: getfield tree : Ljavax/swing/JTree;
    //   112: iload #5
    //   114: ifeq -> 125
    //   117: aload #4
    //   119: invokevirtual getParentPath : ()Ljavax/swing/tree/TreePath;
    //   122: goto -> 127
    //   125: aload #4
    //   127: invokevirtual getPathBounds : (Ljavax/swing/JTree;Ljavax/swing/tree/TreePath;)Ljava/awt/Rectangle;
    //   130: astore #13
    //   132: aload_0
    //   133: aload_0
    //   134: getfield tree : Ljavax/swing/JTree;
    //   137: iload #5
    //   139: ifeq -> 147
    //   142: aload #4
    //   144: goto -> 153
    //   147: aload_0
    //   148: aload #4
    //   150: invokevirtual getLastChildPath : (Ljavax/swing/tree/TreePath;)Ljavax/swing/tree/TreePath;
    //   153: invokevirtual getPathBounds : (Ljavax/swing/JTree;Ljavax/swing/tree/TreePath;)Ljava/awt/Rectangle;
    //   156: astore #14
    //   158: aload #14
    //   160: ifnonnull -> 164
    //   163: return
    //   164: aload #13
    //   166: ifnonnull -> 190
    //   169: aload_3
    //   170: getfield top : I
    //   173: aload_0
    //   174: invokevirtual getVerticalLegBuffer : ()I
    //   177: iadd
    //   178: iload #11
    //   180: invokestatic max : (II)I
    //   183: istore #15
    //   185: iload #6
    //   187: ifeq -> 213
    //   190: aload #13
    //   192: getfield y : I
    //   195: aload #13
    //   197: getfield height : I
    //   200: iadd
    //   201: aload_0
    //   202: invokevirtual getVerticalLegBuffer : ()I
    //   205: iadd
    //   206: iload #11
    //   208: invokestatic max : (II)I
    //   211: istore #15
    //   213: iload #7
    //   215: ifne -> 314
    //   218: aload_0
    //   219: invokevirtual isRootVisible : ()Z
    //   222: ifne -> 314
    //   225: aload_0
    //   226: invokevirtual getModel : ()Ljavax/swing/tree/TreeModel;
    //   229: astore #16
    //   231: aload #16
    //   233: ifnull -> 314
    //   236: aload #16
    //   238: invokeinterface getRoot : ()Ljava/lang/Object;
    //   243: astore #17
    //   245: aload #16
    //   247: aload #17
    //   249: invokeinterface getChildCount : (Ljava/lang/Object;)I
    //   254: ifle -> 314
    //   257: aload_0
    //   258: aload_0
    //   259: getfield tree : Ljavax/swing/JTree;
    //   262: aload #4
    //   264: aload #16
    //   266: aload #17
    //   268: iconst_0
    //   269: invokeinterface getChild : (Ljava/lang/Object;I)Ljava/lang/Object;
    //   274: invokevirtual pathByAddingChild : (Ljava/lang/Object;)Ljavax/swing/tree/TreePath;
    //   277: invokevirtual getPathBounds : (Ljavax/swing/JTree;Ljavax/swing/tree/TreePath;)Ljava/awt/Rectangle;
    //   280: astore #13
    //   282: aload #13
    //   284: ifnull -> 314
    //   287: aload_3
    //   288: getfield top : I
    //   291: aload_0
    //   292: invokevirtual getVerticalLegBuffer : ()I
    //   295: iadd
    //   296: aload #13
    //   298: getfield y : I
    //   301: aload #13
    //   303: getfield height : I
    //   306: iconst_2
    //   307: idiv
    //   308: iadd
    //   309: invokestatic max : (II)I
    //   312: istore #15
    //   314: aload #14
    //   316: getfield y : I
    //   319: aload #14
    //   321: getfield height : I
    //   324: iconst_2
    //   325: idiv
    //   326: iadd
    //   327: iload #12
    //   329: invokestatic min : (II)I
    //   332: istore #16
    //   334: iload #15
    //   336: iload #16
    //   338: if_icmpgt -> 386
    //   341: iload #16
    //   343: iload #12
    //   345: if_icmpge -> 352
    //   348: iconst_1
    //   349: goto -> 353
    //   352: iconst_0
    //   353: istore #17
    //   355: iload #17
    //   357: ifeq -> 367
    //   360: aload_0
    //   361: getfield roundedLineRadius : I
    //   364: goto -> 368
    //   367: iconst_0
    //   368: istore #18
    //   370: aload_0
    //   371: aload_1
    //   372: iload #8
    //   374: iload #15
    //   376: iload #16
    //   378: iload #18
    //   380: isub
    //   381: iload #5
    //   383: invokevirtual paintVerticalLine : (Ljava/awt/Graphics;IIIZ)V
    //   386: return
  }
  
  protected void paintHorizontalPartOfLeg(Graphics paramGraphics, Rectangle paramRectangle1, Insets paramInsets, Rectangle paramRectangle2, TreePath paramTreePath, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    if (!useRoundedLines())
      return; 
    int i = paramTreePath.getPathCount() - 1;
    int j = paramRectangle1.x;
    int k = paramRectangle1.x + paramRectangle1.width;
    int m = paramRectangle1.y;
    int n = paramRectangle1.y + paramRectangle1.height;
    int i1 = paramRectangle2.y + paramRectangle2.height / 2;
    boolean bool = (i == 0 || (i == 1 && !isRootVisible())) ? true : false;
    int i2 = paramRectangle2.x - this.rightChildIndent;
    int i3 = paramRectangle2.x - getHorizontalLegBuffer();
    if (i1 >= m && i1 < n && i3 >= j && i2 < k && i2 < i3) {
      Object object = paramTreePath.getLastPathComponent();
      boolean bool1 = false;
      boolean bool2 = false;
      if (highlightSelectedPath()) {
        TreePath treePath = this.tree.getSelectionPath();
        if (treePath != null) {
          bool1 = (object == treePath.getLastPathComponent()) ? true : false;
          bool2 = (bool1 || isNodeOnPath(treePath, object)) ? true : false;
        } 
      } 
      int i4 = i2 + this.horizontalLineLength + (paramBoolean3 ? leafNodeAdjustment() : 0);
      paintHorizontalLine(paramGraphics, i1, i2, i4, paramBoolean1, paramRectangle2.y + paramRectangle2.height - 1, bool, bool1, bool2);
    } 
  }
  
  private int leafNodeAdjustment() {
    return this.spaceAfterBlob + this.expandedIcon.getIconWidth() / 2;
  }
  
  private void paintVerticalLine(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    Color color = paramGraphics.getColor();
    try {
      paramGraphics.setColor(paramBoolean ? this.selectedLineColour : this.lineColour);
      paramGraphics.drawLine(paramInt1, paramInt2, paramInt1, paramInt3);
    } finally {
      paramGraphics.setColor(color);
    } 
  }
  
  private void paintHorizontalLine(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, int paramInt4, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    ((Graphics2D)paramGraphics).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    Color color = paramGraphics.getColor();
    try {
      if (!paramBoolean2) {
        paramGraphics.setColor(paramBoolean4 ? this.selectedLineColour : this.lineColour);
        paramGraphics.drawArc(paramInt2, paramInt1 - this.roundedLineRadius * 2, this.roundedLineRadius * 2, this.roundedLineRadius * 2, -90, -90);
        paramGraphics.drawLine(paramInt2 + this.roundedLineRadius, paramInt1, paramInt3, paramInt1);
      } 
      if (paramBoolean1) {
        paramGraphics.setColor((paramBoolean4 && !paramBoolean3) ? this.selectedLineColour : this.lineColour);
        paramGraphics.drawLine(paramInt3, paramInt1, paramInt3, paramInt4);
      } 
      if (!paramBoolean2 || paramBoolean1) {
        paramGraphics.setColor(paramBoolean4 ? this.selectedLineColour : this.lineColour);
        paramGraphics.fillOval(paramInt3 - this.blobSize / 2, paramInt1 - this.blobSize / 2, this.blobSize, this.blobSize);
      } 
    } finally {
      paramGraphics.setColor(color);
    } 
  }
  
  protected void paintExpandControl(Graphics paramGraphics, Rectangle paramRectangle1, Insets paramInsets, Rectangle paramRectangle2, TreePath paramTreePath, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    // Byte code:
    //   0: invokestatic ZL : ()I
    //   3: istore #10
    //   5: aload #5
    //   7: invokevirtual getLastPathComponent : ()Ljava/lang/Object;
    //   10: astore #11
    //   12: iload #9
    //   14: ifne -> 127
    //   17: iload #8
    //   19: ifeq -> 36
    //   22: aload_0
    //   23: getfield treeModel : Ljavax/swing/tree/TreeModel;
    //   26: aload #11
    //   28: invokeinterface getChildCount : (Ljava/lang/Object;)I
    //   33: ifle -> 127
    //   36: aload_0
    //   37: invokevirtual getExpandedIcon : ()Ljavax/swing/Icon;
    //   40: astore #12
    //   42: aload #4
    //   44: getfield x : I
    //   47: iconst_2
    //   48: isub
    //   49: aload #12
    //   51: invokeinterface getIconWidth : ()I
    //   56: iconst_2
    //   57: idiv
    //   58: isub
    //   59: istore #13
    //   61: aload #4
    //   63: getfield y : I
    //   66: aload #4
    //   68: getfield height : I
    //   71: iconst_2
    //   72: idiv
    //   73: iadd
    //   74: istore #14
    //   76: iload #7
    //   78: ifeq -> 101
    //   81: aload_0
    //   82: aload_0
    //   83: getfield tree : Ljavax/swing/JTree;
    //   86: aload_1
    //   87: aload #12
    //   89: iload #13
    //   91: iload #14
    //   93: invokevirtual drawCentered : (Ljava/awt/Component;Ljava/awt/Graphics;Ljavax/swing/Icon;II)V
    //   96: iload #10
    //   98: ifne -> 127
    //   101: aload_0
    //   102: invokevirtual getCollapsedIcon : ()Ljavax/swing/Icon;
    //   105: astore #15
    //   107: aload #15
    //   109: ifnull -> 127
    //   112: aload_0
    //   113: aload_0
    //   114: getfield tree : Ljavax/swing/JTree;
    //   117: aload_1
    //   118: aload #15
    //   120: iload #13
    //   122: iload #14
    //   124: invokevirtual drawCentered : (Ljava/awt/Component;Ljava/awt/Graphics;Ljavax/swing/Icon;II)V
    //   127: return
  }
  
  protected boolean isLocationInExpandControl(TreePath paramTreePath, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZL : ()I
    //   3: istore #4
    //   5: aload_1
    //   6: ifnull -> 133
    //   9: aload_0
    //   10: getfield treeModel : Ljavax/swing/tree/TreeModel;
    //   13: aload_1
    //   14: invokevirtual getLastPathComponent : ()Ljava/lang/Object;
    //   17: invokeinterface isLeaf : (Ljava/lang/Object;)Z
    //   22: ifne -> 133
    //   25: aload_0
    //   26: getfield tree : Ljavax/swing/JTree;
    //   29: invokevirtual getInsets : ()Ljava/awt/Insets;
    //   32: astore #6
    //   34: aload_0
    //   35: invokevirtual getExpandedIcon : ()Ljavax/swing/Icon;
    //   38: ifnull -> 57
    //   41: aload_0
    //   42: invokevirtual getExpandedIcon : ()Ljavax/swing/Icon;
    //   45: invokeinterface getIconWidth : ()I
    //   50: istore #5
    //   52: iload #4
    //   54: ifne -> 61
    //   57: bipush #8
    //   59: istore #5
    //   61: aload_0
    //   62: aload_0
    //   63: getfield tree : Ljavax/swing/JTree;
    //   66: aload_1
    //   67: invokevirtual getRowForPath : (Ljavax/swing/tree/TreePath;)I
    //   70: aload_1
    //   71: invokevirtual getPathCount : ()I
    //   74: iconst_1
    //   75: isub
    //   76: invokevirtual getRowX : (II)I
    //   79: istore #7
    //   81: aload #6
    //   83: getfield left : I
    //   86: iload #7
    //   88: iadd
    //   89: iconst_2
    //   90: isub
    //   91: istore #8
    //   93: iload #8
    //   95: iload #5
    //   97: isub
    //   98: istore #9
    //   100: iload #5
    //   102: i2f
    //   103: ldc 0.2
    //   105: fmul
    //   106: f2i
    //   107: istore #10
    //   109: iload_2
    //   110: iload #9
    //   112: iload #10
    //   114: isub
    //   115: if_icmplt -> 131
    //   118: iload_2
    //   119: iload #8
    //   121: iload #10
    //   123: iadd
    //   124: if_icmpge -> 131
    //   127: iconst_1
    //   128: goto -> 132
    //   131: iconst_0
    //   132: ireturn
    //   133: iconst_0
    //   134: ireturn
  }
  
  protected int getRowX(int paramInt1, int paramInt2) {
    return (--paramInt2 < 1) ? (this.rightChildIndent - this.horizontalLineLength) : (this.horizontalLineLength * (paramInt2 - 1 + this.depthOffset) + this.rightChildIndent);
  }
  
  private int getVerticalLineX(int paramInt) {
    return (--paramInt < 1) ? 0 : (this.horizontalLineLength * (paramInt + this.depthOffset));
  }
  
  private boolean shouldPaintExpandControl(int paramInt1, int paramInt2) {
    return isLeaf(paramInt1) ? false : (((paramInt2 != 0 && (paramInt2 != 1 || isRootVisible())) || getShowsRootHandles()));
  }
  
  private boolean isNodeOnPath(TreePath paramTreePath, Object paramObject) {
    int i = BurpTableUI.Zk();
    byte b = 0;
    while (b < paramTreePath.getPathCount()) {
      if (paramTreePath.getPathComponent(b) == paramObject)
        return true; 
      b++;
      if (i != 0)
        break; 
    } 
    return false;
  }
  
  private boolean useRoundedLines() {
    return getBooleanProperty(a(-26391, 3216));
  }
  
  private boolean highlightSelectedPath() {
    return getBooleanProperty(a(-26392, -6903));
  }
  
  private boolean getBooleanProperty(String paramString) {
    Object object = (this.tree != null) ? this.tree.getClientProperty(paramString) : Boolean.valueOf(false);
    return (object instanceof Boolean && ((Boolean)object).booleanValue());
  }
  
  private void lambda$paint$1(Graphics paramGraphics, Rectangle paramRectangle1, Insets paramInsets, Rectangle paramRectangle2, TreePath paramTreePath, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    paintExpandControl(paramGraphics, paramRectangle1, paramInsets, paramRectangle2, paramTreePath, paramInt, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  private void lambda$paint$0(Graphics paramGraphics, Rectangle paramRectangle1, Insets paramInsets, Rectangle paramRectangle2, TreePath paramTreePath, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    paintHorizontalPartOfLeg(paramGraphics, paramRectangle1, paramInsets, paramRectangle2, paramTreePath, paramInt, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Îñ$ë;%WÍ0Ð×:ÉIUVù7êYÏ±P¿àÎ»ËÒca&ò¥S¨Ý+'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #18
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #99
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic burp/theme/BurpTreeUI.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/theme/BurpTreeUI.b : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #109
    //   154: goto -> 184
    //   157: bipush #56
    //   159: goto -> 184
    //   162: bipush #39
    //   164: goto -> 184
    //   167: bipush #102
    //   169: goto -> 184
    //   172: bipush #13
    //   174: goto -> 184
    //   177: bipush #124
    //   179: goto -> 184
    //   182: bipush #37
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF98E9) & 0xFFFF;
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
      byte b1 = 50;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\BurpTreeUI.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */