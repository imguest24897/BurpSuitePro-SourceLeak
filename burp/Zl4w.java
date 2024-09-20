package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class Zl4w extends Zl04 {
  private final Window ZQ;
  
  private final DefaultTreeModel Zn;
  
  private final DefaultListModel<Zg3w> ZW;
  
  private final Zic ZL;
  
  private final Zt9t Zl;
  
  private final Zbqc Zg;
  
  private final Zen4 Zt;
  
  private TreePath Zy;
  
  private Zgf8 ZP;
  
  private Zo5 ZV;
  
  private Zms0 ZI;
  
  private Zbc9 Zi;
  
  private Zbqc Zu;
  
  private Zgoh Zo;
  
  private Zz8s ZE;
  
  private Zz8s ZU;
  
  private boolean ZF;
  
  private static Zbqc[] ZK;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zl4w(Window paramWindow, Zic paramZic, Zen4 paramZen4) {
    this.ZQ = paramWindow;
    this.ZL = paramZic;
    this.Zt = paramZen4;
    this.Zl = new Zt9t(this);
    this.Zn = new DefaultTreeModel(new DefaultMutableTreeNode(a(23913, 1362)));
    this.ZW = new DefaultListModel<>();
    this.Zg = Zltn.ZK(Zgzq.NO_SEARCH_RESULTS_ICON, a(23926, 31506)).Za(a(23909, -1968)).ZC(40).Zi();
    setTitle(a(23923, 6997));
    setName(a(23921, -19055));
  }
  
  public void Zh() {
    Zc();
    Toolkit.getDefaultToolkit().addAWTEventListener(new Zmag(this), 24L);
    this.ZV.addTreeSelectionListener(new Zzlf(this));
    this.Zl.Zc(null);
    Zg3w zg3w = new Zg3w(a(23912, 24673), Zznm.FILL);
    zg3w.Zy(this.ZL.ZU());
    this.Zi.add(zg3w.ZU());
    this.ZW.addElement(zg3w);
    this.ZI.addListSelectionListener(new Zr_a(this));
  }
  
  public void Zi(Zs70 paramZs70) {
    // Byte code:
    //   0: invokestatic ZS : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: invokestatic isEventDispatchThread : ()Z
    //   7: ifeq -> 19
    //   10: aload_0
    //   11: aload_1
    //   12: invokevirtual ZA : (Lburp/Zs70;)V
    //   15: aload_2
    //   16: ifnull -> 29
    //   19: aload_0
    //   20: aload_1
    //   21: <illegal opcode> run : (Lburp/Zl4w;Lburp/Zs70;)Ljava/lang/Runnable;
    //   26: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   29: return
  }
  
  private void ZA(Zs70 paramZs70) {
    Zbqc[] arrayOfZbqc = ZS();
    TreePath treePath = Zk(paramZs70);
    if (treePath != null && this.ZV.isPathSelected(treePath)) {
      this.ZP.selectAll();
      if (arrayOfZbqc != null) {
        this.ZP.ZH();
        treePath = Zk(paramZs70);
        this.ZV.setSelectionPath(treePath);
        return;
      } 
      return;
    } 
    this.ZP.ZH();
    treePath = Zk(paramZs70);
    this.ZV.setSelectionPath(treePath);
  }
  
  private TreePath Zk(Zs70 paramZs70) {
    TreeModel treeModel = this.ZV.getModel();
    DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)treeModel.getRoot();
    ArrayList<DefaultMutableTreeNode> arrayList = new ArrayList();
    arrayList.add(defaultMutableTreeNode);
    Iterator<String> iterator = paramZs70.ZB().iterator();
    Zbqc[] arrayOfZbqc = ZS();
    while (iterator.hasNext()) {
      String str = iterator.next();
      DefaultMutableTreeNode defaultMutableTreeNode1 = ZK(defaultMutableTreeNode, str);
      if (defaultMutableTreeNode1 == null)
        return null; 
      defaultMutableTreeNode = defaultMutableTreeNode1;
      arrayList.add(defaultMutableTreeNode1);
      if (arrayOfZbqc != null)
        break; 
    } 
    return new TreePath(arrayList.toArray());
  }
  
  public void Zm() {
    this.ZP.ZH();
    this.ZI.setSelectedIndex(0);
  }
  
  public void setVisible(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZS : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: invokestatic isEventDispatchThread : ()Z
    //   7: ifeq -> 19
    //   10: aload_0
    //   11: iload_1
    //   12: invokevirtual ZI : (Z)V
    //   15: aload_2
    //   16: ifnull -> 29
    //   19: aload_0
    //   20: iload_1
    //   21: <illegal opcode> run : (Lburp/Zl4w;Z)Ljava/lang/Runnable;
    //   26: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   29: return
  }
  
  private void ZI(boolean paramBoolean) {
    this.ZP.selectAll();
    if (paramBoolean) {
      if (!this.ZF) {
        Zmse.Zf(this, 190, 50);
        pack();
        ZO(this.ZQ);
        this.ZF = true;
      } 
      this.ZP.Ze();
    } 
    super.setVisible(paramBoolean);
  }
  
  private void Zc() {
    // Byte code:
    //   0: aload_0
    //   1: new burp/Zgf8
    //   4: dup
    //   5: invokespecial <init> : ()V
    //   8: putfield ZP : Lburp/Zgf8;
    //   11: aload_0
    //   12: getfield ZP : Lburp/Zgf8;
    //   15: aload_0
    //   16: getfield Zl : Lburp/Zt9t;
    //   19: invokevirtual ZR : (Lburp/Zm6a;)V
    //   22: aload_0
    //   23: getfield ZP : Lburp/Zgf8;
    //   26: getstatic burp/Zlkk.TABLE_BACKGROUND : Lburp/Zlkk;
    //   29: invokevirtual Zu : (Lburp/Zlkk;)V
    //   32: aload_0
    //   33: getfield ZP : Lburp/Zgf8;
    //   36: sipush #23922
    //   39: sipush #32401
    //   42: invokestatic a : (II)Ljava/lang/String;
    //   45: invokevirtual setName : (Ljava/lang/String;)V
    //   48: aload_0
    //   49: sipush #23934
    //   52: sipush #-19173
    //   55: invokestatic a : (II)Ljava/lang/String;
    //   58: iconst_1
    //   59: invokevirtual ZC : (Ljava/lang/String;Z)Lburp/Zz8s;
    //   62: astore_1
    //   63: aload_0
    //   64: aload_0
    //   65: sipush #23917
    //   68: sipush #-16744
    //   71: invokestatic a : (II)Ljava/lang/String;
    //   74: invokevirtual ZR : (Ljava/lang/String;)Lburp/Zz8s;
    //   77: putfield ZE : Lburp/Zz8s;
    //   80: aload_0
    //   81: aload_0
    //   82: sipush #23911
    //   85: sipush #26164
    //   88: invokestatic a : (II)Ljava/lang/String;
    //   91: invokevirtual ZR : (Ljava/lang/String;)Lburp/Zz8s;
    //   94: putfield ZU : Lburp/Zz8s;
    //   97: new burp/Zgoe
    //   100: dup
    //   101: invokespecial <init> : ()V
    //   104: astore_2
    //   105: aload_2
    //   106: aload_1
    //   107: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   110: pop
    //   111: aload_2
    //   112: aload_0
    //   113: getfield ZE : Lburp/Zz8s;
    //   116: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   119: pop
    //   120: aload_2
    //   121: aload_0
    //   122: getfield ZU : Lburp/Zz8s;
    //   125: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   128: pop
    //   129: aload_2
    //   130: getstatic burp/Zlkk.TABLE_BACKGROUND : Lburp/Zlkk;
    //   133: invokevirtual Zl : (Lburp/Zlkk;)V
    //   136: aload_0
    //   137: invokevirtual ZC : ()Lburp/Zbqc;
    //   140: astore_3
    //   141: aload_0
    //   142: getfield Zt : Lburp/Zen4;
    //   145: aload_0
    //   146: invokevirtual ZS : (Ljava/awt/Window;)Lburp/Zztv;
    //   149: astore #4
    //   151: aload_0
    //   152: getfield Zt : Lburp/Zen4;
    //   155: aload_0
    //   156: invokevirtual ZM : (Ljava/awt/Window;)Lburp/Zztv;
    //   159: astore #5
    //   161: aload #4
    //   163: sipush #23919
    //   166: sipush #-31376
    //   169: invokestatic a : (II)Ljava/lang/String;
    //   172: invokevirtual setName : (Ljava/lang/String;)V
    //   175: aload #5
    //   177: sipush #23927
    //   180: sipush #27168
    //   183: invokestatic a : (II)Ljava/lang/String;
    //   186: invokevirtual setName : (Ljava/lang/String;)V
    //   189: new burp/Zkj9
    //   192: dup
    //   193: invokespecial <init> : ()V
    //   196: astore #6
    //   198: aload #6
    //   200: sipush #23931
    //   203: sipush #19456
    //   206: invokestatic a : (II)Ljava/lang/String;
    //   209: invokevirtual setName : (Ljava/lang/String;)V
    //   212: aload #6
    //   214: aload #4
    //   216: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   219: pop
    //   220: aload #6
    //   222: aload #5
    //   224: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   227: pop
    //   228: new burp/Zm9t
    //   231: dup
    //   232: invokespecial <init> : ()V
    //   235: astore #7
    //   237: aload #7
    //   239: sipush #23933
    //   242: sipush #25653
    //   245: invokestatic a : (II)Ljava/lang/String;
    //   248: getstatic burp/Zeuf.OPTIONS : Lburp/Zeuf;
    //   251: getstatic burp/Zlkk.ACTION_NORMAL : Lburp/Zlkk;
    //   254: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   257: getstatic burp/Zlkk.ACTION_HOVER : Lburp/Zlkk;
    //   260: invokevirtual ZG : (Lburp/Zlkk;)Lburp/Ze3m;
    //   263: getstatic burp/Zlkk.ACTION_PRESSED : Lburp/Zlkk;
    //   266: invokevirtual Zc : (Lburp/Zlkk;)Lburp/Ze3m;
    //   269: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   272: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   275: invokevirtual Z_ : ()Lburp/Ze9n;
    //   278: sipush #23935
    //   281: sipush #-18985
    //   284: invokestatic a : (II)Ljava/lang/String;
    //   287: aload #6
    //   289: aload #7
    //   291: <illegal opcode> accept : (Lburp/Zkj9;Lburp/Zm9t;)Ljava/util/function/Consumer;
    //   296: invokevirtual ZO : (Ljava/lang/String;Lburp/Ze9n;Ljava/lang/String;Ljava/util/function/Consumer;)V
    //   299: aload #7
    //   301: iconst_2
    //   302: invokevirtual setHorizontalTextPosition : (I)V
    //   305: aload #7
    //   307: sipush #23916
    //   310: sipush #-10335
    //   313: invokestatic a : (II)Ljava/lang/String;
    //   316: invokevirtual setName : (Ljava/lang/String;)V
    //   319: aload #7
    //   321: getstatic burp/Zlkk.TABLE_BACKGROUND : Lburp/Zlkk;
    //   324: invokevirtual ZO : (Lburp/Zlkk;)V
    //   327: aload #7
    //   329: getstatic burp/Zlkk.TABLE_BACKGROUND : Lburp/Zlkk;
    //   332: invokevirtual ZD : (Lburp/Zlkk;)V
    //   335: aload_0
    //   336: new burp/Zgoh
    //   339: dup
    //   340: invokespecial <init> : ()V
    //   343: putfield Zo : Lburp/Zgoh;
    //   346: aload_0
    //   347: getfield Zo : Lburp/Zgoh;
    //   350: sipush #23925
    //   353: sipush #10183
    //   356: invokestatic a : (II)Ljava/lang/String;
    //   359: invokevirtual setName : (Ljava/lang/String;)V
    //   362: aload_0
    //   363: getfield Zo : Lburp/Zgoh;
    //   366: getstatic burp/Zlkk.TABLE_BACKGROUND : Lburp/Zlkk;
    //   369: invokevirtual Zl : (Lburp/Zlkk;)V
    //   372: new burp/Zbqc
    //   375: dup
    //   376: new java/awt/BorderLayout
    //   379: dup
    //   380: invokespecial <init> : ()V
    //   383: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   386: astore #8
    //   388: aload #8
    //   390: bipush #10
    //   392: bipush #20
    //   394: bipush #10
    //   396: bipush #10
    //   398: invokestatic createEmptyBorder : (IIII)Ljavax/swing/border/Border;
    //   401: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   404: aload #8
    //   406: aload_0
    //   407: getfield Zo : Lburp/Zgoh;
    //   410: sipush #23915
    //   413: sipush #10394
    //   416: invokestatic a : (II)Ljava/lang/String;
    //   419: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   422: aload #8
    //   424: getstatic burp/Zlkk.TABLE_BACKGROUND : Lburp/Zlkk;
    //   427: invokevirtual Zl : (Lburp/Zlkk;)V
    //   430: aload_0
    //   431: new burp/Zbc9
    //   434: dup
    //   435: invokespecial <init> : ()V
    //   438: putfield Zi : Lburp/Zbc9;
    //   441: aload_0
    //   442: getfield Zi : Lburp/Zbc9;
    //   445: aload_0
    //   446: getfield Zg : Lburp/Zbqc;
    //   449: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   452: pop
    //   453: aload_0
    //   454: new burp/Zbqc
    //   457: dup
    //   458: new java/awt/GridBagLayout
    //   461: dup
    //   462: invokespecial <init> : ()V
    //   465: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   468: putfield Zu : Lburp/Zbqc;
    //   471: aload_0
    //   472: getfield Zu : Lburp/Zbqc;
    //   475: getstatic burp/Zlkk.TABLE_BACKGROUND : Lburp/Zlkk;
    //   478: invokevirtual Zl : (Lburp/Zlkk;)V
    //   481: aload_0
    //   482: aload_0
    //   483: getfield ZP : Lburp/Zgf8;
    //   486: invokevirtual Zo : (Lburp/Zgf8;)V
    //   489: aload_0
    //   490: aload_2
    //   491: invokevirtual Zv : (Lburp/Zgoe;)V
    //   494: aload_0
    //   495: aload_3
    //   496: invokevirtual Zo : (Lburp/Zbqc;)V
    //   499: aload_0
    //   500: invokevirtual Ze : ()V
    //   503: aload_0
    //   504: aload #8
    //   506: invokevirtual Zg : (Lburp/Zbqc;)V
    //   509: aload_0
    //   510: aload_0
    //   511: getfield Zi : Lburp/Zbc9;
    //   514: invokevirtual ZB : (Lburp/Zbc9;)V
    //   517: aload_0
    //   518: aload #7
    //   520: invokevirtual ZZ : (Lburp/Zm9t;)V
    //   523: aload_0
    //   524: aload_0
    //   525: getfield Zu : Lburp/Zbqc;
    //   528: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   531: pop
    //   532: return
  }
  
  private Zz8s ZR(String paramString) {
    return ZC(paramString, false);
  }
  
  private Zz8s ZC(String paramString, boolean paramBoolean) {
    Zz81 zz81 = new Zz81(paramString, paramBoolean, true);
    zz81.addItemListener(this::lambda$buildFilterButton$3);
    return zz81;
  }
  
  private Zbqc ZC() {
    Zbqc zbqc1 = new Zbqc(new GridBagLayout());
    zbqc1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    zbqc1.Zl(Zlkk.TABLE_BACKGROUND);
    this.ZV = new Zo5(this.Zn);
    this.ZV.setName(a(23930, -18465));
    this.ZV.Z_(Zlkk.TABLE_BACKGROUND);
    Zem9 zem9 = new Zem9(0);
    Zbqc zbqc2 = new Zbqc(new BorderLayout());
    zbqc2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    zbqc2.Zl(Zlkk.TABLE_BACKGROUND);
    zbqc2.add(zem9, a(23932, 20976));
    this.ZI = new Zms0(this.ZW);
    this.ZI.setName(a(23914, -15128));
    this.ZI.Zc(Zlkk.TABLE_BACKGROUND);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    zbqc1.add(this.ZV, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.fill = 1;
    zbqc1.add(zbqc2, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weighty = 1.0D;
    zbqc1.add(this.ZI, gridBagConstraints);
    return zbqc1;
  }
  
  private void Zo(Zgf8 paramZgf8) {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new Insets(10, 20, 10, 20);
    gridBagConstraints.fill = 2;
    this.Zu.add(paramZgf8, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = 2;
    this.Zu.add(new Zem9(), gridBagConstraints);
  }
  
  private void Zv(Zgoe paramZgoe) {
    Zbqc zbqc1 = new Zbqc(new BorderLayout(20, 0));
    zbqc1.Zl(Zlkk.TABLE_BACKGROUND);
    Ze9n ze9n1 = Ze3m.ZC(Zeuf.EXPAND_ALL, Zlkk.ACTION_NORMAL).ZU(Zmcx.LARGE_LINE_SIZE).ZG(Zlkk.ACTION_HOVER).Z_();
    Ze9n ze9n2 = Ze3m.ZC(Zeuf.COLLAPSE_ALL, Zlkk.ACTION_NORMAL).ZU(Zmcx.LARGE_LINE_SIZE).ZG(Zlkk.ACTION_HOVER).Z_();
    Zm9t zm9t1 = new Zm9t();
    zm9t1.setName(a(23920, 8589));
    zm9t1.Zv(ze9n1, a(23928, 6588), this::lambda$addFilterButtonBar$4);
    zm9t1.ZO(Zlkk.TABLE_BACKGROUND);
    zm9t1.ZD(Zlkk.TABLE_BACKGROUND);
    Zm9t zm9t2 = new Zm9t();
    zm9t2.setName(a(23918, -24542));
    zm9t2.Zv(ze9n2, a(23908, -31426), this::lambda$addFilterButtonBar$5);
    zm9t2.ZO(Zlkk.TABLE_BACKGROUND);
    zm9t2.ZD(Zlkk.TABLE_BACKGROUND);
    Zbqc zbqc2 = new Zbqc(new GridLayout(1, 0, 10, 0));
    zbqc2.Zl(Zlkk.TABLE_BACKGROUND);
    zbqc2.add(zm9t1);
    zbqc2.add(zm9t2);
    zbqc1.add(paramZgoe, a(23924, -26319));
    zbqc1.add(zbqc2, a(23929, 17217));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.insets = new Insets(10, 20, 10, 20);
    gridBagConstraints.fill = 2;
    this.Zu.add(zbqc1, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = 2;
    this.Zu.add(new Zem9(), gridBagConstraints);
  }
  
  private void Zo(Zbqc paramZbqc) {
    Zbup zbup = new Zbup();
    zbup.setBorder(BorderFactory.createEmptyBorder());
    zbup.setViewportView(paramZbqc);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.weighty = 1.0D;
    gridBagConstraints.fill = 1;
    this.Zu.add(zbup, gridBagConstraints);
  }
  
  private void Ze() {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 7;
    gridBagConstraints.fill = 3;
    this.Zu.add(new Zem9(1), gridBagConstraints);
  }
  
  private void Zg(Zbqc paramZbqc) {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.fill = 2;
    this.Zu.add(paramZbqc, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = 2;
    this.Zu.add(new Zem9(), gridBagConstraints);
  }
  
  private void ZB(Zbc9 paramZbc9) {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.gridheight = 5;
    gridBagConstraints.fill = 1;
    this.Zu.add(paramZbc9, gridBagConstraints);
  }
  
  private void ZZ(Zm9t paramZm9t) {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new Insets(0, 0, 0, 15);
    this.Zu.add(paramZm9t, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = 2;
    this.Zu.add(new Zem9(), gridBagConstraints);
  }
  
  private static DefaultMutableTreeNode ZK(DefaultMutableTreeNode paramDefaultMutableTreeNode, String paramString) {
    Zbqc[] arrayOfZbqc = ZS();
    byte b = 0;
    while (b < paramDefaultMutableTreeNode.getChildCount()) {
      DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)paramDefaultMutableTreeNode.getChildAt(b);
      Zg3w zg3w = (Zg3w)defaultMutableTreeNode.getUserObject();
      if (Objects.equals(paramString, zg3w.ZM()))
        return defaultMutableTreeNode; 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return null;
  }
  
  private Zg29 Zi() {
    return this.ZE.isSelected() ? Zg29.USER : (this.ZU.isSelected() ? Zg29.PROJECT : Zg29.USER_AND_PROJECT);
  }
  
  private void lambda$addFilterButtonBar$5() {
    this.ZV.Zs();
  }
  
  private void lambda$addFilterButtonBar$4() {
    this.ZV.Zp();
  }
  
  private void lambda$buildFilterButton$3(ItemEvent paramItemEvent) {
    if (paramItemEvent.getStateChange() == 1)
      this.Zl.Zc(this.ZP.getText()); 
  }
  
  private static void lambda$initComponents$2(Zkj9 paramZkj9, Zm9t paramZm9t, MouseEvent paramMouseEvent) {
    SwingUtilities.updateComponentTreeUI(paramZkj9);
    paramZkj9.show(paramZm9t, paramZm9t.getWidth() + 2, 0);
  }
  
  private void lambda$setVisible$1(boolean paramBoolean) {
    ZI(paramBoolean);
  }
  
  private void lambda$selectPath$0(Zs70 paramZs70) {
    ZA(paramZs70);
  }
  
  public static void Zh(Zbqc[] paramArrayOfZbqc) {
    ZK = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZS() {
    return ZK;
  }
  
  static {
    // Byte code:
    //   0: bipush #27
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ý¸Ôûo±TÓs-=Øùë· Tr»ÕôK:°ììÚö·+8ÜâbYùE@qø¦bv>ÿ\ÌG}(2z¿\\nÉ¯E#« ·í6í5ã±ç[ix<%\\n>\\fküÏíÈ&n]&ºõëè\\f:\\fÚÛâÆHPt¨ü$é.³ïûv%@9ïÌ£Áo|)ÂZÐ6¸´&\\r©4&îG¢D)*Wtqù·u{»Ô\\t}'+hßýÍ×«Ì)"±8\}STìOÉ¶¶G´·ëè~;ýÍ\-ÄÏ6S²,ë·q}Çå¢PÜw9\\b¯æöýác´4P·§`å&1HvuÌVÆ^Lí\\bü43ûÄ\\r©:¢ÉH&»<¦Û%Ù©Óú$ÿ;/ï_aÚ·6cÕ}"\\t½\ù¤\\nÿ=!&qp¦svÿAÃõÚó÷\ºÙ ¢NÙÙêî&D¸Ó¥@¸jó?O|RZÇÁ¿ÙbL`Ùáù}MÃM\Ü\\bó0Ò{ø.8\\b%@CÁ\#åç1¥\\tÉyÎ«î}H¼½2âã:r7çHÆ«ø?²*ñK'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: aconst_null
    //   19: bipush #22
    //   21: istore_1
    //   22: invokestatic Zh : ([Lburp/Zbqc;)V
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #26
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc 'EnÏ =J×\p?øQÝå'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #12
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #83
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zl4w.a : [Ljava/lang/String;
    //   136: bipush #27
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zl4w.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #21
    //   218: goto -> 248
    //   221: bipush #45
    //   223: goto -> 248
    //   226: bipush #26
    //   228: goto -> 248
    //   231: bipush #60
    //   233: goto -> 248
    //   236: bipush #43
    //   238: goto -> 248
    //   241: bipush #56
    //   243: goto -> 248
    //   246: bipush #46
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5D7D) & 0xFFFF;
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
      byte b1 = 3;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl4w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */