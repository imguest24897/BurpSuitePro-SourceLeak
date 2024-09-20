package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.List;
import java.util.Objects;

class Zbvc extends Zbqc {
  private final Zm99 Zf;
  
  private final Zx0x Zy;
  
  private final Zgux ZS;
  
  private final Zedy ZF;
  
  private final Zr4a Zr;
  
  private final Zbvr ZL;
  
  private Zbqc Zn;
  
  private Zbcq ZW;
  
  private Zem9 ZT;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbvc(Zgb6 paramZgb6, Zkc0 paramZkc0, Zzjc paramZzjc, Zxf5 paramZxf5, Ztyg paramZtyg, Zgq7 paramZgq7, Zedy paramZedy, Zmo3 paramZmo3, Zr4a paramZr4a, Runnable paramRunnable) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload #7
    //   7: putfield ZF : Lburp/Zedy;
    //   10: aload_0
    //   11: aload #9
    //   13: putfield Zr : Lburp/Zr4a;
    //   16: aload_0
    //   17: invokevirtual ZG : ()V
    //   20: aload_0
    //   21: new burp/Zbvr
    //   24: dup
    //   25: aload_1
    //   26: aload_2
    //   27: aload #8
    //   29: invokeinterface Zs : ()Ljava/lang/String;
    //   34: aload #10
    //   36: invokespecial <init> : (Lburp/Zgb6;Lburp/Zkc0;Ljava/lang/String;Ljava/lang/Runnable;)V
    //   39: putfield ZL : Lburp/Zbvr;
    //   42: aload_0
    //   43: new burp/Zgux
    //   46: dup
    //   47: aload_0
    //   48: invokespecial <init> : (Lburp/Zbvc;)V
    //   51: putfield ZS : Lburp/Zgux;
    //   54: aload_0
    //   55: new burp/Zm99
    //   58: dup
    //   59: sipush #23344
    //   62: sipush #23861
    //   65: invokestatic a : (II)Ljava/lang/String;
    //   68: invokespecial <init> : (Ljava/lang/String;)V
    //   71: putfield Zf : Lburp/Zm99;
    //   74: aload_0
    //   75: getfield Zf : Lburp/Zm99;
    //   78: sipush #23348
    //   81: sipush #16366
    //   84: invokestatic a : (II)Ljava/lang/String;
    //   87: invokevirtual setName : (Ljava/lang/String;)V
    //   90: aload_0
    //   91: getfield Zf : Lburp/Zm99;
    //   94: bipush #10
    //   96: invokevirtual setHorizontalTextPosition : (I)V
    //   99: aload_0
    //   100: getfield Zf : Lburp/Zm99;
    //   103: bipush #10
    //   105: invokevirtual setIconTextGap : (I)V
    //   108: aload_0
    //   109: getfield Zf : Lburp/Zm99;
    //   112: aload_0
    //   113: getfield ZS : Lburp/Zgux;
    //   116: invokevirtual setIcon : (Ljavax/swing/Icon;)V
    //   119: aload_0
    //   120: new burp/Zx0x
    //   123: dup
    //   124: invokespecial <init> : ()V
    //   127: putfield Zy : Lburp/Zx0x;
    //   130: aload_0
    //   131: getfield Zy : Lburp/Zx0x;
    //   134: sipush #23346
    //   137: sipush #-401
    //   140: invokestatic a : (II)Ljava/lang/String;
    //   143: invokevirtual setName : (Ljava/lang/String;)V
    //   146: aload_0
    //   147: getfield Zy : Lburp/Zx0x;
    //   150: getstatic burp/Zlkk.PANEL_BACKGROUND : Lburp/Zlkk;
    //   153: invokevirtual Zx : (Lburp/Zlkk;)V
    //   156: aload_0
    //   157: getfield Zy : Lburp/Zx0x;
    //   160: iconst_0
    //   161: invokevirtual setEditable : (Z)V
    //   164: invokestatic Zm : ()Ljava/lang/String;
    //   167: new burp/Zbu3
    //   170: dup
    //   171: aload_0
    //   172: invokespecial <init> : (Lburp/Zbvc;)V
    //   175: astore #12
    //   177: aload #12
    //   179: invokestatic createEmptyBorder : ()Ljavax/swing/border/Border;
    //   182: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   185: aload #12
    //   187: aload_0
    //   188: getfield Zy : Lburp/Zx0x;
    //   191: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   194: aload_0
    //   195: getfield ZW : Lburp/Zbcq;
    //   198: iconst_0
    //   199: invokevirtual setVisible : (Z)V
    //   202: astore #11
    //   204: aload_0
    //   205: getfield ZW : Lburp/Zbcq;
    //   208: iconst_1
    //   209: invokevirtual Zt : (Z)V
    //   212: aload_0
    //   213: getfield ZW : Lburp/Zbcq;
    //   216: aload_0
    //   217: getfield Zf : Lburp/Zm99;
    //   220: invokevirtual ZL : (Ljava/awt/Component;)V
    //   223: aload_0
    //   224: getfield ZW : Lburp/Zbcq;
    //   227: aload #12
    //   229: invokevirtual Zt : (Ljava/awt/Component;)V
    //   232: aload_0
    //   233: aload_3
    //   234: aload #4
    //   236: aload #5
    //   238: aload #6
    //   240: <illegal opcode> run : (Lburp/Zbvc;Lburp/Zzjc;Lburp/Zxf5;Lburp/Ztyg;Lburp/Zgq7;)Ljava/lang/Runnable;
    //   245: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   248: aload_0
    //   249: aload #8
    //   251: invokevirtual ZK : (Lburp/Zmo3;)V
    //   254: aload #11
    //   256: ifnonnull -> 266
    //   259: iconst_5
    //   260: anewarray burp/Zbqc
    //   263: invokestatic Zr : ([Lburp/Zbqc;)V
    //   266: return
  }
  
  private Zbgo ZN(Zzjc paramZzjc, Zxf5 paramZxf5, Ztyg paramZtyg, Zgq7 paramZgq7) {
    Zbcr zbcr = Zbcr.Zw(a(23345, 23850), Zgzq.BCHECK_TEST_CASES_EMPTY_PANEL_ICON).Zu(Zlar.BCHECK_TEST_CASES_LEARN_MORE_INFO).Zy(28).Zc();
    Zbvk zbvk = new Zbvk(paramZzjc, paramZtyg, paramZgq7, this.ZF, this.Zr);
    boolean bool = (paramZzjc.Zu() > 0) ? true : false;
    Zlgp zlgp = new Zlgp(zbcr, zbvk, this.Zr, bool);
    Objects.requireNonNull(paramZxf5);
    Zbgo zbgo = new Zbgo(this.ZL, List.of(zlgp), Zrpp.RIGHT, false, paramZxf5.Zc() ? Zs_i.BCHECK_TEST_CASES : null, paramZxf5::Zv);
    if (bool)
      zbgo.Zw(true); 
    this.Zr.Zh(new Zzc6(this, zbgo));
    return zbgo;
  }
  
  public void ZA(Zmo3 paramZmo3) {
    this.ZL.Zf(paramZmo3.Zs());
    ZK(paramZmo3);
  }
  
  public String ZK() {
    return this.ZL.ZB();
  }
  
  public void ZK(Zmo3 paramZmo3) {
    this.ZS.Zi(paramZmo3.Zt().size());
    this.ZW.setVisible(true);
    String str1 = Zed0.Zm();
    if (paramZmo3.Zb()) {
      this.Zy.setText("");
      this.ZW.Zt(true);
      if (str1 == null) {
        String str = Zsix.Za(List.of(paramZmo3));
        this.Zy.setText(str);
        this.ZW.Zt(false);
        return;
      } 
      return;
    } 
    String str2 = Zsix.Za(List.of(paramZmo3));
    this.Zy.setText(str2);
    this.ZW.Zt(false);
  }
  
  private void ZG() {
    this.Zn = new Zbqc();
    this.ZT = new Zem9();
    this.ZW = new Zbcq();
    setName(a(23347, -15211));
    setLayout(new GridBagLayout());
    this.Zn.setLayout(new BorderLayout());
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zn, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZT, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZW, gridBagConstraints);
  }
  
  private void lambda$new$0(Zzjc paramZzjc, Zxf5 paramZxf5, Ztyg paramZtyg, Zgq7 paramZgq7) {
    this.Zn.add(ZN(paramZzjc, paramZxf5, paramZtyg, paramZgq7));
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '×ÄÌ3KïW¯ÓP8:âx\\f8ßw¸ô¬,uNN°\\b3ÚUÛY\\fM½¶L©l¤öÏ7Ûê»·mÎP×Ïx!E¹AÖ4°k«¹°$«,u¢d­Ýí¾û,\\r'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #6
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #44
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc 'sñ¼ýþå&ÔJÄÀH~ØØ¶ x.:^k´w 3'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #17
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #71
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
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
    //   128: putstatic burp/Zbvc.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zbvc.b : [Ljava/lang/String;
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
    //   212: bipush #56
    //   214: goto -> 244
    //   217: bipush #88
    //   219: goto -> 244
    //   222: bipush #55
    //   224: goto -> 244
    //   227: bipush #21
    //   229: goto -> 244
    //   232: bipush #55
    //   234: goto -> 244
    //   237: bipush #81
    //   239: goto -> 244
    //   242: bipush #74
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5B30) & 0xFFFF;
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
      byte b1 = 88;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbvc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */