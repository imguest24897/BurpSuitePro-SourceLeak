package net.portswigger.swagger;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtils {
  private static final int NOT_FOUND = -1;
  
  private static final String[] EMPTY_STRING_ARRAY = new String[0];
  
  public static String readFileToString(Path paramPath, Charset paramCharset) throws IOException {
    return Files.readString(paramPath, paramCharset);
  }
  
  public static boolean wildcardMatch(String paramString1, String paramString2) {
    // Byte code:
    //   0: invokestatic ZU : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: ifnonnull -> 14
    //   8: aload_1
    //   9: ifnonnull -> 14
    //   12: iconst_1
    //   13: ireturn
    //   14: aload_0
    //   15: ifnull -> 22
    //   18: aload_1
    //   19: ifnonnull -> 24
    //   22: iconst_0
    //   23: ireturn
    //   24: aload_1
    //   25: invokestatic splitOnTokens : (Ljava/lang/String;)[Ljava/lang/String;
    //   28: astore_3
    //   29: iconst_0
    //   30: istore #4
    //   32: iconst_0
    //   33: istore #5
    //   35: iconst_0
    //   36: istore #6
    //   38: new java/util/ArrayDeque
    //   41: dup
    //   42: aload_3
    //   43: arraylength
    //   44: invokespecial <init> : (I)V
    //   47: astore #7
    //   49: aload #7
    //   51: invokeinterface isEmpty : ()Z
    //   56: ifne -> 86
    //   59: aload #7
    //   61: invokeinterface pop : ()Ljava/lang/Object;
    //   66: checkcast [I
    //   69: astore #8
    //   71: aload #8
    //   73: iconst_0
    //   74: iaload
    //   75: istore #6
    //   77: aload #8
    //   79: iconst_1
    //   80: iaload
    //   81: istore #5
    //   83: iconst_1
    //   84: istore #4
    //   86: iload #6
    //   88: aload_3
    //   89: arraylength
    //   90: if_icmpge -> 271
    //   93: aload_3
    //   94: iload #6
    //   96: aaload
    //   97: ldc '?'
    //   99: invokevirtual equals : (Ljava/lang/Object;)Z
    //   102: ifeq -> 128
    //   105: iinc #5, 1
    //   108: iload #5
    //   110: aload_0
    //   111: invokevirtual length : ()I
    //   114: if_icmple -> 121
    //   117: aload_2
    //   118: ifnonnull -> 271
    //   121: iconst_0
    //   122: istore #4
    //   124: aload_2
    //   125: ifnonnull -> 264
    //   128: aload_3
    //   129: iload #6
    //   131: aaload
    //   132: ldc '*'
    //   134: invokevirtual equals : (Ljava/lang/Object;)Z
    //   137: ifeq -> 162
    //   140: iconst_1
    //   141: istore #4
    //   143: iload #6
    //   145: aload_3
    //   146: arraylength
    //   147: iconst_1
    //   148: isub
    //   149: if_icmpne -> 264
    //   152: aload_0
    //   153: invokevirtual length : ()I
    //   156: istore #5
    //   158: aload_2
    //   159: ifnonnull -> 264
    //   162: iload #4
    //   164: ifeq -> 232
    //   167: aload_0
    //   168: iload #5
    //   170: aload_3
    //   171: iload #6
    //   173: aaload
    //   174: invokestatic checkIndexOf : (Ljava/lang/String;ILjava/lang/String;)I
    //   177: istore #5
    //   179: iload #5
    //   181: iconst_m1
    //   182: if_icmpne -> 189
    //   185: aload_2
    //   186: ifnonnull -> 271
    //   189: aload_0
    //   190: iload #5
    //   192: iconst_1
    //   193: iadd
    //   194: aload_3
    //   195: iload #6
    //   197: aaload
    //   198: invokestatic checkIndexOf : (Ljava/lang/String;ILjava/lang/String;)I
    //   201: istore #8
    //   203: iload #8
    //   205: iflt -> 228
    //   208: aload #7
    //   210: iconst_2
    //   211: newarray int
    //   213: dup
    //   214: iconst_0
    //   215: iload #6
    //   217: iastore
    //   218: dup
    //   219: iconst_1
    //   220: iload #8
    //   222: iastore
    //   223: invokeinterface push : (Ljava/lang/Object;)V
    //   228: aload_2
    //   229: ifnonnull -> 249
    //   232: aload_0
    //   233: iload #5
    //   235: aload_3
    //   236: iload #6
    //   238: aaload
    //   239: invokestatic checkRegionMatches : (Ljava/lang/String;ILjava/lang/String;)Z
    //   242: ifne -> 249
    //   245: aload_2
    //   246: ifnonnull -> 271
    //   249: iload #5
    //   251: aload_3
    //   252: iload #6
    //   254: aaload
    //   255: invokevirtual length : ()I
    //   258: iadd
    //   259: istore #5
    //   261: iconst_0
    //   262: istore #4
    //   264: iinc #6, 1
    //   267: aload_2
    //   268: ifnonnull -> 86
    //   271: iload #6
    //   273: aload_3
    //   274: arraylength
    //   275: if_icmpne -> 289
    //   278: iload #5
    //   280: aload_0
    //   281: invokevirtual length : ()I
    //   284: if_icmpne -> 289
    //   287: iconst_1
    //   288: ireturn
    //   289: aload #7
    //   291: invokeinterface isEmpty : ()Z
    //   296: ifeq -> 49
    //   299: iconst_0
    //   300: ireturn
  }
  
  private static int checkIndexOf(String paramString1, int paramInt, String paramString2) {
    String str = StringUtils.ZU();
    if (paramString1 != null && paramString2 != null) {
      int i = paramString1.length() - paramString2.length();
      if (i >= paramInt) {
        int j = paramInt;
        while (j <= i) {
          if (checkRegionMatches(paramString1, j, paramString2))
            return j; 
          j++;
          if (str == null)
            break; 
        } 
      } 
    } 
    return -1;
  }
  
  private static boolean checkRegionMatches(String paramString1, int paramInt, String paramString2) {
    return (paramString1 != null && paramString2 != null && paramString1.regionMatches(false, paramInt, paramString2, 0, paramString2.length()));
  }
  
  private static String[] splitOnTokens(String paramString) {
    // Byte code:
    //   0: invokestatic ZU : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: bipush #63
    //   7: invokevirtual indexOf : (I)I
    //   10: iconst_m1
    //   11: if_icmpne -> 33
    //   14: aload_0
    //   15: bipush #42
    //   17: invokevirtual indexOf : (I)I
    //   20: iconst_m1
    //   21: if_icmpne -> 33
    //   24: iconst_1
    //   25: anewarray java/lang/String
    //   28: dup
    //   29: iconst_0
    //   30: aload_0
    //   31: aastore
    //   32: areturn
    //   33: aload_0
    //   34: invokevirtual toCharArray : ()[C
    //   37: astore_2
    //   38: new java/util/ArrayList
    //   41: dup
    //   42: invokespecial <init> : ()V
    //   45: astore_3
    //   46: new java/lang/StringBuilder
    //   49: dup
    //   50: invokespecial <init> : ()V
    //   53: astore #4
    //   55: iconst_0
    //   56: istore #5
    //   58: aload_2
    //   59: astore #6
    //   61: aload #6
    //   63: arraylength
    //   64: istore #7
    //   66: iconst_0
    //   67: istore #8
    //   69: iload #8
    //   71: iload #7
    //   73: if_icmpge -> 182
    //   76: aload #6
    //   78: iload #8
    //   80: caload
    //   81: istore #9
    //   83: iload #9
    //   85: bipush #63
    //   87: if_icmpeq -> 97
    //   90: iload #9
    //   92: bipush #42
    //   94: if_icmpne -> 163
    //   97: aload #4
    //   99: invokevirtual length : ()I
    //   102: ifeq -> 123
    //   105: aload_3
    //   106: aload #4
    //   108: invokevirtual toString : ()Ljava/lang/String;
    //   111: invokeinterface add : (Ljava/lang/Object;)Z
    //   116: pop
    //   117: aload #4
    //   119: iconst_0
    //   120: invokevirtual setLength : (I)V
    //   123: iload #9
    //   125: bipush #63
    //   127: if_icmpne -> 143
    //   130: aload_3
    //   131: ldc '?'
    //   133: invokeinterface add : (Ljava/lang/Object;)Z
    //   138: pop
    //   139: aload_1
    //   140: ifnonnull -> 171
    //   143: iload #5
    //   145: bipush #42
    //   147: if_icmpeq -> 171
    //   150: aload_3
    //   151: ldc '*'
    //   153: invokeinterface add : (Ljava/lang/Object;)Z
    //   158: pop
    //   159: aload_1
    //   160: ifnonnull -> 171
    //   163: aload #4
    //   165: iload #9
    //   167: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   170: pop
    //   171: iload #9
    //   173: istore #5
    //   175: iinc #8, 1
    //   178: aload_1
    //   179: ifnonnull -> 69
    //   182: aload #4
    //   184: invokevirtual length : ()I
    //   187: ifeq -> 202
    //   190: aload_3
    //   191: aload #4
    //   193: invokevirtual toString : ()Ljava/lang/String;
    //   196: invokeinterface add : (Ljava/lang/Object;)Z
    //   201: pop
    //   202: aload_3
    //   203: getstatic net/portswigger/swagger/FileUtils.EMPTY_STRING_ARRAY : [Ljava/lang/String;
    //   206: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   211: checkcast [Ljava/lang/String;
    //   214: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\FileUtils.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */