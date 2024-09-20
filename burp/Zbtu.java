package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbtu extends Zbg2 {
  private final Ztq5 Zt;
  
  private final boolean Zx;
  
  private final Zkdg ZX;
  
  private Zm99 Zj;
  
  private Zzdy Z_;
  
  private Zzdy Zy;
  
  private Zl8w Zm;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbtu(Ztq5 paramZtq5, Zeyi paramZeyi, String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield Zt : Lburp/Ztq5;
    //   9: aload_0
    //   10: iload #4
    //   12: putfield Zx : Z
    //   15: invokestatic Zz : ()[Lburp/Zbqc;
    //   18: aload_0
    //   19: new burp/Zkdg
    //   22: dup
    //   23: aload_1
    //   24: invokevirtual ZC : ()Lnet/portswigger/Zs1;
    //   27: aload_1
    //   28: invokevirtual Zs : ()Ljava/lang/String;
    //   31: aload_1
    //   32: invokevirtual ZE : ()Lburp/Zxei;
    //   35: invokespecial <init> : (Lnet/portswigger/Zs1;Ljava/lang/String;Lburp/Zxei;)V
    //   38: putfield ZX : Lburp/Zkdg;
    //   41: astore #5
    //   43: aload_0
    //   44: invokevirtual ZU : ()V
    //   47: aload_0
    //   48: getfield Zm : Lburp/Zl8w;
    //   51: aload_3
    //   52: invokevirtual setText : (Ljava/lang/String;)V
    //   55: iload #4
    //   57: ifeq -> 93
    //   60: aload_0
    //   61: getfield ZX : Lburp/Zkdg;
    //   64: getstatic net/portswigger/Zvh.ZU : Lnet/portswigger/Zvh;
    //   67: invokevirtual ZV : (Lnet/portswigger/Zvh;)Z
    //   70: ifne -> 109
    //   73: aload_0
    //   74: aload_0
    //   75: getfield Z_ : Lburp/Zzdy;
    //   78: invokevirtual remove : (Ljava/awt/Component;)V
    //   81: aload #5
    //   83: ifnull -> 109
    //   86: iconst_3
    //   87: anewarray burp/Zbqc
    //   90: invokestatic Zr : ([Lburp/Zbqc;)V
    //   93: aload_0
    //   94: aload_0
    //   95: getfield Zy : Lburp/Zzdy;
    //   98: invokevirtual remove : (Ljava/awt/Component;)V
    //   101: aload_0
    //   102: aload_0
    //   103: getfield Z_ : Lburp/Zzdy;
    //   106: invokevirtual remove : (Ljava/awt/Component;)V
    //   109: aload_2
    //   110: getfield ZY : Lburp/Zzty;
    //   113: getstatic burp/Zzty.GET_AVAILABLE_INSTALLERS : Lburp/Zzty;
    //   116: if_acmpne -> 127
    //   119: aload_0
    //   120: getfield Zy : Lburp/Zzdy;
    //   123: iconst_0
    //   124: invokevirtual setSelected : (Z)V
    //   127: aload_0
    //   128: iconst_1
    //   129: anewarray java/lang/String
    //   132: dup
    //   133: iconst_0
    //   134: sipush #-19228
    //   137: sipush #14075
    //   140: invokestatic a : (II)Ljava/lang/String;
    //   143: aastore
    //   144: putfield ZB : [Ljava/lang/String;
    //   147: aload_0
    //   148: iconst_1
    //   149: newarray boolean
    //   151: dup
    //   152: iconst_0
    //   153: iconst_1
    //   154: bastore
    //   155: putfield ZA : [Z
    //   158: aload_0
    //   159: iconst_0
    //   160: putfield Zh : I
    //   163: return
  }
  
  public Zsic Zn(int paramInt) {
    boolean bool;
    switch (paramInt) {
      case 0:
        bool = false;
        if (this.Zx && this.Z_.isSelected() && Zx6o.ZY(this, a(-19225, 16151)))
          bool = this.ZX.Zr(); 
        if (this.Zx && this.Zy.isSelected())
          Zke4.Zt(Zt2m.ZF(this), this.Zt.ZG().Zd(), true); 
        if (bool)
          this.Zt.ZE().ZH(Zmg9.PROJECT_WIZARD_EXITED); 
        return null;
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return this;
  }
  
  private void ZU() {
    this.Zm = new Zl8w();
    this.Zy = new Zzdy();
    this.Z_ = new Zzdy();
    this.Zj = new Zm99();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zm, gridBagConstraints);
    this.Zy.setSelected(true);
    this.Zy.setText(a(-19227, 27072));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zy, gridBagConstraints);
    this.Z_.setText(a(-19226, -24095));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 23;
    add(this.Z_, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zj, gridBagConstraints);
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '+Ì?Ó<ª«6]t}åÂËÝï=í­ù'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_5
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #31
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 140
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: ldc 'òK:pÔçP«3û>b¥m_/22Ö·Î*7"û¤a[ÇÍ½G`y(;Ý*®¤íkëi\§/Ù4B\\n+ü8ÁUÁ{tsÍ6 º~Öc×r¾w1¸.¬@\\tàV9\\n0Ü'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: bipush #41
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #83
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 140
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zbtu.a : [Ljava/lang/String;
    //   130: iconst_4
    //   131: anewarray java/lang/String
    //   134: putstatic burp/Zbtu.b : [Ljava/lang/String;
    //   137: goto -> 296
    //   140: dup_x2
    //   141: pop
    //   142: invokevirtual toCharArray : ()[C
    //   145: dup_x1
    //   146: arraylength
    //   147: dup_x2
    //   148: pop
    //   149: iconst_0
    //   150: istore #6
    //   152: dup2_x1
    //   153: pop2
    //   154: dup_x2
    //   155: iconst_1
    //   156: if_icmpgt -> 256
    //   159: dup2
    //   160: swap
    //   161: iload #6
    //   163: dup2_x1
    //   164: caload
    //   165: swap
    //   166: iload #6
    //   168: bipush #7
    //   170: irem
    //   171: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #80
    //   210: goto -> 240
    //   213: bipush #18
    //   215: goto -> 240
    //   218: bipush #27
    //   220: goto -> 240
    //   223: bipush #115
    //   225: goto -> 240
    //   228: bipush #50
    //   230: goto -> 240
    //   233: bipush #81
    //   235: goto -> 240
    //   238: bipush #73
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 163
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 159
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 38, 0 -> 97
    //   296: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB4E4) & 0xFFFF;
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
      byte b1 = 45;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbtu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */