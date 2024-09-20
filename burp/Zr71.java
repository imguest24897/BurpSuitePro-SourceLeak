package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zr71 extends Zrh7 {
  private final Zr_4 ZW;
  
  private final Zz0n Zu;
  
  private final Zgb6 Zg;
  
  private final Zbnt ZX;
  
  private final Ztwv ZG;
  
  private final Zr73 ZA;
  
  private final Ztpb ZV;
  
  private final List<Zbyh> Zo = new ArrayList<>();
  
  private final Ztny Zm;
  
  private final Zbws ZB;
  
  private final Ze4m ZU;
  
  private final Zey9 Zf;
  
  private Zm2o Zi;
  
  private Zbkc ZK;
  
  private Zzdy ZR;
  
  private Zzdy Zt;
  
  private Ze01 ZE;
  
  private Ze01 ZL;
  
  private Ze01 Zl;
  
  private Ze01 Zz;
  
  private Zl8w ZJ;
  
  private Zbqc Zj;
  
  private Zm99 ZF;
  
  private Zm99 Zn;
  
  private Zm99 Zw;
  
  private Zbqc Z_;
  
  private Zbup ZQ;
  
  private Zbup ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zr71(Zz0n paramZz0n, Zgb6 paramZgb6, Zr73 paramZr73, Ztpb paramZtpb, int paramInt, Window paramWindow, Ztwv paramZtwv, Zr_4 paramZr_4, Ze4m paramZe4m, Zbnt paramZbnt, Zey9 paramZey9) {
    super(paramWindow, true, Zzv7.MACRO_ITEM_EDITOR_UI_DIALOG);
    String[] arrayOfString = Zlil.Za();
    Zuh.Zv((paramZbnt != null), Zqf.Zv, 1L);
    Zuh.Zv((paramZr_4 != null), Zqf.Zv, 2L);
    this.Zu = paramZz0n;
    this.Zg = paramZgb6;
    this.ZA = paramZr73;
    this.ZV = paramZtpb;
    this.ZG = paramZtwv;
    this.ZW = paramZr_4;
    this.ZU = paramZe4m;
    this.ZX = paramZbnt;
    this.Zf = paramZey9;
    ZT();
    Zmse.Zf(this.ZQ, 100, 12);
    Zmse.Zf(this.ZP, 100, 12);
    this.ZF.Ze(Zlkk.BURP_TITLE);
    this.Zn.Ze(Zlkk.BURP_TITLE);
    this.Zw.Ze(Zlkk.BURP_TITLE);
    this.ZR.setSelected(paramZtpb.Zn());
    this.Zt.setSelected(paramZtpb.Zt());
    if (paramZtpb.Zs() != null && paramZtpb.Zs().size() > 0)
      for (Zmfi zmfi : paramZtpb.Zs()) {
        Zbyh zbyh = new Zbyh(zmfi, paramInt);
        this.Zo.add(zbyh);
        this.Z_.add(zbyh);
        if (arrayOfString == null)
          break; 
      }  
    this.Zm = new Ztny(paramZtpb.Zh());
    this.ZB = new Zbws(this.Zm);
    this.ZQ.setViewportView(this.ZB);
    a(-18505, 14603);
    setTitle(a(-18505, 14603) + a(-18505, 14603) + paramZtpb.Zj().toUpperCase() + a(-18513, -12585));
    setDefaultCloseOperation(0);
    addWindowListener(new Zsiu(this));
    pack();
    Zq(paramWindow);
  }
  
  private void ZT() {
    this.Zj = new Zbqc();
    this.Zt = new Zzdy();
    this.ZR = new Zzdy();
    this.Zn = new Zm99();
    this.Zz = new Ze01();
    this.Zl = new Ze01();
    this.ZL = new Ze01();
    this.ZE = new Ze01();
    this.ZQ = new Zbup();
    this.ZP = new Zbup();
    this.Z_ = new Zbqc();
    this.Zw = new Zm99();
    this.ZF = new Zm99();
    this.ZJ = new Zl8w();
    this.ZK = new Zbkc();
    this.Zi = new Zm2o();
    setDefaultCloseOperation(2);
    this.Zj.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 
        0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 
        0, 10, 0 };
    this.Zj.setLayout(gridBagLayout);
    this.Zt.setText(a(-18503, 25151));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    this.Zj.add(this.Zt, gridBagConstraints);
    this.ZR.setText(a(-18511, 32684));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    this.Zj.add(this.ZR, gridBagConstraints);
    this.Zn.setText(a(-18508, -21910));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    this.Zj.add(this.Zn, gridBagConstraints);
    this.Zz.setText(a(-18501, 19785));
    this.Zz.addActionListener(new Zgks(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 26;
    this.Zj.add(this.Zz, gridBagConstraints);
    this.Zl.setText(a(-18502, 18443));
    this.Zl.setToolTipText(a(-18512, -18083));
    this.Zl.addActionListener(new Zx5e(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 24;
    this.Zj.add(this.Zl, gridBagConstraints);
    this.ZL.setText(a(-18506, -25785));
    this.ZL.setToolTipText(a(-18498, -22072));
    this.ZL.addActionListener(new Ztma(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 24;
    this.Zj.add(this.ZL, gridBagConstraints);
    this.ZE.setText(a(-18509, -176));
    this.ZE.setToolTipText(a(-18510, 19391));
    this.ZE.addActionListener(new Zg1i(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 24;
    this.Zj.add(this.ZE, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.gridheight = 5;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 0.2D;
    this.Zj.add(this.ZQ, gridBagConstraints);
    this.Z_.setLayout(new BoxLayout(this.Z_, 1));
    this.ZP.setViewportView(this.Z_);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    this.Zj.add(this.ZP, gridBagConstraints);
    this.Zw.setText(a(-18499, 26593));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    this.Zj.add(this.Zw, gridBagConstraints);
    this.ZF.setText(a(-18500, 8966));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    this.Zj.add(this.ZF, gridBagConstraints);
    this.ZJ.setText(a(-18497, -22199));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    this.Zj.add(this.ZJ, gridBagConstraints);
    this.ZK.Zx(a(-18504, -14586));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    this.Zj.add(this.ZK, gridBagConstraints);
    this.Zi.Zi(Zk97.DESKTOP_OPTIONS_SESSIONS_MACRO_EDITOR_CONFIGURING_MACRO_ITEMS);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.Zj.add(this.Zi, gridBagConstraints);
    getContentPane().add(this.Zj, a(-18507, 21231));
    pack();
  }
  
  private void ZR(ActionEvent paramActionEvent) {
    this.ZV.ZX(this.ZR.isSelected());
    this.ZV.Zc(this.Zt.isSelected());
    Iterator<Zbyh> iterator = this.Zo.iterator();
    String[] arrayOfString = Zlil.Za();
    while (iterator.hasNext()) {
      Zbyh zbyh = iterator.next();
      zbyh.Zy();
      if (arrayOfString == null)
        break; 
    } 
    this.ZA.Zh(this.ZV);
    setVisible(false);
    dispose();
  }
  
  private void ZT(ActionEvent paramActionEvent) {
    Zmo2 zmo2 = this.ZW.<Zmo2>ZH(new Zmah());
    Zr7s zr7s = new Zr7s(Zt2m.ZF(this), zmo2, this.ZU, this.ZV.ZP().Zdz(), this.ZV.Zp().ZiD(), this.ZV, this.Zg, this.ZX, this.Zu.ZD(), this.ZG, this.ZW, this.Zf);
    zr7s.setVisible(true);
    Zkk3 zkk3 = zr7s.Zw();
    if (zkk3 == null)
      return; 
    zmo2.ZoJ(zr7s.ZE());
    zmo2.Zos(zr7s.Zp());
    zmo2.ZoL(zr7s.ZX());
    zmo2.Zb(zkk3);
    this.Zm.Zw(zmo2);
  }
  
  private void ZY(ActionEvent paramActionEvent) {
    int i = this.ZB.getSelectedRow();
    if (i >= 0 && i < this.ZB.getRowCount()) {
      i = this.ZB.convertRowIndexToModel(i);
      Zmo2 zmo2 = this.Zm.ZC(i);
      Zr7s zr7s = new Zr7s(Zt2m.ZF(this), zmo2, this.ZU, this.ZV.ZP().Zdz(), this.ZV.Zp().ZiD(), this.ZV, this.Zg, this.ZX, this.Zu.ZD(), this.ZG, this.ZW, this.Zf);
      zr7s.setVisible(true);
      Zkk3 zkk3 = zr7s.Zw();
      if (zkk3 == null)
        return; 
      zmo2.ZoJ(zr7s.ZE());
      zmo2.Zos(zr7s.Zp());
      zmo2.ZoL(zr7s.ZX());
      zmo2.Zb(zkk3);
      this.Zm.ZH(i);
    } 
  }
  
  private void Z_(ActionEvent paramActionEvent) {
    int i = this.ZB.getSelectedRow();
    if (i >= 0 && i < this.ZB.getRowCount()) {
      this.Zm.Zn(this.ZB.convertRowIndexToModel(i));
      this.ZB.getSelectionModel().setSelectionInterval(i, i);
      this.ZB.requestFocus();
    } 
    if (i >= this.ZB.getRowCount())
      i--; 
    if (i >= 0 && i < this.ZB.getRowCount())
      this.ZB.getSelectionModel().setSelectionInterval(i, i); 
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '; òéËäà¤½´ÛË:"8úo$L R~ ~½ÉøêÑ¡r\\bÁh&u\\bËCj±z±Ivi±a­íÎéÜé/T´l´S­#È2+ µ@3xÓsW²åÁû×,\\n+ú\ïÌF=¶nl^ufî)Twp`&¯\\bCgÄ¾öë$nõ÷ôÇ×§CÒ¼õ¤[,ÚYý*ç~tI½?PHù,g$Û PÏ°³£opN?<ÔÈÐ=¤×1Ï¹ dþ_OpÅ ûUv?ÜÚoôÍ±æmðÐ¿®MÇ8;Ó9/Qù½H-W0Øïíq­\\t×|áÆ-t{6ú;Ä]äg½Mew·§çXÊ};Ù3¾Ù®Vyþûê:N6óGÜ¹«Û,8Ú=\\f$L&U-[ÏÎF{2©ÈzEáÒ`QaY¦ùøí`ÖC»^MÿÀá3¼4^yÕD+6¸´-¿Ù?oc$2æs;BpÀºÐn<)Uuú|óRflM¿~[¥ÒÑ=g 74=<í2ü~Í»kY`íM'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #77
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #101
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
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
    //   68: ldc 'î8ÀE=°ïÃxÿ¥Û!ÉM¨^<Ì­=Àû\\n*\Åxÿ-Ð\\fÆÅYyÄïoÎ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #35
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #8
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
    //   129: putstatic burp/Zr71.a : [Ljava/lang/String;
    //   132: bipush #17
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zr71.b : [Ljava/lang/String;
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
    //   212: bipush #113
    //   214: goto -> 244
    //   217: bipush #102
    //   219: goto -> 244
    //   222: bipush #55
    //   224: goto -> 244
    //   227: bipush #28
    //   229: goto -> 244
    //   232: bipush #59
    //   234: goto -> 244
    //   237: bipush #113
    //   239: goto -> 244
    //   242: bipush #107
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
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB7BF) & 0xFFFF;
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
      char c = 'À';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr71.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */