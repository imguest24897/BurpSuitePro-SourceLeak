package burp;

import java.util.Collections;
import java.util.List;

public class Zxeb {
  public static void ZN(List<Zzm4> paramList, int paramInt) {
    if (paramInt == 0 || paramList.isEmpty())
      return; 
    Collections.shuffle(paramList);
    long l1 = paramList.stream().mapToInt(Zxeb::lambda$accommodateDelta$0).sum();
    long l2 = paramList.stream().mapToInt(Zxeb::lambda$accommodateDelta$1).sum();
    Ztdy ztdy = (Ztdy)((l1 + paramInt < l2) ? new Ztgo(paramList) : new Ztd5(paramList));
    ZN(l1 + paramInt, ztdy);
  }
  
  private static void ZN(long paramLong, Ztdy paramZtdy) {
    // Byte code:
    //   0: invokestatic ZW : ()Ljava/lang/String;
    //   3: lconst_0
    //   4: lstore #4
    //   6: lconst_0
    //   7: lstore #6
    //   9: aload_2
    //   10: invokevirtual ZX : ()I
    //   13: istore #8
    //   15: iconst_0
    //   16: istore #9
    //   18: astore_3
    //   19: iload #9
    //   21: iload #8
    //   23: if_icmpge -> 57
    //   26: lload #4
    //   28: aload_2
    //   29: iload #9
    //   31: invokevirtual Zr : (I)I
    //   34: i2l
    //   35: ladd
    //   36: lstore #4
    //   38: lload #6
    //   40: aload_2
    //   41: iload #9
    //   43: invokevirtual Zw : (I)I
    //   46: i2l
    //   47: ladd
    //   48: lstore #6
    //   50: iinc #9, 1
    //   53: aload_3
    //   54: ifnull -> 19
    //   57: lload #4
    //   59: lload_0
    //   60: invokestatic max : (JJ)J
    //   63: lload #6
    //   65: invokestatic min : (JJ)J
    //   68: lstore #9
    //   70: lload #9
    //   72: lstore #11
    //   74: lload #4
    //   76: lstore #13
    //   78: iconst_0
    //   79: istore #15
    //   81: iload #15
    //   83: iload #8
    //   85: if_icmpge -> 195
    //   88: aload_2
    //   89: iload #15
    //   91: invokevirtual Zr : (I)I
    //   94: istore #16
    //   96: aload_2
    //   97: iload #15
    //   99: invokevirtual Zw : (I)I
    //   102: istore #17
    //   104: lload #4
    //   106: lload #6
    //   108: lcmp
    //   109: ifne -> 120
    //   112: iload #16
    //   114: istore #18
    //   116: aload_3
    //   117: ifnull -> 156
    //   120: iload #15
    //   122: iload #8
    //   124: iconst_1
    //   125: isub
    //   126: if_icmpne -> 138
    //   129: lload #9
    //   131: l2i
    //   132: istore #18
    //   134: aload_3
    //   135: ifnull -> 156
    //   138: aload_2
    //   139: iload #15
    //   141: lload #11
    //   143: lload #9
    //   145: lload #13
    //   147: lload #4
    //   149: lload #6
    //   151: invokevirtual Zu : (IJJJJJ)I
    //   154: istore #18
    //   156: aload_2
    //   157: iload #18
    //   159: iload #15
    //   161: invokevirtual ZV : (II)V
    //   164: lload #9
    //   166: iload #18
    //   168: i2l
    //   169: lsub
    //   170: lstore #9
    //   172: lload #4
    //   174: iload #16
    //   176: i2l
    //   177: lsub
    //   178: lstore #4
    //   180: lload #6
    //   182: iload #17
    //   184: i2l
    //   185: lsub
    //   186: lstore #6
    //   188: iinc #15, 1
    //   191: aload_3
    //   192: ifnull -> 81
    //   195: return
  }
  
  private static int lambda$accommodateDelta$1(Zzm4 paramZzm4) {
    return paramZzm4.ZUS().getPreferredWidth();
  }
  
  private static int lambda$accommodateDelta$0(Zzm4 paramZzm4) {
    return paramZzm4.ZUS().getWidth();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxeb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */