package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.Objects;

public class Zgo0 extends Zbqc {
  private final Ztww Zk;
  
  private final Zbqp ZA;
  
  private final Zxrm ZF;
  
  private final Zxyf Zb;
  
  private final Zbc9 ZB;
  
  private Zbqc Zf;
  
  private Ze01 ZD;
  
  private Ze01 ZW;
  
  private Ze01 ZZ;
  
  private Ze01 ZM;
  
  private Ze01 Zx;
  
  private Ze01 Z_;
  
  private Ze01 Zc;
  
  private Zbqc Zz;
  
  private Zzdy ZR;
  
  private Zm99 Zs;
  
  public Zbkc ZL;
  
  private static int[] ZX;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zgo0(Ztww paramZtww, Zr49 paramZr49) {
    this(a(-15180, -1323), paramZtww, paramZr49, (Zbqp)null);
    ZU();
  }
  
  public Zgo0(Ztww paramZtww, Zr49 paramZr49, Zbqp paramZbqp) {
    this((String)null, paramZtww, paramZr49, paramZbqp);
  }
  
  public Zgo0(String paramString, Ztww paramZtww, Zr49 paramZr49, Zbqp paramZbqp) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic ZF : ()[I
    //   7: aload_0
    //   8: aload_2
    //   9: putfield Zk : Lburp/Ztww;
    //   12: astore #5
    //   14: aload_0
    //   15: aload #4
    //   17: putfield ZA : Lburp/Zbqp;
    //   20: aload_0
    //   21: invokevirtual Zr : ()V
    //   24: aload_1
    //   25: ifnull -> 48
    //   28: aload_0
    //   29: getfield ZL : Lburp/Zbkc;
    //   32: aload_1
    //   33: invokevirtual Zx : (Ljava/lang/String;)V
    //   36: aload #5
    //   38: ifnonnull -> 56
    //   41: iconst_5
    //   42: anewarray burp/Zbqc
    //   45: invokestatic Zr : ([Lburp/Zbqc;)V
    //   48: aload_0
    //   49: getfield ZL : Lburp/Zbkc;
    //   52: iconst_0
    //   53: invokevirtual setVisible : (Z)V
    //   56: aload_0
    //   57: new burp/Zxrm
    //   60: dup
    //   61: aload_2
    //   62: invokespecial <init> : (Lburp/Ztww;)V
    //   65: putfield ZF : Lburp/Zxrm;
    //   68: aload_0
    //   69: new burp/Zxyf
    //   72: dup
    //   73: aload_2
    //   74: aload_3
    //   75: invokespecial <init> : (Lburp/Ztww;Lburp/Zr49;)V
    //   78: putfield Zb : Lburp/Zxyf;
    //   81: aload_0
    //   82: new burp/Zbc9
    //   85: dup
    //   86: iconst_2
    //   87: anewarray java/awt/Component
    //   90: dup
    //   91: iconst_0
    //   92: aload_0
    //   93: getfield ZF : Lburp/Zxrm;
    //   96: invokevirtual ZC : ()Ljava/awt/Component;
    //   99: aastore
    //   100: dup
    //   101: iconst_1
    //   102: aload_0
    //   103: getfield Zb : Lburp/Zxyf;
    //   106: invokevirtual ZS : ()Ljava/awt/Component;
    //   109: aastore
    //   110: invokespecial <init> : ([Ljava/awt/Component;)V
    //   113: putfield ZB : Lburp/Zbc9;
    //   116: new java/awt/GridBagConstraints
    //   119: dup
    //   120: invokespecial <init> : ()V
    //   123: astore #6
    //   125: aload #6
    //   127: iconst_0
    //   128: putfield gridx : I
    //   131: aload #6
    //   133: iconst_4
    //   134: putfield gridy : I
    //   137: aload #6
    //   139: iconst_3
    //   140: putfield gridheight : I
    //   143: aload #6
    //   145: iconst_1
    //   146: putfield fill : I
    //   149: aload #6
    //   151: dconst_1
    //   152: putfield weightx : D
    //   155: aload #6
    //   157: dconst_1
    //   158: putfield weighty : D
    //   161: aload #6
    //   163: bipush #18
    //   165: putfield anchor : I
    //   168: aload_0
    //   169: aload_0
    //   170: getfield ZB : Lburp/Zbc9;
    //   173: aload #6
    //   175: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   178: return
  }
  
  private void ZU() {
    this.Zf.setVisible(false);
  }
  
  public void ZB(List<String> paramList1, List<String> paramList2) {
    this.ZF.ZJ(paramList1, paramList2);
  }
  
  public void ZQ(List<Zmy8> paramList1, List<Zmy8> paramList2) {
    this.Zb.ZV(paramList1, paramList2);
  }
  
  public void Zi() {
    this.ZB.ZP(this.ZF.ZC());
    this.ZR.setSelected(false);
    this.Zz.setVisible(false);
  }
  
  public void Zp() {
    this.ZB.ZP(this.Zb.ZS());
    this.ZR.setSelected(true);
    this.Zz.setVisible(true);
  }
  
  public void Zk() {
    this.ZF.Zh();
  }
  
  public void ZG() {
    Zrhb zrhb = this.ZA.Zh(this.Zc, new Zmln[] { Zmln.SCOPE });
    Zrve zrve = zrhb.ZC();
    if (zrve != null)
      this.Zk.Zl(zrve.ZR()); 
  }
  
  private void ZM() {
    Objects.requireNonNull(this.Zk);
    new Zr7y(this, this.Zk::Zv, Zzv7.SCOPE_SAVE_TO_LIBRARY_DIALOG);
  }
  
  public void Ze() {
    this.ZR.setEnabled(false);
    this.ZD.setEnabled(false);
    this.ZW.setEnabled(false);
    this.Zx.setEnabled(false);
    this.ZZ.setEnabled(false);
    this.ZM.setEnabled(false);
    this.Zc.setEnabled(false);
    this.ZF.Zz();
    this.Zb.Zh();
  }
  
  private void Zr() {
    this.ZL = new Zbkc();
    this.ZR = new Zzdy();
    this.Zz = new Zbqc();
    this.Zs = new Zm99();
    this.ZD = new Ze01();
    this.ZW = new Ze01();
    this.Zx = new Ze01();
    this.ZM = new Ze01();
    this.ZZ = new Ze01();
    this.Zf = new Zbqc();
    this.Zc = new Ze01();
    this.Z_ = new Ze01();
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout1);
    this.ZL.Zx(a(-15183, -15611));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 5, 0);
    add(this.ZL, gridBagConstraints);
    this.ZR.setText(a(-15182, -25960));
    this.ZR.addActionListener(new Zzab(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    add(this.ZR, gridBagConstraints);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0 };
    gridBagLayout2.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    this.Zz.setLayout(gridBagLayout2);
    this.Zs.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    this.Zz.add(this.Zs, gridBagConstraints);
    this.ZD.setText(a(-15174, -30885));
    this.ZD.addActionListener(new Zlev(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.Zz.add(this.ZD, gridBagConstraints);
    this.ZW.setText(a(-15173, 25496));
    this.ZW.addActionListener(new Zeu(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.Zz.add(this.ZW, gridBagConstraints);
    this.Zx.setText(a(-15184, -10556));
    this.Zx.addActionListener(new Zmsy(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.Zz.add(this.Zx, gridBagConstraints);
    this.ZM.setText(a(-15181, 11160));
    this.ZM.addActionListener(new Zkq8(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.Zz.add(this.ZM, gridBagConstraints);
    this.ZZ.setText(a(-15179, 1006));
    this.ZZ.addActionListener(new Zreo(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.Zz.add(this.ZZ, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zz, gridBagConstraints);
    this.Zf.setLayout(new GridLayout(1, 0, 10, 0));
    this.Zc.setText(a(-15178, -4906));
    this.Zc.addActionListener(new Zm_q(this));
    this.Zf.add(this.Zc);
    this.Z_.setText(a(-15177, -16551));
    this.Z_.addActionListener(new Ztfq(this));
    this.Zf.add(this.Z_);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 23;
    add(this.Zf, gridBagConstraints);
  }
  
  private void Zn(ActionEvent paramActionEvent) {
    this.Zk.Zb(!this.ZR.isSelected());
  }
  
  private void Zj(ActionEvent paramActionEvent) {
    this.Zb.ZJ();
  }
  
  private void Zi(ActionEvent paramActionEvent) {
    this.Zb.Zp();
  }
  
  private void ZW(ActionEvent paramActionEvent) {
    this.Zb.Zg();
  }
  
  private void ZD(ActionEvent paramActionEvent) {
    this.Zb.ZB();
  }
  
  private void ZI(ActionEvent paramActionEvent) {
    this.Zb.Zr();
  }
  
  private void ZR(ActionEvent paramActionEvent) {
    this.Zk.ZZK();
  }
  
  private void Ze(ActionEvent paramActionEvent) {
    ZM();
  }
  
  public static void Zk(int[] paramArrayOfint) {
    ZX = paramArrayOfint;
  }
  
  public static int[] ZF() {
    return ZX;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: iconst_5
    //   10: newarray int
    //   12: ldc 'ÐQS¶*Òrl\\b\\tû¹ïÍâê>&²¡ÿvlsh¼ÿÙ\\r~"UG$.§êyýÿ\\r´Ñ¶þêyçØKÈÌí&$w«y\\b¯¶ÇùB©g6¿'
    //   14: dup
    //   15: astore_2
    //   16: invokevirtual length : ()I
    //   19: istore #4
    //   21: bipush #9
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: invokestatic Zk : ([I)V
    //   29: bipush #8
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 148
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: ldc '[¿|Ò'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: iconst_4
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #83
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
    //   134: putstatic burp/Zgo0.a : [Ljava/lang/String;
    //   137: bipush #10
    //   139: anewarray java/lang/String
    //   142: putstatic burp/Zgo0.b : [Ljava/lang/String;
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
    //   164: if_icmpgt -> 263
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
    //   216: bipush #9
    //   218: goto -> 247
    //   221: bipush #44
    //   223: goto -> 247
    //   226: bipush #72
    //   228: goto -> 247
    //   231: bipush #41
    //   233: goto -> 247
    //   236: bipush #56
    //   238: goto -> 247
    //   241: bipush #36
    //   243: goto -> 247
    //   246: iconst_5
    //   247: ixor
    //   248: ixor
    //   249: i2c
    //   250: castore
    //   251: iinc #6, 1
    //   254: dup
    //   255: ifne -> 263
    //   258: dup2
    //   259: dup_x1
    //   260: goto -> 171
    //   263: dup2_x1
    //   264: pop2
    //   265: dup_x2
    //   266: iload #6
    //   268: if_icmpgt -> 167
    //   271: pop
    //   272: new java/lang/String
    //   275: dup_x1
    //   276: swap
    //   277: invokespecial <init> : ([C)V
    //   280: invokevirtual intern : ()Ljava/lang/String;
    //   283: swap
    //   284: pop
    //   285: swap
    //   286: tableswitch default -> 46, 0 -> 104
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC4B3) & 0xFFFF;
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
      byte b1 = 42;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgo0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */