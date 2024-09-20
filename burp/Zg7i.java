package burp;

import java.util.Map;

public class Zg7i {
  private Map<Zlug, Integer> ZG;
  
  private static int ZD;
  
  Zg7i(Zs6y[] paramArrayOfZs6y) {
    Zp(paramArrayOfZs6y);
  }
  
  public boolean ZV(Zs6y paramZs6y) {
    int i = Zn();
    for (Map.Entry<Zlug, Integer> entry : this.ZG.entrySet()) {
      if (paramZs6y.Zi((Zlug)entry.getKey()) != ((Integer)entry.getValue()).intValue())
        return false; 
      if (i != 0)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zl(++i); 
    return true;
  }
  
  private void Zp(Zs6y[] paramArrayOfZs6y) {
    // Byte code:
    //   0: aload_0
    //   1: new java/util/EnumMap
    //   4: dup
    //   5: ldc burp/Zlug
    //   7: invokespecial <init> : (Ljava/lang/Class;)V
    //   10: putfield ZG : Ljava/util/Map;
    //   13: invokestatic Zi : ()I
    //   16: invokestatic values : ()[Lburp/Zlug;
    //   19: astore_3
    //   20: istore_2
    //   21: aload_3
    //   22: arraylength
    //   23: istore #4
    //   25: iconst_0
    //   26: istore #5
    //   28: iload #5
    //   30: iload #4
    //   32: if_icmpge -> 132
    //   35: aload_3
    //   36: iload #5
    //   38: aaload
    //   39: astore #6
    //   41: aload #6
    //   43: invokevirtual Zg : ()Z
    //   46: ifeq -> 52
    //   49: goto -> 125
    //   52: aload_1
    //   53: iconst_0
    //   54: aaload
    //   55: aload #6
    //   57: invokevirtual Zi : (Lburp/Zlug;)I
    //   60: istore #7
    //   62: iconst_1
    //   63: istore #8
    //   65: iconst_1
    //   66: istore #9
    //   68: iload #9
    //   70: aload_1
    //   71: arraylength
    //   72: if_icmpge -> 103
    //   75: aload_1
    //   76: iload #9
    //   78: aaload
    //   79: aload #6
    //   81: invokevirtual Zi : (Lburp/Zlug;)I
    //   84: iload #7
    //   86: if_icmpeq -> 96
    //   89: iconst_0
    //   90: istore #8
    //   92: iload_2
    //   93: ifne -> 103
    //   96: iinc #9, 1
    //   99: iload_2
    //   100: ifne -> 68
    //   103: iload #8
    //   105: ifeq -> 125
    //   108: aload_0
    //   109: getfield ZG : Ljava/util/Map;
    //   112: aload #6
    //   114: iload #7
    //   116: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   119: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   124: pop
    //   125: iinc #5, 1
    //   128: iload_2
    //   129: ifne -> 28
    //   132: return
  }
  
  public static void Zl(int paramInt) {
    ZD = paramInt;
  }
  
  public static int Zi() {
    return ZD;
  }
  
  public static int Zn() {
    int i = Zi();
    return (i == 0) ? 16 : 0;
  }
  
  static {
    if (Zn() != 0)
      Zl(12); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg7i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */