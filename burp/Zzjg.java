package burp;

import java.util.ArrayDeque;
import java.util.regex.Pattern;

public abstract class Zzjg {
  private static final String a;
  
  String ZY(String paramString, Pattern paramPattern) {
    return paramPattern.matcher(paramString).replaceAll("");
  }
  
  String ZK(String paramString) {
    return Zm6r.Za.matcher(paramString).replaceAll("");
  }
  
  String Zq(String paramString) {
    String str = Zm6r.ZH.matcher(paramString).replaceAll("");
    return Zm6r.Zf.matcher(str).replaceAll("\n");
  }
  
  int ZH(String paramString) {
    String[] arrayOfString1 = paramString.split(a, -1);
    ArrayDeque<Integer> arrayDeque = new ArrayDeque();
    boolean bool = false;
    Zbqc[] arrayOfZbqc = Zl5i.ZtD();
    int i = 0;
    String[] arrayOfString2 = arrayOfString1;
    int k = arrayOfString2.length;
    byte b = 0;
    while (b < k) {
      String str = arrayOfString2[b];
      bool = false;
      int m = i;
      i = ZY(str, i);
      if (i > m)
        arrayDeque.push(Integer.valueOf(i - m)); 
      if (i < m) {
        int n = m - i;
        while (n > 0) {
          Integer integer = arrayDeque.poll();
          if (integer == null)
            break; 
          int i1 = integer.intValue() - n;
          if (i1 > 0) {
            arrayDeque.push(Integer.valueOf(i1));
            bool = true;
          } 
          n -= integer.intValue();
          if (arrayOfZbqc == null)
            break; 
        } 
      } 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    int j = arrayDeque.size();
    if (bool)
      j--; 
    return Math.max(j, 0);
  }
  
  private int ZY(String paramString, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual toCharArray : ()[C
    //   4: astore #4
    //   6: invokestatic ZtD : ()[Lburp/Zbqc;
    //   9: aload #4
    //   11: arraylength
    //   12: istore #5
    //   14: astore_3
    //   15: iconst_0
    //   16: istore #6
    //   18: iload #6
    //   20: iload #5
    //   22: if_icmpge -> 67
    //   25: aload #4
    //   27: iload #6
    //   29: caload
    //   30: istore #7
    //   32: iload #7
    //   34: bipush #123
    //   36: if_icmpne -> 46
    //   39: iinc #2, 1
    //   42: aload_3
    //   43: ifnonnull -> 60
    //   46: iload #7
    //   48: bipush #125
    //   50: if_icmpne -> 60
    //   53: iload_2
    //   54: ifle -> 60
    //   57: iinc #2, -1
    //   60: iinc #6, 1
    //   63: aload_3
    //   64: ifnonnull -> 18
    //   67: iload_2
    //   68: ireturn
  }
  
  public abstract boolean Zx();
  
  public abstract boolean Zg();
  
  public abstract int ZT();
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: ldc 'HV;c$Fz`/'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/Zzjg.a : Ljava/lang/String;
    //   10: goto -> 153
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 127
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 99, 5 -> 104
    //   80: bipush #63
    //   82: goto -> 111
    //   85: bipush #114
    //   87: goto -> 111
    //   90: bipush #111
    //   92: goto -> 111
    //   95: iconst_3
    //   96: goto -> 111
    //   99: bipush #30
    //   101: goto -> 111
    //   104: bipush #26
    //   106: goto -> 111
    //   109: bipush #44
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 34
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 31
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
    //   150: goto -> 7
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzjg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */