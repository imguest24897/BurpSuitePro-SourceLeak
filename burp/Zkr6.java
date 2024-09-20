package burp;

import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import net.portswigger.Zah;
import net.portswigger.Zdo;
import net.portswigger.Zk_;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zkr6 extends Zkro implements Zgwj, Zgdq, Zmov, Zedo {
  private final Zbiv ZN;
  
  private final Zmo9 ZA;
  
  private final Zzuc ZH;
  
  private final Zrop ZC;
  
  private final Zrn1 Zr;
  
  private final Zgrs ZP;
  
  private final Zlli<Zt1s> ZK;
  
  private final Supplier<Zl4w> Zp;
  
  private final Zew2 Ze;
  
  private final Zr_4 ZT;
  
  private final Zsw5 ZZ;
  
  private final Zbc9 ZL;
  
  private final Zxg0 Za;
  
  private final Zxa ZS;
  
  private final Zbb9 ZR;
  
  private final Zbbq Zy;
  
  private final Zbb2 ZB;
  
  private final Zbbh Zd;
  
  private final Zllh Zm;
  
  private Zr00 ZU;
  
  private Zzkl Zv;
  
  private int Zg;
  
  private boolean Zs;
  
  private Zbyn Zk;
  
  private String ZM;
  
  private Zlte Zx;
  
  private Ztal Zi = Ztal.WRAPPED;
  
  private Zbcd ZG;
  
  private static String[] ZE;
  
  private static final String[] a;
  
  private static final String[] c;
  
  public Zkr6(Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Zgbj paramZgbj, Zgb6 paramZgb6, Zxgc paramZxgc, Zskh paramZskh, Zgzy paramZgzy, Zkl6 paramZkl6, Ztwv paramZtwv, Zr_4 paramZr_41, Zr_4 paramZr_42, Zbiv paramZbiv, Zew2 paramZew2, Zlcb paramZlcb, Zsw5 paramZsw5, Zkve paramZkve, Zb_j paramZb_j, Zlli<Zt1s> paramZlli, Zr34 paramZr34, Supplier<Zl4w> paramSupplier, Zxa paramZxa, Zllh paramZllh, Zm6x paramZm6x) {
    this(paramZz0n, paramZt4u, paramZerg, paramZgbj, paramZgb6, paramZxgc, paramZskh, paramZgzy, paramZkl6, paramZtwv, paramZr_41, paramZr_42, paramZbiv, new Zesj(paramZt4u), paramZew2, paramZlcb, paramZsw5, paramZkve, paramZb_j, paramZlli, paramZr34, paramSupplier, paramZxa, paramZllh, paramZm6x);
  }
  
  Zkr6(Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Zgbj paramZgbj, Zgb6 paramZgb6, Zxgc paramZxgc, Zskh paramZskh, Zgzy paramZgzy, Zkl6 paramZkl6, Ztwv paramZtwv, Zr_4 paramZr_41, Zr_4 paramZr_42, Zbiv paramZbiv, Zmo9 paramZmo9, Zew2 paramZew2, Zlcb paramZlcb, Zsw5 paramZsw5, Zkve paramZkve, Zb_j paramZb_j, Zlli<Zt1s> paramZlli, Zr34 paramZr34, Supplier<Zl4w> paramSupplier, Zxa paramZxa, Zllh paramZllh, Zm6x paramZm6x) {
    super(paramZz0n, paramZt4u, paramZerg, paramZgbj, paramZgb6, paramZxgc, paramZskh, paramZgzy, paramZkl6, Zeew.INTRUDER, paramZtwv, paramZr_41, paramZlcb, paramZm6x);
    String[] arrayOfString = Zfn();
    this.ZN = paramZbiv;
    this.ZA = paramZmo9;
    this.Ze = paramZew2;
    this.ZT = paramZr_42;
    this.ZZ = paramZsw5;
    this.ZK = paramZlli;
    this.Zp = paramSupplier;
    this.ZS = paramZxa;
    this.Zm = paramZllh;
    this.ZL = new Zbc9();
    this.Za = new Zxg0(Zeew.INTRUDER, paramZb_j);
    Zxox zxox = new Zxox();
    try {
      this.ZH = new Zzuc(new Zrnx(zxox), this);
      this.Zr = new Zrn1(new Zx8f(zxox), this);
      this.ZC = new Zrop(paramZkve, this);
      this.ZP = new Zgrs(new Zrac(zxox, this.ZW), this);
      this.ZR = new Zbb9(this.ZH);
      this.Zy = new Zbbq(this.Zr);
      this.ZB = new Zbb2(this.ZC);
      this.Zd = new Zbbh(this.ZP);
      paramZr34.ZM(Zs70.INTRUDER_PATH, Zg29.USER, this.ZR);
      paramZr34.ZM(Zs70.INTRUDER_PATH, Zg29.USER, this.Zy);
      paramZr34.ZM(Zs70.INTRUDER_PATH, Zg29.USER, this.ZB);
      paramZr34.ZT(Zs70.INTRUDER_PATH, Zg29.USER, this.Zd);
      if (arrayOfString != null)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public void ZYE() {
    this.ZU = new Ze3e(this, this.ZT);
  }
  
  public Ztql ZYS() {
    return this.ZU;
  }
  
  public void ZYq() {
    Zg59 zg59 = new Zg59(this.Zz, this.ZQ, this.ZS, this.Zm);
    this.Zb.ZC().ZX(zg59::lambda$initialiseUI$0);
    this.Z_ = new Zm0o[] { new Zmu(this.ZL) };
    this.Zv = new Zzkl(this, this.Zn, this.Zp, this.ZH, this.Zr, this.ZB, this.Zd);
    this.ZV = this.Zv.Zt();
  }
  
  public void ZYO() {}
  
  public void ZYA() {
    try {
      this.Zs = true;
      ZfS();
      if (!this.Za.Zz()) {
        this.ZG = new Zbcd(a(15312, 502), Zgzq.INTRUDER_EMPTY_PANEL_LEFT_SIDE_ICON, Zgzq.INTRUDER_EMPTY_PANEL_RIGHT_SIDE_ICON, a(15323, 17264), a(15297, 24641), Zlar.INTRUDER_LEARN_MORE_INFO, new Zs6s(this));
        this.ZL.add(this.ZG);
        this.ZL.ZP(this.ZG);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  private void ZfS() {
    this.Zx = Zrxv.Zp().Zh().ZP().ZQ().ZX().Zs().ZA().ZV().ZI().ZO(this).ZG().ZH(new Zka0()).Ze(new Zztd(this)).ZW();
    this.Zx.Z_();
    this.Zx.ZQ();
    this.Zx.setName(a(15320, 29442));
    this.Zx.add(this.ZM, this.Zk);
    this.Zk = null;
    this.ZK.ZE(Zt1s.ZX, this::lambda$initialiseIntruderTabbedPane$1);
    this.ZK.ZE(Zt1s.Zr, this::lambda$initialiseIntruderTabbedPane$1);
    String[] arrayOfString = Zfn();
    try {
      this.ZL.ZU(this.Zx);
      this.Zx.Zr(this.Zi);
      if (this.Zi == Ztal.WRAPPED) {
        try {
          Zm2.ZC(Zrrh.INTRUDER_UI_WRAPPED_TAB_LAYOUT_SELECTED);
          if (arrayOfString != null) {
            try {
              if (this.Zi == Ztal.SCROLLING)
                Zm2.ZC(Zrrh.INTRUDER_UI_SCROLLING_TAB_LAYOUT_SELECTED); 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
            return;
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (this.Zi == Ztal.SCROLLING)
        Zm2.ZC(Zrrh.INTRUDER_UI_SCROLLING_TAB_LAYOUT_SELECTED); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  private void Zfj() {
    String[] arrayOfString = Zfn();
    byte b = 0;
    while (b < this.Zx.getTabCount()) {
      Component component = this.Zx.getComponentAt(b);
      try {
        if (component instanceof Zbyn)
          ((Zbyn)component).ZS(); 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      b++;
      if (arrayOfString != null)
        break; 
    } 
  }
  
  public Zbyn Zff() {
    Zxcm zxcm = new Zxcm(null, this.ZQ);
    Zbyn zbyn = this.ZZ.Zf(zxcm, false);
    Zb(zbyn);
    this.Zx.addTab(Integer.toString(++this.Zg), zbyn);
    this.Zx.setSelectedComponent(zbyn);
    this.ZL.Zz(this.Zx);
    return zbyn;
  }
  
  private void Zb(Zbyn paramZbyn) {
    // Byte code:
    //   0: invokestatic Zfn : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: invokevirtual Zfs : ()Lburp/Zbyn;
    //   8: astore_3
    //   9: aload_3
    //   10: ifnonnull -> 28
    //   13: aload_1
    //   14: invokevirtual ZNH : ()V
    //   17: aload_2
    //   18: ifnull -> 52
    //   21: goto -> 28
    //   24: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   27: athrow
    //   28: aload_3
    //   29: invokevirtual ZX : ()Lburp/Zsh8;
    //   32: astore #4
    //   34: aload #4
    //   36: ifnull -> 52
    //   39: aload_1
    //   40: aload #4
    //   42: invokevirtual Zb : (Lburp/Zsh8;)V
    //   45: goto -> 52
    //   48: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   51: athrow
    //   52: return
    // Exception table:
    //   from	to	target	type
    //   9	21	24	java/lang/IllegalStateException
    //   34	45	48	java/lang/IllegalStateException
  }
  
  private Zbyn Zfs() {
    try {
      List<Zzgv> list;
      switch (Zged.Zn[this.Zr.ZJ().ordinal()]) {
        case 1:
          Zm2.ZC(Zrrh.INTRUDER_UI_NEW_TAB_COPY);
          return ((Zzgv)ZfN().get(0)).Zl;
        case 2:
          Zm2.ZC(Zrrh.INTRUDER_UI_NEW_TAB_COPY);
          list = ZfN();
          return ((Zzgv)list.get(list.size() - 1)).Zl;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return null;
  }
  
  public void ZP(Zbyn paramZbyn, boolean paramBoolean, Component paramComponent) {
    // Byte code:
    //   0: getstatic burp/Zrrh.INTRUDER_UI_SAVE_ATTACK_CONFIG : Lburp/Zrrh;
    //   3: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   6: aload_0
    //   7: getfield Zl : Lburp/Ztwv;
    //   10: aload_0
    //   11: aload_1
    //   12: iload_2
    //   13: aload_3
    //   14: <illegal opcode> run : (Lburp/Zkr6;Lburp/Zbyn;ZLjava/awt/Component;)Ljava/lang/Runnable;
    //   19: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   24: pop
    //   25: return
  }
  
  private void ZC(Zbyn paramZbyn, boolean paramBoolean, Component paramComponent) {
    File file = Zs6n.Zp(Zg1m.CONFIG, this.ZJ, paramComponent, 1, a(15318, -10364));
    try {
      if (file == null)
        return; 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
      try {
        ZipEntry zipEntry = new ZipEntry(Zou.SAVE_ATTACK_CONFIGURATION_ZIP_ENTRY_NAME.key);
        zipOutputStream.putNextEntry(zipEntry);
        Zxpa zxpa = new Zxpa(zipOutputStream);
        zxpa.Zb(Zou.ATTACK_CONFIGURATION_VERSION.key, 0);
        Zxw4 zxw4 = paramZbyn.ZW();
        try {
          if (zxw4 == null)
            throw new IllegalStateException(a(15298, 25229)); 
        } catch (Throwable throwable) {
          throw a(null);
        } 
        try {
          if (!paramBoolean)
            Zn(zxw4.ZF, (Zstu)null); 
        } catch (Throwable throwable) {
          throw a(null);
        } 
        zxpa.ZX(Zou.ATTACK_CONFIGURATION_FOR_USER_INTERFACE.key, zxw4);
        zipOutputStream.close();
      } catch (Throwable throwable) {
        try {
          zipOutputStream.close();
        } catch (Throwable throwable1) {
          throwable.addSuppressed(throwable1);
        } 
        throw throwable;
      } 
    } catch (FileNotFoundException fileNotFoundException) {
      Zah.Zl(fileNotFoundException, Zk_.USER_ERROR);
      Zmgc.ERROR_FILE_NOT_FOUND.ZV(this.ZW, new Object[] { file.getAbsolutePath() });
    } catch (Exception exception) {
      Zah.ZU(exception, a(15314, -1196), Zk_.UNEXPECTED);
      Zmgc.CONFIG_SAVE_ERROR.ZV(this.ZW, new Object[0]);
    } 
    Zx6o.Zf(paramComponent, a(15321, 12478), a(15325, -1603));
  }
  
  private void Zn(Zsh8 paramZsh8, Zstu paramZstu) {
    paramZsh8.Zn(paramZstu);
    Zstu zstu = paramZsh8.ZPE().ZwZ();
    if (zstu != null) {
      byte[] arrayOfByte = Zz96.ZA(zstu.ZiD());
      paramZsh8.ZPE().ZN(this.ZT.ZZ(arrayOfByte));
    } 
  }
  
  public void ZG_(boolean paramBoolean) {
    // Byte code:
    //   0: getstatic burp/Zrrh.INTRUDER_UI_LOAD_ATTACK_CONFIG : Lburp/Zrrh;
    //   3: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   6: aload_0
    //   7: invokevirtual Zf3 : ()Lburp/Zbyn;
    //   10: astore_2
    //   11: aload_0
    //   12: getfield Zl : Lburp/Ztwv;
    //   15: aload_0
    //   16: iload_1
    //   17: aload_2
    //   18: <illegal opcode> run : (Lburp/Zkr6;ZLburp/Zbyn;)Ljava/lang/Runnable;
    //   23: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   28: pop
    //   29: return
  }
  
  private void Z_(boolean paramBoolean, Zbyn paramZbyn) {
    File file = this.ZA.ZW(this.Zn.Zg(this));
    try {
      if (file == null)
        return; 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
      try {
        zipInputStream.getNextEntry();
        Zxyn zxyn = new Zxyn(zipInputStream, Zou.LOAD_ATTACK_CONFIGURATION_ELEMENT_NAME.key, this.ZT);
        zxyn.ZM(Zou.ATTACK_CONFIGURATION_VERSION.key);
        Zxw4 zxw4 = Zlce.Zj(zxyn, this.ZQ, this.ZT);
        try {
          if (!paramBoolean)
            Zn(zxw4.ZF, (Zstu)null); 
        } catch (Throwable throwable) {
          throw a(null);
        } 
        paramZbyn.Zo(zxw4);
        String str = a(15326, -24498);
        try {
          if (paramBoolean && zxw4.ZF.ZPJ() == null)
            str = str + str; 
        } catch (Throwable throwable) {
          throw a(null);
        } 
        this.ZL.Zz(this.Zx);
        this.ZA.Zy(a(15317, 8044), str, this.Zn.Zg(this));
        zipInputStream.close();
      } catch (Throwable throwable) {
        try {
          zipInputStream.close();
        } catch (Throwable throwable1) {
          throwable.addSuppressed(throwable1);
        } 
        throw throwable;
      } 
    } catch (Exception exception) {
      Zah.ZU(exception, a(15319, -17081), Zk_.UNEXPECTED);
      String str1 = "";
      String str2 = Zxjf.Zi(exception);
      if (str2 != null)
        str1 = str1 + str1 + a(15327, -2163); 
      Zmgc.ERROR_LOADING_CONFIG.ZV(this.ZW, new Object[] { str1 });
    } 
  }
  
  public void Za(Zbyn paramZbyn, boolean paramBoolean) {
    Zm2.ZC(Zrrh.INTRUDER_UI_COPY_ATTACK_CONFIG);
    Zbyn zbyn = Zf3();
    try {
      if (zbyn == null)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Zsh8 zsh8 = zbyn.ZX();
    try {
      if (zsh8 == null)
        throw new IllegalStateException(a(15322, -27994)); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    if (paramZbyn == null)
      paramZbyn = Zff(); 
    try {
      if (!paramBoolean)
        Zn(zsh8, this.Zz.ZZ(Zdo.ZQ)); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    paramZbyn.Zb(zsh8);
  }
  
  public Zbyn Zf3() {
    try {
      if (this.Zx == null)
        return null; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Component component = this.Zx.getSelectedComponent();
    try {
      if (!(component instanceof Zbyn))
        return null; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (Zbyn)component;
  }
  
  public List<Zzgv> ZfN() {
    ArrayList<Zzgv> arrayList = new ArrayList();
    byte b = 0;
    String[] arrayOfString = Zfn();
    while (b < this.Zx.getTabCount()) {
      Component component = this.Zx.getComponentAt(b);
      if (component instanceof Zbyn) {
        String str = this.Zx.getTitleAt(b);
        try {
        
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        boolean bool = (b == this.Zx.getSelectedIndex()) ? true : false;
        Zzgv zzgv = new Zzgv((Zbyn)component, str, bool);
        arrayList.add(zzgv);
      } 
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return arrayList;
  }
  
  public boolean ZfW() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool = (this.ZH.ZX() == Zlw6.APPEND) ? true : false;
    try {
      if (bool)
        Zm2.ZC(Zrrh.INTRUDER_UI_AUTO_PAYLOAD_POSITIONS_APPEND); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return bool;
  }
  
  public void Zfc() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Zf3 : ()Lburp/Zbyn;
    //   4: astore_1
    //   5: aload_1
    //   6: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   9: pop
    //   10: aload_1
    //   11: invokevirtual Zf : ()Lburp/Zxw4;
    //   14: astore_2
    //   15: aload_0
    //   16: getfield Zl : Lburp/Ztwv;
    //   19: aload_0
    //   20: aload_2
    //   21: aload_1
    //   22: <illegal opcode> run : (Lburp/Zkr6;Lburp/Zxw4;Lburp/Zbyn;)Ljava/lang/Runnable;
    //   27: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   32: pop
    //   33: return
  }
  
  public Zlvv Zfw() {
    Zm2.Zo(Zze0.INTRUDER_UI_OPEN_SAVED_ATTACK);
    return Zxjf.<Zlvv>ZQ(this::ZfG);
  }
  
  private Zlvv ZfG() {
    File file = this.ZA.ZY(this.Zn.Zg(this));
    try {
      if (file == null)
        return null; 
    } catch (Ze27 ze27) {
      throw a(null);
    } 
    try {
      FileInputStream fileInputStream = new FileInputStream(file);
      ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
      zipInputStream.getNextEntry();
      Zxyn zxyn = new Zxyn(zipInputStream, "", this.Zz);
      zxyn.ZM(a(15313, -26338));
      return this.Ze.Zm(zxyn);
    } catch (Ze27|java.io.IOException ze27) {
      Zah.ZU(ze27, a(15316, 15285), Zk_.UNEXPECTED);
      Zmgc.ATTACK_LOAD_FAILED.ZV(this.ZW, new Object[] { Zxjf.Zi(ze27) });
      return null;
    } 
  }
  
  public void Zf1() {
    Zbyn zbyn = Zf3();
    if (zbyn != null)
      try {
        Zm3l zm3l = zbyn.Zr();
        Zyf zyf = Zyf.Zy(Zz96.ZA(zm3l.ZY.ZiD()));
        this.Zb.Zm().Ze(zm3l.ZI(), zyf, null, null);
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      }  
  }
  
  public void Zf4() {
    Zbyn zbyn = Zf3();
    if (zbyn != null)
      try {
        Zm3l zm3l = zbyn.Zr();
        Zstu zstu1 = ZQ(zm3l.ZY);
        Zstu zstu2 = ZG(zm3l.ZI.ZwZ());
        Zxpp zxpp = this.ZT.<Zxpp>ZH(new Zz1t(zstu2, true));
        this.Zb.Zg().Zr(zxpp, zstu1, null, null);
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      }  
  }
  
  private Zstu ZQ(Zstu paramZstu) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (paramZstu == null) ? null : this.ZT.ZZ(paramZstu.ZiD());
  }
  
  private Zstu ZG(Zstu paramZstu) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (paramZstu == null) ? null : this.ZT.ZZ(Zz96.ZA(paramZstu.ZiD()));
  }
  
  public void ZfF() {
    Zbyn zbyn = Zf3();
    if (zbyn != null)
      try {
        Zm2.Zo(Zze0.INTRUDER_UI_ACTIVELY_SCAN_DEFINED_INSERTION_POINTS);
        Zzyj zzyj = Ze(zbyn);
        this.ZN.Zm(zbyn, zzyj.Zv, zzyj.ZO);
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      }  
  }
  
  public void Zk(Ztj1 paramZtj1) {
    String[] arrayOfString = Zfn();
    Zbyn zbyn = Zf3();
    if (zbyn != null)
      try {
        Zm2.Zo(Zze0.INTRUDER_UI_ACTIVELY_SCAN_DEFINED_INSERTION_POINTS);
        Zzyj zzyj = Ze(zbyn);
        Zrbm zrbm = paramZtj1.Zi();
        if (zrbm instanceof Zriy) {
          Zriy zriy = (Zriy)zrbm;
          if (arrayOfString != null) {
            Zuh.Zb(false, Zqf.Zr);
            return;
          } 
          zriy.Zy(zzyj.Zv, zzyj.ZO);
          return;
        } 
        Zuh.Zb(false, Zqf.Zr);
        return;
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      }  
  }
  
  public void Zfd() {
    Zbyn zbyn = Zf3();
    try {
      if (zbyn == null)
        return; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      Zm2.Zo(Zze0.INTRUDER_UI_DO_PASSIVE_SCAN);
      Zzyj zzyj = Ze(zbyn);
      this.ZN.Zv().Zz(zzyj.Zv, zzyj.ZO);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public void ZfL() {
    Zbyn zbyn = Zf3();
    try {
      if (zbyn == null)
        return; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      Zm2.Zo(Zze0.INTRUDER_UI_DO_ACTIVE_SCAN);
      Zzyj zzyj = Ze(zbyn);
      this.ZN.Zv().ZD(zzyj.Zv, zzyj.ZO);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private Zzyj Ze(Zbyn paramZbyn) {
    Zm3l zm3l = paramZbyn.Zr();
    ArrayList<int[]> arrayList = new ArrayList();
    byte[] arrayOfByte = Zrq1.ZD(zm3l.ZY.ZiD(), (List<int[]>)arrayList);
    Zgxp zgxp = this.Zz.<Zgxp>ZH(new Zeq6(zm3l.ZI()));
    zgxp.Zk(this.Zz.ZZ(arrayOfByte));
    return new Zzyj(zgxp, (List<int[]>)arrayList);
  }
  
  public void Zt2() {
    try {
      if (this.Zv != null)
        this.Zv.Zt2(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.ZR.Zt2();
    this.Zy.Zt2();
    this.ZB.Zt2();
    this.Zd.Zt2();
  }
  
  void Z_(Zxpp paramZxpp, Zstu paramZstu1, List<int[]> paramList, Zstu paramZstu2, String paramString, boolean paramBoolean) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Zxcm zxcm = new Zxcm((paramZstu2 == null) ? null : paramZstu2.ZiD(), this.ZQ);
    Zbyn zbyn = this.ZZ.Zf(zxcm, false);
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    String str = (paramString == null) ? Integer.toString(++this.Zg) : paramString;
    Zb(zbyn);
    zbyn.ZJ(paramZxpp, paramZstu1, paramList);
    this.Zx.addTab(str, zbyn);
    this.Zx.setSelectedComponent(zbyn);
    this.ZL.Zz(this.Zx);
    ZD(this.Zx.indexOfComponent(zbyn), paramBoolean, true, true);
  }
  
  public void ZK(Zlte paramZlte, Component paramComponent, Consumer<Zmkb> paramConsumer) {
    paramConsumer.accept(ZQ());
  }
  
  public Zmkb ZQ() {
    String str = Integer.toString(++this.Zg);
    Zxcm zxcm = new Zxcm(null, this.ZQ);
    Zbyn zbyn = this.ZZ.Zf(zxcm, true);
    Zb(zbyn);
    Zm2.Zo(Zze0.INTRUDER_UI_TAB_ADDED);
    return new Zmkb(str, zbyn);
  }
  
  public void ZP(Zb_j paramZb_j) {
    Zbyn zbyn = Zf3();
    try {
      if (zbyn != null)
        zbyn.ZP(paramZb_j); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.ZH.ZP(paramZb_j);
    this.Zr.ZP(paramZb_j);
    this.ZC.ZP(paramZb_j);
    this.ZP.ZP(paramZb_j);
  }
  
  public void Zs(Zb_j paramZb_j) {
    ZfR();
    this.Zk.Zs(paramZb_j);
    this.ZH.Zs(paramZb_j);
    this.Zr.Zs(paramZb_j);
    this.ZC.Zs(paramZb_j);
    this.ZP.Zs(paramZb_j);
  }
  
  public void ZNH() {
    try {
      if (this.Zs)
        this.Zx.removeAll(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      this.Zg = 0;
      ZfR();
      this.Zk.ZNH();
      if (this.Zs)
        try {
          this.Zx.addTab(this.ZM, this.Zk);
          if (!this.Za.Zz())
            this.ZL.ZP(this.ZG); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.ZH.ZNH();
    this.Zr.ZNH();
    this.ZC.ZNH();
    this.ZP.ZNH();
  }
  
  private void ZfR() {
    Zxcm zxcm = new Zxcm(null, this.ZQ);
    this.Zk = this.ZZ.Zf(zxcm, true);
    int i = ++this.Zg;
    this.ZM = Integer.toString(i);
  }
  
  public void Zd(Zmf_ paramZmf_) {
    String str = paramZmf_.Zm(a(15324, 28343), this.Zi.configString);
    Ztal ztal = Ztal.Zc(str);
    try {
      if (ztal != null)
        try {
          if (ztal != this.Zi)
            try {
              this.Zi = ztal;
              if (this.Zx != null)
                this.Zx.Zr(this.Zi); 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public void Zl(Zg4j paramZg4j) {
    paramZg4j.Za(a(15296, -845), this.Zi.configString);
  }
  
  private void lambda$startAttackCommand$6(Zxw4 paramZxw4, Zbyn paramZbyn) {
    Zlvv zlvv = this.Ze.ZT(paramZxw4);
    try {
      if (zlvv != null) {
        try {
        
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        Zm2.Zo(paramZbyn.ZM() ? Zze0.INTRUDER_UI_MANUALLY_CONFIGURED_ATTACK_STARTED : Zze0.INTRUDER_UI_ATTACK_STARTED);
        zlvv.Zw();
        Zxjf.Zc(paramZbyn::lambda$startAttackCommand$5);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  private static void lambda$startAttackCommand$5(Zbyn paramZbyn) {
    Zluj.ZF(paramZbyn);
  }
  
  private void lambda$loadAttackConfigurationFromFileAsync$4(boolean paramBoolean, Zbyn paramZbyn) {
    Z_(paramBoolean, paramZbyn);
  }
  
  private void lambda$saveAttackConfigurationToFileAsync$3(Zbyn paramZbyn, boolean paramBoolean, Component paramComponent) {
    ZC(paramZbyn, paramBoolean, paramComponent);
  }
  
  private void lambda$initialiseIntruderTabbedPane$1(Zxr8 paramZxr8) {
    Zfj();
  }
  
  private static Zgte lambda$initialiseUI$0(Zg59 paramZg59) {
    return paramZg59;
  }
  
  public static void ZW(String[] paramArrayOfString) {
    ZE = paramArrayOfString;
  }
  
  public static String[] Zfn() {
    return ZE;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic ZW : ([Ljava/lang/String;)V
    //   13: ldc '´D¦ñË]ÉzXî#ªÑiON\\r[×ÑÀöZÛÉÇeÅ\\fLý1nÀwãÚ§\\fTUó£uåôJÞ®ÃÆö,lþêRÿ¾#ó¬?%ÁäU®Üµç 8ôÖÊWæH¿ÉµSÊ.\\\bñP_÷À&ÍÎÚR)º:\\rL*Æ_àöÕº9F\\ré©è©öbn}ïÀ´*Í7PÛ\\fJ­¦Ïå^Úä.^¹>ÖohÁ°³¸ähÐ¯ÞÍÆì ×~ó¥$gzÂ{(»Çc_E<ìÏÁ)Æ\\rL\-`°|'­ümB%7$+³2Ý1kVB»÷ãæ\\nÍ0À #Íó·TÜ­%{Ñè¯/%Öýe9SàÃÂ.'©Àøup¡zú\\bÏ¹@ÑpäFì$j!Ewò¤fÊ:Û(«yÍ|='Kõ£ÂA¥ÊÛý®£!L¨aÆåaæÉÏ[U?BÔW±[õtã@-KßQ"ëm~6Ð¼N²b{°¹\\tFþI¸ú|ßà²i$ý(¬]ô~¬ÓbBQN!KK¹\\rÉÍ4¡Ñ{ÙÑÆØ·¿#ë'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #65
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #22
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 148
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc 'òû/5Atv\\t¨'*Â¼I¯¤CÔÇ­°Ö_ÀÞ·dõCÆßêÙÝr\\nEÏ\\f×¿?ùáìeõ{¾B»óäÊÒI\\npaQ½÷P¤½Â?Ã4hjù+Âãèz:qÙ{ÕÔg\\f\\téªü!=ZßòÐø}5vúÕà};ÎÚs4!Òc|%½Ý(\\b2ô\\tÈÉù+¾nÃçËæ7yÁxÔQ¨«ì¥í2uwÆ\\bh3·7ã'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: sipush #134
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #97
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 148
    //   104: aload #5
    //   106: swap
    //   107: iload_3
    //   108: iinc #3, 1
    //   111: swap
    //   112: aastore
    //   113: iload_0
    //   114: iload_1
    //   115: iadd
    //   116: dup
    //   117: istore_0
    //   118: iload #4
    //   120: if_icmpge -> 132
    //   123: aload_2
    //   124: iload_0
    //   125: invokevirtual charAt : (I)C
    //   128: istore_1
    //   129: goto -> 87
    //   132: aload #5
    //   134: putstatic burp/Zkr6.a : [Ljava/lang/String;
    //   137: bipush #19
    //   139: anewarray java/lang/String
    //   142: putstatic burp/Zkr6.c : [Ljava/lang/String;
    //   145: goto -> 304
    //   148: dup_x2
    //   149: pop
    //   150: invokevirtual toCharArray : ()[C
    //   153: dup_x1
    //   154: arraylength
    //   155: dup_x2
    //   156: pop
    //   157: iconst_0
    //   158: istore #6
    //   160: dup2_x1
    //   161: pop2
    //   162: dup_x2
    //   163: iconst_1
    //   164: if_icmpgt -> 264
    //   167: dup2
    //   168: swap
    //   169: iload #6
    //   171: dup2_x1
    //   172: caload
    //   173: swap
    //   174: iload #6
    //   176: bipush #7
    //   178: irem
    //   179: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #81
    //   218: goto -> 248
    //   221: bipush #85
    //   223: goto -> 248
    //   226: bipush #83
    //   228: goto -> 248
    //   231: bipush #73
    //   233: goto -> 248
    //   236: bipush #73
    //   238: goto -> 248
    //   241: bipush #123
    //   243: goto -> 248
    //   246: bipush #11
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 171
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 167
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 104
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3BD0) & 0xFFFF;
    if (c[i] == null) {
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
      byte b1 = 114;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkr6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */