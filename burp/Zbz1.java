package burp;

import java.util.List;

public interface Zbz1 extends Zg35<Zbz1> {
  public static final Zeu4<Zbz1> ZF = new Zkz3();
  
  static Zbz1 ZP(String paramString) {
    return new Zhc(paramString);
  }
  
  static List<Zbz1> Zv(Zlit paramZlit) {
    // Byte code:
    //   0: new java/util/LinkedList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic Zpw : ()[Ljava/lang/String;
    //   11: aload_0
    //   12: invokeinterface Zd4 : ()[B
    //   17: invokestatic ZG : ([B)Ljava/lang/String;
    //   20: astore_3
    //   21: astore_1
    //   22: aload_3
    //   23: ldc '/'
    //   25: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   28: ifeq -> 37
    //   31: aload_3
    //   32: iconst_1
    //   33: invokevirtual substring : (I)Ljava/lang/String;
    //   36: astore_3
    //   37: aload_3
    //   38: invokevirtual isEmpty : ()Z
    //   41: ifeq -> 60
    //   44: aload_2
    //   45: ldc ''
    //   47: invokestatic ZP : (Ljava/lang/String;)Lburp/Zbz1;
    //   50: invokeinterface add : (Ljava/lang/Object;)Z
    //   55: pop
    //   56: aload_1
    //   57: ifnonnull -> 120
    //   60: aload_3
    //   61: ldc '/'
    //   63: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   66: astore #4
    //   68: aload #4
    //   70: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   73: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   78: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   83: aload_2
    //   84: dup
    //   85: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   88: pop
    //   89: <illegal opcode> accept : (Ljava/util/List;)Ljava/util/function/Consumer;
    //   94: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   99: aload_3
    //   100: ldc '/'
    //   102: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   105: ifeq -> 120
    //   108: aload_2
    //   109: ldc ''
    //   111: invokestatic ZP : (Ljava/lang/String;)Lburp/Zbz1;
    //   114: invokeinterface add : (Ljava/lang/Object;)Z
    //   119: pop
    //   120: aload_2
    //   121: areturn
  }
  
  String ZNM();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbz1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */