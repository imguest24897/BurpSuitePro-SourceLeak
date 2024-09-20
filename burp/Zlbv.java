package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.Marker;
import burp.api.montoya.http.HttpService;
import burp.api.montoya.http.handler.TimingData;
import burp.api.montoya.http.message.ContentType;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.responses.HttpResponse;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Pattern;

public class Zlbv implements HttpRequestResponse, Proxyable {
  private final HttpRequest ZN;
  
  private final HttpResponse Zg;
  
  private final Annotations Zi;
  
  private final TimingData ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zlbv(HttpRequest paramHttpRequest, HttpResponse paramHttpResponse, Annotations paramAnnotations, TimingData paramTimingData) {
    this.ZN = paramHttpRequest;
    this.Zg = paramHttpResponse;
    this.Zi = paramAnnotations;
    this.ZW = paramTimingData;
  }
  
  public HttpRequest request() {
    return this.ZN;
  }
  
  public HttpResponse response() {
    return this.Zg;
  }
  
  public boolean hasResponse() {
    return (this.Zg != null);
  }
  
  public Annotations annotations() {
    return this.Zi;
  }
  
  public Optional<TimingData> timingData() {
    return Optional.ofNullable(this.ZW);
  }
  
  public String url() {
    return (this.ZN == null) ? null : this.ZN.url();
  }
  
  public HttpService httpService() {
    return (this.ZN == null) ? null : this.ZN.httpService();
  }
  
  public ContentType contentType() {
    return (this.ZN == null) ? ContentType.UNKNOWN : this.ZN.contentType();
  }
  
  public short statusCode() {
    return (this.Zg == null) ? -1 : this.Zg.statusCode();
  }
  
  public List<Marker> requestMarkers() {
    return (this.ZN == null) ? Collections.<Marker>emptyList() : this.ZN.markers();
  }
  
  public List<Marker> responseMarkers() {
    return (this.Zg == null) ? Collections.<Marker>emptyList() : this.Zg.markers();
  }
  
  public boolean contains(String paramString, boolean paramBoolean) {
    boolean bool = paramBoolean ? ((this.Zi != null && Zsw8.ZY(this.Zi.notes(), paramString)) ? true : false) : ((this.Zi != null && Zsw8.ZK(this.Zi.notes(), paramString)) ? true : false);
    return (bool || (this.ZN != null && this.ZN.contains(paramString, paramBoolean)) || (this.Zg != null && this.Zg.contains(paramString, paramBoolean)));
  }
  
  public boolean contains(Pattern paramPattern) {
    return ((this.Zi != null && Zsw8.ZC(this.Zi.notes(), paramPattern)) || (this.ZN != null && this.ZN.contains(paramPattern)) || (this.Zg != null && this.Zg.contains(paramPattern)));
  }
  
  public HttpRequestResponse copyToTempFile() {
    return new Zlbv((this.ZN == null) ? null : this.ZN.copyToTempFile(), (this.Zg == null) ? null : this.Zg.copyToTempFile(), (this.Zi == null) ? null : Zs9n.ZJ(this.Zi.notes(), this.Zi.highlightColor()), this.ZW);
  }
  
  public HttpRequestResponse withAnnotations(Annotations paramAnnotations) {
    return ZF(this.ZN, this.Zg, paramAnnotations, this.ZW);
  }
  
  public HttpRequestResponse withRequestMarkers(List<Marker> paramList) {
    return ZF(Za(paramList), this.Zg, this.Zi, this.ZW);
  }
  
  public HttpRequestResponse withRequestMarkers(Marker... paramVarArgs) {
    return withRequestMarkers(List.of(paramVarArgs));
  }
  
  public HttpRequestResponse withResponseMarkers(List<Marker> paramList) {
    return ZF(this.ZN, ZN(paramList), this.Zi, this.ZW);
  }
  
  public HttpRequestResponse withResponseMarkers(Marker... paramVarArgs) {
    return withResponseMarkers(List.of(paramVarArgs));
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zlbv zlbv = (Zlbv)paramObject;
    return (Objects.equals(this.ZN, zlbv.ZN) && Objects.equals(this.Zg, zlbv.Zg) && Objects.equals(this.Zi, zlbv.Zi) && Objects.equals(this.ZW, zlbv.ZW));
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.ZN, this.Zg, this.Zi, this.ZW });
  }
  
  public String toString() {
    String str1 = String.valueOf(this.Zi);
    String str2 = String.valueOf(this.Zg);
    String str3 = String.valueOf(this.ZN);
    return a(-31835, -18841) + a(-31835, -18841) + str3 + a(-31833, -18780) + str2 + a(-31834, 31563) + str1;
  }
  
  private HttpRequest Za(List<Marker> paramList) {
    return (this.ZN == null) ? null : this.ZN.withMarkers(paramList);
  }
  
  private HttpResponse ZN(List<Marker> paramList) {
    return (this.Zg == null) ? null : this.Zg.withMarkers(paramList);
  }
  
  static HttpRequestResponse Zn(HttpRequest paramHttpRequest, HttpResponse paramHttpResponse, Annotations paramAnnotations) {
    return new Zlbv(paramHttpRequest, paramHttpResponse, paramAnnotations, null);
  }
  
  static HttpRequestResponse ZF(HttpRequest paramHttpRequest, HttpResponse paramHttpResponse, Annotations paramAnnotations, TimingData paramTimingData) {
    return new Zlbv(paramHttpRequest, paramHttpResponse, paramAnnotations, paramTimingData);
  }
  
  static HttpRequestResponse Zj(IHttpRequestResponse paramIHttpRequestResponse, Zbnt paramZbnt, Zr_4 paramZr_4, Zey9 paramZey9, Zslu paramZslu) {
    if (paramIHttpRequestResponse == null)
      return null; 
    Zmzk zmzk = Zb28.Zs(paramIHttpRequestResponse.getHttpService(), paramZbnt);
    HttpRequest httpRequest = null;
    HttpResponse httpResponse = null;
    if (paramIHttpRequestResponse instanceof Zm0b) {
      Zm0b zm0b = (Zm0b)paramIHttpRequestResponse;
      Zstu zstu = zm0b.Zo();
      if (zstu != null) {
        Zbr zbr = Zbr.Zy(zstu, Zkyt.UNKNOWN);
        Zefx zefx = zbr.ZP(zmzk, paramZey9);
        Zstu zstu1 = zm0b.Zz();
        Zbpg zbpg = new Zbpg(paramZbnt, paramZr_4, paramZey9, paramZslu);
        zefx.Zi(zbpg);
        httpRequest = zbpg.ZD;
        httpResponse = Zgtr.Zk(zstu1, paramZbnt, paramZr_4);
      } 
    } 
    if (httpRequest == null) {
      httpRequest = Zsia.ZJ(zmzk, paramIHttpRequestResponse.getRequest(), paramZbnt, paramZr_4, paramZey9, paramZslu);
      httpResponse = Zgtr.ZW(paramIHttpRequestResponse.getResponse(), paramZbnt, paramZr_4);
    } 
    if (paramIHttpRequestResponse instanceof IHttpRequestResponseWithMarkers) {
      IHttpRequestResponseWithMarkers iHttpRequestResponseWithMarkers = (IHttpRequestResponseWithMarkers)paramIHttpRequestResponse;
      httpRequest = httpRequest.withMarkers(Zl_3.Zr(iHttpRequestResponseWithMarkers.getRequestMarkers()));
      httpResponse = (httpResponse == null) ? null : httpResponse.withMarkers(Zl_3.Zr(iHttpRequestResponseWithMarkers.getResponseMarkers()));
    } 
    Annotations annotations = Zs9n.Zj(paramIHttpRequestResponse);
    return Zn(httpRequest, httpResponse, annotations);
  }
  
  static HttpRequestResponse ZD(Zmfj paramZmfj, Zbnt paramZbnt, Zr_4 paramZr_4, Zey9 paramZey9, Zslu paramZslu) {
    HttpRequest httpRequest = Zsia.ZJ(paramZmfj.Zs(), paramZmfj.Zp(), paramZbnt, paramZr_4, paramZey9, paramZslu);
    HttpResponse httpResponse = Zgtr.ZW(paramZmfj.ZM(), paramZbnt, paramZr_4);
    if (paramZmfj instanceof Zzu7) {
      Zzu7 zzu7 = (Zzu7)paramZmfj;
      httpRequest = httpRequest.withMarkers(Zl_3.Zr(zzu7.Zx()));
      httpResponse = (httpResponse == null) ? null : httpResponse.withMarkers(Zl_3.Zr(zzu7.Zv()));
    } 
    Annotations annotations = Zs9n.ZW(paramZmfj);
    return Zn(httpRequest, httpResponse, annotations);
  }
  
  static HttpRequestResponse ZF(Zefx paramZefx, byte[] paramArrayOfbyte, Zbnt paramZbnt, Zr_4 paramZr_4, Zey9 paramZey9, Zslu paramZslu) {
    HttpRequest httpRequest = Zsia.Zu(paramZefx, paramZbnt, paramZr_4, paramZey9, paramZslu);
    Zgtr zgtr = Zgtr.ZW(paramArrayOfbyte, paramZbnt, paramZr_4);
    return Zn(httpRequest, zgtr, Zs9n.ZQ());
  }
  
  static HttpRequestResponse ZR(Zmzk paramZmzk, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, Zbnt paramZbnt, Zr_4 paramZr_4, Zey9 paramZey9, Zslu paramZslu) {
    Zztj zztj = Zsia.ZJ(paramZmzk, paramArrayOfbyte1, paramZbnt, paramZr_4, paramZey9, paramZslu);
    Zgtr zgtr = Zgtr.ZW(paramArrayOfbyte2, paramZbnt, paramZr_4);
    return Zn(zztj, zgtr, Zs9n.ZQ());
  }
  
  static HttpRequestResponse Zx(Zsxd paramZsxd, Zbnt paramZbnt, Zr_4 paramZr_4, Zey9 paramZey9, Zslu paramZslu, TimingData paramTimingData) {
    Zg3d zg3d = paramZsxd.Zz();
    Zefx zefx = (zg3d.ZL() == null) ? zg3d.ZR() : zg3d.ZL();
    Zb6q zb6q = paramZsxd.ZG().Ze();
    HttpRequest httpRequest = Zsie.Zu(zefx, paramZbnt, paramZr_4, paramZey9, paramZslu);
    HttpResponse httpResponse = (zb6q == null) ? null : Zgtr.Zx(zb6q.Za().ZiD(), paramZbnt, paramZr_4);
    return ZF(httpRequest, httpResponse, Zs9n.ZJ(paramZsxd.ZZ(), Zt6v.ZO(Zmtd.ZC(paramZsxd.Zn()))), paramTimingData);
  }
  
  static HttpRequestResponse ZI(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, Zbnt paramZbnt, Zr_4 paramZr_4, Zey9 paramZey9, Zslu paramZslu) {
    HttpRequest httpRequest = Zsia.Ze(paramString, paramInt, paramBoolean, paramArrayOfbyte1, paramZbnt, paramZr_4, paramZey9, paramZslu);
    HttpResponse httpResponse = Zgtr.Zx(paramArrayOfbyte2, paramZbnt, paramZr_4);
    return Zn(httpRequest, httpResponse, Zs9n.ZQ());
  }
  
  public static HttpRequestResponse ZF(Zkg1 paramZkg1, Zbnt paramZbnt, Zr_4 paramZr_4, Zey9 paramZey9, Zslu paramZslu) {
    byte[] arrayOfByte1 = (paramZkg1.Zos() == null) ? null : paramZkg1.Zos().ZiD();
    byte[] arrayOfByte2 = (paramZkg1.ZoO() == null) ? null : paramZkg1.ZoO().ZiD();
    return ZR(paramZkg1.Zod(), arrayOfByte1, arrayOfByte2, paramZbnt, paramZr_4, paramZey9, paramZslu);
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'H+Í¾yëO9÷ýEíópB£\\rCIiÀÀK\\b$ d» DÔ®øâWø+6àã mw¡ÂC¯É <±'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #15
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #26
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
    //   69: putstatic burp/Zlbv.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zlbv.b : [Ljava/lang/String;
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
    //   152: bipush #96
    //   154: goto -> 184
    //   157: bipush #46
    //   159: goto -> 184
    //   162: bipush #60
    //   164: goto -> 184
    //   167: bipush #8
    //   169: goto -> 184
    //   172: bipush #20
    //   174: goto -> 184
    //   177: bipush #18
    //   179: goto -> 184
    //   182: bipush #79
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
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF83A7) & 0xFFFF;
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
      char c = '¨';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlbv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */