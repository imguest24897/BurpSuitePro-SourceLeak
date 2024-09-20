package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import net.portswigger.Zm2;

class Zbvd extends Zbqc implements Zzyl {
  private static final Ze9n Zw;
  
  private static final Ze9n Zg;
  
  private final Window Zr;
  
  private final Ztq1 ZV;
  
  private final Zemk Zq;
  
  private final Zzjc ZF;
  
  private final Zxf5 Z_;
  
  private final Consumer<Zmo3> Za;
  
  private final Zbvc Zu;
  
  private final Zxa8 ZG;
  
  private final Zxjd ZO;
  
  private Zmo3 ZU;
  
  private int ZE;
  
  private Ze01 ZD;
  
  private Ze0q Zc;
  
  private Ze0q ZW;
  
  private Ze01 ZS;
  
  private Ze01 ZQ;
  
  private Zm99 ZM;
  
  private Zbqc ZB;
  
  private Zem9 Zv;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbvd(Window paramWindow, Zgb6 paramZgb6, Zkc0 paramZkc0, Ztq1 paramZtq1, Zemk paramZemk, Zzjc paramZzjc, Zgf2 paramZgf2, Zxf5 paramZxf5, Ztyg paramZtyg, Zgq7 paramZgq7, Zedy paramZedy, Zmo3 paramZmo3, Consumer<Zmo3> paramConsumer, Zr4a paramZr4a) {
    this.Zr = paramWindow;
    this.ZV = paramZtq1;
    this.Zq = paramZemk;
    this.ZF = paramZzjc;
    this.Z_ = paramZxf5;
    this.Za = paramConsumer;
    String str = Zed0.Zm();
    this.ZU = paramZmo3;
    this.ZE = 0;
    paramZr4a.Zh(new Zzcz(this));
    ZP();
    ZV();
    this.Zu = new Zbvc(paramZgb6, paramZkc0, paramZzjc, paramZxf5, paramZtyg, paramZgq7, paramZedy, paramZmo3, paramZr4a, this::lambda$new$0);
    this.ZG = new Zxa8(this.Zu);
    this.ZG.addChangeListener(this::lambda$new$1);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add((Component)this.ZG, gridBagConstraints);
    this.ZO = new Zxjd(paramZgf2, this.ZG, this::ZF);
    paramWindow.addWindowListener(new Zgjq(this));
    if (Zbqc.Zwu() == null)
      Zed0.Zv("jnHr7b"); 
  }
  
  private void ZF(Zef3 paramZef3) {
    // Byte code:
    //   0: invokestatic Zm : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual ZRG : ()I
    //   8: iconst_1
    //   9: if_icmpne -> 24
    //   12: sipush #9071
    //   15: sipush #12796
    //   18: invokestatic a : (II)Ljava/lang/String;
    //   21: goto -> 33
    //   24: sipush #9061
    //   27: sipush #-22092
    //   30: invokestatic a : (II)Ljava/lang/String;
    //   33: astore_3
    //   34: aload_1
    //   35: invokevirtual ZR6 : ()I
    //   38: iconst_1
    //   39: if_icmpne -> 54
    //   42: sipush #9064
    //   45: sipush #-19076
    //   48: invokestatic a : (II)Ljava/lang/String;
    //   51: goto -> 63
    //   54: sipush #9059
    //   57: sipush #3494
    //   60: invokestatic a : (II)Ljava/lang/String;
    //   63: astore #4
    //   65: aload_1
    //   66: invokevirtual ZRq : ()I
    //   69: iconst_1
    //   70: if_icmpne -> 85
    //   73: sipush #9080
    //   76: sipush #-13309
    //   79: invokestatic a : (II)Ljava/lang/String;
    //   82: goto -> 94
    //   85: sipush #9083
    //   88: sipush #-22593
    //   91: invokestatic a : (II)Ljava/lang/String;
    //   94: astore #5
    //   96: aload_1
    //   97: invokevirtual ZRG : ()I
    //   100: aload_0
    //   101: getfield ZE : I
    //   104: if_icmple -> 111
    //   107: iconst_1
    //   108: goto -> 112
    //   111: iconst_0
    //   112: istore #6
    //   114: aload_1
    //   115: invokevirtual ZRQ : ()Z
    //   118: ifeq -> 201
    //   121: aload_0
    //   122: getfield ZM : Lburp/Zm99;
    //   125: sipush #9068
    //   128: sipush #5880
    //   131: invokestatic a : (II)Ljava/lang/String;
    //   134: bipush #6
    //   136: anewarray java/lang/Object
    //   139: dup
    //   140: iconst_0
    //   141: aload_1
    //   142: invokevirtual ZRG : ()I
    //   145: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   148: aastore
    //   149: dup
    //   150: iconst_1
    //   151: aload_3
    //   152: aastore
    //   153: dup
    //   154: iconst_2
    //   155: aload_1
    //   156: invokevirtual ZR6 : ()I
    //   159: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   162: aastore
    //   163: dup
    //   164: iconst_3
    //   165: aload #4
    //   167: aastore
    //   168: dup
    //   169: iconst_4
    //   170: aload_1
    //   171: invokevirtual ZRq : ()I
    //   174: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   177: aastore
    //   178: dup
    //   179: iconst_5
    //   180: aload #5
    //   182: aastore
    //   183: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   186: invokevirtual setText : (Ljava/lang/String;)V
    //   189: aload_0
    //   190: aload_1
    //   191: invokevirtual ZRG : ()I
    //   194: putfield ZE : I
    //   197: aload_2
    //   198: ifnonnull -> 300
    //   201: aload_0
    //   202: getfield ZM : Lburp/Zm99;
    //   205: sipush #9057
    //   208: sipush #18038
    //   211: invokestatic a : (II)Ljava/lang/String;
    //   214: bipush #6
    //   216: anewarray java/lang/Object
    //   219: dup
    //   220: iconst_0
    //   221: aload_1
    //   222: invokevirtual ZRG : ()I
    //   225: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   228: aastore
    //   229: dup
    //   230: iconst_1
    //   231: aload_3
    //   232: aastore
    //   233: dup
    //   234: iconst_2
    //   235: aload_1
    //   236: invokevirtual ZR6 : ()I
    //   239: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   242: aastore
    //   243: dup
    //   244: iconst_3
    //   245: aload #4
    //   247: aastore
    //   248: dup
    //   249: iconst_4
    //   250: aload_1
    //   251: invokevirtual ZRq : ()I
    //   254: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   257: aastore
    //   258: dup
    //   259: iconst_5
    //   260: aload #5
    //   262: aastore
    //   263: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   266: invokevirtual setText : (Ljava/lang/String;)V
    //   269: aload_0
    //   270: getfield ZM : Lburp/Zm99;
    //   273: getstatic burp/Zbvd.Zw : Lburp/Ze9n;
    //   276: invokevirtual setIcon : (Ljavax/swing/Icon;)V
    //   279: aload_0
    //   280: getfield Zc : Lburp/Ze0q;
    //   283: sipush #9060
    //   286: sipush #6902
    //   289: invokestatic a : (II)Ljava/lang/String;
    //   292: invokevirtual setText : (Ljava/lang/String;)V
    //   295: aload_0
    //   296: iconst_0
    //   297: putfield ZE : I
    //   300: iload #6
    //   302: ifeq -> 309
    //   305: aload_0
    //   306: invokevirtual ZO : ()V
    //   309: return
  }
  
  private void ZO() {
    this.ZG.Z_(2, Zlkk.TAB_FLASH_COLOUR.ZS(), true);
  }
  
  public void ZL(Zmo3 paramZmo3) {
    ZT();
    this.ZU = paramZmo3;
    this.Zu.ZA(paramZmo3);
  }
  
  private boolean ZW() {
    Zryx zryx = Zc(new Zkk7[0]);
    if (Zj(zryx)) {
      ZH(zryx);
      return true;
    } 
    return false;
  }
  
  private boolean Zj(Zryx paramZryx) {
    return (paramZryx.Zb() || this.Z_.ZI() || Zm());
  }
  
  private boolean Zm() {
    AtomicBoolean atomicBoolean = new AtomicBoolean();
    Objects.requireNonNull(atomicBoolean);
    boolean bool = (Zx6o.ZC(this, "", new Zbvg(atomicBoolean::set), new String[] { a(9058, 11571), a(9082, -16717) }1) == 1) ? true : false;
    if (bool && atomicBoolean.get())
      this.Z_.ZE(); 
    return bool;
  }
  
  public boolean ZB(Component paramComponent) {
    if (!this.ZU.Zs().equals(this.Zu.ZK())) {
      int i = Zx6o.ZC(paramComponent, "", Zn(this.ZU.Zm()), new String[] { a(9086, 19912), a(9070, -17118), a(9087, 26995) }2);
      switch (i) {
        case 0:
        
        case 2:
        
      } 
      return false;
    } 
    return true;
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    if (paramInt == 141568 && !this.ZO.ZS()) {
      ZS((ActionEvent)null);
      return true;
    } 
    return false;
  }
  
  private void ZH(Zryx paramZryx) {
    Zryx zryx1 = this.Zq.Zd(this.ZU.ZA());
    if (zryx1 != null && zryx1.Zs().equals(paramZryx.Zs()))
      return; 
    paramZryx = paramZryx.ZF().ZW(this.ZU.ZA()).Zl((zryx1 == null) ? null : zryx1.Ze()).Zd((zryx1 == null || zryx1.ZT())).Zr();
    Zryx zryx2 = this.Zq.Zw(paramZryx);
    this.ZU = zryx2;
    this.Za.accept(zryx2);
    Zm2.ZC(Zrrh.BCHECK_SAVED);
  }
  
  private void ZS() {
    this.Zr.setVisible(false);
    this.Zr.dispose();
  }
  
  private void ZV() {
    boolean bool = this.ZF.ZK().stream().anyMatch(Zsgq::Zk);
    this.Zc.setEnabled(bool);
  }
  
  private void ZT() {
    this.ZO.Zd();
    this.Zc.setText(a(9081, -29521));
    this.ZM.setIcon((Icon)null);
    this.ZM.setText("");
  }
  
  private Zryx Zc(Zkk7... paramVarArgs) {
    Zryx zryx = this.ZV.ZJ(this.Zu.ZK(), paramVarArgs);
    boolean bool = Arrays.<Zkk7>stream(paramVarArgs).anyMatch(Zbvd::lambda$loadScriptAndUpdateUI$2);
    String str = Zed0.Zm();
    if (bool && !zryx.Zb()) {
      this.ZM.setIcon((new Ze3m(Zeuf.WARNING, Zlkk.FOREGROUND)).Z_());
      this.ZM.setText(a(9062, -12003));
      if (str == null) {
        this.ZM.setIcon((Icon)null);
        this.ZM.setText("");
        this.Zu.ZA(zryx);
        this.Zu.ZK(zryx);
        return zryx;
      } 
      this.Zu.ZA(zryx);
      this.Zu.ZK(zryx);
      return zryx;
    } 
    this.ZM.setIcon((Icon)null);
    this.ZM.setText("");
    this.Zu.ZA(zryx);
    this.Zu.ZK(zryx);
    return zryx;
  }
  
  private void ZP() {
    this.Zv = new Zem9();
    this.ZB = new Zbqc();
    this.ZQ = new Ze01();
    this.Zc = new Ze0q();
    this.ZM = new Zm99();
    this.ZD = new Ze01();
    this.ZS = new Ze01();
    this.ZW = new Ze0q();
    setLayout(new GridBagLayout());
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zv, gridBagConstraints);
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    gridBagLayout.rowHeights = new int[] { 0 };
    this.ZB.setLayout(gridBagLayout);
    this.ZQ.setText(a(9084, -15127));
    this.ZQ.setName(a(9085, -895));
    this.ZQ.addActionListener(new Zxfk(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 25;
    this.ZB.add(this.ZQ, gridBagConstraints);
    this.Zc.setText(a(9081, -29521));
    this.Zc.setName(a(9069, 1597));
    this.Zc.addActionListener(new Zshc(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    this.ZB.add(this.Zc, gridBagConstraints);
    this.ZM.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
    this.ZM.setName(a(9065, -22177));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.weightx = 1.0D;
    this.ZB.add(this.ZM, gridBagConstraints);
    this.ZD.setText(a(9058, 11571));
    this.ZD.addActionListener(new Zl9o(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 26;
    this.ZB.add(this.ZD, gridBagConstraints);
    this.ZS.setText(a(9056, -938));
    this.ZS.addActionListener(new Zsml(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 26;
    this.ZB.add(this.ZS, gridBagConstraints);
    this.ZW.setText(a(9082, -16717));
    this.ZW.addActionListener(new Zzhc(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 26;
    this.ZB.add(this.ZW, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 26;
    gridBagConstraints.insets = new Insets(20, 20, 20, 20);
    add(this.ZB, gridBagConstraints);
  }
  
  private void Zx(ActionEvent paramActionEvent) {
    ZS();
  }
  
  private void ZB(ActionEvent paramActionEvent) {
    ZW();
  }
  
  private void Zm(ActionEvent paramActionEvent) {
    if (ZW())
      ZS(); 
  }
  
  private void Zi(ActionEvent paramActionEvent) {
    Zc(new Zkk7[0]);
  }
  
  private void ZS(ActionEvent paramActionEvent) {
    String str = Zed0.Zm();
    if (!this.Zc.isEnabled())
      return; 
    if (!this.ZO.ZS()) {
      Zryx zryx = Zc(new Zkk7[0]);
      if (zryx.Zb()) {
        this.ZM.setIcon(new Zkaz(Zg));
        this.Zc.setText(a(9067, -19282));
        List<Zsgq> list = this.ZF.ZE();
        Zm2.Zi(Zv8r.BS_CODE_RUN_TEST, list.size());
        this.ZO.Zi(zryx, list);
      } 
      if (str == null) {
        Zm2.ZC(Zrrh.BS_CODE_CANCEL_TEST);
        ZT();
        return;
      } 
      return;
    } 
    Zm2.ZC(Zrrh.BS_CODE_CANCEL_TEST);
    ZT();
  }
  
  private static Zbqc Zn(String paramString) {
    Zm99 zm99 = new Zm99(a(9063, 10117).formatted(new Object[] { paramString }));
    zm99.setBorder((Border)null);
    zm99.ZO(Zlkk.PANEL_BACKGROUND);
    Zbqc zbqc = new Zbqc(new BorderLayout());
    zbqc.add(zm99);
    zbqc.setName(a(9066, -30776));
    return zbqc;
  }
  
  private static boolean lambda$loadScriptAndUpdateUI$2(Zkk7 paramZkk7) {
    return (paramZkk7 == Zkk7.FORMAT);
  }
  
  private void lambda$new$1(ChangeEvent paramChangeEvent) {
    this.ZQ.setEnabled(this.ZG.Zw());
  }
  
  private void lambda$new$0() {
    Zc(new Zkk7[] { Zkk7.FORMAT });
  }
  
  static {
    // Byte code:
    //   0: bipush #24
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'lû-àl·ÿå«öå·«;å¸M;9¸ êÏÄh1>úßcµPNúÕW§{ÇBÆ®î6¨Uô³×1äTå 7ò§â?¬ÿW×)`$" ç6n± ÉÖÞüÍéz¼MIÌ´f?uæ$¢ÿ1aÚþÃK\\rWÀðóCÞ\\bnÂo¾ÑË;K©#ÖI×)ÊÊ¨¦\æjÒ´ú8°¯§UÂÅö3\\têJ{²øÈúî£²:óë$_ p!}ÓkÌB¢üµ[ÆÄfG)t½i#\\bµ_¶Å}«\\f ÷Ë ËwsZáGÉÙ\\r£7ú£¬ç|m$QÁò?·v]2îßA\\n¹rp\\btå3VS+\\b)¶¸ûØò{1ïË´#fü^àü\\n5óØ·\\nM&øY×C]|}àá¹\\bjïFÁÔ9¨'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #29
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #75
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 141
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
    //   68: ldc 'ßJ®1Q)àL'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: iconst_2
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 81
    //   125: aload #5
    //   127: putstatic burp/Zbvd.a : [Ljava/lang/String;
    //   130: bipush #24
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zbvd.b : [Ljava/lang/String;
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
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #14
    //   214: goto -> 244
    //   217: bipush #97
    //   219: goto -> 244
    //   222: bipush #55
    //   224: goto -> 244
    //   227: bipush #19
    //   229: goto -> 244
    //   232: bipush #47
    //   234: goto -> 244
    //   237: bipush #29
    //   239: goto -> 244
    //   242: bipush #79
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 97
    //   300: getstatic burp/Zeuf.TICK : Lburp/Zeuf;
    //   303: getstatic burp/Zlkk.FOREGROUND : Lburp/Zlkk;
    //   306: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   309: getstatic burp/Zmcx.LINE_SIZE : Lburp/Zmcx;
    //   312: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   315: invokevirtual Z_ : ()Lburp/Ze9n;
    //   318: putstatic burp/Zbvd.Zw : Lburp/Ze9n;
    //   321: getstatic burp/Zeuf.SPINNER : Lburp/Zeuf;
    //   324: getstatic burp/Zlkk.FOREGROUND : Lburp/Zlkk;
    //   327: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   330: getstatic burp/Zmcx.LINE_SIZE : Lburp/Zmcx;
    //   333: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   336: invokevirtual Z_ : ()Lburp/Ze9n;
    //   339: putstatic burp/Zbvd.Zg : Lburp/Ze9n;
    //   342: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x236C) & 0xFFFF;
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
      char c = 'ð';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbvd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */