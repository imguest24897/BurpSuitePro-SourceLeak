package burp;

import javax.swing.event.DocumentEvent;

class Zz_f extends Zzn5 {
  final Zloo Zu;
  
  private Zz_f(Zloo paramZloo, Zgb6 paramZgb6) {
    super(paramZgb6);
  }
  
  public void ZI(DocumentEvent paramDocumentEvent) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: aload_0
    //   5: getfield Zu : Lburp/Zloo;
    //   8: getfield Zr : Lburp/Zvov;
    //   11: invokeinterface Zi : ()Ljava/util/List;
    //   16: invokespecial <init> : (Ljava/util/Collection;)V
    //   19: astore_3
    //   20: invokestatic Zn : ()[I
    //   23: aload_0
    //   24: getfield Zu : Lburp/Zloo;
    //   27: getfield ZH : Lburp/Zvov;
    //   30: invokeinterface Zi : ()Ljava/util/List;
    //   35: invokeinterface iterator : ()Ljava/util/Iterator;
    //   40: astore #4
    //   42: astore_2
    //   43: aload #4
    //   45: invokeinterface hasNext : ()Z
    //   50: ifeq -> 178
    //   53: aload #4
    //   55: invokeinterface next : ()Ljava/lang/Object;
    //   60: checkcast burp/Zkv5
    //   63: astore #5
    //   65: aload #5
    //   67: invokeinterface endOffset : ()I
    //   72: aload_1
    //   73: invokeinterface getOffset : ()I
    //   78: if_icmpgt -> 94
    //   81: aload_3
    //   82: aload #5
    //   84: invokeinterface add : (Ljava/lang/Object;)Z
    //   89: pop
    //   90: aload_2
    //   91: ifnull -> 174
    //   94: aload #5
    //   96: invokeinterface startOffset : ()I
    //   101: aload_1
    //   102: invokeinterface getOffset : ()I
    //   107: if_icmplt -> 174
    //   110: aload_3
    //   111: aload #5
    //   113: aload #5
    //   115: invokeinterface startOffset : ()I
    //   120: aload_1
    //   121: invokeinterface getLength : ()I
    //   126: iadd
    //   127: aload_0
    //   128: getfield Zu : Lburp/Zloo;
    //   131: getfield ZZ : Lburp/Zl5i;
    //   134: invokevirtual Zi1 : ()I
    //   137: iadd
    //   138: aload #5
    //   140: invokeinterface endOffset : ()I
    //   145: aload_1
    //   146: invokeinterface getLength : ()I
    //   151: iadd
    //   152: aload_0
    //   153: getfield Zu : Lburp/Zloo;
    //   156: getfield ZZ : Lburp/Zl5i;
    //   159: invokevirtual Zi1 : ()I
    //   162: iadd
    //   163: invokeinterface Zg : (II)Lburp/Zkv5;
    //   168: invokeinterface add : (Ljava/lang/Object;)Z
    //   173: pop
    //   174: aload_2
    //   175: ifnull -> 43
    //   178: aload_0
    //   179: getfield Zu : Lburp/Zloo;
    //   182: getfield Za : Lburp/Zvov;
    //   185: aload_3
    //   186: invokeinterface ZW : (Ljava/util/List;)V
    //   191: return
  }
  
  public void ZO(DocumentEvent paramDocumentEvent) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: aload_0
    //   5: getfield Zu : Lburp/Zloo;
    //   8: getfield Zr : Lburp/Zvov;
    //   11: invokeinterface Zi : ()Ljava/util/List;
    //   16: invokespecial <init> : (Ljava/util/Collection;)V
    //   19: astore_3
    //   20: invokestatic Zn : ()[I
    //   23: aload_0
    //   24: getfield Zu : Lburp/Zloo;
    //   27: getfield ZH : Lburp/Zvov;
    //   30: invokeinterface Zi : ()Ljava/util/List;
    //   35: invokeinterface iterator : ()Ljava/util/Iterator;
    //   40: astore #4
    //   42: astore_2
    //   43: aload #4
    //   45: invokeinterface hasNext : ()Z
    //   50: ifeq -> 185
    //   53: aload #4
    //   55: invokeinterface next : ()Ljava/lang/Object;
    //   60: checkcast burp/Zkv5
    //   63: astore #5
    //   65: aload #5
    //   67: invokeinterface endOffset : ()I
    //   72: aload_1
    //   73: invokeinterface getOffset : ()I
    //   78: if_icmpgt -> 94
    //   81: aload_3
    //   82: aload #5
    //   84: invokeinterface add : (Ljava/lang/Object;)Z
    //   89: pop
    //   90: aload_2
    //   91: ifnull -> 181
    //   94: aload #5
    //   96: invokeinterface startOffset : ()I
    //   101: aload_1
    //   102: invokeinterface getOffset : ()I
    //   107: aload_1
    //   108: invokeinterface getLength : ()I
    //   113: iadd
    //   114: if_icmplt -> 181
    //   117: aload_3
    //   118: aload #5
    //   120: aload #5
    //   122: invokeinterface startOffset : ()I
    //   127: aload_1
    //   128: invokeinterface getLength : ()I
    //   133: isub
    //   134: aload_0
    //   135: getfield Zu : Lburp/Zloo;
    //   138: getfield ZZ : Lburp/Zl5i;
    //   141: invokevirtual Zi1 : ()I
    //   144: iadd
    //   145: aload #5
    //   147: invokeinterface endOffset : ()I
    //   152: aload_1
    //   153: invokeinterface getLength : ()I
    //   158: isub
    //   159: aload_0
    //   160: getfield Zu : Lburp/Zloo;
    //   163: getfield ZZ : Lburp/Zl5i;
    //   166: invokevirtual Zi1 : ()I
    //   169: iadd
    //   170: invokeinterface Zg : (II)Lburp/Zkv5;
    //   175: invokeinterface add : (Ljava/lang/Object;)Z
    //   180: pop
    //   181: aload_2
    //   182: ifnull -> 43
    //   185: aload_0
    //   186: getfield Zu : Lburp/Zloo;
    //   189: getfield Za : Lburp/Zvov;
    //   192: aload_3
    //   193: invokeinterface ZW : (Ljava/util/List;)V
    //   198: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz_f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */