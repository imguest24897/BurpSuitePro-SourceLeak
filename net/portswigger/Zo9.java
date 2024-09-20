package net.portswigger;

import java.util.List;

public class Zo9 {
  private static final String a;
  
  public static String Zb(Ztj paramZtj, Zrx_ paramZrx_, List<Zqi> paramList, int paramInt) {
    String str = Zby.Zf();
    if ((paramList.size() - paramInt) % 2 != 0)
      return null; 
    StringBuilder stringBuilder = new StringBuilder("{");
    while (paramInt < paramList.size()) {
      Zqi zqi1 = paramList.get(paramInt);
      Zqi zqi2 = paramList.get(paramInt + 1);
      if (!Zrz6.QUERY_KEY.equals(zqi1.Zq) || !Zrz6.JSON.equals(zqi2.Zq))
        return null; 
      stringBuilder.append(Zu(paramZtj, paramZrx_, zqi1.ZU, zqi2.ZU));
      paramInt += 2;
      if (str == null)
        break; 
    } 
    if (stringBuilder.length() > 1)
      stringBuilder.setLength(stringBuilder.length() - 1); 
    return stringBuilder.append('}').toString();
  }
  
  private static String Zu(Ztj paramZtj, Zrx_ paramZrx_, String paramString1, String paramString2) {
    // Byte code:
    //   0: invokestatic Zf : ()Ljava/lang/String;
    //   3: aload_1
    //   4: getfield ZY : Ljava/util/Map;
    //   7: aload_2
    //   8: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   13: checkcast net/portswigger/Zm7
    //   16: astore #5
    //   18: astore #4
    //   20: aload #5
    //   22: ifnonnull -> 28
    //   25: ldc ''
    //   27: areturn
    //   28: new java/lang/StringBuilder
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: astore #6
    //   37: aload #6
    //   39: bipush #34
    //   41: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   44: aload_2
    //   45: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: getstatic net/portswigger/Zo9.a : Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: aload_0
    //   56: aload #5
    //   58: getfield Zq : Ljava/lang/reflect/Type;
    //   61: invokevirtual Za : (Ljava/lang/reflect/Type;)Ljava/util/Optional;
    //   64: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   69: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   72: aload #5
    //   74: getfield Zq : Ljava/lang/reflect/Type;
    //   77: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   80: checkcast java/lang/reflect/Type
    //   83: astore #7
    //   85: ldc java/lang/String
    //   87: aload #7
    //   89: invokevirtual equals : (Ljava/lang/Object;)Z
    //   92: ifne -> 168
    //   95: ldc java/lang/Character
    //   97: aload #7
    //   99: invokevirtual equals : (Ljava/lang/Object;)Z
    //   102: ifne -> 168
    //   105: getstatic java/lang/Character.TYPE : Ljava/lang/Class;
    //   108: aload #7
    //   110: invokevirtual equals : (Ljava/lang/Object;)Z
    //   113: ifne -> 168
    //   116: ldc [B
    //   118: aload #7
    //   120: invokevirtual equals : (Ljava/lang/Object;)Z
    //   123: ifne -> 168
    //   126: getstatic java/lang/Long.TYPE : Ljava/lang/Class;
    //   129: aload #7
    //   131: invokevirtual equals : (Ljava/lang/Object;)Z
    //   134: ifne -> 168
    //   137: ldc java/lang/Long
    //   139: aload #7
    //   141: invokevirtual equals : (Ljava/lang/Object;)Z
    //   144: ifne -> 168
    //   147: aload #7
    //   149: instanceof java/lang/Class
    //   152: ifeq -> 243
    //   155: ldc java/lang/Enum
    //   157: aload #7
    //   159: checkcast java/lang/Class
    //   162: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   165: ifeq -> 243
    //   168: ldc java/lang/String
    //   170: aload #7
    //   172: invokevirtual equals : (Ljava/lang/Object;)Z
    //   175: ifeq -> 221
    //   178: aload_3
    //   179: ldc '"'
    //   181: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   184: ifeq -> 199
    //   187: aload #6
    //   189: aload_3
    //   190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: pop
    //   194: aload #4
    //   196: ifnonnull -> 250
    //   199: aload #6
    //   201: bipush #34
    //   203: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   206: aload_3
    //   207: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: bipush #34
    //   212: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   215: pop
    //   216: aload #4
    //   218: ifnonnull -> 250
    //   221: aload #6
    //   223: bipush #34
    //   225: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   228: aload_3
    //   229: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: bipush #34
    //   234: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   237: pop
    //   238: aload #4
    //   240: ifnonnull -> 250
    //   243: aload #6
    //   245: aload_3
    //   246: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   249: pop
    //   250: aload #6
    //   252: bipush #44
    //   254: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   257: invokevirtual toString : ()Ljava/lang/String;
    //   260: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #64
    //   2: ldc '3B'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/Zo9.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #81
    //   82: goto -> 112
    //   85: bipush #56
    //   87: goto -> 112
    //   90: bipush #10
    //   92: goto -> 112
    //   95: bipush #89
    //   97: goto -> 112
    //   100: bipush #101
    //   102: goto -> 112
    //   105: bipush #111
    //   107: goto -> 112
    //   110: bipush #21
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
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
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zo9.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */