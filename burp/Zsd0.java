package burp;

import java.util.Optional;

public interface Zsd0<T extends net.portswigger.browser.Zd_> {
  T ZC();
  
  Optional<String> Zx();
  
  static <T extends net.portswigger.browser.Zd_> Zsd0<?> Zv(T paramT) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5: pop
    //   6: astore_1
    //   7: iconst_0
    //   8: istore_2
    //   9: aload_1
    //   10: iload_2
    //   11: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   16: tableswitch default -> 52, 0 -> 66, 1 -> 82, 2 -> 100, 3 -> 118, 4 -> 136
    //   52: new java/lang/MatchException
    //   55: dup
    //   56: aconst_null
    //   57: aconst_null
    //   58: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   61: athrow
    //   62: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   65: athrow
    //   66: aload_1
    //   67: checkcast net/portswigger/browser/Zj3
    //   70: astore_3
    //   71: new burp/Ztiz
    //   74: dup
    //   75: aload_3
    //   76: invokespecial <init> : (Lnet/portswigger/browser/Zj3;)V
    //   79: goto -> 151
    //   82: aload_1
    //   83: checkcast net/portswigger/browser/Zjr
    //   86: astore #4
    //   88: new burp/Zrgv
    //   91: dup
    //   92: aload #4
    //   94: invokespecial <init> : (Lnet/portswigger/browser/Zjr;)V
    //   97: goto -> 151
    //   100: aload_1
    //   101: checkcast net/portswigger/browser/Zjx
    //   104: astore #5
    //   106: new burp/Zt3s
    //   109: dup
    //   110: aload #5
    //   112: invokespecial <init> : (Lnet/portswigger/browser/Zjx;)V
    //   115: goto -> 151
    //   118: aload_1
    //   119: checkcast net/portswigger/browser/Zjz
    //   122: astore #6
    //   124: new burp/Zt5l
    //   127: dup
    //   128: aload #6
    //   130: invokespecial <init> : (Lnet/portswigger/browser/Zjz;)V
    //   133: goto -> 151
    //   136: aload_1
    //   137: checkcast net/portswigger/browser/Zjf
    //   140: astore #7
    //   142: new burp/Zxfg
    //   145: dup
    //   146: aload #7
    //   148: invokespecial <init> : (Lnet/portswigger/browser/Zjf;)V
    //   151: areturn
    // Exception table:
    //   from	to	target	type
    //   9	62	62	java/lang/MatchException
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsd0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */