/*      */ package com.formdev.flatlaf;
/*      */ 
/*      */ import com.formdev.flatlaf.ui.FlatNativeWindowBorder;
/*      */ import com.formdev.flatlaf.ui.FlatPopupFactory;
/*      */ import com.formdev.flatlaf.ui.FlatRootPaneUI;
/*      */ import com.formdev.flatlaf.ui.FlatStylingSupport;
/*      */ import com.formdev.flatlaf.ui.FlatUIUtils;
/*      */ import com.formdev.flatlaf.util.FontUtils;
/*      */ import com.formdev.flatlaf.util.GrayFilter;
/*      */ import com.formdev.flatlaf.util.LoggingFacade;
/*      */ import com.formdev.flatlaf.util.MultiResolutionImageSupport;
/*      */ import com.formdev.flatlaf.util.StringUtils;
/*      */ import com.formdev.flatlaf.util.SystemInfo;
/*      */ import com.formdev.flatlaf.util.UIScale;
/*      */ import java.awt.Color;
/*      */ import java.awt.Component;
/*      */ import java.awt.EventQueue;
/*      */ import java.awt.Font;
/*      */ import java.awt.Image;
/*      */ import java.awt.RenderingHints;
/*      */ import java.awt.Toolkit;
/*      */ import java.awt.Window;
/*      */ import java.awt.image.FilteredImageSource;
/*      */ import java.awt.image.ImageFilter;
/*      */ import java.awt.image.ImageProducer;
/*      */ import java.beans.PropertyChangeEvent;
/*      */ import java.beans.PropertyChangeListener;
/*      */ import java.io.File;
/*      */ import java.lang.invoke.MethodHandle;
/*      */ import java.lang.invoke.MethodHandles;
/*      */ import java.lang.invoke.MethodType;
/*      */ import java.lang.reflect.Method;
/*      */ import java.net.URL;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Collections;
/*      */ import java.util.Enumeration;
/*      */ import java.util.HashMap;
/*      */ import java.util.List;
/*      */ import java.util.Locale;
/*      */ import java.util.Map;
/*      */ import java.util.MissingResourceException;
/*      */ import java.util.Properties;
/*      */ import java.util.ResourceBundle;
/*      */ import java.util.ServiceLoader;
/*      */ import java.util.function.Consumer;
/*      */ import java.util.function.Function;
/*      */ import java.util.function.IntUnaryOperator;
/*      */ import javax.swing.BorderFactory;
/*      */ import javax.swing.Icon;
/*      */ import javax.swing.ImageIcon;
/*      */ import javax.swing.JComponent;
/*      */ import javax.swing.JDialog;
/*      */ import javax.swing.JFrame;
/*      */ import javax.swing.JMenuBar;
/*      */ import javax.swing.LookAndFeel;
/*      */ import javax.swing.PopupFactory;
/*      */ import javax.swing.RootPaneContainer;
/*      */ import javax.swing.SwingUtilities;
/*      */ import javax.swing.UIDefaults;
/*      */ import javax.swing.UIManager;
/*      */ import javax.swing.UnsupportedLookAndFeelException;
/*      */ import javax.swing.plaf.ColorUIResource;
/*      */ import javax.swing.plaf.ComponentUI;
/*      */ import javax.swing.plaf.FontUIResource;
/*      */ import javax.swing.plaf.IconUIResource;
/*      */ import javax.swing.plaf.UIResource;
/*      */ import javax.swing.plaf.basic.BasicLookAndFeel;
/*      */ import javax.swing.plaf.metal.MetalLookAndFeel;
/*      */ import javax.swing.text.StyleContext;
/*      */ import javax.swing.text.html.HTMLEditorKit;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public abstract class FlatLaf
/*      */   extends BasicLookAndFeel
/*      */ {
/*      */   private static final String DESKTOPFONTHINTS = "awt.font.desktophints";
/*      */   private static List<Object> customDefaultsSources;
/*      */   private static Map<String, String> globalExtraDefaults;
/*      */   private Map<String, String> extraDefaults;
/*      */   private static Function<String, Color> systemColorGetter;
/*      */   private String desktopPropertyName;
/*      */   private String desktopPropertyName2;
/*      */   private PropertyChangeListener desktopPropertyListener;
/*      */   private static boolean aquaLoaded;
/*      */   private static boolean updateUIPending;
/*      */   private PopupFactory oldPopupFactory;
/*      */   private MnemonicHandler mnemonicHandler;
/*      */   private boolean subMenuUsabilityHelperInstalled;
/*      */   private Consumer<UIDefaults> postInitialization;
/*      */   private List<Function<Object, Object>> uiDefaultsGetters;
/*      */   private static String preferredFontFamily;
/*      */   private static String preferredLightFontFamily;
/*      */   private static String preferredSemiboldFontFamily;
/*      */   private static String preferredMonospacedFontFamily;
/*      */   
/*      */   public static boolean setup(LookAndFeel newLookAndFeel) {
/*      */     try {
/*  132 */       UIManager.setLookAndFeel(newLookAndFeel);
/*  133 */       return true;
/*  134 */     } catch (Exception ex) {
/*  135 */       LoggingFacade.INSTANCE.logSevere("FlatLaf: Failed to setup look and feel '" + newLookAndFeel.getClass().getName() + "'.", ex);
/*  136 */       return false;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static boolean install(LookAndFeel newLookAndFeel) {
/*  145 */     return setup(newLookAndFeel);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void installLafInfo(String lafName, Class<? extends LookAndFeel> lafClass) {
/*  155 */     UIManager.installLookAndFeel(new UIManager.LookAndFeelInfo(lafName, lafClass.getName()));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getID() {
/*  168 */     return "FlatLaf - " + getName();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isLafDark() {
/*  177 */     LookAndFeel lookAndFeel = UIManager.getLookAndFeel();
/*  178 */     return (lookAndFeel instanceof FlatLaf && ((FlatLaf)lookAndFeel).isDark());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean getSupportsWindowDecorations() {
/*  203 */     if (SystemInfo.isProjector || SystemInfo.isWebswing || SystemInfo.isWinPE) {
/*  204 */       return false;
/*      */     }
/*  206 */     if (SystemInfo.isWindows_10_orLater && 
/*  207 */       FlatNativeWindowBorder.isSupported()) {
/*  208 */       return false;
/*      */     }
/*  210 */     return (SystemInfo.isWindows_10_orLater || SystemInfo.isLinux);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isNativeLookAndFeel() {
/*  215 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isSupportedLookAndFeel() {
/*  220 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public Icon getDisabledIcon(JComponent component, Icon icon) {
/*  225 */     if (icon instanceof DisabledIconProvider) {
/*  226 */       Icon disabledIcon = ((DisabledIconProvider)icon).getDisabledIcon();
/*  227 */       return !(disabledIcon instanceof UIResource) ? new IconUIResource(disabledIcon) : disabledIcon;
/*      */     } 
/*      */     
/*  230 */     if (icon instanceof ImageIcon) {
/*  231 */       Object grayFilter = UIManager.get("Component.grayFilter");
/*      */ 
/*      */       
/*  234 */       ImageFilter filter = (grayFilter instanceof ImageFilter) ? (ImageFilter)grayFilter : (ImageFilter)GrayFilter.createDisabledIconFilter(isDark());
/*      */       
/*  236 */       Function<Image, Image> mapper = img -> {
/*      */           ImageProducer producer = new FilteredImageSource(img.getSource(), filter);
/*      */           
/*      */           return Toolkit.getDefaultToolkit().createImage(producer);
/*      */         };
/*  241 */       Image image = ((ImageIcon)icon).getImage();
/*  242 */       return new ImageIconUIResource(MultiResolutionImageSupport.map(image, mapper));
/*      */     } 
/*      */     
/*  245 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void initialize() {
/*  256 */     if (UIManager.getLookAndFeel() != this) {
/*      */       return;
/*      */     }
/*  259 */     if (SystemInfo.isMacOS) {
/*  260 */       initializeAqua();
/*      */     }
/*  262 */     super.initialize();
/*      */ 
/*      */     
/*  265 */     this.oldPopupFactory = PopupFactory.getSharedInstance();
/*  266 */     PopupFactory.setSharedInstance((PopupFactory)new FlatPopupFactory());
/*      */ 
/*      */     
/*  269 */     this.mnemonicHandler = new MnemonicHandler();
/*  270 */     this.mnemonicHandler.install();
/*      */ 
/*      */     
/*  273 */     this.subMenuUsabilityHelperInstalled = SubMenuUsabilityHelper.install();
/*      */ 
/*      */     
/*  276 */     if (SystemInfo.isWindows) {
/*      */ 
/*      */       
/*  279 */       this.desktopPropertyName = "win.messagebox.font";
/*  280 */     } else if (SystemInfo.isLinux) {
/*      */       
/*  282 */       this.desktopPropertyName = "gnome.Gtk/FontName";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  288 */       this.desktopPropertyName2 = "gnome.Xft/DPI";
/*      */     } 
/*  290 */     if (this.desktopPropertyName != null) {
/*  291 */       this.desktopPropertyListener = (e -> {
/*      */           if (!FlatSystemProperties.getBoolean("flatlaf.updateUIOnSystemFontChange", true)) {
/*      */             return;
/*      */           }
/*      */           
/*      */           String propertyName = e.getPropertyName();
/*      */           
/*      */           if (this.desktopPropertyName.equals(propertyName) || propertyName.equals(this.desktopPropertyName2)) {
/*      */             reSetLookAndFeel();
/*      */           } else if ("awt.font.desktophints".equals(propertyName) && UIManager.getLookAndFeel() instanceof FlatLaf) {
/*      */             putAATextInfo(UIManager.getLookAndFeelDefaults());
/*      */             updateUILater();
/*      */           } 
/*      */         });
/*  305 */       Toolkit toolkit = Toolkit.getDefaultToolkit();
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  310 */       toolkit.getDesktopProperty("dummy");
/*      */       
/*  312 */       toolkit.addPropertyChangeListener(this.desktopPropertyName, this.desktopPropertyListener);
/*  313 */       if (this.desktopPropertyName2 != null)
/*  314 */         toolkit.addPropertyChangeListener(this.desktopPropertyName2, this.desktopPropertyListener); 
/*  315 */       toolkit.addPropertyChangeListener("awt.font.desktophints", this.desktopPropertyListener);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  321 */     this.postInitialization = (defaults -> {
/*      */         Color linkColor = defaults.getColor("Component.linkColor");
/*      */         if (linkColor != null) {
/*      */           (new HTMLEditorKit()).getStyleSheet().addRule(String.format("a, address { color: #%06x; }", new Object[] { Integer.valueOf(linkColor.getRGB() & 0xFFFFFF) }));
/*      */         }
/*      */       });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void uninitialize() {
/*  334 */     if (UIManager.getLookAndFeel() != this) {
/*      */       return;
/*      */     }
/*      */     
/*  338 */     if (this.desktopPropertyListener != null) {
/*  339 */       Toolkit toolkit = Toolkit.getDefaultToolkit();
/*  340 */       toolkit.removePropertyChangeListener(this.desktopPropertyName, this.desktopPropertyListener);
/*  341 */       if (this.desktopPropertyName2 != null)
/*  342 */         toolkit.removePropertyChangeListener(this.desktopPropertyName2, this.desktopPropertyListener); 
/*  343 */       toolkit.removePropertyChangeListener("awt.font.desktophints", this.desktopPropertyListener);
/*  344 */       this.desktopPropertyName = null;
/*  345 */       this.desktopPropertyName2 = null;
/*  346 */       this.desktopPropertyListener = null;
/*      */     } 
/*      */ 
/*      */     
/*  350 */     if (this.oldPopupFactory != null) {
/*  351 */       PopupFactory.setSharedInstance(this.oldPopupFactory);
/*  352 */       this.oldPopupFactory = null;
/*      */     } 
/*      */ 
/*      */     
/*  356 */     if (this.mnemonicHandler != null) {
/*  357 */       this.mnemonicHandler.uninstall();
/*  358 */       this.mnemonicHandler = null;
/*      */     } 
/*      */ 
/*      */     
/*  362 */     if (this.subMenuUsabilityHelperInstalled) {
/*  363 */       SubMenuUsabilityHelper.uninstall();
/*  364 */       this.subMenuUsabilityHelperInstalled = false;
/*      */     } 
/*      */ 
/*      */     
/*  368 */     (new HTMLEditorKit()).getStyleSheet().addRule("a, address { color: blue; }");
/*  369 */     this.postInitialization = null;
/*      */     
/*  371 */     super.uninitialize();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void initializeAqua() {
/*      */     BasicLookAndFeel aquaLaf;
/*  382 */     if (aquaLoaded) {
/*      */       return;
/*      */     }
/*  385 */     aquaLoaded = true;
/*      */ 
/*      */     
/*  388 */     String aquaLafClassName = "com.apple.laf.AquaLookAndFeel";
/*      */     
/*      */     try {
/*  391 */       if (SystemInfo.isJava_9_orLater)
/*  392 */       { Method m = UIManager.class.getMethod("createLookAndFeel", new Class[] { String.class });
/*  393 */         aquaLaf = (BasicLookAndFeel)m.invoke(null, new Object[] { "Mac OS X" }); }
/*      */       else
/*  395 */       { aquaLaf = Class.forName(aquaLafClassName).<BasicLookAndFeel>asSubclass(BasicLookAndFeel.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]); } 
/*  396 */     } catch (Exception ex) {
/*  397 */       LoggingFacade.INSTANCE.logSevere("FlatLaf: Failed to initialize Aqua look and feel '" + aquaLafClassName + "'.", ex);
/*  398 */       throw new IllegalStateException();
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  403 */     PopupFactory oldPopupFactory = PopupFactory.getSharedInstance();
/*      */ 
/*      */     
/*  406 */     aquaLaf.initialize();
/*  407 */     aquaLaf.uninitialize();
/*      */ 
/*      */     
/*  410 */     PopupFactory.setSharedInstance(oldPopupFactory);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public UIDefaults getDefaults() {
/*  417 */     UIDefaults defaults = new FlatUIDefaults(1500, 0.75F);
/*      */ 
/*      */     
/*  420 */     initClassDefaults(defaults);
/*  421 */     initSystemColorDefaults(defaults);
/*  422 */     initComponentDefaults(defaults);
/*      */ 
/*      */ 
/*      */     
/*  426 */     defaults.put("laf.dark", Boolean.valueOf(isDark()));
/*      */ 
/*      */     
/*  429 */     initResourceBundle(defaults, "com.formdev.flatlaf.resources.Bundle");
/*      */ 
/*      */ 
/*      */     
/*  433 */     putDefaults(defaults, defaults.getColor("control"), new String[] { "Button.disabledBackground", "EditorPane.disabledBackground", "EditorPane.inactiveBackground", "FormattedTextField.disabledBackground", "PasswordField.disabledBackground", "RootPane.background", "Spinner.disabledBackground", "TextArea.disabledBackground", "TextArea.inactiveBackground", "TextField.disabledBackground", "TextPane.disabledBackground", "TextPane.inactiveBackground", "ToggleButton.disabledBackground" });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  447 */     putDefaults(defaults, defaults.getColor("textInactiveText"), new String[] { "Button.disabledText", "CheckBox.disabledText", "CheckBoxMenuItem.disabledForeground", "Menu.disabledForeground", "MenuItem.disabledForeground", "RadioButton.disabledText", "RadioButtonMenuItem.disabledForeground", "Spinner.disabledForeground", "ToggleButton.disabledText" });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  457 */     putDefaults(defaults, defaults.getColor("textText"), new String[] { "DesktopIcon.foreground", "RootPane.foreground" });
/*      */ 
/*      */ 
/*      */     
/*  461 */     initFonts(defaults);
/*  462 */     initIconColors(defaults, isDark());
/*  463 */     FlatInputMaps.initInputMaps(defaults);
/*      */ 
/*      */ 
/*      */     
/*  467 */     Object icon = defaults.remove("InternalFrame.icon");
/*  468 */     defaults.put("InternalFrame.icon", icon);
/*  469 */     defaults.put("TitlePane.icon", icon);
/*      */ 
/*      */     
/*  472 */     ServiceLoader<FlatDefaultsAddon> addonLoader = ServiceLoader.load(FlatDefaultsAddon.class);
/*  473 */     List<FlatDefaultsAddon> addons = new ArrayList<>();
/*  474 */     for (FlatDefaultsAddon addon : addonLoader)
/*  475 */       addons.add(addon); 
/*  476 */     addons.sort((addon1, addon2) -> addon1.getPriority() - addon2.getPriority());
/*      */ 
/*      */     
/*  479 */     List<Class<?>> lafClassesForDefaultsLoading = getLafClassesForDefaultsLoading();
/*  480 */     if (lafClassesForDefaultsLoading != null) {
/*  481 */       UIDefaultsLoader.loadDefaultsFromProperties(lafClassesForDefaultsLoading, addons, getAdditionalDefaults(), isDark(), defaults);
/*      */     } else {
/*  483 */       UIDefaultsLoader.loadDefaultsFromProperties(getClass(), addons, getAdditionalDefaults(), isDark(), defaults);
/*      */     } 
/*      */ 
/*      */     
/*  487 */     initDefaultFont(defaults);
/*      */ 
/*      */     
/*  490 */     if (SystemInfo.isMacOS && Boolean.getBoolean("apple.laf.useScreenMenuBar")) {
/*  491 */       defaults.put("MenuBarUI", "com.apple.laf.AquaMenuBarUI");
/*      */ 
/*      */       
/*  494 */       defaults.put("MenuBar.backgroundPainter", BorderFactory.createEmptyBorder());
/*      */     } 
/*      */ 
/*      */     
/*  498 */     putAATextInfo(defaults);
/*      */ 
/*      */     
/*  501 */     applyAdditionalDefaults(defaults);
/*      */ 
/*      */     
/*  504 */     for (FlatDefaultsAddon addon : addons) {
/*  505 */       addon.afterDefaultsLoading(this, defaults);
/*      */     }
/*      */     
/*  508 */     defaults.put("laf.scaleFactor", t -> Float.valueOf(UIScale.getUserScaleFactor()));
/*      */ 
/*      */ 
/*      */     
/*  512 */     if (this.postInitialization != null) {
/*  513 */       this.postInitialization.accept(defaults);
/*  514 */       this.postInitialization = null;
/*      */     } 
/*      */     
/*  517 */     return defaults;
/*      */   }
/*      */ 
/*      */   
/*      */   void applyAdditionalDefaults(UIDefaults defaults) {}
/*      */   
/*      */   protected List<Class<?>> getLafClassesForDefaultsLoading() {
/*  524 */     return null;
/*      */   }
/*      */   
/*      */   protected Properties getAdditionalDefaults() {
/*  528 */     if (globalExtraDefaults == null && this.extraDefaults == null) {
/*  529 */       return null;
/*      */     }
/*  531 */     Properties properties = new Properties();
/*  532 */     if (globalExtraDefaults != null)
/*  533 */       properties.putAll(globalExtraDefaults); 
/*  534 */     if (this.extraDefaults != null)
/*  535 */       properties.putAll(this.extraDefaults); 
/*  536 */     return properties;
/*      */   }
/*      */ 
/*      */   
/*      */   private void initResourceBundle(UIDefaults defaults, String bundleName) {
/*  541 */     defaults.addResourceBundle(bundleName);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  547 */     if (defaults.get("TabbedPane.moreTabsButtonToolTipText") != null) {
/*      */       return;
/*      */     }
/*      */     
/*      */     try {
/*  552 */       ResourceBundle bundle = ResourceBundle.getBundle(bundleName, defaults.getDefaultLocale());
/*      */       
/*  554 */       Enumeration<String> keys = bundle.getKeys();
/*  555 */       while (keys.hasMoreElements()) {
/*  556 */         String key = keys.nextElement();
/*  557 */         String value = bundle.getString(key);
/*      */         
/*  559 */         String baseKey = StringUtils.removeTrailing(key, ".textAndMnemonic");
/*  560 */         if (baseKey != key) {
/*  561 */           String text = value.replace("&", "");
/*  562 */           String mnemonic = null;
/*  563 */           int index = value.indexOf('&');
/*  564 */           if (index >= 0) {
/*  565 */             mnemonic = Integer.toString(Character.toUpperCase(value.charAt(index + 1)));
/*      */           }
/*  567 */           defaults.put(baseKey + "Text", text);
/*  568 */           if (mnemonic != null)
/*  569 */             defaults.put(baseKey + "Mnemonic", mnemonic);  continue;
/*      */         } 
/*  571 */         defaults.put(key, value);
/*      */       } 
/*  573 */     } catch (MissingResourceException ex) {
/*  574 */       LoggingFacade.INSTANCE.logSevere(null, ex);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void initFonts(UIDefaults defaults) {
/*  582 */     Object activeFont = new ActiveFont(null, null, -1, 0, 0, 0, 0.0F);
/*      */ 
/*      */     
/*  585 */     List<String> fontKeys = new ArrayList<>(50);
/*  586 */     for (Object key : defaults.keySet()) {
/*  587 */       if (key instanceof String && (((String)key).endsWith(".font") || ((String)key).endsWith("Font")))
/*  588 */         fontKeys.add((String)key); 
/*      */     } 
/*  590 */     for (String key : fontKeys) {
/*  591 */       defaults.put(key, activeFont);
/*      */     }
/*      */     
/*  594 */     defaults.put("RootPane.font", activeFont);
/*  595 */     defaults.put("TitlePane.font", activeFont);
/*      */   }
/*      */   
/*      */   private void initDefaultFont(UIDefaults defaults) {
/*  599 */     FontUIResource uiFont = null;
/*      */ 
/*      */     
/*  602 */     if (SystemInfo.isWindows) {
/*  603 */       Font winFont = (Font)Toolkit.getDefaultToolkit().getDesktopProperty("win.messagebox.font");
/*  604 */       if (winFont != null) {
/*  605 */         if (SystemInfo.isWinPE) {
/*      */ 
/*      */           
/*  608 */           Font winPEFont = (Font)Toolkit.getDefaultToolkit().getDesktopProperty("win.defaultGUI.font");
/*  609 */           if (winPEFont != null)
/*  610 */             uiFont = createCompositeFont(winPEFont.getFamily(), winPEFont.getStyle(), winFont.getSize()); 
/*      */         } else {
/*  612 */           uiFont = createCompositeFont(winFont.getFamily(), winFont.getStyle(), winFont.getSize());
/*      */         } 
/*      */       }
/*  615 */     } else if (SystemInfo.isMacOS) {
/*      */       String fontName;
/*  617 */       if (SystemInfo.isMacOS_10_15_Catalina_orLater) {
/*  618 */         if (SystemInfo.isJetBrainsJVM_11_orLater) {
/*      */           
/*  620 */           fontName = ".AppleSystemUIFont";
/*      */         } else {
/*      */           
/*  623 */           fontName = "Helvetica Neue";
/*      */         } 
/*  625 */       } else if (SystemInfo.isMacOS_10_11_ElCapitan_orLater) {
/*      */         
/*  627 */         fontName = ".SF NS Text";
/*      */       } else {
/*      */         
/*  630 */         fontName = "Lucida Grande";
/*      */       } 
/*      */       
/*  633 */       uiFont = createCompositeFont(fontName, 0, 13);
/*      */     }
/*  635 */     else if (SystemInfo.isLinux) {
/*  636 */       Font font = LinuxFontPolicy.getFont();
/*  637 */       uiFont = (font instanceof FontUIResource) ? (FontUIResource)font : new FontUIResource(font);
/*      */     } 
/*      */ 
/*      */     
/*  641 */     if (uiFont == null) {
/*  642 */       uiFont = createCompositeFont("SansSerif", 0, 12);
/*      */     }
/*      */     
/*  645 */     if (preferredFontFamily != null) {
/*  646 */       FontUIResource preferredFont = createCompositeFont(preferredFontFamily, uiFont.getStyle(), uiFont.getSize());
/*  647 */       if (!ActiveFont.isFallbackFont(preferredFont) || ActiveFont.isDialogFamily(preferredFontFamily)) {
/*  648 */         uiFont = preferredFont;
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/*  653 */     Object defaultFont = defaults.remove("defaultFont");
/*      */ 
/*      */     
/*  656 */     if (defaultFont instanceof ActiveFont) {
/*  657 */       Font baseFont = uiFont;
/*  658 */       uiFont = ((ActiveFont)defaultFont).derive(baseFont, fontSize -> Math.round(fontSize * UIScale.computeFontScaleFactor(baseFont)));
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  664 */     uiFont = UIScale.applyCustomScaleFactor(uiFont);
/*      */ 
/*      */     
/*  667 */     defaults.put("defaultFont", uiFont);
/*      */   }
/*      */ 
/*      */   
/*      */   static FontUIResource createCompositeFont(String family, int style, int size) {
/*  672 */     FontUtils.loadFontFamily(family);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  677 */     Font font = StyleContext.getDefaultStyleContext().getFont(family, style, size);
/*  678 */     return (font instanceof FontUIResource) ? (FontUIResource)font : new FontUIResource(font);
/*      */   }
/*      */ 
/*      */   
/*      */   public static UIDefaults.ActiveValue createActiveFontValue(float scaleFactor) {
/*  683 */     return new ActiveFont(null, null, -1, 0, 0, 0, scaleFactor);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void initIconColors(UIDefaults defaults, boolean dark) {
/*  703 */     for (FlatIconColors c : FlatIconColors.values()) {
/*  704 */       if (c.light == (!dark) || c.dark == dark)
/*  705 */         defaults.put(c.key, new ColorUIResource(c.rgb)); 
/*      */     } 
/*      */   }
/*      */   
/*      */   private void putAATextInfo(UIDefaults defaults) {
/*  710 */     if (SystemInfo.isMacOS && SystemInfo.isJetBrainsJVM) {
/*      */ 
/*      */ 
/*      */       
/*  714 */       defaults.put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
/*  715 */     } else if (SystemInfo.isJava_9_orLater) {
/*  716 */       Object desktopHints = Toolkit.getDefaultToolkit().getDesktopProperty("awt.font.desktophints");
/*  717 */       if (desktopHints == null)
/*  718 */         desktopHints = fallbackAATextInfo(); 
/*  719 */       if (desktopHints instanceof Map) {
/*      */         
/*  721 */         Map<Object, Object> hints = (Map<Object, Object>)desktopHints;
/*  722 */         Object aaHint = hints.get(RenderingHints.KEY_TEXT_ANTIALIASING);
/*  723 */         if (aaHint != null && aaHint != RenderingHints.VALUE_TEXT_ANTIALIAS_OFF && aaHint != RenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT) {
/*      */ 
/*      */ 
/*      */           
/*  727 */           defaults.put(RenderingHints.KEY_TEXT_ANTIALIASING, aaHint);
/*  728 */           defaults.put(RenderingHints.KEY_TEXT_LCD_CONTRAST, hints
/*  729 */               .get(RenderingHints.KEY_TEXT_LCD_CONTRAST));
/*      */         } 
/*      */       } 
/*      */     } else {
/*      */ 
/*      */       
/*      */       try {
/*      */         
/*  737 */         Object key = Class.forName("sun.swing.SwingUtilities2").getField("AA_TEXT_PROPERTY_KEY").get(null);
/*      */ 
/*      */         
/*  740 */         Object value = Class.forName("sun.swing.SwingUtilities2$AATextInfo").getMethod("getAATextInfo", new Class[] { boolean.class }).invoke(null, new Object[] { Boolean.valueOf(true) });
/*  741 */         if (value == null)
/*  742 */           value = fallbackAATextInfo(); 
/*  743 */         defaults.put(key, value);
/*  744 */       } catch (Exception ex) {
/*  745 */         LoggingFacade.INSTANCE.logSevere(null, ex);
/*  746 */         throw new RuntimeException(ex);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private Object fallbackAATextInfo() {
/*  753 */     if (System.getProperty("awt.useSystemAAFontSettings") != null) {
/*  754 */       return null;
/*      */     }
/*  756 */     Object aaHint = null;
/*  757 */     Integer lcdContrastHint = null;
/*      */     
/*  759 */     if (SystemInfo.isLinux) {
/*      */       
/*  761 */       Toolkit toolkit = Toolkit.getDefaultToolkit();
/*  762 */       if (toolkit.getDesktopProperty("gnome.Xft/Antialias") == null && toolkit
/*  763 */         .getDesktopProperty("fontconfig/Antialias") == null)
/*      */       {
/*      */ 
/*      */         
/*  767 */         aaHint = RenderingHints.VALUE_TEXT_ANTIALIAS_ON;
/*      */       }
/*      */     } 
/*      */     
/*  771 */     if (aaHint == null) {
/*  772 */       return null;
/*      */     }
/*  774 */     if (SystemInfo.isJava_9_orLater) {
/*  775 */       Map<Object, Object> hints = new HashMap<>();
/*  776 */       hints.put(RenderingHints.KEY_TEXT_ANTIALIASING, aaHint);
/*  777 */       hints.put(RenderingHints.KEY_TEXT_LCD_CONTRAST, lcdContrastHint);
/*  778 */       return hints;
/*      */     } 
/*      */     
/*      */     try {
/*  782 */       return Class.forName("sun.swing.SwingUtilities2$AATextInfo")
/*  783 */         .getConstructor(new Class[] { Object.class, Integer.class
/*  784 */           }).newInstance(new Object[] { aaHint, lcdContrastHint });
/*  785 */     } catch (Exception ex) {
/*  786 */       LoggingFacade.INSTANCE.logSevere(null, ex);
/*  787 */       throw new RuntimeException(ex);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void putDefaults(UIDefaults defaults, Object value, String... keys) {
/*  793 */     for (String key : keys)
/*  794 */       defaults.put(key, value); 
/*      */   }
/*      */   
/*      */   static List<Object> getCustomDefaultsSources() {
/*  798 */     return customDefaultsSources;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void registerCustomDefaultsSource(String packageName) {
/*  824 */     registerCustomDefaultsSource(packageName, (ClassLoader)null);
/*      */   }
/*      */   
/*      */   public static void unregisterCustomDefaultsSource(String packageName) {
/*  828 */     unregisterCustomDefaultsSource(packageName, (ClassLoader)null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void registerCustomDefaultsSource(String packageName, ClassLoader classLoader) {
/*  840 */     if (customDefaultsSources == null)
/*  841 */       customDefaultsSources = new ArrayList(); 
/*  842 */     customDefaultsSources.add(packageName);
/*  843 */     customDefaultsSources.add(classLoader);
/*      */   }
/*      */   
/*      */   public static void unregisterCustomDefaultsSource(String packageName, ClassLoader classLoader) {
/*  847 */     if (customDefaultsSources == null) {
/*      */       return;
/*      */     }
/*  850 */     int size = customDefaultsSources.size();
/*  851 */     for (int i = 0; i < size - 1; i++) {
/*  852 */       Object source = customDefaultsSources.get(i);
/*  853 */       if (packageName.equals(source) && customDefaultsSources.get(i + 1) == classLoader) {
/*  854 */         customDefaultsSources.remove(i + 1);
/*  855 */         customDefaultsSources.remove(i);
/*      */         break;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void registerCustomDefaultsSource(URL packageUrl) {
/*  874 */     if (customDefaultsSources == null)
/*  875 */       customDefaultsSources = new ArrayList(); 
/*  876 */     customDefaultsSources.add(packageUrl);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void unregisterCustomDefaultsSource(URL packageUrl) {
/*  881 */     if (customDefaultsSources == null) {
/*      */       return;
/*      */     }
/*  884 */     customDefaultsSources.remove(packageUrl);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void registerCustomDefaultsSource(File folder) {
/*  895 */     if (customDefaultsSources == null)
/*  896 */       customDefaultsSources = new ArrayList(); 
/*  897 */     customDefaultsSources.add(folder);
/*      */   }
/*      */   
/*      */   public static void unregisterCustomDefaultsSource(File folder) {
/*  901 */     if (customDefaultsSources == null) {
/*      */       return;
/*      */     }
/*  904 */     customDefaultsSources.remove(folder);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Map<String, String> getGlobalExtraDefaults() {
/*  913 */     return globalExtraDefaults;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setGlobalExtraDefaults(Map<String, String> globalExtraDefaults) {
/*  936 */     FlatLaf.globalExtraDefaults = globalExtraDefaults;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Map<String, String> getExtraDefaults() {
/*  945 */     return this.extraDefaults;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setExtraDefaults(Map<String, String> extraDefaults) {
/*  969 */     this.extraDefaults = extraDefaults;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Object parseDefaultsValue(String key, String value, Class<?> valueType) throws IllegalArgumentException {
/*  988 */     value = UIDefaultsLoader.resolveValueFromUIManager(value);
/*      */ 
/*      */     
/*  991 */     Object val = UIDefaultsLoader.parseValue(key, value, valueType, null, v -> UIDefaultsLoader.resolveValueFromUIManager(v), 
/*  992 */         Collections.emptyList());
/*      */ 
/*      */     
/*  995 */     if (val instanceof UIDefaults.LazyValue) {
/*  996 */       val = ((UIDefaults.LazyValue)val).createValue(null);
/*  997 */     } else if (val instanceof UIDefaults.ActiveValue) {
/*  998 */       val = ((UIDefaults.ActiveValue)val).createValue(null);
/*      */     } 
/* 1000 */     return val;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Function<String, Color> getSystemColorGetter() {
/* 1009 */     return systemColorGetter;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setSystemColorGetter(Function<String, Color> systemColorGetter) {
/* 1030 */     FlatLaf.systemColorGetter = systemColorGetter;
/*      */   }
/*      */   
/*      */   private static void reSetLookAndFeel() {
/* 1034 */     EventQueue.invokeLater(() -> {
/*      */           LookAndFeel lookAndFeel = UIManager.getLookAndFeel();
/*      */           
/*      */           try {
/*      */             UIManager.setLookAndFeel(lookAndFeel);
/*      */             
/*      */             PropertyChangeEvent e = new PropertyChangeEvent(UIManager.class, "lookAndFeel", lookAndFeel, lookAndFeel);
/*      */             
/*      */             for (PropertyChangeListener l : UIManager.getPropertyChangeListeners()) {
/*      */               l.propertyChange(e);
/*      */             }
/*      */             
/*      */             updateUI();
/* 1047 */           } catch (UnsupportedLookAndFeelException ex) {
/*      */             LoggingFacade.INSTANCE.logSevere("FlatLaf: Failed to reinitialize look and feel '" + lookAndFeel.getClass().getName() + "'.", ex);
/*      */           } 
/*      */         });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void updateUI() {
/* 1058 */     for (Window w : Window.getWindows()) {
/* 1059 */       SwingUtilities.updateComponentTreeUI(w);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static void updateUILater() {
/* 1066 */     synchronized (FlatLaf.class) {
/* 1067 */       if (updateUIPending) {
/*      */         return;
/*      */       }
/* 1070 */       updateUIPending = true;
/*      */     } 
/*      */     
/* 1073 */     EventQueue.invokeLater(() -> {
/*      */           updateUI();
/*      */           synchronized (FlatLaf.class) {
/*      */             updateUIPending = false;
/*      */           } 
/*      */         });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean supportsNativeWindowDecorations() {
/* 1092 */     return (SystemInfo.isWindows_10_orLater && FlatNativeWindowBorder.isSupported());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isUseNativeWindowDecorations() {
/* 1101 */     return UIManager.getBoolean("TitlePane.useWindowDecorations");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setUseNativeWindowDecorations(boolean enabled) {
/* 1112 */     UIManager.put("TitlePane.useWindowDecorations", Boolean.valueOf(enabled));
/*      */     
/* 1114 */     if (!(UIManager.getLookAndFeel() instanceof FlatLaf)) {
/*      */       return;
/*      */     }
/*      */     
/* 1118 */     for (Window w : Window.getWindows()) {
/* 1119 */       if (isDisplayableFrameOrDialog(w)) {
/* 1120 */         FlatRootPaneUI.updateNativeWindowBorder(((RootPaneContainer)w).getRootPane());
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void revalidateAndRepaintAllFramesAndDialogs() {
/* 1132 */     for (Window w : Window.getWindows()) {
/* 1133 */       if (isDisplayableFrameOrDialog(w)) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1139 */         JMenuBar menuBar = (w instanceof JFrame) ? ((JFrame)w).getJMenuBar() : ((w instanceof JDialog) ? ((JDialog)w).getJMenuBar() : null);
/* 1140 */         if (menuBar != null) {
/* 1141 */           menuBar.revalidate();
/*      */         }
/* 1143 */         w.revalidate();
/* 1144 */         w.repaint();
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void repaintAllFramesAndDialogs() {
/* 1158 */     for (Window w : Window.getWindows()) {
/* 1159 */       if (isDisplayableFrameOrDialog(w))
/* 1160 */         w.repaint(); 
/*      */     } 
/*      */   }
/*      */   
/*      */   private static boolean isDisplayableFrameOrDialog(Window w) {
/* 1165 */     return (w.isDisplayable() && (w instanceof JFrame || w instanceof JDialog));
/*      */   }
/*      */   
/*      */   public static boolean isShowMnemonics() {
/* 1169 */     return MnemonicHandler.isShowMnemonics();
/*      */   }
/*      */   
/*      */   public static void showMnemonics(Component c) {
/* 1173 */     MnemonicHandler.showMnemonics(true, c);
/*      */   }
/*      */   
/*      */   public static void hideMnemonics() {
/* 1177 */     MnemonicHandler.showMnemonics(false, null);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean equals(Object obj) {
/* 1183 */     return super.equals(obj);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final int hashCode() {
/* 1189 */     return super.hashCode();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void registerUIDefaultsGetter(Function<Object, Object> uiDefaultsGetter) {
/* 1207 */     if (this.uiDefaultsGetters == null) {
/* 1208 */       this.uiDefaultsGetters = new ArrayList<>();
/*      */     }
/* 1210 */     this.uiDefaultsGetters.remove(uiDefaultsGetter);
/* 1211 */     this.uiDefaultsGetters.add(uiDefaultsGetter);
/*      */ 
/*      */     
/* 1214 */     FlatUIUtils.setUseSharedUIs(false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void unregisterUIDefaultsGetter(Function<Object, Object> uiDefaultsGetter) {
/* 1225 */     if (this.uiDefaultsGetters == null) {
/*      */       return;
/*      */     }
/* 1228 */     this.uiDefaultsGetters.remove(uiDefaultsGetter);
/*      */ 
/*      */     
/* 1231 */     if (this.uiDefaultsGetters.isEmpty()) {
/* 1232 */       FlatUIUtils.setUseSharedUIs(true);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void runWithUIDefaultsGetter(Function<Object, Object> uiDefaultsGetter, Runnable runnable) {
/* 1267 */     LookAndFeel laf = UIManager.getLookAndFeel();
/* 1268 */     if (laf instanceof FlatLaf) {
/* 1269 */       ((FlatLaf)laf).registerUIDefaultsGetter(uiDefaultsGetter);
/*      */       try {
/* 1271 */         runnable.run();
/*      */       } finally {
/* 1273 */         ((FlatLaf)laf).unregisterUIDefaultsGetter(uiDefaultsGetter);
/*      */       } 
/*      */     } else {
/* 1276 */       runnable.run();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1288 */   public static final Object NULL_VALUE = new Object();
/*      */ 
/*      */   
/*      */   private static boolean getUIMethodInitialized;
/*      */ 
/*      */   
/*      */   private static MethodHandle getUIMethod;
/*      */ 
/*      */   
/*      */   public static Map<String, Class<?>> getStyleableInfos(JComponent c) {
/* 1298 */     FlatStylingSupport.StyleableUI ui = getStyleableUI(c);
/* 1299 */     return (ui != null) ? ui.getStyleableInfos(c) : null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <T> T getStyleableValue(JComponent c, String key) {
/* 1311 */     FlatStylingSupport.StyleableUI ui = getStyleableUI(c);
/* 1312 */     return (ui != null) ? (T)ui.getStyleableValue(c, key) : null;
/*      */   }
/*      */   
/*      */   private static FlatStylingSupport.StyleableUI getStyleableUI(JComponent c) {
/* 1316 */     if (!getUIMethodInitialized) {
/* 1317 */       getUIMethodInitialized = true;
/*      */       
/* 1319 */       if (SystemInfo.isJava_9_orLater) {
/*      */         
/*      */         try {
/* 1322 */           getUIMethod = MethodHandles.lookup().findVirtual(JComponent.class, "getUI", 
/* 1323 */               MethodType.methodType(ComponentUI.class));
/* 1324 */         } catch (Exception exception) {}
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/*      */     try {
/*      */       Object ui;
/*      */       
/* 1332 */       if (getUIMethod != null) {
/* 1333 */         ui = getUIMethod.invoke(c);
/*      */       } else {
/* 1335 */         ui = c.getClass().getMethod("getUI", new Class[0]).invoke(c, new Object[0]);
/* 1336 */       }  return (ui instanceof FlatStylingSupport.StyleableUI) ? (FlatStylingSupport.StyleableUI)ui : null;
/* 1337 */     } catch (Throwable ex) {
/*      */       
/* 1339 */       return null;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getPreferredFontFamily() {
/* 1352 */     return preferredFontFamily;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setPreferredFontFamily(String preferredFontFamily) {
/* 1364 */     FlatLaf.preferredFontFamily = preferredFontFamily;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getPreferredLightFontFamily() {
/* 1373 */     return preferredLightFontFamily;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setPreferredLightFontFamily(String preferredLightFontFamily) {
/* 1385 */     FlatLaf.preferredLightFontFamily = preferredLightFontFamily;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getPreferredSemiboldFontFamily() {
/* 1394 */     return preferredSemiboldFontFamily;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setPreferredSemiboldFontFamily(String preferredSemiboldFontFamily) {
/* 1406 */     FlatLaf.preferredSemiboldFontFamily = preferredSemiboldFontFamily;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getPreferredMonospacedFontFamily() {
/* 1415 */     return preferredMonospacedFontFamily;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setPreferredMonospacedFontFamily(String preferredMonospacedFontFamily) {
/* 1427 */     FlatLaf.preferredMonospacedFontFamily = preferredMonospacedFontFamily;
/*      */   }
/*      */   
/*      */   public abstract boolean isDark();
/*      */   
/*      */   private class FlatUIDefaults
/*      */     extends UIDefaults
/*      */   {
/*      */     private UIDefaults metalDefaults;
/*      */     
/*      */     FlatUIDefaults(int initialCapacity, float loadFactor) {
/* 1438 */       super(initialCapacity, loadFactor);
/*      */     }
/*      */ 
/*      */     
/*      */     public Object get(Object key) {
/* 1443 */       return get(key, null);
/*      */     }
/*      */ 
/*      */     
/*      */     public Object get(Object key, Locale l) {
/* 1448 */       Object value = getFromUIDefaultsGetters(key);
/* 1449 */       if (value != null) {
/* 1450 */         return (value != FlatLaf.NULL_VALUE) ? value : null;
/*      */       }
/* 1452 */       value = super.get(key, l);
/* 1453 */       if (value != null) {
/* 1454 */         return value;
/*      */       }
/*      */       
/* 1457 */       return (key instanceof String && ((String)key).startsWith("FileChooser.")) ? 
/* 1458 */         getFromMetal((String)key, l) : 
/* 1459 */         null;
/*      */     }
/*      */ 
/*      */     
/*      */     private Object getFromUIDefaultsGetters(Object key) {
/* 1464 */       List<Function<Object, Object>> uiDefaultsGetters = FlatLaf.this.uiDefaultsGetters;
/* 1465 */       if (uiDefaultsGetters == null) {
/* 1466 */         return null;
/*      */       }
/* 1468 */       for (int i = uiDefaultsGetters.size() - 1; i >= 0; i--) {
/* 1469 */         Object value = ((Function)uiDefaultsGetters.get(i)).apply(key);
/* 1470 */         if (value != null) {
/* 1471 */           return value;
/*      */         }
/*      */       } 
/* 1474 */       return null;
/*      */     }
/*      */     
/*      */     private synchronized Object getFromMetal(String key, Locale l) {
/* 1478 */       if (this.metalDefaults == null) {
/* 1479 */         this
/*      */ 
/*      */ 
/*      */           
/* 1483 */           .metalDefaults = (new MetalLookAndFeel() { protected void initClassDefaults(UIDefaults table) {} protected void initSystemColorDefaults(UIDefaults table) {} }).getDefaults();
/*      */ 
/*      */ 
/*      */         
/* 1487 */         this.metalDefaults.clear();
/*      */       } 
/*      */       
/* 1490 */       return this.metalDefaults.get(key, l);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   static class ActiveFont
/*      */     implements UIDefaults.ActiveValue
/*      */   {
/*      */     private final String baseFontKey;
/*      */ 
/*      */     
/*      */     private final List<String> families;
/*      */ 
/*      */     
/*      */     private final int style;
/*      */ 
/*      */     
/*      */     private final int styleChange;
/*      */ 
/*      */     
/*      */     private final int absoluteSize;
/*      */     
/*      */     private final int relativeSize;
/*      */     
/*      */     private final float scaleSize;
/*      */     
/*      */     private FontUIResource font;
/*      */     
/*      */     private Font lastBaseFont;
/*      */     
/*      */     private boolean inCreateValue;
/*      */ 
/*      */     
/*      */     ActiveFont(String baseFontKey, List<String> families, int style, int styleChange, int absoluteSize, int relativeSize, float scaleSize) {
/* 1525 */       this.baseFontKey = baseFontKey;
/* 1526 */       this.families = families;
/* 1527 */       this.style = style;
/* 1528 */       this.styleChange = styleChange;
/* 1529 */       this.absoluteSize = absoluteSize;
/* 1530 */       this.relativeSize = relativeSize;
/* 1531 */       this.scaleSize = scaleSize;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public synchronized Object createValue(UIDefaults table) {
/* 1537 */       if (this.inCreateValue) {
/* 1538 */         throw new IllegalStateException("FlatLaf: endless recursion in font");
/*      */       }
/* 1540 */       Font baseFont = null;
/*      */       
/* 1542 */       this.inCreateValue = true;
/*      */       try {
/* 1544 */         if (this.baseFontKey != null) {
/* 1545 */           baseFont = (Font)UIDefaultsLoader.lazyUIManagerGet(this.baseFontKey);
/*      */         }
/* 1547 */         if (baseFont == null) {
/* 1548 */           baseFont = UIManager.getFont("defaultFont");
/*      */         }
/*      */         
/* 1551 */         if (baseFont == null)
/* 1552 */           baseFont = UIManager.getFont("Label.font"); 
/*      */       } finally {
/* 1554 */         this.inCreateValue = false;
/*      */       } 
/*      */       
/* 1557 */       if (this.lastBaseFont != baseFont) {
/* 1558 */         this.lastBaseFont = baseFont;
/*      */         
/* 1560 */         this.font = derive(baseFont, fontSize -> UIScale.scale(fontSize));
/*      */       } 
/*      */       
/* 1563 */       return this.font;
/*      */     }
/*      */     
/*      */     FontUIResource derive(Font baseFont, IntUnaryOperator scale) {
/* 1567 */       int baseStyle = baseFont.getStyle();
/* 1568 */       int baseSize = baseFont.getSize();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1575 */       int newStyle = (this.style != -1) ? this.style : ((this.styleChange != 0) ? (baseStyle & (this.styleChange >> 16 & 0xFFFF ^ 0xFFFFFFFF) | this.styleChange & 0xFFFF) : baseStyle);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1584 */       int newSize = (this.absoluteSize > 0) ? scale.applyAsInt(this.absoluteSize) : ((this.relativeSize != 0) ? (baseSize + scale.applyAsInt(this.relativeSize)) : ((this.scaleSize > 0.0F) ? Math.round(baseSize * this.scaleSize) : baseSize));
/* 1585 */       if (newSize <= 0) {
/* 1586 */         newSize = 1;
/*      */       }
/*      */       
/* 1589 */       if (this.families != null && !this.families.isEmpty()) {
/* 1590 */         String preferredFamily = preferredFamily(this.families);
/* 1591 */         if (preferredFamily != null) {
/* 1592 */           Font font = FlatLaf.createCompositeFont(preferredFamily, newStyle, newSize);
/* 1593 */           if (!isFallbackFont(font) || isDialogFamily(preferredFamily)) {
/* 1594 */             return toUIResource(font);
/*      */           }
/*      */         } 
/* 1597 */         for (String family : this.families) {
/* 1598 */           Font font = FlatLaf.createCompositeFont(family, newStyle, newSize);
/* 1599 */           if (!isFallbackFont(font) || isDialogFamily(family)) {
/* 1600 */             return toUIResource(font);
/*      */           }
/*      */         } 
/*      */       } 
/*      */       
/* 1605 */       if (newStyle != baseStyle || newSize != baseSize) {
/*      */ 
/*      */         
/* 1608 */         if ("Ubuntu Medium".equalsIgnoreCase(baseFont.getName()) && "Ubuntu Light"
/* 1609 */           .equalsIgnoreCase(baseFont.getFamily())) {
/*      */           
/* 1611 */           Font font = FlatLaf.createCompositeFont("Ubuntu Medium", newStyle, newSize);
/* 1612 */           if (!isFallbackFont(font)) {
/* 1613 */             return toUIResource(font);
/*      */           }
/*      */         } 
/* 1616 */         return toUIResource(baseFont.deriveFont(newStyle, newSize));
/*      */       } 
/* 1618 */       return toUIResource(baseFont);
/*      */     }
/*      */ 
/*      */     
/*      */     private FontUIResource toUIResource(Font font) {
/* 1623 */       return (font instanceof FontUIResource) ? 
/* 1624 */         (FontUIResource)font : 
/* 1625 */         new FontUIResource(font);
/*      */     }
/*      */     
/*      */     private static boolean isFallbackFont(Font font) {
/* 1629 */       return "Dialog".equalsIgnoreCase(font.getFamily());
/*      */     }
/*      */     
/*      */     private static boolean isDialogFamily(String family) {
/* 1633 */       return family.equalsIgnoreCase("Dialog");
/*      */     }
/*      */     
/*      */     private static String preferredFamily(List<String> families) {
/* 1637 */       for (String family : families) {
/* 1638 */         family = family.toLowerCase(Locale.ENGLISH);
/* 1639 */         if (family.endsWith(" light") || family.endsWith("-thin"))
/* 1640 */           return FlatLaf.preferredLightFontFamily; 
/* 1641 */         if (family.endsWith(" semibold") || family.endsWith("-medium"))
/* 1642 */           return FlatLaf.preferredSemiboldFontFamily; 
/* 1643 */         if (family.equals("monospaced"))
/* 1644 */           return FlatLaf.preferredMonospacedFontFamily; 
/*      */       } 
/* 1646 */       return null;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static class ImageIconUIResource
/*      */     extends ImageIcon
/*      */     implements UIResource
/*      */   {
/*      */     ImageIconUIResource(Image image) {
/* 1657 */       super(image);
/*      */     }
/*      */   }
/*      */   
/*      */   public static interface DisabledIconProvider {
/*      */     Icon getDisabledIcon();
/*      */   }
/*      */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\FlatLaf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */