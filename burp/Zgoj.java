package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.ButtonGroup;

public class Zgoj extends Zbqc implements Zevz {
  private static final Zze2 ZC;
  
  private final Zetl Zg;
  
  private final Zgo0 Zd;
  
  private final boolean Zn;
  
  private ButtonGroup Zm;
  
  private ButtonGroup ZH;
  
  private Zzdy Zq;
  
  private Zzdy ZN;
  
  private Zzdy ZU;
  
  private Zzdy ZY;
  
  private Zedd Zx;
  
  private Zbkc Zw;
  
  private Zmg2 ZE;
  
  private Zmg2 Zf;
  
  private Zmg2 ZA;
  
  private Zmg2 ZQ;
  
  private Zmg2 ZR;
  
  private Zbkc ZW;
  
  private Zbkc Zz;
  
  private Zbqc ZP;
  
  private Zl8w ZG;
  
  private Zl8w ZJ;
  
  private Zl8w ZK;
  
  private Zbkc ZM;
  
  private static Zbqc[] ZF;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zgoj(Zetl paramZetl, Zr49 paramZr49, Zbqp paramZbqp) {
    this.Zg = paramZetl;
    ZC();
    Zbqc[] arrayOfZbqc = ZN();
    byte b = 0;
    this.Zx.insertItemAt(a(-32425, -20604), b++);
    for (Zk9f zk9f : Zk9f.ALL_TASKS) {
      this.Zx.insertItemAt(zk9f.name, b++);
      if (arrayOfZbqc != null) {
        Zbqc.Zr(new Zbqc[1]);
        break;
      } 
    } 
    this.Zx.setSelectedIndex(0);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    this.Zd = new Zgo0(paramZetl, paramZr49, paramZbqp);
    add(this.Zd, gridBagConstraints);
    this.ZA.setName(a(-32426, -4221));
    this.ZQ.setName(a(-32441, 4434));
    this.ZY.setName(a(-32443, -14389));
    this.Zn = true;
  }
  
  public Zeuf ZL() {
    return Zeuf.SCAN_DETAILS;
  }
  
  public Zze2 Zx() {
    return ZC;
  }
  
  public Component ZZ() {
    return this;
  }
  
  public void ZN(Zkcl paramZkcl, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Zmet paramZmet, boolean paramBoolean4) {
    Zbqc[] arrayOfZbqc = ZN();
    this.ZA.setSelected((paramZkcl == Zkcl.LIVE_AUDIT));
    this.ZQ.setSelected((paramZkcl == Zkcl.LIVE_PASSIVE_CRAWL));
    this.ZU.setSelected(paramBoolean1);
    this.ZY.setSelected(paramBoolean2);
    this.ZN.setSelected(paramBoolean3);
    this.Zf.setSelected((paramZmet == Zmet.EVERYTHING));
    this.ZR.setSelected((paramZmet == Zmet.SUITE));
    this.ZE.setSelected((paramZmet == Zmet.CUSTOM));
    this.Zq.setSelected(paramBoolean4);
    if (Zbqc.Zwu() == null)
      ZS(new Zbqc[3]); 
  }
  
  public void Zk(List<String> paramList1, List<String> paramList2) {
    this.Zd.ZB(paramList1, paramList2);
  }
  
  public void ZJ(List<Zmy8> paramList1, List<Zmy8> paramList2) {
    this.Zd.ZQ(paramList1, paramList2);
  }
  
  public void ZR() {
    this.ZA.setSelected(true);
  }
  
  public void Zo() {
    this.ZQ.setSelected(true);
  }
  
  public void Zd(boolean paramBoolean) {
    this.ZU.setSelected(paramBoolean);
  }
  
  public void ZO(boolean paramBoolean) {
    this.ZY.setSelected(paramBoolean);
  }
  
  public void Zt(boolean paramBoolean) {
    this.ZN.setSelected(paramBoolean);
  }
  
  public void ZO() {
    this.Zf.setSelected(true);
  }
  
  public void ZY() {
    this.ZR.setSelected(true);
  }
  
  public void ZK() {
    this.ZE.setSelected(true);
  }
  
  public void ZI() {
    this.Zd.setVisible(true);
  }
  
  public void ZS() {
    this.Zd.setVisible(false);
  }
  
  public void Zf() {
    this.Zd.Zi();
  }
  
  public void ZD() {
    this.Zd.Zp();
  }
  
  public void Zb() {
    this.Zd.Zk();
  }
  
  public void Zy() {
    this.Zd.ZG();
  }
  
  public void ZG(boolean paramBoolean) {
    this.Zq.setSelected(paramBoolean);
  }
  
  public void Zd() {
    this.ZA.setEnabled(false);
    this.ZQ.setEnabled(false);
    this.Zx.setEnabled(false);
  }
  
  private void ZC() {
    this.Zm = new ButtonGroup();
    this.ZH = new ButtonGroup();
    this.ZW = new Zbkc();
    this.ZA = new Zmg2();
    this.ZQ = new Zmg2();
    this.Zx = new Zedd();
    this.Zz = new Zbkc();
    this.ZJ = new Zl8w();
    this.ZP = new Zbqc();
    this.ZU = new Zzdy();
    this.ZY = new Zzdy();
    this.ZN = new Zzdy();
    this.ZM = new Zbkc();
    this.ZK = new Zl8w();
    this.Zf = new Zmg2();
    this.ZR = new Zmg2();
    this.ZE = new Zmg2();
    this.Zw = new Zbkc();
    this.ZG = new Zl8w();
    this.Zq = new Zzdy();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZW.Zx(a(-32438, 25397));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    add(this.ZW, gridBagConstraints);
    this.Zm.add(this.ZA);
    this.ZA.setText(a(-32444, 31845));
    this.ZA.addActionListener(new Zbn4(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.ZA, gridBagConstraints);
    this.Zm.add(this.ZQ);
    this.ZQ.setText(a(-32435, 3917));
    this.ZQ.addActionListener(new Zm7m(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.ZQ, gridBagConstraints);
    this.Zx.addActionListener(new Zmxd(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 24;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zx, gridBagConstraints);
    this.Zz.Zx(a(-32428, 5942));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(20, 0, 10, 0);
    add(this.Zz, gridBagConstraints);
    this.ZJ.setColumns(20);
    this.ZJ.setText(a(-32442, 9946));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZJ, gridBagConstraints);
    this.ZP.setLayout(new GridLayout(1, 0, 20, 0));
    this.ZU.setText(a(-32445, 28500));
    this.ZU.addActionListener(new Zehn(this));
    this.ZP.add(this.ZU);
    this.ZY.setText(a(-32429, 20355));
    this.ZY.addActionListener(new Zs85(this));
    this.ZP.add(this.ZY);
    this.ZN.setText(a(-32446, -15592));
    this.ZN.addActionListener(new Zthi(this));
    this.ZP.add(this.ZN);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    add(this.ZP, gridBagConstraints);
    this.ZM.Zx(a(-32440, 21987));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(20, 0, 10, 0);
    add(this.ZM, gridBagConstraints);
    this.ZK.setColumns(20);
    this.ZK.setText(a(-32436, 30158));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZK, gridBagConstraints);
    this.ZH.add(this.Zf);
    this.Zf.setSelected(true);
    this.Zf.setText(a(-32447, -9052));
    this.Zf.addActionListener(new Zlon(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.Zf, gridBagConstraints);
    this.ZH.add(this.ZR);
    this.ZR.setText(a(-32433, -21030));
    this.ZR.addActionListener(new Zmsu(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.ZR, gridBagConstraints);
    this.ZH.add(this.ZE);
    this.ZE.setText(a(-32448, -19757));
    this.ZE.addActionListener(new Zrje(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.ZE, gridBagConstraints);
    this.Zw.Zx(a(-32439, -17540));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 24;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(20, 0, 10, 0);
    add(this.Zw, gridBagConstraints);
    this.ZG.setColumns(20);
    this.ZG.setText(a(-32434, -12700));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 26;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZG, gridBagConstraints);
    this.Zq.setText(a(-32427, -30064));
    this.Zq.addActionListener(new Zlwy(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 28;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zq, gridBagConstraints);
  }
  
  private void Zb(ActionEvent paramActionEvent) {
    this.Zg.ZSj();
  }
  
  private void Zz(ActionEvent paramActionEvent) {
    this.Zg.ZSk();
  }
  
  private void ZQ(ActionEvent paramActionEvent) {
    if (this.Zn) {
      int i = this.Zx.getSelectedIndex();
      if (i > 0) {
        this.Zg.Zc(i);
        this.Zx.setSelectedIndex(0);
      } 
    } 
  }
  
  private void Zm(ActionEvent paramActionEvent) {
    this.Zg.Zp(this.ZU.isSelected());
  }
  
  private void ZY(ActionEvent paramActionEvent) {
    this.Zg.ZL(this.ZY.isSelected());
  }
  
  private void ZG(ActionEvent paramActionEvent) {
    this.Zg.Zm(this.ZN.isSelected());
  }
  
  private void ZI(ActionEvent paramActionEvent) {
    this.Zg.ZSX();
  }
  
  private void ZR(ActionEvent paramActionEvent) {
    this.Zg.ZSd();
  }
  
  private void Zy(ActionEvent paramActionEvent) {
    this.Zg.ZSW();
  }
  
  private void ZX(ActionEvent paramActionEvent) {
    this.Zg.Zo(this.Zq.isSelected());
  }
  
  static {
    // Byte code:
    //   0: bipush #21
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'mxøêÿRúE\\rý²üTÇ¬ä4s+2­Ö°°:ÆÉNd·oÉZÔ¨ÍÐ(ôÒ|ÍãÉÿÐ ¦oMÞe8\\t;ÀÛEú³±'5JæbÍdÆO>j-!¤¾¼Hmdrõ(DEÖ°ï[+oÎE4ÿÚyd¼y<§BÇú»µ¯ÙöÉ`Gx6Ne`ÖLâdÐÔO}õB{25Ú¾@Ø\\rå'ÈËA(³Q°ùÜUÌ\\tízcÒ¤5fH¤mg~¦Ù?°½a\\nçà,èºî}ãXüü\\bÞ\\rµ"IR\\nØÿMi3\\f¹m§z¦ÿoc\\nA<:é '¬UÂÎB^ì£ÙÈÙÐ©ÿ®âí>Ö,Þøs¾+I÷\\rE¤À\\rfýwÄíöW½\\fÃ¼Ãºóºt©×h2ºïtî¦SÿÛ¯µë,a ±+ ,}5RY0p;ó*/'M;«0¨ö(âã=üÜ ÉÛ+&%'WÝ66âTI¾|ú.³ß¸òhÖv+F³å¬ä¦\\bÊì}¶yÃ}&FWµ08^ \\t © L Üzw\\tó<È¶\\nk¤@a/k8$azzaÁ4à Å²*Þ# 7ÔH<¤ý!\\fyÊ81î`#é_\\tzì 5:SäL\\r¶¼È\\tßËè¾\\t÷K³6eð*Ð¸ZÛ¢þôö3æcñüÜ¾ñx?7àHIìÉ<]Ã\\fî¾ÕJ!â³íê®ÍÐä¼ª_ÿñJ;(/Òb|¢ã$ÿ«Ð¦M 7jBí\\b\\teêßFÞE)Öy\÷¾`Ì²0Ø× ë±õÛ1DË­@&ä|¯2²Á\'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #62
    //   20: istore_1
    //   21: aconst_null
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic ZS : ([Lburp/Zbqc;)V
    //   27: bipush #6
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
    //   72: ldc 'ÓÀðEØÎÕ§@\\bcIfáÏÑ'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #11
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #34
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
    //   133: putstatic burp/Zgoj.a : [Ljava/lang/String;
    //   136: bipush #21
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zgoj.b : [Ljava/lang/String;
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
    //   216: bipush #66
    //   218: goto -> 248
    //   221: bipush #19
    //   223: goto -> 248
    //   226: bipush #76
    //   228: goto -> 248
    //   231: bipush #96
    //   233: goto -> 248
    //   236: bipush #67
    //   238: goto -> 248
    //   241: bipush #109
    //   243: goto -> 248
    //   246: bipush #6
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
    //   304: new burp/Zze2
    //   307: dup
    //   308: sipush #-32437
    //   311: sipush #12470
    //   314: invokestatic a : (II)Ljava/lang/String;
    //   317: ldc ''
    //   319: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   322: putstatic burp/Zgoj.ZC : Lburp/Zze2;
    //   325: return
  }
  
  public static void ZS(Zbqc[] paramArrayOfZbqc) {
    ZF = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZN() {
    return ZF;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8147) & 0xFFFF;
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
      byte b1 = 59;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgoj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */