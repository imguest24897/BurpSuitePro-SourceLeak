package net.portswigger.swagger.v1.parser;

import com.fasterxml.Zor.Zb;
import java.io.IOException;
import java.util.List;
import net.portswigger.swagger.v1.models.Swagger;
import net.portswigger.swagger.v1.models.auth.AuthorizationValue;
import net.portswigger.swagger.v1.parser.util.DeserializationUtils;
import net.portswigger.swagger.v1.parser.util.SwaggerDeserializationResult;
import net.portswigger.swagger.v1.parser.util.SwaggerDeserializer;
import net.portswigger.swagger.v1.util.Json;

public class Swagger20Parser implements SwaggerParserExtension {
  private static final String[] a;
  
  private static final String[] b;
  
  public SwaggerDeserializationResult readWithInfo(Zb paramZb) {
    SwaggerDeserializer swaggerDeserializer = new SwaggerDeserializer();
    return swaggerDeserializer.deserialize(paramZb);
  }
  
  public SwaggerDeserializationResult readWithInfo(String paramString, List<AuthorizationValue> paramList) {
    // Byte code:
    //   0: invokestatic ZL : ()[Ljava/lang/String;
    //   3: new net/portswigger/swagger/v1/parser/util/SwaggerDeserializationResult
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore #5
    //   12: astore_3
    //   13: aload_1
    //   14: sipush #16997
    //   17: sipush #-15854
    //   20: invokestatic a : (II)Ljava/lang/String;
    //   23: ldc '/'
    //   25: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   28: astore_1
    //   29: aload_1
    //   30: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   33: sipush #16999
    //   36: sipush #-28955
    //   39: invokestatic a : (II)Ljava/lang/String;
    //   42: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   45: ifeq -> 59
    //   48: aload_1
    //   49: aload_2
    //   50: invokestatic urlToString : (Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    //   53: astore #4
    //   55: aload_3
    //   56: ifnonnull -> 159
    //   59: sipush #16992
    //   62: sipush #5327
    //   65: invokestatic a : (II)Ljava/lang/String;
    //   68: astore #6
    //   70: aload_1
    //   71: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   74: sipush #17006
    //   77: sipush #10214
    //   80: invokestatic a : (II)Ljava/lang/String;
    //   83: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   86: ifeq -> 102
    //   89: aload_1
    //   90: invokestatic create : (Ljava/lang/String;)Ljava/net/URI;
    //   93: invokestatic get : (Ljava/net/URI;)Ljava/nio/file/Path;
    //   96: astore #7
    //   98: aload_3
    //   99: ifnonnull -> 112
    //   102: aload_1
    //   103: iconst_0
    //   104: anewarray java/lang/String
    //   107: invokestatic get : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
    //   110: astore #7
    //   112: aload #7
    //   114: iconst_0
    //   115: anewarray java/nio/file/LinkOption
    //   118: invokestatic exists : (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
    //   121: ifeq -> 138
    //   124: aload #7
    //   126: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   129: invokestatic readFileToString : (Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/lang/String;
    //   132: astore #4
    //   134: aload_3
    //   135: ifnonnull -> 159
    //   138: new java/io/IOException
    //   141: dup
    //   142: sipush #17005
    //   145: sipush #-8042
    //   148: invokestatic a : (II)Ljava/lang/String;
    //   151: invokespecial <init> : (Ljava/lang/String;)V
    //   154: athrow
    //   155: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   158: athrow
    //   159: aload #4
    //   161: invokevirtual trim : ()Ljava/lang/String;
    //   164: ldc '{'
    //   166: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   169: ifeq -> 190
    //   172: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   175: astore #7
    //   177: aload #7
    //   179: aload #4
    //   181: invokevirtual Za : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   184: astore #6
    //   186: aload_3
    //   187: ifnonnull -> 200
    //   190: aload_0
    //   191: aload #4
    //   193: aload #5
    //   195: invokevirtual deserializeYaml : (Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializationResult;)Lcom/fasterxml/Zor/Zb;
    //   198: astore #6
    //   200: aload_0
    //   201: aload #6
    //   203: invokevirtual readWithInfo : (Lcom/fasterxml/Zor/Zb;)Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializationResult;
    //   206: areturn
    //   207: astore #6
    //   209: aload #5
    //   211: aload_1
    //   212: sipush #17000
    //   215: sipush #25353
    //   218: invokestatic a : (II)Ljava/lang/String;
    //   221: swap
    //   222: sipush #16998
    //   225: sipush #-9410
    //   228: invokestatic a : (II)Ljava/lang/String;
    //   231: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   236: invokevirtual message : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializationResult;
    //   239: pop
    //   240: aload #5
    //   242: areturn
    //   243: astore #6
    //   245: aload #5
    //   247: aload_1
    //   248: sipush #17001
    //   251: sipush #11084
    //   254: invokestatic a : (II)Ljava/lang/String;
    //   257: swap
    //   258: ldc '`'
    //   260: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   265: invokevirtual message : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializationResult;
    //   268: pop
    //   269: aload #5
    //   271: areturn
    // Exception table:
    //   from	to	target	type
    //   13	206	207	javax/net/ssl/SSLHandshakeException
    //   13	206	243	java/lang/Exception
    //   134	155	155	javax/net/ssl/SSLHandshakeException
  }
  
  protected Zb deserializeYaml(String paramString) throws IOException {
    return deserializeYaml(paramString, null);
  }
  
  protected Zb deserializeYaml(String paramString, SwaggerDeserializationResult paramSwaggerDeserializationResult) throws IOException {
    return DeserializationUtils.readYamlTree(paramString, paramSwaggerDeserializationResult);
  }
  
  public Swagger read(String paramString, List<AuthorizationValue> paramList) throws IOException {
    // Byte code:
    //   0: invokestatic ZL : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: aload_1
    //   5: sipush #17004
    //   8: sipush #-2396
    //   11: invokestatic a : (II)Ljava/lang/String;
    //   14: ldc '/'
    //   16: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   19: astore_1
    //   20: aload_1
    //   21: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   24: sipush #17003
    //   27: sipush #-22041
    //   30: invokestatic a : (II)Ljava/lang/String;
    //   33: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   36: ifeq -> 50
    //   39: aload_1
    //   40: aload_2
    //   41: invokestatic urlToString : (Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    //   44: astore #4
    //   46: aload_3
    //   47: ifnonnull -> 150
    //   50: sipush #17006
    //   53: sipush #10214
    //   56: invokestatic a : (II)Ljava/lang/String;
    //   59: astore #5
    //   61: aload_1
    //   62: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   65: sipush #17006
    //   68: sipush #10214
    //   71: invokestatic a : (II)Ljava/lang/String;
    //   74: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   77: ifeq -> 93
    //   80: aload_1
    //   81: invokestatic create : (Ljava/lang/String;)Ljava/net/URI;
    //   84: invokestatic get : (Ljava/net/URI;)Ljava/nio/file/Path;
    //   87: astore #6
    //   89: aload_3
    //   90: ifnonnull -> 103
    //   93: aload_1
    //   94: iconst_0
    //   95: anewarray java/lang/String
    //   98: invokestatic get : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
    //   101: astore #6
    //   103: aload #6
    //   105: iconst_0
    //   106: anewarray java/nio/file/LinkOption
    //   109: invokestatic exists : (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
    //   112: ifeq -> 129
    //   115: aload #6
    //   117: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   120: invokestatic readFileToString : (Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/lang/String;
    //   123: astore #4
    //   125: aload_3
    //   126: ifnonnull -> 150
    //   129: new java/io/IOException
    //   132: dup
    //   133: sipush #16996
    //   136: sipush #-16664
    //   139: invokestatic a : (II)Ljava/lang/String;
    //   142: invokespecial <init> : (Ljava/lang/String;)V
    //   145: athrow
    //   146: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   149: athrow
    //   150: aload_0
    //   151: aload #4
    //   153: invokevirtual convertToSwagger : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Swagger;
    //   156: areturn
    //   157: astore #4
    //   159: sipush #17002
    //   162: sipush #-23911
    //   165: invokestatic a : (II)Ljava/lang/String;
    //   168: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   171: ifnull -> 186
    //   174: aload #4
    //   176: invokevirtual printStackTrace : ()V
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   185: athrow
    //   186: aconst_null
    //   187: areturn
    // Exception table:
    //   from	to	target	type
    //   4	156	157	java/lang/Exception
    //   125	146	146	java/lang/Exception
    //   159	179	182	java/lang/Exception
  }
  
  private Swagger convertToSwagger(String paramString) throws IOException {
    // Byte code:
    //   0: invokestatic ZL : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: ifnull -> 108
    //   8: aload_1
    //   9: invokevirtual trim : ()Ljava/lang/String;
    //   12: ldc '{'
    //   14: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   17: ifeq -> 43
    //   20: goto -> 27
    //   23: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   26: athrow
    //   27: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   30: astore #4
    //   32: aload #4
    //   34: aload_1
    //   35: invokevirtual Za : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   38: astore_3
    //   39: aload_2
    //   40: ifnonnull -> 49
    //   43: aload_0
    //   44: aload_1
    //   45: invokevirtual deserializeYaml : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   48: astore_3
    //   49: aload_3
    //   50: ifnonnull -> 59
    //   53: aconst_null
    //   54: areturn
    //   55: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   58: athrow
    //   59: aload_3
    //   60: sipush #17007
    //   63: sipush #13516
    //   66: invokestatic a : (II)Ljava/lang/String;
    //   69: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   72: astore #4
    //   74: aload #4
    //   76: ifnonnull -> 85
    //   79: aconst_null
    //   80: areturn
    //   81: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   84: athrow
    //   85: new net/portswigger/swagger/v1/parser/util/SwaggerDeserializer
    //   88: dup
    //   89: invokespecial <init> : ()V
    //   92: aload_3
    //   93: invokevirtual deserialize : (Lcom/fasterxml/Zor/Zb;)Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializationResult;
    //   96: astore #5
    //   98: aload #5
    //   100: invokevirtual getSwagger : ()Lnet/portswigger/swagger/v1/models/Swagger;
    //   103: astore #6
    //   105: aload #6
    //   107: areturn
    //   108: aconst_null
    //   109: areturn
    // Exception table:
    //   from	to	target	type
    //   4	20	23	java/io/IOException
    //   49	55	55	java/io/IOException
    //   74	81	81	java/io/IOException
  }
  
  public Swagger parse(String paramString) throws IOException {
    return convertToSwagger(paramString);
  }
  
  public Swagger read(Zb paramZb) throws IOException {
    try {
      if (paramZb == null)
        return null; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      return (Swagger)Json.mapper().Zb(paramZb, Swagger.class);
    } catch (Exception exception) {
      SwaggerDeserializationResult swaggerDeserializationResult = (new SwaggerDeserializer()).deserialize(paramZb);
      return swaggerDeserializationResult.getSwagger();
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'DYÒaÔIôÈ8è3ù¶ÐrtÀñ´óYPòlÛ-×äþK<DÀ:£«~ªøGqm¬ÆYÀYGÎ|Þ\\f¬u'  }\\nÃêðNó>(ªôj"ôaº)«Æ9ÅÖ>êâHg½ÉF6ôT¤ßËAÇ÷ñ¯~ö¨¿Á¸^gýøH~y\\nÐ¥@I@@]µ~ï×èzOôõCZXªx¾;Ó7æ;Ø-K{Nl¨Ê)ñ!òÿ°~%¸Ð]\\t@!ô@èM®)J±QâµTÌQA©ïäUâÚ5Rki½?÷mûv|ÇÓEà³\\r'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #19
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc 'Q^:G>Åàn'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_4
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #63
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
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
    //   127: putstatic net/portswigger/swagger/v1/parser/Swagger20Parser.a : [Ljava/lang/String;
    //   130: bipush #13
    //   132: anewarray java/lang/String
    //   135: putstatic net/portswigger/swagger/v1/parser/Swagger20Parser.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #110
    //   214: goto -> 243
    //   217: iconst_4
    //   218: goto -> 243
    //   221: bipush #20
    //   223: goto -> 243
    //   226: bipush #94
    //   228: goto -> 243
    //   231: bipush #87
    //   233: goto -> 243
    //   236: bipush #115
    //   238: goto -> 243
    //   241: bipush #49
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x426C) & 0xFFFF;
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
      char c = 'ë';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parser\Swagger20Parser.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */