package burp;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztik implements Zl5s, Zm3g {
  private Zxzh ZP;
  
  private final Component Zm;
  
  private final Zbnt Ze;
  
  private final Zr_4 Zi;
  
  private Zl5s Zn;
  
  private final Ze5r<Zlil, Zmk5> Zx;
  
  private int ZC;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ztik(Zgb6 paramZgb6, Component paramComponent, Zbnt paramZbnt, Zr_4 paramZr_4, Zefg<Zmk5> paramZefg) {
    this.Zm = paramComponent;
    this.Ze = paramZbnt;
    this.Zi = paramZr_4;
    paramZgb6.Zd(this);
    ArrayList<Zlil> arrayList = new ArrayList();
    String[] arrayOfString = Zlil.Za();
    for (Zmk5 zmk5 : paramZefg) {
      try {
        arrayList.add(new Zlil(zmk5, paramZbnt, paramZr_4));
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.UNEXPECTED);
      } 
      if (arrayOfString == null)
        break; 
    } 
    this.Zx = new Ze5r<>(arrayList, paramZefg);
  }
  
  public void Zt(Zxzh paramZxzh) {
    this.ZP = paramZxzh;
  }
  
  public void Zv(Zl5s paramZl5s) {
    this.Zn = paramZl5s;
  }
  
  public Ze5r<Zlil, Zmk5> ZK() {
    return this.Zx;
  }
  
  public Zlil ZC(long paramLong) {
    Zlil zlil = this.Zx.Zc(paramLong::lambda$getMacro$0);
    Zuh.Zv((zlil != null), Zqf.Zx, paramLong);
    return zlil;
  }
  
  public void ZX(Zlil paramZlil) {
    this.Zn.ZX(paramZlil);
  }
  
  public void Zu(Zlil paramZlil) {
    this.Zn.Zu(paramZlil);
  }
  
  public boolean Zj(Zlil paramZlil) {
    return this.ZP.Zt(paramZlil);
  }
  
  public int ZD() {
    return ++this.ZC;
  }
  
  public void Zd(Zmf_ paramZmf_) {
    // Byte code:
    //   0: aload_1
    //   1: sipush #4187
    //   4: sipush #24053
    //   7: invokestatic a : (II)Ljava/lang/String;
    //   10: invokeinterface Zh : (Ljava/lang/String;)Z
    //   15: istore_3
    //   16: invokestatic Za : ()[Ljava/lang/String;
    //   19: aload_1
    //   20: sipush #4184
    //   23: sipush #4186
    //   26: invokestatic a : (II)Ljava/lang/String;
    //   29: new burp/Zgf9
    //   32: dup
    //   33: aload_0
    //   34: invokespecial <init> : (Lburp/Ztik;)V
    //   37: invokeinterface Zs : (Ljava/lang/String;Lburp/Zsh4;)Ljava/util/List;
    //   42: astore #4
    //   44: astore_2
    //   45: aload #4
    //   47: ifnull -> 206
    //   50: iload_3
    //   51: ifeq -> 67
    //   54: aload_0
    //   55: getfield Zx : Lburp/Ze5r;
    //   58: aload #4
    //   60: invokevirtual Zd : (Ljava/util/List;)V
    //   63: aload_2
    //   64: ifnonnull -> 206
    //   67: iconst_0
    //   68: istore #5
    //   70: aload_0
    //   71: getfield Zx : Lburp/Ze5r;
    //   74: invokevirtual ZB : ()Ljava/lang/Object;
    //   77: dup
    //   78: astore #6
    //   80: monitorenter
    //   81: aload_0
    //   82: getfield Zx : Lburp/Ze5r;
    //   85: invokevirtual iterator : ()Ljava/util/Iterator;
    //   88: astore #7
    //   90: aload #7
    //   92: invokeinterface hasNext : ()Z
    //   97: ifeq -> 150
    //   100: aload #7
    //   102: invokeinterface next : ()Ljava/lang/Object;
    //   107: checkcast burp/Zlil
    //   110: astore #8
    //   112: aload_0
    //   113: aload #8
    //   115: invokevirtual Zj : (Lburp/Zlil;)Z
    //   118: ifeq -> 139
    //   121: aload_0
    //   122: aload #8
    //   124: aload #4
    //   126: invokevirtual ZI : (Lburp/Zlil;Ljava/util/List;)Z
    //   129: ifne -> 139
    //   132: iconst_1
    //   133: istore #5
    //   135: aload_2
    //   136: ifnonnull -> 146
    //   139: aload #7
    //   141: invokeinterface remove : ()V
    //   146: aload_2
    //   147: ifnonnull -> 90
    //   150: aload #6
    //   152: monitorexit
    //   153: goto -> 164
    //   156: astore #9
    //   158: aload #6
    //   160: monitorexit
    //   161: aload #9
    //   163: athrow
    //   164: iload #5
    //   166: ifeq -> 197
    //   169: aload_0
    //   170: getfield Zm : Ljava/awt/Component;
    //   173: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   176: sipush #4185
    //   179: sipush #-7134
    //   182: invokestatic a : (II)Ljava/lang/String;
    //   185: sipush #4186
    //   188: sipush #-11041
    //   191: invokestatic a : (II)Ljava/lang/String;
    //   194: invokestatic Zv : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;)V
    //   197: aload_0
    //   198: getfield Zx : Lburp/Ze5r;
    //   201: aload #4
    //   203: invokevirtual ZL : (Ljava/util/List;)V
    //   206: return
    // Exception table:
    //   from	to	target	type
    //   81	153	156	finally
    //   156	161	156	finally
  }
  
  private boolean ZI(Zlil paramZlil, List<Zlil> paramList) {
    String[] arrayOfString = Zlil.Za();
    for (Zlil zlil : paramList) {
      if (zlil.ZQ() == paramZlil.ZQ())
        return true; 
      if (arrayOfString == null)
        break; 
    } 
    return false;
  }
  
  public void Zl(Zg4j paramZg4j) {
    Zzqw zzqw = paramZg4j.ZP(a(4188, -9256));
    Iterator<Zlil> iterator = this.Zx.iterator();
    String[] arrayOfString = Zlil.Za();
    while (iterator.hasNext()) {
      Zlil zlil = iterator.next();
      zzqw.Zx(zlil.ZD());
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private static boolean lambda$getMacro$0(long paramLong, Zlil paramZlil) {
    return (paramZlil.ZQ() == paramLong);
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '!£÷4¬Òºã\\rÉ\\r¡IÈ\\bÓzg#¨é¯Ë9tµ= ÇNi>É¢ªäe=aoMwKëë!Æsu@÷,ÄÜèòJ¨újÊå¦SK>Y;\\nyOO4*Ë9ÚeÇü^_çMå·|¡A«\\t^&òîÖ¼'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #38
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #52
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
    //   67: ldc '©\\r\\f³-;.ÊÄºO&c\\fÌ¤hºÃ]QU3ÙÒÕAmÃ6øÝ[7aäÖ&ÃÕ,¥ù"}×ïP£é£ïkÐ2z6#ÈÖ÷\\b\\rÅ)\\n­l~'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #53
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #68
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
    //   128: putstatic burp/Ztik.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Ztik.b : [Ljava/lang/String;
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
    //   212: bipush #89
    //   214: goto -> 244
    //   217: bipush #23
    //   219: goto -> 244
    //   222: bipush #91
    //   224: goto -> 244
    //   227: bipush #70
    //   229: goto -> 244
    //   232: bipush #95
    //   234: goto -> 244
    //   237: bipush #60
    //   239: goto -> 244
    //   242: bipush #12
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
    int i = (paramInt1 ^ 0x1058) & 0xFFFF;
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
      char c = 'Ú';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztik.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */