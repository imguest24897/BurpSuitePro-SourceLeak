package burp;

import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import net.portswigger.Zgl;
import net.portswigger.Zie;
import net.portswigger.Zm2;

public class Zezo implements Zegh {
  private final Zkl6 ZH;
  
  private final Ztdi ZW;
  
  private final Zr_4 Zv;
  
  private final Zskh Zk;
  
  private final Zlog ZK;
  
  private final Ztos<Zt18> ZD;
  
  private final Zr69 Zi;
  
  private final Iterator<Zbql> Zw;
  
  private final Zt9j ZJ;
  
  private final Zsyv Zz;
  
  private final Zt1g Zy;
  
  private final Zm90 Zc;
  
  private final Zery Zd;
  
  private final Queue<Zxa2> ZX;
  
  private final Ztos<Zt35> Zl;
  
  private final Zkf3 Zg;
  
  private final Ztos<Zt13> ZT;
  
  private Zbql Zt;
  
  private Queue<Zez7> ZF;
  
  private Zss4 ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zezo(Zkl6 paramZkl6, Zrgd paramZrgd, Ztdi paramZtdi, Zr_4 paramZr_4, Zkf3 paramZkf3, ScheduledExecutorService paramScheduledExecutorService, Zskh paramZskh, Ztos<Zt13> paramZtos, Zlog paramZlog, Ztos<Zt18> paramZtos1, Ztos<Zt35> paramZtos2, Zr69 paramZr69, Zlz4 paramZlz4, Zeiy paramZeiy, Zt9j paramZt9j) {
    this.ZH = paramZkl6;
    this.ZW = paramZtdi;
    this.Zv = paramZr_4;
    this.Zg = paramZkf3;
    this.ZT = paramZtos;
    this.Zk = paramZskh;
    this.ZK = paramZlog;
    this.ZD = paramZtos1;
    this.Zl = Objects.<Ztos<Zt35>>requireNonNull(paramZtos2);
    this.Zi = paramZr69;
    this.Zw = paramZeiy.ZT().iterator();
    this.ZJ = paramZt9j;
    this.Zz = (new Zsyv(paramScheduledExecutorService, paramZlog, paramZr69, paramZrgd, paramZtos1)).ZM(paramZtos, paramZtos1);
    this.Zy = new Zt1g();
    Zbqc[] arrayOfZbqc = Zt1g.ZY();
    this.Zc = new Zm90(paramZlz4, paramZr69, this.Zy);
    this.Zd = null;
    this.ZX = new ConcurrentLinkedQueue<>(Collections.singleton(new Zzcw(this)));
    Zlfh.ZL(this.Zd);
    Zgiu.Zs(paramZtos1, paramZlog.ZnH(), paramZr69, paramZkl6.ZB());
    Zts2.Zr().<Void>Zz(paramZtos, Zt13.Zl, this::lambda$new$0).Zv(paramZtos1, Zt18.Ze, this::lambda$new$0);
    Zts2.Zr().Zz(paramZtos1, Zt18.ZW, paramZlog::lambda$new$2);
    if (Zbqc.Zwu() == null)
      Zt1g.Zo(new Zbqc[3]); 
  }
  
  public void ZW() {
    Zl7h zl7h = this.ZK.ZnH();
    if (!zl7h.ZVG())
      return; 
    this.ZD.ZD(new Zxr8(Zt18.ZY, Integer.valueOf(zl7h.ZVP().ZXY())));
    if (zl7h.ZVg()) {
      this.Zy.Zf();
      this.ZD.ZD(Zt18.ZH);
    } 
  }
  
  public Ztos<Zt18> ZV() {
    return this.ZD;
  }
  
  public Zlli<Zt35> ZG() {
    return this.Zl;
  }
  
  public boolean ZB() {
    return !this.ZX.isEmpty();
  }
  
  public Zxa2 Zt() {
    return this.ZX.poll();
  }
  
  public Zzc4 Zs() {
    return null;
  }
  
  public Zbuz ZH(Zra1 paramZra1, Zskh paramZskh, int paramInt) {
    Zbuz zbuz = (new Zruw(paramZra1, paramZskh)).Zx(this::lambda$createTerminalEventConsumer$3).Zv(this::lambda$createTerminalEventConsumer$4).ZJ(this::lambda$createTerminalEventConsumer$5).ZR();
    this.Zy.ZW(zbuz);
    return zbuz;
  }
  
  public boolean Zn() {
    return this.Zy.Zt();
  }
  
  private boolean Zg() {
    return this.Zy.ZT();
  }
  
  private void Zf() {
    Zbqc[] arrayOfZbqc = Zt1g.ZY();
    Zrim zrim = this.ZK.ZnH().ZV8();
    if (zrim instanceof Zvw) {
      Zvw zvw = (Zvw)zrim;
      if (zvw.ZLD().stream().anyMatch(Zezo::lambda$startCrawl$6)) {
        this.Zy.ZZ(new Zb6l(Zec4.OUT_OF_DATE_CRAWL, a(30125, 5244)));
        return;
      } 
    } 
    if (!this.Zy.ZP())
      return; 
    this.ZD.ZD(Zt18.Zx);
    this.Zi.ZD().Zy(Zrp6.DEBUG, Zlq7.NOT_IN_DEBUG_LOG, new Object[] { a(30126, 13392) });
    if (!this.Zw.hasNext())
      return; 
    this.Zt = Za();
    this.ZF = this.Zt.Zf();
    int i = this.ZK.ZnH().ZVJ();
    while (!this.ZF.isEmpty() && ((Zez7)this.ZF.peek()).Zn() < (byte)i) {
      this.ZF.poll();
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private Optional<Zm47> ZT() {
    // Byte code:
    //   0: invokestatic ZY : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zt : Lburp/Zbql;
    //   8: ifnonnull -> 23
    //   11: aload_0
    //   12: getfield Zw : Ljava/util/Iterator;
    //   15: invokeinterface hasNext : ()Z
    //   20: ifeq -> 138
    //   23: aload_0
    //   24: getfield ZF : Ljava/util/Queue;
    //   27: ifnull -> 67
    //   30: aload_0
    //   31: getfield ZF : Ljava/util/Queue;
    //   34: invokeinterface isEmpty : ()Z
    //   39: ifne -> 67
    //   42: aload_0
    //   43: getfield ZF : Ljava/util/Queue;
    //   46: invokeinterface poll : ()Ljava/lang/Object;
    //   51: checkcast burp/Zez7
    //   54: astore_2
    //   55: aload_0
    //   56: getfield ZR : Lburp/Zss4;
    //   59: aload_2
    //   60: invokevirtual ZM : (Lburp/Zez7;)Lburp/Zm47;
    //   63: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   66: areturn
    //   67: aload_0
    //   68: getfield Zt : Lburp/Zbql;
    //   71: ifnull -> 81
    //   74: aload_0
    //   75: getfield ZR : Lburp/Zss4;
    //   78: invokevirtual ZB : ()V
    //   81: aload_0
    //   82: getfield Zw : Ljava/util/Iterator;
    //   85: invokeinterface hasNext : ()Z
    //   90: ifeq -> 118
    //   93: aload_0
    //   94: aload_0
    //   95: invokevirtual Za : ()Lburp/Zbql;
    //   98: putfield Zt : Lburp/Zbql;
    //   101: aload_0
    //   102: aload_0
    //   103: getfield Zt : Lburp/Zbql;
    //   106: invokeinterface Zf : ()Ljava/util/Queue;
    //   111: putfield ZF : Ljava/util/Queue;
    //   114: aload_1
    //   115: ifnull -> 4
    //   118: aload_0
    //   119: aconst_null
    //   120: putfield Zt : Lburp/Zbql;
    //   123: aload_0
    //   124: new java/util/LinkedList
    //   127: dup
    //   128: invokespecial <init> : ()V
    //   131: putfield ZF : Ljava/util/Queue;
    //   134: aload_1
    //   135: ifnull -> 4
    //   138: invokestatic empty : ()Ljava/util/Optional;
    //   141: areturn
  }
  
  private Zbql Za() {
    Zbql zbql = this.Zw.next();
    zbql.ZM();
    Ztos<Zt35> ztos = zbql.ZH();
    if (this.Zi.Zf() instanceof Zmpw)
      ((Zmpw)this.Zi.Zf()).ZB(ztos); 
    (new Zsd6(this.ZW, this.Zv, this.ZH.ZB(), this.ZD)).Za(ztos);
    (new Zz88(this.Zg)).Zg(this.ZT, ztos);
    (new Zbxi(this.Zi, this.ZK)).ZG(this.ZD, ztos);
    (new Zzgm(this.ZK.ZnH(), this.ZD)).Z_(ztos);
    this.Zz.Zq(ztos);
    this.ZD.ZD(new Zxr8(Zt18.ZZ, zbql));
    this.ZR = this.ZJ.Zp(zbql, this.Zc, this.Zy);
    if (!this.ZK.ZnH().ZVG() || !this.ZK.ZnH().ZVd())
      this.ZR.Zd(); 
    return zbql;
  }
  
  private void Zz() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zy : Lburp/Zt1g;
    //   4: invokevirtual ZM : ()Z
    //   7: ifne -> 11
    //   10: return
    //   11: aload_0
    //   12: getfield Zi : Lburp/Zr69;
    //   15: invokeinterface ZD : ()Lburp/Zmv7;
    //   20: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   23: getstatic burp/Zlq7.NOT_IN_DEBUG_LOG : Lburp/Zlq7;
    //   26: iconst_1
    //   27: anewarray java/lang/Object
    //   30: dup
    //   31: iconst_0
    //   32: sipush #30124
    //   35: sipush #15502
    //   38: invokestatic a : (II)Ljava/lang/String;
    //   41: aastore
    //   42: invokeinterface Zy : (Lburp/Zrp6;Lburp/Zlq7;[Ljava/lang/Object;)V
    //   47: aload_0
    //   48: getfield ZK : Lburp/Zlog;
    //   51: invokeinterface ZnH : ()Lburp/Zl7h;
    //   56: astore_1
    //   57: aload_1
    //   58: invokeinterface ZVy : ()V
    //   63: aload_1
    //   64: invokeinterface ZVs : ()Ljava/util/Collection;
    //   69: aload_0
    //   70: aload_1
    //   71: <illegal opcode> accept : (Lburp/Zezo;Lburp/Zl7h;)Ljava/util/function/Consumer;
    //   76: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   81: aload_0
    //   82: getfield ZD : Lburp/Ztos;
    //   85: getstatic burp/Zt18.ZH : Lburp/Zxr8;
    //   88: invokevirtual ZD : (Lburp/Zxr8;)V
    //   91: aload_0
    //   92: getfield Zi : Lburp/Zr69;
    //   95: invokeinterface ZD : ()Lburp/Zmv7;
    //   100: invokeinterface Zv : ()V
    //   105: return
  }
  
  private void Zu() {
    Zsiv zsiv = this.ZK.ZnH().ZVv();
    if (!zsiv.ZZk())
      Zm2.Ze(new Zgl(this.ZK.ZPy()), Zv8r.CRAWL_NUMBER_OF_PENDING_DOORWAYS_AFTER_MAX_TIME, zsiv.ZZo()); 
  }
  
  private void lambda$finishCrawl$8(Zl7h paramZl7h, Zko4 paramZko4) {
    Optional<Zm72> optional = paramZl7h.ZVe().Zu(paramZko4.ZRc());
    if (optional.isEmpty() || ((Zm72)optional.get()).Zng().stream().allMatch(Zezo::lambda$finishCrawl$7))
      Zmgc.RECORDED_SEQUENCE_NO_NEW_ROOMS.Zl(this.Zk, Zkqn.ERROR, Zie.RECORDED_SEQUENCE_ERROR, "", new Object[] { paramZko4.ZP() }); 
  }
  
  private static boolean lambda$finishCrawl$7(Zt8i paramZt8i) {
    return paramZt8i.Zsu() instanceof Zxtr;
  }
  
  private static boolean lambda$startCrawl$6(Zeu9 paramZeu9) {
    return paramZeu9 instanceof Zerb;
  }
  
  private void lambda$createTerminalEventConsumer$5(Zb6l paramZb6l) {
    this.ZD.ZD(new Zxr8(Zt18.ZW));
  }
  
  private void lambda$createTerminalEventConsumer$4(Zb6l paramZb6l) {
    this.ZD.ZD(new Zxr8(Zt18.ZS, paramZb6l));
  }
  
  private void lambda$createTerminalEventConsumer$3(String paramString) {
    this.ZD.ZD(new Zxr8(Zt18.Zz, Zlj9.ZP(paramString)));
  }
  
  private static void lambda$new$2(Zlog paramZlog, Zxr8 paramZxr8) {
    paramZlog.ZnH().ZV1();
  }
  
  private void lambda$new$0(Zxr8 paramZxr8) {
    Zu();
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'k\"æ³í¯¢Xökï\\r³RÞJ2å|N0Ä²[Ô8Ñ6PÔ+7ÇÉº+vÈlLò¸´g*1ºføÞ>ve®¿¡ÖxS>\\n¼SÂ¢±í¡Fî°3ô×ôW<¶;ÄF5jÆ|²w'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #50
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #109
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
    //   69: putstatic burp/Zezo.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zezo.b : [Ljava/lang/String;
    //   79: goto -> 226
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
    //   98: if_icmpgt -> 199
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 161, 3 -> 166, 4 -> 171, 5 -> 176
    //   152: bipush #14
    //   154: goto -> 183
    //   157: iconst_4
    //   158: goto -> 183
    //   161: bipush #117
    //   163: goto -> 183
    //   166: bipush #111
    //   168: goto -> 183
    //   171: bipush #57
    //   173: goto -> 183
    //   176: bipush #73
    //   178: goto -> 183
    //   181: bipush #15
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 105
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 101
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 39
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x75AC) & 0xFFFF;
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
      char c = 'Ó';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zezo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */