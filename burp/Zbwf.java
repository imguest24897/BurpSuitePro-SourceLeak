package burp;

import java.time.format.DateTimeFormatter;
import java.util.Set;

public class Zbwf {
  public static final Set<Zz51> ZH;
  
  private static final Zzjs ZG;
  
  private static final DateTimeFormatter Zt;
  
  private static final String a;
  
  public static void Zh(Zz51 paramZz51, long paramLong, String paramString, Object... paramVarArgs) {
    ZJ(new Ztds(paramZz51, paramLong), paramString, paramVarArgs, Zzjs.INFO);
  }
  
  static void ZJ(Ztds paramZtds, String paramString, Object[] paramArrayOfObject, Zzjs paramZzjs) {}
  
  private static Object[] lambda$encode$1(int paramInt) {
    return new Object[paramInt];
  }
  
  private static Object lambda$encode$0(Object paramObject) {
    return (paramObject instanceof Number) ? paramObject : paramObject.toString().replace("%", a);
  }
  
  static {
    // Byte code:
    //   0: bipush #30
    //   2: ldc 'm'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbwf.a : Ljava/lang/String;
    //   11: goto -> 153
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 104
    //   80: bipush #42
    //   82: goto -> 111
    //   85: bipush #86
    //   87: goto -> 111
    //   90: bipush #18
    //   92: goto -> 111
    //   95: bipush #33
    //   97: goto -> 111
    //   100: iconst_4
    //   101: goto -> 111
    //   104: bipush #51
    //   106: goto -> 111
    //   109: bipush #50
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: getstatic burp/Zz51.PROXY : Lburp/Zz51;
    //   156: invokestatic of : (Ljava/lang/Object;)Ljava/util/Set;
    //   159: putstatic burp/Zbwf.ZH : Ljava/util/Set;
    //   162: getstatic burp/Zzjs.ERROR : Lburp/Zzjs;
    //   165: putstatic burp/Zbwf.ZG : Lburp/Zzjs;
    //   168: new java/time/format/DateTimeFormatterBuilder
    //   171: dup
    //   172: invokespecial <init> : ()V
    //   175: getstatic java/time/temporal/ChronoField.HOUR_OF_DAY : Ljava/time/temporal/ChronoField;
    //   178: iconst_2
    //   179: invokevirtual appendValue : (Ljava/time/temporal/TemporalField;I)Ljava/time/format/DateTimeFormatterBuilder;
    //   182: bipush #58
    //   184: invokevirtual appendLiteral : (C)Ljava/time/format/DateTimeFormatterBuilder;
    //   187: getstatic java/time/temporal/ChronoField.MINUTE_OF_HOUR : Ljava/time/temporal/ChronoField;
    //   190: iconst_2
    //   191: invokevirtual appendValue : (Ljava/time/temporal/TemporalField;I)Ljava/time/format/DateTimeFormatterBuilder;
    //   194: invokevirtual optionalStart : ()Ljava/time/format/DateTimeFormatterBuilder;
    //   197: bipush #58
    //   199: invokevirtual appendLiteral : (C)Ljava/time/format/DateTimeFormatterBuilder;
    //   202: getstatic java/time/temporal/ChronoField.SECOND_OF_MINUTE : Ljava/time/temporal/ChronoField;
    //   205: iconst_2
    //   206: invokevirtual appendValue : (Ljava/time/temporal/TemporalField;I)Ljava/time/format/DateTimeFormatterBuilder;
    //   209: invokevirtual optionalStart : ()Ljava/time/format/DateTimeFormatterBuilder;
    //   212: getstatic java/time/temporal/ChronoField.NANO_OF_SECOND : Ljava/time/temporal/ChronoField;
    //   215: iconst_3
    //   216: iconst_3
    //   217: iconst_1
    //   218: invokevirtual appendFraction : (Ljava/time/temporal/TemporalField;IIZ)Ljava/time/format/DateTimeFormatterBuilder;
    //   221: invokevirtual toFormatter : ()Ljava/time/format/DateTimeFormatter;
    //   224: putstatic burp/Zbwf.Zt : Ljava/time/format/DateTimeFormatter;
    //   227: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbwf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */