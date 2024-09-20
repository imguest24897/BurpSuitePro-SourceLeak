package net.portswigger.swagger.v2.util;

import burp.Zbqc;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import net.portswigger.swagger.FileUtils;
import net.portswigger.swagger.v3.parser.core.models.AuthorizationValue;
import net.portswigger.swagger.v3.parser.models.RefFormat;

public class RefUtils {
  private static final String REFERENCE_SEPARATOR;
  
  private static Zbqc[] Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static String computeDefinitionName(String paramString) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: sipush #19258
    //   7: sipush #3128
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   16: astore_2
    //   17: astore_1
    //   18: aload_2
    //   19: arraylength
    //   20: iconst_2
    //   21: if_icmple -> 52
    //   24: new java/lang/RuntimeException
    //   27: dup
    //   28: aload_0
    //   29: sipush #19257
    //   32: sipush #-2408
    //   35: invokestatic a : (II)Ljava/lang/String;
    //   38: swap
    //   39: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   44: invokespecial <init> : (Ljava/lang/String;)V
    //   47: athrow
    //   48: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   51: athrow
    //   52: aload_2
    //   53: iconst_0
    //   54: aaload
    //   55: astore_3
    //   56: aload_2
    //   57: arraylength
    //   58: iconst_2
    //   59: if_icmpne -> 72
    //   62: aload_2
    //   63: iconst_1
    //   64: aaload
    //   65: goto -> 73
    //   68: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: aconst_null
    //   73: astore #4
    //   75: aload #4
    //   77: ifnull -> 103
    //   80: aload #4
    //   82: ldc '/'
    //   84: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   87: astore #6
    //   89: aload #6
    //   91: aload #6
    //   93: arraylength
    //   94: iconst_1
    //   95: isub
    //   96: aaload
    //   97: astore #5
    //   99: aload_1
    //   100: ifnonnull -> 174
    //   103: aload_3
    //   104: ldc '/'
    //   106: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   109: astore #6
    //   111: aload #6
    //   113: aload #6
    //   115: arraylength
    //   116: iconst_1
    //   117: isub
    //   118: aaload
    //   119: astore #5
    //   121: aload #5
    //   123: sipush #19263
    //   126: sipush #-4734
    //   129: invokestatic a : (II)Ljava/lang/String;
    //   132: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   135: astore #7
    //   137: aload #7
    //   139: arraylength
    //   140: iconst_2
    //   141: if_icmple -> 168
    //   144: ldc ''
    //   146: aload #7
    //   148: aload #7
    //   150: arraylength
    //   151: iconst_1
    //   152: isub
    //   153: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   156: checkcast [Ljava/lang/CharSequence;
    //   159: invokestatic join : (Ljava/lang/CharSequence;[Ljava/lang/CharSequence;)Ljava/lang/String;
    //   162: astore #5
    //   164: aload_1
    //   165: ifnonnull -> 174
    //   168: aload #7
    //   170: iconst_0
    //   171: aaload
    //   172: astore #5
    //   174: aload #5
    //   176: areturn
    // Exception table:
    //   from	to	target	type
    //   18	48	48	java/lang/RuntimeException
    //   56	68	68	java/lang/RuntimeException
  }
  
  public static Optional<String> getExternalPath(String paramString) {
    try {
      if (paramString == null)
        return Optional.empty(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Optional.<String[]>of(paramString.split(a(19253, -29519))).filter(RefUtils::lambda$getExternalPath$0).map(RefUtils::lambda$getExternalPath$1).filter(RefUtils::lambda$getExternalPath$2);
  }
  
  public static boolean isAnExternalRefFormat(RefFormat paramRefFormat) {
    try {
      if (paramRefFormat != RefFormat.URL) {
        try {
          if (paramRefFormat == RefFormat.RELATIVE);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public static RefFormat computeRefFormat(String paramString) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: getstatic net/portswigger/swagger/v3/parser/models/RefFormat.INTERNAL : Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   6: astore_2
    //   7: astore_1
    //   8: aload_0
    //   9: invokestatic mungedRef : (Ljava/lang/String;)Ljava/lang/String;
    //   12: astore_0
    //   13: aload_0
    //   14: sipush #19251
    //   17: sipush #28782
    //   20: invokestatic a : (II)Ljava/lang/String;
    //   23: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   26: ifne -> 52
    //   29: aload_0
    //   30: sipush #19262
    //   33: sipush #20309
    //   36: invokestatic a : (II)Ljava/lang/String;
    //   39: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   42: ifeq -> 60
    //   45: goto -> 52
    //   48: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   51: athrow
    //   52: getstatic net/portswigger/swagger/v3/parser/models/RefFormat.URL : Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   55: astore_2
    //   56: aload_1
    //   57: ifnonnull -> 150
    //   60: aload_0
    //   61: sipush #19253
    //   64: sipush #-29519
    //   67: invokestatic a : (II)Ljava/lang/String;
    //   70: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   73: ifeq -> 91
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: getstatic net/portswigger/swagger/v3/parser/models/RefFormat.INTERNAL : Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   86: astore_2
    //   87: aload_1
    //   88: ifnonnull -> 150
    //   91: aload_0
    //   92: ldc '.'
    //   94: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   97: ifne -> 146
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   106: athrow
    //   107: aload_0
    //   108: ldc '/'
    //   110: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   113: ifne -> 146
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: aload_0
    //   124: sipush #19253
    //   127: sipush #-29519
    //   130: invokestatic a : (II)Ljava/lang/String;
    //   133: invokevirtual indexOf : (Ljava/lang/String;)I
    //   136: ifle -> 150
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   145: athrow
    //   146: getstatic net/portswigger/swagger/v3/parser/models/RefFormat.RELATIVE : Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   149: astore_2
    //   150: aload_2
    //   151: areturn
    // Exception table:
    //   from	to	target	type
    //   13	45	48	java/lang/RuntimeException
    //   56	76	79	java/lang/RuntimeException
    //   87	100	103	java/lang/RuntimeException
    //   91	116	119	java/lang/RuntimeException
    //   107	139	142	java/lang/RuntimeException
  }
  
  public static String mungedRef(String paramString) {
    try {
      if (!paramString.contains(":"))
        try {
          if (!paramString.startsWith("#"))
            try {
              if (!paramString.startsWith("/"))
                try {
                  if (!paramString.contains("$"))
                    try {
                      if (paramString.indexOf(".") > 0)
                        return a(19242, 7706) + a(19242, 7706); 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    }  
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return paramString;
  }
  
  public static String readExternalUrlRef(String paramString1, RefFormat paramRefFormat, List<AuthorizationValue> paramList, String paramString2) {
    Zbqc[] arrayOfZbqc = ZV();
    try {
      if (!isAnExternalRefFormat(paramRefFormat))
        throw new RuntimeException(a(19248, 30955)); 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      if (paramRefFormat == RefFormat.URL) {
        String str1 = RemoteUrl.urlToString(paramString1, paramList);
        if (arrayOfZbqc != null)
          return str1; 
      } 
      String str = buildUrl(paramString2, paramString1);
      return readExternalRef(str, RefFormat.URL, paramList, null);
    } catch (Exception exception) {
      a(19252, -11991);
      throw new RuntimeException(a(19252, -11991) + a(19252, -11991) + String.valueOf(paramRefFormat) + a(19256, -11795), exception);
    } 
  }
  
  public static String readExternalClasspathRef(String paramString1, RefFormat paramRefFormat, List<AuthorizationValue> paramList, String paramString2) {
    try {
      if (!isAnExternalRefFormat(paramRefFormat))
        throw new RuntimeException(a(19248, 30955)); 
    } catch (Exception exception) {
      throw a(null);
    } 
    if (paramRefFormat == RefFormat.URL)
      try {
        return RemoteUrl.urlToString(paramString1, paramList);
      } catch (Exception exception) {
        a(19252, -11991);
        throw new RuntimeException(a(19252, -11991) + a(19252, -11991) + String.valueOf(paramRefFormat) + a(19256, -11795), exception);
      }  
    throw new RuntimeException(a(19261, 26961));
  }
  
  public static String buildUrl(String paramString1, String paramString2) {
    try {
      if (paramString1 != null)
        try {
          if (paramString2 != null)
            try {
              int i = paramString1.lastIndexOf("/") + 1;
              String str = paramString1.substring(0, i);
              URL uRL1 = new URL(str);
              URL uRL2 = new URL(uRL1, paramString2);
              return uRL2.toString();
            } catch (Exception exception) {
              throw new RuntimeException(exception);
            }  
          return null;
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    return null;
  }
  
  public static String readExternalRef(String paramString, RefFormat paramRefFormat, List<AuthorizationValue> paramList, Path paramPath) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: invokestatic isAnExternalRefFormat : (Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Z
    //   9: ifne -> 33
    //   12: new java/lang/RuntimeException
    //   15: dup
    //   16: sipush #19240
    //   19: sipush #-435
    //   22: invokestatic a : (II)Ljava/lang/String;
    //   25: invokespecial <init> : (Ljava/lang/String;)V
    //   28: athrow
    //   29: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   32: athrow
    //   33: aconst_null
    //   34: astore #5
    //   36: aload_1
    //   37: getstatic net/portswigger/swagger/v3/parser/models/RefFormat.URL : Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   40: if_acmpne -> 53
    //   43: aload_0
    //   44: aload_2
    //   45: invokestatic urlToString : (Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    //   48: astore #5
    //   50: goto -> 283
    //   53: aload_3
    //   54: aload_0
    //   55: invokeinterface resolve : (Ljava/lang/String;)Ljava/nio/file/Path;
    //   60: invokeinterface normalize : ()Ljava/nio/file/Path;
    //   65: astore #6
    //   67: aload #6
    //   69: iconst_0
    //   70: anewarray java/nio/file/LinkOption
    //   73: invokestatic exists : (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
    //   76: ifeq -> 89
    //   79: aload #6
    //   81: invokestatic readAll : (Ljava/nio/file/Path;)Ljava/lang/String;
    //   84: astore #5
    //   86: goto -> 257
    //   89: aload_0
    //   90: astore #7
    //   92: aload #7
    //   94: sipush #19243
    //   97: sipush #-10942
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   106: ifeq -> 198
    //   109: iconst_0
    //   110: istore #8
    //   112: aload #7
    //   114: sipush #19255
    //   117: sipush #-23609
    //   120: invokestatic a : (II)Ljava/lang/String;
    //   123: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   126: ifeq -> 153
    //   129: aload #7
    //   131: aload #7
    //   133: ldc '.'
    //   135: invokevirtual indexOf : (Ljava/lang/String;)I
    //   138: iconst_2
    //   139: iadd
    //   140: invokevirtual substring : (I)Ljava/lang/String;
    //   143: astore #7
    //   145: iinc #8, 1
    //   148: aload #4
    //   150: ifnonnull -> 112
    //   153: iconst_0
    //   154: istore #9
    //   156: iload #9
    //   158: iload #8
    //   160: iconst_1
    //   161: isub
    //   162: if_icmpge -> 180
    //   165: aload_3
    //   166: invokeinterface getParent : ()Ljava/nio/file/Path;
    //   171: astore_3
    //   172: iinc #9, 1
    //   175: aload #4
    //   177: ifnonnull -> 156
    //   180: aload_3
    //   181: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   184: aload #7
    //   186: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   191: astore #7
    //   193: aload #4
    //   195: ifnonnull -> 223
    //   198: aload_3
    //   199: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   202: aload #7
    //   204: aload #7
    //   206: ldc '.'
    //   208: invokevirtual indexOf : (Ljava/lang/String;)I
    //   211: iconst_1
    //   212: iadd
    //   213: invokevirtual substring : (I)Ljava/lang/String;
    //   216: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   221: astore #7
    //   223: aload_3
    //   224: aload #7
    //   226: invokeinterface resolve : (Ljava/lang/String;)Ljava/nio/file/Path;
    //   231: invokeinterface normalize : ()Ljava/nio/file/Path;
    //   236: astore #8
    //   238: aload #8
    //   240: iconst_0
    //   241: anewarray java/nio/file/LinkOption
    //   244: invokestatic exists : (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
    //   247: ifeq -> 257
    //   250: aload #8
    //   252: invokestatic readAll : (Ljava/nio/file/Path;)Ljava/lang/String;
    //   255: astore #5
    //   257: aload #5
    //   259: ifnonnull -> 283
    //   262: new java/lang/RuntimeException
    //   265: dup
    //   266: sipush #19254
    //   269: sipush #-520
    //   272: invokestatic a : (II)Ljava/lang/String;
    //   275: invokespecial <init> : (Ljava/lang/String;)V
    //   278: athrow
    //   279: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   282: athrow
    //   283: goto -> 351
    //   286: astore #6
    //   288: new java/lang/RuntimeException
    //   291: dup
    //   292: aload_1
    //   293: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   296: aload_0
    //   297: aload_3
    //   298: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   301: astore #10
    //   303: astore #11
    //   305: astore #12
    //   307: sipush #19260
    //   310: sipush #-597
    //   313: invokestatic a : (II)Ljava/lang/String;
    //   316: aload #12
    //   318: sipush #19259
    //   321: sipush #-32019
    //   324: invokestatic a : (II)Ljava/lang/String;
    //   327: aload #11
    //   329: sipush #19250
    //   332: sipush #13467
    //   335: invokestatic a : (II)Ljava/lang/String;
    //   338: aload #10
    //   340: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   345: aload #6
    //   347: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   350: athrow
    //   351: aload #5
    //   353: areturn
    // Exception table:
    //   from	to	target	type
    //   5	29	29	java/lang/Exception
    //   36	283	286	java/lang/Exception
    //   257	279	279	java/lang/Exception
  }
  
  private static String readAll(Path paramPath) throws IOException {
    return FileUtils.readFileToString(paramPath, StandardCharsets.UTF_8);
  }
  
  private static boolean lambda$getExternalPath$2(String paramString) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return !paramString.isEmpty();
  }
  
  private static String lambda$getExternalPath$1(String[] paramArrayOfString) {
    return paramArrayOfString[0];
  }
  
  private static boolean lambda$getExternalPath$0(String[] paramArrayOfString) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramArrayOfString.length == 2);
  }
  
  public static void Zc(Zbqc[] paramArrayOfZbqc) {
    Zd = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZV() {
    return Zd;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_1
    //   8: anewarray burp/Zbqc
    //   11: iconst_0
    //   12: istore_3
    //   13: ldc 'öK¢YYêKscY­"äéó¨R¥G$oß½É\ÚÊTT-WU\\tÆ¨w=xÿ.ÔSöÓì±kÓ)éàõ÷ KJ U§¯éÎæä "u S«ÊAÝZ¸5\\rEz<ÁË%Xñ]U\\fwUùbö,ª~Ã®3¦ËN,Ø­¼Z/¿º÷zäíÕ¡x:4K«xÉ_Hô^¾2ÑÖJ¬ñqxcx>µE Ê^R(è55þ¦áWPS8¡ñÑ«nu'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: invokestatic Zc : ([Lburp/Zbqc;)V
    //   25: iconst_2
    //   26: istore_1
    //   27: iconst_m1
    //   28: istore_0
    //   29: bipush #125
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 160
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: ldc 'JÉÖ YõÚédQÞÎ=\\b¹[v'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: iconst_2
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #119
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 160
    //   104: aload #5
    //   106: swap
    //   107: iload_3
    //   108: iinc #3, 1
    //   111: swap
    //   112: aastore
    //   113: iload_0
    //   114: iload_1
    //   115: iadd
    //   116: dup
    //   117: istore_0
    //   118: iload #4
    //   120: if_icmpge -> 132
    //   123: aload_2
    //   124: iload_0
    //   125: invokevirtual charAt : (I)C
    //   128: istore_1
    //   129: goto -> 87
    //   132: aload #5
    //   134: putstatic net/portswigger/swagger/v2/util/RefUtils.a : [Ljava/lang/String;
    //   137: bipush #19
    //   139: anewarray java/lang/String
    //   142: putstatic net/portswigger/swagger/v2/util/RefUtils.b : [Ljava/lang/String;
    //   145: sipush #19249
    //   148: sipush #-12991
    //   151: invokestatic a : (II)Ljava/lang/String;
    //   154: putstatic net/portswigger/swagger/v2/util/RefUtils.REFERENCE_SEPARATOR : Ljava/lang/String;
    //   157: goto -> 316
    //   160: dup_x2
    //   161: pop
    //   162: invokevirtual toCharArray : ()[C
    //   165: dup_x1
    //   166: arraylength
    //   167: dup_x2
    //   168: pop
    //   169: iconst_0
    //   170: istore #6
    //   172: dup2_x1
    //   173: pop2
    //   174: dup_x2
    //   175: iconst_1
    //   176: if_icmpgt -> 276
    //   179: dup2
    //   180: swap
    //   181: iload #6
    //   183: dup2_x1
    //   184: caload
    //   185: swap
    //   186: iload #6
    //   188: bipush #7
    //   190: irem
    //   191: tableswitch default -> 258, 0 -> 228, 1 -> 233, 2 -> 238, 3 -> 243, 4 -> 248, 5 -> 253
    //   228: bipush #88
    //   230: goto -> 260
    //   233: bipush #78
    //   235: goto -> 260
    //   238: bipush #111
    //   240: goto -> 260
    //   243: bipush #76
    //   245: goto -> 260
    //   248: bipush #70
    //   250: goto -> 260
    //   253: bipush #16
    //   255: goto -> 260
    //   258: bipush #10
    //   260: ixor
    //   261: ixor
    //   262: i2c
    //   263: castore
    //   264: iinc #6, 1
    //   267: dup
    //   268: ifne -> 276
    //   271: dup2
    //   272: dup_x1
    //   273: goto -> 183
    //   276: dup2_x1
    //   277: pop2
    //   278: dup_x2
    //   279: iload #6
    //   281: if_icmpgt -> 179
    //   284: pop
    //   285: new java/lang/String
    //   288: dup_x1
    //   289: swap
    //   290: invokespecial <init> : ([C)V
    //   293: invokevirtual intern : ()Ljava/lang/String;
    //   296: swap
    //   297: pop
    //   298: swap
    //   299: tableswitch default -> 46, 0 -> 104
    //   316: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x4B3A) & 0xFFFF;
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
      byte b1 = 8;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\RefUtils.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */