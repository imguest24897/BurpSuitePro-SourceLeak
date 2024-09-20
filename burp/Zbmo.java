package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;

class Zbmo extends Zbv5 {
  private final Zt4u ZY;
  
  private final Zmlm ZR;
  
  private final Zb0h ZS;
  
  private final Ztwv Zy;
  
  private final Zbw3 Zq;
  
  private final Zbw3 Zr;
  
  private final Ztn4 Zm;
  
  private Zm2o Zx;
  
  private Zbkc ZM;
  
  private Zm99 ZL;
  
  private Zm99 Zz;
  
  private Zm99 ZH;
  
  private Zbup Z_;
  
  private ButtonGroup ZU;
  
  private Ze01 ZO;
  
  private Ze01 ZE;
  
  private Ze01 Zo;
  
  private Ze01 ZP;
  
  private Ze01 ZB;
  
  private Ze01 Zs;
  
  private Zl8w Zw;
  
  private Zm99 Zk;
  
  private Zbup Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbmo(Zt4u paramZt4u, Zmlm paramZmlm, Zb0h paramZb0h, Ztwv paramZtwv) {
    this.ZY = paramZt4u;
    this.ZR = paramZmlm;
    this.ZS = paramZb0h;
    int i = Zrtd.ZH();
    this.Zy = paramZtwv;
    Zh();
    this.Zm = new Ztn4();
    this.Zq = new Zbw3(this, this.Zm);
    this.Zq.setSelectionMode(2);
    this.Zq.setName(a(11273, 19687));
    this.Zr = new Zbw3(this, this.Zm);
    this.Zr.setSelectionMode(0);
    this.Zr.setName(a(11270, 32626));
    this.Zd.setViewportView(this.Zq);
    this.Z_.setViewportView(this.Zr);
    Zmse.Zf(this.Zd, 60, 12);
    Zmse.Zf(this.Z_, 60, 12);
    if (i == 0)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public void Zy(Zstu paramZstu) {
    ArrayList<Zstu> arrayList = new ArrayList();
    arrayList.add(paramZstu);
    ZG(arrayList);
  }
  
  public void ZG(List<Zstu> paramList) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZH : ()I
    //   11: aload_1
    //   12: invokeinterface iterator : ()Ljava/util/Iterator;
    //   17: astore #4
    //   19: istore_2
    //   20: aload #4
    //   22: invokeinterface hasNext : ()Z
    //   27: ifeq -> 75
    //   30: aload #4
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast burp/Zstu
    //   40: astore #5
    //   42: aload #5
    //   44: ifnonnull -> 54
    //   47: goto -> 20
    //   50: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   53: athrow
    //   54: aload_3
    //   55: new burp/Zbzh
    //   58: dup
    //   59: aload #5
    //   61: iconst_1
    //   62: invokespecial <init> : (Lburp/Zstu;Z)V
    //   65: invokeinterface add : (Ljava/lang/Object;)Z
    //   70: pop
    //   71: iload_2
    //   72: ifne -> 20
    //   75: aload_0
    //   76: getfield Zm : Lburp/Ztn4;
    //   79: aload_3
    //   80: invokevirtual Za : (Ljava/util/List;)I
    //   83: istore #4
    //   85: aload_1
    //   86: invokeinterface size : ()I
    //   91: iconst_1
    //   92: if_icmpne -> 199
    //   95: aload_0
    //   96: getfield Zq : Lburp/Zbw3;
    //   99: invokevirtual getSelectedRow : ()I
    //   102: iconst_m1
    //   103: if_icmpne -> 156
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   112: athrow
    //   113: aload_0
    //   114: getfield Zq : Lburp/Zbw3;
    //   117: iload #4
    //   119: invokevirtual convertRowIndexToModel : (I)I
    //   122: istore #5
    //   124: aload_0
    //   125: getfield Zq : Lburp/Zbw3;
    //   128: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   131: iload #5
    //   133: iload #5
    //   135: invokeinterface setSelectionInterval : (II)V
    //   140: aload_0
    //   141: getfield Zq : Lburp/Zbw3;
    //   144: iload #5
    //   146: iconst_1
    //   147: iconst_0
    //   148: iconst_0
    //   149: invokevirtual changeSelection : (IIZZ)V
    //   152: iload_2
    //   153: ifne -> 295
    //   156: aload_0
    //   157: getfield Zr : Lburp/Zbw3;
    //   160: iload #4
    //   162: invokevirtual convertRowIndexToModel : (I)I
    //   165: istore #5
    //   167: aload_0
    //   168: getfield Zr : Lburp/Zbw3;
    //   171: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   174: iload #5
    //   176: iload #5
    //   178: invokeinterface setSelectionInterval : (II)V
    //   183: aload_0
    //   184: getfield Zr : Lburp/Zbw3;
    //   187: iload #5
    //   189: iconst_1
    //   190: iconst_0
    //   191: iconst_0
    //   192: invokevirtual changeSelection : (IIZZ)V
    //   195: iload_2
    //   196: ifne -> 295
    //   199: aload_0
    //   200: getfield Zo : Lburp/Ze01;
    //   203: iconst_1
    //   204: invokevirtual setEnabled : (Z)V
    //   207: aload_0
    //   208: getfield ZE : Lburp/Ze01;
    //   211: iconst_1
    //   212: invokevirtual setEnabled : (Z)V
    //   215: aload_0
    //   216: getfield Zq : Lburp/Zbw3;
    //   219: iload #4
    //   221: invokevirtual convertRowIndexToModel : (I)I
    //   224: istore #5
    //   226: aload_0
    //   227: getfield Zq : Lburp/Zbw3;
    //   230: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   233: iload #5
    //   235: iload #5
    //   237: invokeinterface setSelectionInterval : (II)V
    //   242: aload_0
    //   243: getfield Zq : Lburp/Zbw3;
    //   246: iload #5
    //   248: iconst_1
    //   249: iconst_0
    //   250: iconst_0
    //   251: invokevirtual changeSelection : (IIZZ)V
    //   254: aload_0
    //   255: getfield Zr : Lburp/Zbw3;
    //   258: iload #4
    //   260: iconst_1
    //   261: iadd
    //   262: invokevirtual convertRowIndexToModel : (I)I
    //   265: istore #5
    //   267: aload_0
    //   268: getfield Zr : Lburp/Zbw3;
    //   271: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   274: iload #5
    //   276: iload #5
    //   278: invokeinterface setSelectionInterval : (II)V
    //   283: aload_0
    //   284: getfield Zr : Lburp/Zbw3;
    //   287: iload #5
    //   289: iconst_1
    //   290: iconst_0
    //   291: iconst_0
    //   292: invokevirtual changeSelection : (IIZZ)V
    //   295: goto -> 308
    //   298: astore #5
    //   300: aload #5
    //   302: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   305: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   308: return
    // Exception table:
    //   from	to	target	type
    //   42	50	50	java/lang/Exception
    //   85	106	109	java/lang/Exception
    //   85	295	298	java/lang/Exception
  }
  
  private void Zh() {
    this.ZU = new ButtonGroup();
    this.Zd = new Zbup();
    this.Z_ = new Zbup();
    this.ZB = new Ze01();
    this.ZP = new Ze01();
    this.Zs = new Ze01();
    this.ZO = new Ze01();
    this.Zk = new Zm99();
    this.Zo = new Ze01();
    this.ZE = new Ze01();
    this.ZL = new Zm99();
    this.Zx = new Zm2o();
    this.Zw = new Zl8w();
    this.ZM = new Zbkc();
    this.Zz = new Zm99();
    this.ZH = new Zm99();
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0 };
    setLayout(gridBagLayout);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridheight = 7;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zd, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridheight = 7;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.Z_, gridBagConstraints);
    this.ZB.setText(a(11266, -5589));
    this.ZB.setToolTipText(a(11276, 32481));
    this.ZB.addActionListener(new Zzuv(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 24;
    add(this.ZB, gridBagConstraints);
    this.ZP.setText(a(11283, -667));
    this.ZP.setToolTipText(a(11272, 9262));
    this.ZP.addActionListener(new Zmty(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 24;
    add(this.ZP, gridBagConstraints);
    this.Zs.setText(a(11279, -27564));
    this.Zs.setToolTipText(a(11274, 9465));
    this.Zs.addActionListener(new Zkhd(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 24;
    add(this.Zs, gridBagConstraints);
    this.ZO.setText(a(11269, -17483));
    this.ZO.setToolTipText(a(11281, 32753));
    this.ZO.addActionListener(new Zzpv(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 24;
    add(this.ZO, gridBagConstraints);
    this.Zk.setText(a(11278, -30485));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 20;
    gridBagConstraints.insets = new Insets(0, 10, 0, 10);
    add(this.Zk, gridBagConstraints);
    this.Zo.setText(a(11264, -26572));
    this.Zo.setToolTipText(a(11277, -2290));
    this.Zo.setEnabled(false);
    this.Zo.addActionListener(new Zb9u(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 26;
    add(this.Zo, gridBagConstraints);
    this.ZE.setText(a(11267, -13727));
    this.ZE.setToolTipText(a(11275, -20858));
    this.ZE.setEnabled(false);
    this.ZE.addActionListener(new Zsse(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 26;
    add(this.ZE, gridBagConstraints);
    this.ZL.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 3;
    gridBagConstraints.weighty = 1.0D;
    add(this.ZL, gridBagConstraints);
    this.Zx.Zi(Zk97.DESKTOP_TOOLS_COMPARER);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 24;
    add(this.Zx, gridBagConstraints);
    this.Zw.setText(a(11268, 21147));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zw, gridBagConstraints);
    this.ZM.Zx(a(11265, -18200));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.ZM, gridBagConstraints);
    this.Zz.setText(a(11282, -27569));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 23;
    add(this.Zz, gridBagConstraints);
    this.ZH.setText(a(11271, 31270));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.ZH, gridBagConstraints);
  }
  
  private void Zv(boolean paramBoolean) {
    int i = this.Zq.getSelectedRow();
    int j = this.Zr.getSelectedRow();
    if (i == -1 || j == -1)
      return; 
    i = this.Zq.convertRowIndexToModel(i);
    j = this.Zr.convertRowIndexToModel(j);
    if (i == j)
      return; 
    Zl0p zl0p = new Zl0p(this.ZR.ZD().ZYW(), null, this.Zm.Za(i), this.Zm.Za(j), paramBoolean, this.ZS);
    this.Zy.Zx(zl0p);
  }
  
  private void ZI(ActionEvent paramActionEvent) {
    Zv(true);
  }
  
  private void ZD(ActionEvent paramActionEvent) {
    File file = Zs6n.ZP(Zg1m.DATA, this.ZY, this, 0);
    if (file != null)
      this.Zy.Zx(new Zb1z(this, file)); 
  }
  
  private void ZA(ActionEvent paramActionEvent) {
    this.Zy.Zx(new Ztwk(this));
  }
  
  private void ZX(ActionEvent paramActionEvent) {
    int i = Zrtd.Zj();
    int[] arrayOfInt = this.Zq.getSelectedRows();
    if (arrayOfInt == null || arrayOfInt.length == 0)
      return; 
    byte b = 0;
    while (b < arrayOfInt.length) {
      this.Zm.Z_(this.Zq.convertRowIndexToModel(arrayOfInt[b] - b));
      b++;
      if (i != 0)
        break; 
    } 
    this.Zo.setEnabled(false);
    this.ZE.setEnabled(false);
  }
  
  private void Zz(ActionEvent paramActionEvent) {
    this.Zm.ZE();
    this.Zo.setEnabled(false);
    this.ZE.setEnabled(false);
  }
  
  private void Zt(ActionEvent paramActionEvent) {
    Zv(false);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '«A¾\\b%ðC|¯±òv©ü&Mvª1#1ýÖyâ»eQ~¨JHÎ¢>kÂïY¦¥âyq¾¨fEu±_\\ró·ÚÁ'Ù.ujÝd¹ÔÓ/RÙzÐCSi_qéÏÕUçÿÝúóJp8ápÝæÕà+ð^§qrf|óQçh×vygfpkKzQåyHÉ:C\\bÅßoPÏô¥}É\\n¿¤6\\f¿ûh&á­º%FÈ@XÔ`hQ<~´,æ#µ\\t3H+9]FØ IRÕqÃ,EaöEJç"ï·}WclË9Õ1u&×Çìù~¿ïföÛ(CÔwKfI\\rõf¢ß¥öW:>«¿7kKÞ8}Ù~rJ.wËÀTò%îxðÕì*¯=`iE+°iL¬ùzôÊÃ¿ ³)Â$óPú!´²b¤1ª}Ñ4ù.9oN±3mô¤U¸Ñ±k¯ªåCû9BGèÞ\\f×|\\t«+M´¶G^N=`¾I\½YZÿ§0[«Ø$½ZfI \\nÌls"ÞéRóÜ{úc\\bW¾àÂÿºqÅl~ûFLªªÓ¡9}'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #24
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc '÷­\\r÷Éµá»¢H3¿3$.¨ ö­Y«í.ûPEAÂñ!ûÓ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #14
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #80
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
    //   128: putstatic burp/Zbmo.a : [Ljava/lang/String;
    //   131: bipush #19
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbmo.b : [Ljava/lang/String;
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
    //   212: bipush #118
    //   214: goto -> 244
    //   217: bipush #95
    //   219: goto -> 244
    //   222: bipush #50
    //   224: goto -> 244
    //   227: bipush #95
    //   229: goto -> 244
    //   232: bipush #32
    //   234: goto -> 244
    //   237: bipush #59
    //   239: goto -> 244
    //   242: bipush #39
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2C03) & 0xFFFF;
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
      char c = '¤';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbmo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */