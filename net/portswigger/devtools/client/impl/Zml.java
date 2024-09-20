package net.portswigger.devtools.client.impl;

import burp.Zgrn;
import burp.Zlnb;
import burp.Zrij;
import burp.Ztos;
import burp.Zxr8;
import burp.Zz_h;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zb;
import net.portswigger.browser.Zc1;
import net.portswigger.browser.Zck;
import net.portswigger.browser.Zcl;
import net.portswigger.browser.Zd;
import net.portswigger.browser.Zds;
import net.portswigger.browser.Zdz;
import net.portswigger.browser.Ze1;
import net.portswigger.browser.Zeg;
import net.portswigger.browser.Zek;
import net.portswigger.browser.Zeu;
import net.portswigger.browser.Zev;
import net.portswigger.browser.Zez;
import net.portswigger.browser.Zjw;
import net.portswigger.browser.Zt8;
import net.portswigger.browser.Ztb;
import net.portswigger.browser.Zti;
import net.portswigger.browser.Ztj;
import net.portswigger.browser.Ztk;
import net.portswigger.browser.Ztq;
import net.portswigger.devtools.client.Z_;
import net.portswigger.devtools.client.Zi;
import net.portswigger.devtools.client.Zk;
import net.portswigger.devtools.client.Zn;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.client.Zy;
import net.portswigger.devtools.protocol.ChromeDevTools;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.events.browser.DownloadProgress;
import net.portswigger.devtools.protocol.events.browser.DownloadProgressState;
import net.portswigger.devtools.protocol.events.target.AttachedToTarget;
import net.portswigger.devtools.protocol.types.browser.SetDownloadBehaviorBehavior;
import net.portswigger.devtools.protocol.types.target.FilterEntry;
import net.portswigger.devtools.protocol.types.target.TargetInfo;

public class Zml implements Zc1 {
  private final Zeu Zn;
  
  private final Zn Zl;
  
  private final Zdz ZX;
  
  private final boolean Zu;
  
  private final Ztos<Zck> Ze;
  
  private final Zxy Zq;
  
  private final Zxq ZS;
  
  private final Set<Zgrn> Zd;
  
  private Zeg Zc;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zml(Zeu paramZeu, Zn paramZn, Zdz paramZdz, boolean paramBoolean, Ztos<Zck> paramZtos, Zxy paramZxy, Zxq paramZxq) {
    this.Zn = paramZeu;
    this.Zl = paramZn;
    this.ZX = paramZdz;
    this.Zu = paramBoolean;
    this.Ze = paramZtos;
    this.Zq = paramZxy;
    this.ZS = paramZxq;
    this.Zd = new CopyOnWriteArraySet<>();
  }
  
  public Zxy Zs() {
    return this.Zq;
  }
  
  public Zxq Zd() {
    return this.ZS;
  }
  
  public Zeg ZE(int paramInt, Zcl paramZcl) {
    try {
      if (this.Zc != null)
        return this.Zc; 
    } catch (Ze1 ze1) {
      throw a(null);
    } 
    this.Zc = (Zeg)new Ztb(this, paramInt, paramZcl);
    return this.Zc;
  }
  
  public void Zl() throws Ztk {
    try {
      this.Zl.Zz(Zk.ZA(this::lambda$preventDownloads$0));
      this.Zl.Zn(this::lambda$preventDownloads$2);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
    } catch (Z_ z_) {
      Zah.Zl((Throwable)z_, Zk_.RETHROWN);
      throw new Ztj(z_);
    } catch (Zp zp) {
      Zah.Zl((Throwable)zp, Zk_.RETHROWN);
      throw new Zti(zp);
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.RETHROWN);
      throw new Ztq(zi);
    } 
  }
  
  public Zeu Zz() {
    return this.Zn;
  }
  
  Zdz Zk() {
    return this.ZX;
  }
  
  public boolean ZJ() {
    return this.Zu;
  }
  
  public void ZT() {
    try {
      Zb.Zp(Zds.DEBUG, a(-7334, 18382), new Object[] { this.ZX });
      if (this.Zc != null) {
        Zb.Zp(Zds.DEBUG, a(-7336, 23554), new Object[0]);
        this.Zc.ZY();
      } 
    } catch (Ze1 ze1) {
      throw a(null);
    } 
    this.Zq.Zh();
    this.Zd.forEach(Zgrn::ZZ);
    this.Zd.clear();
  }
  
  public <T> Zgrn ZE(Zlnb<T> paramZlnb, Consumer<Zxr8<T>> paramConsumer) throws Zz_h {
    Zgrn zgrn = this.Ze.ZE(paramZlnb, paramConsumer);
    this.Zd.add(zgrn);
    return zgrn;
  }
  
  public <T> Zgrn ZO(Zlnb<T> paramZlnb, Consumer<Zxr8<T>> paramConsumer, Zrij paramZrij) throws Zz_h {
    Zgrn zgrn = this.Ze.ZO(paramZlnb, paramConsumer, paramZrij);
    this.Zd.add(zgrn);
    return zgrn;
  }
  
  public <T> Zgrn Zb(Zlnb<T> paramZlnb, Consumer<Zxr8<T>> paramConsumer, Executor paramExecutor) throws Zz_h {
    Zgrn zgrn = this.Ze.Zb(paramZlnb, paramConsumer, paramExecutor);
    this.Zd.add(zgrn);
    return zgrn;
  }
  
  public <T> Zgrn Zo(Zlnb<T> paramZlnb, Consumer<Zxr8<T>> paramConsumer, Executor paramExecutor, Zrij paramZrij) throws Zz_h {
    Zgrn zgrn = this.Ze.Zo(paramZlnb, paramConsumer, paramExecutor, paramZrij);
    this.Zd.add(zgrn);
    return zgrn;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (Ze1 ze1) {
      throw a(null);
    } 
    try {
      if (paramObject != null)
        try {
          if (getClass() == paramObject.getClass()) {
            Zml zml = (Zml)paramObject;
            return Objects.equals(this.ZX, zml.ZX);
          } 
          return false;
        } catch (Ze1 ze1) {
          throw a(null);
        }  
    } catch (Ze1 ze1) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.ZX });
  }
  
  public String toString() {
    return a(-7331, 1432) + a(-7331, 1432) + String.valueOf(this.ZX);
  }
  
  public void ZY(Zn paramZn) throws InterruptedException, Zi {
    paramZn.Zn(this::lambda$initialise$3);
    paramZn.Zn(this::lambda$initialise$4);
    Zb zb = new Zb(paramZn);
    List<FilterEntry> list = List.of(new FilterEntry(Boolean.valueOf(true), a(-7330, 16559)), new FilterEntry(Boolean.valueOf(false), null));
    List<Zev> list1 = (List)((List)paramZn.Zz(Zk.ZA(list::lambda$initialise$5))).stream().filter(this::ZF).map(Zml::lambda$initialise$6).collect(Collectors.toList());
    Zb.Zp(Zds.DEBUG, a(-7344, -25866), new Object[] { Integer.valueOf(list1.size()), this.ZX, list1 });
    if (!list1.isEmpty())
      try {
        try {
          if (!zb.Zw(list1).await(paramZn.Zf().toMillis(), TimeUnit.MILLISECONDS))
            throw new Ze1(a(-7333, 20560)); 
        } catch (Zi zi) {
          throw a(null);
        } 
      } catch (InterruptedException interruptedException) {
        Zah.Zl(interruptedException, Zk_.IGNORED);
        Thread.currentThread().interrupt();
      }  
    Zb.Zp(Zds.DEBUG, a(-7329, -32579), new Object[] { Integer.valueOf(list1.size()) });
  }
  
  private boolean ZF(TargetInfo paramTargetInfo) {
    return Objects.equals(paramTargetInfo.browserContextId, this.ZX.ZVJ());
  }
  
  void Zd(AttachedToTarget paramAttachedToTarget) {
    Zb.Zp(Zds.DEBUG, a(-7332, -11893), new Object[] { paramAttachedToTarget.targetInfo.type, paramAttachedToTarget.targetInfo.targetId, paramAttachedToTarget.sessionId, paramAttachedToTarget.waitingForDebugger });
    Zev zev = new Zev(paramAttachedToTarget.targetInfo.targetId);
    Zd zd = Zd.Zu(paramAttachedToTarget.sessionId);
    CompletableFuture<Zjw> completableFuture = null;
    if (a(-7335, -3364).equals(paramAttachedToTarget.targetInfo.type)) {
      completableFuture = new CompletableFuture();
      this.Ze.ZD(Zez.ZL(zev, zd, completableFuture));
    } 
    try {
      Zf zf = this.Zq.ZH(paramAttachedToTarget.targetInfo, zd);
      try {
        if (completableFuture != null)
          completableFuture.complete((Zjw)zf); 
      } catch (Zp zp) {
        throw a(null);
      } 
    } catch (Zp|Z_ zp) {
      try {
        Zah.Zl((Throwable)zp, Zk_.IGNORED);
        Zb.Zp(Zds.DEBUG, a(-7341, 2951), new Object[] { zp.getMessage() });
        if (completableFuture != null)
          completableFuture.completeExceptionally((Throwable)zp); 
      } catch (Zp zp1) {
        throw a(null);
      } 
    } catch (Exception exception) {
      try {
        Zah.Zl(exception, Zk_.UNEXPECTED);
        Zb.Zp(Zds.ERROR, a(-7343, -31810), new Object[] { exception.getMessage(), zev });
        this.Zl.Zg(Zk.ZA(zev::lambda$targetAttached$7), Zy.ZX());
        if (completableFuture != null)
          completableFuture.completeExceptionally(exception); 
      } catch (Zp zp) {
        throw a(null);
      } 
    } 
  }
  
  private static CompletableFuture lambda$targetAttached$7(Zev paramZev, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getTarget().closeTarget(paramZev.ZB3());
  }
  
  private static Zev lambda$initialise$6(TargetInfo paramTargetInfo) {
    return new Zev(paramTargetInfo.targetId);
  }
  
  private static CompletableFuture lambda$initialise$5(List paramList, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getTarget().getTargets(paramList);
  }
  
  private Zs lambda$initialise$4(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    Objects.requireNonNull(this.Zq);
    return paramChromeDevTools.getTarget().onTargetCrashed(this.Zq::Zl);
  }
  
  private Zs lambda$initialise$3(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    Objects.requireNonNull(this.Zq);
    return paramChromeDevTools.getTarget().onDetachedFromTarget(this.Zq::Zv);
  }
  
  private Zs lambda$preventDownloads$2(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    return paramChromeDevTools.getBrowser().onDownloadProgress(this::lambda$preventDownloads$1);
  }
  
  private void lambda$preventDownloads$1(DownloadProgress paramDownloadProgress) {
    try {
      if (paramDownloadProgress.state == DownloadProgressState.CANCELED)
        this.Ze.ZD(Zck.ZF); 
    } catch (Ze1 ze1) {
      throw a(null);
    } 
  }
  
  private CompletableFuture lambda$preventDownloads$0(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getBrowser().setDownloadBehavior(SetDownloadBehaviorBehavior.DENY, this.ZX.ZVJ(), null, Boolean.valueOf(true));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ñý×%9{&Dßåßf]ôÎTAö»8x\\bÛ§¯Áº&×Ó¥J&î âú´TX1×Îú`ûnó¨ÈPT1·D\ÁU å°èµkÀ7-2s#Å"#"½í¿¯-ð×úá¡;!~éúÍá@Ü|8¦ì2yÕKk'1|ÅÐÓúÏ%"Fs÷N°Ð\\tYI&RãOÂEf¿xûô6D=1²A^§kÕJi-¼>ÆsíÉã7KïÏ÷ó%@ÑfØëQ{ÚðòkúwÎ3 :0¾§úß{4ßìÂRù%\\fê=&Äqz<øiÂÙü¾ÉoÏ§$ß Ä÷k^Ý<«'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #47
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc 'ê©2½Ã5icw{®¡½(ABØ»9!1ðKÜtnÍþÕhdUz\\f0-öß6_Ò!m=Ð"¶1ýp\\rfp+;ÿñÕ¹ä½Öo5ä­fû'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #66
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #122
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
    //   128: putstatic net/portswigger/devtools/client/impl/Zml.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic net/portswigger/devtools/client/impl/Zml.b : [Ljava/lang/String;
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
    //   212: bipush #59
    //   214: goto -> 244
    //   217: bipush #24
    //   219: goto -> 244
    //   222: bipush #93
    //   224: goto -> 244
    //   227: bipush #123
    //   229: goto -> 244
    //   232: bipush #31
    //   234: goto -> 244
    //   237: bipush #16
    //   239: goto -> 244
    //   242: bipush #97
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE359) & 0xFFFF;
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
      char c = 'æ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zml.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */