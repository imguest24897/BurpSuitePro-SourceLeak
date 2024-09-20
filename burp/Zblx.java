package burp;

import burp.api.montoya.collaborator.SecretKey;
import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.HighlightColor;
import burp.api.montoya.core.Marker;
import burp.api.montoya.core.ToolType;
import burp.api.montoya.http.HttpMode;
import burp.api.montoya.http.HttpService;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.proxy.MessageReceivedAction;
import burp.api.montoya.proxy.MessageToBeSentAction;
import burp.api.montoya.scanner.ReportFormat;
import burp.api.montoya.scanner.audit.issues.AuditIssueConfidence;
import burp.api.montoya.scanner.audit.issues.AuditIssueSeverity;
import burp.api.montoya.websocket.Direction;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zblx {
  private static Zbqc[] Zp;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zmzk Zm(HttpService paramHttpService, Zbnt paramZbnt) {
    try {
      try {
      
      } catch (Zxgy zxgy) {
        throw a(null);
      } 
      return (paramHttpService == null) ? null : paramZbnt.ZY(paramHttpService.host(), paramHttpService.port(), paramHttpService.secure());
    } catch (Zxgy|Zxg5 zxgy) {
      Zah.Zl(zxgy, Zk_.IGNORED);
      throw new IllegalArgumentException(a(-31268, -29020));
    } 
  }
  
  public static Zefx ZW(HttpRequest paramHttpRequest, Zbnt paramZbnt, Zey9 paramZey9) {
    try {
      if (paramHttpRequest == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zuh.Zb(paramHttpRequest instanceof Proxyable, Zqf.Zk);
    if (paramHttpRequest instanceof Proxyable) {
      Proxyable proxyable = (Proxyable)paramHttpRequest;
      Object object = proxyable.proxiedObject();
      if (object instanceof Zsik) {
        Zsik zsik = (Zsik)object;
        return zsik.ZE();
      } 
    } 
    return paramZey9.Zu(Zm(paramHttpRequest.httpService(), paramZbnt), Zw(paramHttpRequest.toByteArray()));
  }
  
  public static Zmtd ZA(HighlightColor paramHighlightColor) {
    try {
      if (paramHighlightColor == null)
        return Zmtd.NONE; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      switch (Zzp.Zx[paramHighlightColor.ordinal()]) {
        default:
          throw new MatchException(null, null);
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
          break;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Zmtd.NONE;
  }
  
  public static int ZY(MessageReceivedAction paramMessageReceivedAction) {
    try {
      if (paramMessageReceivedAction == null)
        return 0; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      switch (Zzp.Zs[paramMessageReceivedAction.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
          break;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return 0;
  }
  
  public static int Zp(MessageToBeSentAction paramMessageToBeSentAction) {
    try {
      if (paramMessageToBeSentAction == null)
        return 2; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      switch (Zzp.ZJ[paramMessageToBeSentAction.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
          break;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return 2;
  }
  
  public static Ze3o ZY(Direction paramDirection) {
    try {
      if (paramDirection == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      switch (Zzp.Zt[paramDirection.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
          break;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Ze3o.CLIENT_TO_SERVER;
  }
  
  public static Zeew Ze(ToolType paramToolType) {
    try {
      if (paramToolType == null)
        throw new IllegalArgumentException(a(-31265, -1139)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      switch (Zzp.ZR[paramToolType.ordinal()]) {
        default:
          throw new MatchException(null, null);
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
          break;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Zeew.ORGANISER;
  }
  
  public static byte Z_(AuditIssueSeverity paramAuditIssueSeverity) {
    try {
      if (paramAuditIssueSeverity == null)
        return 0; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      switch (Zzp.ZL[paramAuditIssueSeverity.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
          break;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return -1;
  }
  
  public static byte Zo(AuditIssueConfidence paramAuditIssueConfidence) {
    try {
      if (paramAuditIssueConfidence == null)
        return 0; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      switch (Zzp.Za[paramAuditIssueConfidence.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
          break;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return 1;
  }
  
  public static String ZK(ReportFormat paramReportFormat) {
    try {
      switch (Zzp.Zw[paramReportFormat.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
          break;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return a(-31267, 13428);
  }
  
  public static List<int[]> ZT(List<Marker> paramList) {
    try {
      if (paramList == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (List<int[]>)paramList.stream().filter(Objects::nonNull).map(Zblx::lambda$convertMarkers$0).collect(Collectors.toList());
  }
  
  public static Ze45 ZK(HttpMode paramHttpMode, String paramString) {
    try {
      if (paramHttpMode == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      switch (Zzp.ZP[paramHttpMode.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
          break;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramString != null) ? Ze45.FORCE_HTTP2 : Ze45.FORCE_HTTP2_NON_POOLED;
  }
  
  public static Optional<Zmtq> Zm(SecretKey paramSecretKey, Zr_4 paramZr_4) {
    byte[] arrayOfByte = Zw(paramSecretKey);
    try {
      if (arrayOfByte == null)
        return Optional.empty(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zziy zziy = paramZr_4.<Zziy>ZH(new Zlnw(arrayOfByte));
    return Optional.of(new Zmtq(zziy));
  }
  
  public static Zstu Zw(ByteArray paramByteArray) {
    try {
      if (paramByteArray == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte[] arrayOfByte = paramByteArray.getBytes();
    return Zyf.Zy(arrayOfByte);
  }
  
  private static byte[] Zw(SecretKey paramSecretKey) {
    try {
      if (paramSecretKey == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte[] arrayOfByte = ZW(paramSecretKey.toString());
    try {
      if (arrayOfByte == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (arrayOfByte.length != 32)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return arrayOfByte;
  }
  
  private static byte[] ZW(String paramString) {
    Base64.Decoder decoder = Base64.getDecoder();
    try {
      return decoder.decode(paramString);
    } catch (IllegalArgumentException illegalArgumentException) {
      Zah.Zl(illegalArgumentException, Zk_.IGNORED);
      return null;
    } 
  }
  
  public static Zt83 ZT(Annotations paramAnnotations) {
    Zmtd zmtd = ZA(paramAnnotations.highlightColor());
    return new Zt83(paramAnnotations.notes(), zmtd.index);
  }
  
  private static int[] lambda$convertMarkers$0(Marker paramMarker) {
    return new int[] { paramMarker.range().startIndexInclusive(), paramMarker.range().endIndexExclusive() };
  }
  
  public static void Zn(Zbqc[] paramArrayOfZbqc) {
    Zp = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zm() {
    return Zp;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: aconst_null
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '5ÜåÁ20ài|iïªÜ]4³Lk«}§9NCCQýúò)F8(jÐ@'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: invokestatic Zn : ([Lburp/Zbqc;)V
    //   21: bipush #47
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #98
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 144
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
    //   71: ldc '©<À@Qð@V\ã_GÈÍnð'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: iconst_3
    //   81: istore_1
    //   82: iconst_m1
    //   83: istore_0
    //   84: bipush #115
    //   86: iinc #0, 1
    //   89: aload_2
    //   90: iload_0
    //   91: dup
    //   92: iload_1
    //   93: iadd
    //   94: invokevirtual substring : (II)Ljava/lang/String;
    //   97: iconst_0
    //   98: goto -> 144
    //   101: aload #5
    //   103: swap
    //   104: iload_3
    //   105: iinc #3, 1
    //   108: swap
    //   109: aastore
    //   110: iload_0
    //   111: iload_1
    //   112: iadd
    //   113: dup
    //   114: istore_0
    //   115: iload #4
    //   117: if_icmpge -> 129
    //   120: aload_2
    //   121: iload_0
    //   122: invokevirtual charAt : (I)C
    //   125: istore_1
    //   126: goto -> 84
    //   129: aload #5
    //   131: putstatic burp/Zblx.a : [Ljava/lang/String;
    //   134: iconst_4
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zblx.b : [Ljava/lang/String;
    //   141: goto -> 300
    //   144: dup_x2
    //   145: pop
    //   146: invokevirtual toCharArray : ()[C
    //   149: dup_x1
    //   150: arraylength
    //   151: dup_x2
    //   152: pop
    //   153: iconst_0
    //   154: istore #6
    //   156: dup2_x1
    //   157: pop2
    //   158: dup_x2
    //   159: iconst_1
    //   160: if_icmpgt -> 260
    //   163: dup2
    //   164: swap
    //   165: iload #6
    //   167: dup2_x1
    //   168: caload
    //   169: swap
    //   170: iload #6
    //   172: bipush #7
    //   174: irem
    //   175: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #52
    //   214: goto -> 244
    //   217: bipush #116
    //   219: goto -> 244
    //   222: bipush #117
    //   224: goto -> 244
    //   227: bipush #59
    //   229: goto -> 244
    //   232: bipush #47
    //   234: goto -> 244
    //   237: bipush #10
    //   239: goto -> 244
    //   242: bipush #84
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 167
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 163
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 43, 0 -> 101
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF85DF) & 0xFFFF;
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
      byte b1 = 82;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zblx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */