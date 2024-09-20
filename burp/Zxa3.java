package burp;

import java.io.IOException;
import java.io.InputStream;
import net.portswigger.Zae;
import net.portswigger.Zah;
import net.portswigger.Zc7;
import net.portswigger.Zk_;

public class Zxa3 {
  static final String ZO;
  
  static final String Zs;
  
  private static String Zo(String paramString) {
    InputStream inputStream = Zxa3.class.getResourceAsStream(paramString);
    try {
      return new String(Zc7.Zs(inputStream), Zae.Z_);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.UNEXPECTED);
      return "";
    } 
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'XPHIN\\nFj^~SW4\\rXVSUO^O}h'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #34
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #81
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 128
    //   39: aload_0
    //   40: swap
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: swap
    //   47: aastore
    //   48: iload_1
    //   49: iload_2
    //   50: iadd
    //   51: dup
    //   52: istore_1
    //   53: iload #5
    //   55: if_icmpge -> 67
    //   58: aload_3
    //   59: iload_1
    //   60: invokevirtual charAt : (I)C
    //   63: istore_2
    //   64: goto -> 22
    //   67: ldc 'LYi!ayx;%6w%[o.'?+Obf(!k$cr='
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: iconst_2
    //   77: istore_2
    //   78: iconst_m1
    //   79: istore_1
    //   80: bipush #96
    //   82: iinc #1, 1
    //   85: aload_3
    //   86: iload_1
    //   87: dup
    //   88: iload_2
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 128
    //   97: aload_0
    //   98: swap
    //   99: iload #4
    //   101: iinc #4, 1
    //   104: swap
    //   105: aastore
    //   106: iload_1
    //   107: iload_2
    //   108: iadd
    //   109: dup
    //   110: istore_1
    //   111: iload #5
    //   113: if_icmpge -> 125
    //   116: aload_3
    //   117: iload_1
    //   118: invokevirtual charAt : (I)C
    //   121: istore_2
    //   122: goto -> 80
    //   125: goto -> 284
    //   128: dup_x2
    //   129: pop
    //   130: invokevirtual toCharArray : ()[C
    //   133: dup_x1
    //   134: arraylength
    //   135: dup_x2
    //   136: pop
    //   137: iconst_0
    //   138: istore #6
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iconst_1
    //   144: if_icmpgt -> 244
    //   147: dup2
    //   148: swap
    //   149: iload #6
    //   151: dup2_x1
    //   152: caload
    //   153: swap
    //   154: iload #6
    //   156: bipush #7
    //   158: irem
    //   159: tableswitch default -> 226, 0 -> 196, 1 -> 201, 2 -> 206, 3 -> 211, 4 -> 216, 5 -> 221
    //   196: bipush #38
    //   198: goto -> 228
    //   201: bipush #51
    //   203: goto -> 228
    //   206: bipush #100
    //   208: goto -> 228
    //   211: bipush #106
    //   213: goto -> 228
    //   216: bipush #119
    //   218: goto -> 228
    //   221: bipush #106
    //   223: goto -> 228
    //   226: bipush #41
    //   228: ixor
    //   229: ixor
    //   230: i2c
    //   231: castore
    //   232: iinc #6, 1
    //   235: dup
    //   236: ifne -> 244
    //   239: dup2
    //   240: dup_x1
    //   241: goto -> 151
    //   244: dup2_x1
    //   245: pop2
    //   246: dup_x2
    //   247: iload #6
    //   249: if_icmpgt -> 147
    //   252: pop
    //   253: new java/lang/String
    //   256: dup_x1
    //   257: swap
    //   258: invokespecial <init> : ([C)V
    //   261: invokevirtual intern : ()Ljava/lang/String;
    //   264: swap
    //   265: pop
    //   266: swap
    //   267: tableswitch default -> 39, 0 -> 97
    //   284: aload_0
    //   285: iconst_3
    //   286: aaload
    //   287: invokestatic Zo : (Ljava/lang/String;)Ljava/lang/String;
    //   290: ldc '\\n'
    //   292: aload_0
    //   293: iconst_2
    //   294: aaload
    //   295: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   298: putstatic burp/Zxa3.ZO : Ljava/lang/String;
    //   301: aload_0
    //   302: iconst_0
    //   303: aaload
    //   304: invokestatic Zo : (Ljava/lang/String;)Ljava/lang/String;
    //   307: ldc '\\n'
    //   309: aload_0
    //   310: iconst_1
    //   311: aaload
    //   312: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   315: putstatic burp/Zxa3.Zs : Ljava/lang/String;
    //   318: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxa3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */