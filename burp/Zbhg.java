package burp;

import java.awt.BorderLayout;
import net.portswigger.Zoq;

public class Zbhg extends Zbqc {
  private final Zbv6 ZM;
  
  private final Zoq<? extends Zbhh> Zn;
  
  private final Zgu2 ZK;
  
  private final Runnable Zy;
  
  private final Zbc9 ZW;
  
  private final Zbcg ZG;
  
  protected volatile Zri0 ZL;
  
  private volatile boolean Zl;
  
  private Zl0u Zw;
  
  private static boolean Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbhg(Zbv6 paramZbv6, Zoq<? extends Zbhh> paramZoq, Zgu2 paramZgu2, Runnable paramRunnable) {
    super(new BorderLayout());
    this.ZM = paramZbv6;
    this.Zn = paramZoq;
    this.ZK = paramZgu2;
    this.Zy = paramRunnable;
    this.ZL = Zri0.CLOSED;
    boolean bool = Zv();
    Zbcg zbcg = Zltn.ZK(Zgzq.SCANNER_EMPTY_STATE, a(-5891, 30618)).Zi();
    this.ZG = Zltn.ZK(Zgzq.SUITE_EMPTY_PANEL_ICON, a(-5892, -2670)).Za(a(-5889, -21837)).ZY(a(-5894, -17199), this::ZI).ZH(a(-5890, -6058), this::Zd).Zi();
    this.ZW = new Zbc9();
    this.ZW.add(zbcg);
    this.ZW.add(this.ZG);
    this.ZW.ZP(zbcg);
    add(this.ZW, 0);
    if (Zbqc.Zwu() == null)
      ZD(!bool); 
  }
  
  public void Zy() {
    if (this.ZL != Zri0.CLOSED)
      return; 
    Zd();
    Zt(true);
  }
  
  public void Zt(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Zs : ()Z
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZL : Lburp/Zri0;
    //   8: getstatic burp/Zri0.ATTACHED : Lburp/Zri0;
    //   11: if_acmpne -> 46
    //   14: iload_1
    //   15: ifeq -> 34
    //   18: aload_0
    //   19: getfield Zn : Lnet/portswigger/Zoq;
    //   22: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   27: invokevirtual ZV : (Ljava/util/function/Consumer;)V
    //   30: iload_2
    //   31: ifne -> 46
    //   34: aload_0
    //   35: getfield Zn : Lnet/portswigger/Zoq;
    //   38: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   43: invokevirtual ZV : (Ljava/util/function/Consumer;)V
    //   46: aload_0
    //   47: iload_1
    //   48: putfield Zl : Z
    //   51: return
  }
  
  public void Ze() {
    Zbsv.Zb(this::lambda$popoutTab$0);
  }
  
  protected Zl0u Zg(Zbhh paramZbhh, Zgu2 paramZgu2, Runnable paramRunnable) {
    return new Zl0u(this, paramZbhh, paramZgu2, paramRunnable);
  }
  
  public void Zd() {
    Zbsv.Zb(this::lambda$reattachTab$1);
  }
  
  private void ZI() {
    if (this.Zw != null)
      this.Zw.ZN(); 
  }
  
  public void ZU() {
    if (this.Zw != null)
      this.Zw.ZO(); 
  }
  
  public void ZN() {
    if (this.Zw != null)
      this.Zw.Zc(); 
  }
  
  public void ZH() {
    this.Zn.ZV(Zbhh::ZK);
  }
  
  private void lambda$reattachTab$1() {
    if (this.Zw != null) {
      this.Zw.Zi();
      this.Zw = null;
    } 
    Zbhh zbhh = (Zbhh)this.Zn.Zz();
    this.ZW.add(zbhh);
    this.ZW.ZP(zbhh);
    zbhh.Zj();
    if (!this.Zl)
      zbhh.ZC(); 
    this.ZL = Zri0.ATTACHED;
  }
  
  private void lambda$popoutTab$0() {
    // Byte code:
    //   0: invokestatic Zs : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zw : Lburp/Zl0u;
    //   8: ifnonnull -> 90
    //   11: aload_0
    //   12: getfield Zn : Lnet/portswigger/Zoq;
    //   15: invokevirtual Zz : ()Ljava/lang/Object;
    //   18: checkcast burp/Zbhh
    //   21: astore_2
    //   22: aload_2
    //   23: invokevirtual Zr : ()V
    //   26: aload_0
    //   27: getfield ZW : Lburp/Zbc9;
    //   30: aload_0
    //   31: getfield ZG : Lburp/Zbcg;
    //   34: invokevirtual ZP : (Ljava/awt/Component;)V
    //   37: aload_0
    //   38: getfield ZW : Lburp/Zbc9;
    //   41: aload_2
    //   42: invokevirtual remove : (Ljava/awt/Component;)V
    //   45: aload_0
    //   46: aload_0
    //   47: aload_2
    //   48: aload_0
    //   49: getfield ZK : Lburp/Zgu2;
    //   52: aload_0
    //   53: getfield Zy : Ljava/lang/Runnable;
    //   56: invokevirtual Zg : (Lburp/Zbhh;Lburp/Zgu2;Ljava/lang/Runnable;)Lburp/Zl0u;
    //   59: putfield Zw : Lburp/Zl0u;
    //   62: aload_0
    //   63: getfield Zw : Lburp/Zl0u;
    //   66: aload_0
    //   67: invokevirtual getParent : ()Ljava/awt/Container;
    //   70: aload_0
    //   71: getfield ZM : Lburp/Zbv6;
    //   74: invokevirtual ZB : ()Ljava/awt/Component;
    //   77: invokestatic requireNonNullElse : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   80: checkcast java/awt/Component
    //   83: invokevirtual ZH : (Ljava/awt/Component;)V
    //   86: iload_1
    //   87: ifne -> 94
    //   90: aload_0
    //   91: invokevirtual ZI : ()V
    //   94: aload_0
    //   95: getstatic burp/Zri0.DETACHED : Lburp/Zri0;
    //   98: putfield ZL : Lburp/Zri0;
    //   101: return
  }
  
  public static void ZD(boolean paramBoolean) {
    Za = paramBoolean;
  }
  
  public static boolean Zv() {
    return Za;
  }
  
  public static boolean Zs() {
    boolean bool = Zv();
    return !bool;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ' ¿8ûeÇøõ7°Y§¦$PUC0 ~û_W&òMè½D;m%ðó1ýðE=Ðu)ü;!#Â£ª\\r+Ç]Mä'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #13
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: invokestatic ZD : (Z)V
    //   26: bipush #94
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 145
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: ldc 'gýkû)ÄÓ<Ã·SÅ)ù^kgZIÛ'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #11
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #6
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 145
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic burp/Zbhg.a : [Ljava/lang/String;
    //   135: iconst_5
    //   136: anewarray java/lang/String
    //   139: putstatic burp/Zbhg.b : [Ljava/lang/String;
    //   142: goto -> 304
    //   145: dup_x2
    //   146: pop
    //   147: invokevirtual toCharArray : ()[C
    //   150: dup_x1
    //   151: arraylength
    //   152: dup_x2
    //   153: pop
    //   154: iconst_0
    //   155: istore #6
    //   157: dup2_x1
    //   158: pop2
    //   159: dup_x2
    //   160: iconst_1
    //   161: if_icmpgt -> 264
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #68
    //   218: goto -> 248
    //   221: bipush #109
    //   223: goto -> 248
    //   226: bipush #6
    //   228: goto -> 248
    //   231: bipush #10
    //   233: goto -> 248
    //   236: bipush #102
    //   238: goto -> 248
    //   241: bipush #69
    //   243: goto -> 248
    //   246: bipush #65
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 168
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 164
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 43, 0 -> 102
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE8FE) & 0xFFFF;
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
      char c = '¸';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbhg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */