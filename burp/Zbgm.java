package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zl0;

class Zbgm extends Zbg2 implements Zgsd {
  private static List<Zt1q> Zt;
  
  private final Zr5w Zg;
  
  private final Zskh Zi;
  
  private final Zl0 ZV;
  
  private final Ztwv ZM;
  
  private final Zbws Zj;
  
  private final Zt_n ZL;
  
  private final Zbws ZJ;
  
  private final Zt_w ZO;
  
  private boolean Zs;
  
  private final List<Zt1q> Zl;
  
  private final List<String> Zc;
  
  private Zm2o Zv;
  
  private Ze01 ZF;
  
  private Ze01 Zr;
  
  private Ze01 Zx;
  
  private Zl8w Zq;
  
  private Zl8w ZI;
  
  private Zm9v ZZ;
  
  private Zm99 ZX;
  
  private Zexh Zd;
  
  private Zbup Za;
  
  private Zbup ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbgm(Zr5w paramZr5w, Zskh paramZskh, Zl0 paramZl0, Ztwv paramZtwv) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield Zs : Z
    //   9: invokestatic ZV : ()Ljava/lang/String;
    //   12: aload_0
    //   13: new java/util/ArrayList
    //   16: dup
    //   17: invokespecial <init> : ()V
    //   20: putfield Zl : Ljava/util/List;
    //   23: aload_0
    //   24: new java/util/ArrayList
    //   27: dup
    //   28: invokespecial <init> : ()V
    //   31: putfield Zc : Ljava/util/List;
    //   34: aload_0
    //   35: aload_1
    //   36: putfield Zg : Lburp/Zr5w;
    //   39: aload_0
    //   40: aload_2
    //   41: putfield Zi : Lburp/Zskh;
    //   44: aload_0
    //   45: aload_3
    //   46: putfield ZV : Lnet/portswigger/Zl0;
    //   49: aload_0
    //   50: aload #4
    //   52: putfield ZM : Lburp/Ztwv;
    //   55: aload_0
    //   56: invokevirtual Zj : ()V
    //   59: aload_0
    //   60: getfield Zd : Lburp/Zexh;
    //   63: iconst_0
    //   64: invokevirtual setVisible : (Z)V
    //   67: aload_0
    //   68: getfield ZX : Lburp/Zm99;
    //   71: iconst_0
    //   72: invokevirtual setVisible : (Z)V
    //   75: aload_0
    //   76: getfield ZZ : Lburp/Zm9v;
    //   79: iconst_0
    //   80: invokevirtual setVisible : (Z)V
    //   83: astore #5
    //   85: getstatic burp/Zbgm.Zt : Ljava/util/List;
    //   88: ifnonnull -> 205
    //   91: getstatic burp/Zm7r.Zb : [Ljava/lang/String;
    //   94: astore #6
    //   96: aload #6
    //   98: arraylength
    //   99: istore #7
    //   101: iconst_0
    //   102: istore #8
    //   104: iload #8
    //   106: iload #7
    //   108: if_icmpge -> 187
    //   111: aload #6
    //   113: iload #8
    //   115: aaload
    //   116: astore #9
    //   118: new java/io/File
    //   121: dup
    //   122: aload #9
    //   124: invokespecial <init> : (Ljava/lang/String;)V
    //   127: astore #10
    //   129: aload #10
    //   131: invokevirtual exists : ()Z
    //   134: ifeq -> 179
    //   137: aload #10
    //   139: invokevirtual isDirectory : ()Z
    //   142: ifeq -> 179
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   151: athrow
    //   152: aload_0
    //   153: getfield Zl : Ljava/util/List;
    //   156: new burp/Zt1q
    //   159: dup
    //   160: iconst_1
    //   161: aload #9
    //   163: invokespecial <init> : (ZLjava/lang/String;)V
    //   166: invokeinterface add : (Ljava/lang/Object;)Z
    //   171: pop
    //   172: goto -> 179
    //   175: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   178: athrow
    //   179: iinc #8, 1
    //   182: aload #5
    //   184: ifnull -> 104
    //   187: goto -> 257
    //   190: astore #6
    //   192: aload #6
    //   194: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   197: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   200: aload #5
    //   202: ifnull -> 257
    //   205: getstatic burp/Zbgm.Zt : Ljava/util/List;
    //   208: invokeinterface iterator : ()Ljava/util/Iterator;
    //   213: astore #6
    //   215: aload #6
    //   217: invokeinterface hasNext : ()Z
    //   222: ifeq -> 257
    //   225: aload #6
    //   227: invokeinterface next : ()Ljava/lang/Object;
    //   232: checkcast burp/Zt1q
    //   235: astore #7
    //   237: aload_0
    //   238: getfield Zl : Ljava/util/List;
    //   241: aload #7
    //   243: invokevirtual Zf : ()Lburp/Zt1q;
    //   246: invokeinterface add : (Ljava/lang/Object;)Z
    //   251: pop
    //   252: aload #5
    //   254: ifnull -> 215
    //   257: aload_0
    //   258: new burp/Zt_n
    //   261: dup
    //   262: aload_0
    //   263: invokespecial <init> : (Lburp/Zbgm;)V
    //   266: putfield ZL : Lburp/Zt_n;
    //   269: aload_0
    //   270: new burp/Zbws
    //   273: dup
    //   274: aload_0
    //   275: getfield ZL : Lburp/Zt_n;
    //   278: invokespecial <init> : (Lburp/Zztu;)V
    //   281: putfield Zj : Lburp/Zbws;
    //   284: aload_0
    //   285: getfield Zj : Lburp/Zbws;
    //   288: aload_0
    //   289: getfield ZL : Lburp/Zt_n;
    //   292: invokevirtual Zk : (Lburp/Zky2;)V
    //   295: aload_0
    //   296: getfield ZW : Lburp/Zbup;
    //   299: aload_0
    //   300: getfield Zj : Lburp/Zbws;
    //   303: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   306: aload_0
    //   307: new burp/Zt_w
    //   310: dup
    //   311: aload_0
    //   312: invokespecial <init> : (Lburp/Zbgm;)V
    //   315: putfield ZO : Lburp/Zt_w;
    //   318: aload_0
    //   319: new burp/Zbws
    //   322: dup
    //   323: aload_0
    //   324: getfield ZO : Lburp/Zt_w;
    //   327: invokespecial <init> : (Lburp/Zztu;)V
    //   330: putfield ZJ : Lburp/Zbws;
    //   333: aload_0
    //   334: getfield ZJ : Lburp/Zbws;
    //   337: aload_0
    //   338: getfield ZO : Lburp/Zt_w;
    //   341: invokevirtual Zc : (Lburp/Zeq;)V
    //   344: aload_0
    //   345: getfield Za : Lburp/Zbup;
    //   348: aload_0
    //   349: getfield ZJ : Lburp/Zbws;
    //   352: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   355: aload_0
    //   356: iconst_2
    //   357: anewarray java/lang/String
    //   360: dup
    //   361: iconst_0
    //   362: sipush #-20488
    //   365: sipush #5328
    //   368: invokestatic a : (II)Ljava/lang/String;
    //   371: aastore
    //   372: dup
    //   373: iconst_1
    //   374: sipush #-20482
    //   377: sipush #-6384
    //   380: invokestatic a : (II)Ljava/lang/String;
    //   383: aastore
    //   384: putfield ZB : [Ljava/lang/String;
    //   387: aload_0
    //   388: iconst_2
    //   389: newarray boolean
    //   391: dup
    //   392: iconst_0
    //   393: iconst_1
    //   394: bastore
    //   395: dup
    //   396: iconst_1
    //   397: iconst_1
    //   398: bastore
    //   399: putfield ZA : [Z
    //   402: aload_0
    //   403: iconst_1
    //   404: putfield Zh : I
    //   407: return
    // Exception table:
    //   from	to	target	type
    //   91	187	190	java/lang/Exception
    //   129	145	148	java/lang/Exception
    //   137	172	175	java/lang/Exception
  }
  
  public Zsic Zn(int paramInt) {
    // Byte code:
    //   0: invokestatic ZV : ()Ljava/lang/String;
    //   3: astore_2
    //   4: iload_1
    //   5: lookupswitch default -> 100, 0 -> 32, 1 -> 41
    //   32: aload_0
    //   33: getfield Zg : Lburp/Zr5w;
    //   36: aload_0
    //   37: invokevirtual ZP : (Lburp/Zsic;)Lburp/Zsic;
    //   40: areturn
    //   41: iconst_0
    //   42: istore_3
    //   43: aconst_null
    //   44: aload_0
    //   45: invokevirtual Z_ : ()Ljava/lang/String;
    //   48: if_acmpne -> 65
    //   51: aload_0
    //   52: getfield ZZ : Lburp/Zm9v;
    //   55: iconst_1
    //   56: invokevirtual setVisible : (Z)V
    //   59: iconst_1
    //   60: istore_3
    //   61: aload_2
    //   62: ifnull -> 73
    //   65: aload_0
    //   66: getfield ZZ : Lburp/Zm9v;
    //   69: iconst_0
    //   70: invokevirtual setVisible : (Z)V
    //   73: iload_3
    //   74: ifeq -> 79
    //   77: aload_0
    //   78: areturn
    //   79: aload_0
    //   80: iconst_1
    //   81: invokevirtual Zd : (Z)V
    //   84: aload_0
    //   85: getfield Zl : Ljava/util/List;
    //   88: putstatic burp/Zbgm.Zt : Ljava/util/List;
    //   91: aload_0
    //   92: getfield Zg : Lburp/Zr5w;
    //   95: aload_0
    //   96: invokevirtual Zu : (Lburp/Zsic;)Lburp/Zsic;
    //   99: areturn
    //   100: iconst_0
    //   101: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   104: iload_1
    //   105: i2l
    //   106: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   109: aload_0
    //   110: areturn
  }
  
  public void Zc() {
    Zd(true);
  }
  
  String Z_() {
    try {
      return this.Zc.get(this.ZJ.getSelectedRow());
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  private void Zj() {
    this.Zq = new Zl8w();
    this.Zv = new Zm2o();
    this.ZF = new Ze01();
    this.Zr = new Ze01();
    this.ZW = new Zbup();
    this.Za = new Zbup();
    this.ZI = new Zl8w();
    this.Zx = new Ze01();
    this.Zd = new Zexh();
    this.ZX = new Zm99();
    this.ZZ = new Zm9v();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zq.setText(a(-20485, 2733));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zq, gridBagConstraints);
    this.Zv.Zi(Zk97.DESKTOP_SETTINGS_NETWORK_TLS_CLIENT_TLS_CERTIFICATES);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.Zv, gridBagConstraints);
    this.ZF.setText(a(-20496, 22132));
    this.ZF.addActionListener(new Zey1(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 24;
    add(this.ZF, gridBagConstraints);
    this.Zr.setText(a(-20495, 23380));
    this.Zr.addActionListener(new Zx8x(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 24;
    add(this.Zr, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.ZW, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weighty = 1.0D;
    add(this.Za, gridBagConstraints);
    this.ZI.setText(a(-20486, -15386));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZI, gridBagConstraints);
    this.Zx.setText(a(-20487, 17722));
    this.Zx.addActionListener(new Zevd(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 20, 0);
    add(this.Zx, gridBagConstraints);
    this.Zd.setIndeterminate(true);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zd, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    add(this.ZX, gridBagConstraints);
    this.ZZ.setText(a(-20493, 24396));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 24;
    add(this.ZZ, gridBagConstraints);
  }
  
  private void ZR(ActionEvent paramActionEvent) {
    try {
      File file = Zs6n.Zc(Zg1m.CONFIG, this, 0, a(-20494, -13234));
      if (file != null) {
        Zt1q zt1q = new Zt1q(true, file.getCanonicalPath());
        if (!this.Zl.contains(zt1q)) {
          int i = this.Zl.size();
          this.Zl.add(zt1q);
          this.ZL.fireTableRowsInserted(i, i);
        } 
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void ZD(ActionEvent paramActionEvent) {
    int i = this.Zj.getSelectedRow();
    if (i < 0 || i >= this.Zl.size())
      return; 
    if (!Zx6o.ZY(this, a(-20483, 30590)))
      return; 
    this.Zl.remove(i);
    this.ZL.fireTableRowsDeleted(i, i);
  }
  
  private void ZI(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZV : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zs : Z
    //   8: ifeq -> 28
    //   11: aload_0
    //   12: iconst_1
    //   13: invokevirtual Zd : (Z)V
    //   16: aload_0
    //   17: getfield ZX : Lburp/Zm99;
    //   20: iconst_0
    //   21: invokevirtual setVisible : (Z)V
    //   24: aload_2
    //   25: ifnull -> 202
    //   28: aload_0
    //   29: iconst_1
    //   30: putfield Zs : Z
    //   33: aload_0
    //   34: getfield Zx : Lburp/Ze01;
    //   37: sipush #-20481
    //   40: sipush #-27039
    //   43: invokestatic a : (II)Ljava/lang/String;
    //   46: invokevirtual setText : (Ljava/lang/String;)V
    //   49: aload_0
    //   50: getfield Zd : Lburp/Zexh;
    //   53: iconst_1
    //   54: invokevirtual setVisible : (Z)V
    //   57: aload_0
    //   58: getfield ZX : Lburp/Zm99;
    //   61: iconst_1
    //   62: invokevirtual setVisible : (Z)V
    //   65: aload_0
    //   66: getfield ZZ : Lburp/Zm9v;
    //   69: iconst_0
    //   70: invokevirtual setVisible : (Z)V
    //   73: aload_0
    //   74: getfield Zc : Ljava/util/List;
    //   77: invokeinterface clear : ()V
    //   82: aload_0
    //   83: getfield ZO : Lburp/Zt_w;
    //   86: invokevirtual fireTableDataChanged : ()V
    //   89: new java/util/ArrayList
    //   92: dup
    //   93: invokespecial <init> : ()V
    //   96: astore_3
    //   97: aload_0
    //   98: getfield Zl : Ljava/util/List;
    //   101: invokeinterface iterator : ()Ljava/util/Iterator;
    //   106: astore #4
    //   108: aload #4
    //   110: invokeinterface hasNext : ()Z
    //   115: ifeq -> 154
    //   118: aload #4
    //   120: invokeinterface next : ()Ljava/lang/Object;
    //   125: checkcast burp/Zt1q
    //   128: astore #5
    //   130: aload #5
    //   132: getfield Zr : Z
    //   135: ifeq -> 150
    //   138: aload_3
    //   139: aload #5
    //   141: getfield Zl : Ljava/lang/String;
    //   144: invokeinterface add : (Ljava/lang/Object;)Z
    //   149: pop
    //   150: aload_2
    //   151: ifnull -> 108
    //   154: aload_3
    //   155: invokeinterface isEmpty : ()Z
    //   160: ifeq -> 164
    //   163: return
    //   164: aload_3
    //   165: invokeinterface size : ()I
    //   170: anewarray java/lang/String
    //   173: astore #4
    //   175: aload_3
    //   176: aload #4
    //   178: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   183: pop
    //   184: aload_0
    //   185: getfield ZM : Lburp/Ztwv;
    //   188: aload_0
    //   189: aload #4
    //   191: <illegal opcode> run : (Lburp/Zbgm;[Ljava/lang/String;)Ljava/lang/Runnable;
    //   196: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   201: pop
    //   202: return
  }
  
  public void ZX(String paramString) {
    int i = this.Zc.size();
    this.Zc.add(paramString);
    this.ZO.fireTableRowsInserted(i, i);
  }
  
  public boolean Zq(float paramFloat, String paramString) {
    if (this.Zs) {
      if (paramFloat > 1.0F)
        Zd(true); 
      if (paramString != null)
        this.ZX.setText(paramString); 
    } 
    return this.Zs;
  }
  
  public boolean ZS() {
    return !this.Zs;
  }
  
  public void Zd(boolean paramBoolean) {
    if (paramBoolean) {
      this.Zx.setText(a(-20484, 5097));
      this.Zd.setVisible(false);
      this.Zs = false;
    } 
  }
  
  private void lambda$cmdSearchCancelActionPerformed$0(String[] paramArrayOfString) {
    Zm7r.Zk(this, paramArrayOfString, true, this.ZV, this.Zi);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 's=3Å-åÐ6±XøùÕ:«Ø2¤x³-KÌE¿¥ñäOÏ²Ë/¥$Ïs»5)5ðÍ_¿YYèÌëñO°F2Á]ÆëÇ}<Ä©3LxòÂ\\t3jõ&.cC`ÄsÈÉ|XµÔ±f°`ôÀÊ íÒK4H¿exÕÁ¨%ßk¬èU@3ó!ªýÂ0]ZPL(TìO¡Ô×8<ÍvV¶¶$2¹0»Ñ¹ ¯NZ£%oa`R¶Î¶ì5l&& K¶àÅÃ£<êa¶"ðDÄÉ#^âU^v-É55f\\rÚòëÄöj4»ÏFeO² ÕÀ\\tQ*p~Àã×Ïu¢=6jÕÚ/1òðI-èXv£\Ø ²X'á$¤\\bÏ\Ê=®L¨<ÔÄ\\nªR¡#xðÁVRr/qÚLæðÿ©vB}ÔÇ6K'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #134
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #88
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 143
    //   41: aload #5
    //   43: swap
    //   44: iload_3
    //   45: iinc #3, 1
    //   48: swap
    //   49: aastore
    //   50: iload_0
    //   51: iload_1
    //   52: iadd
    //   53: dup
    //   54: istore_0
    //   55: iload #4
    //   57: if_icmpge -> 69
    //   60: aload_2
    //   61: iload_0
    //   62: invokevirtual charAt : (I)C
    //   65: istore_1
    //   66: goto -> 24
    //   69: ldc '®Y\\rQ«ôß'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: iconst_3
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #105
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zbgm.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbgm.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #21
    //   214: goto -> 244
    //   217: bipush #33
    //   219: goto -> 244
    //   222: bipush #51
    //   224: goto -> 244
    //   227: bipush #71
    //   229: goto -> 244
    //   232: bipush #26
    //   234: goto -> 244
    //   237: bipush #91
    //   239: goto -> 244
    //   242: bipush #12
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 41, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFAFFA) & 0xFFFF;
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
      char c = 'é';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbgm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */