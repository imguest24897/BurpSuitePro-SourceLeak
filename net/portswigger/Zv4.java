package net.portswigger;

import java.util.Base64;

public class Zv4 extends Zv6 {
  public static boolean ZO(byte paramByte) {
    // Byte code:
    //   0: invokestatic ZK : ()[I
    //   3: astore_1
    //   4: iload_0
    //   5: bipush #65
    //   7: if_icmplt -> 23
    //   10: iload_0
    //   11: bipush #90
    //   13: if_icmple -> 114
    //   16: goto -> 23
    //   19: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   22: athrow
    //   23: iload_0
    //   24: bipush #97
    //   26: if_icmplt -> 49
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   35: athrow
    //   36: iload_0
    //   37: bipush #122
    //   39: if_icmple -> 114
    //   42: goto -> 49
    //   45: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   48: athrow
    //   49: iload_0
    //   50: bipush #48
    //   52: if_icmplt -> 75
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   61: athrow
    //   62: iload_0
    //   63: bipush #57
    //   65: if_icmple -> 114
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   74: athrow
    //   75: iload_0
    //   76: bipush #45
    //   78: if_icmpeq -> 114
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   87: athrow
    //   88: iload_0
    //   89: bipush #95
    //   91: if_icmpeq -> 114
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   100: athrow
    //   101: iload_0
    //   102: bipush #61
    //   104: if_icmpne -> 122
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   113: athrow
    //   114: iconst_1
    //   115: goto -> 123
    //   118: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   121: athrow
    //   122: iconst_0
    //   123: aload_1
    //   124: ifnull -> 141
    //   127: iconst_1
    //   128: anewarray burp/Zbqc
    //   131: invokestatic Zr : ([Lburp/Zbqc;)V
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   140: athrow
    //   141: ireturn
    // Exception table:
    //   from	to	target	type
    //   4	16	19	java/lang/IllegalArgumentException
    //   10	29	32	java/lang/IllegalArgumentException
    //   23	42	45	java/lang/IllegalArgumentException
    //   36	55	58	java/lang/IllegalArgumentException
    //   49	68	71	java/lang/IllegalArgumentException
    //   62	81	84	java/lang/IllegalArgumentException
    //   75	94	97	java/lang/IllegalArgumentException
    //   88	107	110	java/lang/IllegalArgumentException
    //   101	118	118	java/lang/IllegalArgumentException
    //   123	134	137	java/lang/IllegalArgumentException
  }
  
  public static boolean Zu(byte[] paramArrayOfbyte) {
    return ZU(paramArrayOfbyte, Zv4::ZO, Zv4::ZK);
  }
  
  public static boolean ZD(byte[] paramArrayOfbyte) {
    return Zk(paramArrayOfbyte, Zv4::ZO);
  }
  
  public static byte[] Zw(byte[] paramArrayOfbyte) {
    return Base64.getUrlEncoder().encode(paramArrayOfbyte);
  }
  
  public static byte[] ZW(byte[] paramArrayOfbyte) {
    return Base64.getUrlEncoder().withoutPadding().encode(paramArrayOfbyte);
  }
  
  public static byte[] ZK(byte[] paramArrayOfbyte) {
    try {
      return Base64.getUrlDecoder().decode(paramArrayOfbyte);
    } catch (IllegalArgumentException illegalArgumentException) {
      return paramArrayOfbyte;
    } 
  }
  
  public static String ZN(String paramString) {
    return Zkb.ZG(ZW(Zkb.Zy(paramString)));
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zv4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */