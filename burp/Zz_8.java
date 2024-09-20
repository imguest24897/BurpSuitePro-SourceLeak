package burp;

import javax.swing.event.DocumentEvent;

class Zz_8 extends Zzn5 {
  final Zloo Zv;
  
  private Zz_8(Zloo paramZloo, Zgb6 paramZgb6) {
    super(paramZgb6);
  }
  
  public void ZI(DocumentEvent paramDocumentEvent) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic Zn : ()[I
    //   11: aload_0
    //   12: getfield Zv : Lburp/Zloo;
    //   15: getfield Zr : Lburp/Zvov;
    //   18: invokeinterface Zi : ()Ljava/util/List;
    //   23: invokeinterface iterator : ()Ljava/util/Iterator;
    //   28: astore #4
    //   30: astore_2
    //   31: aload #4
    //   33: invokeinterface hasNext : ()Z
    //   38: ifeq -> 144
    //   41: aload #4
    //   43: invokeinterface next : ()Ljava/lang/Object;
    //   48: checkcast burp/Zkv5
    //   51: astore #5
    //   53: aload #5
    //   55: invokeinterface endOffset : ()I
    //   60: aload_1
    //   61: invokeinterface getOffset : ()I
    //   66: if_icmpgt -> 82
    //   69: aload_3
    //   70: aload #5
    //   72: invokeinterface add : (Ljava/lang/Object;)Z
    //   77: pop
    //   78: aload_2
    //   79: ifnull -> 140
    //   82: aload #5
    //   84: invokeinterface startOffset : ()I
    //   89: aload_1
    //   90: invokeinterface getOffset : ()I
    //   95: if_icmplt -> 140
    //   98: aload_3
    //   99: aload #5
    //   101: aload #5
    //   103: invokeinterface startOffset : ()I
    //   108: aload_1
    //   109: invokeinterface getLength : ()I
    //   114: iadd
    //   115: aload #5
    //   117: invokeinterface endOffset : ()I
    //   122: aload_1
    //   123: invokeinterface getLength : ()I
    //   128: iadd
    //   129: invokeinterface Zg : (II)Lburp/Zkv5;
    //   134: invokeinterface add : (Ljava/lang/Object;)Z
    //   139: pop
    //   140: aload_2
    //   141: ifnull -> 31
    //   144: aload_3
    //   145: aload_0
    //   146: getfield Zv : Lburp/Zloo;
    //   149: getfield ZH : Lburp/Zvov;
    //   152: invokeinterface Zi : ()Ljava/util/List;
    //   157: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   162: aload_0
    //   163: <illegal opcode> apply : (Lburp/Zz_8;)Ljava/util/function/Function;
    //   168: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   173: invokeinterface toList : ()Ljava/util/List;
    //   178: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   183: pop
    //   184: aload_0
    //   185: getfield Zv : Lburp/Zloo;
    //   188: getfield Za : Lburp/Zvov;
    //   191: aload_3
    //   192: invokeinterface ZW : (Ljava/util/List;)V
    //   197: aload_0
    //   198: getfield Zv : Lburp/Zloo;
    //   201: invokevirtual ZX : ()V
    //   204: return
  }
  
  public void ZO(DocumentEvent paramDocumentEvent) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic Zn : ()[I
    //   11: aload_0
    //   12: getfield Zv : Lburp/Zloo;
    //   15: getfield Zr : Lburp/Zvov;
    //   18: invokeinterface Zi : ()Ljava/util/List;
    //   23: invokeinterface iterator : ()Ljava/util/Iterator;
    //   28: astore #4
    //   30: astore_2
    //   31: aload #4
    //   33: invokeinterface hasNext : ()Z
    //   38: ifeq -> 151
    //   41: aload #4
    //   43: invokeinterface next : ()Ljava/lang/Object;
    //   48: checkcast burp/Zkv5
    //   51: astore #5
    //   53: aload #5
    //   55: invokeinterface endOffset : ()I
    //   60: aload_1
    //   61: invokeinterface getOffset : ()I
    //   66: if_icmpgt -> 82
    //   69: aload_3
    //   70: aload #5
    //   72: invokeinterface add : (Ljava/lang/Object;)Z
    //   77: pop
    //   78: aload_2
    //   79: ifnull -> 147
    //   82: aload #5
    //   84: invokeinterface startOffset : ()I
    //   89: aload_1
    //   90: invokeinterface getOffset : ()I
    //   95: aload_1
    //   96: invokeinterface getLength : ()I
    //   101: iadd
    //   102: if_icmplt -> 147
    //   105: aload_3
    //   106: aload #5
    //   108: aload #5
    //   110: invokeinterface startOffset : ()I
    //   115: aload_1
    //   116: invokeinterface getLength : ()I
    //   121: isub
    //   122: aload #5
    //   124: invokeinterface endOffset : ()I
    //   129: aload_1
    //   130: invokeinterface getLength : ()I
    //   135: isub
    //   136: invokeinterface Zg : (II)Lburp/Zkv5;
    //   141: invokeinterface add : (Ljava/lang/Object;)Z
    //   146: pop
    //   147: aload_2
    //   148: ifnull -> 31
    //   151: aload_3
    //   152: aload_0
    //   153: getfield Zv : Lburp/Zloo;
    //   156: getfield ZH : Lburp/Zvov;
    //   159: invokeinterface Zi : ()Ljava/util/List;
    //   164: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   169: aload_0
    //   170: <illegal opcode> apply : (Lburp/Zz_8;)Ljava/util/function/Function;
    //   175: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   180: invokeinterface toList : ()Ljava/util/List;
    //   185: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   190: pop
    //   191: aload_0
    //   192: getfield Zv : Lburp/Zloo;
    //   195: getfield Za : Lburp/Zvov;
    //   198: aload_3
    //   199: invokeinterface ZW : (Ljava/util/List;)V
    //   204: aload_0
    //   205: getfield Zv : Lburp/Zloo;
    //   208: invokevirtual ZX : ()V
    //   211: return
  }
  
  private Zkv5 lambda$contentInserted$0(Zkv5 paramZkv5) {
    return paramZkv5.Zg(paramZkv5.startOffset() + this.Zv.ZZ.Zi1(), paramZkv5.endOffset() + this.Zv.ZZ.Zi1());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz_8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */