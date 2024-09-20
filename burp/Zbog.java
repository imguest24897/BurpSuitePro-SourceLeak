package burp;

import java.awt.Component;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.Optional;

public class Zbog {
  public static BufferedImage Zd(Zs3f paramZs3f) {
    BufferedImage bufferedImage = Optional.<Zs3f>ofNullable(paramZs3f).map(Zs3f::ZZx).map(Zbog::ZJ).orElse(null);
    return (bufferedImage == null) ? null : Optional.<Zs3f>of(paramZs3f).map(Zs3f::ZZA).map(bufferedImage::lambda$createComponentImage$0).orElse(bufferedImage);
  }
  
  public static BufferedImage ZT(Zga3... paramVarArgs) {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   4: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   9: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   14: invokeinterface count : ()J
    //   19: lconst_1
    //   20: lcmp
    //   21: ifgt -> 81
    //   24: aload_0
    //   25: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   28: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   33: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   38: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   43: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   48: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   53: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   58: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   63: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   68: invokeinterface findFirst : ()Ljava/util/Optional;
    //   73: aconst_null
    //   74: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   77: checkcast java/awt/image/BufferedImage
    //   80: areturn
    //   81: aload_0
    //   82: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   85: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   90: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   95: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   100: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   105: invokestatic naturalOrder : ()Ljava/util/Comparator;
    //   108: invokeinterface min : (Ljava/util/Comparator;)Ljava/util/Optional;
    //   113: iconst_0
    //   114: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   117: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   120: checkcast java/lang/Integer
    //   123: invokevirtual intValue : ()I
    //   126: istore_1
    //   127: aload_0
    //   128: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   131: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   136: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   141: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   146: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   151: invokestatic naturalOrder : ()Ljava/util/Comparator;
    //   154: invokeinterface min : (Ljava/util/Comparator;)Ljava/util/Optional;
    //   159: iconst_0
    //   160: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   163: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   166: checkcast java/lang/Integer
    //   169: invokevirtual intValue : ()I
    //   172: istore_2
    //   173: aload_0
    //   174: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   177: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   182: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   187: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   192: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   197: invokestatic naturalOrder : ()Ljava/util/Comparator;
    //   200: invokeinterface max : (Ljava/util/Comparator;)Ljava/util/Optional;
    //   205: iconst_0
    //   206: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   209: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   212: checkcast java/lang/Integer
    //   215: invokevirtual intValue : ()I
    //   218: istore_3
    //   219: aload_0
    //   220: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   223: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   228: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   233: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   238: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   243: invokestatic naturalOrder : ()Ljava/util/Comparator;
    //   246: invokeinterface max : (Ljava/util/Comparator;)Ljava/util/Optional;
    //   251: iconst_0
    //   252: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   255: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   258: checkcast java/lang/Integer
    //   261: invokevirtual intValue : ()I
    //   264: istore #4
    //   266: new java/awt/image/BufferedImage
    //   269: dup
    //   270: iload_3
    //   271: iload_1
    //   272: isub
    //   273: iload #4
    //   275: iload_2
    //   276: isub
    //   277: iconst_2
    //   278: invokespecial <init> : (III)V
    //   281: astore #5
    //   283: aload_0
    //   284: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   287: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   292: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   297: aload #5
    //   299: iload_1
    //   300: iload_2
    //   301: <illegal opcode> accept : (Ljava/awt/image/BufferedImage;II)Ljava/util/function/Consumer;
    //   306: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   311: aload #5
    //   313: areturn
  }
  
  private static BufferedImage ZJ(Component paramComponent) {
    BufferedImage bufferedImage = new BufferedImage(paramComponent.getWidth(), paramComponent.getHeight(), 2);
    paramComponent.paint(bufferedImage.getGraphics());
    return bufferedImage;
  }
  
  private static void lambda$createComponentsImage$3(BufferedImage paramBufferedImage, int paramInt1, int paramInt2, Zga3 paramZga3) {
    BufferedImage bufferedImage = Zd(paramZga3.ZLM());
    if (bufferedImage != null)
      paramBufferedImage.getGraphics().drawImage(bufferedImage, paramZga3.ZLF() - paramInt1, paramZga3.ZI() - paramInt2, null); 
  }
  
  private static Integer lambda$createComponentsImage$2(Zga3 paramZga3) {
    return Integer.valueOf(paramZga3.ZI() + paramZga3.Zd());
  }
  
  private static Integer lambda$createComponentsImage$1(Zga3 paramZga3) {
    return Integer.valueOf(paramZga3.ZLF() + paramZga3.ZL());
  }
  
  private static BufferedImage lambda$createComponentImage$0(BufferedImage paramBufferedImage, Rectangle paramRectangle) {
    return paramBufferedImage.getSubimage(paramRectangle.x, paramRectangle.y, paramRectangle.width, paramRectangle.height);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbog.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */