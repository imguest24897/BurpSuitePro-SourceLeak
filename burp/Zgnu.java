package burp;

import java.util.ArrayList;
import java.util.List;

public class Zgnu {
  private static final String ZI;
  
  private final Zsxl Zq;
  
  private final Zzc1 Zr;
  
  public Zgnu(Zsxl paramZsxl, Zzc1 paramZzc1) {
    this.Zq = paramZsxl;
    this.Zr = paramZzc1;
  }
  
  public String ZC(int paramInt, boolean paramBoolean) {
    ArrayList<String> arrayList = new ArrayList();
    byte b = 0;
    int i = Zg13.Zm();
    while (b < paramInt) {
      Zlwu zlwu = new Zlwu(paramBoolean, this.Zq.Zo());
      arrayList.add(this.Zr.ZQ(zlwu));
      b++;
      if (i != 0)
        break; 
    } 
    return Zz(arrayList);
  }
  
  private static String Zz(List<String> paramList) {
    int i = Zg13.Zy();
    if (paramList.isEmpty())
      return null; 
    if (paramList.size() == 1)
      return paramList.get(0); 
    StringBuilder stringBuilder = new StringBuilder();
    for (String str : paramList) {
      stringBuilder.append(str).append(ZI);
      if (i == 0)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  static {
    // Byte code:
    //   0: bipush #52
    //   2: ldc '(L\\fHh4P\\bt'
    //   4: iconst_m1
    //   5: goto -> 12
    //   8: astore_0
    //   9: goto -> 154
    //   12: dup_x2
    //   13: pop
    //   14: invokevirtual toCharArray : ()[C
    //   17: dup_x1
    //   18: arraylength
    //   19: dup_x2
    //   20: pop
    //   21: iconst_0
    //   22: istore_1
    //   23: dup2_x1
    //   24: pop2
    //   25: dup_x2
    //   26: iconst_1
    //   27: if_icmpgt -> 128
    //   30: dup2
    //   31: swap
    //   32: iload_1
    //   33: dup2_x1
    //   34: caload
    //   35: swap
    //   36: iload_1
    //   37: bipush #7
    //   39: irem
    //   40: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #112
    //   82: goto -> 112
    //   85: bipush #69
    //   87: goto -> 112
    //   90: bipush #22
    //   92: goto -> 112
    //   95: bipush #93
    //   97: goto -> 112
    //   100: bipush #82
    //   102: goto -> 112
    //   105: bipush #47
    //   107: goto -> 112
    //   110: bipush #84
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #1, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 33
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_1
    //   132: if_icmpgt -> 30
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
    //   154: aload_0
    //   155: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   158: putstatic burp/Zgnu.ZI : Ljava/lang/String;
    //   161: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgnu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */