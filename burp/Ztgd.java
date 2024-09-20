package burp;

public class Ztgd {
  private int ZC = -1;
  
  public static boolean ZF(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    Ztgd ztgd = new Ztgd();
    return ztgd.ZW(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  private boolean ZW(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return (ZI(paramArrayOfbyte, paramInt1, paramInt2) && this.ZC != -1) ? ZI(paramArrayOfbyte, this.ZC + 1, paramInt2) : false;
  }
  
  private boolean ZI(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iconst_1
    //   1: istore #5
    //   3: iconst_0
    //   4: istore #6
    //   6: invokestatic Zt : ()Z
    //   9: iconst_0
    //   10: istore #7
    //   12: istore #4
    //   14: iload_2
    //   15: istore #8
    //   17: iload #8
    //   19: iload_3
    //   20: if_icmpge -> 102
    //   23: aload_1
    //   24: iload #8
    //   26: baload
    //   27: bipush #32
    //   29: if_icmplt -> 41
    //   32: aload_1
    //   33: iload #8
    //   35: baload
    //   36: bipush #127
    //   38: if_icmplt -> 49
    //   41: iconst_0
    //   42: istore #5
    //   44: iload #4
    //   46: ifne -> 102
    //   49: aload_1
    //   50: iload #8
    //   52: baload
    //   53: bipush #38
    //   55: if_icmpne -> 69
    //   58: aload_0
    //   59: iload #8
    //   61: putfield ZC : I
    //   64: iload #4
    //   66: ifne -> 102
    //   69: aload_1
    //   70: iload #8
    //   72: baload
    //   73: bipush #61
    //   75: if_icmpne -> 86
    //   78: iconst_1
    //   79: istore #6
    //   81: iload #4
    //   83: ifne -> 94
    //   86: iload #6
    //   88: ifne -> 94
    //   91: iconst_1
    //   92: istore #7
    //   94: iinc #8, 1
    //   97: iload #4
    //   99: ifne -> 17
    //   102: iload #5
    //   104: ifeq -> 121
    //   107: iload #7
    //   109: ifeq -> 121
    //   112: iload #6
    //   114: ifeq -> 121
    //   117: iconst_1
    //   118: goto -> 122
    //   121: iconst_0
    //   122: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztgd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */