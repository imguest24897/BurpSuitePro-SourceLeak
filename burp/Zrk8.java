package burp;

public class Zrk8 extends Zrko {
  private final Znl Zy;
  
  public Zrk8(Znl paramZnl, String paramString1, String paramString2) {
    super(paramString1, paramString2);
    this.Zy = paramZnl;
  }
  
  public void Zi(Zb3t paramZb3t) {
    // Byte code:
    //   0: invokestatic ZO : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokestatic ZD : (Lburp/Zb3t;)Z
    //   8: ifne -> 12
    //   11: return
    //   12: aload_1
    //   13: invokeinterface ZC : ()Ljava/util/List;
    //   18: iconst_0
    //   19: invokeinterface get : (I)Ljava/lang/Object;
    //   24: checkcast burp/Zgc0
    //   27: astore_3
    //   28: aload_0
    //   29: aload_3
    //   30: invokevirtual ZN : (Lburp/Zgc0;)Z
    //   33: ifeq -> 172
    //   36: aload_0
    //   37: getfield Zy : Lburp/Znl;
    //   40: invokevirtual ZO : ()I
    //   43: iconst_m1
    //   44: if_icmpne -> 120
    //   47: aload_3
    //   48: invokevirtual ZC : ()Ljava/util/List;
    //   51: iconst_0
    //   52: invokeinterface get : (I)Ljava/lang/Object;
    //   57: checkcast burp/Zb3t
    //   60: astore #4
    //   62: aload #4
    //   64: invokestatic ZZ : (Lburp/Zb3t;)Z
    //   67: ifeq -> 116
    //   70: aload #4
    //   72: checkcast burp/Zgc9
    //   75: astore #5
    //   77: aload #5
    //   79: invokevirtual ZC : ()Ljava/util/List;
    //   82: aload #5
    //   84: invokevirtual ZC : ()Ljava/util/List;
    //   87: invokeinterface size : ()I
    //   92: iconst_1
    //   93: isub
    //   94: invokeinterface get : (I)Ljava/lang/Object;
    //   99: checkcast burp/Zgc0
    //   102: astore #6
    //   104: aload #6
    //   106: getstatic burp/Zxc6.TaintPreserver : Lburp/Zxc6;
    //   109: aload_0
    //   110: getfield Zy : Lburp/Znl;
    //   113: invokevirtual Zm : (Lburp/Zxc6;Ljava/lang/Object;)V
    //   116: aload_2
    //   117: ifnonnull -> 172
    //   120: aload_1
    //   121: getstatic burp/Zxc6.TaintPreserver : Lburp/Zxc6;
    //   124: invokeinterface ZO : (Lburp/Zxc6;)Ljava/lang/Object;
    //   129: checkcast java/util/Set
    //   132: astore #4
    //   134: aload #4
    //   136: ifnonnull -> 160
    //   139: new java/util/HashSet
    //   142: dup
    //   143: iconst_1
    //   144: invokespecial <init> : (I)V
    //   147: astore #4
    //   149: aload_1
    //   150: getstatic burp/Zxc6.TaintPreserver : Lburp/Zxc6;
    //   153: aload #4
    //   155: invokeinterface Zm : (Lburp/Zxc6;Ljava/lang/Object;)V
    //   160: aload #4
    //   162: aload_0
    //   163: getfield Zy : Lburp/Znl;
    //   166: invokeinterface add : (Ljava/lang/Object;)Z
    //   171: pop
    //   172: return
  }
  
  public boolean Zg() {
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrk8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */