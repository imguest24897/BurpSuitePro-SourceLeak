package burp;

import com.install4j.api.Util;
import com.install4j.api.update.UpdateChecker;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zsht {
  private static final String[] a;
  
  private static final String[] b;
  
  public static void ZO(String paramString1, String paramString2) {
    Zb(paramString1, paramString2);
  }
  
  public static void Zm(Runnable paramRunnable) {
    Zbqc[] arrayOfZbqc = Ze9e.Zi();
    if (ZK()) {
      if (Zb12.ZG()) {
        UpdateChecker.executeScheduledUpdate(List.of(a(7179, -3649), a(7178, 12831), a(7169, -19481)), true, null, paramRunnable);
        if (arrayOfZbqc == null) {
          UpdateChecker.executeScheduledUpdate(List.of(a(7168, 6211), a(7180, -30273), a(7183, 27777), a(7182, -25687), a(7175, 4467)), true, null, paramRunnable);
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    UpdateChecker.executeScheduledUpdate(List.of(a(7168, 6211), a(7180, -30273), a(7183, 27777), a(7182, -25687), a(7175, 4467)), true, null, paramRunnable);
  }
  
  public static boolean ZK() {
    return UpdateChecker.isUpdateScheduled();
  }
  
  public static boolean ZQ() {
    try {
      try {
        if (!Util.isWindowsInstaller())
          try {
            if (!Util.isMacosInstaller())
              try {
                if (!Util.isUnixInstaller()) {
                  try {
                    if (Zj());
                  } catch (Exception exception) {
                    throw a(null);
                  } 
                  return false;
                } 
              } catch (Exception exception) {
                throw a(null);
              }  
          } catch (Exception exception) {
            throw a(null);
          }  
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      return false;
    } 
  }
  
  private static boolean Zj() {
    return (Util.isMacOS() && Util.isArchive());
  }
  
  public static boolean ZF() {
    // Byte code:
    //   0: invokestatic isMacosInstaller : ()Z
    //   3: ifne -> 19
    //   6: invokestatic Zj : ()Z
    //   9: ifeq -> 59
    //   12: goto -> 19
    //   15: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   18: athrow
    //   19: ldc burp/StartBurp
    //   21: invokestatic ZD : (Ljava/lang/Class;)Ljava/nio/file/Path;
    //   24: invokeinterface toString : ()Ljava/lang/String;
    //   29: sipush #7171
    //   32: sipush #29250
    //   35: invokestatic a : (II)Ljava/lang/String;
    //   38: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   41: ifne -> 59
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   50: athrow
    //   51: iconst_1
    //   52: goto -> 60
    //   55: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   58: athrow
    //   59: iconst_0
    //   60: ireturn
    //   61: astore_0
    //   62: aload_0
    //   63: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   66: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   69: iconst_0
    //   70: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	12	15	java/lang/Exception
    //   0	60	61	java/lang/Exception
    //   6	44	47	java/lang/Exception
    //   19	55	55	java/lang/Exception
  }
  
  private static void Zb(String paramString1, String paramString2) {
    // Byte code:
    //   0: aload_0
    //   1: sipush #7173
    //   4: sipush #-4865
    //   7: invokestatic a : (II)Ljava/lang/String;
    //   10: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   13: ifne -> 39
    //   16: aload_0
    //   17: sipush #7177
    //   20: sipush #-26604
    //   23: invokestatic a : (II)Ljava/lang/String;
    //   26: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   29: ifeq -> 47
    //   32: goto -> 39
    //   35: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   38: athrow
    //   39: iconst_1
    //   40: goto -> 48
    //   43: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   46: athrow
    //   47: iconst_0
    //   48: istore_2
    //   49: sipush #7172
    //   52: sipush #9854
    //   55: invokestatic a : (II)Ljava/lang/String;
    //   58: iconst_3
    //   59: anewarray java/lang/String
    //   62: dup
    //   63: iconst_0
    //   64: aload_1
    //   65: sipush #7181
    //   68: sipush #7461
    //   71: invokestatic a : (II)Ljava/lang/String;
    //   74: swap
    //   75: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   80: aastore
    //   81: dup
    //   82: iconst_1
    //   83: aload_0
    //   84: sipush #7170
    //   87: sipush #9459
    //   90: invokestatic a : (II)Ljava/lang/String;
    //   93: swap
    //   94: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   99: aastore
    //   100: dup
    //   101: iconst_2
    //   102: iload_2
    //   103: sipush #7176
    //   106: sipush #-12517
    //   109: invokestatic a : (II)Ljava/lang/String;
    //   112: swap
    //   113: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Z)Ljava/lang/String;
    //   118: aastore
    //   119: iconst_1
    //   120: aconst_null
    //   121: invokestatic launchApplication : (Ljava/lang/String;[Ljava/lang/String;ZLcom/install4j/api/launcher/ApplicationLauncher$Callback;)V
    //   124: goto -> 135
    //   127: astore_2
    //   128: aload_2
    //   129: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   132: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   135: return
    // Exception table:
    //   from	to	target	type
    //   0	32	35	java/io/IOException
    //   0	124	127	java/io/IOException
    //   16	43	43	java/io/IOException
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¾Ù]á,î[\\n\\f/®|²ªúQ¤A£{þÛÞÇÖ¼]§&vºaøÚÐPb°>õÆ=`T%ÅV|ÈMÔ x\\nÿ$8vá-èßcL§1ø½\\r°û?\\r ªµª-°}\¶À\\r´«1Éü¯"gP'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #11
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #80
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
    //   68: ldc 'Þ-CMTÏ¬Í¬¦]{eW÷ë8\\ný0'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #108
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
    //   129: putstatic burp/Zsht.a : [Ljava/lang/String;
    //   132: bipush #15
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zsht.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #74
    //   214: goto -> 243
    //   217: bipush #100
    //   219: goto -> 243
    //   222: bipush #107
    //   224: goto -> 243
    //   227: bipush #126
    //   229: goto -> 243
    //   232: bipush #15
    //   234: goto -> 243
    //   237: iconst_2
    //   238: goto -> 243
    //   241: bipush #29
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1C09) & 0xFFFF;
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
      byte b1 = 72;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsht.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */