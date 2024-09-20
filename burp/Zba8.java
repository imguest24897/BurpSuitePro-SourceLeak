package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.border.Border;

public class Zba8 extends Zbv5 implements Zsnh {
  private final Zxz8 ZB;
  
  private final Zsnq Zb;
  
  private final Zb93 ZC;
  
  private Zt_b ZM;
  
  private Zbws Zf;
  
  private boolean Zl;
  
  private Ze01 ZS;
  
  private ButtonGroup ZO;
  
  private Zzdy Zs;
  
  private Zzdy ZE;
  
  private Zzdy ZH;
  
  private Zzdy ZP;
  
  private Zzdy Zg;
  
  private Zl8w ZD;
  
  private Zm99 ZR;
  
  private Zbkc Zn;
  
  private Zmg2 Zh;
  
  private Zmg2 Z_;
  
  private Zmyw Zr;
  
  private static boolean Zx;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zba8(Zxz8 paramZxz8, Zsnq paramZsnq) {
    this.ZB = paramZxz8;
    this.Zb = paramZsnq;
    ZKZ();
    Zt();
    this.ZC = new Zb93(paramZxz8, this.Zf, this.ZM, this);
  }
  
  private void Zt() {
    this.ZM = new Zt_b(this.ZB, this.Zb);
    this.Zf = new Zbws(this.ZM);
    this.Zf.Zk(new Zti2(this));
    Zbup zbup = new Zbup();
    zbup.setViewportView(this.Zf);
    zbup.setVerticalScrollBarPolicy(22);
    Zmse.Zf(zbup, 100, 20);
    Zbqc zbqc = new Zbqc();
    zbqc.setLayout(new BorderLayout());
    if (this.Zb.ZJ()) {
      Zbkd zbkd = new Zbkd();
      zbqc.add(zbkd, a(-5766, 8172));
      Zzm zzm = new Zzm(this.ZM);
      zbkd.ZX(zzm, (Zx08<Zrn3>[])new Zx08[] { Zx08.ZU(new Zxdd[] { Zxdd.PASSIVE, Zxdd.LIGHT, Zxdd.MEDIUM, Zxdd.INTRUSIVE, Zxdd.JAVASCRIPT }) });
    } 
    zbqc.add(zbup, a(-5763, -2493));
    this.Zr.setLeftComponent(zbqc);
    this.Zr.Za(125);
  }
  
  private void Zg(boolean paramBoolean) {
    this.Zb.Zu(paramBoolean, this.Zg, this.ZH, this.ZP, this.Zs, this.ZE);
  }
  
  private void Ze(boolean paramBoolean) {
    this.Zl = paramBoolean;
    this.ZM.Zl(paramBoolean);
  }
  
  public String ZZ() {
    return this.Zn.Zr();
  }
  
  public Zk97 ZR() {
    return Zk97.DESKTOP_SCANNING_AUDIT_OPTIONS_ISSUES_REPORTED;
  }
  
  public String Zq() {
    return a(-5775, 24501);
  }
  
  public Zmf_ Zn() {
    Zzkm zzkm = new Zzkm();
    this.ZB.Zl(zzkm);
    return zzkm.ZV(new String[] { a(-5772, -969) });
  }
  
  public String ZE() {
    return a(-5769, 30488);
  }
  
  public void Zt2() {
    this.Zb.ZY(this.ZB);
    this.Zg.setSelected(this.ZB.ZmK());
    this.ZH.setSelected(this.ZB.Zmw());
    this.ZP.setSelected(this.ZB.ZmU());
    this.Zs.setSelected(this.ZB.ZmH());
    this.ZE.setSelected(this.ZB.ZmS());
    this.Zh.setSelected(this.ZB.ZmV());
    this.ZM.Zx();
    Ze(this.ZB.ZmV());
    Zg(!this.ZB.ZmV());
  }
  
  private void ZN(int paramInt) {
    Zxjc zxjc = this.ZM.Za(paramInt);
    zxjc.Zm = !zxjc.Zm;
    this.ZB.ZX(zxjc.Zl, zxjc.Zm);
    this.ZM.fireTableCellUpdated(paramInt, 0);
  }
  
  private void Zx(Zzdy paramZzdy) {
    if (!this.Zg.isSelected() && (!this.ZH.isEnabled() || !this.ZH.isSelected()) && (!this.ZP.isEnabled() || !this.ZP.isSelected()) && (!this.Zs.isEnabled() || !this.Zs.isSelected())) {
      paramZzdy.setSelected(true);
      return;
    } 
    this.ZE.setEnabled((this.Zg.isSelected() || this.ZP.isSelected()));
    this.ZB.Zgn(this.Zg.isSelected());
    this.ZB.ZgR(this.ZH.isSelected());
    this.ZB.Zg_(this.ZP.isSelected());
    this.ZB.Zgx(this.Zs.isSelected());
    this.ZB.Zgu(this.ZE.isSelected());
  }
  
  private void ZKZ() {
    this.ZO = new ButtonGroup();
    this.Zn = new Zbkc();
    this.ZD = new Zl8w();
    this.Z_ = new Zmg2();
    this.ZR = new Zm99();
    this.Zg = new Zzdy();
    this.ZH = new Zzdy();
    this.ZP = new Zzdy();
    this.Zs = new Zzdy();
    this.ZE = new Zzdy();
    this.Zh = new Zmg2();
    this.Zr = new Zmyw();
    this.ZS = new Ze01();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    setLayout(gridBagLayout);
    this.Zn.Zx(a(-5771, 12570));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.Zn, gridBagConstraints);
    this.ZD.setBorder((Border)null);
    this.ZD.setText(a(-5765, -16825));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZD, gridBagConstraints);
    this.ZO.add(this.Z_);
    this.Z_.setSelected(true);
    this.Z_.setText(a(-5767, -15337));
    this.Z_.addActionListener(new Zrtq(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(15, 0, 5, 0);
    add(this.Z_, gridBagConstraints);
    this.ZR.setText(a(-5764, 21439));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    add(this.ZR, gridBagConstraints);
    this.Zg.setSelected(true);
    this.Zg.setText(a(-5773, -17400));
    this.Zg.addActionListener(new Zb8k(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 23;
    add(this.Zg, gridBagConstraints);
    this.ZH.setSelected(true);
    this.ZH.setText(a(-5768, -16379));
    this.ZH.addActionListener(new Zxx7(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 23;
    add(this.ZH, gridBagConstraints);
    this.ZP.setSelected(true);
    this.ZP.setText(a(-5761, 10618));
    this.ZP.addActionListener(new Zxg2(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 23;
    add(this.ZP, gridBagConstraints);
    this.Zs.setSelected(true);
    this.Zs.setText(a(-5770, 30747));
    this.Zs.addActionListener(new Ztbk(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 23;
    add(this.Zs, gridBagConstraints);
    this.ZE.setSelected(true);
    this.ZE.setText(a(-5762, -29494));
    this.ZE.addActionListener(new Zzkt(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 23;
    add(this.ZE, gridBagConstraints);
    this.ZO.add(this.Zh);
    this.Zh.setText(a(-5774, -8407));
    this.Zh.addActionListener(new Zgj7(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(15, 0, 5, 0);
    add(this.Zh, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zr, gridBagConstraints);
    this.ZS.setText(a(-5776, -25750));
    this.ZS.addActionListener(new Zmfg(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.anchor = 26;
    add(this.ZS, gridBagConstraints);
  }
  
  private void Zx(ActionEvent paramActionEvent) {
    Zg(true);
    Ze(false);
    this.ZB.ZgJ(false);
  }
  
  private void Ze(ActionEvent paramActionEvent) {
    Zg(false);
    Ze(true);
    this.ZB.ZgJ(true);
  }
  
  private void Zb(ActionEvent paramActionEvent) {
    this.ZC.ZC(Zt2m.ZF(this));
  }
  
  private void ZC(ActionEvent paramActionEvent) {
    Zx(this.Zg);
  }
  
  private void ZK(ActionEvent paramActionEvent) {
    Zx(this.ZH);
  }
  
  private void Zg(ActionEvent paramActionEvent) {
    Zx(this.ZP);
  }
  
  private void ZL(ActionEvent paramActionEvent) {
    Zx(this.Zs);
  }
  
  private void ZZ(ActionEvent paramActionEvent) {
    Zx(this.ZE);
  }
  
  public static void Zu(boolean paramBoolean) {
    Zx = paramBoolean;
  }
  
  public static boolean ZKF() {
    return Zx;
  }
  
  public static boolean ZKe() {
    boolean bool = ZKF();
    return !bool;
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc 'ÝíÉË-s"l\\fÊw@åÈÅ_îáoíRLGaï¢¯yù5ïV 96á\\b;\\rçlX`Ìà¤à)8è\\tå0Gü¥_ïL»ß}I~>ß/&ú2Õ&È©AÿÍ|Lïà¸¶RÁ ç}Â\\nç/ÞLfPi1áeg=n(Ú *H¡« 2zJ£ÀàãáccÂ¯ÄØ9vßH0ucÔHF\\fá¶¹<­RõXJ*\\r¥ÆH?$I» "~þ÷ÝÆol­_Úß[Í÷i7ö²m]SQSð$¢ÒÞÏMÓI\\nØLóúÂ..I³1)çÂ éWâÅrð9WãT|¾f KU[BÀüÍÉÄ.À^s~òæ»fêÖµÑKöYÐ éiZA?46&_$à]Í@&-¤op÷äÔöÒa«!WSç´ÎõÉ[soCC= Òfí¯ÆÒs]ôb¶ò­]°ZáZRO+M)ç¯tö@\\f[9¬B¹%)nYüß_Ý3v7¨oÛY\!Ák §c¢OµkÔ9Ú'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic Zu : (Z)V
    //   22: bipush #17
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #125
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
    //   72: ldc '®rÀãÑíÄ2È ®¤\\bcóÒ2\\rRþªþê!:Ã«Û'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #19
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #94
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
    //   133: putstatic burp/Zba8.a : [Ljava/lang/String;
    //   136: bipush #16
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zba8.b : [Ljava/lang/String;
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
    //   216: bipush #6
    //   218: goto -> 248
    //   221: bipush #51
    //   223: goto -> 248
    //   226: bipush #53
    //   228: goto -> 248
    //   231: bipush #114
    //   233: goto -> 248
    //   236: bipush #17
    //   238: goto -> 248
    //   241: bipush #12
    //   243: goto -> 248
    //   246: bipush #43
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
    int i = (paramInt1 ^ 0xFFFFE970) & 0xFFFF;
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
      byte b1 = 125;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zba8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */