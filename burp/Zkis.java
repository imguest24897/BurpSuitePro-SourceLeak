package burp;

import java.util.Set;
import net.portswigger.Zsy;

class Zkis extends Zkud {
  private static final Set<String> Z_;
  
  Zkis(Zsy paramZsy) {
    super(paramZsy);
  }
  
  protected boolean ZL(Zxaq paramZxaq, String paramString) {
    return Z_.contains(paramString);
  }
  
  protected String ZX(Zmlc paramZmlc) {
    return this.ZS.Zi().ZH().ZK(3) + " " + this.ZS.Zi().ZH().ZK(3) + " " + this.ZS.Zi().ZH().ZK(2);
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'VBb5)0V^o'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #6
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #39
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
    //   101: tableswitch default -> 169, 0 -> 140, 1 -> 144, 2 -> 149, 3 -> 154, 4 -> 159, 5 -> 164
    //   140: iconst_2
    //   141: goto -> 171
    //   144: bipush #10
    //   146: goto -> 171
    //   149: bipush #38
    //   151: goto -> 171
    //   154: bipush #123
    //   156: goto -> 171
    //   159: bipush #111
    //   161: goto -> 171
    //   164: bipush #123
    //   166: goto -> 171
    //   169: bipush #67
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
    //   214: iconst_2
    //   215: anewarray java/lang/String
    //   218: dup
    //   219: iconst_0
    //   220: aload_0
    //   221: iconst_1
    //   222: aaload
    //   223: aastore
    //   224: dup
    //   225: iconst_1
    //   226: aload_0
    //   227: iconst_0
    //   228: aaload
    //   229: aastore
    //   230: invokestatic Zn : ([Ljava/lang/Object;)Ljava/util/Set;
    //   233: putstatic burp/Zkis.Z_ : Ljava/util/Set;
    //   236: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkis.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */