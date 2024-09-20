package burp;

import java.util.List;

public class Zz0m {
  static Zttl ZT(Zeu9 paramZeu9, List<Zski> paramList, List<Zko4> paramList1, Zr_4 paramZr_4) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   6: aload_3
    //   7: aload_0
    //   8: <illegal opcode> apply : (Lburp/Zr_4;Lburp/Zeu9;)Ljava/util/function/Function;
    //   13: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   18: invokeinterface toList : ()Ljava/util/List;
    //   23: astore #5
    //   25: invokestatic ZM : ()[Ljava/lang/String;
    //   28: aload_2
    //   29: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   34: aload_3
    //   35: aload_0
    //   36: <illegal opcode> apply : (Lburp/Zr_4;Lburp/Zeu9;)Ljava/util/function/Function;
    //   41: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   46: invokeinterface toList : ()Ljava/util/List;
    //   51: astore #6
    //   53: astore #4
    //   55: aload_3
    //   56: new burp/Zev_
    //   59: dup
    //   60: invokestatic emptyList : ()Ljava/util/List;
    //   63: aload #5
    //   65: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   70: aload #6
    //   72: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   77: invokestatic concat : (Ljava/util/stream/Stream;Ljava/util/stream/Stream;)Ljava/util/stream/Stream;
    //   80: invokeinterface toList : ()Ljava/util/List;
    //   85: invokespecial <init> : (Ljava/util/List;Ljava/util/List;)V
    //   88: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   93: checkcast burp/Zttl
    //   96: aload #4
    //   98: ifnull -> 108
    //   101: iconst_1
    //   102: anewarray burp/Zbqc
    //   105: invokestatic Zr : ([Lburp/Zbqc;)V
    //   108: areturn
  }
  
  private static Zm72 lambda$createFoyerExits$1(Zr_4 paramZr_4, Zeu9 paramZeu9, Zko4 paramZko4) {
    return paramZr_4.<Zm72>ZH(new Zl7a(paramZeu9, paramZko4));
  }
  
  private static Zs9a lambda$createFoyerExits$0(Zr_4 paramZr_4, Zeu9 paramZeu9, Zski paramZski) {
    return paramZr_4.<Zs9a>ZH(new Zmsa(paramZeu9, paramZski));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz0m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */