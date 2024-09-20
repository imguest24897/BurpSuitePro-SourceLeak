package burp;

public class Zexc extends Zexe<Zgc0> {
  public void ZV(Zgc0 paramZgc0) {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: invokestatic Zr : (Lburp/Zesp;)Z
    //   8: ifeq -> 35
    //   11: aload_1
    //   12: invokevirtual ZC : ()Ljava/util/List;
    //   15: iconst_0
    //   16: invokeinterface get : (I)Ljava/lang/Object;
    //   21: checkcast burp/Zgcu
    //   24: astore_3
    //   25: aload_0
    //   26: aload_3
    //   27: aload_1
    //   28: invokevirtual ZR : (Lburp/Zgcu;Lburp/Zb3t;)V
    //   31: iload_2
    //   32: ifne -> 238
    //   35: aload_0
    //   36: aload_1
    //   37: invokevirtual ZD : (Lburp/Zgc0;)Z
    //   40: ifeq -> 65
    //   43: aload_0
    //   44: aload_1
    //   45: invokevirtual ZC : ()Ljava/util/List;
    //   48: iconst_2
    //   49: invokeinterface get : (I)Ljava/lang/Object;
    //   54: checkcast burp/Zesp
    //   57: aload_1
    //   58: invokevirtual ZH : (Lburp/Zesp;Lburp/Zesp;)V
    //   61: iload_2
    //   62: ifne -> 238
    //   65: aload_0
    //   66: aload_1
    //   67: invokevirtual ZG : (Lburp/Zgc0;)Z
    //   70: ifeq -> 162
    //   73: aload_1
    //   74: invokevirtual ZC : ()Ljava/util/List;
    //   77: iconst_1
    //   78: invokeinterface get : (I)Ljava/lang/Object;
    //   83: checkcast burp/Zgcc
    //   86: invokevirtual ZK : ()Lburp/Zsvc;
    //   89: getfield ZE : Lburp/Zgho;
    //   92: astore_3
    //   93: aload_3
    //   94: getstatic burp/Zgho.PLUS : Lburp/Zgho;
    //   97: if_acmpeq -> 114
    //   100: aload_3
    //   101: getstatic burp/Zgho.PIPE_PIPE : Lburp/Zgho;
    //   104: if_acmpeq -> 114
    //   107: aload_3
    //   108: getstatic burp/Zgho.AMPERSAND_AMPERSAND : Lburp/Zgho;
    //   111: if_acmpne -> 158
    //   114: aload_1
    //   115: invokevirtual ZC : ()Ljava/util/List;
    //   118: iconst_2
    //   119: invokeinterface get : (I)Ljava/lang/Object;
    //   124: checkcast burp/Zb3t
    //   127: astore #4
    //   129: aload_1
    //   130: invokevirtual ZC : ()Ljava/util/List;
    //   133: iconst_0
    //   134: invokeinterface get : (I)Ljava/lang/Object;
    //   139: checkcast burp/Zb3t
    //   142: astore #5
    //   144: aload_0
    //   145: aload #5
    //   147: aload_1
    //   148: invokevirtual ZH : (Lburp/Zesp;Lburp/Zesp;)V
    //   151: aload_0
    //   152: aload #4
    //   154: aload_1
    //   155: invokevirtual ZH : (Lburp/Zesp;Lburp/Zesp;)V
    //   158: iload_2
    //   159: ifne -> 238
    //   162: aload_0
    //   163: aload_1
    //   164: invokevirtual Zf : (Lburp/Zgc0;)Z
    //   167: ifeq -> 194
    //   170: aload_1
    //   171: invokevirtual ZC : ()Ljava/util/List;
    //   174: iconst_1
    //   175: invokeinterface get : (I)Ljava/lang/Object;
    //   180: checkcast burp/Zb3t
    //   183: astore_3
    //   184: aload_0
    //   185: aload_3
    //   186: aload_1
    //   187: invokevirtual ZH : (Lburp/Zesp;Lburp/Zesp;)V
    //   190: iload_2
    //   191: ifne -> 238
    //   194: aload_0
    //   195: aload_1
    //   196: invokevirtual ZW : (Lburp/Zgc0;)Z
    //   199: ifeq -> 238
    //   202: aload_0
    //   203: aload_1
    //   204: invokevirtual ZC : ()Ljava/util/List;
    //   207: iconst_2
    //   208: invokeinterface get : (I)Ljava/lang/Object;
    //   213: checkcast burp/Zesp
    //   216: aload_1
    //   217: invokevirtual ZH : (Lburp/Zesp;Lburp/Zesp;)V
    //   220: aload_0
    //   221: aload_1
    //   222: invokevirtual ZC : ()Ljava/util/List;
    //   225: iconst_4
    //   226: invokeinterface get : (I)Ljava/lang/Object;
    //   231: checkcast burp/Zesp
    //   234: aload_1
    //   235: invokevirtual ZH : (Lburp/Zesp;Lburp/Zesp;)V
    //   238: return
  }
  
  private boolean ZD(Zgc0 paramZgc0) {
    return (ZG(paramZgc0) && (((Zgcc)paramZgc0.ZC().get(1)).ZK()).ZE == Zgho.COMMA);
  }
  
  private boolean ZG(Zgc0 paramZgc0) {
    return (paramZgc0.ZC().size() == 3 && Zl19.ZR(paramZgc0.ZC().get(0)) && Zl19.ZC(paramZgc0.ZC().get(1)) && Zl19.ZR(paramZgc0.ZC().get(2)));
  }
  
  private boolean Zf(Zgc0 paramZgc0) {
    return (paramZgc0.ZC().size() == 3 && Zl19.ZC(paramZgc0.ZC().get(0)) && (((Zgcc)paramZgc0.ZC().get(0)).ZK()).ZE == Zgho.OPENING_PARENTHESIS && Zl19.ZR(paramZgc0.ZC().get(1)) && Zl19.ZC(paramZgc0.ZC().get(2)) && (((Zgcc)paramZgc0.ZC().get(2)).ZK()).ZE == Zgho.CLOSING_PARENTHESIS);
  }
  
  private boolean ZW(Zgc0 paramZgc0) {
    return (paramZgc0.ZC().size() == 5 && Zl19.ZR(paramZgc0.ZC().get(0)) && Zl19.ZC(paramZgc0.ZC().get(1)) && (((Zgcc)paramZgc0.ZC().get(1)).ZK()).ZE == Zgho.QUERY && Zl19.ZR(paramZgc0.ZC().get(2)) && Zl19.ZC(paramZgc0.ZC().get(3)) && (((Zgcc)paramZgc0.ZC().get(3)).ZK()).ZE == Zgho.COLON && Zl19.ZR(paramZgc0.ZC().get(4)));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zexc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */