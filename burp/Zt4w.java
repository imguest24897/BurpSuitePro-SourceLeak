package burp;

import java.util.ArrayList;
import java.util.List;

public class Zt4w {
  static boolean Zv(char paramChar) {
    return (Character.isDigit(paramChar) || (paramChar >= 'a' && paramChar <= 'f') || (paramChar >= 'A' && paramChar <= 'F'));
  }
  
  public static List<Ztkm> ZB(boolean paramBoolean, String paramString1, Zre8 paramZre8, String paramString2) {
    ArrayList<Ztkm> arrayList = new ArrayList();
    if ((paramBoolean && paramZre8 != Zre8.Zw) || !paramString2.equals(paramString1)) {
      arrayList.add(new Ztkm(paramZre8, paramString2));
      paramString1 = paramString2;
    } 
    arrayList.addAll(ZO(paramString1));
    if (paramBoolean && arrayList.isEmpty())
      arrayList.add(new Ztkm(Zre8.Zw, paramString1)); 
    return arrayList;
  }
  
  private static List<Ztkm> ZO(String paramString) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic ZM : ()Ljava/lang/String;
    //   11: iconst_0
    //   12: istore_3
    //   13: astore_1
    //   14: iconst_0
    //   15: istore #4
    //   17: aload_0
    //   18: invokestatic ZV : (Ljava/lang/String;)Z
    //   21: ifeq -> 69
    //   24: new burp/Zs8d
    //   27: dup
    //   28: invokespecial <init> : ()V
    //   31: astore #5
    //   33: aload #5
    //   35: aload_0
    //   36: invokevirtual ZM : (Ljava/lang/String;)Ljava/lang/String;
    //   39: astore #6
    //   41: aload_2
    //   42: new burp/Ztkm
    //   45: dup
    //   46: aload #5
    //   48: aload #6
    //   50: invokespecial <init> : (Lburp/Zre8;Ljava/lang/String;)V
    //   53: invokeinterface add : (Ljava/lang/Object;)Z
    //   58: pop
    //   59: aload #6
    //   61: astore_0
    //   62: iconst_1
    //   63: istore #4
    //   65: aload_1
    //   66: ifnonnull -> 221
    //   69: aload_0
    //   70: invokestatic ZK : (Ljava/lang/String;)Z
    //   73: ifeq -> 121
    //   76: new burp/Zrqw
    //   79: dup
    //   80: invokespecial <init> : ()V
    //   83: astore #5
    //   85: aload #5
    //   87: aload_0
    //   88: invokevirtual ZM : (Ljava/lang/String;)Ljava/lang/String;
    //   91: astore #6
    //   93: aload_2
    //   94: new burp/Ztkm
    //   97: dup
    //   98: aload #5
    //   100: aload #6
    //   102: invokespecial <init> : (Lburp/Zre8;Ljava/lang/String;)V
    //   105: invokeinterface add : (Ljava/lang/Object;)Z
    //   110: pop
    //   111: aload #6
    //   113: astore_0
    //   114: iconst_1
    //   115: istore #4
    //   117: aload_1
    //   118: ifnonnull -> 221
    //   121: aload_0
    //   122: invokestatic ZZ : (Ljava/lang/String;)Z
    //   125: ifeq -> 173
    //   128: new burp/Zsoi
    //   131: dup
    //   132: invokespecial <init> : ()V
    //   135: astore #5
    //   137: aload #5
    //   139: aload_0
    //   140: invokevirtual ZM : (Ljava/lang/String;)Ljava/lang/String;
    //   143: astore #6
    //   145: aload_2
    //   146: new burp/Ztkm
    //   149: dup
    //   150: aload #5
    //   152: aload #6
    //   154: invokespecial <init> : (Lburp/Zre8;Ljava/lang/String;)V
    //   157: invokeinterface add : (Ljava/lang/Object;)Z
    //   162: pop
    //   163: aload #6
    //   165: astore_0
    //   166: iconst_1
    //   167: istore #4
    //   169: aload_1
    //   170: ifnonnull -> 221
    //   173: aload_0
    //   174: invokestatic Zq : (Ljava/lang/String;)Z
    //   177: ifeq -> 221
    //   180: new burp/Zljs
    //   183: dup
    //   184: invokespecial <init> : ()V
    //   187: astore #5
    //   189: aload #5
    //   191: aload_0
    //   192: invokevirtual ZM : (Ljava/lang/String;)Ljava/lang/String;
    //   195: astore #6
    //   197: aload_2
    //   198: new burp/Ztkm
    //   201: dup
    //   202: aload #5
    //   204: aload #6
    //   206: invokespecial <init> : (Lburp/Zre8;Ljava/lang/String;)V
    //   209: invokeinterface add : (Ljava/lang/Object;)Z
    //   214: pop
    //   215: aload #6
    //   217: astore_0
    //   218: iconst_1
    //   219: istore #4
    //   221: iinc #3, 1
    //   224: iload #4
    //   226: ifeq -> 235
    //   229: iload_3
    //   230: bipush #10
    //   232: if_icmple -> 14
    //   235: aload_2
    //   236: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt4w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */