package burp;

import javax.swing.ImageIcon;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztvx {
  private static final String a;
  
  public static ImageIcon ZO(byte paramByte1, byte paramByte2, boolean paramBoolean) {
    Zxpj zxpj = Zs(paramByte1, paramByte2, paramBoolean);
    if (zxpj == null) {
      Zuh.ZT(false, Zqf.Zr, String.format(a, new Object[] { Byte.valueOf(paramByte1), Byte.valueOf(paramByte2), Boolean.valueOf(paramBoolean) }));
      return null;
    } 
    return Zbz3.ZK(zxpj);
  }
  
  static Zxpj Zs(byte paramByte1, byte paramByte2, boolean paramBoolean) {
    switch (paramByte1) {
      case 4:
        switch (paramByte2) {
          case 3:
            return paramBoolean ? Zxpj.SCAN_ISSUE_ADVISORY_HIGH_CERTAIN : Zxpj.SCAN_ISSUE_HIGH_CERTAIN;
          case 2:
            return paramBoolean ? Zxpj.SCAN_ISSUE_ADVISORY_HIGH_FIRM : Zxpj.SCAN_ISSUE_HIGH_FIRM;
          case 1:
            return paramBoolean ? Zxpj.SCAN_ISSUE_ADVISORY_HIGH_TENTATIVE : Zxpj.SCAN_ISSUE_HIGH_TENTATIVE;
        } 
      case 3:
        switch (paramByte2) {
          case 3:
            return paramBoolean ? Zxpj.SCAN_ISSUE_ADVISORY_MEDIUM_CERTAIN : Zxpj.SCAN_ISSUE_MEDIUM_CERTAIN;
          case 2:
            return paramBoolean ? Zxpj.SCAN_ISSUE_ADVISORY_MEDIUM_FIRM : Zxpj.SCAN_ISSUE_MEDIUM_FIRM;
          case 1:
            return paramBoolean ? Zxpj.SCAN_ISSUE_ADVISORY_MEDIUM_TENTATIVE : Zxpj.SCAN_ISSUE_MEDIUM_TENTATIVE;
        } 
      case 2:
        switch (paramByte2) {
          case 3:
            return paramBoolean ? Zxpj.SCAN_ISSUE_ADVISORY_LOW_CERTAIN : Zxpj.SCAN_ISSUE_LOW_CERTAIN;
          case 2:
            return paramBoolean ? Zxpj.SCAN_ISSUE_ADVISORY_LOW_FIRM : Zxpj.SCAN_ISSUE_LOW_FIRM;
          case 1:
            return paramBoolean ? Zxpj.SCAN_ISSUE_ADVISORY_LOW_TENTATIVE : Zxpj.SCAN_ISSUE_LOW_TENTATIVE;
        } 
      case 1:
        switch (paramByte2) {
          case 3:
            return paramBoolean ? Zxpj.SCAN_ISSUE_ADVISORY_INFO_CERTAIN : Zxpj.SCAN_ISSUE_INFO_CERTAIN;
          case 2:
            return paramBoolean ? Zxpj.SCAN_ISSUE_ADVISORY_INFO_FIRM : Zxpj.SCAN_ISSUE_INFO_FIRM;
          case 1:
            return paramBoolean ? Zxpj.SCAN_ISSUE_ADVISORY_INFO_TENTATIVE : Zxpj.SCAN_ISSUE_INFO_TENTATIVE;
        } 
      case -1:
        return paramBoolean ? Zxpj.SCAN_ISSUE_ADVISORY_FALSE_POSITIVE : Zxpj.SCAN_ISSUE_FALSE_POSITIVE;
    } 
    return null;
  }
  
  static {
    // Byte code:
    //   0: bipush #89
    //   2: ldc 'o\\t>QL=#) x"QL=!1o_b'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ztvx.a : Ljava/lang/String;
    //   11: goto -> 154
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
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #30
    //   82: goto -> 112
    //   85: bipush #40
    //   87: goto -> 112
    //   90: bipush #48
    //   92: goto -> 112
    //   95: bipush #46
    //   97: goto -> 112
    //   100: bipush #68
    //   102: goto -> 112
    //   105: bipush #57
    //   107: goto -> 112
    //   110: bipush #38
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztvx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */