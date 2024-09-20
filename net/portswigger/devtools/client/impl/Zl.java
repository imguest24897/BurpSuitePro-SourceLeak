package net.portswigger.devtools.client.impl;

import java.util.List;
import net.portswigger.browser.Zdx;
import net.portswigger.devtools.protocol.domains.Network;

public class Zl extends Zp {
  private static final List<String> ZO;
  
  public Zl() {
    super(List.of(Network.class.getSimpleName()));
  }
  
  public boolean Zp(Zxf paramZxf) {
    return (super.Zp(paramZxf) && ZO.contains(paramZxf.ZO().name().ZS()));
  }
  
  public void ZG(Zdx paramZdx, Zw paramZw, Object paramObject) {}
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'sm\miwdKGv|qeX]\\rwi}uq\\fei[J~wdaY|'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #23
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #103
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 70
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
    //   67: goto -> 214
    //   70: dup_x2
    //   71: pop
    //   72: invokevirtual toCharArray : ()[C
    //   75: dup_x1
    //   76: arraylength
    //   77: dup_x2
    //   78: pop
    //   79: iconst_0
    //   80: istore #6
    //   82: dup2_x1
    //   83: pop2
    //   84: dup_x2
    //   85: iconst_1
    //   86: if_icmpgt -> 187
    //   89: dup2
    //   90: swap
    //   91: iload #6
    //   93: dup2_x1
    //   94: caload
    //   95: swap
    //   96: iload #6
    //   98: bipush #7
    //   100: irem
    //   101: tableswitch default -> 169, 0 -> 140, 1 -> 145, 2 -> 150, 3 -> 155, 4 -> 159, 5 -> 164
    //   140: bipush #102
    //   142: goto -> 171
    //   145: bipush #111
    //   147: goto -> 171
    //   150: bipush #72
    //   152: goto -> 171
    //   155: iconst_3
    //   156: goto -> 171
    //   159: bipush #127
    //   161: goto -> 171
    //   164: bipush #124
    //   166: goto -> 171
    //   169: bipush #115
    //   171: ixor
    //   172: ixor
    //   173: i2c
    //   174: castore
    //   175: iinc #6, 1
    //   178: dup
    //   179: ifne -> 187
    //   182: dup2
    //   183: dup_x1
    //   184: goto -> 93
    //   187: dup2_x1
    //   188: pop2
    //   189: dup_x2
    //   190: iload #6
    //   192: if_icmpgt -> 89
    //   195: pop
    //   196: new java/lang/String
    //   199: dup_x1
    //   200: swap
    //   201: invokespecial <init> : ([C)V
    //   204: invokevirtual intern : ()Ljava/lang/String;
    //   207: swap
    //   208: pop
    //   209: swap
    //   210: pop
    //   211: goto -> 39
    //   214: aload_0
    //   215: iconst_1
    //   216: aaload
    //   217: aload_0
    //   218: iconst_0
    //   219: aaload
    //   220: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   223: putstatic net/portswigger/devtools/client/impl/Zl.ZO : Ljava/util/List;
    //   226: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */