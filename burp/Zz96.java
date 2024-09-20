package burp;

import java.io.ByteArrayOutputStream;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

public class Zz96 {
  private static final Ztr7 ZN = new Ztr7(new Zbnt(new Zruo()));
  
  public static byte[][] Zd(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic Zp : ()I
    //   13: iconst_0
    //   14: istore #4
    //   16: istore_1
    //   17: iload #4
    //   19: aload_0
    //   20: arraylength
    //   21: if_icmpge -> 74
    //   24: aload_0
    //   25: iload #4
    //   27: baload
    //   28: bipush #-89
    //   30: if_icmpne -> 67
    //   33: iload #4
    //   35: iload_3
    //   36: isub
    //   37: newarray byte
    //   39: astore #5
    //   41: aload_0
    //   42: iload_3
    //   43: aload #5
    //   45: iconst_0
    //   46: iload #4
    //   48: iload_3
    //   49: isub
    //   50: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   53: aload_2
    //   54: aload #5
    //   56: invokeinterface add : (Ljava/lang/Object;)Z
    //   61: pop
    //   62: iload #4
    //   64: iconst_1
    //   65: iadd
    //   66: istore_3
    //   67: iinc #4, 1
    //   70: iload_1
    //   71: ifne -> 17
    //   74: iload_3
    //   75: aload_0
    //   76: arraylength
    //   77: if_icmpge -> 113
    //   80: iload #4
    //   82: iload_3
    //   83: isub
    //   84: newarray byte
    //   86: astore #5
    //   88: aload_0
    //   89: iload_3
    //   90: aload #5
    //   92: iconst_0
    //   93: iload #4
    //   95: iload_3
    //   96: isub
    //   97: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   100: aload_2
    //   101: aload #5
    //   103: invokeinterface add : (Ljava/lang/Object;)Z
    //   108: pop
    //   109: iload_1
    //   110: ifne -> 135
    //   113: aload_2
    //   114: invokeinterface size : ()I
    //   119: iconst_2
    //   120: irem
    //   121: iconst_1
    //   122: if_icmpne -> 135
    //   125: aload_2
    //   126: iconst_0
    //   127: newarray byte
    //   129: invokeinterface add : (Ljava/lang/Object;)Z
    //   134: pop
    //   135: aload_2
    //   136: invokeinterface size : ()I
    //   141: iconst_2
    //   142: irem
    //   143: ifne -> 156
    //   146: aload_2
    //   147: iconst_0
    //   148: newarray byte
    //   150: invokeinterface add : (Ljava/lang/Object;)Z
    //   155: pop
    //   156: aload_2
    //   157: aload_2
    //   158: invokeinterface size : ()I
    //   163: anewarray [B
    //   166: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   171: checkcast [[B
    //   174: areturn
  }
  
  public static byte[] ZC(boolean paramBoolean, byte[] paramArrayOfbyte, Zbnt paramZbnt) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic ZA : ([B)[B
    //   4: astore_1
    //   5: aconst_null
    //   6: aload_1
    //   7: iconst_2
    //   8: aload_2
    //   9: invokestatic Zu : (Lburp/Zmzk;[BBLburp/Zbnt;)Lburp/Zz1p;
    //   12: astore #4
    //   14: new java/util/ArrayList
    //   17: dup
    //   18: aload #4
    //   20: getfield ZV : Ljava/util/List;
    //   23: invokespecial <init> : (Ljava/util/Collection;)V
    //   26: astore #5
    //   28: invokestatic Zx : ()I
    //   31: aload #5
    //   33: <illegal opcode> compare : ()Ljava/util/Comparator;
    //   38: invokeinterface sort : (Ljava/util/Comparator;)V
    //   43: istore_3
    //   44: new java/io/ByteArrayOutputStream
    //   47: dup
    //   48: aload_1
    //   49: arraylength
    //   50: iconst_2
    //   51: aload #5
    //   53: invokeinterface size : ()I
    //   58: imul
    //   59: iadd
    //   60: invokespecial <init> : (I)V
    //   63: astore #6
    //   65: iconst_0
    //   66: istore #7
    //   68: aload #5
    //   70: invokeinterface iterator : ()Ljava/util/Iterator;
    //   75: astore #8
    //   77: aload #8
    //   79: invokeinterface hasNext : ()Z
    //   84: ifeq -> 215
    //   87: aload #8
    //   89: invokeinterface next : ()Ljava/lang/Object;
    //   94: checkcast burp/Zt8g
    //   97: astore #9
    //   99: aload #6
    //   101: aload_1
    //   102: iload #7
    //   104: aload #9
    //   106: invokeinterface Zbl : ()I
    //   111: iload #7
    //   113: isub
    //   114: invokevirtual write : ([BII)V
    //   117: iload_0
    //   118: ifeq -> 160
    //   121: aload #6
    //   123: aload_1
    //   124: aload #9
    //   126: invokeinterface Zbl : ()I
    //   131: aload #9
    //   133: invokeinterface Zb2 : ()I
    //   138: aload #9
    //   140: invokeinterface Zbl : ()I
    //   145: isub
    //   146: invokevirtual write : ([BII)V
    //   149: aload #6
    //   151: bipush #-89
    //   153: invokevirtual write : (I)V
    //   156: iload_3
    //   157: ifeq -> 195
    //   160: aload #6
    //   162: bipush #-89
    //   164: invokevirtual write : (I)V
    //   167: aload #6
    //   169: aload_1
    //   170: aload #9
    //   172: invokeinterface Zbl : ()I
    //   177: aload #9
    //   179: invokeinterface Zb2 : ()I
    //   184: aload #9
    //   186: invokeinterface Zbl : ()I
    //   191: isub
    //   192: invokevirtual write : ([BII)V
    //   195: aload #6
    //   197: bipush #-89
    //   199: invokevirtual write : (I)V
    //   202: aload #9
    //   204: invokeinterface Zb2 : ()I
    //   209: istore #7
    //   211: iload_3
    //   212: ifeq -> 77
    //   215: aload #6
    //   217: aload_1
    //   218: iload #7
    //   220: aload_1
    //   221: arraylength
    //   222: iload #7
    //   224: isub
    //   225: invokevirtual write : ([BII)V
    //   228: aload #6
    //   230: invokevirtual toByteArray : ()[B
    //   233: astore_1
    //   234: aload_1
    //   235: areturn
  }
  
  public static byte[] ZG(boolean paramBoolean, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: invokestatic Zp : ()I
    //   3: istore_2
    //   4: aload_1
    //   5: invokestatic ZA : ([B)[B
    //   8: astore_1
    //   9: aload_1
    //   10: invokestatic Zy : ([B)Z
    //   13: ifeq -> 26
    //   16: iload_0
    //   17: aload_1
    //   18: invokestatic Zi : (Z[B)[B
    //   21: astore_1
    //   22: iload_2
    //   23: ifne -> 49
    //   26: aload_1
    //   27: invokestatic Zh : ([B)Z
    //   30: ifeq -> 43
    //   33: iload_0
    //   34: aload_1
    //   35: invokestatic Zf : (Z[B)[B
    //   38: astore_1
    //   39: iload_2
    //   40: ifne -> 49
    //   43: iload_0
    //   44: aload_1
    //   45: invokestatic Zr : (Z[B)[B
    //   48: astore_1
    //   49: aload_1
    //   50: areturn
  }
  
  private static byte[] Zi(boolean paramBoolean, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: getstatic burp/Zrdu.XML_PARAM : Lburp/Zrdu;
    //   3: aload_1
    //   4: iconst_0
    //   5: aload_1
    //   6: arraylength
    //   7: getstatic burp/Zsba.XML : Lburp/Zsba;
    //   10: aconst_null
    //   11: invokestatic Zm : (Lburp/Zrdu;[BIILburp/Zsba;Ljava/lang/String;)Ljava/util/List;
    //   14: astore_3
    //   15: invokestatic Zp : ()I
    //   18: new java/io/ByteArrayOutputStream
    //   21: dup
    //   22: aload_1
    //   23: arraylength
    //   24: iconst_2
    //   25: aload_3
    //   26: invokeinterface size : ()I
    //   31: imul
    //   32: iadd
    //   33: invokespecial <init> : (I)V
    //   36: astore #4
    //   38: iconst_0
    //   39: istore #5
    //   41: istore_2
    //   42: aload_3
    //   43: invokeinterface iterator : ()Ljava/util/Iterator;
    //   48: astore #6
    //   50: aload #6
    //   52: invokeinterface hasNext : ()Z
    //   57: ifeq -> 188
    //   60: aload #6
    //   62: invokeinterface next : ()Ljava/lang/Object;
    //   67: checkcast burp/Zt8g
    //   70: astore #7
    //   72: aload #4
    //   74: aload_1
    //   75: iload #5
    //   77: aload #7
    //   79: invokeinterface Zbl : ()I
    //   84: iload #5
    //   86: isub
    //   87: invokevirtual write : ([BII)V
    //   90: iload_0
    //   91: ifeq -> 133
    //   94: aload #4
    //   96: aload_1
    //   97: aload #7
    //   99: invokeinterface Zbl : ()I
    //   104: aload #7
    //   106: invokeinterface Zb2 : ()I
    //   111: aload #7
    //   113: invokeinterface Zbl : ()I
    //   118: isub
    //   119: invokevirtual write : ([BII)V
    //   122: aload #4
    //   124: bipush #-89
    //   126: invokevirtual write : (I)V
    //   129: iload_2
    //   130: ifne -> 168
    //   133: aload #4
    //   135: bipush #-89
    //   137: invokevirtual write : (I)V
    //   140: aload #4
    //   142: aload_1
    //   143: aload #7
    //   145: invokeinterface Zbl : ()I
    //   150: aload #7
    //   152: invokeinterface Zb2 : ()I
    //   157: aload #7
    //   159: invokeinterface Zbl : ()I
    //   164: isub
    //   165: invokevirtual write : ([BII)V
    //   168: aload #4
    //   170: bipush #-89
    //   172: invokevirtual write : (I)V
    //   175: aload #7
    //   177: invokeinterface Zb2 : ()I
    //   182: istore #5
    //   184: iload_2
    //   185: ifne -> 50
    //   188: aload #4
    //   190: aload_1
    //   191: iload #5
    //   193: aload_1
    //   194: arraylength
    //   195: iload #5
    //   197: isub
    //   198: invokevirtual write : ([BII)V
    //   201: aload #4
    //   203: invokevirtual toByteArray : ()[B
    //   206: astore_1
    //   207: aload_1
    //   208: areturn
  }
  
  private static byte[] Zf(boolean paramBoolean, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: getstatic burp/Zrdu.JSON_PARAM : Lburp/Zrdu;
    //   3: aload_1
    //   4: iconst_0
    //   5: aload_1
    //   6: arraylength
    //   7: getstatic burp/Zsba.JSON : Lburp/Zsba;
    //   10: aconst_null
    //   11: invokestatic Zm : (Lburp/Zrdu;[BIILburp/Zsba;Ljava/lang/String;)Ljava/util/List;
    //   14: astore_3
    //   15: invokestatic Zx : ()I
    //   18: new java/io/ByteArrayOutputStream
    //   21: dup
    //   22: aload_1
    //   23: arraylength
    //   24: iconst_2
    //   25: aload_3
    //   26: invokeinterface size : ()I
    //   31: imul
    //   32: iadd
    //   33: invokespecial <init> : (I)V
    //   36: astore #4
    //   38: iconst_0
    //   39: istore #5
    //   41: aload_3
    //   42: invokeinterface iterator : ()Ljava/util/Iterator;
    //   47: astore #6
    //   49: istore_2
    //   50: aload #6
    //   52: invokeinterface hasNext : ()Z
    //   57: ifeq -> 188
    //   60: aload #6
    //   62: invokeinterface next : ()Ljava/lang/Object;
    //   67: checkcast burp/Zt8g
    //   70: astore #7
    //   72: aload #4
    //   74: aload_1
    //   75: iload #5
    //   77: aload #7
    //   79: invokeinterface Zbl : ()I
    //   84: iload #5
    //   86: isub
    //   87: invokevirtual write : ([BII)V
    //   90: iload_0
    //   91: ifeq -> 133
    //   94: aload #4
    //   96: aload_1
    //   97: aload #7
    //   99: invokeinterface Zbl : ()I
    //   104: aload #7
    //   106: invokeinterface Zb2 : ()I
    //   111: aload #7
    //   113: invokeinterface Zbl : ()I
    //   118: isub
    //   119: invokevirtual write : ([BII)V
    //   122: aload #4
    //   124: bipush #-89
    //   126: invokevirtual write : (I)V
    //   129: iload_2
    //   130: ifeq -> 168
    //   133: aload #4
    //   135: bipush #-89
    //   137: invokevirtual write : (I)V
    //   140: aload #4
    //   142: aload_1
    //   143: aload #7
    //   145: invokeinterface Zbl : ()I
    //   150: aload #7
    //   152: invokeinterface Zb2 : ()I
    //   157: aload #7
    //   159: invokeinterface Zbl : ()I
    //   164: isub
    //   165: invokevirtual write : ([BII)V
    //   168: aload #4
    //   170: bipush #-89
    //   172: invokevirtual write : (I)V
    //   175: aload #7
    //   177: invokeinterface Zb2 : ()I
    //   182: istore #5
    //   184: iload_2
    //   185: ifeq -> 50
    //   188: aload #4
    //   190: aload_1
    //   191: iload #5
    //   193: aload_1
    //   194: arraylength
    //   195: iload #5
    //   197: isub
    //   198: invokevirtual write : ([BII)V
    //   201: aload #4
    //   203: invokevirtual toByteArray : ()[B
    //   206: astore_1
    //   207: aload_1
    //   208: areturn
  }
  
  private static byte[] Zr(boolean paramBoolean, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: new java/io/ByteArrayOutputStream
    //   3: dup
    //   4: aload_1
    //   5: arraylength
    //   6: bipush #50
    //   8: iadd
    //   9: invokespecial <init> : (I)V
    //   12: astore_3
    //   13: invokestatic Zp : ()I
    //   16: iconst_0
    //   17: istore #4
    //   19: iconst_0
    //   20: istore #5
    //   22: istore_2
    //   23: iload #5
    //   25: aload_1
    //   26: arraylength
    //   27: if_icmpge -> 190
    //   30: iload #5
    //   32: aload_1
    //   33: arraylength
    //   34: if_icmpge -> 86
    //   37: aload_1
    //   38: iload #5
    //   40: baload
    //   41: bipush #61
    //   43: if_icmpne -> 79
    //   46: iinc #5, 1
    //   49: aload_3
    //   50: aload_1
    //   51: iload #4
    //   53: iload #5
    //   55: iload #4
    //   57: isub
    //   58: invokevirtual write : ([BII)V
    //   61: iload_0
    //   62: ifne -> 71
    //   65: aload_3
    //   66: bipush #-89
    //   68: invokevirtual write : (I)V
    //   71: iload #5
    //   73: istore #4
    //   75: iload_2
    //   76: ifne -> 86
    //   79: iinc #5, 1
    //   82: iload_2
    //   83: ifne -> 30
    //   86: iload #5
    //   88: aload_1
    //   89: arraylength
    //   90: if_icmpge -> 183
    //   93: aload_1
    //   94: iload #5
    //   96: baload
    //   97: lookupswitch default -> 176, 10 -> 140, 13 -> 140, 32 -> 140, 38 -> 140
    //   140: aload_3
    //   141: aload_1
    //   142: iload #4
    //   144: iload #5
    //   146: iload #4
    //   148: isub
    //   149: invokevirtual write : ([BII)V
    //   152: iload_0
    //   153: ifeq -> 162
    //   156: aload_3
    //   157: bipush #-89
    //   159: invokevirtual write : (I)V
    //   162: aload_3
    //   163: bipush #-89
    //   165: invokevirtual write : (I)V
    //   168: iload #5
    //   170: istore #4
    //   172: iload_2
    //   173: ifne -> 183
    //   176: iinc #5, 1
    //   179: iload_2
    //   180: ifne -> 86
    //   183: iinc #5, 1
    //   186: iload_2
    //   187: ifne -> 23
    //   190: aload_3
    //   191: aload_1
    //   192: iload #4
    //   194: aload_1
    //   195: arraylength
    //   196: iload #4
    //   198: isub
    //   199: invokevirtual write : ([BII)V
    //   202: aload_3
    //   203: invokevirtual toByteArray : ()[B
    //   206: astore_1
    //   207: aload_1
    //   208: areturn
  }
  
  private static boolean Zy(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte[0] == 60 && paramArrayOfbyte[paramArrayOfbyte.length - 1] == 62);
  }
  
  private static boolean Zh(byte[] paramArrayOfbyte) {
    return ((paramArrayOfbyte[0] == 123 && paramArrayOfbyte[paramArrayOfbyte.length - 1] == 125) || (paramArrayOfbyte[0] == 91 && paramArrayOfbyte[paramArrayOfbyte.length - 1] == 93));
  }
  
  public static byte[] ZA(byte[] paramArrayOfbyte) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(paramArrayOfbyte.length);
    byte[] arrayOfByte = paramArrayOfbyte;
    int j = arrayOfByte.length;
    byte b = 0;
    int i = Zbyw.Zx();
    while (b < j) {
      byte b1 = arrayOfByte[b];
      if (b1 != -89)
        byteArrayOutputStream.write(b1); 
      b++;
      if (i != 0)
        break; 
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  public static String Zz(String paramString) {
    return paramString.replace("§", "");
  }
  
  public static List<String> Zl(byte[] paramArrayOfbyte) {
    int i = Zbyw.Zp();
    byte[][] arrayOfByte = Zd(paramArrayOfbyte);
    if (arrayOfByte.length <= 1)
      return Collections.emptyList(); 
    ArrayList<String> arrayList = new ArrayList();
    byte b = 1;
    while (b < arrayOfByte.length) {
      String str = Zkb.ZG(arrayOfByte[b]);
      arrayList.add(str);
      b += 2;
      if (i == 0)
        break; 
    } 
    return arrayList;
  }
  
  public static int Z_(Zstu paramZstu, Zrte<Ze9k> paramZrte) {
    int i = Zk(paramZstu);
    return (i == 0 && paramZrte.Zpu() == 1 && ((Ze9k)paramZrte.ZdF(0)).Zyi() == Zzvm.NULL_PAYLOADS) ? 1 : i;
  }
  
  private static int Zk(Zstu paramZstu) {
    if (paramZstu == null)
      return 0; 
    byte[][] arrayOfByte = Zd(paramZstu.ZiD());
    return Zl(arrayOfByte.length);
  }
  
  public static int Zl(int paramInt) {
    return (paramInt - 1) / 2;
  }
  
  public static Zmzk Zm(Zstu paramZstu) {
    return (paramZstu == null) ? null : Zb(ZN, paramZstu.Zis());
  }
  
  public static Zmzk ZL(String paramString) {
    return Zb(ZN, paramString);
  }
  
  public static Zmzk ZO(Ztr7 paramZtr7, Zstu paramZstu) {
    return (paramZstu == null) ? null : Zb(paramZtr7, paramZstu.Zis());
  }
  
  public static Zmzk Zb(Ztr7 paramZtr7, String paramString) {
    return (paramString == null || paramString.contains("§")) ? null : ZY(paramZtr7, paramString);
  }
  
  public static Zmzk Zd(Zstu paramZstu) {
    return (paramZstu == null) ? null : ZY(ZN, paramZstu.Zis());
  }
  
  public static Zmzk ZQ(Ztr7 paramZtr7, Zstu paramZstu) {
    return (paramZstu == null) ? null : ZY(paramZtr7, paramZstu.Zis());
  }
  
  public static Zmzk ZY(Ztr7 paramZtr7, String paramString) {
    if (paramString == null)
      return null; 
    Zlit zlit = ZZ(paramZtr7, Zz(paramString));
    return (zlit == null) ? null : zlit.Zdz();
  }
  
  public static boolean Zi(Zstu paramZstu) {
    int i = Zbyw.Zx();
    if (paramZstu == null)
      return false; 
    byte b = 0;
    while (b < paramZstu.Zpu()) {
      byte b1 = paramZstu.Zp(b);
      if (b1 == -89)
        return true; 
      b++;
      if (i != 0)
        break; 
    } 
    return false;
  }
  
  private static Zlit ZZ(Ztr7 paramZtr7, String paramString) {
    try {
      return paramZtr7.ZN(paramString);
    } catch (MalformedURLException|Zxgy|Zxg5 malformedURLException) {
      Zah.Zl(malformedURLException, Zk_.USER_ERROR);
      return null;
    } 
  }
  
  private static int lambda$autoApplyPayloadMarkersToRequest$0(Zt8g paramZt8g1, Zt8g paramZt8g2) {
    return (paramZt8g1.Zbl() < paramZt8g2.Zbl()) ? -1 : 1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz96.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */