package burp;

import java.awt.Dimension;
import java.awt.Window;
import java.util.Map;

public class Zgtg<T> {
  private static final Map<Zb05<?, ?>, Zrh7> ZF;
  
  private final Ztqd ZR;
  
  private final Zgb6 ZA;
  
  private final Zg9z Z_;
  
  private final Zmjx<T> Zq;
  
  private final Zm6x ZL;
  
  private final Zsol Zw;
  
  private final Zeoj ZE;
  
  private final Zx_w ZG;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zgtg(Zgb6 paramZgb6, Zg9z paramZg9z, Zmjx<T> paramZmjx, Zm6x paramZm6x, Ztqd paramZtqd, Zsol paramZsol, Zeoj paramZeoj, Zx_w paramZx_w) {
    this.ZR = paramZtqd;
    this.ZA = paramZgb6;
    this.Z_ = paramZg9z;
    this.Zq = paramZmjx;
    this.ZL = paramZm6x;
    this.Zw = paramZsol;
    this.ZE = paramZeoj;
    this.ZG = paramZx_w;
  }
  
  public Zrh7 Zw(Window paramWindow, Zg98 paramZg98, Zk97 paramZk97) {
    Zrh7 zrh7 = Zj(paramWindow);
    Zbqr zbqr = new Zbqr(paramZg98, this.ZA, this.Z_, this.ZL);
    Zzyn zzyn = new Zzyn(this.ZG, zbqr);
    Zz7p zz7p = new Zz7p(this, zrh7, zbqr, zzyn, paramZg98);
    return Zm(zrh7, a(-28692, -8737), null, null, zz7p, zbqr, paramZk97);
  }
  
  public Zrh7 ZM(Window paramWindow, Zg98 paramZg98, Zb05<?, ?> paramZb05, int paramInt, Zk97 paramZk97) {
    // Byte code:
    //   0: getstatic burp/Zgtg.ZF : Ljava/util/Map;
    //   3: aload_3
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> apply : (Lburp/Zgtg;Ljava/awt/Window;)Ljava/util/function/Function;
    //   11: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   16: checkcast burp/Zrh7
    //   19: astore #6
    //   21: aload #6
    //   23: invokevirtual isDisplayable : ()Z
    //   26: ifeq -> 44
    //   29: aload #6
    //   31: aload_1
    //   32: invokevirtual Zq : (Ljava/awt/Window;)V
    //   35: aload #6
    //   37: iconst_1
    //   38: invokevirtual setVisible : (Z)V
    //   41: aload #6
    //   43: areturn
    //   44: new burp/Zbqr
    //   47: dup
    //   48: aload_2
    //   49: aload_0
    //   50: getfield ZA : Lburp/Zgb6;
    //   53: aload_0
    //   54: getfield Z_ : Lburp/Zg9z;
    //   57: aload_0
    //   58: getfield ZL : Lburp/Zm6x;
    //   61: aload_3
    //   62: invokevirtual ZO : ()Lburp/Zl6k;
    //   65: aload_3
    //   66: invokevirtual Zh : ()Lburp/Zsuf;
    //   69: invokespecial <init> : (Lburp/Zg98;Lburp/Zgb6;Lburp/Zg9z;Lburp/Zm6x;Lburp/Zl6k;Lburp/Zsuf;)V
    //   72: astore #7
    //   74: aload #7
    //   76: dup
    //   77: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   80: pop
    //   81: <illegal opcode> Zn : (Lburp/Zbqr;)Lburp/Zzkg;
    //   86: astore #8
    //   88: aload_3
    //   89: invokevirtual Zy : ()Lburp/Zx6v;
    //   92: astore #9
    //   94: aload #6
    //   96: new burp/Zzn8
    //   99: dup
    //   100: aload_0
    //   101: aload #9
    //   103: aload #8
    //   105: invokespecial <init> : (Lburp/Zgtg;Lburp/Zx6v;Lburp/Zzkg;)V
    //   108: invokevirtual addComponentListener : (Ljava/awt/event/ComponentListener;)V
    //   111: aload #6
    //   113: new burp/Zeo8
    //   116: dup
    //   117: aload_0
    //   118: aload_3
    //   119: invokespecial <init> : (Lburp/Zgtg;Lburp/Zb05;)V
    //   122: invokevirtual addWindowListener : (Ljava/awt/event/WindowListener;)V
    //   125: new burp/Zzyn
    //   128: dup
    //   129: aload_0
    //   130: getfield ZG : Lburp/Zx_w;
    //   133: aload #7
    //   135: invokespecial <init> : (Lburp/Zm51;Lburp/Zmid;)V
    //   138: astore #10
    //   140: new burp/Zmx8
    //   143: dup
    //   144: aload_0
    //   145: iload #4
    //   147: aload #6
    //   149: aload #7
    //   151: aload #10
    //   153: aload_2
    //   154: invokespecial <init> : (Lburp/Zgtg;ILburp/Zrh7;Lburp/Zbqr;Lburp/Zzyn;Lburp/Zg98;)V
    //   157: astore #11
    //   159: aload_0
    //   160: aload #6
    //   162: sipush #-28690
    //   165: sipush #22135
    //   168: invokestatic a : (II)Ljava/lang/String;
    //   171: aload_3
    //   172: invokevirtual ZE : ()Ljava/lang/String;
    //   175: aload_0
    //   176: iload #4
    //   178: invokevirtual Zo : (I)Ljava/lang/String;
    //   181: aload #11
    //   183: aload #7
    //   185: aload #5
    //   187: invokevirtual Zm : (Lburp/Zrh7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lburp/Zby;Lburp/Zbqr;Lburp/Zk97;)Lburp/Zrh7;
    //   190: areturn
  }
  
  public static Zrh7 Zf(Zb05<?, ?> paramZb05) {
    return ZF.get(paramZb05);
  }
  
  private Zrh7 Zj(Window paramWindow) {
    Zrh7 zrh7 = new Zrh7(paramWindow, false, Zzv7.CUSTOM_COLUMN_BAMBDA_DIALOG);
    zrh7.setName(a(-28689, 10187));
    return zrh7;
  }
  
  private String Zo(int paramInt) {
    return ((Zmk7)this.Zq.Zf().get(paramInt)).ZS();
  }
  
  private Zrh7 Zm(Zrh7 paramZrh7, String paramString1, String paramString2, String paramString3, Zby paramZby, Zbqr paramZbqr, Zk97 paramZk97) {
    Zbqy zbqy = new Zbqy(paramZbqr, paramZby, paramString2, paramString3, new Zkd4(this.Zq), paramZk97);
    paramZrh7.getContentPane().add(zbqy);
    paramZrh7.setTitle(paramString1);
    paramZrh7.setSize(new Dimension(1000, 500));
    paramZrh7.setVisible(true);
    zbqy.Zh();
    return paramZrh7;
  }
  
  private Zrh7 lambda$buildEditColumnDialog$0(Window paramWindow, Zb05 paramZb05) {
    return Zj(paramWindow);
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '"MVàº\\b&«q ûµz¬/D\\n]»µèX·2QÅq9DôUé÷Ô¤Ý¤i1/v\\bÜÌGÅ83pÑÈy8Q$'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #18
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #110
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic burp/Zgtg.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zgtg.b : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #81
    //   154: goto -> 184
    //   157: bipush #112
    //   159: goto -> 184
    //   162: bipush #31
    //   164: goto -> 184
    //   167: bipush #120
    //   169: goto -> 184
    //   172: bipush #84
    //   174: goto -> 184
    //   177: bipush #33
    //   179: goto -> 184
    //   182: bipush #9
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: new java/util/concurrent/ConcurrentHashMap
    //   230: dup
    //   231: invokespecial <init> : ()V
    //   234: putstatic burp/Zgtg.ZF : Ljava/util/Map;
    //   237: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8FEE) & 0xFFFF;
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
      char c = 'è';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgtg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */