package burp;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zmw;

public class Zg12 {
  private static final String[] a;
  
  private static final String[] b;
  
  public static String Zh(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, String paramString) {
    try {
      if (paramString != null)
        try {
          if (!a(-798, -19769).equals(paramString)) {
            try {
              if (Zd(paramString))
                try {
                  return new String(paramArrayOfbyte, paramInt1, paramInt2, paramString);
                } catch (UnsupportedEncodingException unsupportedEncodingException) {
                  Zah.ZU(unsupportedEncodingException, paramString, Zk_.IMPOSSIBLE);
                }  
            } catch (IllegalCharsetNameException illegalCharsetNameException) {
              throw a(null);
            } 
            return new String(paramArrayOfbyte, paramInt1, paramInt2);
          } 
          return Zkb.Zo(paramArrayOfbyte, paramInt1, paramInt2);
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
          throw a(null);
        }  
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw a(null);
    } 
    return Zkb.Zo(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public static String ZI(byte[] paramArrayOfbyte, String paramString) {
    return Zh(paramArrayOfbyte, 0, paramArrayOfbyte.length, paramString);
  }
  
  public static byte[] ZB(String paramString1, String paramString2) {
    try {
      if (paramString2 != null)
        try {
          if (!a(-800, -8898).equals(paramString2)) {
            try {
              if (Zd(paramString2))
                try {
                  return paramString1.getBytes(paramString2);
                } catch (UnsupportedEncodingException unsupportedEncodingException) {
                  Zah.ZU(unsupportedEncodingException, paramString2, Zk_.IMPOSSIBLE);
                }  
            } catch (IllegalCharsetNameException illegalCharsetNameException) {
              throw a(null);
            } 
            return paramString1.getBytes();
          } 
          return Zkb.Zy(paramString1);
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
          throw a(null);
        }  
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw a(null);
    } 
    return Zkb.Zy(paramString1);
  }
  
  public static String ZY(Zk8m paramZk8m) {
    int[] arrayOfInt = Zsw8.ZK();
    try {
      if (paramZk8m.Zb != null)
        try {
          if (!paramZk8m.Zb.isEmpty()) {
            for (String str1 : paramZk8m.Zb) {
              String str2 = str1.toUpperCase(Locale.ENGLISH);
              try {
                if (Zd(str2))
                  return str2; 
              } catch (IllegalCharsetNameException illegalCharsetNameException) {
                throw a(null);
              } 
              if (arrayOfInt == null)
                break; 
            } 
            return null;
          } 
          return null;
        } catch (IllegalCharsetNameException illegalCharsetNameException) {
          throw a(null);
        }  
    } catch (IllegalCharsetNameException illegalCharsetNameException) {
      throw a(null);
    } 
    return null;
  }
  
  private static boolean Zd(String paramString) {
    try {
      return Charset.isSupported(paramString);
    } catch (IllegalCharsetNameException illegalCharsetNameException) {
      Zah.Zl(illegalCharsetNameException, Zk_.COMMON_RUNTIME_FAILURE);
      return false;
    } 
  }
  
  public static int ZV(String paramString) {
    // Byte code:
    //   0: invokestatic ZK : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: ifnonnull -> 14
    //   8: iconst_0
    //   9: ireturn
    //   10: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   13: athrow
    //   14: aload_0
    //   15: astore_2
    //   16: iconst_m1
    //   17: istore_3
    //   18: aload_2
    //   19: invokevirtual hashCode : ()I
    //   22: lookupswitch default -> 213, -1781783509 -> 130, -1065866821 -> 72, -779575311 -> 101, 81070450 -> 188, 1311752211 -> 159
    //   72: aload_2
    //   73: sipush #-785
    //   76: sipush #-22960
    //   79: invokestatic a : (II)Ljava/lang/String;
    //   82: invokevirtual equals : (Ljava/lang/Object;)Z
    //   85: ifeq -> 213
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   94: athrow
    //   95: iconst_0
    //   96: istore_3
    //   97: aload_1
    //   98: ifnonnull -> 213
    //   101: aload_2
    //   102: sipush #-797
    //   105: sipush #23897
    //   108: invokestatic a : (II)Ljava/lang/String;
    //   111: invokevirtual equals : (Ljava/lang/Object;)Z
    //   114: ifeq -> 213
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   123: athrow
    //   124: iconst_1
    //   125: istore_3
    //   126: aload_1
    //   127: ifnonnull -> 213
    //   130: aload_2
    //   131: sipush #-799
    //   134: sipush #5032
    //   137: invokestatic a : (II)Ljava/lang/String;
    //   140: invokevirtual equals : (Ljava/lang/Object;)Z
    //   143: ifeq -> 213
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   152: athrow
    //   153: iconst_2
    //   154: istore_3
    //   155: aload_1
    //   156: ifnonnull -> 213
    //   159: aload_2
    //   160: sipush #-795
    //   163: sipush #1036
    //   166: invokestatic a : (II)Ljava/lang/String;
    //   169: invokevirtual equals : (Ljava/lang/Object;)Z
    //   172: ifeq -> 213
    //   175: goto -> 182
    //   178: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   181: athrow
    //   182: iconst_3
    //   183: istore_3
    //   184: aload_1
    //   185: ifnonnull -> 213
    //   188: aload_2
    //   189: sipush #-786
    //   192: sipush #30848
    //   195: invokestatic a : (II)Ljava/lang/String;
    //   198: invokevirtual equals : (Ljava/lang/Object;)Z
    //   201: ifeq -> 213
    //   204: goto -> 211
    //   207: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   210: athrow
    //   211: iconst_4
    //   212: istore_3
    //   213: iload_3
    //   214: tableswitch default -> 264, 0 -> 248, 1 -> 248, 2 -> 256, 3 -> 256, 4 -> 260
    //   248: iconst_4
    //   249: goto -> 273
    //   252: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   255: athrow
    //   256: iconst_2
    //   257: goto -> 273
    //   260: iconst_3
    //   261: goto -> 273
    //   264: iconst_0
    //   265: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   268: aload_0
    //   269: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   272: iconst_m1
    //   273: ireturn
    // Exception table:
    //   from	to	target	type
    //   4	10	10	java/nio/charset/IllegalCharsetNameException
    //   18	88	91	java/nio/charset/IllegalCharsetNameException
    //   97	117	120	java/nio/charset/IllegalCharsetNameException
    //   126	146	149	java/nio/charset/IllegalCharsetNameException
    //   155	175	178	java/nio/charset/IllegalCharsetNameException
    //   184	204	207	java/nio/charset/IllegalCharsetNameException
    //   213	252	252	java/nio/charset/IllegalCharsetNameException
  }
  
  public static byte[] ZR(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[paramArrayOfbyte.length + 3];
    arrayOfByte[0] = -17;
    arrayOfByte[1] = -69;
    arrayOfByte[2] = -65;
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 3, paramArrayOfbyte.length);
    return arrayOfByte;
  }
  
  public static String Zr(byte[] paramArrayOfbyte, int paramInt) {
    try {
      if (paramArrayOfbyte.length >= paramInt + 4)
        try {
          if (paramArrayOfbyte[paramInt] == 0)
            try {
              if (paramArrayOfbyte[paramInt + 1] == 0)
                try {
                  if (paramArrayOfbyte[paramInt + 2] == -2)
                    try {
                      if (paramArrayOfbyte[paramInt + 3] == -1)
                        return a(-794, 31090); 
                    } catch (IllegalCharsetNameException illegalCharsetNameException) {
                      throw a(null);
                    }  
                } catch (IllegalCharsetNameException illegalCharsetNameException) {
                  throw a(null);
                }  
            } catch (IllegalCharsetNameException illegalCharsetNameException) {
              throw a(null);
            }  
        } catch (IllegalCharsetNameException illegalCharsetNameException) {
          throw a(null);
        }  
    } catch (IllegalCharsetNameException illegalCharsetNameException) {
      throw a(null);
    } 
    try {
      if (paramArrayOfbyte.length >= paramInt + 4)
        try {
          if (paramArrayOfbyte[paramInt] == -1)
            try {
              if (paramArrayOfbyte[paramInt + 1] == -2)
                try {
                  if (paramArrayOfbyte[paramInt + 2] == 0)
                    try {
                      if (paramArrayOfbyte[paramInt + 3] == 0)
                        return a(-793, -2309); 
                    } catch (IllegalCharsetNameException illegalCharsetNameException) {
                      throw a(null);
                    }  
                } catch (IllegalCharsetNameException illegalCharsetNameException) {
                  throw a(null);
                }  
            } catch (IllegalCharsetNameException illegalCharsetNameException) {
              throw a(null);
            }  
        } catch (IllegalCharsetNameException illegalCharsetNameException) {
          throw a(null);
        }  
    } catch (IllegalCharsetNameException illegalCharsetNameException) {
      throw a(null);
    } 
    try {
      if (paramArrayOfbyte.length >= paramInt + 3)
        try {
          if (paramArrayOfbyte[paramInt] == -17)
            try {
              if (paramArrayOfbyte[paramInt + 1] == -69)
                try {
                  if (paramArrayOfbyte[paramInt + 2] == -65)
                    return a(-787, -29825); 
                } catch (IllegalCharsetNameException illegalCharsetNameException) {
                  throw a(null);
                }  
            } catch (IllegalCharsetNameException illegalCharsetNameException) {
              throw a(null);
            }  
        } catch (IllegalCharsetNameException illegalCharsetNameException) {
          throw a(null);
        }  
    } catch (IllegalCharsetNameException illegalCharsetNameException) {
      throw a(null);
    } 
    try {
      if (paramArrayOfbyte.length >= paramInt + 2)
        try {
          if (paramArrayOfbyte[paramInt] == -2)
            try {
              if (paramArrayOfbyte[paramInt + 1] == -1)
                return a(-788, -13197); 
            } catch (IllegalCharsetNameException illegalCharsetNameException) {
              throw a(null);
            }  
        } catch (IllegalCharsetNameException illegalCharsetNameException) {
          throw a(null);
        }  
    } catch (IllegalCharsetNameException illegalCharsetNameException) {
      throw a(null);
    } 
    try {
      if (paramArrayOfbyte.length >= paramInt + 2)
        try {
          if (paramArrayOfbyte[paramInt] == -1)
            try {
              if (paramArrayOfbyte[paramInt + 1] == -2)
                return a(-796, -22164); 
            } catch (IllegalCharsetNameException illegalCharsetNameException) {
              throw a(null);
            }  
        } catch (IllegalCharsetNameException illegalCharsetNameException) {
          throw a(null);
        }  
    } catch (IllegalCharsetNameException illegalCharsetNameException) {
      throw a(null);
    } 
    return null;
  }
  
  public static byte[] ZT(byte[] paramArrayOfbyte) {
    int i = paramArrayOfbyte.length - ZJ(paramArrayOfbyte);
    try {
      if (i == 0)
        return paramArrayOfbyte; 
    } catch (IllegalCharsetNameException illegalCharsetNameException) {
      throw a(null);
    } 
    return Zmw.Zz(paramArrayOfbyte, i, paramArrayOfbyte.length);
  }
  
  private static int ZJ(byte[] paramArrayOfbyte) {
    String str = Zr(paramArrayOfbyte, 0);
    return paramArrayOfbyte.length - ZV(str);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÅåxOX:ìD©é×\\r¥¸ÓÎlhêiSÏ\\f[k'T¥ÔÝY\\f(z¸Ð>hÏÎI9ØbÃñV¦äý'R>´~8ûÄt?Ë?ÄðU0èA«ëF\\f¿ÜülÕJõÅ¥áÐ0ñjýì§'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #13
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #6
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc 'Q\\r\\f;²Vº,gßËó'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #31
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
    //   128: putstatic burp/Zg12.a : [Ljava/lang/String;
    //   131: bipush #12
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zg12.b : [Ljava/lang/String;
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
    //   212: bipush #48
    //   214: goto -> 244
    //   217: bipush #110
    //   219: goto -> 244
    //   222: bipush #114
    //   224: goto -> 244
    //   227: bipush #15
    //   229: goto -> 244
    //   232: bipush #127
    //   234: goto -> 244
    //   237: bipush #90
    //   239: goto -> 244
    //   242: bipush #127
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
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFCE4) & 0xFFFF;
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
      char c = 'Ë';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg12.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */