package burp;

import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;

public class Zs06 {
  private static String ZO;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static void Zw(Zz0c paramZz0c, Zs4f paramZs4f) throws IOException {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'f'
    //   3: aload_0
    //   4: invokeinterface ZXn : ()Ljava/time/ZonedDateTime;
    //   9: invokevirtual toInstant : ()Ljava/time/Instant;
    //   12: invokevirtual toEpochMilli : ()J
    //   15: invokeinterface ZE : (Ljava/lang/String;J)V
    //   20: invokestatic ZF : ()Ljava/lang/String;
    //   23: aload_1
    //   24: ldc 't'
    //   26: aload_0
    //   27: invokeinterface ZXf : ()Ljava/time/ZonedDateTime;
    //   32: invokevirtual toInstant : ()Ljava/time/Instant;
    //   35: invokevirtual toEpochMilli : ()J
    //   38: invokeinterface ZE : (Ljava/lang/String;J)V
    //   43: astore_2
    //   44: aload_0
    //   45: invokeinterface ZX6 : ()Ljava/time/ZonedDateTime;
    //   50: astore_3
    //   51: aload_3
    //   52: ifnull -> 77
    //   55: aload_1
    //   56: ldc 'i'
    //   58: aload_3
    //   59: invokevirtual toInstant : ()Ljava/time/Instant;
    //   62: invokevirtual toEpochMilli : ()J
    //   65: invokeinterface ZE : (Ljava/lang/String;J)V
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   76: athrow
    //   77: getstatic burp/Zewa.ZU : [I
    //   80: aload_0
    //   81: invokeinterface ZXL : ()Ljava/time/temporal/ChronoField;
    //   86: invokevirtual ordinal : ()I
    //   89: iaload
    //   90: tableswitch default -> 225, 1 -> 120, 2 -> 148, 3 -> 175, 4 -> 202
    //   120: aload_1
    //   121: sipush #20504
    //   124: sipush #-24950
    //   127: invokestatic a : (II)Ljava/lang/String;
    //   130: bipush #6
    //   132: invokeinterface Zb : (Ljava/lang/String;I)V
    //   137: aload_2
    //   138: ifnull -> 225
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   147: athrow
    //   148: aload_1
    //   149: sipush #20498
    //   152: sipush #27474
    //   155: invokestatic a : (II)Ljava/lang/String;
    //   158: iconst_3
    //   159: invokeinterface Zb : (Ljava/lang/String;I)V
    //   164: aload_2
    //   165: ifnull -> 225
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   174: athrow
    //   175: aload_1
    //   176: sipush #20498
    //   179: sipush #27474
    //   182: invokestatic a : (II)Ljava/lang/String;
    //   185: iconst_2
    //   186: invokeinterface Zb : (Ljava/lang/String;I)V
    //   191: aload_2
    //   192: ifnull -> 225
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   201: athrow
    //   202: aload_1
    //   203: sipush #20498
    //   206: sipush #27474
    //   209: invokestatic a : (II)Ljava/lang/String;
    //   212: iconst_1
    //   213: invokeinterface Zb : (Ljava/lang/String;I)V
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   224: athrow
    //   225: aload_1
    //   226: sipush #20510
    //   229: sipush #-15492
    //   232: invokestatic a : (II)Ljava/lang/String;
    //   235: aload_0
    //   236: invokeinterface ZXz : ()I
    //   241: invokeinterface Zb : (Ljava/lang/String;I)V
    //   246: aload_1
    //   247: sipush #20505
    //   250: sipush #-2939
    //   253: invokestatic a : (II)Ljava/lang/String;
    //   256: aload_0
    //   257: invokeinterface ZXe : ()I
    //   262: invokeinterface Zb : (Ljava/lang/String;I)V
    //   267: aload_0
    //   268: invokeinterface ZXt : ()Ljava/lang/String;
    //   273: astore #4
    //   275: aload #4
    //   277: ifnull -> 304
    //   280: aload_1
    //   281: sipush #20511
    //   284: sipush #224
    //   287: invokestatic a : (II)Ljava/lang/String;
    //   290: aload #4
    //   292: invokeinterface ZL : (Ljava/lang/String;Ljava/lang/String;)V
    //   297: goto -> 304
    //   300: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   303: athrow
    //   304: invokestatic Zwu : ()[Lburp/Zbqc;
    //   307: ifnonnull -> 322
    //   310: ldc 'u2Dek'
    //   312: invokestatic Zf : (Ljava/lang/String;)V
    //   315: goto -> 322
    //   318: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   321: athrow
    //   322: return
    // Exception table:
    //   from	to	target	type
    //   51	70	73	java/io/IOException
    //   77	141	144	java/io/IOException
    //   120	168	171	java/io/IOException
    //   148	195	198	java/io/IOException
    //   175	218	221	java/io/IOException
    //   275	297	300	java/io/IOException
    //   304	315	318	java/io/IOException
  }
  
  public static void ZX(Zz0c paramZz0c) {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface ZXf : ()Ljava/time/ZonedDateTime;
    //   6: astore_2
    //   7: invokestatic ZF : ()Ljava/lang/String;
    //   10: aload_0
    //   11: invokeinterface ZXn : ()Ljava/time/ZonedDateTime;
    //   16: astore_3
    //   17: astore_1
    //   18: aload_0
    //   19: invokeinterface ZXz : ()I
    //   24: istore #4
    //   26: aload_0
    //   27: invokeinterface ZXs : ()Ljava/time/format/DateTimeFormatter;
    //   32: ifnull -> 48
    //   35: aload_2
    //   36: aload_3
    //   37: invokevirtual isBefore : (Ljava/time/chrono/ChronoZonedDateTime;)Z
    //   40: ifne -> 48
    //   43: iload #4
    //   45: ifgt -> 56
    //   48: aload_0
    //   49: iconst_0
    //   50: invokeinterface ZvH : (I)V
    //   55: return
    //   56: aload_2
    //   57: invokevirtual toInstant : ()Ljava/time/Instant;
    //   60: aload_3
    //   61: invokevirtual toInstant : ()Ljava/time/Instant;
    //   64: invokevirtual toEpochMilli : ()J
    //   67: invokevirtual minusMillis : (J)Ljava/time/Instant;
    //   70: invokevirtual toEpochMilli : ()J
    //   73: lstore #5
    //   75: getstatic burp/Zewa.ZU : [I
    //   78: aload_0
    //   79: invokeinterface ZXL : ()Ljava/time/temporal/ChronoField;
    //   84: invokevirtual ordinal : ()I
    //   87: iaload
    //   88: tableswitch default -> 271, 1 -> 120, 2 -> 153, 3 -> 186, 4 -> 242
    //   120: getstatic java/time/temporal/ChronoUnit.DAYS : Ljava/time/temporal/ChronoUnit;
    //   123: invokevirtual getDuration : ()Ljava/time/Duration;
    //   126: invokevirtual toMillis : ()J
    //   129: lstore #7
    //   131: aload_0
    //   132: lload #5
    //   134: iload #4
    //   136: i2l
    //   137: lload #7
    //   139: lmul
    //   140: ldiv
    //   141: lconst_1
    //   142: ladd
    //   143: l2i
    //   144: invokeinterface ZvH : (I)V
    //   149: aload_1
    //   150: ifnull -> 271
    //   153: getstatic java/time/temporal/ChronoUnit.WEEKS : Ljava/time/temporal/ChronoUnit;
    //   156: invokevirtual getDuration : ()Ljava/time/Duration;
    //   159: invokevirtual toMillis : ()J
    //   162: lstore #9
    //   164: aload_0
    //   165: lload #5
    //   167: iload #4
    //   169: i2l
    //   170: lload #9
    //   172: lmul
    //   173: ldiv
    //   174: lconst_1
    //   175: ladd
    //   176: l2i
    //   177: invokeinterface ZvH : (I)V
    //   182: aload_1
    //   183: ifnull -> 271
    //   186: aload_3
    //   187: astore #11
    //   189: aload_0
    //   190: iconst_0
    //   191: invokeinterface ZvH : (I)V
    //   196: aload #11
    //   198: aload_2
    //   199: invokevirtual isBefore : (Ljava/time/chrono/ChronoZonedDateTime;)Z
    //   202: ifeq -> 271
    //   205: aload #11
    //   207: iload #4
    //   209: i2l
    //   210: aload_0
    //   211: invokeinterface ZXL : ()Ljava/time/temporal/ChronoField;
    //   216: invokevirtual getBaseUnit : ()Ljava/time/temporal/TemporalUnit;
    //   219: invokevirtual plus : (JLjava/time/temporal/TemporalUnit;)Ljava/time/ZonedDateTime;
    //   222: astore #11
    //   224: aload_0
    //   225: aload_0
    //   226: invokeinterface Zyv : ()I
    //   231: iconst_1
    //   232: iadd
    //   233: invokeinterface ZvH : (I)V
    //   238: aload_1
    //   239: ifnull -> 196
    //   242: getstatic java/time/temporal/ChronoUnit.YEARS : Ljava/time/temporal/ChronoUnit;
    //   245: invokevirtual getDuration : ()Ljava/time/Duration;
    //   248: invokevirtual toMillis : ()J
    //   251: lstore #12
    //   253: aload_0
    //   254: lload #5
    //   256: iload #4
    //   258: i2l
    //   259: lload #12
    //   261: lmul
    //   262: ldiv
    //   263: lconst_1
    //   264: ladd
    //   265: l2i
    //   266: invokeinterface ZvH : (I)V
    //   271: return
  }
  
  static void ZK(Zz0c paramZz0c) throws Zs7w {
    try {
      paramZz0c.ZyK();
      if (paramZz0c.Zyv() <= 0)
        throw new Zs7w(a(20499, -31543)); 
    } catch (Zs7w zs7w) {
      throw a(null);
    } 
    paramZz0c.Zy4();
  }
  
  static void ZJ(Zz0c paramZz0c) {
    paramZz0c.ZR(paramZz0c.ZXn());
  }
  
  static ZonedDateTime Zs(Instant paramInstant) {
    return ZonedDateTime.ofInstant(paramInstant, ZoneId.systemDefault());
  }
  
  static ZonedDateTime Zd(Long paramLong) {
    return Zs(Instant.ofEpochMilli(paramLong.longValue()));
  }
  
  static ZonedDateTime Zr(Zk21 paramZk21) {
    return Zs(paramZk21.ZBy());
  }
  
  static ChronoField ZX(String paramString) {
    // Byte code:
    //   0: invokestatic ZF : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: ifnonnull -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: aload_0
    //   11: astore_2
    //   12: iconst_m1
    //   13: istore_3
    //   14: aload_2
    //   15: invokevirtual hashCode : ()I
    //   18: lookupswitch default -> 144, -2043667148 -> 104, 2751581 -> 126, 926642476 -> 82, 1273475408 -> 60
    //   60: aload_2
    //   61: sipush #20508
    //   64: sipush #867
    //   67: invokestatic a : (II)Ljava/lang/String;
    //   70: invokevirtual equals : (Ljava/lang/Object;)Z
    //   73: ifeq -> 144
    //   76: iconst_0
    //   77: istore_3
    //   78: aload_1
    //   79: ifnull -> 144
    //   82: aload_2
    //   83: sipush #20509
    //   86: sipush #3952
    //   89: invokestatic a : (II)Ljava/lang/String;
    //   92: invokevirtual equals : (Ljava/lang/Object;)Z
    //   95: ifeq -> 144
    //   98: iconst_1
    //   99: istore_3
    //   100: aload_1
    //   101: ifnull -> 144
    //   104: aload_2
    //   105: sipush #20506
    //   108: sipush #30447
    //   111: invokestatic a : (II)Ljava/lang/String;
    //   114: invokevirtual equals : (Ljava/lang/Object;)Z
    //   117: ifeq -> 144
    //   120: iconst_2
    //   121: istore_3
    //   122: aload_1
    //   123: ifnull -> 144
    //   126: aload_2
    //   127: sipush #20507
    //   130: sipush #31132
    //   133: invokestatic a : (II)Ljava/lang/String;
    //   136: invokevirtual equals : (Ljava/lang/Object;)Z
    //   139: ifeq -> 144
    //   142: iconst_3
    //   143: istore_3
    //   144: iload_3
    //   145: tableswitch default -> 192, 0 -> 176, 1 -> 180, 2 -> 184, 3 -> 188
    //   176: getstatic java/time/temporal/ChronoField.DAY_OF_YEAR : Ljava/time/temporal/ChronoField;
    //   179: areturn
    //   180: getstatic java/time/temporal/ChronoField.ALIGNED_WEEK_OF_YEAR : Ljava/time/temporal/ChronoField;
    //   183: areturn
    //   184: getstatic java/time/temporal/ChronoField.MONTH_OF_YEAR : Ljava/time/temporal/ChronoField;
    //   187: areturn
    //   188: getstatic java/time/temporal/ChronoField.YEAR : Ljava/time/temporal/ChronoField;
    //   191: areturn
    //   192: aconst_null
    //   193: areturn
  }
  
  public static void Zf(String paramString) {
    ZO = paramString;
  }
  
  public static String ZF() {
    return ZO;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic Zf : (Ljava/lang/String;)V
    //   13: ldc 'eù­àÇ&8rKÈ@DAaJ¥o±Ây3\\t¢¶a#\\b\÷vß{1QÔw$¶ÑDNtéµ'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #11
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #43
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
    //   72: ldc '\\n>¼iº#åÔCjéwígÐå'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: iconst_2
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #110
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
    //   132: putstatic burp/Zs06.a : [Ljava/lang/String;
    //   135: bipush #10
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zs06.b : [Ljava/lang/String;
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
    //   216: bipush #46
    //   218: goto -> 248
    //   221: bipush #127
    //   223: goto -> 248
    //   226: bipush #11
    //   228: goto -> 248
    //   231: bipush #86
    //   233: goto -> 248
    //   236: bipush #59
    //   238: goto -> 248
    //   241: bipush #67
    //   243: goto -> 248
    //   246: bipush #16
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
    int i = (paramInt1 ^ 0x501A) & 0xFFFF;
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
      byte b1 = 117;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs06.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */