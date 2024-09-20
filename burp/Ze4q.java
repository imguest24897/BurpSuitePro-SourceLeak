package burp;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.regex.Pattern;

public class Ze4q {
  private static final Pattern Zn;
  
  private final String Zs;
  
  private final Zlkk Zh;
  
  public Ze4q(String paramString, Zlkk paramZlkk) {
    this.Zs = paramString;
    this.Zh = paramZlkk;
  }
  
  String Za(String paramString) {
    // Byte code:
    //   0: invokestatic ZM : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: ifnull -> 15
    //   8: aload_1
    //   9: invokevirtual isEmpty : ()Z
    //   12: ifeq -> 18
    //   15: ldc ''
    //   17: areturn
    //   18: aload_0
    //   19: getfield Zs : Ljava/lang/String;
    //   22: ifnull -> 35
    //   25: aload_0
    //   26: getfield Zs : Ljava/lang/String;
    //   29: invokevirtual isEmpty : ()Z
    //   32: ifeq -> 37
    //   35: aload_1
    //   36: areturn
    //   37: getstatic burp/Ze4q.Zn : Ljava/util/regex/Pattern;
    //   40: aload_1
    //   41: invokevirtual split : (Ljava/lang/CharSequence;)[Ljava/lang/String;
    //   44: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   47: aload_0
    //   48: <illegal opcode> apply : (Lburp/Ze4q;)Ljava/util/function/Function;
    //   53: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   58: invokeinterface toList : ()Ljava/util/List;
    //   63: astore_3
    //   64: aload_3
    //   65: invokeinterface size : ()I
    //   70: iconst_1
    //   71: if_icmpne -> 101
    //   74: aload_3
    //   75: iconst_0
    //   76: invokeinterface get : (I)Ljava/lang/Object;
    //   81: checkcast burp/Ze8s
    //   84: astore #4
    //   86: aload #4
    //   88: aload_0
    //   89: getfield Zs : Ljava/lang/String;
    //   92: invokevirtual ZQ : (Ljava/lang/String;)V
    //   95: aload #4
    //   97: invokevirtual toString : ()Ljava/lang/String;
    //   100: areturn
    //   101: aload_0
    //   102: getfield Zs : Ljava/lang/String;
    //   105: invokestatic Zd : (Ljava/lang/String;)Ljava/util/Deque;
    //   108: astore #4
    //   110: iconst_0
    //   111: istore #5
    //   113: aload #4
    //   115: invokeinterface isEmpty : ()Z
    //   120: ifne -> 264
    //   123: aload #4
    //   125: invokeinterface pop : ()Ljava/lang/Object;
    //   130: checkcast java/lang/Character
    //   133: invokevirtual charValue : ()C
    //   136: istore #6
    //   138: aload_3
    //   139: iload #5
    //   141: invokeinterface get : (I)Ljava/lang/Object;
    //   146: checkcast burp/Ze8s
    //   149: iload #6
    //   151: invokevirtual Zq : (C)Z
    //   154: ifne -> 260
    //   157: iconst_0
    //   158: istore #7
    //   160: iload #5
    //   162: istore #8
    //   164: iload #8
    //   166: aload_3
    //   167: invokeinterface size : ()I
    //   172: if_icmpge -> 212
    //   175: aload_3
    //   176: iload #8
    //   178: invokeinterface get : (I)Ljava/lang/Object;
    //   183: checkcast burp/Ze8s
    //   186: iload #6
    //   188: invokevirtual ZB : (C)Z
    //   191: ifeq -> 205
    //   194: iconst_1
    //   195: istore #7
    //   197: iload #8
    //   199: istore #5
    //   201: aload_2
    //   202: ifnonnull -> 212
    //   205: iinc #8, 1
    //   208: aload_2
    //   209: ifnonnull -> 164
    //   212: iload #7
    //   214: ifne -> 260
    //   217: iload #5
    //   219: istore #8
    //   221: iload #8
    //   223: iflt -> 260
    //   226: aload_3
    //   227: iload #8
    //   229: invokeinterface get : (I)Ljava/lang/Object;
    //   234: checkcast burp/Ze8s
    //   237: iload #6
    //   239: invokevirtual Zg : (C)Z
    //   242: ifeq -> 253
    //   245: iload #8
    //   247: istore #5
    //   249: aload_2
    //   250: ifnonnull -> 260
    //   253: iinc #8, -1
    //   256: aload_2
    //   257: ifnonnull -> 221
    //   260: aload_2
    //   261: ifnonnull -> 113
    //   264: new java/lang/StringBuilder
    //   267: dup
    //   268: invokespecial <init> : ()V
    //   271: astore #6
    //   273: aload_3
    //   274: aload #6
    //   276: dup
    //   277: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   280: pop
    //   281: <illegal opcode> accept : (Ljava/lang/StringBuilder;)Ljava/util/function/Consumer;
    //   286: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   291: aload #6
    //   293: invokevirtual toString : ()Ljava/lang/String;
    //   296: areturn
  }
  
  private static Deque<Character> Zd(String paramString) {
    int[] arrayOfInt = Zghd.ZM();
    ArrayDeque<Character> arrayDeque = new ArrayDeque();
    if (paramString == null)
      return arrayDeque; 
    char[] arrayOfChar = paramString.toCharArray();
    int i = arrayOfChar.length;
    byte b = 0;
    while (b < i) {
      char c = arrayOfChar[b];
      arrayDeque.add(Character.valueOf(c));
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return arrayDeque;
  }
  
  private Ze8s lambda$getFormattedString$0(String paramString) {
    return new Ze8s(paramString, this.Zh);
  }
  
  static {
    // Byte code:
    //   0: bipush #41
    //   2: ldc ',\\b\\b -oqJ'
    //   4: iconst_m1
    //   5: goto -> 12
    //   8: astore_0
    //   9: goto -> 154
    //   12: dup_x2
    //   13: pop
    //   14: invokevirtual toCharArray : ()[C
    //   17: dup_x1
    //   18: arraylength
    //   19: dup_x2
    //   20: pop
    //   21: iconst_0
    //   22: istore_1
    //   23: dup2_x1
    //   24: pop2
    //   25: dup_x2
    //   26: iconst_1
    //   27: if_icmpgt -> 128
    //   30: dup2
    //   31: swap
    //   32: iload_1
    //   33: dup2_x1
    //   34: caload
    //   35: swap
    //   36: iload_1
    //   37: bipush #7
    //   39: irem
    //   40: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #45
    //   82: goto -> 112
    //   85: bipush #30
    //   87: goto -> 112
    //   90: bipush #7
    //   92: goto -> 112
    //   95: bipush #125
    //   97: goto -> 112
    //   100: bipush #121
    //   102: goto -> 112
    //   105: bipush #127
    //   107: goto -> 112
    //   110: bipush #10
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #1, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 33
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_1
    //   132: if_icmpgt -> 30
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: aload_0
    //   155: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   158: putstatic burp/Ze4q.Zn : Ljava/util/regex/Pattern;
    //   161: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze4q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */