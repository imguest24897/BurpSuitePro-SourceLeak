package burp;

import java.io.ByteArrayOutputStream;

class Zmku implements Zrch {
  public short ZX(Zbi8 paramZbi8) {
    // Byte code:
    //   0: invokestatic ZB : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: getfield Zo : I
    //   8: iconst_1
    //   9: if_icmplt -> 122
    //   12: aload_1
    //   13: getfield Zu : [B
    //   16: aload_1
    //   17: getfield Zv : I
    //   20: baload
    //   21: bipush #43
    //   23: if_icmpne -> 122
    //   26: aload_1
    //   27: getfield Zv : I
    //   30: istore_3
    //   31: aload_1
    //   32: getfield Zo : I
    //   35: istore #4
    //   37: iconst_0
    //   38: istore #5
    //   40: aload_1
    //   41: getfield Zo : I
    //   44: iconst_3
    //   45: if_icmplt -> 100
    //   48: aload_1
    //   49: getfield Zu : [B
    //   52: aload_1
    //   53: getfield Zv : I
    //   56: baload
    //   57: bipush #43
    //   59: if_icmpne -> 65
    //   62: goto -> 76
    //   65: aload_0
    //   66: aload_1
    //   67: invokevirtual ZN : (Lburp/Zbi8;)Z
    //   70: istore #5
    //   72: aload_2
    //   73: ifnull -> 100
    //   76: aload_1
    //   77: dup
    //   78: getfield Zv : I
    //   81: iconst_1
    //   82: iadd
    //   83: putfield Zv : I
    //   86: aload_1
    //   87: dup
    //   88: getfield Zo : I
    //   91: iconst_1
    //   92: isub
    //   93: putfield Zo : I
    //   96: aload_2
    //   97: ifnull -> 40
    //   100: aload_1
    //   101: iload_3
    //   102: putfield Zv : I
    //   105: aload_1
    //   106: iload #4
    //   108: putfield Zo : I
    //   111: iload #5
    //   113: ifeq -> 120
    //   116: iconst_5
    //   117: goto -> 121
    //   120: iconst_2
    //   121: ireturn
    //   122: aload_0
    //   123: aload_1
    //   124: invokevirtual ZN : (Lburp/Zbi8;)Z
    //   127: ifeq -> 132
    //   130: iconst_5
    //   131: ireturn
    //   132: iconst_0
    //   133: ireturn
  }
  
  public boolean ZN(Zbi8 paramZbi8) {
    if (paramZbi8.Zo >= 1 && paramZbi8.Zu[paramZbi8.Zv] == 43)
      return true; 
    if (paramZbi8.Zo < 3)
      return false; 
    if (paramZbi8.Zu[paramZbi8.Zv] != 37)
      return false; 
    byte b = paramZbi8.Zu[paramZbi8.Zv + 1];
    if (b < 48 || (b > 57 && b < 65) || (b > 70 && b < 97) || b > 102)
      return false; 
    b = paramZbi8.Zu[paramZbi8.Zv + 2];
    return !(b < 48 || (b > 57 && b < 65) || (b > 70 && b < 97) || b > 102);
  }
  
  public void Zq(Zbi8 paramZbi8, ByteArrayOutputStream paramByteArrayOutputStream) {
    // Byte code:
    //   0: invokestatic ZB : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_1
    //   5: getfield Zu : [B
    //   8: aload_1
    //   9: getfield Zv : I
    //   12: baload
    //   13: bipush #43
    //   15: if_icmpne -> 45
    //   18: aload_2
    //   19: bipush #32
    //   21: invokevirtual write : (I)V
    //   24: aload_1
    //   25: dup
    //   26: getfield Zv : I
    //   29: iconst_1
    //   30: iadd
    //   31: putfield Zv : I
    //   34: aload_1
    //   35: dup
    //   36: getfield Zo : I
    //   39: iconst_1
    //   40: isub
    //   41: putfield Zo : I
    //   44: return
    //   45: aload_1
    //   46: getfield Zu : [B
    //   49: aload_1
    //   50: getfield Zv : I
    //   53: iconst_1
    //   54: iadd
    //   55: baload
    //   56: istore #4
    //   58: iload #4
    //   60: bipush #48
    //   62: if_icmplt -> 84
    //   65: iload #4
    //   67: bipush #57
    //   69: if_icmpgt -> 84
    //   72: iload #4
    //   74: bipush #48
    //   76: isub
    //   77: i2b
    //   78: istore #4
    //   80: aload_3
    //   81: ifnull -> 118
    //   84: iload #4
    //   86: bipush #65
    //   88: if_icmplt -> 110
    //   91: iload #4
    //   93: bipush #70
    //   95: if_icmpgt -> 110
    //   98: iload #4
    //   100: bipush #55
    //   102: isub
    //   103: i2b
    //   104: istore #4
    //   106: aload_3
    //   107: ifnull -> 118
    //   110: iload #4
    //   112: bipush #87
    //   114: isub
    //   115: i2b
    //   116: istore #4
    //   118: aload_1
    //   119: getfield Zu : [B
    //   122: aload_1
    //   123: getfield Zv : I
    //   126: iconst_2
    //   127: iadd
    //   128: baload
    //   129: istore #5
    //   131: iload #5
    //   133: bipush #48
    //   135: if_icmplt -> 157
    //   138: iload #5
    //   140: bipush #57
    //   142: if_icmpgt -> 157
    //   145: iload #5
    //   147: bipush #48
    //   149: isub
    //   150: i2b
    //   151: istore #5
    //   153: aload_3
    //   154: ifnull -> 191
    //   157: iload #5
    //   159: bipush #65
    //   161: if_icmplt -> 183
    //   164: iload #5
    //   166: bipush #70
    //   168: if_icmpgt -> 183
    //   171: iload #5
    //   173: bipush #55
    //   175: isub
    //   176: i2b
    //   177: istore #5
    //   179: aload_3
    //   180: ifnull -> 191
    //   183: iload #5
    //   185: bipush #87
    //   187: isub
    //   188: i2b
    //   189: istore #5
    //   191: aload_2
    //   192: iload #4
    //   194: bipush #16
    //   196: imul
    //   197: iload #5
    //   199: iadd
    //   200: invokevirtual write : (I)V
    //   203: aload_1
    //   204: dup
    //   205: getfield Zv : I
    //   208: iconst_3
    //   209: iadd
    //   210: putfield Zv : I
    //   213: aload_1
    //   214: dup
    //   215: getfield Zo : I
    //   218: iconst_3
    //   219: isub
    //   220: putfield Zo : I
    //   223: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmku.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */