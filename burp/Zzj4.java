package burp;

import com.formdev.flatlaf.extras.components.FlatTriStateCheckBox;
import java.util.function.Predicate;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class Zzj4 {
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zbmb Zj(Zb86 paramZb86, Zr1m paramZr1m) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Zc : ()Lburp/Zt28;
    //   4: astore_2
    //   5: aload_0
    //   6: dup
    //   7: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   10: pop
    //   11: <illegal opcode> run : (Lburp/Zb86;)Ljava/lang/Runnable;
    //   16: astore_3
    //   17: new burp/Ztnk
    //   20: dup
    //   21: aload_2
    //   22: invokespecial <init> : (Lburp/Zt28;)V
    //   25: astore #4
    //   27: aload #4
    //   29: <illegal opcode> apply : (Lburp/Ztnk;)Ljava/util/function/BiFunction;
    //   34: astore #5
    //   36: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   41: astore #6
    //   43: new burp/Zbg3
    //   46: dup
    //   47: aload #6
    //   49: invokespecial <init> : (Ljava/util/function/BiFunction;)V
    //   52: astore #7
    //   54: new burp/Zbg3
    //   57: dup
    //   58: aload #6
    //   60: invokespecial <init> : (Ljava/util/function/BiFunction;)V
    //   63: astore #8
    //   65: aload #7
    //   67: aload #4
    //   69: aload #8
    //   71: <illegal opcode> test : (Lburp/Zbg3;Lburp/Ztnk;Lburp/Zbg3;)Ljava/util/function/Predicate;
    //   76: astore #9
    //   78: aload #4
    //   80: sipush #24926
    //   83: sipush #1118
    //   86: invokestatic a : (II)Ljava/lang/String;
    //   89: invokestatic ZZ : (Lburp/Ztne;Ljava/lang/String;)Lburp/Zbws;
    //   92: astore #10
    //   94: aload #10
    //   96: invokevirtual getColumnModel : ()Ljavax/swing/table/TableColumnModel;
    //   99: astore #11
    //   101: aload #9
    //   103: aload #11
    //   105: aload_3
    //   106: invokestatic ZO : (Ljava/util/function/Predicate;Ljavax/swing/table/TableColumnModel;Ljava/lang/Runnable;)Lburp/Zmo5;
    //   109: astore #12
    //   111: new burp/Zt7y
    //   114: dup
    //   115: aload #4
    //   117: aload #5
    //   119: aload #12
    //   121: aload_3
    //   122: invokespecial <init> : (Lburp/Ztne;Ljava/util/function/BiFunction;Lburp/Zmo5;Ljava/lang/Runnable;)V
    //   125: astore #13
    //   127: aload #11
    //   129: iconst_1
    //   130: invokeinterface getColumn : (I)Ljavax/swing/table/TableColumn;
    //   135: aload #7
    //   137: invokevirtual setHeaderRenderer : (Ljavax/swing/table/TableCellRenderer;)V
    //   140: aload #11
    //   142: iconst_2
    //   143: invokeinterface getColumn : (I)Ljavax/swing/table/TableColumn;
    //   148: aload #8
    //   150: invokevirtual setHeaderRenderer : (Ljavax/swing/table/TableCellRenderer;)V
    //   153: aload #10
    //   155: aload #12
    //   157: invokevirtual setTableHeader : (Ljavax/swing/table/JTableHeader;)V
    //   160: aload #10
    //   162: aload #13
    //   164: invokevirtual Zk : (Lburp/Zky2;)V
    //   167: new burp/Zbdg
    //   170: dup
    //   171: aload #10
    //   173: aload #12
    //   175: aload #4
    //   177: invokespecial <init> : (Lburp/Zbws;Lburp/Zmo5;Lburp/Ztne;)V
    //   180: astore #14
    //   182: new burp/Zm8y
    //   185: dup
    //   186: sipush #24903
    //   189: sipush #-20801
    //   192: invokestatic a : (II)Ljava/lang/String;
    //   195: sipush #24954
    //   198: sipush #12853
    //   201: invokestatic a : (II)Ljava/lang/String;
    //   204: getstatic burp/Zk97.DESKTOP_FUNCTIONS_MESSAGE_EDITOR_REQUEST_VIEW_OPTIONS : Lburp/Zk97;
    //   207: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lburp/Zk97;)V
    //   210: astore #15
    //   212: new burp/Zbmb
    //   215: dup
    //   216: sipush #24959
    //   219: sipush #-14010
    //   222: invokestatic a : (II)Ljava/lang/String;
    //   225: sipush #24902
    //   228: sipush #24154
    //   231: invokestatic a : (II)Ljava/lang/String;
    //   234: sipush #24920
    //   237: sipush #17734
    //   240: invokestatic a : (II)Ljava/lang/String;
    //   243: sipush #24905
    //   246: sipush #13444
    //   249: invokestatic a : (II)Ljava/lang/String;
    //   252: sipush #24919
    //   255: sipush #-4967
    //   258: invokestatic a : (II)Ljava/lang/String;
    //   261: sipush #24956
    //   264: sipush #-4061
    //   267: invokestatic a : (II)Ljava/lang/String;
    //   270: sipush #24952
    //   273: sipush #-21097
    //   276: invokestatic a : (II)Ljava/lang/String;
    //   279: sipush #24953
    //   282: sipush #-6463
    //   285: invokestatic a : (II)Ljava/lang/String;
    //   288: sipush #24957
    //   291: sipush #13913
    //   294: invokestatic a : (II)Ljava/lang/String;
    //   297: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;
    //   300: aload #4
    //   302: aload #14
    //   304: aload_2
    //   305: dup
    //   306: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   309: pop
    //   310: <illegal opcode> test : (Lburp/Zt28;)Ljava/util/function/Predicate;
    //   315: aload_2
    //   316: dup
    //   317: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   320: pop
    //   321: <illegal opcode> test : (Lburp/Zt28;)Ljava/util/function/Predicate;
    //   326: aload #15
    //   328: aload_1
    //   329: aload_3
    //   330: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lburp/Ztne;Lburp/Zbdg;Ljava/util/function/Predicate;Ljava/util/function/Predicate;Lburp/Zm8y;Lburp/Zr1m;Ljava/lang/Runnable;)V
    //   333: astore #16
    //   335: aload #16
    //   337: sipush #24955
    //   340: sipush #-15797
    //   343: invokestatic a : (II)Ljava/lang/String;
    //   346: invokevirtual setName : (Ljava/lang/String;)V
    //   349: aload #16
    //   351: sipush #24907
    //   354: sipush #-29644
    //   357: invokestatic a : (II)Ljava/lang/String;
    //   360: invokevirtual ZA : (Ljava/lang/String;)V
    //   363: aload #16
    //   365: sipush #24925
    //   368: sipush #-4332
    //   371: invokestatic a : (II)Ljava/lang/String;
    //   374: invokevirtual Zg : (Ljava/lang/String;)V
    //   377: aload #16
    //   379: areturn
  }
  
  public static Zbmb ZH(Zb86 paramZb86, Zr1m paramZr1m) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Zq : ()Lburp/Zkcx;
    //   4: astore_3
    //   5: aload_0
    //   6: dup
    //   7: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   10: pop
    //   11: <illegal opcode> run : (Lburp/Zb86;)Ljava/lang/Runnable;
    //   16: astore #4
    //   18: new burp/Ztnc
    //   21: dup
    //   22: aload_3
    //   23: invokespecial <init> : (Lburp/Zkcx;)V
    //   26: astore #5
    //   28: aload #5
    //   30: <illegal opcode> apply : (Lburp/Ztnc;)Ljava/util/function/BiFunction;
    //   35: astore #6
    //   37: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   42: astore #7
    //   44: new burp/Zbg3
    //   47: dup
    //   48: aload #7
    //   50: invokespecial <init> : (Ljava/util/function/BiFunction;)V
    //   53: astore #8
    //   55: invokestatic ZS : ()Ljava/lang/String;
    //   58: new burp/Zbg3
    //   61: dup
    //   62: aload #7
    //   64: invokespecial <init> : (Ljava/util/function/BiFunction;)V
    //   67: astore #9
    //   69: aload #8
    //   71: aload #5
    //   73: aload #9
    //   75: <illegal opcode> test : (Lburp/Zbg3;Lburp/Ztnc;Lburp/Zbg3;)Ljava/util/function/Predicate;
    //   80: astore #10
    //   82: aload #5
    //   84: sipush #24958
    //   87: sipush #24397
    //   90: invokestatic a : (II)Ljava/lang/String;
    //   93: invokestatic ZZ : (Lburp/Ztne;Ljava/lang/String;)Lburp/Zbws;
    //   96: astore #11
    //   98: aload #11
    //   100: invokevirtual getColumnModel : ()Ljavax/swing/table/TableColumnModel;
    //   103: astore #12
    //   105: aload #10
    //   107: aload #12
    //   109: aload #4
    //   111: invokestatic ZO : (Ljava/util/function/Predicate;Ljavax/swing/table/TableColumnModel;Ljava/lang/Runnable;)Lburp/Zmo5;
    //   114: astore #13
    //   116: astore_2
    //   117: new burp/Zt7y
    //   120: dup
    //   121: aload #5
    //   123: aload #6
    //   125: aload #13
    //   127: aload #4
    //   129: invokespecial <init> : (Lburp/Ztne;Ljava/util/function/BiFunction;Lburp/Zmo5;Ljava/lang/Runnable;)V
    //   132: astore #14
    //   134: aload #12
    //   136: iconst_1
    //   137: invokeinterface getColumn : (I)Ljavax/swing/table/TableColumn;
    //   142: aload #8
    //   144: invokevirtual setHeaderRenderer : (Ljavax/swing/table/TableCellRenderer;)V
    //   147: aload #12
    //   149: iconst_2
    //   150: invokeinterface getColumn : (I)Ljavax/swing/table/TableColumn;
    //   155: aload #9
    //   157: invokevirtual setHeaderRenderer : (Ljavax/swing/table/TableCellRenderer;)V
    //   160: aload #11
    //   162: aload #13
    //   164: invokevirtual setTableHeader : (Ljavax/swing/table/JTableHeader;)V
    //   167: aload #11
    //   169: aload #14
    //   171: invokevirtual Zk : (Lburp/Zky2;)V
    //   174: new burp/Zbdg
    //   177: dup
    //   178: aload #11
    //   180: aload #13
    //   182: aload #5
    //   184: invokespecial <init> : (Lburp/Zbws;Lburp/Zmo5;Lburp/Ztne;)V
    //   187: astore #15
    //   189: new burp/Zm8y
    //   192: dup
    //   193: sipush #24916
    //   196: sipush #12414
    //   199: invokestatic a : (II)Ljava/lang/String;
    //   202: sipush #24914
    //   205: sipush #24895
    //   208: invokestatic a : (II)Ljava/lang/String;
    //   211: getstatic burp/Zk97.DESKTOP_FUNCTIONS_MESSAGE_EDITOR_RESPONSE_VIEW_OPTIONS : Lburp/Zk97;
    //   214: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lburp/Zk97;)V
    //   217: astore #16
    //   219: new burp/Zbmb
    //   222: dup
    //   223: sipush #24913
    //   226: sipush #27947
    //   229: invokestatic a : (II)Ljava/lang/String;
    //   232: sipush #24918
    //   235: sipush #-6752
    //   238: invokestatic a : (II)Ljava/lang/String;
    //   241: sipush #24920
    //   244: sipush #17734
    //   247: invokestatic a : (II)Ljava/lang/String;
    //   250: sipush #24905
    //   253: sipush #13444
    //   256: invokestatic a : (II)Ljava/lang/String;
    //   259: sipush #24919
    //   262: sipush #-4967
    //   265: invokestatic a : (II)Ljava/lang/String;
    //   268: sipush #24911
    //   271: sipush #-5473
    //   274: invokestatic a : (II)Ljava/lang/String;
    //   277: sipush #24921
    //   280: sipush #27823
    //   283: invokestatic a : (II)Ljava/lang/String;
    //   286: sipush #24917
    //   289: sipush #25312
    //   292: invokestatic a : (II)Ljava/lang/String;
    //   295: sipush #24896
    //   298: sipush #-1214
    //   301: invokestatic a : (II)Ljava/lang/String;
    //   304: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;
    //   307: aload #5
    //   309: aload #15
    //   311: aload_3
    //   312: dup
    //   313: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   316: pop
    //   317: <illegal opcode> test : (Lburp/Zkcx;)Ljava/util/function/Predicate;
    //   322: aload_3
    //   323: dup
    //   324: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   327: pop
    //   328: <illegal opcode> test : (Lburp/Zkcx;)Ljava/util/function/Predicate;
    //   333: aload #16
    //   335: aload_1
    //   336: aload #4
    //   338: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lburp/Ztne;Lburp/Zbdg;Ljava/util/function/Predicate;Ljava/util/function/Predicate;Lburp/Zm8y;Lburp/Zr1m;Ljava/lang/Runnable;)V
    //   341: astore #17
    //   343: aload #17
    //   345: sipush #24908
    //   348: sipush #31895
    //   351: invokestatic a : (II)Ljava/lang/String;
    //   354: invokevirtual setName : (Ljava/lang/String;)V
    //   357: aload #17
    //   359: sipush #24927
    //   362: sipush #28220
    //   365: invokestatic a : (II)Ljava/lang/String;
    //   368: invokevirtual ZA : (Ljava/lang/String;)V
    //   371: aload #17
    //   373: sipush #24915
    //   376: sipush #-28265
    //   379: invokestatic a : (II)Ljava/lang/String;
    //   382: invokevirtual Zg : (Ljava/lang/String;)V
    //   385: aload #17
    //   387: invokestatic Zwu : ()[Lburp/Zbqc;
    //   390: ifnonnull -> 398
    //   393: ldc 'zcqzbc'
    //   395: invokestatic ZV : (Ljava/lang/String;)V
    //   398: areturn
  }
  
  public static Zbmb ZD(Zkee paramZkee, Zr1m paramZr1m) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual ZR : ()Lburp/Zliz;
    //   4: astore_3
    //   5: aload_0
    //   6: dup
    //   7: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   10: pop
    //   11: <illegal opcode> run : (Lburp/Zkee;)Ljava/lang/Runnable;
    //   16: astore #4
    //   18: new burp/Ztna
    //   21: dup
    //   22: aload_3
    //   23: invokespecial <init> : (Lburp/Zliz;)V
    //   26: astore #5
    //   28: aload #5
    //   30: <illegal opcode> apply : (Lburp/Ztna;)Ljava/util/function/BiFunction;
    //   35: astore #6
    //   37: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   42: astore #7
    //   44: new burp/Zbg3
    //   47: dup
    //   48: aload #7
    //   50: invokespecial <init> : (Ljava/util/function/BiFunction;)V
    //   53: astore #8
    //   55: new burp/Zbg3
    //   58: dup
    //   59: aload #7
    //   61: invokespecial <init> : (Ljava/util/function/BiFunction;)V
    //   64: astore #9
    //   66: new burp/Zbg3
    //   69: dup
    //   70: aload #7
    //   72: invokespecial <init> : (Ljava/util/function/BiFunction;)V
    //   75: astore #10
    //   77: aload #8
    //   79: aload #5
    //   81: aload #9
    //   83: aload #10
    //   85: <illegal opcode> test : (Lburp/Zbg3;Lburp/Ztna;Lburp/Zbg3;Lburp/Zbg3;)Ljava/util/function/Predicate;
    //   90: astore #11
    //   92: aload #5
    //   94: sipush #24904
    //   97: sipush #8494
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: invokestatic ZZ : (Lburp/Ztne;Ljava/lang/String;)Lburp/Zbws;
    //   106: astore #12
    //   108: aload #12
    //   110: invokevirtual getColumnModel : ()Ljavax/swing/table/TableColumnModel;
    //   113: astore #13
    //   115: aload #11
    //   117: aload #13
    //   119: aload #4
    //   121: invokestatic ZO : (Ljava/util/function/Predicate;Ljavax/swing/table/TableColumnModel;Ljava/lang/Runnable;)Lburp/Zmo5;
    //   124: astore #14
    //   126: new burp/Zt7y
    //   129: dup
    //   130: aload #5
    //   132: aload #6
    //   134: aload #14
    //   136: aload #4
    //   138: invokespecial <init> : (Lburp/Ztne;Ljava/util/function/BiFunction;Lburp/Zmo5;Ljava/lang/Runnable;)V
    //   141: astore #15
    //   143: aload #13
    //   145: iconst_2
    //   146: invokeinterface getColumn : (I)Ljavax/swing/table/TableColumn;
    //   151: aload #8
    //   153: invokevirtual setHeaderRenderer : (Ljavax/swing/table/TableCellRenderer;)V
    //   156: aload #13
    //   158: iconst_3
    //   159: invokeinterface getColumn : (I)Ljavax/swing/table/TableColumn;
    //   164: aload #9
    //   166: invokevirtual setHeaderRenderer : (Ljavax/swing/table/TableCellRenderer;)V
    //   169: aload #13
    //   171: iconst_4
    //   172: invokeinterface getColumn : (I)Ljavax/swing/table/TableColumn;
    //   177: aload #10
    //   179: invokevirtual setHeaderRenderer : (Ljavax/swing/table/TableCellRenderer;)V
    //   182: aload #12
    //   184: aload #14
    //   186: invokevirtual setTableHeader : (Ljavax/swing/table/JTableHeader;)V
    //   189: invokestatic ZS : ()Ljava/lang/String;
    //   192: aload #12
    //   194: aload #15
    //   196: invokevirtual Zk : (Lburp/Zky2;)V
    //   199: new burp/Zbdg
    //   202: dup
    //   203: aload #12
    //   205: aload #14
    //   207: aload #5
    //   209: invokespecial <init> : (Lburp/Zbws;Lburp/Zmo5;Lburp/Ztne;)V
    //   212: astore #16
    //   214: new burp/Zm8y
    //   217: dup
    //   218: sipush #24899
    //   221: sipush #31419
    //   224: invokestatic a : (II)Ljava/lang/String;
    //   227: sipush #24924
    //   230: sipush #-13613
    //   233: invokestatic a : (II)Ljava/lang/String;
    //   236: getstatic burp/Zk97.DESKTOP_FUNCTIONS_MESSAGE_EDITOR_INSPECTOR_WIDGET_OPTIONS : Lburp/Zk97;
    //   239: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lburp/Zk97;)V
    //   242: astore #17
    //   244: new burp/Zbmb
    //   247: dup
    //   248: sipush #24909
    //   251: sipush #20506
    //   254: invokestatic a : (II)Ljava/lang/String;
    //   257: sipush #24910
    //   260: sipush #5063
    //   263: invokestatic a : (II)Ljava/lang/String;
    //   266: sipush #24900
    //   269: sipush #-28092
    //   272: invokestatic a : (II)Ljava/lang/String;
    //   275: sipush #24898
    //   278: sipush #13218
    //   281: invokestatic a : (II)Ljava/lang/String;
    //   284: sipush #24912
    //   287: sipush #-29415
    //   290: invokestatic a : (II)Ljava/lang/String;
    //   293: sipush #24922
    //   296: sipush #9297
    //   299: invokestatic a : (II)Ljava/lang/String;
    //   302: sipush #24901
    //   305: sipush #-15632
    //   308: invokestatic a : (II)Ljava/lang/String;
    //   311: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;
    //   314: aload #5
    //   316: aload #16
    //   318: aload_3
    //   319: dup
    //   320: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   323: pop
    //   324: <illegal opcode> test : (Lburp/Zliz;)Ljava/util/function/Predicate;
    //   329: aload_3
    //   330: dup
    //   331: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   334: pop
    //   335: <illegal opcode> test : (Lburp/Zliz;)Ljava/util/function/Predicate;
    //   340: aload #17
    //   342: aload_1
    //   343: aload #4
    //   345: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lburp/Ztne;Lburp/Zbdg;Ljava/util/function/Predicate;Ljava/util/function/Predicate;Lburp/Zm8y;Lburp/Zr1m;Ljava/lang/Runnable;)V
    //   348: astore #18
    //   350: aload #18
    //   352: sipush #24897
    //   355: sipush #-13414
    //   358: invokestatic a : (II)Ljava/lang/String;
    //   361: invokevirtual setName : (Ljava/lang/String;)V
    //   364: aload #18
    //   366: sipush #24906
    //   369: sipush #-17370
    //   372: invokestatic a : (II)Ljava/lang/String;
    //   375: invokevirtual ZA : (Ljava/lang/String;)V
    //   378: aload #18
    //   380: sipush #24923
    //   383: sipush #16742
    //   386: invokestatic a : (II)Ljava/lang/String;
    //   389: invokevirtual Zg : (Ljava/lang/String;)V
    //   392: astore_2
    //   393: aload #18
    //   395: aload_2
    //   396: ifnonnull -> 406
    //   399: iconst_4
    //   400: anewarray burp/Zbqc
    //   403: invokestatic Zr : ([Lburp/Zbqc;)V
    //   406: areturn
  }
  
  private static Zbws ZZ(Ztne paramZtne, String paramString) {
    Zbws zbws = new Zbws(paramZtne);
    zbws.ZL(paramZtne);
    zbws.setName(paramString);
    zbws.setSelectionMode(0);
    return zbws;
  }
  
  private static Zmo5 ZO(Predicate<Integer> paramPredicate, TableColumnModel paramTableColumnModel, Runnable paramRunnable) {
    Zmo5 zmo5 = new Zmo5(paramTableColumnModel);
    zmo5.ZE(2);
    zmo5.ZT(new Zgd3(paramPredicate, zmo5, paramRunnable));
    return zmo5;
  }
  
  private static boolean lambda$widgetPanel$8(Zbg3 paramZbg31, Ztna paramZtna, Zbg3 paramZbg32, Zbg3 paramZbg33, Integer paramInteger) {
    FlatTriStateCheckBox.State state;
    switch (paramInteger.intValue()) {
      case 2:
        state = paramZbg31.ZC();
        paramZtna.Zu((state == FlatTriStateCheckBox.State.SELECTED));
        return true;
      case 3:
        state = paramZbg32.ZC();
        paramZtna.ZC((state == FlatTriStateCheckBox.State.SELECTED));
        return true;
      case 4:
        state = paramZbg33.ZC();
        paramZtna.ZA((state == FlatTriStateCheckBox.State.SELECTED));
        return true;
    } 
    return false;
  }
  
  private static FlatTriStateCheckBox.State lambda$widgetPanel$7(Integer paramInteger, TableModel paramTableModel) {
    Ztna ztna = (Ztna)paramTableModel;
    switch (paramInteger.intValue()) {
      case 2:
      
      case 3:
      
      case 4:
      
    } 
    return FlatTriStateCheckBox.State.INDETERMINATE;
  }
  
  private static Boolean lambda$widgetPanel$6(Ztna paramZtna, Integer paramInteger1, Integer paramInteger2) {
    Zo4 zo4 = paramZtna.ZX(paramInteger1.intValue());
    switch (paramInteger2.intValue()) {
      case 2:
      
      case 3:
      
      case 4:
      
    } 
    return Boolean.valueOf(false);
  }
  
  private static boolean lambda$responseViewPanel$5(Zbg3 paramZbg31, Ztnc paramZtnc, Zbg3 paramZbg32, Integer paramInteger) {
    FlatTriStateCheckBox.State state;
    switch (paramInteger.intValue()) {
      case 1:
        state = paramZbg31.ZC();
        paramZtnc.ZX((state == FlatTriStateCheckBox.State.SELECTED));
        return true;
      case 2:
        state = paramZbg32.ZC();
        paramZtnc.ZZ((state == FlatTriStateCheckBox.State.SELECTED));
        return true;
    } 
    return false;
  }
  
  private static FlatTriStateCheckBox.State lambda$responseViewPanel$4(Integer paramInteger, TableModel paramTableModel) {
    Ztnc ztnc = (Ztnc)paramTableModel;
    switch (paramInteger.intValue()) {
      case 1:
      
      case 2:
      
    } 
    return FlatTriStateCheckBox.State.INDETERMINATE;
  }
  
  private static Boolean lambda$responseViewPanel$3(Ztnc paramZtnc, Integer paramInteger1, Integer paramInteger2) {
    Ztjo ztjo = paramZtnc.Zs(paramInteger1.intValue());
    switch (paramInteger2.intValue()) {
      case 1:
        ztjo.ZY();
        return Boolean.valueOf(true);
      case 2:
        ztjo.Z_();
        return Boolean.valueOf(true);
    } 
    return Boolean.valueOf(false);
  }
  
  private static boolean lambda$requestViewPanel$2(Zbg3 paramZbg31, Ztnk paramZtnk, Zbg3 paramZbg32, Integer paramInteger) {
    FlatTriStateCheckBox.State state;
    switch (paramInteger.intValue()) {
      case 1:
        state = paramZbg31.ZC();
        paramZtnk.Zx((state == FlatTriStateCheckBox.State.SELECTED));
        return true;
      case 2:
        state = paramZbg32.ZC();
        paramZtnk.ZQ((state == FlatTriStateCheckBox.State.SELECTED));
        return true;
    } 
    return false;
  }
  
  private static FlatTriStateCheckBox.State lambda$requestViewPanel$1(Integer paramInteger, TableModel paramTableModel) {
    Ztnk ztnk = (Ztnk)paramTableModel;
    switch (paramInteger.intValue()) {
      case 1:
      
      case 2:
      
    } 
    return FlatTriStateCheckBox.State.INDETERMINATE;
  }
  
  private static Boolean lambda$requestViewPanel$0(Ztnk paramZtnk, Integer paramInteger1, Integer paramInteger2) {
    Zsmc zsmc = paramZtnk.Zh(paramInteger1.intValue());
    switch (paramInteger2.intValue()) {
      case 1:
        zsmc.ZM();
        return Boolean.valueOf(true);
      case 2:
        zsmc.Zo();
        return Boolean.valueOf(true);
    } 
    return Boolean.valueOf(false);
  }
  
  static {
    // Byte code:
    //   0: bipush #40
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'b»¯wzóÆZ¿¶Âÿ¨ê\\tu©¦ªXµ¾ù0¹È÷put²ï_dA8¡\\bH,éïÅuÝ\\nCkèPØ¿eÝh'Ðþ\\t£Cà14<ì;ü4o4Ç[þæ/°%ó3é¯Sbâ¥SC ûà¢(á2%ÌñÉÂØëê:R;g]h^¹^8A$B8)TÕ8BF±Î»±ïÅ--"[×ÅuQk #åoêKoLG<ßº6R{ó¨FàðtukQÉ^ï#gOé`­ü`ëC¡àêÙHAÇálOæÂ`¾­B)Wä_µÚúX.{füqbè^*¢ó=÷pù³c}n;9\\rs:%z¾ÜÌÌ;_I£;³¯\\rPïÔ7ÍC;zMÊØWèëOâ¯EºÞµî±Yä¿WÝK\yjhÓ÷¿ÏÌaºÝ{ !­?¯ÉAñþÖ*ÜõK(bÇäÌß\\rÊ:å¡¡?zkD\\täAtÖëwtÃÉ,uxQ§ä¦Cy0º¦5Ë?*jÌBåe\Çbq¿± \\fÌÌ°ilÒ°ó~s\\n  ýÈW¢òBZHl½cý VÁ#QÒCÓ¿ #\\\rô?s¦i²®lïÔÑ×à²\\tLsw¢(ì{qðF[\eS«Á§|·\\bí´&üAís%SAßÆ.økÄA|â!§Yó¦"×êÐå¥©\\bÌÅÌ=Í`¹*ùaXZñ)85i\\nkäTx10#F+pêÔFý¾'mºêGÚ¼¶NçþÁìØa[oLz­G=\\t¶!¼,-zÝöõ0ôJ5åÕçÓu­ÕB¹^ýU³>­.ù§§×Ö»Õ¸ZZòL§AÝTÞ@ú->Áí½ÌôÕ5»ôèØû4geyúüÜáâîsþk}Fÿuöq{Ó?\\f­Ñ%æËóGlá uæ»Ýt³,-Ñ?'Ëo®F¦£ÿÈ¸¶/7KxC<æa3cê/ñÄõ±NL67!)N¨`å¾DqÔ£Þ²¥!£oçCKLmÂR`.éÌnw¶¤9\\r©,\\b´Ìh>ýbÁ$aå¼á9çÛà\\b¢íÇ[ÍÛa¿pô ÷ÔyK¹nÉìô[äwÔ±Ö?ÖÒA0­p@ª|Kr¥¶zIºë\\t=äuïÅÖ<!º\\tm½TeÒ2pu'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #14
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'ÆçÌÙæ?ßæ:¼'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #7
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: iconst_2
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 82
    //   126: aload #5
    //   128: putstatic burp/Zzj4.a : [Ljava/lang/String;
    //   131: bipush #40
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zzj4.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 258
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 240, 0 -> 212, 1 -> 216, 2 -> 220, 3 -> 225, 4 -> 230, 5 -> 235
    //   212: iconst_3
    //   213: goto -> 242
    //   216: iconst_2
    //   217: goto -> 242
    //   220: bipush #123
    //   222: goto -> 242
    //   225: bipush #92
    //   227: goto -> 242
    //   230: bipush #87
    //   232: goto -> 242
    //   235: bipush #68
    //   237: goto -> 242
    //   240: bipush #17
    //   242: ixor
    //   243: ixor
    //   244: i2c
    //   245: castore
    //   246: iinc #6, 1
    //   249: dup
    //   250: ifne -> 258
    //   253: dup2
    //   254: dup_x1
    //   255: goto -> 165
    //   258: dup2_x1
    //   259: pop2
    //   260: dup_x2
    //   261: iload #6
    //   263: if_icmpgt -> 161
    //   266: pop
    //   267: new java/lang/String
    //   270: dup_x1
    //   271: swap
    //   272: invokespecial <init> : ([C)V
    //   275: invokevirtual intern : ()Ljava/lang/String;
    //   278: swap
    //   279: pop
    //   280: swap
    //   281: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x615A) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = '±';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzj4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */