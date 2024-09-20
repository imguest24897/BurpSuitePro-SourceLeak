package burp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import javax.swing.RowSorter;

class Zkf8 {
  private final RowSorter.SortKey[] ZM;
  
  private final boolean[] Zj;
  
  private final Comparator<?>[] Zn;
  
  private final Zzv3<?, ?> ZD;
  
  private final Map<Integer, Object[]> ZZ;
  
  public Zkf8(RowSorter.SortKey[] paramArrayOfSortKey, boolean[] paramArrayOfboolean, Comparator<?>[] paramArrayOfComparator, Zzv3<?, ?> paramZzv3) throws InterruptedException {
    this.ZM = Arrays.<RowSorter.SortKey>copyOf(paramArrayOfSortKey, paramArrayOfSortKey.length);
    this.Zj = Arrays.copyOf(paramArrayOfboolean, paramArrayOfboolean.length);
    this.Zn = (Comparator<?>[])Arrays.<Comparator>copyOf((Comparator[])paramArrayOfComparator, paramArrayOfComparator.length);
    this.ZD = paramZzv3;
    this.ZZ = (Map)new HashMap<>();
    ZF();
  }
  
  private void ZF() throws InterruptedException {
    int i = this.ZD.ZW();
    int[] arrayOfInt = Zmua.ZG();
    RowSorter.SortKey[] arrayOfSortKey = this.ZM;
    int j = arrayOfSortKey.length;
    byte b = 0;
    while (b < j) {
      RowSorter.SortKey sortKey = arrayOfSortKey[b];
      Object[] arrayOfObject = new Object[i];
      byte b1 = 0;
      while (b1 < i) {
        try {
          if (Thread.currentThread().isInterrupted())
            throw new InterruptedException(); 
        } catch (InterruptedException interruptedException) {
          throw a(null);
        } 
        arrayOfObject[b1] = this.ZD.ZU(b1, sortKey.getColumn());
        b1++;
        if (arrayOfInt != null)
          break; 
      } 
      this.ZZ.put(Integer.valueOf(sortKey.getColumn()), arrayOfObject);
      b++;
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  int Zx(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZG : ()[I
    //   3: iconst_0
    //   4: istore #9
    //   6: astore_3
    //   7: iload #9
    //   9: aload_0
    //   10: getfield ZM : [Ljavax/swing/RowSorter$SortKey;
    //   13: arraylength
    //   14: if_icmpge -> 210
    //   17: aload_0
    //   18: getfield ZM : [Ljavax/swing/RowSorter$SortKey;
    //   21: iload #9
    //   23: aaload
    //   24: invokevirtual getColumn : ()I
    //   27: istore #4
    //   29: aload_0
    //   30: getfield ZM : [Ljavax/swing/RowSorter$SortKey;
    //   33: iload #9
    //   35: aaload
    //   36: invokevirtual getSortOrder : ()Ljavax/swing/SortOrder;
    //   39: astore #5
    //   41: aload #5
    //   43: getstatic javax/swing/SortOrder.UNSORTED : Ljavax/swing/SortOrder;
    //   46: if_acmpne -> 58
    //   49: iload_1
    //   50: iload_2
    //   51: isub
    //   52: istore #8
    //   54: aload_3
    //   55: ifnull -> 195
    //   58: aload_0
    //   59: getfield ZZ : Ljava/util/Map;
    //   62: iload #4
    //   64: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   67: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   72: checkcast [Ljava/lang/Object;
    //   75: iload_1
    //   76: aaload
    //   77: astore #6
    //   79: aload_0
    //   80: getfield ZZ : Ljava/util/Map;
    //   83: iload #4
    //   85: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   88: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   93: checkcast [Ljava/lang/Object;
    //   96: iload_2
    //   97: aaload
    //   98: astore #7
    //   100: aload_0
    //   101: getfield Zj : [Z
    //   104: iload #4
    //   106: baload
    //   107: ifeq -> 126
    //   110: aload_0
    //   111: aload #6
    //   113: invokevirtual ZG : (Ljava/lang/Object;)Ljava/lang/String;
    //   116: astore #6
    //   118: aload_0
    //   119: aload #7
    //   121: invokevirtual ZG : (Ljava/lang/Object;)Ljava/lang/String;
    //   124: astore #7
    //   126: aload #6
    //   128: ifnonnull -> 147
    //   131: aload #7
    //   133: ifnonnull -> 140
    //   136: iconst_0
    //   137: goto -> 141
    //   140: iconst_m1
    //   141: istore #8
    //   143: aload_3
    //   144: ifnull -> 181
    //   147: aload #7
    //   149: ifnonnull -> 159
    //   152: iconst_1
    //   153: istore #8
    //   155: aload_3
    //   156: ifnull -> 181
    //   159: aload_0
    //   160: getfield Zn : [Ljava/util/Comparator;
    //   163: iload #9
    //   165: aaload
    //   166: astore #10
    //   168: aload #10
    //   170: aload #6
    //   172: aload #7
    //   174: invokeinterface compare : (Ljava/lang/Object;Ljava/lang/Object;)I
    //   179: istore #8
    //   181: aload #5
    //   183: getstatic javax/swing/SortOrder.DESCENDING : Ljavax/swing/SortOrder;
    //   186: if_acmpne -> 195
    //   189: iload #8
    //   191: iconst_m1
    //   192: imul
    //   193: istore #8
    //   195: iload #8
    //   197: ifeq -> 203
    //   200: iload #8
    //   202: ireturn
    //   203: iinc #9, 1
    //   206: aload_3
    //   207: ifnull -> 7
    //   210: iload_1
    //   211: iload_2
    //   212: isub
    //   213: ireturn
  }
  
  private String ZG(Object paramObject) {
    if (paramObject == null)
      return ""; 
    String str = paramObject.toString();
    return (str == null) ? "" : str;
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkf8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */