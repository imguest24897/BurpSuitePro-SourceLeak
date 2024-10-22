package com.fasterxml.Zor;

import com.fasterxml.Zj.Zu;

public enum Zy9 implements Zu {
  USE_ANNOTATIONS, USE_GETTERS_AS_SETTERS, PROPAGATE_TRANSIENT_MARKER, AUTO_DETECT_CREATORS, AUTO_DETECT_FIELDS, AUTO_DETECT_GETTERS, AUTO_DETECT_IS_GETTERS, AUTO_DETECT_SETTERS, REQUIRE_SETTERS_FOR_GETTERS, ALLOW_FINAL_FIELDS_AS_MUTATORS, INFER_PROPERTY_MUTATORS, INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES, ALLOW_VOID_VALUED_PROPERTIES, CAN_OVERRIDE_ACCESS_MODIFIERS, OVERRIDE_PUBLIC_ACCESS_MODIFIERS, USE_STATIC_TYPING, USE_BASE_TYPE_AS_DEFAULT_IMPL, INFER_BUILDER_TYPE_BINDINGS, REQUIRE_TYPE_ID_FOR_SUBTYPES, DEFAULT_VIEW_INCLUSION, SORT_PROPERTIES_ALPHABETICALLY, SORT_CREATOR_PROPERTIES_FIRST, ACCEPT_CASE_INSENSITIVE_PROPERTIES, ACCEPT_CASE_INSENSITIVE_ENUMS, ACCEPT_CASE_INSENSITIVE_VALUES, USE_WRAPPER_NAME_AS_PROPERTY_NAME, USE_STD_BEAN_NAMING, ALLOW_EXPLICIT_PROPERTY_RENAMING, ALLOW_IS_GETTERS_FOR_NON_BOOLEAN, ALLOW_COERCION_OF_SCALARS, IGNORE_DUPLICATE_MODULE_REGISTRATIONS, IGNORE_MERGE_FOR_UNMERGEABLE, BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES, APPLY_DEFAULT_VALUES;
  
  private final boolean ZB;
  
  private final long Zy;
  
  public static long ZA() {
    long l = 0L;
    for (Zy9 zy9 : values()) {
      if (zy9.Zg())
        l |= zy9.Zo(); 
    } 
    return l;
  }
  
  Zy9(boolean paramBoolean) {
    this.ZB = paramBoolean;
    this.Zy = 1L << ordinal();
  }
  
  public boolean Zg() {
    return this.ZB;
  }
  
  @Deprecated
  public int Zu() {
    return (int)this.Zy;
  }
  
  public long Zo() {
    return this.Zy;
  }
  
  @Deprecated
  public boolean Zq(int paramInt) {
    return ((paramInt & this.Zy) != 0L);
  }
  
  public boolean Zz(long paramLong) {
    return ((paramLong & this.Zy) != 0L);
  }
  
  static {
    // Byte code:
    //   0: bipush #34
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'I\\n0'mlR76pacF9/`psN"0jphO)2m|lE"+z`#B\\b9!tliN7$zllO\\b//palH\\r5=}roE";ovoA"-`wyT56``yT30lR'7vay_/2zluD0-mloU";ovoA\\b:-hlO$!v|r_0=lp}L$1 A\\b:-hlyX:+|zh_$-ovnT)0z}}M\\r8%I\\n0'ml~U\\r:&zacT&'`quN ?,x`A"-`wyT56`pnE"-m`U3=lgx_3#qlrA\\t?,xA5'ogcC%'`zrS81vguV)4~iEA"-`wyT56`tyT30lR'7vay_36kvnS0-ml{E"'m`%I8-mvcD&.vp}T)/pwiL)0ztuS$#kzsNA\\b:-hlzI\\n7.`uuE\\b21`ro_\\t#6~gsRU3=}roE";ovcA)&zu}U\\b"=v~lL A\\b:-hluS1'kgyR)$pacN8=}|sL7,S$6`pnE"-mllR&'mguE)$vaoTU3=lg}T\\r5=kjlI\\n1P92~t}T)6mrrS\\r3,klqA='m!U3=ha}P30`}}M)#lllR&'mge_\\n7/zU3=xvhT$1`ro_36kvnSA"-`wyT56`zo_36kvnSC8=peyR?&zl}C31llqO ?$vvnSI8-mvcM$%zlzO)7q~yR3#}yA5'ogcC%'`zrS81vguV)'qfqSA\\b:-hljO\\r2=irpU2=oasP$6vvoD0#jh_?'hluN:7lzsN"A5'ogcC%'`zrS81vguV)2m|lE"+z`S$6`cnO30kzyS7.o{}B"+|rpLA"-`wyT56`uuE\\b21 O30mzxE&7}uC7!|voS;-{zzI$1U3=~}rO76v|rS'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #41
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: iconst_1
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 129
    //   39: aload_0
    //   40: swap
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: swap
    //   47: aastore
    //   48: iload_1
    //   49: iload_2
    //   50: iadd
    //   51: dup
    //   52: istore_1
    //   53: iload #5
    //   55: if_icmpge -> 67
    //   58: aload_3
    //   59: iload_1
    //   60: invokevirtual charAt : (I)C
    //   63: istore_2
    //   64: goto -> 23
    //   67: ldc 'Mw`*++La`* "Ndq9 4PSai!+?Epp4 $B}p=''
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: bipush #23
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #70
    //   83: iinc #1, 1
    //   86: aload_3
    //   87: iload_1
    //   88: dup
    //   89: iload_2
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 129
    //   98: aload_0
    //   99: swap
    //   100: iload #4
    //   102: iinc #4, 1
    //   105: swap
    //   106: aastore
    //   107: iload_1
    //   108: iload_2
    //   109: iadd
    //   110: dup
    //   111: istore_1
    //   112: iload #5
    //   114: if_icmpge -> 126
    //   117: aload_3
    //   118: iload_1
    //   119: invokevirtual charAt : (I)C
    //   122: istore_2
    //   123: goto -> 81
    //   126: goto -> 288
    //   129: dup_x2
    //   130: pop
    //   131: invokevirtual toCharArray : ()[C
    //   134: dup_x1
    //   135: arraylength
    //   136: dup_x2
    //   137: pop
    //   138: iconst_0
    //   139: istore #6
    //   141: dup2_x1
    //   142: pop2
    //   143: dup_x2
    //   144: iconst_1
    //   145: if_icmpgt -> 247
    //   148: dup2
    //   149: swap
    //   150: iload #6
    //   152: dup2_x1
    //   153: caload
    //   154: swap
    //   155: iload #6
    //   157: bipush #7
    //   159: irem
    //   160: tableswitch default -> 229, 0 -> 200, 1 -> 204, 2 -> 209, 3 -> 214, 4 -> 219, 5 -> 224
    //   200: iconst_1
    //   201: goto -> 231
    //   204: bipush #69
    //   206: goto -> 231
    //   209: bipush #119
    //   211: goto -> 231
    //   214: bipush #99
    //   216: goto -> 231
    //   219: bipush #62
    //   221: goto -> 231
    //   224: bipush #50
    //   226: goto -> 231
    //   229: bipush #61
    //   231: ixor
    //   232: ixor
    //   233: i2c
    //   234: castore
    //   235: iinc #6, 1
    //   238: dup
    //   239: ifne -> 247
    //   242: dup2
    //   243: dup_x1
    //   244: goto -> 152
    //   247: dup2_x1
    //   248: pop2
    //   249: dup_x2
    //   250: iload #6
    //   252: if_icmpgt -> 148
    //   255: pop
    //   256: new java/lang/String
    //   259: dup_x1
    //   260: swap
    //   261: invokespecial <init> : ([C)V
    //   264: invokevirtual intern : ()Ljava/lang/String;
    //   267: swap
    //   268: pop
    //   269: swap
    //   270: tableswitch default -> 39, 0 -> 98
    //   288: new com/fasterxml/Zor/Zy9
    //   291: dup
    //   292: aload_0
    //   293: bipush #31
    //   295: aaload
    //   296: iconst_0
    //   297: iconst_1
    //   298: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   301: putstatic com/fasterxml/Zor/Zy9.USE_ANNOTATIONS : Lcom/fasterxml/Zor/Zy9;
    //   304: new com/fasterxml/Zor/Zy9
    //   307: dup
    //   308: aload_0
    //   309: bipush #20
    //   311: aaload
    //   312: iconst_1
    //   313: iconst_1
    //   314: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   317: putstatic com/fasterxml/Zor/Zy9.USE_GETTERS_AS_SETTERS : Lcom/fasterxml/Zor/Zy9;
    //   320: new com/fasterxml/Zor/Zy9
    //   323: dup
    //   324: aload_0
    //   325: bipush #18
    //   327: aaload
    //   328: iconst_2
    //   329: iconst_0
    //   330: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   333: putstatic com/fasterxml/Zor/Zy9.PROPAGATE_TRANSIENT_MARKER : Lcom/fasterxml/Zor/Zy9;
    //   336: new com/fasterxml/Zor/Zy9
    //   339: dup
    //   340: aload_0
    //   341: bipush #7
    //   343: aaload
    //   344: iconst_3
    //   345: iconst_1
    //   346: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   349: putstatic com/fasterxml/Zor/Zy9.AUTO_DETECT_CREATORS : Lcom/fasterxml/Zor/Zy9;
    //   352: new com/fasterxml/Zor/Zy9
    //   355: dup
    //   356: aload_0
    //   357: bipush #29
    //   359: aaload
    //   360: iconst_4
    //   361: iconst_1
    //   362: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   365: putstatic com/fasterxml/Zor/Zy9.AUTO_DETECT_FIELDS : Lcom/fasterxml/Zor/Zy9;
    //   368: new com/fasterxml/Zor/Zy9
    //   371: dup
    //   372: aload_0
    //   373: bipush #10
    //   375: aaload
    //   376: iconst_5
    //   377: iconst_1
    //   378: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   381: putstatic com/fasterxml/Zor/Zy9.AUTO_DETECT_GETTERS : Lcom/fasterxml/Zor/Zy9;
    //   384: new com/fasterxml/Zor/Zy9
    //   387: dup
    //   388: aload_0
    //   389: bipush #21
    //   391: aaload
    //   392: bipush #6
    //   394: iconst_1
    //   395: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   398: putstatic com/fasterxml/Zor/Zy9.AUTO_DETECT_IS_GETTERS : Lcom/fasterxml/Zor/Zy9;
    //   401: new com/fasterxml/Zor/Zy9
    //   404: dup
    //   405: aload_0
    //   406: iconst_2
    //   407: aaload
    //   408: bipush #7
    //   410: iconst_1
    //   411: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   414: putstatic com/fasterxml/Zor/Zy9.AUTO_DETECT_SETTERS : Lcom/fasterxml/Zor/Zy9;
    //   417: new com/fasterxml/Zor/Zy9
    //   420: dup
    //   421: aload_0
    //   422: bipush #11
    //   424: aaload
    //   425: bipush #8
    //   427: iconst_0
    //   428: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   431: putstatic com/fasterxml/Zor/Zy9.REQUIRE_SETTERS_FOR_GETTERS : Lcom/fasterxml/Zor/Zy9;
    //   434: new com/fasterxml/Zor/Zy9
    //   437: dup
    //   438: aload_0
    //   439: bipush #13
    //   441: aaload
    //   442: bipush #9
    //   444: iconst_1
    //   445: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   448: putstatic com/fasterxml/Zor/Zy9.ALLOW_FINAL_FIELDS_AS_MUTATORS : Lcom/fasterxml/Zor/Zy9;
    //   451: new com/fasterxml/Zor/Zy9
    //   454: dup
    //   455: aload_0
    //   456: bipush #32
    //   458: aaload
    //   459: bipush #10
    //   461: iconst_1
    //   462: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   465: putstatic com/fasterxml/Zor/Zy9.INFER_PROPERTY_MUTATORS : Lcom/fasterxml/Zor/Zy9;
    //   468: new com/fasterxml/Zor/Zy9
    //   471: dup
    //   472: aload_0
    //   473: iconst_0
    //   474: aaload
    //   475: bipush #11
    //   477: iconst_1
    //   478: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   481: putstatic com/fasterxml/Zor/Zy9.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES : Lcom/fasterxml/Zor/Zy9;
    //   484: new com/fasterxml/Zor/Zy9
    //   487: dup
    //   488: aload_0
    //   489: bipush #25
    //   491: aaload
    //   492: bipush #12
    //   494: iconst_0
    //   495: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   498: putstatic com/fasterxml/Zor/Zy9.ALLOW_VOID_VALUED_PROPERTIES : Lcom/fasterxml/Zor/Zy9;
    //   501: new com/fasterxml/Zor/Zy9
    //   504: dup
    //   505: aload_0
    //   506: bipush #22
    //   508: aaload
    //   509: bipush #13
    //   511: iconst_1
    //   512: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   515: putstatic com/fasterxml/Zor/Zy9.CAN_OVERRIDE_ACCESS_MODIFIERS : Lcom/fasterxml/Zor/Zy9;
    //   518: new com/fasterxml/Zor/Zy9
    //   521: dup
    //   522: aload_0
    //   523: bipush #30
    //   525: aaload
    //   526: bipush #14
    //   528: iconst_1
    //   529: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   532: putstatic com/fasterxml/Zor/Zy9.OVERRIDE_PUBLIC_ACCESS_MODIFIERS : Lcom/fasterxml/Zor/Zy9;
    //   535: new com/fasterxml/Zor/Zy9
    //   538: dup
    //   539: aload_0
    //   540: bipush #17
    //   542: aaload
    //   543: bipush #15
    //   545: iconst_0
    //   546: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   549: putstatic com/fasterxml/Zor/Zy9.USE_STATIC_TYPING : Lcom/fasterxml/Zor/Zy9;
    //   552: new com/fasterxml/Zor/Zy9
    //   555: dup
    //   556: aload_0
    //   557: bipush #14
    //   559: aaload
    //   560: bipush #16
    //   562: iconst_0
    //   563: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   566: putstatic com/fasterxml/Zor/Zy9.USE_BASE_TYPE_AS_DEFAULT_IMPL : Lcom/fasterxml/Zor/Zy9;
    //   569: new com/fasterxml/Zor/Zy9
    //   572: dup
    //   573: aload_0
    //   574: bipush #6
    //   576: aaload
    //   577: bipush #17
    //   579: iconst_1
    //   580: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   583: putstatic com/fasterxml/Zor/Zy9.INFER_BUILDER_TYPE_BINDINGS : Lcom/fasterxml/Zor/Zy9;
    //   586: new com/fasterxml/Zor/Zy9
    //   589: dup
    //   590: aload_0
    //   591: iconst_3
    //   592: aaload
    //   593: bipush #18
    //   595: iconst_1
    //   596: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   599: putstatic com/fasterxml/Zor/Zy9.REQUIRE_TYPE_ID_FOR_SUBTYPES : Lcom/fasterxml/Zor/Zy9;
    //   602: new com/fasterxml/Zor/Zy9
    //   605: dup
    //   606: aload_0
    //   607: bipush #26
    //   609: aaload
    //   610: bipush #19
    //   612: iconst_1
    //   613: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   616: putstatic com/fasterxml/Zor/Zy9.DEFAULT_VIEW_INCLUSION : Lcom/fasterxml/Zor/Zy9;
    //   619: new com/fasterxml/Zor/Zy9
    //   622: dup
    //   623: aload_0
    //   624: bipush #28
    //   626: aaload
    //   627: bipush #20
    //   629: iconst_0
    //   630: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   633: putstatic com/fasterxml/Zor/Zy9.SORT_PROPERTIES_ALPHABETICALLY : Lcom/fasterxml/Zor/Zy9;
    //   636: new com/fasterxml/Zor/Zy9
    //   639: dup
    //   640: aload_0
    //   641: bipush #16
    //   643: aaload
    //   644: bipush #21
    //   646: iconst_1
    //   647: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   650: putstatic com/fasterxml/Zor/Zy9.SORT_CREATOR_PROPERTIES_FIRST : Lcom/fasterxml/Zor/Zy9;
    //   653: new com/fasterxml/Zor/Zy9
    //   656: dup
    //   657: aload_0
    //   658: bipush #27
    //   660: aaload
    //   661: bipush #22
    //   663: iconst_0
    //   664: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   667: putstatic com/fasterxml/Zor/Zy9.ACCEPT_CASE_INSENSITIVE_PROPERTIES : Lcom/fasterxml/Zor/Zy9;
    //   670: new com/fasterxml/Zor/Zy9
    //   673: dup
    //   674: aload_0
    //   675: bipush #24
    //   677: aaload
    //   678: bipush #23
    //   680: iconst_0
    //   681: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   684: putstatic com/fasterxml/Zor/Zy9.ACCEPT_CASE_INSENSITIVE_ENUMS : Lcom/fasterxml/Zor/Zy9;
    //   687: new com/fasterxml/Zor/Zy9
    //   690: dup
    //   691: aload_0
    //   692: bipush #9
    //   694: aaload
    //   695: bipush #24
    //   697: iconst_0
    //   698: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   701: putstatic com/fasterxml/Zor/Zy9.ACCEPT_CASE_INSENSITIVE_VALUES : Lcom/fasterxml/Zor/Zy9;
    //   704: new com/fasterxml/Zor/Zy9
    //   707: dup
    //   708: aload_0
    //   709: bipush #19
    //   711: aaload
    //   712: bipush #25
    //   714: iconst_0
    //   715: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   718: putstatic com/fasterxml/Zor/Zy9.USE_WRAPPER_NAME_AS_PROPERTY_NAME : Lcom/fasterxml/Zor/Zy9;
    //   721: new com/fasterxml/Zor/Zy9
    //   724: dup
    //   725: aload_0
    //   726: bipush #8
    //   728: aaload
    //   729: bipush #26
    //   731: iconst_0
    //   732: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   735: putstatic com/fasterxml/Zor/Zy9.USE_STD_BEAN_NAMING : Lcom/fasterxml/Zor/Zy9;
    //   738: new com/fasterxml/Zor/Zy9
    //   741: dup
    //   742: aload_0
    //   743: iconst_5
    //   744: aaload
    //   745: bipush #27
    //   747: iconst_0
    //   748: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   751: putstatic com/fasterxml/Zor/Zy9.ALLOW_EXPLICIT_PROPERTY_RENAMING : Lcom/fasterxml/Zor/Zy9;
    //   754: new com/fasterxml/Zor/Zy9
    //   757: dup
    //   758: aload_0
    //   759: bipush #15
    //   761: aaload
    //   762: bipush #28
    //   764: iconst_0
    //   765: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   768: putstatic com/fasterxml/Zor/Zy9.ALLOW_IS_GETTERS_FOR_NON_BOOLEAN : Lcom/fasterxml/Zor/Zy9;
    //   771: new com/fasterxml/Zor/Zy9
    //   774: dup
    //   775: aload_0
    //   776: iconst_4
    //   777: aaload
    //   778: bipush #29
    //   780: iconst_1
    //   781: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   784: putstatic com/fasterxml/Zor/Zy9.ALLOW_COERCION_OF_SCALARS : Lcom/fasterxml/Zor/Zy9;
    //   787: new com/fasterxml/Zor/Zy9
    //   790: dup
    //   791: aload_0
    //   792: bipush #12
    //   794: aaload
    //   795: bipush #30
    //   797: iconst_1
    //   798: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   801: putstatic com/fasterxml/Zor/Zy9.IGNORE_DUPLICATE_MODULE_REGISTRATIONS : Lcom/fasterxml/Zor/Zy9;
    //   804: new com/fasterxml/Zor/Zy9
    //   807: dup
    //   808: aload_0
    //   809: bipush #23
    //   811: aaload
    //   812: bipush #31
    //   814: iconst_1
    //   815: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   818: putstatic com/fasterxml/Zor/Zy9.IGNORE_MERGE_FOR_UNMERGEABLE : Lcom/fasterxml/Zor/Zy9;
    //   821: new com/fasterxml/Zor/Zy9
    //   824: dup
    //   825: aload_0
    //   826: iconst_1
    //   827: aaload
    //   828: bipush #32
    //   830: iconst_0
    //   831: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   834: putstatic com/fasterxml/Zor/Zy9.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES : Lcom/fasterxml/Zor/Zy9;
    //   837: new com/fasterxml/Zor/Zy9
    //   840: dup
    //   841: aload_0
    //   842: bipush #33
    //   844: aaload
    //   845: bipush #33
    //   847: iconst_1
    //   848: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   851: putstatic com/fasterxml/Zor/Zy9.APPLY_DEFAULT_VALUES : Lcom/fasterxml/Zor/Zy9;
    //   854: bipush #34
    //   856: anewarray com/fasterxml/Zor/Zy9
    //   859: dup
    //   860: iconst_0
    //   861: getstatic com/fasterxml/Zor/Zy9.USE_ANNOTATIONS : Lcom/fasterxml/Zor/Zy9;
    //   864: aastore
    //   865: dup
    //   866: iconst_1
    //   867: getstatic com/fasterxml/Zor/Zy9.USE_GETTERS_AS_SETTERS : Lcom/fasterxml/Zor/Zy9;
    //   870: aastore
    //   871: dup
    //   872: iconst_2
    //   873: getstatic com/fasterxml/Zor/Zy9.PROPAGATE_TRANSIENT_MARKER : Lcom/fasterxml/Zor/Zy9;
    //   876: aastore
    //   877: dup
    //   878: iconst_3
    //   879: getstatic com/fasterxml/Zor/Zy9.AUTO_DETECT_CREATORS : Lcom/fasterxml/Zor/Zy9;
    //   882: aastore
    //   883: dup
    //   884: iconst_4
    //   885: getstatic com/fasterxml/Zor/Zy9.AUTO_DETECT_FIELDS : Lcom/fasterxml/Zor/Zy9;
    //   888: aastore
    //   889: dup
    //   890: iconst_5
    //   891: getstatic com/fasterxml/Zor/Zy9.AUTO_DETECT_GETTERS : Lcom/fasterxml/Zor/Zy9;
    //   894: aastore
    //   895: dup
    //   896: bipush #6
    //   898: getstatic com/fasterxml/Zor/Zy9.AUTO_DETECT_IS_GETTERS : Lcom/fasterxml/Zor/Zy9;
    //   901: aastore
    //   902: dup
    //   903: bipush #7
    //   905: getstatic com/fasterxml/Zor/Zy9.AUTO_DETECT_SETTERS : Lcom/fasterxml/Zor/Zy9;
    //   908: aastore
    //   909: dup
    //   910: bipush #8
    //   912: getstatic com/fasterxml/Zor/Zy9.REQUIRE_SETTERS_FOR_GETTERS : Lcom/fasterxml/Zor/Zy9;
    //   915: aastore
    //   916: dup
    //   917: bipush #9
    //   919: getstatic com/fasterxml/Zor/Zy9.ALLOW_FINAL_FIELDS_AS_MUTATORS : Lcom/fasterxml/Zor/Zy9;
    //   922: aastore
    //   923: dup
    //   924: bipush #10
    //   926: getstatic com/fasterxml/Zor/Zy9.INFER_PROPERTY_MUTATORS : Lcom/fasterxml/Zor/Zy9;
    //   929: aastore
    //   930: dup
    //   931: bipush #11
    //   933: getstatic com/fasterxml/Zor/Zy9.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES : Lcom/fasterxml/Zor/Zy9;
    //   936: aastore
    //   937: dup
    //   938: bipush #12
    //   940: getstatic com/fasterxml/Zor/Zy9.ALLOW_VOID_VALUED_PROPERTIES : Lcom/fasterxml/Zor/Zy9;
    //   943: aastore
    //   944: dup
    //   945: bipush #13
    //   947: getstatic com/fasterxml/Zor/Zy9.CAN_OVERRIDE_ACCESS_MODIFIERS : Lcom/fasterxml/Zor/Zy9;
    //   950: aastore
    //   951: dup
    //   952: bipush #14
    //   954: getstatic com/fasterxml/Zor/Zy9.OVERRIDE_PUBLIC_ACCESS_MODIFIERS : Lcom/fasterxml/Zor/Zy9;
    //   957: aastore
    //   958: dup
    //   959: bipush #15
    //   961: getstatic com/fasterxml/Zor/Zy9.USE_STATIC_TYPING : Lcom/fasterxml/Zor/Zy9;
    //   964: aastore
    //   965: dup
    //   966: bipush #16
    //   968: getstatic com/fasterxml/Zor/Zy9.USE_BASE_TYPE_AS_DEFAULT_IMPL : Lcom/fasterxml/Zor/Zy9;
    //   971: aastore
    //   972: dup
    //   973: bipush #17
    //   975: getstatic com/fasterxml/Zor/Zy9.INFER_BUILDER_TYPE_BINDINGS : Lcom/fasterxml/Zor/Zy9;
    //   978: aastore
    //   979: dup
    //   980: bipush #18
    //   982: getstatic com/fasterxml/Zor/Zy9.REQUIRE_TYPE_ID_FOR_SUBTYPES : Lcom/fasterxml/Zor/Zy9;
    //   985: aastore
    //   986: dup
    //   987: bipush #19
    //   989: getstatic com/fasterxml/Zor/Zy9.DEFAULT_VIEW_INCLUSION : Lcom/fasterxml/Zor/Zy9;
    //   992: aastore
    //   993: dup
    //   994: bipush #20
    //   996: getstatic com/fasterxml/Zor/Zy9.SORT_PROPERTIES_ALPHABETICALLY : Lcom/fasterxml/Zor/Zy9;
    //   999: aastore
    //   1000: dup
    //   1001: bipush #21
    //   1003: getstatic com/fasterxml/Zor/Zy9.SORT_CREATOR_PROPERTIES_FIRST : Lcom/fasterxml/Zor/Zy9;
    //   1006: aastore
    //   1007: dup
    //   1008: bipush #22
    //   1010: getstatic com/fasterxml/Zor/Zy9.ACCEPT_CASE_INSENSITIVE_PROPERTIES : Lcom/fasterxml/Zor/Zy9;
    //   1013: aastore
    //   1014: dup
    //   1015: bipush #23
    //   1017: getstatic com/fasterxml/Zor/Zy9.ACCEPT_CASE_INSENSITIVE_ENUMS : Lcom/fasterxml/Zor/Zy9;
    //   1020: aastore
    //   1021: dup
    //   1022: bipush #24
    //   1024: getstatic com/fasterxml/Zor/Zy9.ACCEPT_CASE_INSENSITIVE_VALUES : Lcom/fasterxml/Zor/Zy9;
    //   1027: aastore
    //   1028: dup
    //   1029: bipush #25
    //   1031: getstatic com/fasterxml/Zor/Zy9.USE_WRAPPER_NAME_AS_PROPERTY_NAME : Lcom/fasterxml/Zor/Zy9;
    //   1034: aastore
    //   1035: dup
    //   1036: bipush #26
    //   1038: getstatic com/fasterxml/Zor/Zy9.USE_STD_BEAN_NAMING : Lcom/fasterxml/Zor/Zy9;
    //   1041: aastore
    //   1042: dup
    //   1043: bipush #27
    //   1045: getstatic com/fasterxml/Zor/Zy9.ALLOW_EXPLICIT_PROPERTY_RENAMING : Lcom/fasterxml/Zor/Zy9;
    //   1048: aastore
    //   1049: dup
    //   1050: bipush #28
    //   1052: getstatic com/fasterxml/Zor/Zy9.ALLOW_IS_GETTERS_FOR_NON_BOOLEAN : Lcom/fasterxml/Zor/Zy9;
    //   1055: aastore
    //   1056: dup
    //   1057: bipush #29
    //   1059: getstatic com/fasterxml/Zor/Zy9.ALLOW_COERCION_OF_SCALARS : Lcom/fasterxml/Zor/Zy9;
    //   1062: aastore
    //   1063: dup
    //   1064: bipush #30
    //   1066: getstatic com/fasterxml/Zor/Zy9.IGNORE_DUPLICATE_MODULE_REGISTRATIONS : Lcom/fasterxml/Zor/Zy9;
    //   1069: aastore
    //   1070: dup
    //   1071: bipush #31
    //   1073: getstatic com/fasterxml/Zor/Zy9.IGNORE_MERGE_FOR_UNMERGEABLE : Lcom/fasterxml/Zor/Zy9;
    //   1076: aastore
    //   1077: dup
    //   1078: bipush #32
    //   1080: getstatic com/fasterxml/Zor/Zy9.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES : Lcom/fasterxml/Zor/Zy9;
    //   1083: aastore
    //   1084: dup
    //   1085: bipush #33
    //   1087: getstatic com/fasterxml/Zor/Zy9.APPLY_DEFAULT_VALUES : Lcom/fasterxml/Zor/Zy9;
    //   1090: aastore
    //   1091: putstatic com/fasterxml/Zor/Zy9.Zg : [Lcom/fasterxml/Zor/Zy9;
    //   1094: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zy9.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */