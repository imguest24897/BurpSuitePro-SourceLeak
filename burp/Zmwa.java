package burp;

import java.util.List;
import java.util.function.Consumer;
import javax.swing.JMenuItem;

public class Zmwa {
  private final String ZV;
  
  private final String ZF;
  
  private final int Zu;
  
  private final Consumer<Ztj1> Zt;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zmwa ZA(String paramString, Consumer<Ztj1> paramConsumer) {
    return new Zmwa(a(-31923, 25028), paramString, 136448, paramConsumer);
  }
  
  public static Zmwa Zo(String paramString, Consumer<Ztj1> paramConsumer) {
    return new Zmwa(a(-31924, -12673), paramString, 136528, paramConsumer);
  }
  
  private Zmwa(String paramString1, String paramString2, int paramInt, Consumer<Ztj1> paramConsumer) {
    this.ZV = paramString1;
    this.ZF = paramString2;
    this.Zu = paramInt;
    this.Zt = paramConsumer;
  }
  
  public JMenuItem ZQ(Zrag paramZrag, Zerg paramZerg, Zzyl paramZzyl) {
    List<Ztj1> list = paramZrag.ZG(Zkcl.SCAN_AUDIT);
    if (!list.isEmpty())
      return Za(paramZzyl, paramZerg, list); 
  }
  
  private Zepk ZI(Zzyl paramZzyl) {
    Zepk zepk = Ztsr.Zx(paramZzyl, this.Zu, this.ZF);
    zepk.setName(this.ZV);
    return zepk;
  }
  
  private Zztv Za(Zzyl paramZzyl, Zerg paramZerg, List<Ztj1> paramList) {
    // Byte code:
    //   0: new burp/Zztv
    //   3: dup
    //   4: aload_0
    //   5: getfield ZF : Ljava/lang/String;
    //   8: invokespecial <init> : (Ljava/lang/String;)V
    //   11: astore #5
    //   13: invokestatic Zd : ()I
    //   16: aload_1
    //   17: aload_0
    //   18: getfield Zu : I
    //   21: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   24: astore #6
    //   26: aload #6
    //   28: aload_0
    //   29: getfield ZV : Ljava/lang/String;
    //   32: invokevirtual setName : (Ljava/lang/String;)V
    //   35: aload #5
    //   37: aload #6
    //   39: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   42: pop
    //   43: istore #4
    //   45: aload_3
    //   46: invokeinterface isEmpty : ()Z
    //   51: ifne -> 67
    //   54: aload #5
    //   56: new javax/swing/JPopupMenu$Separator
    //   59: dup
    //   60: invokespecial <init> : ()V
    //   63: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   66: pop
    //   67: aload_2
    //   68: invokevirtual Zk : ()Lburp/Zkrj;
    //   71: astore #7
    //   73: aload_3
    //   74: invokeinterface iterator : ()Ljava/util/Iterator;
    //   79: astore #8
    //   81: aload #8
    //   83: invokeinterface hasNext : ()Z
    //   88: ifeq -> 177
    //   91: aload #8
    //   93: invokeinterface next : ()Ljava/lang/Object;
    //   98: checkcast burp/Ztj1
    //   101: astore #9
    //   103: aload #9
    //   105: invokevirtual Zh : ()I
    //   108: aload #7
    //   110: invokevirtual ZF1 : ()I
    //   113: if_icmpeq -> 129
    //   116: aload #9
    //   118: invokevirtual Zh : ()I
    //   121: aload #7
    //   123: invokevirtual ZFo : ()I
    //   126: if_icmpne -> 153
    //   129: aload #5
    //   131: new burp/Zepr
    //   134: dup
    //   135: aload #9
    //   137: aload_0
    //   138: getfield Zt : Ljava/util/function/Consumer;
    //   141: invokespecial <init> : (Lburp/Ztj1;Ljava/util/function/Consumer;)V
    //   144: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   147: pop
    //   148: iload #4
    //   150: ifeq -> 172
    //   153: aload #5
    //   155: new burp/Zepg
    //   158: dup
    //   159: aload #9
    //   161: aload_0
    //   162: getfield Zt : Ljava/util/function/Consumer;
    //   165: invokespecial <init> : (Lburp/Ztj1;Ljava/util/function/Consumer;)V
    //   168: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   171: pop
    //   172: iload #4
    //   174: ifeq -> 81
    //   177: aload #5
    //   179: areturn
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '»ï'Î\\ràZiØ}«¼ÿªcJÀ-Kc.å1 øP,ãMÄká¯SEAaG÷Vi»a¹qB§âLn±Í AuÙá_ÎàÀo'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #31
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
    //   69: putstatic burp/Zmwa.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zmwa.b : [Ljava/lang/String;
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
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #8
    //   154: goto -> 183
    //   157: bipush #62
    //   159: goto -> 183
    //   162: bipush #93
    //   164: goto -> 183
    //   167: bipush #15
    //   169: goto -> 183
    //   172: bipush #51
    //   174: goto -> 183
    //   177: iconst_2
    //   178: goto -> 183
    //   181: bipush #109
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
    int i = (paramInt1 ^ 0xFFFF834D) & 0xFFFF;
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
      byte b1 = 17;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmwa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */