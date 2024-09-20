package burp;

public class Zr6o implements Zmpr {
  private final Zr9e ZN;
  
  private int Zz;
  
  public Zr6o(Zr9e paramZr9e) {
    this.ZN = paramZr9e;
  }
  
  public void ZT(Zska paramZska) {
    this.Zz = paramZska.ZV();
  }
  
  public void ZY(Ze7g paramZe7g) {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: invokestatic Zj : ()Ljava/lang/String;
    //   5: aconst_null
    //   6: astore #4
    //   8: astore_2
    //   9: aload_1
    //   10: invokevirtual iterator : ()Ljava/util/Iterator;
    //   13: astore #5
    //   15: aload #5
    //   17: invokeinterface hasNext : ()Z
    //   22: ifeq -> 238
    //   25: aload #5
    //   27: invokeinterface next : ()Ljava/lang/Object;
    //   32: checkcast burp/Zska
    //   35: astore #6
    //   37: aload_0
    //   38: getfield ZN : Lburp/Zr9e;
    //   41: aload #6
    //   43: invokeinterface Zh : (Lburp/Zska;)V
    //   48: aload #6
    //   50: aload_0
    //   51: getfield Zz : I
    //   54: invokevirtual ZQ : (I)V
    //   57: aload #6
    //   59: invokevirtual ZX : ()I
    //   62: ifgt -> 73
    //   65: aload #6
    //   67: astore #4
    //   69: aload_2
    //   70: ifnull -> 15
    //   73: aload_0
    //   74: getfield ZN : Lburp/Zr9e;
    //   77: aload #6
    //   79: aload_1
    //   80: invokeinterface ZO : (Lburp/Zska;Lburp/Ze7g;)Z
    //   85: ifeq -> 102
    //   88: aload #6
    //   90: iconst_1
    //   91: invokevirtual Z_ : (Z)V
    //   94: aload #6
    //   96: astore #4
    //   98: aload_2
    //   99: ifnull -> 15
    //   102: aload_0
    //   103: getfield ZN : Lburp/Zr9e;
    //   106: aload #6
    //   108: aload_1
    //   109: invokeinterface ZQ : (Lburp/Zska;Lburp/Ze7g;)Z
    //   114: ifeq -> 137
    //   117: aload #6
    //   119: iconst_1
    //   120: invokevirtual Zx : (Z)V
    //   123: aload_0
    //   124: dup
    //   125: getfield Zz : I
    //   128: iconst_1
    //   129: iadd
    //   130: putfield Zz : I
    //   133: aload_2
    //   134: ifnull -> 206
    //   137: aload_0
    //   138: getfield ZN : Lburp/Zr9e;
    //   141: aload #6
    //   143: aload_1
    //   144: invokeinterface Za : (Lburp/Zska;Lburp/Ze7g;)Z
    //   149: ifeq -> 206
    //   152: aload_3
    //   153: ifnull -> 161
    //   156: aload_3
    //   157: iconst_1
    //   158: invokevirtual Zx : (Z)V
    //   161: aload_0
    //   162: iconst_0
    //   163: aload_0
    //   164: getfield Zz : I
    //   167: iconst_1
    //   168: isub
    //   169: invokestatic max : (II)I
    //   172: putfield Zz : I
    //   175: aload #6
    //   177: aload_0
    //   178: getfield Zz : I
    //   181: invokevirtual ZQ : (I)V
    //   184: aload #4
    //   186: ifnull -> 206
    //   189: aload #4
    //   191: invokevirtual Zj : ()Z
    //   194: ifeq -> 206
    //   197: aload #4
    //   199: aload_0
    //   200: getfield Zz : I
    //   203: invokevirtual ZQ : (I)V
    //   206: aload_0
    //   207: getfield ZN : Lburp/Zr9e;
    //   210: aload #6
    //   212: aload_1
    //   213: invokeinterface Zu : (Lburp/Zska;Lburp/Ze7g;)Z
    //   218: ifeq -> 227
    //   221: aload #6
    //   223: iconst_1
    //   224: invokevirtual Zx : (Z)V
    //   227: aload #6
    //   229: astore_3
    //   230: aload #6
    //   232: astore #4
    //   234: aload_2
    //   235: ifnull -> 15
    //   238: aload_3
    //   239: ifnull -> 247
    //   242: aload_3
    //   243: iconst_0
    //   244: invokevirtual Zx : (Z)V
    //   247: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr6o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */