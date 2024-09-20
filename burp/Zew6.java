package burp;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import net.portswigger.javatooling.api.JavadocNode;
import net.portswigger.javatooling.api.JavadocTag;
import org.jetbrains.annotations.NotNull;

public class Zew6 {
  private static boolean ZF;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static String ZU(JavadocNode paramJavadocNode, Supplier<Zznc> paramSupplier) {
    if (paramJavadocNode == null)
      return null; 
    Zdz zdz = new Zdz(paramSupplier);
    Objects.requireNonNull(zdz);
    paramJavadocNode.children().forEach(zdz::ZF);
    return Z_(zdz.Zn(), paramSupplier);
  }
  
  private static String Z_(String paramString, Supplier<Zznc> paramSupplier) {
    return ZV(ZU(paramString), paramSupplier);
  }
  
  private static String ZU(String paramString) {
    return paramString.replaceAll(a(23073, -12232), a(23087, 15549)).replaceAll(a(23075, -21853), a(23086, -32402));
  }
  
  private static String ZV(String paramString, Supplier<Zznc> paramSupplier) {
    return paramString.replaceAll(a(23076, 8428), a(23079, -32287).formatted(new Object[] { ((Zznc)paramSupplier.get()).Zp() })).replaceAll(a(23085, -19547), a(23077, 12921).formatted(new Object[] { ((Zznc)paramSupplier.get()).Zp() }));
  }
  
  private static String ZZ(JavadocNode paramJavadocNode, Supplier<Zznc> paramSupplier) {
    StringBuilder stringBuilder = new StringBuilder();
    Zg(paramJavadocNode, stringBuilder, paramSupplier);
    return stringBuilder.toString();
  }
  
  private static void Zg(JavadocNode paramJavadocNode, StringBuilder paramStringBuilder, Supplier<Zznc> paramSupplier) {
    // Byte code:
    //   0: invokestatic ZT : ()Z
    //   3: istore_3
    //   4: aload_0
    //   5: invokevirtual isLeaf : ()Z
    //   8: ifeq -> 38
    //   11: aload_1
    //   12: invokevirtual isEmpty : ()Z
    //   15: ifne -> 25
    //   18: aload_1
    //   19: bipush #10
    //   21: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   24: pop
    //   25: aload_1
    //   26: aload_0
    //   27: invokevirtual text : ()Ljava/lang/String;
    //   30: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: pop
    //   34: iload_3
    //   35: ifne -> 61
    //   38: aload_0
    //   39: invokevirtual tag : ()Ljava/util/Optional;
    //   42: aload_1
    //   43: aload_2
    //   44: aload_0
    //   45: <illegal opcode> accept : (Ljava/lang/StringBuilder;Ljava/util/function/Supplier;Lnet/portswigger/javatooling/api/JavadocNode;)Ljava/util/function/Consumer;
    //   50: aload_1
    //   51: aload_0
    //   52: aload_2
    //   53: <illegal opcode> run : (Ljava/lang/StringBuilder;Lnet/portswigger/javatooling/api/JavadocNode;Ljava/util/function/Supplier;)Ljava/lang/Runnable;
    //   58: invokevirtual ifPresentOrElse : (Ljava/util/function/Consumer;Ljava/lang/Runnable;)V
    //   61: return
  }
  
  @NotNull
  private static String Zx(List<JavadocNode> paramList, Supplier<Zznc> paramSupplier) {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<JavadocNode> iterator = paramList.iterator();
    boolean bool = ZT();
    while (iterator.hasNext()) {
      JavadocNode javadocNode = iterator.next();
      Zg(javadocNode, stringBuilder, paramSupplier);
      if (!bool)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  private static void lambda$formatAsHtml$1(StringBuilder paramStringBuilder, JavadocNode paramJavadocNode, Supplier<Zznc> paramSupplier) {
    paramStringBuilder.append(Zx(paramJavadocNode.children(), paramSupplier));
  }
  
  private static void lambda$formatAsHtml$0(StringBuilder paramStringBuilder, Supplier<Zznc> paramSupplier, JavadocNode paramJavadocNode, JavadocTag paramJavadocTag) {
    boolean bool = ZT();
    switch (Zb0x.Zm[paramJavadocTag.ordinal()]) {
      case 24:
      case 25:
      case 26:
      case 27:
        paramStringBuilder.append(a(23074, 1015).formatted(new Object[] { ((Zznc)paramSupplier.get()).Zp(), Zl6r.ZA(Zx(paramJavadocNode.children(), paramSupplier), a(23072, -11545), false) }));
        if (!bool);
        return;
      case 28:
        paramStringBuilder.append(Zl6r.ZA(Zx(paramJavadocNode.children(), paramSupplier), a(23078, 1293), false));
        if (!bool);
        return;
      case 29:
        paramStringBuilder.append(Zx(paramJavadocNode.children().stream().limit(1L).toList(), paramSupplier));
        if (!bool);
        return;
      case 30:
        if (!bool)
          break; 
        return;
    } 
    paramStringBuilder.append(Zx(paramJavadocNode.children(), paramSupplier));
  }
  
  public static void Zb(boolean paramBoolean) {
    ZF = paramBoolean;
  }
  
  public static boolean ZT() {
    return ZF;
  }
  
  public static boolean ZS() {
    boolean bool = ZT();
    return !bool;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_1
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc '7"´îÿ¹D1'kôI/5î:MòÚ,ãz1¹*å/pq>¼ªéèèKuãuw/T-á%58E-B È;ÓS|WÂ×=·û7NãRL'¢7®ô=ïi¯qð\@/jÄ÷f-Uò~4Erb)êXC·Æø ´Ë9öÄ.00Yw[c<\\f¦C*\ñê·©vÉç?KèÁÖ6ã*lÖ0a«ÉÏikÂÖ^)»'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic Zb : (Z)V
    //   22: bipush #6
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #71
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 146
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc '©©Þ(u@=ÊHYüáú(í(\\b£dyaf`fq¢w6þCÄÉbÔ°u'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: iconst_4
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #120
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
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
    //   132: putstatic burp/Zew6.a : [Ljava/lang/String;
    //   135: bipush #11
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zew6.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #22
    //   218: goto -> 248
    //   221: bipush #22
    //   223: goto -> 248
    //   226: bipush #31
    //   228: goto -> 248
    //   231: bipush #123
    //   233: goto -> 248
    //   236: bipush #127
    //   238: goto -> 248
    //   241: bipush #69
    //   243: goto -> 248
    //   246: bipush #124
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 102
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5A27) & 0xFFFF;
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
      byte b1 = 110;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zew6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */