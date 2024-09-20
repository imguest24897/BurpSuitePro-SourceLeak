package burp;

import java.util.List;

public class Zkvn extends Zkvw implements IHttpRequestResponseWithMarkers {
  private List<int[]> Zu;
  
  private List<int[]> Zw;
  
  public static IHttpRequestResponseWithMarkers Zp(Zzu7 paramZzu7, Zbnt paramZbnt, Ztx8 paramZtx8) {
    return new Zlvp(new Zkvn(paramZzu7, paramZbnt, paramZtx8));
  }
  
  private Zkvn(Zzu7 paramZzu7, Zbnt paramZbnt, Ztx8 paramZtx8) {
    super(paramZzu7, paramZbnt, paramZtx8);
    ZT(paramZzu7.Zx(), paramZzu7.Zv());
  }
  
  private void ZT(List<int[]> paramList1, List<int[]> paramList2) {
    // Byte code:
    //   0: invokestatic ZB : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: aload_1
    //   5: ifnonnull -> 24
    //   8: aload_0
    //   9: new java/util/ArrayList
    //   12: dup
    //   13: iconst_0
    //   14: invokespecial <init> : (I)V
    //   17: putfield Zu : Ljava/util/List;
    //   20: aload_3
    //   21: ifnull -> 107
    //   24: aload_0
    //   25: new java/util/ArrayList
    //   28: dup
    //   29: aload_1
    //   30: invokeinterface size : ()I
    //   35: invokespecial <init> : (I)V
    //   38: putfield Zu : Ljava/util/List;
    //   41: aload_1
    //   42: invokeinterface iterator : ()Ljava/util/Iterator;
    //   47: astore #4
    //   49: aload #4
    //   51: invokeinterface hasNext : ()Z
    //   56: ifeq -> 107
    //   59: aload #4
    //   61: invokeinterface next : ()Ljava/lang/Object;
    //   66: checkcast [I
    //   69: astore #5
    //   71: aload #5
    //   73: ifnull -> 103
    //   76: aload_0
    //   77: getfield Zu : Ljava/util/List;
    //   80: iconst_2
    //   81: newarray int
    //   83: dup
    //   84: iconst_0
    //   85: aload #5
    //   87: iconst_0
    //   88: iaload
    //   89: iastore
    //   90: dup
    //   91: iconst_1
    //   92: aload #5
    //   94: iconst_1
    //   95: iaload
    //   96: iastore
    //   97: invokeinterface add : (Ljava/lang/Object;)Z
    //   102: pop
    //   103: aload_3
    //   104: ifnull -> 49
    //   107: aload_2
    //   108: ifnonnull -> 127
    //   111: aload_0
    //   112: new java/util/ArrayList
    //   115: dup
    //   116: iconst_0
    //   117: invokespecial <init> : (I)V
    //   120: putfield Zw : Ljava/util/List;
    //   123: aload_3
    //   124: ifnull -> 210
    //   127: aload_0
    //   128: new java/util/ArrayList
    //   131: dup
    //   132: aload_2
    //   133: invokeinterface size : ()I
    //   138: invokespecial <init> : (I)V
    //   141: putfield Zw : Ljava/util/List;
    //   144: aload_2
    //   145: invokeinterface iterator : ()Ljava/util/Iterator;
    //   150: astore #4
    //   152: aload #4
    //   154: invokeinterface hasNext : ()Z
    //   159: ifeq -> 210
    //   162: aload #4
    //   164: invokeinterface next : ()Ljava/lang/Object;
    //   169: checkcast [I
    //   172: astore #5
    //   174: aload #5
    //   176: ifnull -> 206
    //   179: aload_0
    //   180: getfield Zw : Ljava/util/List;
    //   183: iconst_2
    //   184: newarray int
    //   186: dup
    //   187: iconst_0
    //   188: aload #5
    //   190: iconst_0
    //   191: iaload
    //   192: iastore
    //   193: dup
    //   194: iconst_1
    //   195: aload #5
    //   197: iconst_1
    //   198: iaload
    //   199: iastore
    //   200: invokeinterface add : (Ljava/lang/Object;)Z
    //   205: pop
    //   206: aload_3
    //   207: ifnull -> 152
    //   210: return
  }
  
  public List<int[]> getRequestMarkers() {
    return this.Zu;
  }
  
  public List<int[]> getResponseMarkers() {
    return this.Zw;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkvn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */