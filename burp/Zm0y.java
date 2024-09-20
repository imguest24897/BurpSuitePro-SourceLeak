package burp;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;

abstract class Zm0y<M, I> extends RowSorter<M> {
  private boolean Zp;
  
  Zs9e[] ZO;
  
  int[] ZW;
  
  private Comparator<?>[] Zv;
  
  private boolean[] Zh;
  
  RowSorter.SortKey[] Ze;
  
  Comparator<?>[] ZA;
  
  private RowFilter<? super M, ? super I> Zs;
  
  private Zkob Zd;
  
  List<RowSorter.SortKey> Zb = Collections.emptyList();
  
  boolean[] ZN;
  
  boolean ZK;
  
  private int Zq = 3;
  
  private Zzv3<M, I> Zm;
  
  protected int Zi;
  
  private static boolean Zc;
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected final void Zs(Zzv3<M, I> paramZzv3) {
    int[] arrayOfInt = Zmua.ZG();
    try {
      if (paramZzv3 == null)
        throw new IllegalArgumentException(a(-3849, -17585)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zzv3<M, I> zzv3 = this.Zm;
    try {
      this.Zm = paramZzv3;
      if (zzv3 != null) {
        try {
          modelStructureChanged();
          if (arrayOfInt != null) {
            this.Zi = Zc().ZW();
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zi = Zc().ZW();
  }
  
  protected final Zzv3<M, I> Zc() {
    return this.Zm;
  }
  
  public final M getModel() {
    return Zc().Zo();
  }
  
  public void Zk(int paramInt, boolean paramBoolean) {
    ZV(paramInt);
    int[] arrayOfInt = Zmua.ZG();
    if (this.Zh == null) {
      this.Zh = new boolean[Zc().Zm()];
      int i = this.Zh.length - 1;
      while (i >= 0) {
        this.Zh[i] = true;
        i--;
        if (arrayOfInt != null)
          break; 
      } 
    } 
    this.Zh[paramInt] = paramBoolean;
  }
  
  public boolean ZO(int paramInt) {
    try {
      ZV(paramInt);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.Zh == null) ? true : this.Zh[paramInt];
  }
  
  public void setSortKeys(List<? extends RowSorter.SortKey> paramList) {
    // Byte code:
    //   0: invokestatic ZG : ()[I
    //   3: aload_0
    //   4: getfield Zb : Ljava/util/List;
    //   7: astore_3
    //   8: astore_2
    //   9: aload_1
    //   10: ifnull -> 149
    //   13: aload_1
    //   14: invokeinterface isEmpty : ()Z
    //   19: ifne -> 149
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   28: athrow
    //   29: aload_0
    //   30: invokevirtual Zc : ()Lburp/Zzv3;
    //   33: invokevirtual Zm : ()I
    //   36: istore #4
    //   38: aload_1
    //   39: invokeinterface iterator : ()Ljava/util/Iterator;
    //   44: astore #5
    //   46: aload #5
    //   48: invokeinterface hasNext : ()Z
    //   53: ifeq -> 130
    //   56: aload #5
    //   58: invokeinterface next : ()Ljava/lang/Object;
    //   63: checkcast javax/swing/RowSorter$SortKey
    //   66: astore #6
    //   68: aload #6
    //   70: ifnull -> 105
    //   73: aload #6
    //   75: invokevirtual getColumn : ()I
    //   78: iflt -> 105
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   87: athrow
    //   88: aload #6
    //   90: invokevirtual getColumn : ()I
    //   93: iload #4
    //   95: if_icmplt -> 126
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   104: athrow
    //   105: new java/lang/IllegalArgumentException
    //   108: dup
    //   109: sipush #-3853
    //   112: sipush #-28381
    //   115: invokestatic a : (II)Ljava/lang/String;
    //   118: invokespecial <init> : (Ljava/lang/String;)V
    //   121: athrow
    //   122: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   125: athrow
    //   126: aload_2
    //   127: ifnull -> 46
    //   130: aload_0
    //   131: new java/util/ArrayList
    //   134: dup
    //   135: aload_1
    //   136: invokespecial <init> : (Ljava/util/Collection;)V
    //   139: invokestatic unmodifiableList : (Ljava/util/List;)Ljava/util/List;
    //   142: putfield Zb : Ljava/util/List;
    //   145: aload_2
    //   146: ifnull -> 163
    //   149: aload_0
    //   150: invokestatic emptyList : ()Ljava/util/List;
    //   153: putfield Zb : Ljava/util/List;
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   162: athrow
    //   163: aload_0
    //   164: getfield Zb : Ljava/util/List;
    //   167: aload_3
    //   168: invokeinterface equals : (Ljava/lang/Object;)Z
    //   173: ifne -> 220
    //   176: aload_0
    //   177: invokevirtual fireSortOrderChanged : ()V
    //   180: aload_0
    //   181: getfield ZO : [Lburp/Zs9e;
    //   184: ifnonnull -> 209
    //   187: goto -> 194
    //   190: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   193: athrow
    //   194: aload_0
    //   195: invokevirtual ZB : ()V
    //   198: aload_2
    //   199: ifnull -> 220
    //   202: goto -> 209
    //   205: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   208: athrow
    //   209: aload_0
    //   210: invokevirtual ZG : ()V
    //   213: goto -> 220
    //   216: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   219: athrow
    //   220: return
    // Exception table:
    //   from	to	target	type
    //   9	22	25	java/lang/IllegalArgumentException
    //   68	81	84	java/lang/IllegalArgumentException
    //   73	98	101	java/lang/IllegalArgumentException
    //   88	122	122	java/lang/IllegalArgumentException
    //   130	156	159	java/lang/IllegalArgumentException
    //   163	187	190	java/lang/IllegalArgumentException
    //   176	202	205	java/lang/IllegalArgumentException
    //   194	213	216	java/lang/IllegalArgumentException
  }
  
  public List<? extends RowSorter.SortKey> getSortKeys() {
    return this.Zb;
  }
  
  public int ZJ() {
    return this.Zq;
  }
  
  public void ZO(boolean paramBoolean) {
    this.Zp = paramBoolean;
  }
  
  public boolean Zz() {
    return this.Zp;
  }
  
  public void Zt(RowFilter<? super M, ? super I> paramRowFilter) {
    this.Zs = paramRowFilter;
    ZB();
  }
  
  public RowFilter<? super M, ? super I> Zq() {
    return this.Zs;
  }
  
  public void toggleSortOrder(int paramInt) {
    // Byte code:
    //   0: invokestatic ZG : ()[I
    //   3: aload_0
    //   4: iload_1
    //   5: invokevirtual ZV : (I)V
    //   8: astore_2
    //   9: aload_0
    //   10: iload_1
    //   11: invokevirtual ZO : (I)Z
    //   14: ifeq -> 228
    //   17: new java/util/ArrayList
    //   20: dup
    //   21: aload_0
    //   22: invokevirtual getSortKeys : ()Ljava/util/List;
    //   25: invokespecial <init> : (Ljava/util/Collection;)V
    //   28: astore_3
    //   29: aload_3
    //   30: invokeinterface size : ()I
    //   35: iconst_1
    //   36: isub
    //   37: istore #5
    //   39: iload #5
    //   41: iflt -> 87
    //   44: aload_3
    //   45: iload #5
    //   47: invokeinterface get : (I)Ljava/lang/Object;
    //   52: checkcast javax/swing/RowSorter$SortKey
    //   55: invokevirtual getColumn : ()I
    //   58: iload_1
    //   59: if_icmpne -> 73
    //   62: aload_2
    //   63: ifnull -> 87
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   72: athrow
    //   73: iinc #5, -1
    //   76: aload_2
    //   77: ifnull -> 39
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   86: athrow
    //   87: iload #5
    //   89: iconst_m1
    //   90: if_icmpne -> 119
    //   93: new javax/swing/RowSorter$SortKey
    //   96: dup
    //   97: iload_1
    //   98: getstatic javax/swing/SortOrder.ASCENDING : Ljavax/swing/SortOrder;
    //   101: invokespecial <init> : (ILjavax/swing/SortOrder;)V
    //   104: astore #4
    //   106: aload_3
    //   107: iconst_0
    //   108: aload #4
    //   110: invokeinterface add : (ILjava/lang/Object;)V
    //   115: aload_2
    //   116: ifnull -> 198
    //   119: iload #5
    //   121: ifne -> 164
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   130: athrow
    //   131: aload_3
    //   132: iconst_0
    //   133: aload_0
    //   134: aload_3
    //   135: iconst_0
    //   136: invokeinterface get : (I)Ljava/lang/Object;
    //   141: checkcast javax/swing/RowSorter$SortKey
    //   144: invokevirtual Ze : (Ljavax/swing/RowSorter$SortKey;)Ljavax/swing/RowSorter$SortKey;
    //   147: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   152: pop
    //   153: aload_2
    //   154: ifnull -> 198
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   163: athrow
    //   164: aload_3
    //   165: iload #5
    //   167: invokeinterface remove : (I)Ljava/lang/Object;
    //   172: pop
    //   173: aload_3
    //   174: iconst_0
    //   175: new javax/swing/RowSorter$SortKey
    //   178: dup
    //   179: iload_1
    //   180: getstatic javax/swing/SortOrder.ASCENDING : Ljavax/swing/SortOrder;
    //   183: invokespecial <init> : (ILjavax/swing/SortOrder;)V
    //   186: invokeinterface add : (ILjava/lang/Object;)V
    //   191: goto -> 198
    //   194: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   197: athrow
    //   198: aload_3
    //   199: invokeinterface size : ()I
    //   204: aload_0
    //   205: invokevirtual ZJ : ()I
    //   208: if_icmple -> 223
    //   211: aload_3
    //   212: iconst_0
    //   213: aload_0
    //   214: invokevirtual ZJ : ()I
    //   217: invokeinterface subList : (II)Ljava/util/List;
    //   222: astore_3
    //   223: aload_0
    //   224: aload_3
    //   225: invokevirtual setSortKeys : (Ljava/util/List;)V
    //   228: return
    // Exception table:
    //   from	to	target	type
    //   44	66	69	java/lang/IllegalArgumentException
    //   62	80	83	java/lang/IllegalArgumentException
    //   106	124	127	java/lang/IllegalArgumentException
    //   119	157	160	java/lang/IllegalArgumentException
    //   131	191	194	java/lang/IllegalArgumentException
  }
  
  private RowSorter.SortKey Ze(RowSorter.SortKey paramSortKey) {
    try {
      if (paramSortKey.getSortOrder() == SortOrder.ASCENDING)
        return new RowSorter.SortKey(paramSortKey.getColumn(), SortOrder.DESCENDING); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new RowSorter.SortKey(paramSortKey.getColumn(), SortOrder.ASCENDING);
  }
  
  public int convertRowIndexToView(int paramInt) {
    try {
      if (this.ZW == null)
        return Zq(paramInt); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this.ZW[paramInt];
  }
  
  public int convertRowIndexToModel(int paramInt) {
    try {
      if (this.ZO == null)
        return Zq(paramInt); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.ZO[paramInt]).Zl;
  }
  
  private int Zq(int paramInt) {
    // Byte code:
    //   0: invokestatic ZG : ()[I
    //   3: astore_2
    //   4: iload_1
    //   5: iflt -> 23
    //   8: iload_1
    //   9: aload_0
    //   10: getfield Zi : I
    //   13: if_icmplt -> 120
    //   16: goto -> 23
    //   19: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   22: athrow
    //   23: iload_1
    //   24: aload_0
    //   25: getfield Zi : I
    //   28: if_icmplt -> 99
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   37: athrow
    //   38: iload_1
    //   39: aload_0
    //   40: invokevirtual Zc : ()Lburp/Zzv3;
    //   43: invokevirtual ZW : ()I
    //   46: if_icmpge -> 99
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   55: athrow
    //   56: getstatic burp/Zm0y.Zc : Z
    //   59: ifeq -> 120
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   68: athrow
    //   69: iconst_0
    //   70: putstatic burp/Zm0y.Zc : Z
    //   73: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   76: sipush #-3850
    //   79: sipush #11264
    //   82: invokestatic a : (II)Ljava/lang/String;
    //   85: invokevirtual println : (Ljava/lang/String;)V
    //   88: aload_2
    //   89: ifnull -> 120
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   98: athrow
    //   99: new java/lang/IndexOutOfBoundsException
    //   102: dup
    //   103: sipush #-3856
    //   106: sipush #-23605
    //   109: invokestatic a : (II)Ljava/lang/String;
    //   112: invokespecial <init> : (Ljava/lang/String;)V
    //   115: athrow
    //   116: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   119: athrow
    //   120: iload_1
    //   121: ireturn
    // Exception table:
    //   from	to	target	type
    //   4	16	19	java/lang/IllegalArgumentException
    //   8	31	34	java/lang/IllegalArgumentException
    //   23	49	52	java/lang/IllegalArgumentException
    //   38	62	65	java/lang/IllegalArgumentException
    //   56	92	95	java/lang/IllegalArgumentException
    //   69	116	116	java/lang/IllegalArgumentException
  }
  
  boolean ZH() {
    List<? extends RowSorter.SortKey> list = getSortKeys();
    int i = list.size();
    try {
      if (i != 0) {
        try {
          if (((RowSorter.SortKey)list.get(0)).getSortOrder() == SortOrder.UNSORTED);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private void ZG() {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield ZO : [Lburp/Zs9e;
    //   5: invokevirtual ZP : ([Lburp/Zs9e;)[I
    //   8: astore_2
    //   9: invokestatic ZG : ()[I
    //   12: aload_0
    //   13: invokevirtual ZV : ()V
    //   16: astore_1
    //   17: aload_0
    //   18: aload_0
    //   19: invokevirtual getSortKeys : ()Ljava/util/List;
    //   22: invokevirtual Zp : (Ljava/util/List;)V
    //   25: aload_0
    //   26: invokevirtual ZH : ()Z
    //   29: ifeq -> 133
    //   32: aload_0
    //   33: invokevirtual Zq : ()Ljavax/swing/RowFilter;
    //   36: ifnonnull -> 67
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   45: athrow
    //   46: aload_0
    //   47: aconst_null
    //   48: putfield ZO : [Lburp/Zs9e;
    //   51: aload_0
    //   52: aconst_null
    //   53: putfield ZW : [I
    //   56: aload_1
    //   57: ifnull -> 152
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   66: athrow
    //   67: iconst_0
    //   68: istore_3
    //   69: iconst_0
    //   70: istore #4
    //   72: iload #4
    //   74: aload_0
    //   75: getfield ZW : [I
    //   78: arraylength
    //   79: if_icmpge -> 129
    //   82: aload_0
    //   83: getfield ZW : [I
    //   86: iload #4
    //   88: iaload
    //   89: iconst_m1
    //   90: if_icmpeq -> 122
    //   93: aload_0
    //   94: getfield ZO : [Lburp/Zs9e;
    //   97: iload_3
    //   98: aaload
    //   99: iload #4
    //   101: putfield Zl : I
    //   104: aload_0
    //   105: getfield ZW : [I
    //   108: iload #4
    //   110: iload_3
    //   111: iinc #3, 1
    //   114: iastore
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   121: athrow
    //   122: iinc #4, 1
    //   125: aload_1
    //   126: ifnull -> 72
    //   129: aload_1
    //   130: ifnull -> 152
    //   133: aload_0
    //   134: getfield ZO : [Lburp/Zs9e;
    //   137: invokestatic sort : ([Ljava/lang/Object;)V
    //   140: aload_0
    //   141: iconst_0
    //   142: invokevirtual ZM : (Z)V
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   151: athrow
    //   152: aload_0
    //   153: aload_2
    //   154: invokevirtual fireRowSorterChanged : ([I)V
    //   157: return
    // Exception table:
    //   from	to	target	type
    //   17	39	42	java/lang/IllegalArgumentException
    //   32	60	63	java/lang/IllegalArgumentException
    //   82	115	118	java/lang/IllegalArgumentException
    //   129	145	148	java/lang/IllegalArgumentException
  }
  
  protected void ZB() {
    // Byte code:
    //   0: invokestatic ZG : ()[I
    //   3: aload_0
    //   4: iconst_1
    //   5: putfield ZK : Z
    //   8: astore_1
    //   9: aload_0
    //   10: aload_0
    //   11: getfield ZO : [Lburp/Zs9e;
    //   14: invokevirtual ZP : ([Lburp/Zs9e;)[I
    //   17: astore_2
    //   18: aload_0
    //   19: invokevirtual ZV : ()V
    //   22: aload_0
    //   23: invokevirtual ZH : ()Z
    //   26: ifeq -> 99
    //   29: aload_0
    //   30: iconst_0
    //   31: anewarray javax/swing/RowSorter$SortKey
    //   34: putfield Ze : [Ljavax/swing/RowSorter$SortKey;
    //   37: aload_0
    //   38: invokevirtual Zq : ()Ljavax/swing/RowFilter;
    //   41: ifnonnull -> 91
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   50: athrow
    //   51: aload_0
    //   52: getfield ZO : [Lburp/Zs9e;
    //   55: ifnull -> 86
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   64: athrow
    //   65: aload_0
    //   66: aconst_null
    //   67: putfield ZO : [Lburp/Zs9e;
    //   70: aload_0
    //   71: aconst_null
    //   72: putfield ZW : [I
    //   75: aload_1
    //   76: ifnull -> 177
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   85: athrow
    //   86: return
    //   87: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   90: athrow
    //   91: aload_0
    //   92: invokevirtual ZP : ()V
    //   95: aload_1
    //   96: ifnull -> 177
    //   99: aload_0
    //   100: aload_0
    //   101: invokevirtual getSortKeys : ()Ljava/util/List;
    //   104: invokevirtual Zp : (Ljava/util/List;)V
    //   107: aload_0
    //   108: invokevirtual Zq : ()Ljavax/swing/RowFilter;
    //   111: ifnull -> 136
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   120: athrow
    //   121: aload_0
    //   122: invokevirtual ZP : ()V
    //   125: aload_1
    //   126: ifnull -> 165
    //   129: goto -> 136
    //   132: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   135: athrow
    //   136: aload_0
    //   137: aload_0
    //   138: invokevirtual Zc : ()Lburp/Zzv3;
    //   141: invokevirtual ZW : ()I
    //   144: invokevirtual ZW : (I)V
    //   147: aload_0
    //   148: aload_0
    //   149: invokevirtual Zc : ()Lburp/Zzv3;
    //   152: invokevirtual ZW : ()I
    //   155: invokevirtual Zj : (I)V
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   164: athrow
    //   165: aload_0
    //   166: getfield ZO : [Lburp/Zs9e;
    //   169: invokestatic sort : ([Ljava/lang/Object;)V
    //   172: aload_0
    //   173: iconst_0
    //   174: invokevirtual ZM : (Z)V
    //   177: aload_0
    //   178: aload_2
    //   179: invokevirtual fireRowSorterChanged : ([I)V
    //   182: return
    // Exception table:
    //   from	to	target	type
    //   18	44	47	java/lang/IllegalArgumentException
    //   29	58	61	java/lang/IllegalArgumentException
    //   51	79	82	java/lang/IllegalArgumentException
    //   65	87	87	java/lang/IllegalArgumentException
    //   91	114	117	java/lang/IllegalArgumentException
    //   99	129	132	java/lang/IllegalArgumentException
    //   121	158	161	java/lang/IllegalArgumentException
  }
  
  void ZV() {
    // Byte code:
    //   0: invokestatic ZG : ()[I
    //   3: aload_0
    //   4: invokevirtual Zc : ()Lburp/Zzv3;
    //   7: invokevirtual Zm : ()I
    //   10: istore_2
    //   11: astore_1
    //   12: aload_0
    //   13: getfield ZN : [Z
    //   16: ifnull -> 35
    //   19: aload_0
    //   20: getfield ZN : [Z
    //   23: arraylength
    //   24: iload_2
    //   25: if_icmpeq -> 49
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   34: athrow
    //   35: aload_0
    //   36: iload_2
    //   37: newarray boolean
    //   39: putfield ZN : [Z
    //   42: goto -> 49
    //   45: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   48: athrow
    //   49: iinc #2, -1
    //   52: iload_2
    //   53: iflt -> 74
    //   56: aload_0
    //   57: getfield ZN : [Z
    //   60: iload_2
    //   61: aload_0
    //   62: iload_2
    //   63: invokevirtual Zr : (I)Z
    //   66: bastore
    //   67: iinc #2, -1
    //   70: aload_1
    //   71: ifnull -> 52
    //   74: return
    // Exception table:
    //   from	to	target	type
    //   12	28	31	java/lang/IllegalArgumentException
    //   19	42	45	java/lang/IllegalArgumentException
  }
  
  void ZP() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Zc : ()Lburp/Zzv3;
    //   4: invokevirtual ZW : ()I
    //   7: istore_2
    //   8: invokestatic ZG : ()[I
    //   11: iconst_0
    //   12: istore #5
    //   14: aload_0
    //   15: iload_2
    //   16: invokevirtual ZW : (I)V
    //   19: iconst_0
    //   20: istore_3
    //   21: astore_1
    //   22: iload_3
    //   23: iload_2
    //   24: if_icmpge -> 80
    //   27: aload_0
    //   28: iload_3
    //   29: invokevirtual ZH : (I)Z
    //   32: ifeq -> 56
    //   35: aload_0
    //   36: getfield ZW : [I
    //   39: iload_3
    //   40: iload_3
    //   41: iload #5
    //   43: isub
    //   44: iastore
    //   45: aload_1
    //   46: ifnull -> 73
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   55: athrow
    //   56: aload_0
    //   57: getfield ZW : [I
    //   60: iload_3
    //   61: iconst_m1
    //   62: iastore
    //   63: iinc #5, 1
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   72: athrow
    //   73: iinc #3, 1
    //   76: aload_1
    //   77: ifnull -> 22
    //   80: aload_0
    //   81: iload_2
    //   82: iload #5
    //   84: isub
    //   85: invokevirtual Zj : (I)V
    //   88: iconst_0
    //   89: istore_3
    //   90: iconst_0
    //   91: istore #4
    //   93: iload_3
    //   94: iload_2
    //   95: if_icmpge -> 136
    //   98: aload_0
    //   99: getfield ZW : [I
    //   102: iload_3
    //   103: iaload
    //   104: iconst_m1
    //   105: if_icmpeq -> 129
    //   108: aload_0
    //   109: getfield ZO : [Lburp/Zs9e;
    //   112: iload #4
    //   114: iinc #4, 1
    //   117: aaload
    //   118: iload_3
    //   119: putfield Zl : I
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   128: athrow
    //   129: iinc #3, 1
    //   132: aload_1
    //   133: ifnull -> 93
    //   136: return
    // Exception table:
    //   from	to	target	type
    //   27	49	52	java/lang/IllegalArgumentException
    //   35	66	69	java/lang/IllegalArgumentException
    //   98	122	125	java/lang/IllegalArgumentException
  }
  
  void ZW(int paramInt) {
    try {
      if (this.ZW != null) {
        try {
          if (this.ZW.length != paramInt) {
            this.ZW = new int[paramInt];
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.ZW = new int[paramInt];
  }
  
  void Zj(int paramInt) {
    // Byte code:
    //   0: invokestatic ZG : ()[I
    //   3: iconst_0
    //   4: istore_3
    //   5: astore_2
    //   6: aload_0
    //   7: getfield ZO : [Lburp/Zs9e;
    //   10: ifnull -> 62
    //   13: iload_1
    //   14: aload_0
    //   15: getfield ZO : [Lburp/Zs9e;
    //   18: arraylength
    //   19: invokestatic min : (II)I
    //   22: istore_3
    //   23: aload_0
    //   24: getfield ZO : [Lburp/Zs9e;
    //   27: arraylength
    //   28: iload_1
    //   29: if_icmpeq -> 77
    //   32: aload_0
    //   33: getfield ZO : [Lburp/Zs9e;
    //   36: astore #4
    //   38: aload_0
    //   39: iload_1
    //   40: anewarray burp/Zs9e
    //   43: putfield ZO : [Lburp/Zs9e;
    //   46: aload #4
    //   48: iconst_0
    //   49: aload_0
    //   50: getfield ZO : [Lburp/Zs9e;
    //   53: iconst_0
    //   54: iload_3
    //   55: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   58: aload_2
    //   59: ifnull -> 77
    //   62: aload_0
    //   63: iload_1
    //   64: anewarray burp/Zs9e
    //   67: putfield ZO : [Lburp/Zs9e;
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   76: athrow
    //   77: iconst_0
    //   78: istore #4
    //   80: iload #4
    //   82: iload_3
    //   83: if_icmpge -> 105
    //   86: aload_0
    //   87: getfield ZO : [Lburp/Zs9e;
    //   90: iload #4
    //   92: aaload
    //   93: iload #4
    //   95: putfield Zl : I
    //   98: iinc #4, 1
    //   101: aload_2
    //   102: ifnull -> 80
    //   105: iload_3
    //   106: istore #4
    //   108: iload #4
    //   110: iload_1
    //   111: if_icmpge -> 138
    //   114: aload_0
    //   115: getfield ZO : [Lburp/Zs9e;
    //   118: iload #4
    //   120: new burp/Zs9e
    //   123: dup
    //   124: aload_0
    //   125: iload #4
    //   127: invokespecial <init> : (Lburp/Zm0y;I)V
    //   130: aastore
    //   131: iinc #4, 1
    //   134: aload_2
    //   135: ifnull -> 108
    //   138: return
    // Exception table:
    //   from	to	target	type
    //   38	70	73	java/lang/IllegalArgumentException
  }
  
  void Zp(List<? extends RowSorter.SortKey> paramList) {
    int i = paramList.size();
    this.ZA = (Comparator<?>[])new Comparator[i];
    byte b = 0;
    int[] arrayOfInt = Zmua.ZG();
    while (b < i) {
      this.ZA[b] = Zf(((RowSorter.SortKey)paramList.get(b)).getColumn());
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    this.Ze = paramList.<RowSorter.SortKey>toArray(new RowSorter.SortKey[i]);
  }
  
  protected boolean Zr(int paramInt) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (ZZ(paramInt) == null);
  }
  
  void ZM(boolean paramBoolean) {
    int[] arrayOfInt = Zmua.ZG();
    if (paramBoolean) {
      int j = this.ZW.length - 1;
      while (j >= 0) {
        this.ZW[j] = -1;
        j--;
        if (arrayOfInt != null)
          break; 
      } 
    } 
    int i = this.ZO.length - 1;
    while (i >= 0) {
      this.ZW[(this.ZO[i]).Zl] = i;
      i--;
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  int[] ZP(Zs9e[] paramArrayOfZs9e) {
    int[] arrayOfInt = Zmua.ZG();
    if (paramArrayOfZs9e != null) {
      int[] arrayOfInt1 = new int[paramArrayOfZs9e.length];
      int i = paramArrayOfZs9e.length - 1;
      while (i >= 0) {
        arrayOfInt1[i] = (paramArrayOfZs9e[i]).Zl;
        i--;
        if (arrayOfInt != null)
          break; 
      } 
      return arrayOfInt1;
    } 
    return new int[0];
  }
  
  public void ZQ(int paramInt, Comparator<?> paramComparator) {
    try {
      ZV(paramInt);
      if (this.Zv == null)
        this.Zv = (Comparator<?>[])new Comparator[Zc().Zm()]; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zv[paramInt] = paramComparator;
  }
  
  public Comparator<?> ZZ(int paramInt) {
    try {
      ZV(paramInt);
      if (this.Zv != null)
        return this.Zv[paramInt]; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  private Comparator<?> Zf(int paramInt) {
    Comparator<?> comparator = ZZ(paramInt);
    try {
      if (comparator != null)
        return comparator; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Collator.getInstance();
  }
  
  private RowFilter.Entry<M, I> Zz(int paramInt) {
    try {
      if (this.Zd == null)
        this.Zd = new Zkob(this); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zd.ZY = paramInt;
    return this.Zd;
  }
  
  public int getViewRowCount() {
    try {
      if (this.ZO != null)
        return this.ZO.length; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Math.max(Zc().ZW(), this.Zi);
  }
  
  public int getModelRowCount() {
    return Zc().ZW();
  }
  
  private void ZW() {
    this.ZW = null;
    this.ZO = null;
    this.Zv = null;
    this.Zh = null;
    int[] arrayOfInt = Zmua.ZG();
    try {
      if (ZH()) {
        try {
          ZB();
          if (arrayOfInt != null) {
            setSortKeys(null);
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    setSortKeys(null);
  }
  
  public void modelStructureChanged() {
    ZW();
    this.Zi = Zc().ZW();
  }
  
  public void allRowsChanged() {
    this.Zi = Zc().ZW();
    ZB();
  }
  
  public void rowsInserted(int paramInt1, int paramInt2) {
    ZL(paramInt1, paramInt2);
    int i = Zc().ZW();
    try {
      if (paramInt2 >= i)
        throw new IndexOutOfBoundsException(a(-3855, 13411)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      this.Zi = i;
      if (ZV(paramInt1, paramInt2))
        ZM(paramInt1, paramInt2); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void rowsDeleted(int paramInt1, int paramInt2) {
    try {
      ZL(paramInt1, paramInt2);
      if (paramInt1 < this.Zi)
        try {
          if (paramInt2 < this.Zi) {
            try {
              this.Zi = Zc().ZW();
              if (ZV(paramInt1, paramInt2))
                ZR(paramInt1, paramInt2); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return;
          } 
          throw new IndexOutOfBoundsException(a(-3855, 13411));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new IndexOutOfBoundsException(a(-3855, 13411));
  }
  
  public void rowsUpdated(int paramInt1, int paramInt2) {
    ZL(paramInt1, paramInt2);
    int[] arrayOfInt = Zmua.ZG();
    try {
      if (paramInt1 < this.Zi) {
        try {
          if (paramInt2 >= this.Zi)
            throw new IndexOutOfBoundsException(a(-3851, 19158)); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        throw new IndexOutOfBoundsException(a(-3851, 19158));
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (Zz()) {
        try {
          if (ZV(paramInt1, paramInt2))
            try {
              ZX(paramInt1, paramInt2);
              if (arrayOfInt != null) {
                this.ZK = false;
                return;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.ZK = false;
  }
  
  public void rowsUpdated(int paramInt1, int paramInt2, int paramInt3) {
    ZV(paramInt3);
    rowsUpdated(paramInt1, paramInt2);
  }
  
  private void ZL(int paramInt1, int paramInt2) {
    try {
      if (paramInt1 <= paramInt2)
        try {
          if (paramInt1 >= 0)
            try {
              if (paramInt2 >= 0)
                try {
                  if (paramInt1 <= this.Zi)
                    return; 
                  throw new IndexOutOfBoundsException(a(-3855, 13411));
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                }  
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new IndexOutOfBoundsException(a(-3855, 13411));
  }
  
  boolean ZH(int paramInt) {
    RowFilter<? super M, ? super I> rowFilter = Zq();
    try {
      if (rowFilter != null)
        return rowFilter.include(Zz(paramInt)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return true;
  }
  
  private int ZW(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZG : ()[I
    //   3: iconst_0
    //   4: istore #9
    //   6: astore_3
    //   7: iload #9
    //   9: aload_0
    //   10: getfield Ze : [Ljavax/swing/RowSorter$SortKey;
    //   13: arraylength
    //   14: if_icmpge -> 232
    //   17: aload_0
    //   18: getfield Ze : [Ljavax/swing/RowSorter$SortKey;
    //   21: iload #9
    //   23: aaload
    //   24: invokevirtual getColumn : ()I
    //   27: istore #4
    //   29: aload_0
    //   30: getfield Ze : [Ljavax/swing/RowSorter$SortKey;
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
    //   55: ifnull -> 213
    //   58: aload_0
    //   59: getfield ZN : [Z
    //   62: iload #4
    //   64: baload
    //   65: ifeq -> 103
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   74: athrow
    //   75: aload_0
    //   76: invokevirtual Zc : ()Lburp/Zzv3;
    //   79: iload_1
    //   80: iload #4
    //   82: invokevirtual Zs : (II)Ljava/lang/String;
    //   85: astore #6
    //   87: aload_0
    //   88: invokevirtual Zc : ()Lburp/Zzv3;
    //   91: iload_2
    //   92: iload #4
    //   94: invokevirtual Zs : (II)Ljava/lang/String;
    //   97: astore #7
    //   99: aload_3
    //   100: ifnull -> 127
    //   103: aload_0
    //   104: invokevirtual Zc : ()Lburp/Zzv3;
    //   107: iload_1
    //   108: iload #4
    //   110: invokevirtual ZU : (II)Ljava/lang/Object;
    //   113: astore #6
    //   115: aload_0
    //   116: invokevirtual Zc : ()Lburp/Zzv3;
    //   119: iload_2
    //   120: iload #4
    //   122: invokevirtual ZU : (II)Ljava/lang/Object;
    //   125: astore #7
    //   127: aload #6
    //   129: ifnonnull -> 158
    //   132: aload #7
    //   134: ifnonnull -> 151
    //   137: goto -> 144
    //   140: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   143: athrow
    //   144: iconst_0
    //   145: istore #8
    //   147: aload_3
    //   148: ifnull -> 199
    //   151: iconst_m1
    //   152: istore #8
    //   154: aload_3
    //   155: ifnull -> 199
    //   158: aload #7
    //   160: ifnonnull -> 177
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   169: athrow
    //   170: iconst_1
    //   171: istore #8
    //   173: aload_3
    //   174: ifnull -> 199
    //   177: aload_0
    //   178: getfield ZA : [Ljava/util/Comparator;
    //   181: iload #9
    //   183: aaload
    //   184: astore #10
    //   186: aload #10
    //   188: aload #6
    //   190: aload #7
    //   192: invokeinterface compare : (Ljava/lang/Object;Ljava/lang/Object;)I
    //   197: istore #8
    //   199: aload #5
    //   201: getstatic javax/swing/SortOrder.DESCENDING : Ljavax/swing/SortOrder;
    //   204: if_acmpne -> 213
    //   207: iload #8
    //   209: iconst_m1
    //   210: imul
    //   211: istore #8
    //   213: iload #8
    //   215: ifeq -> 225
    //   218: iload #8
    //   220: ireturn
    //   221: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   224: athrow
    //   225: iinc #9, 1
    //   228: aload_3
    //   229: ifnull -> 7
    //   232: iload_1
    //   233: iload_2
    //   234: isub
    //   235: ireturn
    // Exception table:
    //   from	to	target	type
    //   54	68	71	java/lang/IllegalArgumentException
    //   127	137	140	java/lang/IllegalArgumentException
    //   154	163	166	java/lang/IllegalArgumentException
    //   213	221	221	java/lang/IllegalArgumentException
  }
  
  private boolean ZF() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.ZO != null);
  }
  
  private void ZP(List<Zs9e> paramList, Zs9e[] paramArrayOfZs9e) {
    int i = 0;
    int j = paramList.size();
    byte b = 0;
    int[] arrayOfInt = Zmua.ZG();
    while (b < j) {
      int k = Arrays.binarySearch((Object[])paramArrayOfZs9e, paramList.get(b));
      if (k < 0)
        k = -1 - k; 
      System.arraycopy(paramArrayOfZs9e, i, this.ZO, i + b, k - i);
      this.ZO[k + b] = paramList.get(b);
      i = k;
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    System.arraycopy(paramArrayOfZs9e, i, this.ZO, i + j, paramArrayOfZs9e.length - i);
  }
  
  private boolean ZV(int paramInt1, int paramInt2) {
    try {
      if (!ZF())
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.ZK)
        try {
          if (this.ZO.length != 0)
            try {
              if (paramInt2 - paramInt1 <= this.ZO.length / 10)
                return true; 
              ZB();
              return false;
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    ZB();
    return false;
  }
  
  void ZM(int paramInt1, int paramInt2) {
    int[] arrayOfInt2 = ZP(this.ZO);
    int j = paramInt2 - paramInt1 + 1;
    ArrayList<Zs9e> arrayList = new ArrayList(j);
    int i = paramInt1;
    int[] arrayOfInt1 = Zmua.ZG();
    while (i <= paramInt2) {
      try {
        if (ZH(i))
          arrayList.add(new Zs9e(this, i)); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      i++;
      if (arrayOfInt1 != null)
        break; 
    } 
    i = this.ZW.length - 1;
    while (i >= paramInt1) {
      int k = this.ZW[i];
      try {
        if (k != -1)
          (this.ZO[k]).Zl += j; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      i--;
      if (arrayOfInt1 != null)
        break; 
    } 
    if (arrayList.size() > 0) {
      Collections.sort(arrayList);
      Zs9e[] arrayOfZs9e = this.ZO;
      this.ZO = new Zs9e[this.ZO.length + arrayList.size()];
      ZP(arrayList, arrayOfZs9e);
    } 
    ZW(Zc().ZW());
    ZM(true);
    fireRowSorterChanged(arrayOfInt2);
  }
  
  void ZR(int paramInt1, int paramInt2) {
    int[] arrayOfInt2 = ZP(this.ZO);
    int[] arrayOfInt1 = Zmua.ZG();
    byte b = 0;
    int i = paramInt1;
    while (i <= paramInt2) {
      int k = this.ZW[i];
      try {
        if (k != -1) {
          b++;
          this.ZO[k] = null;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      i++;
      if (arrayOfInt1 != null)
        break; 
    } 
    int j = paramInt2 - paramInt1 + 1;
    i = this.ZW.length - 1;
    while (i > paramInt2) {
      int k = this.ZW[i];
      try {
        if (k != -1)
          (this.ZO[k]).Zl -= j; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      i--;
      if (arrayOfInt1 != null)
        break; 
    } 
    if (b > 0) {
      Zs9e[] arrayOfZs9e = new Zs9e[this.ZO.length - b];
      int k = 0;
      int m = 0;
      i = 0;
      while (i < this.ZO.length) {
        if (this.ZO[i] == null) {
          System.arraycopy(this.ZO, m, arrayOfZs9e, k, i - m);
          k += i - m;
          m = i + 1;
        } 
        i++;
        if (arrayOfInt1 != null)
          break; 
      } 
      System.arraycopy(this.ZO, m, arrayOfZs9e, k, this.ZO.length - m);
      this.ZO = arrayOfZs9e;
    } 
    ZW(Zc().ZW());
    ZM(true);
    fireRowSorterChanged(arrayOfInt2);
  }
  
  private void ZX(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZG : ()[I
    //   3: aload_0
    //   4: aload_0
    //   5: getfield ZO : [Lburp/Zs9e;
    //   8: invokevirtual ZP : ([Lburp/Zs9e;)[I
    //   11: astore #4
    //   13: iload_2
    //   14: iload_1
    //   15: isub
    //   16: iconst_1
    //   17: iadd
    //   18: istore #7
    //   20: astore_3
    //   21: aload_0
    //   22: invokevirtual Zq : ()Ljavax/swing/RowFilter;
    //   25: ifnonnull -> 188
    //   28: iload #7
    //   30: anewarray burp/Zs9e
    //   33: astore #11
    //   35: iconst_0
    //   36: istore #6
    //   38: iload_1
    //   39: istore #5
    //   41: iload #5
    //   43: iload_2
    //   44: if_icmpgt -> 74
    //   47: aload #11
    //   49: iload #6
    //   51: aload_0
    //   52: getfield ZO : [Lburp/Zs9e;
    //   55: aload_0
    //   56: getfield ZW : [I
    //   59: iload #5
    //   61: iaload
    //   62: aaload
    //   63: aastore
    //   64: iinc #5, 1
    //   67: iinc #6, 1
    //   70: aload_3
    //   71: ifnull -> 41
    //   74: aload #11
    //   76: invokestatic sort : ([Ljava/lang/Object;)V
    //   79: aload_0
    //   80: getfield ZO : [Lburp/Zs9e;
    //   83: arraylength
    //   84: iload #7
    //   86: isub
    //   87: anewarray burp/Zs9e
    //   90: astore #12
    //   92: iconst_0
    //   93: istore #5
    //   95: iconst_0
    //   96: istore #6
    //   98: iload #5
    //   100: aload_0
    //   101: getfield ZO : [Lburp/Zs9e;
    //   104: arraylength
    //   105: if_icmpge -> 168
    //   108: aload_0
    //   109: getfield ZO : [Lburp/Zs9e;
    //   112: iload #5
    //   114: aaload
    //   115: getfield Zl : I
    //   118: istore #8
    //   120: iload #8
    //   122: iload_1
    //   123: if_icmplt -> 139
    //   126: iload #8
    //   128: iload_2
    //   129: if_icmple -> 161
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   138: athrow
    //   139: aload #12
    //   141: iload #6
    //   143: iinc #6, 1
    //   146: aload_0
    //   147: getfield ZO : [Lburp/Zs9e;
    //   150: iload #5
    //   152: aaload
    //   153: aastore
    //   154: goto -> 161
    //   157: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   160: athrow
    //   161: iinc #5, 1
    //   164: aload_3
    //   165: ifnull -> 98
    //   168: aload_0
    //   169: aload #11
    //   171: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   174: aload #12
    //   176: invokevirtual ZP : (Ljava/util/List;[Lburp/Zs9e;)V
    //   179: aload_0
    //   180: iconst_0
    //   181: invokevirtual ZM : (Z)V
    //   184: aload_3
    //   185: ifnull -> 484
    //   188: new java/util/ArrayList
    //   191: dup
    //   192: iload #7
    //   194: invokespecial <init> : (I)V
    //   197: astore #11
    //   199: iconst_0
    //   200: istore #12
    //   202: iconst_0
    //   203: istore #13
    //   205: iconst_0
    //   206: istore #14
    //   208: iload_1
    //   209: istore #5
    //   211: iload #5
    //   213: iload_2
    //   214: if_icmpgt -> 352
    //   217: aload_0
    //   218: getfield ZW : [I
    //   221: iload #5
    //   223: iaload
    //   224: iconst_m1
    //   225: if_icmpne -> 276
    //   228: aload_0
    //   229: iload #5
    //   231: invokevirtual ZH : (I)Z
    //   234: ifeq -> 345
    //   237: goto -> 244
    //   240: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   243: athrow
    //   244: aload #11
    //   246: new burp/Zs9e
    //   249: dup
    //   250: aload_0
    //   251: iload #5
    //   253: invokespecial <init> : (Lburp/Zm0y;I)V
    //   256: invokeinterface add : (Ljava/lang/Object;)Z
    //   261: pop
    //   262: iinc #12, 1
    //   265: aload_3
    //   266: ifnull -> 345
    //   269: goto -> 276
    //   272: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   275: athrow
    //   276: aload_0
    //   277: iload #5
    //   279: invokevirtual ZH : (I)Z
    //   282: ifne -> 306
    //   285: goto -> 292
    //   288: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   291: athrow
    //   292: iinc #13, 1
    //   295: aload_3
    //   296: ifnull -> 333
    //   299: goto -> 306
    //   302: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   305: athrow
    //   306: aload #11
    //   308: aload_0
    //   309: getfield ZO : [Lburp/Zs9e;
    //   312: aload_0
    //   313: getfield ZW : [I
    //   316: iload #5
    //   318: iaload
    //   319: aaload
    //   320: invokeinterface add : (Ljava/lang/Object;)Z
    //   325: pop
    //   326: goto -> 333
    //   329: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   332: athrow
    //   333: aload_0
    //   334: getfield ZW : [I
    //   337: iload #5
    //   339: bipush #-2
    //   341: iastore
    //   342: iinc #14, 1
    //   345: iinc #5, 1
    //   348: aload_3
    //   349: ifnull -> 211
    //   352: aload #11
    //   354: invokestatic sort : (Ljava/util/List;)V
    //   357: aload_0
    //   358: getfield ZO : [Lburp/Zs9e;
    //   361: arraylength
    //   362: iload #14
    //   364: isub
    //   365: anewarray burp/Zs9e
    //   368: astore #15
    //   370: iconst_0
    //   371: istore #5
    //   373: iconst_0
    //   374: istore #6
    //   376: iload #5
    //   378: aload_0
    //   379: getfield ZO : [Lburp/Zs9e;
    //   382: arraylength
    //   383: if_icmpge -> 439
    //   386: aload_0
    //   387: getfield ZO : [Lburp/Zs9e;
    //   390: iload #5
    //   392: aaload
    //   393: getfield Zl : I
    //   396: istore #8
    //   398: aload_0
    //   399: getfield ZW : [I
    //   402: iload #8
    //   404: iaload
    //   405: bipush #-2
    //   407: if_icmpeq -> 432
    //   410: aload #15
    //   412: iload #6
    //   414: iinc #6, 1
    //   417: aload_0
    //   418: getfield ZO : [Lburp/Zs9e;
    //   421: iload #5
    //   423: aaload
    //   424: aastore
    //   425: goto -> 432
    //   428: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   431: athrow
    //   432: iinc #5, 1
    //   435: aload_3
    //   436: ifnull -> 376
    //   439: iload #12
    //   441: iload #13
    //   443: if_icmpeq -> 471
    //   446: aload_0
    //   447: aload_0
    //   448: getfield ZO : [Lburp/Zs9e;
    //   451: arraylength
    //   452: iload #12
    //   454: iadd
    //   455: iload #13
    //   457: isub
    //   458: anewarray burp/Zs9e
    //   461: putfield ZO : [Lburp/Zs9e;
    //   464: goto -> 471
    //   467: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   470: athrow
    //   471: aload_0
    //   472: aload #11
    //   474: aload #15
    //   476: invokevirtual ZP : (Ljava/util/List;[Lburp/Zs9e;)V
    //   479: aload_0
    //   480: iconst_1
    //   481: invokevirtual ZM : (Z)V
    //   484: aload_0
    //   485: aload #4
    //   487: invokevirtual fireRowSorterChanged : ([I)V
    //   490: return
    // Exception table:
    //   from	to	target	type
    //   120	132	135	java/lang/IllegalArgumentException
    //   126	154	157	java/lang/IllegalArgumentException
    //   217	237	240	java/lang/IllegalArgumentException
    //   228	269	272	java/lang/IllegalArgumentException
    //   244	285	288	java/lang/IllegalArgumentException
    //   276	299	302	java/lang/IllegalArgumentException
    //   292	326	329	java/lang/IllegalArgumentException
    //   398	425	428	java/lang/IllegalArgumentException
    //   439	464	467	java/lang/IllegalArgumentException
  }
  
  private void ZV(int paramInt) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < Zc().Zm())
            return; 
          throw new IndexOutOfBoundsException(a(-3854, -20610));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new IndexOutOfBoundsException(a(-3854, -20610));
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¤  °çÜ­³ñ3î3!áWü%Sqrä\\bÑtú®p©íÓ¹Ø)Ã\\r9 ³ÆçUµìB\\rN,]\\nW©9ØJ¹ë§üÒ5º\\n°Í@ÑÓ$?º'[Ô$x-À%¡'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #15
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #76
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc '9Önyèpï]%Zê*Ç6bÅJ%ý®ËL{áV'Úìê¿©=¥>ûç§äâFöw-ðÅTbÍéØ8ìa-FOyPd¾«Ü]¸ ¥<Â¾L\\r6Ã+Ö£°]b\\rÒ¬ÄlP¾úÎIù'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #95
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #24
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zm0y.a : [Ljava/lang/String;
    //   132: bipush #7
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zm0y.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 216, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: iconst_1
    //   213: goto -> 243
    //   216: bipush #44
    //   218: goto -> 243
    //   221: bipush #103
    //   223: goto -> 243
    //   226: bipush #13
    //   228: goto -> 243
    //   231: bipush #77
    //   233: goto -> 243
    //   236: bipush #86
    //   238: goto -> 243
    //   241: bipush #35
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: iconst_1
    //   301: putstatic burp/Zm0y.Zc : Z
    //   304: return
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF0F3) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = '¢';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm0y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */