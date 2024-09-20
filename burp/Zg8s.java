package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.List;

public class Zg8s extends Zbqc implements Zgap, Zmlq {
  protected final Zbdf Zi;
  
  protected final Zbdf ZK;
  
  private final Zkl6 ZW;
  
  private final Zbdx Za;
  
  private final Ze47 Zh;
  
  private final Zlu8<Ztzs> Zq;
  
  private volatile Zz_1 ZH;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zg8s(Zkl6 paramZkl6, Ze47 paramZe47, Ztyg paramZtyg, Zgq7 paramZgq7, Zm6x paramZm6x) {
    super(new BorderLayout());
    this.ZW = paramZkl6;
    this.Zh = paramZe47;
    this.ZK = paramZtyg.Zz(this, Zeew.TARGET, false, Zbdf.ZD, Zb9b.Zx);
    this.ZK.setName(a(31828, -23435));
    this.Zi = paramZtyg.Zz(this, Zeew.TARGET, false, Zbdf.ZU, Zb9b.Zx);
    this.Zi.setName(a(31827, 30488));
    this.Zq = new Zlu8<>(Zmkn::new, Zv8r.TARGET_SITE_MAP_NOTES_ADDED, Zv8r.TARGET_SITE_MAP_NOTES_EDITED, Zze0.TARGET_SITE_MAP_NOTES_SIDE_PANEL_CLICKED, paramZm6x);
    this.Za = paramZgq7.ZP(Zxff.SITE_MAP).ZA(this.ZK, a(31830, 14860)).Zp(this.Zi, a(31829, 32111)).Zf(List.of(this.Zq), Zs_i.INSPECTOR).Zl();
    this.Za.setName(a(31825, 20607));
    add(this.Za, a(31831, 24227));
    paramZm6x.ZO(Zmkn.class, Zehw.SWING, this::lambda$new$1);
  }
  
  public void ZP(Zz_1 paramZz_1) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield ZH : Lburp/Zz_1;
    //   5: invokestatic ZG : ()Ljava/lang/String;
    //   8: aconst_null
    //   9: astore_3
    //   10: astore_2
    //   11: aload_1
    //   12: ifnonnull -> 47
    //   15: aload_0
    //   16: getfield ZK : Lburp/Zbdf;
    //   19: aconst_null
    //   20: checkcast [B
    //   23: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   26: invokevirtual ZN : ([BLburp/Zgu3;)V
    //   29: aload_0
    //   30: getfield Zi : Lburp/Zbdf;
    //   33: aconst_null
    //   34: checkcast [B
    //   37: getstatic burp/Zgu3.HTTP_RESPONSE : Lburp/Zgu3;
    //   40: invokevirtual ZN : ([BLburp/Zgu3;)V
    //   43: aload_2
    //   44: ifnonnull -> 219
    //   47: aload_0
    //   48: invokevirtual Zo3 : ()Lburp/Zbr;
    //   51: astore #4
    //   53: aload_0
    //   54: invokevirtual ZoO : ()Lburp/Zstu;
    //   57: astore #5
    //   59: aload_1
    //   60: invokevirtual Z_ : ()Ljava/lang/Object;
    //   63: checkcast burp/Zxya
    //   66: invokevirtual Zq : ()Lburp/Zlit;
    //   69: astore #6
    //   71: aload #6
    //   73: invokeinterface Zdz : ()Lburp/Zmzk;
    //   78: astore #7
    //   80: aload_1
    //   81: invokevirtual Z_ : ()Ljava/lang/Object;
    //   84: checkcast burp/Zxya
    //   87: getfield ZX : Lburp/Zez3;
    //   90: astore #11
    //   92: aload #11
    //   94: instanceof burp/Ztzs
    //   97: ifeq -> 110
    //   100: aload #11
    //   102: checkcast burp/Ztzs
    //   105: astore #10
    //   107: aload #10
    //   109: astore_3
    //   110: aload #4
    //   112: ifnonnull -> 171
    //   115: aload_0
    //   116: getfield Zh : Lburp/Ze47;
    //   119: aload #7
    //   121: invokevirtual Zw : (Lburp/Zmzk;)Lburp/Zkyt;
    //   124: invokestatic ZW : (Lburp/Zkyt;)Lburp/Zgsq;
    //   127: astore #8
    //   129: aload_0
    //   130: getfield ZW : Lburp/Zkl6;
    //   133: invokeinterface ZH : ()Lburp/Zey9;
    //   138: aload #7
    //   140: aload_0
    //   141: getfield ZW : Lburp/Zkl6;
    //   144: invokeinterface Zs : ()Lburp/Zm6e;
    //   149: invokeinterface ZO : ()Lburp/Ztom;
    //   154: aload #6
    //   156: invokevirtual Zf : (Lburp/Zlit;)Lburp/Ztom;
    //   159: invokevirtual Zr : ()Lburp/Zstu;
    //   162: invokevirtual Zu : (Lburp/Zmzk;Lburp/Zstu;)Lburp/Zefx;
    //   165: astore #9
    //   167: aload_2
    //   168: ifnonnull -> 195
    //   171: aload_0
    //   172: invokevirtual Zoe : ()Lburp/Zgsq;
    //   175: astore #8
    //   177: aload #4
    //   179: aload #7
    //   181: aload_0
    //   182: getfield ZW : Lburp/Zkl6;
    //   185: invokeinterface ZH : ()Lburp/Zey9;
    //   190: invokevirtual ZP : (Lburp/Zmzk;Lburp/Zey9;)Lburp/Zefx;
    //   193: astore #9
    //   195: aload_0
    //   196: getfield ZK : Lburp/Zbdf;
    //   199: aload #9
    //   201: aload #8
    //   203: iconst_1
    //   204: invokevirtual ZW : (Lburp/Zefx;Lburp/Zgsq;Z)V
    //   207: aload_0
    //   208: getfield Zi : Lburp/Zbdf;
    //   211: aload #5
    //   213: getstatic burp/Zgu3.HTTP_RESPONSE : Lburp/Zgu3;
    //   216: invokevirtual ZE : (Lburp/Zstu;Lburp/Zgu3;)V
    //   219: aload_0
    //   220: getfield Zq : Lburp/Zlu8;
    //   223: invokevirtual ZI : ()V
    //   226: aload_0
    //   227: getfield Zq : Lburp/Zlu8;
    //   230: aload_3
    //   231: invokevirtual ZS : (Lburp/Zlpg;)V
    //   234: return
  }
  
  public void ZC() {
    Zbxj zbxj = this.Za.Zs();
    zbxj.Zv(Zs_i.NOTES);
    zbxj.ZJ(true);
    this.Zq.ZH();
  }
  
  public Zz_1 Zq() {
    return this.ZH;
  }
  
  public Component Zk() {
    return this;
  }
  
  public void ZJ() {
    this.Za.Zk();
  }
  
  public Zmzk Zod() {
    return (this.ZH == null) ? null : ((Zxya)this.ZH.Z_()).Zq().Zdz();
  }
  
  public List<Component> Zof() {
    return null;
  }
  
  public Zepe Zl(Component paramComponent) {
    return new Zepa(a(31826, 10499), Zk97.DESKTOP_TOOLS_TARGET_SITE_MAP, Zt2m.ZF(this));
  }
  
  public Zstu Zos() {
    return (this.ZH == null || !((Zxya)this.ZH.Z_()).Zx) ? null : ((Zxya)this.ZH.Z_()).Zh();
  }
  
  public boolean ZoZ() {
    return (this.ZH != null && ((Zxya)this.ZH.Z_()).ZD());
  }
  
  public Zstu ZoO() {
    return (this.ZH == null || !((Zxya)this.ZH.Z_()).Zx) ? null : ((Zxya)this.ZH.Z_()).Zm();
  }
  
  public long ZoB() {
    return (this.ZH == null) ? -1L : ((Zxya)this.ZH.Z_()).ZM;
  }
  
  public void Zc() {
    this.Zq.ZI();
  }
  
  public String ZZ() {
    return (this.ZH == null) ? null : ((Zxya)this.ZH.Z_()).ZAs();
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    return Zsou.ZD(this, paramZkl6.ZH());
  }
  
  private void lambda$new$1(Zmkn paramZmkn) {
    if (this.ZH == null || paramZmkn.Zfv().stream().noneMatch(this::lambda$new$0))
      return; 
    this.Zq.ZW();
  }
  
  private boolean lambda$new$0(Ztzs paramZtzs) {
    return paramZtzs.ZF(((Zxya)this.ZH.Z_()).ZX);
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Å¤ßTé7ÛG"\\bÝÐ¡y@¥&Ò!fÔ+A.õ0´ì`DkÞhÂéªñhébÅ¯Q"ýª§®EçãYºoCaÜ5%Ç8;tPø¿Î§¡\7Î®ì '
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #41
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
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
    //   68: ldc 'Åâ¬æÍ ÏÃôuúu'ªN+'½È[ w|sX:&d²º°lð2iÿo'ê©ûfoUVý'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #22
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #11
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zg8s.a : [Ljava/lang/String;
    //   132: bipush #7
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zg8s.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #34
    //   214: goto -> 244
    //   217: bipush #14
    //   219: goto -> 244
    //   222: bipush #57
    //   224: goto -> 244
    //   227: bipush #23
    //   229: goto -> 244
    //   232: bipush #45
    //   234: goto -> 244
    //   237: bipush #116
    //   239: goto -> 244
    //   242: bipush #118
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7C57) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg8s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */