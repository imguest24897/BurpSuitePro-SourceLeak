package burp;

public class Zgb5 implements Zzyl {
  private final Zs7f ZJ;
  
  private final Zvo6 Z_;
  
  private final Zmgn Zh;
  
  private final Zb0h Zr;
  
  private final Zrfb ZI;
  
  public Zgb5(Zvo6 paramZvo6, Zb0h paramZb0h, Zrfb paramZrfb) {
    this.Z_ = paramZvo6;
    this.Zh = paramZvo6.ZC();
    this.ZJ = new Zv8_(this.Zh);
    this.Zr = paramZb0h;
    this.ZI = paramZrfb;
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    Boolean bool = Z_(paramInt);
    return (bool != null) ? bool.booleanValue() : Zm(paramInt);
  }
  
  private Boolean Z_(int paramInt) {
    switch (paramInt) {
      case 400128:
        (new Zzf5(null, false)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 400384:
        (new Zzf5(null, true)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 401152:
        (new Zzfl(false)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 401408:
        (new Zzfl(true)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 400640:
        (new Zzft(null, false)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 400896:
        (new Zzft(null, true)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 401664:
        (new Zzfj(false)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 401920:
        (new Zzfj(true)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 403200:
        (new Zzfx(null, false)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 403456:
        (new Zzfx(null, true)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 403712:
        (new Zzf2(null, false)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 403968:
        (new Zzf2(null, true)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 402176:
        (new Zzfz(null, false)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 402432:
        (new Zzfz(null, true)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 402688:
        (new Zzf9(null, false)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 402944:
        (new Zzf9(null, true)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 394752:
        this.Zh.selectAll();
        return Boolean.valueOf(true);
      case 395008:
        this.Zh.ZC().Zt(this.ZJ.ZT());
        return Boolean.valueOf(true);
      case 399360:
        (new Zzfu()).Zp(null, this.Zh);
        return Boolean.valueOf(this.Zh.isEditable());
      case 399616:
        (new Zzf8()).Zp(null, this.Zh);
        return Boolean.valueOf(this.Zh.isEditable());
      case 399872:
        (new Zzfp()).Zp(null, this.Zh);
        return Boolean.valueOf(this.Zh.isEditable());
      case 394496:
        this.Zh.Z_();
        return Boolean.valueOf(this.Zh.isEditable());
      case 394240:
        this.Zh.Zr();
        return Boolean.valueOf(this.Zh.isEditable());
      case 396416:
        this.Zh.ZQ();
        return Boolean.valueOf(this.Zh.isEditable());
      case 393472:
        if (this.Zh.isEditable()) {
          Zsn1.ZM(this.ZJ, this.Zr);
          return Boolean.valueOf(true);
        } 
        return Boolean.valueOf(false);
      case 393728:
        Zsn1.ZY(this.ZJ, this.Zr);
        return Boolean.valueOf(true);
      case 393984:
        if (this.Zh.isEditable()) {
          Zsn1.Zw(this.ZJ, false, this.Zr);
          return Boolean.valueOf(true);
        } 
        return Boolean.valueOf(false);
    } 
    return null;
  }
  
  private boolean Zm(int paramInt) {
    // Byte code:
    //   0: invokestatic ZtD : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZJ : Lburp/Zs7f;
    //   8: invokeinterface ZT : ()Ljava/lang/String;
    //   13: astore_3
    //   14: iload_1
    //   15: lookupswitch default -> 432, 395520 -> 160, 395776 -> 176, 396032 -> 192, 396288 -> 208, 396544 -> 224, 396800 -> 240, 397056 -> 256, 397312 -> 272, 397568 -> 288, 397824 -> 304, 397904 -> 336, 398080 -> 320, 398160 -> 352, 398336 -> 368, 398592 -> 384, 398848 -> 400, 399104 -> 416
    //   160: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_CONVERT_SELECTION : Lburp/Zrrh;
    //   163: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   166: aload_3
    //   167: invokestatic ZL : (Ljava/lang/String;)Ljava/lang/String;
    //   170: astore #4
    //   172: aload_2
    //   173: ifnonnull -> 434
    //   176: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_CONVERT_SELECTION : Lburp/Zrrh;
    //   179: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   182: aload_3
    //   183: invokestatic Zd : (Ljava/lang/String;)Ljava/lang/String;
    //   186: astore #4
    //   188: aload_2
    //   189: ifnonnull -> 434
    //   192: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_CONVERT_SELECTION : Lburp/Zrrh;
    //   195: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   198: aload_3
    //   199: invokestatic Zh : (Ljava/lang/String;)Ljava/lang/String;
    //   202: astore #4
    //   204: aload_2
    //   205: ifnonnull -> 434
    //   208: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_CONVERT_SELECTION : Lburp/Zrrh;
    //   211: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   214: aload_3
    //   215: invokestatic ZI : (Ljava/lang/String;)Ljava/lang/String;
    //   218: astore #4
    //   220: aload_2
    //   221: ifnonnull -> 434
    //   224: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_CONVERT_SELECTION : Lburp/Zrrh;
    //   227: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   230: aload_3
    //   231: invokestatic ZB : (Ljava/lang/String;)Ljava/lang/String;
    //   234: astore #4
    //   236: aload_2
    //   237: ifnonnull -> 434
    //   240: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_CONVERT_SELECTION : Lburp/Zrrh;
    //   243: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   246: aload_3
    //   247: invokestatic ZV : (Ljava/lang/String;)Ljava/lang/String;
    //   250: astore #4
    //   252: aload_2
    //   253: ifnonnull -> 434
    //   256: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_CONVERT_SELECTION : Lburp/Zrrh;
    //   259: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   262: aload_3
    //   263: invokestatic ZY : (Ljava/lang/String;)Ljava/lang/String;
    //   266: astore #4
    //   268: aload_2
    //   269: ifnonnull -> 434
    //   272: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_CONVERT_SELECTION : Lburp/Zrrh;
    //   275: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   278: aload_3
    //   279: invokestatic Zb : (Ljava/lang/String;)Ljava/lang/String;
    //   282: astore #4
    //   284: aload_2
    //   285: ifnonnull -> 434
    //   288: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_CONVERT_SELECTION : Lburp/Zrrh;
    //   291: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   294: aload_3
    //   295: invokestatic Zo : (Ljava/lang/String;)Ljava/lang/String;
    //   298: astore #4
    //   300: aload_2
    //   301: ifnonnull -> 434
    //   304: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_CONVERT_SELECTION : Lburp/Zrrh;
    //   307: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   310: aload_3
    //   311: invokestatic Zt : (Ljava/lang/String;)Ljava/lang/String;
    //   314: astore #4
    //   316: aload_2
    //   317: ifnonnull -> 434
    //   320: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_CONVERT_SELECTION : Lburp/Zrrh;
    //   323: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   326: aload_3
    //   327: invokestatic Zq : (Ljava/lang/String;)Ljava/lang/String;
    //   330: astore #4
    //   332: aload_2
    //   333: ifnonnull -> 434
    //   336: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_CONVERT_SELECTION : Lburp/Zrrh;
    //   339: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   342: aload_3
    //   343: invokestatic Zu : (Ljava/lang/String;)Ljava/lang/String;
    //   346: astore #4
    //   348: aload_2
    //   349: ifnonnull -> 434
    //   352: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_CONVERT_SELECTION : Lburp/Zrrh;
    //   355: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   358: aload_3
    //   359: invokestatic ZO : (Ljava/lang/String;)Ljava/lang/String;
    //   362: astore #4
    //   364: aload_2
    //   365: ifnonnull -> 434
    //   368: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_CONVERT_SELECTION : Lburp/Zrrh;
    //   371: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   374: aload_3
    //   375: invokestatic ZF : (Ljava/lang/String;)Ljava/lang/String;
    //   378: astore #4
    //   380: aload_2
    //   381: ifnonnull -> 434
    //   384: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_CONVERT_SELECTION : Lburp/Zrrh;
    //   387: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   390: aload_3
    //   391: invokestatic ZS : (Ljava/lang/String;)Ljava/lang/String;
    //   394: astore #4
    //   396: aload_2
    //   397: ifnonnull -> 434
    //   400: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_CONVERT_SELECTION : Lburp/Zrrh;
    //   403: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   406: aload_3
    //   407: invokestatic ZX : (Ljava/lang/String;)Ljava/lang/String;
    //   410: astore #4
    //   412: aload_2
    //   413: ifnonnull -> 434
    //   416: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_CONVERT_SELECTION : Lburp/Zrrh;
    //   419: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   422: aload_3
    //   423: invokestatic ZA : (Ljava/lang/String;)Ljava/lang/String;
    //   426: astore #4
    //   428: aload_2
    //   429: ifnonnull -> 434
    //   432: iconst_0
    //   433: ireturn
    //   434: aload_0
    //   435: aload_3
    //   436: aload #4
    //   438: invokevirtual ZC : (Ljava/lang/String;Ljava/lang/String;)V
    //   441: goto -> 454
    //   444: astore #5
    //   446: aload #5
    //   448: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   451: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   454: iconst_1
    //   455: ireturn
    // Exception table:
    //   from	to	target	type
    //   14	433	444	java/lang/Exception
    //   434	441	444	java/lang/Exception
  }
  
  private void ZC(String paramString1, String paramString2) {
    Zbqc[] arrayOfZbqc = Zl5i.ZtD();
    if (Zsw8.ZP(paramString2))
      return; 
    if (this.Zh.isEditable()) {
      if (paramString2 != paramString1) {
        int i = this.Zh.getSelectionStart();
        this.ZJ.Zl(paramString2);
        this.Z_.ZW(i, i + paramString2.length());
        if (arrayOfZbqc == null) {
          this.ZI.ZX(paramString2);
          return;
        } 
      } 
      return;
    } 
    this.ZI.ZX(paramString2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgb5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */