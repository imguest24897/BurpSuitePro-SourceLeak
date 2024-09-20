package burp;

import java.text.DateFormat;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Zmqo extends Zm23 {
  private static final DateFormat ZK = DateFormat.getDateInstance();
  
  private static final DateTimeFormatter ZY = Zlb0.ZH;
  
  private static final DateTimeFormatter ZM = Zlb0.ZV;
  
  private static final DateTimeFormatter ZE = Zlb0.Zo;
  
  public static final ZoneId ZW = ZoneId.systemDefault();
  
  public void Zt(Object paramObject) {
    // Byte code:
    //   0: invokestatic ZO : ()Z
    //   3: aload_1
    //   4: astore_3
    //   5: istore_2
    //   6: iconst_0
    //   7: istore #4
    //   9: aload_3
    //   10: iload #4
    //   12: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   17: tableswitch default -> 172, -1 -> 172, 0 -> 56, 1 -> 84, 2 -> 106, 3 -> 128, 4 -> 150
    //   56: aload_3
    //   57: checkcast java/time/Instant
    //   60: astore #5
    //   62: aload_0
    //   63: getstatic burp/Zmqo.ZM : Ljava/time/format/DateTimeFormatter;
    //   66: aload #5
    //   68: getstatic burp/Zmqo.ZW : Ljava/time/ZoneId;
    //   71: invokevirtual atZone : (Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;
    //   74: invokevirtual format : (Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;
    //   77: invokevirtual setText : (Ljava/lang/String;)V
    //   80: iload_2
    //   81: ifne -> 182
    //   84: aload_3
    //   85: checkcast java/time/chrono/ChronoLocalDate
    //   88: astore #6
    //   90: aload_0
    //   91: getstatic burp/Zmqo.ZY : Ljava/time/format/DateTimeFormatter;
    //   94: aload #6
    //   96: invokevirtual format : (Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;
    //   99: invokevirtual setText : (Ljava/lang/String;)V
    //   102: iload_2
    //   103: ifne -> 182
    //   106: aload_3
    //   107: checkcast java/time/chrono/ChronoLocalDateTime
    //   110: astore #7
    //   112: aload_0
    //   113: getstatic burp/Zmqo.ZM : Ljava/time/format/DateTimeFormatter;
    //   116: aload #7
    //   118: invokevirtual format : (Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;
    //   121: invokevirtual setText : (Ljava/lang/String;)V
    //   124: iload_2
    //   125: ifne -> 182
    //   128: aload_3
    //   129: checkcast java/time/chrono/ChronoZonedDateTime
    //   132: astore #8
    //   134: aload_0
    //   135: getstatic burp/Zmqo.ZE : Ljava/time/format/DateTimeFormatter;
    //   138: aload #8
    //   140: invokevirtual format : (Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;
    //   143: invokevirtual setText : (Ljava/lang/String;)V
    //   146: iload_2
    //   147: ifne -> 182
    //   150: aload_3
    //   151: checkcast java/util/Date
    //   154: astore #9
    //   156: aload_0
    //   157: getstatic burp/Zmqo.ZK : Ljava/text/DateFormat;
    //   160: aload #9
    //   162: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
    //   165: invokevirtual setText : (Ljava/lang/String;)V
    //   168: iload_2
    //   169: ifne -> 182
    //   172: aload_0
    //   173: aload_1
    //   174: ldc ''
    //   176: invokestatic toString : (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    //   179: invokevirtual setText : (Ljava/lang/String;)V
    //   182: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmqo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */