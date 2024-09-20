package burp;

import java.time.format.DateTimeFormatter;

public class Zl7g {
  private static final DateTimeFormatter ZN;
  
  private static boolean ZF;
  
  private static final String a;
  
  public static void Zh(Zxym paramZxym, Zeew paramZeew, int paramInt) {}
  
  private static Object[] lambda$encode$1(int paramInt) {
    return new Object[paramInt];
  }
  
  private static Object lambda$encode$0(Object paramObject) {
    return (paramObject instanceof Number) ? paramObject : paramObject.toString().replace("%", a);
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zw : ()Z
    //   3: ifeq -> 10
    //   6: iconst_1
    //   7: invokestatic Zg : (Z)V
    //   10: bipush #82
    //   12: ldc '\\f'
    //   14: iconst_m1
    //   15: goto -> 24
    //   18: putstatic burp/Zl7g.a : Ljava/lang/String;
    //   21: goto -> 166
    //   24: dup_x2
    //   25: pop
    //   26: invokevirtual toCharArray : ()[C
    //   29: dup_x1
    //   30: arraylength
    //   31: dup_x2
    //   32: pop
    //   33: iconst_0
    //   34: istore_0
    //   35: dup2_x1
    //   36: pop2
    //   37: dup_x2
    //   38: iconst_1
    //   39: if_icmpgt -> 140
    //   42: dup2
    //   43: swap
    //   44: iload_0
    //   45: dup2_x1
    //   46: caload
    //   47: swap
    //   48: iload_0
    //   49: bipush #7
    //   51: irem
    //   52: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #123
    //   94: goto -> 124
    //   97: bipush #106
    //   99: goto -> 124
    //   102: bipush #84
    //   104: goto -> 124
    //   107: bipush #115
    //   109: goto -> 124
    //   112: bipush #26
    //   114: goto -> 124
    //   117: bipush #79
    //   119: goto -> 124
    //   122: bipush #75
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 45
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 42
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 18
    //   166: new java/time/format/DateTimeFormatterBuilder
    //   169: dup
    //   170: invokespecial <init> : ()V
    //   173: getstatic java/time/temporal/ChronoField.HOUR_OF_DAY : Ljava/time/temporal/ChronoField;
    //   176: iconst_2
    //   177: invokevirtual appendValue : (Ljava/time/temporal/TemporalField;I)Ljava/time/format/DateTimeFormatterBuilder;
    //   180: bipush #58
    //   182: invokevirtual appendLiteral : (C)Ljava/time/format/DateTimeFormatterBuilder;
    //   185: getstatic java/time/temporal/ChronoField.MINUTE_OF_HOUR : Ljava/time/temporal/ChronoField;
    //   188: iconst_2
    //   189: invokevirtual appendValue : (Ljava/time/temporal/TemporalField;I)Ljava/time/format/DateTimeFormatterBuilder;
    //   192: invokevirtual optionalStart : ()Ljava/time/format/DateTimeFormatterBuilder;
    //   195: bipush #58
    //   197: invokevirtual appendLiteral : (C)Ljava/time/format/DateTimeFormatterBuilder;
    //   200: getstatic java/time/temporal/ChronoField.SECOND_OF_MINUTE : Ljava/time/temporal/ChronoField;
    //   203: iconst_2
    //   204: invokevirtual appendValue : (Ljava/time/temporal/TemporalField;I)Ljava/time/format/DateTimeFormatterBuilder;
    //   207: invokevirtual optionalStart : ()Ljava/time/format/DateTimeFormatterBuilder;
    //   210: getstatic java/time/temporal/ChronoField.NANO_OF_SECOND : Ljava/time/temporal/ChronoField;
    //   213: iconst_3
    //   214: iconst_3
    //   215: iconst_1
    //   216: invokevirtual appendFraction : (Ljava/time/temporal/TemporalField;IIZ)Ljava/time/format/DateTimeFormatterBuilder;
    //   219: invokevirtual toFormatter : ()Ljava/time/format/DateTimeFormatter;
    //   222: putstatic burp/Zl7g.ZN : Ljava/time/format/DateTimeFormatter;
    //   225: return
  }
  
  public static void Zg(boolean paramBoolean) {
    ZF = paramBoolean;
  }
  
  public static boolean Zw() {
    return ZF;
  }
  
  public static boolean Zs() {
    boolean bool = Zw();
    return !bool;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl7g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */