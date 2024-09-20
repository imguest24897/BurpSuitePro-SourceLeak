package burp;

import java.io.ByteArrayOutputStream;

class Zkdt implements Zrch {
  public short ZX(Zbi8 paramZbi8) {
    return 0;
  }
  
  public boolean ZN(Zbi8 paramZbi8) {
    if (paramZbi8.Zo < 2)
      return false; 
    byte b = paramZbi8.Zu[paramZbi8.Zv];
    if (b < 48 || (b > 57 && b < 65) || (b > 70 && b < 97) || b > 102)
      return false; 
    b = paramZbi8.Zu[paramZbi8.Zv + 1];
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
    //   13: istore #4
    //   15: iload #4
    //   17: bipush #48
    //   19: if_icmplt -> 41
    //   22: iload #4
    //   24: bipush #57
    //   26: if_icmpgt -> 41
    //   29: iload #4
    //   31: bipush #48
    //   33: isub
    //   34: i2b
    //   35: istore #4
    //   37: aload_3
    //   38: ifnull -> 75
    //   41: iload #4
    //   43: bipush #65
    //   45: if_icmplt -> 67
    //   48: iload #4
    //   50: bipush #70
    //   52: if_icmpgt -> 67
    //   55: iload #4
    //   57: bipush #55
    //   59: isub
    //   60: i2b
    //   61: istore #4
    //   63: aload_3
    //   64: ifnull -> 75
    //   67: iload #4
    //   69: bipush #87
    //   71: isub
    //   72: i2b
    //   73: istore #4
    //   75: aload_1
    //   76: getfield Zu : [B
    //   79: aload_1
    //   80: getfield Zv : I
    //   83: iconst_1
    //   84: iadd
    //   85: baload
    //   86: istore #5
    //   88: iload #5
    //   90: bipush #48
    //   92: if_icmplt -> 114
    //   95: iload #5
    //   97: bipush #57
    //   99: if_icmpgt -> 114
    //   102: iload #5
    //   104: bipush #48
    //   106: isub
    //   107: i2b
    //   108: istore #5
    //   110: aload_3
    //   111: ifnull -> 148
    //   114: iload #5
    //   116: bipush #65
    //   118: if_icmplt -> 140
    //   121: iload #5
    //   123: bipush #70
    //   125: if_icmpgt -> 140
    //   128: iload #5
    //   130: bipush #55
    //   132: isub
    //   133: i2b
    //   134: istore #5
    //   136: aload_3
    //   137: ifnull -> 148
    //   140: iload #5
    //   142: bipush #87
    //   144: isub
    //   145: i2b
    //   146: istore #5
    //   148: aload_2
    //   149: iload #4
    //   151: bipush #16
    //   153: imul
    //   154: iload #5
    //   156: iadd
    //   157: invokevirtual write : (I)V
    //   160: aload_1
    //   161: dup
    //   162: getfield Zv : I
    //   165: iconst_2
    //   166: iadd
    //   167: putfield Zv : I
    //   170: aload_1
    //   171: dup
    //   172: getfield Zo : I
    //   175: iconst_2
    //   176: isub
    //   177: putfield Zo : I
    //   180: invokestatic Zwu : ()[Lburp/Zbqc;
    //   183: ifnonnull -> 191
    //   186: ldc 'wFl1fb'
    //   188: invokestatic ZP : (Ljava/lang/String;)V
    //   191: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkdt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */