package burp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.swing.SwingUtilities;
import net.portswigger.Zlz;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zzk7 {
  public static final Pattern Zd;
  
  private final Ztue ZB;
  
  private final List<Zbf8> Zw;
  
  private final Zzkr ZG;
  
  private Integer ZW;
  
  private boolean ZA;
  
  private String ZM;
  
  private boolean ZO;
  
  private int ZH;
  
  private boolean ZE;
  
  private int ZU;
  
  private boolean ZJ;
  
  private boolean Zg;
  
  private int Zk;
  
  private boolean Zu;
  
  private boolean Zr;
  
  private boolean Zj;
  
  private boolean Za;
  
  private String ZX;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zzk7(Ztue paramZtue, Zzkr paramZzkr) {
    Zuh.Zb((paramZzkr.Zc() > 0), Zqf.Zr);
    this.ZG = paramZzkr;
    this.ZB = paramZtue;
    this.Zw = (List<Zbf8>)paramZzkr.Zk().stream().map(Zbf8::new).collect(Collectors.toList());
    ZT(0);
  }
  
  public void ZP() {
    this.ZA = true;
    this.ZB.Zt();
  }
  
  public void ZJ(String paramString) {
    Optional optional = this.Zw.stream().filter(paramString::lambda$selectPool$0).findFirst();
    optional.ifPresent(this::lambda$selectPool$1);
  }
  
  public void ZT(int paramInt) {
    int i = Zw(paramInt);
    if (i < 0 || i >= this.Zw.size()) {
      Zuh.Zb(false, Zqf.Zr);
      return;
    } 
    ZP();
    if (this.ZW == null || this.ZW.intValue() != i) {
      Zbf8 zbf8 = this.Zw.get(i);
      zbf8.Zh(true);
      if (this.ZW != null && this.ZW.intValue() < this.Zw.size()) {
        Zbf8 zbf81 = this.Zw.get(this.ZW.intValue());
        zbf81.Zh(false);
      } 
      this.ZW = Integer.valueOf(i);
      this.ZB.ZM(this.Zw);
    } 
  }
  
  private int Zw(int paramInt) {
    int i = Zbiv.Zd();
    byte b = 0;
    while (b < this.Zw.size()) {
      if (((Zbf8)this.Zw.get(b)).Zn.Z_() == paramInt)
        return b; 
      b++;
      if (i != 0)
        break; 
    } 
    return -1;
  }
  
  public void ZQ() {
    this.ZA = false;
    this.ZB.ZO();
  }
  
  public void ZU(String paramString) {
    this.ZM = paramString;
  }
  
  public void ZG(boolean paramBoolean) {
    this.ZO = paramBoolean;
  }
  
  public void Zm(int paramInt) {
    this.ZH = paramInt;
  }
  
  public void ZI(boolean paramBoolean) {
    this.Zu = paramBoolean;
  }
  
  public void ZD(boolean paramBoolean) {
    this.Zr = paramBoolean;
  }
  
  public void Zg(boolean paramBoolean) {
    this.Zj = paramBoolean;
  }
  
  public void Zr(boolean paramBoolean) {
    this.Za = paramBoolean;
  }
  
  public void Zm(String paramString) {
    this.ZX = paramString;
  }
  
  public void Zf(boolean paramBoolean) {
    int i = Zbiv.ZV();
    this.ZE = paramBoolean;
    if (paramBoolean) {
      this.ZB.ZY();
      if (i == 0) {
        this.ZB.Zv();
        return;
      } 
      return;
    } 
    this.ZB.Zv();
  }
  
  public void Zz(int paramInt) {
    this.ZU = paramInt;
  }
  
  public void Zn() {
    this.ZJ = false;
    this.Zg = false;
  }
  
  public void ZA() {
    this.ZJ = true;
    this.Zg = false;
  }
  
  public void Zs() {
    this.ZJ = false;
    this.Zg = true;
  }
  
  public void ZH(int paramInt) {
    this.Zk = paramInt;
  }
  
  public String ZN() {
    if (this.ZA)
      return ""; 
    this.ZB.ZM();
    if (ZC(this.ZM))
      return Zkyg.NAME_ALREADY_USED.Zz(); 
    if (this.Zu && this.Za && !ZO())
      return Zkyg.AUTO_BACKOFF_INVALID_CUSTOM_STATUS_CODES.Zz(); 
    Zlk6 zlk6 = (new Zlk6()).Zs(this.ZM).Zq(this.ZO).ZA(this.ZH).Zw(this.Zu).ZA(this.Zr).Zt(this.Zj).Zs(this.Za).ZI(this.ZE).Zj(this.ZU).ZU(this.ZJ).ZM(this.Zg).Zr(this.Zk);
    return zlk6.ZP().ZK();
  }
  
  public Zb2y Zl() {
    if (this.ZA) {
      Zr5_ zr5_ = ((Zbf8)this.Zw.get(this.ZW.intValue())).Zn;
      return Zb2y.Zs(zr5_.Z_());
    } 
    return Zb2y.ZP(this.ZM, this.ZO, this.ZH, this.ZE, this.ZU, this.ZJ, this.Zg, this.Zk, this.Zu, this.Zr, this.Zj, this.Za, Zg());
  }
  
  public void Za() {
    this.ZA = true;
    Iterator<Zbf8> iterator = this.Zw.iterator();
    int i = Zbiv.ZV();
    while (iterator.hasNext()) {
      Zbf8 zbf8 = iterator.next();
      zbf8.Zh(zbf8.Zn.ZJ());
      if (i == 0)
        break; 
    } 
    this.ZB.Zt();
    this.ZB.ZM(this.Zw);
  }
  
  private boolean ZC(String paramString) {
    int i = Zbiv.Zd();
    for (Zbf8 zbf8 : this.Zw) {
      if (Objects.equals(zbf8.Zn.Zu(), paramString))
        return true; 
      if (i != 0)
        break; 
    } 
    return false;
  }
  
  public void Zv() {
    List<Zr5_> list = this.ZG.Zk();
    Set set = (Set)list.stream().map(Zr5_::Z_).collect(Collectors.toSet());
    int i = ((Integer)this.Zw.stream().filter(Zbf8::Zb).map(Zzk7::lambda$refreshResourcePools$2).findFirst().orElse(Integer.valueOf(-1))).intValue();
    boolean bool = set.contains(Integer.valueOf(i)) ? i : false;
    this.Zw.clear();
    this.Zw.addAll(list.stream().map(bool::lambda$refreshResourcePools$3).toList());
    SwingUtilities.invokeLater(this::lambda$refreshResourcePools$4);
  }
  
  private List<Integer> Zg() {
    return (ZO() && Zlz.Zu(this.ZX)) ? Arrays.<String>stream(this.ZX.split(",")).map(String::trim).filter(Zlz::Zu).map(Integer::parseInt).toList() : Collections.emptyList();
  }
  
  private boolean ZO() {
    return (Zlz.ZX(this.ZX) || Zd.matcher(this.ZX).matches());
  }
  
  public void ZK(Zb2y paramZb2y) {
    // Byte code:
    //   0: invokestatic Zd : ()I
    //   3: istore_2
    //   4: aload_1
    //   5: invokevirtual ZC : ()Ljava/util/Optional;
    //   8: astore_3
    //   9: aload_3
    //   10: invokevirtual isPresent : ()Z
    //   13: ifeq -> 69
    //   16: aload_0
    //   17: invokevirtual ZP : ()V
    //   20: aload_0
    //   21: getfield ZG : Lburp/Zzkr;
    //   24: aload_3
    //   25: invokevirtual get : ()Ljava/lang/Object;
    //   28: checkcast java/lang/Integer
    //   31: invokevirtual intValue : ()I
    //   34: invokevirtual Zp : (I)Ljava/util/Optional;
    //   37: invokevirtual isPresent : ()Z
    //   40: ifeq -> 56
    //   43: aload_3
    //   44: invokevirtual get : ()Ljava/lang/Object;
    //   47: checkcast java/lang/Integer
    //   50: invokevirtual intValue : ()I
    //   53: goto -> 57
    //   56: iconst_0
    //   57: istore #4
    //   59: aload_0
    //   60: iload #4
    //   62: invokevirtual ZT : (I)V
    //   65: iload_2
    //   66: ifeq -> 260
    //   69: aload_1
    //   70: invokevirtual ZA : ()Ljava/util/Optional;
    //   73: astore #4
    //   75: aload #4
    //   77: invokevirtual isPresent : ()Z
    //   80: ifeq -> 260
    //   83: aload_0
    //   84: invokevirtual ZQ : ()V
    //   87: aload #4
    //   89: invokevirtual get : ()Ljava/lang/Object;
    //   92: checkcast burp/Ztwh
    //   95: astore #5
    //   97: aload_0
    //   98: aload #5
    //   100: invokevirtual Zz : ()Ljava/lang/String;
    //   103: putfield ZM : Ljava/lang/String;
    //   106: aload_0
    //   107: aload #5
    //   109: invokevirtual Zw : ()Z
    //   112: putfield ZO : Z
    //   115: aload_0
    //   116: aload #5
    //   118: invokevirtual ZY : ()I
    //   121: putfield ZH : I
    //   124: aload_0
    //   125: aload #5
    //   127: invokevirtual ZK : ()Z
    //   130: putfield ZE : Z
    //   133: aload_0
    //   134: aload #5
    //   136: invokevirtual Zf : ()I
    //   139: putfield ZU : I
    //   142: aload_0
    //   143: aload #5
    //   145: invokevirtual Zy : ()Z
    //   148: putfield ZJ : Z
    //   151: aload_0
    //   152: aload #5
    //   154: invokevirtual Zm : ()Z
    //   157: putfield Zg : Z
    //   160: aload_0
    //   161: aload #5
    //   163: invokevirtual ZB : ()I
    //   166: putfield Zk : I
    //   169: aload_0
    //   170: aload #5
    //   172: invokevirtual Zc : ()Z
    //   175: putfield Zu : Z
    //   178: aload_0
    //   179: aload #5
    //   181: invokevirtual ZW : ()Z
    //   184: putfield Zr : Z
    //   187: aload_0
    //   188: aload #5
    //   190: invokevirtual ZQ : ()Z
    //   193: putfield Zj : Z
    //   196: aload_0
    //   197: aload #5
    //   199: invokevirtual Zo : ()Z
    //   202: putfield Za : Z
    //   205: aload_0
    //   206: aload #5
    //   208: invokevirtual ZO : ()Ljava/util/List;
    //   211: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   216: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   221: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   226: sipush #1884
    //   229: sipush #5279
    //   232: invokestatic a : (II)Ljava/lang/String;
    //   235: invokestatic joining : (Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
    //   238: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   243: checkcast java/lang/String
    //   246: putfield ZX : Ljava/lang/String;
    //   249: aload_0
    //   250: getfield ZB : Lburp/Ztue;
    //   253: aload #5
    //   255: invokeinterface Zs : (Lburp/Ztwh;)V
    //   260: return
  }
  
  private void lambda$refreshResourcePools$4() {
    this.ZB.ZM(this.Zw);
  }
  
  private static Zbf8 lambda$refreshResourcePools$3(int paramInt, Zr5_ paramZr5_) {
    return new Zbf8(paramZr5_, (paramZr5_.Z_() == paramInt));
  }
  
  private static Integer lambda$refreshResourcePools$2(Zbf8 paramZbf8) {
    return Integer.valueOf(paramZbf8.Zn.Z_());
  }
  
  private void lambda$selectPool$1(Zbf8 paramZbf8) {
    ZT(paramZbf8.Zn.Z_());
  }
  
  private static boolean lambda$selectPool$0(String paramString, Zbf8 paramZbf8) {
    return paramZbf8.Zn.Zu().equals(paramString);
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '%Ê$õNFqðtÌ\÷bRZÈÎéÜ¬÷/(ÌÜü­Qx'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_2
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #122
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
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
    //   66: aload #5
    //   68: putstatic burp/Zzk7.a : [Ljava/lang/String;
    //   71: iconst_2
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Zzk7.b : [Ljava/lang/String;
    //   78: goto -> 227
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 200
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #6
    //   154: goto -> 184
    //   157: bipush #122
    //   159: goto -> 184
    //   162: bipush #63
    //   164: goto -> 184
    //   167: bipush #124
    //   169: goto -> 184
    //   172: bipush #99
    //   174: goto -> 184
    //   177: bipush #117
    //   179: goto -> 184
    //   182: bipush #77
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 104
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 100
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
    //   224: goto -> 38
    //   227: sipush #1885
    //   230: sipush #-20501
    //   233: invokestatic a : (II)Ljava/lang/String;
    //   236: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   239: putstatic burp/Zzk7.Zd : Ljava/util/regex/Pattern;
    //   242: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x75C) & 0xFFFF;
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
      char c = 'ý';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzk7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */