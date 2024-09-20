package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zkb;

public final class Zke3 {
  public static List<int[]>[] ZK(Zzud paramZzud, Zbnt paramZbnt, boolean[] paramArrayOfboolean, boolean[][] paramArrayOfboolean1) {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface Zq : ()I
    //   6: iconst_1
    //   7: iadd
    //   8: anewarray java/util/List
    //   11: astore #5
    //   13: invokestatic ZL : ()Ljava/lang/String;
    //   16: iconst_0
    //   17: istore #6
    //   19: iconst_0
    //   20: istore #7
    //   22: astore #4
    //   24: iload #7
    //   26: aload #5
    //   28: arraylength
    //   29: if_icmpge -> 155
    //   32: iload #7
    //   34: aload #5
    //   36: arraylength
    //   37: iconst_1
    //   38: isub
    //   39: if_icmpne -> 73
    //   42: aload_0
    //   43: invokeinterface ZT : ()Lburp/Zb6q;
    //   48: invokeinterface Za : ()Lburp/Zstu;
    //   53: astore #8
    //   55: aload_0
    //   56: invokeinterface ZT : ()Lburp/Zb6q;
    //   61: invokeinterface Ze : ()S
    //   66: istore #9
    //   68: aload #4
    //   70: ifnonnull -> 114
    //   73: aload_0
    //   74: invokeinterface ZV : ()Ljava/util/List;
    //   79: iload #7
    //   81: invokeinterface get : (I)Ljava/lang/Object;
    //   86: checkcast burp/Zb6q
    //   89: invokeinterface Za : ()Lburp/Zstu;
    //   94: astore #8
    //   96: aconst_null
    //   97: checkcast burp/Zlit
    //   100: aload #8
    //   102: getstatic burp/Zt0k.NO_HTML_ANALYSIS : Lburp/Zt0k;
    //   105: aload_1
    //   106: invokestatic Zt : (Lburp/Zlit;Lburp/Zstu;Lburp/Zt0k;Lburp/Zbnt;)Lburp/Zs68;
    //   109: getfield Zb : S
    //   112: istore #9
    //   114: aload #5
    //   116: iload #7
    //   118: aload #8
    //   120: iload #9
    //   122: iload #7
    //   124: aload_1
    //   125: aload_2
    //   126: aload_3
    //   127: invokestatic Zp : (Lburp/Zstu;SILburp/Zbnt;[Z[[Z)Ljava/util/List;
    //   130: aastore
    //   131: aload #5
    //   133: iload #7
    //   135: aaload
    //   136: ifnull -> 147
    //   139: iconst_1
    //   140: istore #6
    //   142: aload #4
    //   144: ifnonnull -> 155
    //   147: iinc #7, 1
    //   150: aload #4
    //   152: ifnonnull -> 24
    //   155: iload #6
    //   157: ifeq -> 165
    //   160: aload #5
    //   162: goto -> 166
    //   165: aconst_null
    //   166: areturn
  }
  
  private static List<int[]> Zp(Zstu paramZstu, short paramShort, int paramInt, Zbnt paramZbnt, boolean[] paramArrayOfboolean, boolean[][] paramArrayOfboolean1) {
    String str = Zs2k.ZL();
    ArrayList<int[]> arrayList = null;
    if ((paramArrayOfboolean.length <= paramInt || !paramArrayOfboolean[paramInt]) && paramShort >= 500 && paramShort < 600) {
      arrayList = new ArrayList();
      byte[] arrayOfByte = Zkb.Zy(Short.toString(paramShort));
      int i = Zlt_.Zj(paramZstu, arrayOfByte, 0, Math.min(20, paramZstu.Zpu()));
      if (i > 0)
        arrayList.add(new int[] { i, i + arrayOfByte.length }); 
    } 
    byte b = 0;
    while (b < Zldu.ZG.length) {
      if (paramArrayOfboolean1.length <= paramInt || !paramArrayOfboolean1[paramInt][b]) {
        Zbu4 zbu4 = Zldu.ZG[b].ZG(paramZstu);
        if (zbu4.ZP() && !Zmhb.Zl(paramZstu, zbu4.ZR(), paramZbnt)) {
          if (arrayList == null)
            arrayList = (ArrayList)new ArrayList<>(); 
          arrayList.add(zbu4.Z_());
        } 
      } 
      b++;
      if (str == null)
        break; 
    } 
    return (List<int[]>)arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zke3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */