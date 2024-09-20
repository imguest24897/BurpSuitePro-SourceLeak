package burp;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.PatternSyntaxException;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public final class Zm6f {
  private static final String[] ZH;
  
  private static final String[] Zl;
  
  private static final String[] ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static void ZD(int paramInt, Ztn0 paramZtn0, Zefg<Ze87> paramZefg) {
    paramZefg.remove(paramInt);
    paramZtn0.fireTableRowsDeleted(paramInt, paramInt);
  }
  
  public static void Zi(Ze87 paramZe87, Ztn0 paramZtn0, Zefg<Ze87> paramZefg) {
    int i = paramZefg.size();
    paramZefg.add(paramZe87);
    paramZtn0.fireTableRowsInserted(i, i);
  }
  
  public static void ZF(int paramInt, Ze87 paramZe87, Ztn0 paramZtn0, Zefg<Ze87> paramZefg) {
    synchronized (paramZefg.Zz6()) {
      paramZefg.remove(paramInt);
      paramZefg.add(paramInt, paramZe87);
      paramZtn0.fireTableRowsUpdated(paramInt, paramInt);
    } 
  }
  
  static boolean ZV(Zs66 paramZs66, String paramString1, String paramString2, Zefg<Ze87> paramZefg, Ztgr paramZtgr) {
    boolean bool = Zz72.Zq();
    try {
      if (Zc(paramZs66, paramString1, paramString2))
        return false; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    synchronized (paramZefg.Zz6()) {
      for (Ze87 ze87 : paramZefg) {
        try {
          if (!ze87.Zut())
            continue; 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
        try {
          if (!Zb(ze87, paramZs66))
            continue; 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
        if (Zh(ze87, Zx(paramString1, paramString2, ze87), paramZtgr))
          return true; 
        if (bool)
          break; 
      } 
    } 
    return false;
  }
  
  private static void ZN(Zefg<Ze87> paramZefg, List<Ze87> paramList) {
    boolean bool = Zz72.ZQ();
    try {
      synchronized (paramZefg.Zz6()) {
        paramZefg.clear();
        for (Ze87 ze87 : paramList) {
          try {
            if (ze87 != null)
              paramZefg.add(ze87); 
          } catch (Exception exception) {
            throw a(null);
          } 
          if (!bool)
            break; 
        } 
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public static void ZA(Zg4j paramZg4j, Zefg<Ze87> paramZefg, String paramString) {
    boolean bool = Zz72.Zq();
    synchronized (paramZefg.Zz6()) {
      Zzqw zzqw = paramZg4j.ZP(paramString);
      for (Ze87 ze87 : paramZefg) {
        Zzqp zzqp = zzqw.Zc();
        zzqp.Zj(a(-7816, 16379), ze87.Zut());
        zzqp.Zm(a(-7814, -6198), ZH[ze87.ZuJ()]);
        zzqp.Zm(a(-7813, 27208), Zl[ze87.Zum()]);
        zzqp.Zm(a(-7815, -4657), ZP[ze87.ZuB()]);
        zzqp.Zm(a(-7812, -8156), ze87.Zu3());
        if (bool)
          break; 
      } 
    } 
    try {
      if (Zbqc.Zwu() == null) {
        try {
        
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
        Zz72.ZO(!bool);
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  public static void ZF(Zmf_ paramZmf_, Ztn0 paramZtn0, Zefg<Ze87> paramZefg, String paramString, Zr_4 paramZr_4) {
    try {
      if (ZQ(paramZmf_, paramZefg, paramString, paramZr_4))
        paramZtn0.fireTableDataChanged(); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  public static boolean ZQ(Zmf_ paramZmf_, Zefg<Ze87> paramZefg, String paramString, Zr_4 paramZr_4) {
    List<?> list = paramZmf_.Zs(paramString, new Zmuw(paramZr_4));
    try {
      if (list != null)
        ZN(paramZefg, (List)list); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return (list != null);
  }
  
  private static boolean Zc(Zs66 paramZs66, String paramString1, String paramString2) {
    try {
      if (paramString1 != null)
        try {
          if (paramString2 != null) {
            try {
            
            } catch (PatternSyntaxException patternSyntaxException) {
              throw a(null);
            } 
            return (paramZs66 == Zs66.MANUAL_INSERTION_POINT);
          } 
          return true;
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return true;
  }
  
  private static boolean Zb(Ze87 paramZe87, Zs66 paramZs66) {
    try {
      if (paramZe87.ZuJ() == 0)
        return true; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      switch (Zl4r.ZL[paramZs66.ordinal()]) {
        case 1:
          try {
          
          } catch (PatternSyntaxException patternSyntaxException) {
            throw a(null);
          } 
          return (paramZe87.ZuJ() == 1);
        case 2:
        case 3:
        case 4:
          try {
          
          } catch (PatternSyntaxException patternSyntaxException) {
            throw a(null);
          } 
          return (paramZe87.ZuJ() == 2);
        case 5:
          try {
          
          } catch (PatternSyntaxException patternSyntaxException) {
            throw a(null);
          } 
          return (paramZe87.ZuJ() == 3);
        case 6:
          try {
          
          } catch (PatternSyntaxException patternSyntaxException) {
            throw a(null);
          } 
          return (paramZe87.ZuJ() == 4);
        case 7:
          try {
          
          } catch (PatternSyntaxException patternSyntaxException) {
            throw a(null);
          } 
          return (paramZe87.ZuJ() == 5);
        case 8:
          try {
          
          } catch (PatternSyntaxException patternSyntaxException) {
            throw a(null);
          } 
          return (paramZe87.ZuJ() == 9);
        case 9:
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
          return false;
        case 16:
          try {
          
          } catch (PatternSyntaxException patternSyntaxException) {
            throw a(null);
          } 
          return (paramZe87.ZuJ() == 6);
        case 17:
          try {
          
          } catch (PatternSyntaxException patternSyntaxException) {
            throw a(null);
          } 
          return (paramZe87.ZuJ() == 7);
        case 18:
          try {
          
          } catch (PatternSyntaxException patternSyntaxException) {
            throw a(null);
          } 
          return (paramZe87.ZuJ() == 8);
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Zuh.ZT(false, Zqf.Zk, paramZs66.toString());
    return false;
  }
  
  private static boolean Zh(Ze87 paramZe87, String paramString, Ztgr paramZtgr) {
    try {
      switch (paramZe87.ZuB()) {
        case 0:
          return paramZe87.Zu3().equalsIgnoreCase(paramString);
        case 1:
          try {
            Matcher matcher = paramZtgr.ZP(paramZe87.Zu3());
            matcher.reset(paramString);
            if (matcher.find())
              return true; 
          } catch (PatternSyntaxException patternSyntaxException) {
            Zah.Zl(patternSyntaxException, Zk_.USER_ERROR);
          } catch (Exception exception) {
            Zah.Zl(exception, Zk_.UNEXPECTED);
          } 
          return false;
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Zuh.Zv(false, Zqf.Zk, paramZe87.ZuB());
    return false;
  }
  
  private static String Zx(String paramString1, String paramString2, Ze87 paramZe87) {
    null = null;
    switch (paramZe87.Zum()) {
      case 0:
        return paramString1;
      case 1:
        return paramString2;
    } 
    Zuh.Zv(false, Zqf.Zk, paramZe87.Zum());
    return (String)SYNTHETIC_LOCAL_VARIABLE_3;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'D¼gõ\\b\\nq9ã¡ ¡r\\t\\nyU^'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #7
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #45
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 140
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
    //   67: ldc 'sj¶«\\n¿·d9ô×])'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_4
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #69
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 140
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zm6f.a : [Ljava/lang/String;
    //   130: iconst_5
    //   131: anewarray java/lang/String
    //   134: putstatic burp/Zm6f.b : [Ljava/lang/String;
    //   137: goto -> 296
    //   140: dup_x2
    //   141: pop
    //   142: invokevirtual toCharArray : ()[C
    //   145: dup_x1
    //   146: arraylength
    //   147: dup_x2
    //   148: pop
    //   149: iconst_0
    //   150: istore #6
    //   152: dup2_x1
    //   153: pop2
    //   154: dup_x2
    //   155: iconst_1
    //   156: if_icmpgt -> 256
    //   159: dup2
    //   160: swap
    //   161: iload #6
    //   163: dup2_x1
    //   164: caload
    //   165: swap
    //   166: iload #6
    //   168: bipush #7
    //   170: irem
    //   171: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #115
    //   210: goto -> 240
    //   213: bipush #21
    //   215: goto -> 240
    //   218: bipush #122
    //   220: goto -> 240
    //   223: bipush #62
    //   225: goto -> 240
    //   228: bipush #118
    //   230: goto -> 240
    //   233: bipush #29
    //   235: goto -> 240
    //   238: bipush #43
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 163
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 159
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 39, 0 -> 97
    //   296: getstatic burp/Ze87.Ze : [Ljava/lang/String;
    //   299: arraylength
    //   300: anewarray java/lang/String
    //   303: putstatic burp/Zm6f.ZH : [Ljava/lang/String;
    //   306: getstatic burp/Ze87.ZH : [Ljava/lang/String;
    //   309: arraylength
    //   310: anewarray java/lang/String
    //   313: putstatic burp/Zm6f.Zl : [Ljava/lang/String;
    //   316: getstatic burp/Ze87.ZB : [Ljava/lang/String;
    //   319: arraylength
    //   320: anewarray java/lang/String
    //   323: putstatic burp/Zm6f.ZP : [Ljava/lang/String;
    //   326: iconst_0
    //   327: istore #7
    //   329: iload #7
    //   331: getstatic burp/Ze87.Ze : [Ljava/lang/String;
    //   334: arraylength
    //   335: if_icmpge -> 370
    //   338: getstatic burp/Zm6f.ZH : [Ljava/lang/String;
    //   341: iload #7
    //   343: getstatic burp/Ze87.Ze : [Ljava/lang/String;
    //   346: iload #7
    //   348: aaload
    //   349: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   352: bipush #32
    //   354: bipush #95
    //   356: invokevirtual replace : (CC)Ljava/lang/String;
    //   359: aastore
    //   360: iinc #7, 1
    //   363: goto -> 329
    //   366: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   369: athrow
    //   370: iconst_0
    //   371: istore #7
    //   373: iload #7
    //   375: getstatic burp/Ze87.ZH : [Ljava/lang/String;
    //   378: arraylength
    //   379: if_icmpge -> 414
    //   382: getstatic burp/Zm6f.Zl : [Ljava/lang/String;
    //   385: iload #7
    //   387: getstatic burp/Ze87.ZH : [Ljava/lang/String;
    //   390: iload #7
    //   392: aaload
    //   393: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   396: bipush #32
    //   398: bipush #95
    //   400: invokevirtual replace : (CC)Ljava/lang/String;
    //   403: aastore
    //   404: iinc #7, 1
    //   407: goto -> 373
    //   410: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   413: athrow
    //   414: iconst_0
    //   415: istore #7
    //   417: iload #7
    //   419: getstatic burp/Ze87.ZB : [Ljava/lang/String;
    //   422: arraylength
    //   423: if_icmpge -> 458
    //   426: getstatic burp/Zm6f.ZP : [Ljava/lang/String;
    //   429: iload #7
    //   431: getstatic burp/Ze87.ZB : [Ljava/lang/String;
    //   434: iload #7
    //   436: aaload
    //   437: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   440: bipush #32
    //   442: bipush #95
    //   444: invokevirtual replace : (CC)Ljava/lang/String;
    //   447: aastore
    //   448: iinc #7, 1
    //   451: goto -> 417
    //   454: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   457: athrow
    //   458: return
    // Exception table:
    //   from	to	target	type
    //   329	366	366	java/util/regex/PatternSyntaxException
    //   373	410	410	java/util/regex/PatternSyntaxException
    //   417	454	454	java/util/regex/PatternSyntaxException
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE178) & 0xFFFF;
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
      char c = '«';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm6f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */