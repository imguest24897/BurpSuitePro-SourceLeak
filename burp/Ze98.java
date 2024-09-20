package burp;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Ze98 extends PlainDocument {
  public Ze98() {
    super(new Zl82());
  }
  
  public char Zc(int paramInt) throws BadLocationException {
    return ((Zl82)getContent()).Zi(paramInt);
  }
  
  public int Za(int paramInt) {
    try {
      int i = getLength();
      try {
        if (paramInt < i - 1)
          try {
            if (Zc(paramInt) == '\r' && Zc(paramInt + 1) == '\n')
              return paramInt + 2; 
          } catch (BadLocationException badLocationException) {
            throw a(null);
          }  
      } catch (BadLocationException badLocationException) {
        throw a(null);
      } 
      try {
        if (paramInt < i && Zc(paramInt) == '\n')
          return paramInt + 1; 
      } catch (BadLocationException badLocationException) {
        throw a(null);
      } 
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
    } 
    return paramInt;
  }
  
  public boolean Zs(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getLength : ()I
    //   4: istore_2
    //   5: iload_1
    //   6: iload_2
    //   7: iconst_1
    //   8: isub
    //   9: if_icmpgt -> 56
    //   12: aload_0
    //   13: iload_1
    //   14: invokevirtual Zc : (I)C
    //   17: bipush #13
    //   19: if_icmpne -> 56
    //   22: goto -> 29
    //   25: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   28: athrow
    //   29: aload_0
    //   30: iload_1
    //   31: iconst_1
    //   32: iadd
    //   33: invokevirtual Zc : (I)C
    //   36: bipush #10
    //   38: if_icmpne -> 56
    //   41: goto -> 48
    //   44: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   47: athrow
    //   48: iconst_1
    //   49: goto -> 57
    //   52: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   55: athrow
    //   56: iconst_0
    //   57: istore_3
    //   58: iload_1
    //   59: iload_2
    //   60: if_icmpgt -> 88
    //   63: aload_0
    //   64: iload_1
    //   65: invokevirtual Zc : (I)C
    //   68: bipush #10
    //   70: if_icmpne -> 88
    //   73: goto -> 80
    //   76: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   79: athrow
    //   80: iconst_1
    //   81: goto -> 89
    //   84: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   87: athrow
    //   88: iconst_0
    //   89: istore #4
    //   91: iload_3
    //   92: ifne -> 107
    //   95: iload #4
    //   97: ifeq -> 115
    //   100: goto -> 107
    //   103: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   106: athrow
    //   107: iconst_1
    //   108: goto -> 116
    //   111: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   114: athrow
    //   115: iconst_0
    //   116: ireturn
    //   117: astore_2
    //   118: aload_2
    //   119: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   122: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   125: iconst_0
    //   126: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	116	117	javax/swing/text/BadLocationException
    //   5	22	25	javax/swing/text/BadLocationException
    //   12	41	44	javax/swing/text/BadLocationException
    //   29	52	52	javax/swing/text/BadLocationException
    //   58	73	76	javax/swing/text/BadLocationException
    //   63	84	84	javax/swing/text/BadLocationException
    //   91	100	103	javax/swing/text/BadLocationException
    //   95	111	111	javax/swing/text/BadLocationException
  }
  
  public int Zz(int paramInt) {
    try {
      try {
        if (paramInt > 0)
          try {
            if (Zc(paramInt - 1) == '\n')
              try {
                if (--paramInt > 0)
                  try {
                    if (paramInt < getLength())
                      try {
                        if (Zc(paramInt - 1) == '\r')
                          paramInt--; 
                      } catch (BadLocationException badLocationException) {
                        throw a(null);
                      }  
                  } catch (BadLocationException badLocationException) {
                    throw a(null);
                  }  
              } catch (BadLocationException badLocationException) {
                throw a(null);
              }  
          } catch (BadLocationException badLocationException) {
            throw a(null);
          }  
      } catch (BadLocationException badLocationException) {
        throw a(null);
      } 
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
    } 
    return paramInt;
  }
  
  public boolean Zr(int paramInt) {
    try {
      try {
        if (paramInt > 0)
          try {
            if (Zc(paramInt - 1) == '\n');
          } catch (BadLocationException badLocationException) {
            throw a(null);
          }  
      } catch (BadLocationException badLocationException) {
        throw a(null);
      } 
      return false;
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
      return false;
    } 
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze98.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */