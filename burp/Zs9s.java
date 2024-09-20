package burp;

import java.awt.Window;
import java.net.InetAddress;
import java.util.List;

public interface Zs9s extends Zgd8<Zg5n>, Zxoo {
  public static final String[] Zk;
  
  public static final String[] ZP;
  
  String Zm();
  
  boolean Zc();
  
  void Zp(Zs9s paramZs9s, Window paramWindow);
  
  boolean Zy(Window paramWindow);
  
  void Zw();
  
  void Z_();
  
  void ZC(Zzqw paramZzqw);
  
  int ZS();
  
  byte ZY();
  
  String ZM();
  
  Zi8 Zg();
  
  boolean ZV();
  
  byte ZI();
  
  String ZB();
  
  String ZE();
  
  String ZO();
  
  InetAddress ZK();
  
  boolean Zq();
  
  List<String> ZT();
  
  String[] ZH();
  
  boolean Zb();
  
  void ZG(boolean paramBoolean);
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'KBV3%[]D;XO\\rTF\\bXC}4'B\[TA5.XK<PF8:T[\\nN\\nIG8YGE'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #6
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #77
    //   25: iinc #1, 1
    //   28: aload_3
    //   29: iload_1
    //   30: dup
    //   31: iload_2
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 130
    //   40: aload_0
    //   41: swap
    //   42: iload #4
    //   44: iinc #4, 1
    //   47: swap
    //   48: aastore
    //   49: iload_1
    //   50: iload_2
    //   51: iadd
    //   52: dup
    //   53: istore_1
    //   54: iload #5
    //   56: if_icmpge -> 68
    //   59: aload_3
    //   60: iload_1
    //   61: invokevirtual charAt : (I)C
    //   64: istore_2
    //   65: goto -> 23
    //   68: ldc 'VBb*9ZRH\ 2]\\r[AM!6M\#AS/.'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #14
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #82
    //   84: iinc #1, 1
    //   87: aload_3
    //   88: iload_1
    //   89: dup
    //   90: iload_2
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 130
    //   99: aload_0
    //   100: swap
    //   101: iload #4
    //   103: iinc #4, 1
    //   106: swap
    //   107: aastore
    //   108: iload_1
    //   109: iload_2
    //   110: iadd
    //   111: dup
    //   112: istore_1
    //   113: iload #5
    //   115: if_icmpge -> 127
    //   118: aload_3
    //   119: iload_1
    //   120: invokevirtual charAt : (I)C
    //   123: istore_2
    //   124: goto -> 82
    //   127: goto -> 288
    //   130: dup_x2
    //   131: pop
    //   132: invokevirtual toCharArray : ()[C
    //   135: dup_x1
    //   136: arraylength
    //   137: dup_x2
    //   138: pop
    //   139: iconst_0
    //   140: istore #6
    //   142: dup2_x1
    //   143: pop2
    //   144: dup_x2
    //   145: iconst_1
    //   146: if_icmpgt -> 247
    //   149: dup2
    //   150: swap
    //   151: iload #6
    //   153: dup2_x1
    //   154: caload
    //   155: swap
    //   156: iload #6
    //   158: bipush #7
    //   160: irem
    //   161: tableswitch default -> 229, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #101
    //   202: goto -> 231
    //   205: bipush #46
    //   207: goto -> 231
    //   210: bipush #124
    //   212: goto -> 231
    //   215: bipush #111
    //   217: goto -> 231
    //   220: bipush #17
    //   222: goto -> 231
    //   225: iconst_5
    //   226: goto -> 231
    //   229: bipush #124
    //   231: ixor
    //   232: ixor
    //   233: i2c
    //   234: castore
    //   235: iinc #6, 1
    //   238: dup
    //   239: ifne -> 247
    //   242: dup2
    //   243: dup_x1
    //   244: goto -> 153
    //   247: dup2_x1
    //   248: pop2
    //   249: dup_x2
    //   250: iload #6
    //   252: if_icmpgt -> 149
    //   255: pop
    //   256: new java/lang/String
    //   259: dup_x1
    //   260: swap
    //   261: invokespecial <init> : ([C)V
    //   264: invokevirtual intern : ()Ljava/lang/String;
    //   267: swap
    //   268: pop
    //   269: swap
    //   270: tableswitch default -> 40, 0 -> 99
    //   288: iconst_3
    //   289: anewarray java/lang/String
    //   292: dup
    //   293: iconst_0
    //   294: aload_0
    //   295: iconst_5
    //   296: aaload
    //   297: aastore
    //   298: dup
    //   299: iconst_1
    //   300: aload_0
    //   301: bipush #6
    //   303: aaload
    //   304: aastore
    //   305: dup
    //   306: iconst_2
    //   307: aload_0
    //   308: iconst_3
    //   309: aaload
    //   310: aastore
    //   311: putstatic burp/Zs9s.Zk : [Ljava/lang/String;
    //   314: iconst_4
    //   315: anewarray java/lang/String
    //   318: dup
    //   319: iconst_0
    //   320: aload_0
    //   321: iconst_1
    //   322: aaload
    //   323: aastore
    //   324: dup
    //   325: iconst_1
    //   326: aload_0
    //   327: iconst_2
    //   328: aaload
    //   329: aastore
    //   330: dup
    //   331: iconst_2
    //   332: aload_0
    //   333: iconst_4
    //   334: aaload
    //   335: aastore
    //   336: dup
    //   337: iconst_3
    //   338: aload_0
    //   339: iconst_0
    //   340: aaload
    //   341: aastore
    //   342: putstatic burp/Zs9s.ZP : [Ljava/lang/String;
    //   345: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs9s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */