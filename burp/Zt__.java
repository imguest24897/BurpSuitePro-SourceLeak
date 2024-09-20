package burp;

import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zt__ extends Ztn0 {
  private final List<String> ZN;
  
  private static final String a;
  
  Zt__(List<String> paramList) {
    this.ZN = paramList;
    this.Zf = new String[] { a };
    this.ZV = new byte[] { 0 };
    this.Zc = new int[] { 70 };
    this.Zu = true;
  }
  
  String Zo(int paramInt) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.ZN.size())
            try {
              return this.ZN.get(paramInt);
            } catch (Exception exception) {
              Zah.Zl(exception, Zk_.UNEXPECTED);
              return null;
            }  
          return null;
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    return null;
  }
  
  public int getRowCount() {
    return this.ZN.size();
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    String str = this.ZN.get(paramInt1);
    switch (paramInt2) {
      case 0:
        return str;
    } 
    return "";
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #121
    //   2: ldc '4V\\nT'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zt__.a : Ljava/lang/String;
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
    //   80: bipush #11
    //   82: goto -> 112
    //   85: bipush #70
    //   87: goto -> 112
    //   90: bipush #31
    //   92: goto -> 112
    //   95: bipush #72
    //   97: goto -> 112
    //   100: bipush #9
    //   102: goto -> 112
    //   105: bipush #42
    //   107: goto -> 112
    //   110: bipush #72
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt__.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */