package burp;

import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.http.message.responses.analysis.Attribute;
import burp.api.montoya.http.message.responses.analysis.AttributeType;
import burp.api.montoya.http.message.responses.analysis.ResponseVariationsAnalyzer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Zgng implements ResponseVariationsAnalyzer {
  private final Set<AttributeType> Zc = new HashSet<>();
  
  private final Set<AttributeType> ZJ = new HashSet<>();
  
  private final List<Map<AttributeType, Integer>> Zy = new ArrayList<>();
  
  private static final String a;
  
  public Zgng() {
    this.ZJ.addAll(Arrays.asList(AttributeType.values()));
  }
  
  public Set<AttributeType> variantAttributes() {
    return this.Zc;
  }
  
  public Set<AttributeType> invariantAttributes() {
    return this.ZJ;
  }
  
  public void updateWith(HttpResponse paramHttpResponse) {
    String str = Zzls.Zf();
    try {
      if (paramHttpResponse == null)
        throw new IllegalArgumentException(a); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zn(paramHttpResponse);
    this.ZJ.clear();
    AttributeType[] arrayOfAttributeType = AttributeType.values();
    int i = arrayOfAttributeType.length;
    byte b = 0;
    while (b < i) {
      AttributeType attributeType = arrayOfAttributeType[b];
      Zn(attributeType);
      b++;
      if (str == null)
        break; 
    } 
  }
  
  private void Zn(HttpResponse paramHttpResponse) {
    List list = paramHttpResponse.attributes(AttributeType.values());
    HashMap<Object, Object> hashMap = new HashMap<>();
    String str = Zzls.Zf();
    for (Attribute attribute : list) {
      hashMap.put(attribute.type(), Integer.valueOf(attribute.value()));
      if (str == null)
        break; 
    } 
    this.Zy.add(hashMap);
  }
  
  private void Zn(AttributeType paramAttributeType) {
    String str = Zzls.Zf();
    try {
      if (!this.Zc.contains(paramAttributeType)) {
        try {
          if (ZM(paramAttributeType)) {
            try {
              this.Zc.add(paramAttributeType);
              if (str == null) {
                this.ZJ.add(paramAttributeType);
                return;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.ZJ.add(paramAttributeType);
  }
  
  private boolean ZM(AttributeType paramAttributeType) {
    // Byte code:
    //   0: new java/util/HashSet
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic Zf : ()Ljava/lang/String;
    //   11: aload_0
    //   12: getfield Zy : Ljava/util/List;
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore #4
    //   22: astore_2
    //   23: aload #4
    //   25: invokeinterface hasNext : ()Z
    //   30: ifeq -> 120
    //   33: aload #4
    //   35: invokeinterface next : ()Ljava/lang/Object;
    //   40: checkcast java/util/Map
    //   43: astore #5
    //   45: aload_3
    //   46: invokeinterface isEmpty : ()Z
    //   51: ifeq -> 83
    //   54: aload_3
    //   55: aload #5
    //   57: aload_1
    //   58: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   63: checkcast java/lang/Integer
    //   66: invokeinterface add : (Ljava/lang/Object;)Z
    //   71: pop
    //   72: aload_2
    //   73: ifnonnull -> 116
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   82: athrow
    //   83: aload_3
    //   84: aload #5
    //   86: aload_1
    //   87: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   92: checkcast java/lang/Integer
    //   95: invokeinterface add : (Ljava/lang/Object;)Z
    //   100: ifeq -> 116
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   109: athrow
    //   110: iconst_1
    //   111: ireturn
    //   112: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   115: athrow
    //   116: aload_2
    //   117: ifnonnull -> 23
    //   120: iconst_0
    //   121: ireturn
    // Exception table:
    //   from	to	target	type
    //   45	76	79	java/lang/IllegalArgumentException
    //   54	103	106	java/lang/IllegalArgumentException
    //   83	112	112	java/lang/IllegalArgumentException
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #27
    //   2: ldc '{c\\r8\\tLVs\\n\\f8]VrB8E'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgng.a : Ljava/lang/String;
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
    //   80: bipush #50
    //   82: goto -> 112
    //   85: bipush #109
    //   87: goto -> 112
    //   90: bipush #11
    //   92: goto -> 112
    //   95: bipush #112
    //   97: goto -> 112
    //   100: bipush #121
    //   102: goto -> 112
    //   105: bipush #77
    //   107: goto -> 112
    //   110: bipush #97
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgng.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */