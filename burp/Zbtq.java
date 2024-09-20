package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.border.EmptyBorder;

class Zbtq extends Zbg2 {
  private Zzlr ZC;
  
  private int ZI;
  
  private Zmg2[] Z_ = new Zmg2[3];
  
  private ButtonGroup Zq = new ButtonGroup();
  
  private Zm2o Zf;
  
  private Zl8w Zb;
  
  private Zbkc ZM;
  
  private Zbqc Zz;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbtq(Zzlr paramZzlr, int paramInt) {
    this.ZC = paramZzlr;
    this.ZI = paramInt;
    Za();
    this.ZM.Zx(a(-11129, -28281) + a(-11129, -28281));
    if (paramInt == 0)
      Zn(Zxl3.SUITE_MAP.ordinal(), a(-11127, -12608), true, true); 
    Zn(Zxl3.PROJECT_FILE.ordinal(), a(-11123, 21292), true, (paramInt == 1));
    if (paramInt == 1)
      Zn(Zxl3.REREQUEST.ordinal(), a(-11124, -5797), true, false); 
    this.ZB = new String[] { (paramInt == 0) ? a(-11121, 26158) : a(-11122, -26558), a(-11128, -7553) };
    this.ZA = new boolean[] { true, true };
    this.Zh = 1;
  }
  
  private void Zn(int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    this.Z_[paramInt] = new Zmg2(paramString);
    this.Z_[paramInt].setBorder(new EmptyBorder(5, 5, 5, 5));
    this.Z_[paramInt].setEnabled(paramBoolean1);
    this.Z_[paramInt].setSelected(paramBoolean2);
    this.Zq.add(this.Z_[paramInt]);
    this.Zz.add(this.Z_[paramInt]);
  }
  
  private void Za() {
    this.Zz = new Zbqc();
    this.ZM = new Zbkc();
    this.Zf = new Zm2o();
    this.Zb = new Zl8w();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zz.setLayout(new BoxLayout(this.Zz, 1));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zz, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    add(this.ZM, gridBagConstraints);
    this.Zf.Zi(Zk97.DESKTOP_TOOLS_TARGET_SITE_MAP_COMPARING_SITE_MAP_SOURCES);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.Zf, gridBagConstraints);
    this.Zb.setText(a(-11126, -8341));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zb, gridBagConstraints);
  }
  
  public Zsic Zn(int paramInt) {
    // Byte code:
    //   0: invokestatic Zp : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: iload_1
    //   5: lookupswitch default -> 216, 0 -> 32, 1 -> 80
    //   32: aload_0
    //   33: getfield ZI : I
    //   36: ifne -> 69
    //   39: aload_0
    //   40: getfield ZC : Lburp/Zzlr;
    //   43: invokevirtual ZG : ()Lburp/Zl04;
    //   46: sipush #-11125
    //   49: sipush #1029
    //   52: invokestatic a : (II)Ljava/lang/String;
    //   55: invokestatic ZY : (Ljava/awt/Component;Ljava/lang/Object;)Z
    //   58: ifeq -> 65
    //   61: aconst_null
    //   62: goto -> 226
    //   65: aload_0
    //   66: goto -> 226
    //   69: aload_0
    //   70: getfield ZC : Lburp/Zzlr;
    //   73: aload_0
    //   74: invokevirtual Zw : (Lburp/Zsic;)Lburp/Zsic;
    //   77: goto -> 226
    //   80: getstatic burp/Zxl3.SUITE_MAP : Lburp/Zxl3;
    //   83: astore_3
    //   84: invokestatic values : ()[Lburp/Zxl3;
    //   87: astore #4
    //   89: aload #4
    //   91: arraylength
    //   92: istore #5
    //   94: iconst_0
    //   95: istore #6
    //   97: iload #6
    //   99: iload #5
    //   101: if_icmpge -> 155
    //   104: aload #4
    //   106: iload #6
    //   108: aaload
    //   109: astore #7
    //   111: aload #7
    //   113: invokevirtual ordinal : ()I
    //   116: istore #8
    //   118: aload_0
    //   119: getfield Z_ : [Lburp/Zmg2;
    //   122: iload #8
    //   124: aaload
    //   125: ifnull -> 148
    //   128: aload_0
    //   129: getfield Z_ : [Lburp/Zmg2;
    //   132: iload #8
    //   134: aaload
    //   135: invokevirtual isSelected : ()Z
    //   138: ifeq -> 148
    //   141: aload #7
    //   143: astore_3
    //   144: aload_2
    //   145: ifnull -> 155
    //   148: iinc #6, 1
    //   151: aload_2
    //   152: ifnull -> 97
    //   155: aload_0
    //   156: getfield ZC : Lburp/Zzlr;
    //   159: aload_0
    //   160: getfield ZI : I
    //   163: invokevirtual Zh : (I)Lburp/Zl6;
    //   166: astore #4
    //   168: aload #4
    //   170: aload_3
    //   171: putfield ZI : Lburp/Zxl3;
    //   174: aload_3
    //   175: getstatic burp/Zxl3.SUITE_MAP : Lburp/Zxl3;
    //   178: if_acmpne -> 205
    //   181: aload #4
    //   183: aload_0
    //   184: getfield ZC : Lburp/Zzlr;
    //   187: invokevirtual ZB : ()Lburp/Ztdi;
    //   190: putfield Zz : Lburp/Ztdi;
    //   193: aload #4
    //   195: aload_0
    //   196: getfield ZC : Lburp/Zzlr;
    //   199: invokevirtual Zx : ()Lburp/Zmrj;
    //   202: putfield ZA : Lburp/Zmrj;
    //   205: aload_0
    //   206: getfield ZC : Lburp/Zzlr;
    //   209: aload_0
    //   210: invokevirtual ZV : (Lburp/Zsic;)Lburp/Zsic;
    //   213: goto -> 226
    //   216: iconst_0
    //   217: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   220: iload_1
    //   221: i2l
    //   222: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   225: aload_0
    //   226: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÿç"\­ç"0Mÿ·Õöx-ðßW.°ÞºÐ¾T?\\tjàøÂ2úXkOOì¥§ìxèíèÌüè&yÿb9ÓÛKV¯O¡£$\\n#r&"ÆÎ«7y)ØïJáÅî×¯mS+ÏäÈC{ìCJ¸Ö±n±%yîn¥rà++Çÿè!ÊPä¨z¸¦Ç2Ó¶54`©$Î`_äªøÊfa0 ¨ï¸Ø3§\\bw²K'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #20
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc '¦ª;\\t×à@o`nô''
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #114
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
    //   128: putstatic burp/Zbtq.a : [Ljava/lang/String;
    //   131: bipush #9
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbtq.b : [Ljava/lang/String;
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
    //   212: bipush #119
    //   214: goto -> 244
    //   217: bipush #112
    //   219: goto -> 244
    //   222: bipush #37
    //   224: goto -> 244
    //   227: bipush #96
    //   229: goto -> 244
    //   232: bipush #42
    //   234: goto -> 244
    //   237: bipush #55
    //   239: goto -> 244
    //   242: bipush #34
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
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD48F) & 0xFFFF;
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
      byte b1 = 80;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbtq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */