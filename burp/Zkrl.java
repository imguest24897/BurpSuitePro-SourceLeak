package burp;

import burp.api.montoya.http.handler.HttpHandler;
import burp.api.montoya.internal.MontoyaObjectFactory;
import burp.api.montoya.proxy.http.ProxyRequestHandler;
import burp.api.montoya.proxy.http.ProxyResponseHandler;
import burp.api.montoya.scanner.audit.AuditIssueHandler;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.JMenu;
import net.portswigger.Zml;
import net.portswigger.Zqf;
import net.portswigger.Zsy;
import net.portswigger.Zuh;

public class Zkrl extends Zkro {
  private final Zslu Zj;
  
  private final Zml ZK;
  
  private final Ztg4 Zp;
  
  private final Zr_4 ZZ;
  
  private final Ztyg Zvg;
  
  private final Zgq7 Zc;
  
  private final Zr1m ZB;
  
  private final Zlx6 ZU;
  
  private final Zlxz Zx;
  
  private final Zm37 Zi;
  
  private final Ztcy ZD;
  
  private final Zrny Zvt;
  
  private final Zzg2 ZX;
  
  private final Zbiv ZN;
  
  private final Zzw2 Zv9;
  
  private final Zlaa Zv;
  
  private final Zt8u ZR;
  
  private final Zrua Zm;
  
  private final Zto3 ZE;
  
  private final Zsuv ZvE;
  
  private final Zzzt Zv2;
  
  private final Zgav ZvT;
  
  private final Zl5y ZH;
  
  private final AtomicBoolean ZvN;
  
  private final Zktu ZL;
  
  private final Zzqf Zg;
  
  private final Zs0n Zvl;
  
  private final Zr34 ZG;
  
  private final Zkc0 ZT;
  
  private final Zrag Zk;
  
  private final Zgf2 Ze;
  
  private final Ztq1 Zvw;
  
  private final Zell Zd;
  
  private final Zzjc Za;
  
  private final Zedy Zvu;
  
  private final MontoyaObjectFactory Zr;
  
  private final Zz3j ZP;
  
  private final Zln3 Zvz;
  
  private Zl9 Zs;
  
  private Zs9f ZA;
  
  private Zlp6 ZM;
  
  private Zr4w ZC;
  
  private boolean ZS;
  
  private Zed0 ZvS;
  
  private static boolean Zy;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zkrl(Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Zgbj paramZgbj, Zgb6 paramZgb6, Zxgc paramZxgc, Zskh paramZskh, Zgzy paramZgzy, Zslu paramZslu, Zkl6 paramZkl6, Zt8u paramZt8u, Zml paramZml, Ztg4 paramZtg4, Ztwv paramZtwv, Zr_4 paramZr_41, Zr_4 paramZr_42, Ztyg paramZtyg, Zgq7 paramZgq7, Zr1m paramZr1m, Zlx6 paramZlx6, Zlxz paramZlxz, Zm37 paramZm37, Ztcy paramZtcy, Zrny paramZrny, Zzg2 paramZzg2, Zbiv paramZbiv, Zsuv paramZsuv, Zzw2 paramZzw2, Zlaa paramZlaa, Zlcb paramZlcb, Zrua paramZrua, Zzzt paramZzzt, Zgav paramZgav, Zto3 paramZto3, Zzqf paramZzqf, Zs0n paramZs0n, Zr34 paramZr34, Zkc0 paramZkc0, Zrag paramZrag, Zgf2 paramZgf2, MontoyaObjectFactory paramMontoyaObjectFactory, Zz3j paramZz3j, Zm6x paramZm6x) {
    super(paramZz0n, paramZt4u, paramZerg, paramZgbj, paramZgb6, paramZxgc, paramZskh, paramZgzy, paramZkl6, Zeew.EXTENDER, paramZtwv, paramZr_41, paramZlcb, paramZm6x);
    this.Zj = paramZslu;
    this.ZK = paramZml;
    this.Zp = paramZtg4;
    this.ZZ = paramZr_42;
    this.Zvg = paramZtyg;
    this.Zc = paramZgq7;
    this.ZB = paramZr1m;
    this.ZU = paramZlx6;
    this.Zx = paramZlxz;
    this.Zvt = paramZrny;
    this.ZX = paramZzg2;
    this.ZN = paramZbiv;
    boolean bool = Zml();
    this.Zi = paramZm37;
    this.ZD = paramZtcy;
    this.ZvE = paramZsuv;
    this.Zv9 = paramZzw2;
    this.Zv = paramZlaa;
    this.ZR = paramZt8u;
    this.Zm = paramZrua;
    this.Zv2 = paramZzzt;
    this.ZvT = paramZgav;
    this.ZE = paramZto3;
    this.Zvl = paramZs0n;
    this.Zg = paramZzqf;
    this.ZG = paramZr34;
    this.ZT = paramZkc0;
    this.Zk = paramZrag;
    this.Ze = paramZgf2;
    this.ZP = paramZz3j;
    this.ZH = new Zl5y();
    this.ZvN = new AtomicBoolean();
    this.ZL = new Zktu();
    this.Zvw = new Ztq1(new Zgig());
    Objects.requireNonNull(paramZskh);
    this.Zd = new Zell(paramZz0n.ZR(), this.Zvw, paramZskh::Zl, Zkrl::lambda$new$0);
    this.Zvz = new Zreq(this.Zvw, this.Zd);
    this.Za = new Zzjc();
    this.Zvu = new Zedy(this.Zf);
    this.Zr = paramMontoyaObjectFactory;
    if (Zbqc.Zwu() == null)
      Zyy(!bool); 
  }
  
  public Zl9 ZmI() {
    return this.Zs;
  }
  
  public void ZYE() {
    Zl11 zl11 = this.Zv.Zk(Zeew.EXTENDER, this.ZW, this.Zw.ZW(Zeew.EXTENDER));
    Zb4u zb4u = new Zb4u(zl11, this.ZF, this.ZW);
    Zmk0 zmk0 = new Zmk0(zb4u, this.Zv, this.ZW, this.Zw, this.ZF);
    Zm5z zm5z = new Zm5z(this.ZW, this.ZQ, this.Zf);
    Zsy zsy = this.Zo.ZU();
    Zzv6 zzv6 = new Zzv6(zsy);
    Zey9 zey9 = this.ZO.ZH();
    boolean bool = ZmQ();
    Zg3s zg3s = new Zg3s(this.Zl, this.ZO.ZB(), zl11, zsy, this.ZW, this.ZF, zey9);
    Zkh3 zkh3 = new Zkh3(zg3s, this.Zv2, zzv6, zey9);
    Objects.requireNonNull(this.ZvN);
    Objects.requireNonNull(this.Zv2);
    this.Zs = new Zl9(this.Zo, this.ZJ, this.ZvN::get, this.Zb, this.ZI, this.Zn, this.Zu, this.Zj, this.ZR, this.ZQ, this.Zp, this.Zl, this.Zz, this.ZZ, this.Zvg, this.Zc, this.ZB, this.Zx, this.Zi, this.ZD, this.ZN, this.Zvt, this.ZX, this.ZvE, this.ZJ.Ze(), this.ZE, new Zxlq(this.Zvl, this::lambda$initialiseInterfaces$1), new Zzls(this.ZQ, this.Zvg, this.Zvl, zey9, this.Zl), new Zgj2(this.Zvg, this.Zvl, this.Zl), zm5z, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new Ziv(this.Zo.Zr()), this.Zv2::ZQ, this.ZvT, this.ZH, ZY4(), this.ZL, zmk0, zb4u, this.Zg, this.Zvl, zkh3, this.Zk, this.ZF, this.Zr, this.ZP, this.Zq);
    this.ZU.Zx(ZmI());
    Objects.requireNonNull(this.Zo);
    Ze78 ze78 = new Ze78(this, this.Zv9, this.ZR, this.Zs, this.ZK, this.ZO, this.ZQ, this.Zo.ZM(), this.Zo.ZR(), this.Zo::ZZ, this.Zl);
    this.ZA = this.Zm.Zn(ZmI(), ze78);
    this.ZH.ZZ(this.ZA);
    if (bool)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public Ztql ZYS() {
    Objects.requireNonNull(this.Zd);
    return new Zemq(this, ZmI(), this.Za, this.Zvu, this.Zd::ZV, this::Zm7, this.Zvz);
  }
  
  private void Zm7() {
    ZD(3, true, true, true);
  }
  
  public void ZYq() {
    this.ZC = new Zr4w();
    this.ZvT.ZP(this.ZC);
    this.ZvS = new Zed0(this.ZF, this.ZT, this.Zvw, this.Zd, this.Za, this.Ze, new Zxf5(this.ZR), this.Zvg, this.Zc, this.Zvu);
    this.ZM = new Zlp6(this.ZJ, this.ZC, this.Zs, this.Zd, new Zr_r(new Zlc4(this.Zn.ZK1())), this.ZA, this.Zn, this.ZF, this.Zo.ZD(), this.Zl, this.ZT, this.ZB, this.ZE, this.ZvT, this.ZL, this.ZG, this.Zvw, this.ZvS);
    this.ZC.ZD(this.ZM);
    this.Z_ = this.ZM.Zt();
  }
  
  public void ZYO() {
    if (this.ZM == null) {
      Zuh.Zb(false, Zqf.Zr);
      return;
    } 
    this.ZM.Zt2();
  }
  
  public void ZYA() {
    this.ZS = true;
    this.ZA.ZN();
    this.ZI.Zy(this::lambda$start$2);
  }
  
  public Optional<Zz4n> ZYK() {
    return Optional.of(new Zz4n(Zeew.EXTENDER.toolName, Zs70.EXTENSIONS_PATH));
  }
  
  public void Zd(Zmf_ paramZmf_) {
    // Byte code:
    //   0: invokestatic ZmQ : ()Z
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZC : Lburp/Zr4w;
    //   8: ifnonnull -> 19
    //   11: iconst_0
    //   12: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   15: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   18: return
    //   19: aload_0
    //   20: getfield ZC : Lburp/Zr4w;
    //   23: aload_1
    //   24: invokevirtual Zd : (Lburp/Zmf_;)V
    //   27: aload_0
    //   28: getfield ZS : Z
    //   31: ifeq -> 46
    //   34: aload_0
    //   35: getfield Zs : Lburp/Zl9;
    //   38: aload_1
    //   39: invokevirtual Zd : (Lburp/Zmf_;)V
    //   42: iload_2
    //   43: ifeq -> 62
    //   46: aload_0
    //   47: getfield ZI : Lburp/Zgbj;
    //   50: aload_0
    //   51: aload_1
    //   52: <illegal opcode> run : (Lburp/Zkrl;Lburp/Zmf_;)Ljava/lang/Runnable;
    //   57: invokeinterface Zy : (Ljava/lang/Runnable;)V
    //   62: aload_0
    //   63: getfield Zd : Lburp/Zell;
    //   66: aload_1
    //   67: invokevirtual Zd : (Lburp/Zmf_;)V
    //   70: return
  }
  
  public void Zl(Zg4j paramZg4j) {
    this.ZC.Zl(paramZg4j);
    this.Zs.Zl(paramZg4j);
    this.Zd.Zl(paramZg4j);
  }
  
  public void ZYI() {
    this.ZvN.set(true);
  }
  
  public void ZI(Zb_9 paramZb_9, Ztg8 paramZtg8, Zlc8 paramZlc8, float paramFloat1, float paramFloat2) {
    boolean bool = Zml();
    if (!paramZlc8.Zq(paramFloat1, a(-15665, 19196)) || paramZb_9.ZoK() == 0)
      return; 
    Zb_9 zb_9 = this.ZJ.ZN().Zvo();
    for (Zsdr zsdr1 : paramZb_9.ZoT()) {
      Zsdr zsdr2 = this.Zz.Zz(zsdr1.toString());
      Zsy_ zsy_ = paramZtg8.<Zsy_>Zw(paramZb_9.ZI(zsdr1));
      zb_9.Zx(zsdr2, zsy_);
      paramFloat1 += paramFloat2;
      if (!paramZlc8.Zq(paramFloat1, a(-15666, -11958)) || !bool)
        break; 
    } 
  }
  
  public boolean ZQ() {
    boolean bool = this.ZF.Zfk().stream().anyMatch(Zkrl::lambda$shouldShowSendToBChecks$4);
    return (bool || this.ZvS.ZY());
  }
  
  private static boolean lambda$shouldShowSendToBChecks$4(Zl1c paramZl1c) {
    return (paramZl1c.ZA() == 133008);
  }
  
  private void lambda$loadBurpConfiguration$3(Zmf_ paramZmf_) {
    this.Zs.ZF(paramZmf_);
  }
  
  private void lambda$start$2() {
    this.Zs.Zv();
  }
  
  private Zbkv lambda$initialiseInterfaces$1(boolean paramBoolean) {
    return new Zbkv(paramBoolean, this.ZF, this.Zo.ZD(), this.Zl);
  }
  
  private static String lambda$new$0() {
    return UUID.randomUUID().toString();
  }
  
  public static void Zyy(boolean paramBoolean) {
    Zy = paramBoolean;
  }
  
  public static boolean Zml() {
    return Zy;
  }
  
  public static boolean ZmQ() {
    boolean bool = Zml();
    return !bool;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_1
    //   7: iconst_0
    //   8: istore_3
    //   9: invokestatic Zyy : (Z)V
    //   12: ldc 'é(o¾­Ç1ü³tÃø9p2ç,AnRÊÎ]L@<'
    //   14: dup
    //   15: astore_2
    //   16: invokevirtual length : ()I
    //   19: istore #4
    //   21: bipush #15
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #12
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 86
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
    //   71: aload #5
    //   73: putstatic burp/Zkrl.a : [Ljava/lang/String;
    //   76: iconst_2
    //   77: anewarray java/lang/String
    //   80: putstatic burp/Zkrl.b : [Ljava/lang/String;
    //   83: goto -> 231
    //   86: dup_x2
    //   87: pop
    //   88: invokevirtual toCharArray : ()[C
    //   91: dup_x1
    //   92: arraylength
    //   93: dup_x2
    //   94: pop
    //   95: iconst_0
    //   96: istore #6
    //   98: dup2_x1
    //   99: pop2
    //   100: dup_x2
    //   101: iconst_1
    //   102: if_icmpgt -> 204
    //   105: dup2
    //   106: swap
    //   107: iload #6
    //   109: dup2_x1
    //   110: caload
    //   111: swap
    //   112: iload #6
    //   114: bipush #7
    //   116: irem
    //   117: tableswitch default -> 186, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #58
    //   158: goto -> 188
    //   161: bipush #95
    //   163: goto -> 188
    //   166: bipush #60
    //   168: goto -> 188
    //   171: bipush #97
    //   173: goto -> 188
    //   176: bipush #119
    //   178: goto -> 188
    //   181: bipush #113
    //   183: goto -> 188
    //   186: bipush #20
    //   188: ixor
    //   189: ixor
    //   190: i2c
    //   191: castore
    //   192: iinc #6, 1
    //   195: dup
    //   196: ifne -> 204
    //   199: dup2
    //   200: dup_x1
    //   201: goto -> 109
    //   204: dup2_x1
    //   205: pop2
    //   206: dup_x2
    //   207: iload #6
    //   209: if_icmpgt -> 105
    //   212: pop
    //   213: new java/lang/String
    //   216: dup_x1
    //   217: swap
    //   218: invokespecial <init> : ([C)V
    //   221: invokevirtual intern : ()Ljava/lang/String;
    //   224: swap
    //   225: pop
    //   226: swap
    //   227: pop
    //   228: goto -> 43
    //   231: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC2CF) & 0xFFFF;
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
      byte b1 = 114;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkrl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */