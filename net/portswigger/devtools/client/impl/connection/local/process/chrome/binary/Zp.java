package net.portswigger.devtools.client.impl.connection.local.process.chrome.binary;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Properties;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.devtools.client.impl.connection.local.Zd;

public class Zp {
  public static final String ZG;
  
  public final List<Ze> Zv;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Optional<Zp> ZZ(Path paramPath, Consumer<String> paramConsumer) {
    File file = paramPath.resolve(a(16538, -9336)).toFile();
    try {
      return Optional.of(new Zp(file));
    } catch (Zd zd) {
      Zah.Zl((Throwable)zd, Zk_.IGNORED);
      paramConsumer.accept(zd.getMessage());
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
      paramConsumer.accept(a(16539, 19876) + a(16539, 19876));
    } 
    return Optional.empty();
  }
  
  Zp(File paramFile) throws IOException, Zd {
    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(paramFile));
    try {
      Properties properties = new Properties();
      properties.load(bufferedInputStream);
      this.Zv = Ze(properties);
      bufferedInputStream.close();
    } catch (Throwable throwable) {
      try {
        bufferedInputStream.close();
      } catch (Throwable throwable1) {
        throwable.addSuppressed(throwable1);
      } 
      throw throwable;
    } 
  }
  
  Optional<Ze> ZE(String paramString) {
    return this.Zv.stream().filter(paramString::lambda$findFileDetailsByPath$0).findFirst();
  }
  
  public List<Ze> Zi() {
    return (List<Ze>)this.Zv.stream().filter(Ze::ZH).collect(Collectors.toList());
  }
  
  private static String ZU(String paramString) {
    return paramString.replace('\\', '/');
  }
  
  private List<Ze> Ze(Properties paramProperties) throws Zd {
    ArrayList<Ze> arrayList = new ArrayList();
    Iterator<Map.Entry<Object, Object>> iterator = paramProperties.entrySet().iterator();
    String str = DevtoolsBinariesInfo.ZW();
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      arrayList.add(Ze.Ze((String)entry.getKey(), (String)entry.getValue()));
      if (str == null)
        break; 
    } 
    return arrayList;
  }
  
  private static boolean lambda$findFileDetailsByPath$0(String paramString, Ze paramZe) {
    return Objects.equals(ZU(paramZe.Z_()), ZU(paramString));
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'f1®ÿ~kGKåÙüÀ½Ë«´R{uÖÜÂC'*H\\t w´~é+÷8k]èç´ª6$.'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #18
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #115
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 94
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
    //   69: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Zp.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Zp.b : [Ljava/lang/String;
    //   79: sipush #16537
    //   82: sipush #26700
    //   85: invokestatic a : (II)Ljava/lang/String;
    //   88: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Zp.ZG : Ljava/lang/String;
    //   91: goto -> 239
    //   94: dup_x2
    //   95: pop
    //   96: invokevirtual toCharArray : ()[C
    //   99: dup_x1
    //   100: arraylength
    //   101: dup_x2
    //   102: pop
    //   103: iconst_0
    //   104: istore #6
    //   106: dup2_x1
    //   107: pop2
    //   108: dup_x2
    //   109: iconst_1
    //   110: if_icmpgt -> 212
    //   113: dup2
    //   114: swap
    //   115: iload #6
    //   117: dup2_x1
    //   118: caload
    //   119: swap
    //   120: iload #6
    //   122: bipush #7
    //   124: irem
    //   125: tableswitch default -> 194, 0 -> 164, 1 -> 169, 2 -> 174, 3 -> 179, 4 -> 184, 5 -> 189
    //   164: bipush #54
    //   166: goto -> 196
    //   169: bipush #60
    //   171: goto -> 196
    //   174: bipush #46
    //   176: goto -> 196
    //   179: bipush #116
    //   181: goto -> 196
    //   184: bipush #7
    //   186: goto -> 196
    //   189: bipush #116
    //   191: goto -> 196
    //   194: bipush #86
    //   196: ixor
    //   197: ixor
    //   198: i2c
    //   199: castore
    //   200: iinc #6, 1
    //   203: dup
    //   204: ifne -> 212
    //   207: dup2
    //   208: dup_x1
    //   209: goto -> 117
    //   212: dup2_x1
    //   213: pop2
    //   214: dup_x2
    //   215: iload #6
    //   217: if_icmpgt -> 113
    //   220: pop
    //   221: new java/lang/String
    //   224: dup_x1
    //   225: swap
    //   226: invokespecial <init> : ([C)V
    //   229: invokevirtual intern : ()Ljava/lang/String;
    //   232: swap
    //   233: pop
    //   234: swap
    //   235: pop
    //   236: goto -> 39
    //   239: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x409B) & 0xFFFF;
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
      char c = 'ä';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\connection\local\process\chrome\binary\Zp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */