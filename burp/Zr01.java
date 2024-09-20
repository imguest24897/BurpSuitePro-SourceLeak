package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.scanner.audit.issues.AuditIssue;
import burp.api.montoya.sitemap.SiteMap;
import burp.api.montoya.sitemap.SiteMapFilter;
import burp.api.montoya.sitemap.SiteMapNode;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.swing.SwingUtilities;

public class Zr01 implements SiteMap {
  private final Zeot ZZ;
  
  private final Zrny Zk;
  
  private final Zmz6 ZQ;
  
  private final Zr_4 Za;
  
  private final Zbnt Zn;
  
  private final Ztwv Zc;
  
  private final Zkl6 Zu;
  
  private final Zeu1 ZC;
  
  private final Zskl Zt;
  
  private final Zm6x Zy;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zr01(Zeot paramZeot, Zrny paramZrny, Zmz6 paramZmz6, Zr_4 paramZr_4, Zbnt paramZbnt, Ztwv paramZtwv, Zkl6 paramZkl6, Zeu1 paramZeu1, Zskl paramZskl, Zm6x paramZm6x) {
    this.ZZ = paramZeot;
    this.Zk = paramZrny;
    this.ZQ = paramZmz6;
    this.Za = paramZr_4;
    this.Zn = paramZbnt;
    this.Zc = paramZtwv;
    this.Zu = paramZkl6;
    this.ZC = paramZeu1;
    this.Zt = paramZskl;
    this.Zy = paramZm6x;
  }
  
  public List<HttpRequestResponse> requestResponses(SiteMapFilter paramSiteMapFilter) {
    Zgmq zgmq = new Zgmq(paramSiteMapFilter);
    Objects.requireNonNull(this.Zt);
    return (List<HttpRequestResponse>)this.ZZ.Zn(zgmq).stream().map(this.Zt::Zh).collect(Collectors.toList());
  }
  
  public List<HttpRequestResponse> requestResponses() {
    return requestResponses(Zr01::lambda$requestResponses$0);
  }
  
  public List<AuditIssue> issues(SiteMapFilter paramSiteMapFilter) {
    Zgm2 zgm2 = new Zgm2(paramSiteMapFilter);
    return (List<AuditIssue>)this.Zk.Zs(zgm2).stream().map(this::lambda$issues$1).collect(Collectors.toList());
  }
  
  public List<AuditIssue> issues() {
    return issues(Zr01::lambda$requestResponses$0);
  }
  
  public void add(HttpRequestResponse paramHttpRequestResponse) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface request : ()Lburp/api/montoya/http/message/requests/HttpRequest;
    //   6: astore_3
    //   7: invokestatic Zf : ()Ljava/lang/String;
    //   10: aload_1
    //   11: invokeinterface response : ()Lburp/api/montoya/http/message/responses/HttpResponse;
    //   16: astore #4
    //   18: astore_2
    //   19: aload_3
    //   20: invokeinterface httpService : ()Lburp/api/montoya/http/HttpService;
    //   25: astore #5
    //   27: aload #5
    //   29: ifnonnull -> 53
    //   32: new java/lang/IllegalStateException
    //   35: dup
    //   36: sipush #-24261
    //   39: sipush #5199
    //   42: invokestatic a : (II)Ljava/lang/String;
    //   45: invokespecial <init> : (Ljava/lang/String;)V
    //   48: athrow
    //   49: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   52: athrow
    //   53: aload #5
    //   55: aload_0
    //   56: getfield Zn : Lburp/Zbnt;
    //   59: invokestatic Zm : (Lburp/api/montoya/http/HttpService;Lburp/Zbnt;)Lburp/Zmzk;
    //   62: astore #6
    //   64: aload_3
    //   65: invokeinterface toByteArray : ()Lburp/api/montoya/core/ByteArray;
    //   70: astore #7
    //   72: aload #7
    //   74: ifnonnull -> 85
    //   77: aconst_null
    //   78: goto -> 90
    //   81: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   84: athrow
    //   85: aload #7
    //   87: invokestatic Zw : (Lburp/api/montoya/core/ByteArray;)Lburp/Zstu;
    //   90: astore #8
    //   92: aload #4
    //   94: ifnonnull -> 105
    //   97: aconst_null
    //   98: goto -> 112
    //   101: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   104: athrow
    //   105: aload #4
    //   107: invokeinterface toByteArray : ()Lburp/api/montoya/core/ByteArray;
    //   112: astore #9
    //   114: aload #9
    //   116: ifnonnull -> 127
    //   119: aconst_null
    //   120: goto -> 132
    //   123: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   126: athrow
    //   127: aload #9
    //   129: invokestatic Zw : (Lburp/api/montoya/core/ByteArray;)Lburp/Zstu;
    //   132: astore #10
    //   134: aload_1
    //   135: invokeinterface annotations : ()Lburp/api/montoya/core/Annotations;
    //   140: astore #11
    //   142: aload #11
    //   144: invokeinterface highlightColor : ()Lburp/api/montoya/core/HighlightColor;
    //   149: invokestatic ZA : (Lburp/api/montoya/core/HighlightColor;)Lburp/Zmtd;
    //   152: astore #12
    //   154: aload_0
    //   155: aload #6
    //   157: aload #8
    //   159: aload #10
    //   161: aload #11
    //   163: aload #12
    //   165: <illegal opcode> run : (Lburp/Zr01;Lburp/Zmzk;Lburp/Zstu;Lburp/Zstu;Lburp/api/montoya/core/Annotations;Lburp/Zmtd;)Ljava/lang/Runnable;
    //   170: astore #13
    //   172: invokestatic isEventDispatchThread : ()Z
    //   175: ifeq -> 201
    //   178: aload_0
    //   179: getfield Zc : Lburp/Ztwv;
    //   182: aload #13
    //   184: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   189: pop
    //   190: aload_2
    //   191: ifnonnull -> 215
    //   194: goto -> 201
    //   197: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   200: athrow
    //   201: aload #13
    //   203: invokeinterface run : ()V
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   214: athrow
    //   215: goto -> 247
    //   218: astore #6
    //   220: aload #6
    //   222: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   225: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   228: new java/lang/IllegalArgumentException
    //   231: dup
    //   232: sipush #-24263
    //   235: sipush #-26446
    //   238: invokestatic a : (II)Ljava/lang/String;
    //   241: aload #6
    //   243: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   246: athrow
    //   247: invokestatic Zwu : ()[Lburp/Zbqc;
    //   250: ifnonnull -> 265
    //   253: ldc 'LGWvqb'
    //   255: invokestatic ZB : (Ljava/lang/String;)V
    //   258: goto -> 265
    //   261: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   264: athrow
    //   265: return
    // Exception table:
    //   from	to	target	type
    //   27	49	49	java/lang/Throwable
    //   53	215	218	java/lang/Throwable
    //   72	81	81	java/lang/Throwable
    //   92	101	101	java/lang/Throwable
    //   114	123	123	java/lang/Throwable
    //   172	194	197	java/lang/Throwable
    //   178	208	211	java/lang/Throwable
    //   247	258	261	java/lang/Throwable
  }
  
  public void add(AuditIssue paramAuditIssue) {
    String str = Zzls.Zf();
    try {
      if (paramAuditIssue == null)
        throw new IllegalArgumentException(a(-24264, -17238)); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Zr85 zr85 = new Zr85(new Zwm(this.ZC.ZN(), paramAuditIssue, this.Zn, this.Za), this.ZQ);
    try {
      if (SwingUtilities.isEventDispatchThread()) {
        try {
          this.Zc.Zx(zr85);
          if (str == null) {
            zr85.run();
            return;
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    zr85.run();
  }
  
  private void lambda$add$3(Zmzk paramZmzk, Zstu paramZstu1, Zstu paramZstu2, Annotations paramAnnotations, Zmtd paramZmtd) {
    this.ZZ.Zj(paramZmzk, paramZstu1, paramZstu2, paramAnnotations.notes(), paramZmtd.name);
  }
  
  private Zkf_ lambda$issues$1(Zrdb paramZrdb) {
    return new Zkf_(paramZrdb, this.Zu, this.Zt, this.Zy);
  }
  
  private static boolean lambda$requestResponses$0(SiteMapNode paramSiteMapNode) {
    return true;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ô¥vIé£¡  ¿Ú®¶]¡óR£¹P;20O_×é[ªlb÷nöÇ möy)\\r[Ô:î¬èb {>ÑÛ­ø|\\bÛ´=Yy°ºV?õÕÊ-±b*`êO-`©h"½¤:X¶¹vÚÝ$ (¢'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #15
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #46
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
    //   69: putstatic burp/Zr01.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zr01.b : [Ljava/lang/String;
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
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #48
    //   154: goto -> 183
    //   157: bipush #108
    //   159: goto -> 183
    //   162: bipush #19
    //   164: goto -> 183
    //   167: bipush #89
    //   169: goto -> 183
    //   172: bipush #122
    //   174: goto -> 183
    //   177: bipush #110
    //   179: goto -> 183
    //   182: iconst_4
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
    int i = (paramInt1 ^ 0xFFFFA139) & 0xFFFF;
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
      char c = 'Ü';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr01.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */