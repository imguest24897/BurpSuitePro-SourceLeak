package burp;

import java.time.format.DateTimeFormatter;

public class Zlqg {
  private static final DateTimeFormatter Zd;
  
  private static int[] ZP;
  
  private static final String a;
  
  public static void Zj(String paramString, Object... paramVarArgs) {
    Zf(null, paramString, paramVarArgs);
  }
  
  public static void Zz(long paramLong, String paramString, Object... paramVarArgs) {
    Zf(Long.toString(paramLong), paramString, paramVarArgs);
  }
  
  private static void Zf(String paramString1, String paramString2, Object[] paramArrayOfObject) {}
  
  private static Object[] lambda$encode$1(int paramInt) {
    return new Object[paramInt];
  }
  
  private static Object lambda$encode$0(Object paramObject) {
    return (paramObject instanceof Number) ? paramObject : paramObject.toString().replace("%", a);
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zy : ()[I
    //   3: ifnull -> 12
    //   6: iconst_4
    //   7: newarray int
    //   9: invokestatic ZH : ([I)V
    //   12: bipush #36
    //   14: ldc 'ec'
    //   16: iconst_m1
    //   17: goto -> 26
    //   20: putstatic burp/Zlqg.a : Ljava/lang/String;
    //   23: goto -> 165
    //   26: dup_x2
    //   27: pop
    //   28: invokevirtual toCharArray : ()[C
    //   31: dup_x1
    //   32: arraylength
    //   33: dup_x2
    //   34: pop
    //   35: iconst_0
    //   36: istore_0
    //   37: dup2_x1
    //   38: pop2
    //   39: dup_x2
    //   40: iconst_1
    //   41: if_icmpgt -> 139
    //   44: dup2
    //   45: swap
    //   46: iload_0
    //   47: dup2_x1
    //   48: caload
    //   49: swap
    //   50: iload_0
    //   51: bipush #7
    //   53: irem
    //   54: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #100
    //   94: goto -> 123
    //   97: bipush #98
    //   99: goto -> 123
    //   102: bipush #78
    //   104: goto -> 123
    //   107: bipush #94
    //   109: goto -> 123
    //   112: bipush #92
    //   114: goto -> 123
    //   117: bipush #67
    //   119: goto -> 123
    //   122: iconst_4
    //   123: ixor
    //   124: ixor
    //   125: i2c
    //   126: castore
    //   127: iinc #0, 1
    //   130: dup
    //   131: ifne -> 139
    //   134: dup2
    //   135: dup_x1
    //   136: goto -> 47
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iload_0
    //   143: if_icmpgt -> 44
    //   146: pop
    //   147: new java/lang/String
    //   150: dup_x1
    //   151: swap
    //   152: invokespecial <init> : ([C)V
    //   155: invokevirtual intern : ()Ljava/lang/String;
    //   158: swap
    //   159: pop
    //   160: swap
    //   161: pop
    //   162: goto -> 20
    //   165: new java/time/format/DateTimeFormatterBuilder
    //   168: dup
    //   169: invokespecial <init> : ()V
    //   172: getstatic java/time/temporal/ChronoField.HOUR_OF_DAY : Ljava/time/temporal/ChronoField;
    //   175: iconst_2
    //   176: invokevirtual appendValue : (Ljava/time/temporal/TemporalField;I)Ljava/time/format/DateTimeFormatterBuilder;
    //   179: bipush #58
    //   181: invokevirtual appendLiteral : (C)Ljava/time/format/DateTimeFormatterBuilder;
    //   184: getstatic java/time/temporal/ChronoField.MINUTE_OF_HOUR : Ljava/time/temporal/ChronoField;
    //   187: iconst_2
    //   188: invokevirtual appendValue : (Ljava/time/temporal/TemporalField;I)Ljava/time/format/DateTimeFormatterBuilder;
    //   191: invokevirtual optionalStart : ()Ljava/time/format/DateTimeFormatterBuilder;
    //   194: bipush #58
    //   196: invokevirtual appendLiteral : (C)Ljava/time/format/DateTimeFormatterBuilder;
    //   199: getstatic java/time/temporal/ChronoField.SECOND_OF_MINUTE : Ljava/time/temporal/ChronoField;
    //   202: iconst_2
    //   203: invokevirtual appendValue : (Ljava/time/temporal/TemporalField;I)Ljava/time/format/DateTimeFormatterBuilder;
    //   206: invokevirtual optionalStart : ()Ljava/time/format/DateTimeFormatterBuilder;
    //   209: getstatic java/time/temporal/ChronoField.NANO_OF_SECOND : Ljava/time/temporal/ChronoField;
    //   212: iconst_0
    //   213: iconst_3
    //   214: iconst_1
    //   215: invokevirtual appendFraction : (Ljava/time/temporal/TemporalField;IIZ)Ljava/time/format/DateTimeFormatterBuilder;
    //   218: invokevirtual toFormatter : ()Ljava/time/format/DateTimeFormatter;
    //   221: putstatic burp/Zlqg.Zd : Ljava/time/format/DateTimeFormatter;
    //   224: return
  }
  
  public static void ZH(int[] paramArrayOfint) {
    ZP = paramArrayOfint;
  }
  
  public static int[] Zy() {
    return ZP;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlqg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */