package burp;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbbb extends Zbbv {
  private Zred Zk;
  
  private final Zg85[] ZD = new Zg85[16];
  
  private final Zg85[] ZW = new Zg85[16];
  
  public Zzdy Zv;
  
  private Zl8w Z_;
  
  private Zm99 Zb;
  
  private Zbqc ZH;
  
  private Zbqc ZK;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbbb(Zz0n paramZz0n, Zt4u paramZt4u, Zbyw paramZbyw, Zr_4 paramZr_4) {
    super(paramZz0n, paramZt4u, paramZbyw, a(22389, -9491), paramZr_4, true);
    this.Zg = this.Zk = paramZr_4.<Zgpi>ZH(new Zsna(paramZbyw.ZP().ZM(), this.ZN.ZK()));
    String[] arrayOfString = Zbb7.ZS();
    ZC();
    this.Zb.Ze(Zlkk.BURP_TITLE);
    this.ZH.add(this.ZN, a(22385, -7852));
    Zrjz zrjz = new Zrjz(this);
    byte b1 = 0;
    while (b1 < 16) {
      this.ZD[b1] = new Zg85(2);
      this.ZD[b1].addKeyListener(zrjz);
      this.ZW[b1] = new Zg85(2);
      this.ZW[b1].addKeyListener(zrjz);
      Zbqc zbqc = new Zbqc();
      zbqc.setLayout(new FlowLayout(0, 0, 0));
      zbqc.add(this.ZD[b1]);
      Zm99 zm99 = new Zm99(">");
      zbqc.add(zm99);
      zbqc.add(this.ZW[b1]);
      zbqc.add(new Zm99(a(22384, 7583)));
      this.ZK.add(zbqc);
      b1++;
      if (arrayOfString == null)
        break; 
    } 
    String str1 = a(22399, -4431);
    String str2 = a(22393, 21340);
    byte b2 = 0;
    while (b2 < str1.length()) {
      this.ZD[b2].setText(str1.substring(b2, b2 + 1));
      this.ZW[b2].setText(str2.substring(b2, b2 + 1));
      b2++;
      if (arrayOfString == null)
        break; 
    } 
    ZB();
  }
  
  public void ZB() {
    // Byte code:
    //   0: new java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic ZS : ()[Ljava/lang/String;
    //   11: new java/io/ByteArrayOutputStream
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore_3
    //   19: astore_1
    //   20: aload_0
    //   21: getfield Zv : Lburp/Zzdy;
    //   24: invokevirtual isSelected : ()Z
    //   27: istore #4
    //   29: iconst_0
    //   30: istore #5
    //   32: iload #5
    //   34: bipush #16
    //   36: if_icmpge -> 174
    //   39: aload_0
    //   40: getfield ZD : [Lburp/Zg85;
    //   43: iload #5
    //   45: aaload
    //   46: invokevirtual getText : ()Ljava/lang/String;
    //   49: astore #6
    //   51: aload #6
    //   53: invokevirtual length : ()I
    //   56: iconst_1
    //   57: if_icmpne -> 167
    //   60: aload_0
    //   61: getfield ZW : [Lburp/Zg85;
    //   64: iload #5
    //   66: aaload
    //   67: invokevirtual getText : ()Ljava/lang/String;
    //   70: astore #7
    //   72: aload #7
    //   74: invokevirtual length : ()I
    //   77: iconst_1
    //   78: if_icmpne -> 167
    //   81: iload #4
    //   83: ifeq -> 112
    //   86: aload_2
    //   87: aload #6
    //   89: invokestatic Zy : (Ljava/lang/String;)[B
    //   92: iconst_0
    //   93: iconst_1
    //   94: invokevirtual write : ([BII)V
    //   97: aload_3
    //   98: aload #7
    //   100: invokestatic Zy : (Ljava/lang/String;)[B
    //   103: iconst_0
    //   104: iconst_1
    //   105: invokevirtual write : ([BII)V
    //   108: aload_1
    //   109: ifnonnull -> 167
    //   112: aload #6
    //   114: invokestatic Zy : (Ljava/lang/String;)[B
    //   117: astore #8
    //   119: aload #8
    //   121: invokestatic Zq : ([B)V
    //   124: aload_2
    //   125: aload #8
    //   127: iconst_0
    //   128: iconst_1
    //   129: invokevirtual write : ([BII)V
    //   132: aload #8
    //   134: invokestatic ZO : ([B)V
    //   137: aload_2
    //   138: aload #8
    //   140: iconst_0
    //   141: iconst_1
    //   142: invokevirtual write : ([BII)V
    //   145: aload_3
    //   146: aload #7
    //   148: invokestatic Zy : (Ljava/lang/String;)[B
    //   151: iconst_0
    //   152: iconst_1
    //   153: invokevirtual write : ([BII)V
    //   156: aload_3
    //   157: aload #7
    //   159: invokestatic Zy : (Ljava/lang/String;)[B
    //   162: iconst_0
    //   163: iconst_1
    //   164: invokevirtual write : ([BII)V
    //   167: iinc #5, 1
    //   170: aload_1
    //   171: ifnonnull -> 32
    //   174: aload_2
    //   175: invokevirtual size : ()I
    //   178: istore #5
    //   180: aload_0
    //   181: getfield Zk : Lburp/Zred;
    //   184: aload_2
    //   185: invokevirtual toByteArray : ()[B
    //   188: aload_3
    //   189: invokevirtual toByteArray : ()[B
    //   192: invokeinterface Zd : ([B[B)V
    //   197: aload_0
    //   198: getfield ZN : Lburp/Zbys;
    //   201: invokevirtual ZK : ()Lburp/Zefg;
    //   204: invokeinterface size : ()I
    //   209: istore #6
    //   211: iload #5
    //   213: ifne -> 223
    //   216: iconst_0
    //   217: istore #6
    //   219: aload_1
    //   220: ifnonnull -> 246
    //   223: iload #5
    //   225: iconst_3
    //   226: if_icmpge -> 239
    //   229: iload #6
    //   231: iconst_4
    //   232: imul
    //   233: istore #6
    //   235: aload_1
    //   236: ifnonnull -> 246
    //   239: iload #6
    //   241: bipush #8
    //   243: imul
    //   244: istore #6
    //   246: aload_0
    //   247: getfield Zk : Lburp/Zred;
    //   250: iload #6
    //   252: invokeinterface ZvH : (I)V
    //   257: aload_0
    //   258: getfield Zw : Lburp/Zbyw;
    //   261: iload #6
    //   263: iconst_1
    //   264: invokevirtual Z_ : (IZ)V
    //   267: return
  }
  
  private void ZC() {
    this.ZK = new Zbqc();
    this.Zv = new Zzdy();
    this.ZH = new Zbqc();
    this.Zb = new Zm99();
    this.Z_ = new Zl8w();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZK.setLayout(new GridLayout(4, 4, 0, 5));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 18;
    add(this.ZK, gridBagConstraints);
    this.Zv.setText(a(22388, -31906));
    this.Zv.addActionListener(new Zl2n(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    add(this.Zv, gridBagConstraints);
    this.ZH.setLayout(new BorderLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZH, gridBagConstraints);
    this.Zb.setText(a(22386, -1409));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zb, gridBagConstraints);
    this.Z_.setText(a(22392, -21407));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.Z_, gridBagConstraints);
  }
  
  private void ZL(ActionEvent paramActionEvent) {
    ZB();
  }
  
  public void Zd(Zmjc paramZmjc, int paramInt) {
    paramZmjc.Zt(a(22398, 19641) + a(22398, 19641), Boolean.toString(this.Zv.isSelected()));
    byte b = 0;
    String[] arrayOfString = Zbb7.ZS();
    while (b < 16) {
      int i = paramInt;
      byte b1 = b;
      paramZmjc.Zt(a(22394, 6755) + a(22394, 6755) + b1, this.ZD[b].getText());
      int j = paramInt;
      byte b2 = b;
      paramZmjc.Zt(a(22390, 10701) + a(22390, 10701) + b2, this.ZW[b].getText());
      b++;
      if (arrayOfString == null)
        break; 
    } 
  }
  
  public void ZE(Ze9k paramZe9k, Zsh8 paramZsh8, int paramInt) {
    String[] arrayOfString = Zbb7.ZS();
    Zzvm zzvm = paramZe9k.Zyi();
    Zuh.Zv((paramZe9k.Zyi() == this.Zg.Zyi()), Zqf.Zk, zzvm.id);
    this.Zg = this.Zk = (Zred)paramZe9k;
    this.Zv.setSelected(Boolean.parseBoolean(paramZsh8.ZMm(a(22395, 9345) + a(22395, 9345))));
    byte b = 0;
    while (b < 16) {
      int i = paramInt;
      byte b1 = b;
      this.ZD[b].setText(paramZsh8.ZMm(a(22387, -22345) + a(22387, -22345) + b1));
      int j = paramInt;
      byte b2 = b;
      this.ZW[b].setText(paramZsh8.ZMm(a(22391, 26675) + a(22391, 26675) + b2));
      b++;
      if (arrayOfString == null)
        break; 
    } 
    this.ZN.Zm(this.Zk.ZnW());
    ZB();
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ' /á 7¡£CÓb:_WaXýÕ¿\-]O9©mt¸¾fíL<Ì2="±)óº"Àn$-øIî#È¯Á\\t}\Ú'ÁÊfn{§\\tJÿ>:0F"º1*=ñÄG²æd&nnc°â7vù\\fä/e\\rìÍßñ<úâýwîDõ¶ÐÖÁÓLt<µÚ´ô>Åè!ÓmúK@\\fê\\büLDæh3Ü¾é×³GUGÅ:N'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #33
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
    //   67: ldc 'Â³SJoK¹| '
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #45
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
    //   128: putstatic burp/Zbbb.a : [Ljava/lang/String;
    //   131: bipush #14
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbbb.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #10
    //   214: goto -> 243
    //   217: bipush #24
    //   219: goto -> 243
    //   222: bipush #10
    //   224: goto -> 243
    //   227: bipush #67
    //   229: goto -> 243
    //   232: bipush #85
    //   234: goto -> 243
    //   237: iconst_1
    //   238: goto -> 243
    //   241: bipush #23
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5773) & 0xFFFF;
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
      byte b1 = 117;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbbb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */