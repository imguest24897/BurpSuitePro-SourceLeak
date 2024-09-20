package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.Iterator;
import java.util.List;
import javax.swing.ButtonGroup;

public class Zgoz extends Zbqc implements Zevz {
  private static final Zze2 Zs;
  
  private final Zzr6 Zw;
  
  private final Zr49 ZH;
  
  private final Zgox ZE;
  
  private final Zgo6 Za;
  
  private final Zgo0 Zt;
  
  private final GridBagConstraints ZP;
  
  private final GridBagConstraints Zr;
  
  private final Zm99 ZR;
  
  private Zl8w ZS;
  
  private Zbqc ZQ;
  
  private Zbkc Zl;
  
  private Zbqc ZV;
  
  private Zm99 Zv;
  
  private ButtonGroup Zb;
  
  private ButtonGroup Z_;
  
  private Zzdy Zk;
  
  private Zm99 Zn;
  
  private Zm99 ZC;
  
  private Zmg2 ZW;
  
  private Zmg2 Zy;
  
  private Zmg2 Zq;
  
  private Zmg2 Zm;
  
  private Zmg2 ZU;
  
  private Zedd Zh;
  
  private Zbkc Zg;
  
  private static String[] ZK;
  
  private static final String[] a;
  
  private static final String[] c;
  
  public Zgoz(Zzr6 paramZzr6, Zr49 paramZr49, Zbqp paramZbqp, Zgow paramZgow) {
    this.Zw = paramZzr6;
    this.ZH = paramZr49;
    String[] arrayOfString = ZQ();
    ZV();
    this.ZP = new GridBagConstraints();
    this.ZP.gridx = 0;
    this.ZP.gridy = 10;
    this.ZP.gridwidth = 5;
    this.ZP.fill = 1;
    this.ZP.anchor = 23;
    this.ZP.weightx = 1.0D;
    this.ZR = new Zm99(" ");
    this.Zr = new GridBagConstraints();
    this.Zr.gridx = 0;
    this.Zr.gridy = 12;
    this.Zr.gridwidth = 5;
    this.Zr.fill = 2;
    this.Zr.anchor = 23;
    this.Zr.weightx = 1.0D;
    this.Zr.weighty = 1.0D;
    this.Zt = new Zgo0(a(-17512, -18958), paramZzr6, paramZr49, paramZbqp);
    this.Zt.ZL.setVisible(false);
    this.ZE = new Zgox(paramZzr6, this.Zt);
    this.Za = new Zgo6(paramZzr6);
    ZX(false);
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public Zeuf ZL() {
    return Zeuf.SCAN_DETAILS;
  }
  
  public Zze2 Zx() {
    return Zs;
  }
  
  public Component ZZ() {
    return this;
  }
  
  public void Zo() {
    this.ZV.setVisible(false);
  }
  
  public void Zc(List<String> paramList1, List<String> paramList2) {
    this.Zt.ZB(paramList1, paramList2);
  }
  
  public void Zi(List<Zmy8> paramList1, List<Zmy8> paramList2) {
    this.Zt.ZQ(paramList1, paramList2);
  }
  
  public void Zy(List<String> paramList) {
    this.Za.Zh(paramList);
  }
  
  public void ZJ(List<String> paramList) {
    this.Zh.removeAllItems();
    Iterator<String> iterator = paramList.iterator();
    String[] arrayOfString = ZQ();
    while (iterator.hasNext()) {
      String str = iterator.next();
      this.Zh.addItem(str);
      if (arrayOfString != null)
        break; 
    } 
  }
  
  public void ZD() {
    remove(this.Za);
    add(this.ZE, this.ZP);
  }
  
  public void Zp() {
    remove(this.ZE);
    add(this.Za, this.ZP);
  }
  
  public void ZE() {
    remove(this.Za);
  }
  
  public void Za() {
    remove(this.ZR);
    add(this.ZQ, this.Zr);
  }
  
  public void ZN() {
    remove(this.ZQ);
    add(this.ZR, this.Zr);
  }
  
  public void Z_() {
    this.Zm.setSelected(true);
  }
  
  public void Zu() {
    this.Zq.setEnabled(false);
    this.Zm.setEnabled(false);
  }
  
  public void ZK() {
    this.Zq.setSelected(true);
  }
  
  public void ZB() {
    this.Zy.setSelected(true);
  }
  
  public void Zg() {
    this.ZW.setEnabled(false);
    this.ZU.setEnabled(false);
    this.Zh.setEnabled(false);
  }
  
  public void ZS() {
    this.ZW.setEnabled(true);
    this.ZU.setEnabled(true);
    this.Zh.setEnabled(true);
  }
  
  public void Zf() {
    this.ZW.setSelected(true);
  }
  
  public void ZC() {
    this.ZU.setSelected(true);
  }
  
  public void Zy() {
    this.ZW.setEnabled(false);
    this.Zh.setEnabled(false);
  }
  
  public void Zs(int paramInt) {
    this.Zh.setSelectedIndex(paramInt);
  }
  
  public void ZV(boolean paramBoolean) {
    this.ZE.Zx(paramBoolean);
  }
  
  public void Zg(List<String> paramList) {
    this.ZE.Zn(paramList);
  }
  
  public void ZX(boolean paramBoolean) {
    this.ZE.Zx.setVisible(paramBoolean);
    this.Zt.setVisible(paramBoolean);
  }
  
  public void Zh() {
    this.Zt.Zi();
  }
  
  public void Zv() {
    this.Zt.Zp();
  }
  
  public void ZH() {
    this.Zt.ZG();
  }
  
  public void Zw(List<? extends Zll9> paramList) {
    this.ZH.Zj(Zt2m.ZF(this), this.Zw, paramList);
  }
  
  public void ZP(boolean paramBoolean) {
    this.Zk.setSelected(paramBoolean);
  }
  
  public void Zk() {
    this.ZE.Zg();
  }
  
  public void ZU() {
    this.Zm.setEnabled(false);
    this.Zq.setEnabled(false);
    this.Zy.setEnabled(false);
    Zg();
    this.Za.Ze();
    this.ZE.Zs();
    ZR();
  }
  
  private void ZR() {
    this.Zk.setEnabled(false);
  }
  
  private void ZV() {
    this.Zb = new ButtonGroup();
    this.Z_ = new ButtonGroup();
    this.Zg = new Zbkc();
    this.Zm = new Zmg2();
    this.Zq = new Zmg2();
    this.ZV = new Zbqc();
    this.Zy = new Zmg2();
    this.Zn = new Zm99();
    this.ZW = new Zmg2();
    this.ZU = new Zmg2();
    this.Zh = new Zedd();
    this.ZC = new Zm99();
    this.Zv = new Zm99();
    this.ZQ = new Zbqc();
    this.Zl = new Zbkc();
    this.ZS = new Zl8w();
    this.Zk = new Zzdy();
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0 };
    setLayout(gridBagLayout1);
    this.Zg.Zx(a(-17518, -1512));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 5, 0);
    add(this.Zg, gridBagConstraints);
    this.Zb.add(this.Zm);
    this.Zm.setText(a(-17516, 7873));
    this.Zm.setName(a(-17514, -4543));
    this.Zm.addActionListener(new Zgrl(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.Zm, gridBagConstraints);
    this.Zb.add(this.Zq);
    this.Zq.setText(a(-17511, -944));
    this.Zq.setName(a(-17515, -15992));
    this.Zq.addActionListener(new Zz02(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.Zq, gridBagConstraints);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0, 5, 0, 5, 0 };
    this.ZV.setLayout(gridBagLayout2);
    this.Zb.add(this.Zy);
    this.Zy.setText(a(-17517, -7870));
    this.Zy.addActionListener(new Zgpu(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    this.ZV.add(this.Zy, gridBagConstraints);
    this.Zn.setText(a(-17508, -27865));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    this.ZV.add(this.Zn, gridBagConstraints);
    this.Z_.add(this.ZW);
    this.ZW.setText(a(-17513, 10512));
    this.ZW.addActionListener(new Zeb8(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 23;
    this.ZV.add(this.ZW, gridBagConstraints);
    this.Z_.add(this.ZU);
    this.ZU.setText(a(-17510, -887));
    this.ZU.addActionListener(new Zxcx(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 23;
    this.ZV.add(this.ZU, gridBagConstraints);
    this.Zh.addActionListener(new Zb2_(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    this.ZV.add(this.Zh, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZV, gridBagConstraints);
    this.ZC.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    add(this.ZC, gridBagConstraints);
    this.Zv.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 14;
    add(this.Zv, gridBagConstraints);
    GridBagLayout gridBagLayout3 = new GridBagLayout();
    gridBagLayout3.columnWidths = new int[] { 0 };
    gridBagLayout3.rowHeights = new int[] { 0, 5, 0, 5, 0 };
    this.ZQ.setLayout(gridBagLayout3);
    this.Zl.Zx(a(-17509, 9516));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.ZQ.add(this.Zl, gridBagConstraints);
    this.ZS.setText(a(-17507, -11350));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    this.ZQ.add(this.ZS, gridBagConstraints);
    this.Zk.setText(a(-17520, -22257));
    this.Zk.addActionListener(new Zda(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 23;
    this.ZQ.add(this.Zk, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.ZQ, gridBagConstraints);
  }
  
  private void ZJ(ActionEvent paramActionEvent) {
    this.Zw.ZRE();
  }
  
  private void ZP(ActionEvent paramActionEvent) {
    this.Zw.ZRe();
  }
  
  private void Zn(ActionEvent paramActionEvent) {
    this.Zw.ZRM();
  }
  
  private void ZC(ActionEvent paramActionEvent) {
    this.Zw.ZRx();
  }
  
  private void ZQ(ActionEvent paramActionEvent) {
    this.Zw.ZRS();
  }
  
  private void ZF(ActionEvent paramActionEvent) {
    this.Zw.Zx(this.Zh.getSelectedIndex());
  }
  
  private void Zr(ActionEvent paramActionEvent) {
    this.Zw.Zv(this.Zk.isSelected());
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '÷¥lr²ý]Rý9 Í¸åó!nèPÌ<,¥Rs_ û×Ouou45Ch\\tç0:9ä0gËu\\n]2K¼È2£1¦\§F>ó7,åØDöè\\nÚ.ú"ØÿX~[V¹\ò÷B©âÕ´æ|^aëxþ;\\f~ÎsYX³êKèyEúÛ÷Ké8Ý)®wû(ôÂ>±À¾S¹k »»i9'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: aconst_null
    //   19: bipush #12
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic ZE : ([Ljava/lang/String;)V
    //   27: bipush #12
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 148
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
    //   72: ldc 'Ê¸Hsº<»X¿»µ%ØòÙ©#¶Á0,È½]ÞT»¯VÐbHÄò7&ë´Bèséx:§[ ¹»Ë?X¶öÅ)Ëúézã@lýxU<DÏf£q}½1ù¦/jØ÷u 9 /QèQ´|ÉêÂ+ÔöÎEQ4e*Gfï^TIÀëøäRKóA¥oâ§±J'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: sipush #155
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #107
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 148
    //   104: aload #5
    //   106: swap
    //   107: iload_3
    //   108: iinc #3, 1
    //   111: swap
    //   112: aastore
    //   113: iload_0
    //   114: iload_1
    //   115: iadd
    //   116: dup
    //   117: istore_0
    //   118: iload #4
    //   120: if_icmpge -> 132
    //   123: aload_2
    //   124: iload_0
    //   125: invokevirtual charAt : (I)C
    //   128: istore_1
    //   129: goto -> 87
    //   132: aload #5
    //   134: putstatic burp/Zgoz.a : [Ljava/lang/String;
    //   137: bipush #14
    //   139: anewarray java/lang/String
    //   142: putstatic burp/Zgoz.c : [Ljava/lang/String;
    //   145: goto -> 304
    //   148: dup_x2
    //   149: pop
    //   150: invokevirtual toCharArray : ()[C
    //   153: dup_x1
    //   154: arraylength
    //   155: dup_x2
    //   156: pop
    //   157: iconst_0
    //   158: istore #6
    //   160: dup2_x1
    //   161: pop2
    //   162: dup_x2
    //   163: iconst_1
    //   164: if_icmpgt -> 264
    //   167: dup2
    //   168: swap
    //   169: iload #6
    //   171: dup2_x1
    //   172: caload
    //   173: swap
    //   174: iload #6
    //   176: bipush #7
    //   178: irem
    //   179: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #82
    //   218: goto -> 248
    //   221: bipush #114
    //   223: goto -> 248
    //   226: bipush #13
    //   228: goto -> 248
    //   231: bipush #100
    //   233: goto -> 248
    //   236: bipush #126
    //   238: goto -> 248
    //   241: bipush #117
    //   243: goto -> 248
    //   246: bipush #8
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 171
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 167
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 104
    //   304: new burp/Zze2
    //   307: dup
    //   308: sipush #-17519
    //   311: sipush #-7644
    //   314: invokestatic a : (II)Ljava/lang/String;
    //   317: ldc ''
    //   319: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   322: putstatic burp/Zgoz.Zs : Lburp/Zze2;
    //   325: return
  }
  
  public static void ZE(String[] paramArrayOfString) {
    ZK = paramArrayOfString;
  }
  
  public static String[] ZQ() {
    return ZK;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBB91) & 0xFFFF;
    if (c[i] == null) {
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
      byte b1 = 106;
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgoz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */