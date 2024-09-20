/*      */ package com.formdev.flatlaf.ui;
/*      */ 
/*      */ import com.formdev.flatlaf.FlatClientProperties;
/*      */ import com.formdev.flatlaf.FlatIntelliJLaf;
/*      */ import com.formdev.flatlaf.FlatLaf;
/*      */ import com.formdev.flatlaf.FlatLightLaf;
/*      */ import com.formdev.flatlaf.FlatSystemProperties;
/*      */ import com.formdev.flatlaf.util.DerivedColor;
/*      */ import com.formdev.flatlaf.util.Graphics2DProxy;
/*      */ import com.formdev.flatlaf.util.HiDPIUtils;
/*      */ import com.formdev.flatlaf.util.SystemInfo;
/*      */ import com.formdev.flatlaf.util.UIScale;
/*      */ import java.awt.BasicStroke;
/*      */ import java.awt.Color;
/*      */ import java.awt.Component;
/*      */ import java.awt.Container;
/*      */ import java.awt.Dimension;
/*      */ import java.awt.Font;
/*      */ import java.awt.Graphics;
/*      */ import java.awt.Graphics2D;
/*      */ import java.awt.GraphicsConfiguration;
/*      */ import java.awt.GraphicsDevice;
/*      */ import java.awt.Insets;
/*      */ import java.awt.KeyboardFocusManager;
/*      */ import java.awt.Paint;
/*      */ import java.awt.Rectangle;
/*      */ import java.awt.RenderingHints;
/*      */ import java.awt.Shape;
/*      */ import java.awt.Stroke;
/*      */ import java.awt.SystemColor;
/*      */ import java.awt.Window;
/*      */ import java.awt.event.FocusEvent;
/*      */ import java.awt.event.FocusListener;
/*      */ import java.awt.geom.Ellipse2D;
/*      */ import java.awt.geom.Path2D;
/*      */ import java.awt.geom.Point2D;
/*      */ import java.awt.geom.Rectangle2D;
/*      */ import java.awt.geom.RoundRectangle2D;
/*      */ import java.util.IdentityHashMap;
/*      */ import java.util.WeakHashMap;
/*      */ import java.util.function.Predicate;
/*      */ import java.util.function.Supplier;
/*      */ import javax.swing.Icon;
/*      */ import javax.swing.JComponent;
/*      */ import javax.swing.JTable;
/*      */ import javax.swing.LookAndFeel;
/*      */ import javax.swing.SwingUtilities;
/*      */ import javax.swing.UIDefaults;
/*      */ import javax.swing.UIManager;
/*      */ import javax.swing.border.Border;
/*      */ import javax.swing.border.CompoundBorder;
/*      */ import javax.swing.plaf.ComponentUI;
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
/*      */ public class FlatUIUtils
/*      */ {
/*      */   private static boolean useSharedUIs = true;
/*   82 */   private static final WeakHashMap<LookAndFeel, IdentityHashMap<Object, ComponentUI>> sharedUIinstances = new WeakHashMap<>(); private static UIDefaults lightAWTPeerDefaults;
/*      */   
/*      */   public static Rectangle addInsets(Rectangle r, Insets insets) {
/*   85 */     return new Rectangle(r.x - insets.left, r.y - insets.top, r.width + insets.left + insets.right, r.height + insets.top + insets.bottom);
/*      */   }
/*      */   public static final double MOVE_TO = -1.000000000001E12D; public static final double QUAD_TO = -1.000000000002E12D;
/*      */   public static final double CURVE_TO = -1.000000000003E12D;
/*      */   public static final double ROUNDED = -1.000000000004E12D;
/*      */   public static final double CLOSE_PATH = -1.000000000005E12D;
/*      */   
/*      */   public static Rectangle subtractInsets(Rectangle r, Insets insets) {
/*   93 */     return new Rectangle(r.x + insets.left, r.y + insets.top, r.width - insets.left - insets.right, r.height - insets.top - insets.bottom);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Dimension addInsets(Dimension dim, Insets insets) {
/*  101 */     return new Dimension(dim.width + insets.left + insets.right, dim.height + insets.top + insets.bottom);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static Insets addInsets(Insets insets1, Insets insets2) {
/*  107 */     if (insets1 == null)
/*  108 */       return insets2; 
/*  109 */     if (insets2 == null) {
/*  110 */       return insets1;
/*      */     }
/*  112 */     return new Insets(insets1.top + insets2.top, insets1.left + insets2.left, insets1.bottom + insets2.bottom, insets1.right + insets2.right);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setInsets(Insets dest, Insets src) {
/*  120 */     dest.top = src.top;
/*  121 */     dest.left = src.left;
/*  122 */     dest.bottom = src.bottom;
/*  123 */     dest.right = src.right;
/*      */   }
/*      */   
/*      */   public static Color getUIColor(String key, int defaultColorRGB) {
/*  127 */     Color color = UIManager.getColor(key);
/*  128 */     return (color != null) ? color : new Color(defaultColorRGB);
/*      */   }
/*      */   
/*      */   public static Color getUIColor(String key, Color defaultColor) {
/*  132 */     Color color = UIManager.getColor(key);
/*  133 */     return (color != null) ? color : defaultColor;
/*      */   }
/*      */   
/*      */   public static Color getUIColor(String key, String defaultKey) {
/*  137 */     Color color = UIManager.getColor(key);
/*  138 */     return (color != null) ? color : UIManager.getColor(defaultKey);
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean getUIBoolean(String key, boolean defaultValue) {
/*  143 */     Object value = UIManager.get(key);
/*  144 */     return (value instanceof Boolean) ? ((Boolean)value).booleanValue() : defaultValue;
/*      */   }
/*      */   
/*      */   public static int getUIInt(String key, int defaultValue) {
/*  148 */     Object value = UIManager.get(key);
/*  149 */     return (value instanceof Integer) ? ((Integer)value).intValue() : defaultValue;
/*      */   }
/*      */   
/*      */   public static float getUIFloat(String key, float defaultValue) {
/*  153 */     Object value = UIManager.get(key);
/*  154 */     return (value instanceof Number) ? ((Number)value).floatValue() : defaultValue;
/*      */   }
/*      */ 
/*      */   
/*      */   public static <T extends Enum<T>> T getUIEnum(String key, Class<T> enumType, T defaultValue) {
/*  159 */     Object value = UIManager.get(key);
/*  160 */     if (value instanceof String) {
/*      */       try {
/*  162 */         return Enum.valueOf(enumType, (String)value);
/*  163 */       } catch (IllegalArgumentException illegalArgumentException) {}
/*      */     }
/*      */ 
/*      */     
/*  167 */     return defaultValue;
/*      */   }
/*      */ 
/*      */   
/*      */   public static Color getSubUIColor(String key, String subKey) {
/*  172 */     if (subKey != null) {
/*  173 */       Color value = UIManager.getColor(buildSubKey(key, subKey));
/*  174 */       if (value != null)
/*  175 */         return value; 
/*      */     } 
/*  177 */     return UIManager.getColor(key);
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean getSubUIBoolean(String key, String subKey, boolean defaultValue) {
/*  182 */     if (subKey != null) {
/*  183 */       Object value = UIManager.get(buildSubKey(key, subKey));
/*  184 */       if (value instanceof Boolean)
/*  185 */         return ((Boolean)value).booleanValue(); 
/*      */     } 
/*  187 */     return getUIBoolean(key, defaultValue);
/*      */   }
/*      */ 
/*      */   
/*      */   public static int getSubUIInt(String key, String subKey, int defaultValue) {
/*  192 */     if (subKey != null) {
/*  193 */       Object value = UIManager.get(buildSubKey(key, subKey));
/*  194 */       if (value instanceof Integer)
/*  195 */         return ((Integer)value).intValue(); 
/*      */     } 
/*  197 */     return getUIInt(key, defaultValue);
/*      */   }
/*      */ 
/*      */   
/*      */   public static Insets getSubUIInsets(String key, String subKey) {
/*  202 */     if (subKey != null) {
/*  203 */       Insets value = UIManager.getInsets(buildSubKey(key, subKey));
/*  204 */       if (value != null)
/*  205 */         return value; 
/*      */     } 
/*  207 */     return UIManager.getInsets(key);
/*      */   }
/*      */ 
/*      */   
/*      */   public static Dimension getSubUIDimension(String key, String subKey) {
/*  212 */     if (subKey != null) {
/*  213 */       Dimension value = UIManager.getDimension(buildSubKey(key, subKey));
/*  214 */       if (value != null)
/*  215 */         return value; 
/*      */     } 
/*  217 */     return UIManager.getDimension(key);
/*      */   }
/*      */ 
/*      */   
/*      */   public static Icon getSubUIIcon(String key, String subKey) {
/*  222 */     if (subKey != null) {
/*  223 */       Icon value = UIManager.getIcon(buildSubKey(key, subKey));
/*  224 */       if (value != null)
/*  225 */         return value; 
/*      */     } 
/*  227 */     return UIManager.getIcon(key);
/*      */   }
/*      */ 
/*      */   
/*      */   public static Font getSubUIFont(String key, String subKey) {
/*  232 */     if (subKey != null) {
/*  233 */       Font value = UIManager.getFont(buildSubKey(key, subKey));
/*  234 */       if (value != null)
/*  235 */         return value; 
/*      */     } 
/*  237 */     return UIManager.getFont(key);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static String buildSubKey(String key, String subKey) {
/*  246 */     int dot = key.lastIndexOf('.');
/*  247 */     return (dot >= 0) ? (
/*  248 */       key.substring(0, dot) + '.' + subKey + '.' + key.substring(dot + 1)) : 
/*  249 */       key;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean getBoolean(JComponent c, String systemPropertyKey, String clientPropertyKey, String uiKey, boolean defaultValue) {
/*  257 */     Boolean value = FlatSystemProperties.getBooleanStrict(systemPropertyKey, null);
/*  258 */     if (value != null) {
/*  259 */       return value.booleanValue();
/*      */     }
/*      */     
/*  262 */     value = FlatClientProperties.clientPropertyBooleanStrict(c, clientPropertyKey, null);
/*  263 */     if (value != null) {
/*  264 */       return value.booleanValue();
/*      */     }
/*  266 */     return getUIBoolean(uiKey, defaultValue);
/*      */   }
/*      */   
/*      */   public static boolean isChevron(String arrowType) {
/*  270 */     return !"triangle".equals(arrowType);
/*      */   }
/*      */   
/*      */   public static Color nonUIResource(Color c) {
/*  274 */     return (c instanceof javax.swing.plaf.UIResource) ? new Color(c.getRGB(), true) : c;
/*      */   }
/*      */   
/*      */   public static Font nonUIResource(Font font) {
/*  278 */     return (font instanceof javax.swing.plaf.UIResource) ? font.deriveFont(font.getStyle()) : font;
/*      */   }
/*      */ 
/*      */   
/*      */   public static Border nonUIResource(Border border) {
/*  283 */     return (border instanceof javax.swing.plaf.UIResource) ? new NonUIResourceBorder(border) : border;
/*      */   }
/*      */   
/*      */   static Border unwrapNonUIResourceBorder(Border border) {
/*  287 */     return (border instanceof NonUIResourceBorder) ? ((NonUIResourceBorder)border).delegate : border;
/*      */   }
/*      */   
/*      */   public static int minimumWidth(JComponent c, int minimumWidth) {
/*  291 */     return FlatClientProperties.clientPropertyInt(c, "JComponent.minimumWidth", minimumWidth);
/*      */   }
/*      */   
/*      */   public static int minimumHeight(JComponent c, int minimumHeight) {
/*  295 */     return FlatClientProperties.clientPropertyInt(c, "JComponent.minimumHeight", minimumHeight);
/*      */   }
/*      */   
/*      */   public static boolean isCellEditor(Component c) {
/*  299 */     if (c == null) {
/*  300 */       return false;
/*      */     }
/*      */     
/*  303 */     Component c2 = c;
/*  304 */     for (int i = 0; i <= 2 && c2 != null; i++) {
/*  305 */       Container parent = c2.getParent();
/*  306 */       if (parent instanceof JTable && ((JTable)parent).getEditorComponent() == c2) {
/*  307 */         return true;
/*      */       }
/*  309 */       c2 = parent;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  315 */     String name = c.getName();
/*  316 */     if ("Table.editor".equals(name) || "Tree.cellEditor".equals(name)) {
/*  317 */       return true;
/*      */     }
/*      */ 
/*      */     
/*  321 */     return (c instanceof JComponent && Boolean.TRUE.equals(((JComponent)c).getClientProperty("JComboBox.isTableCellEditor")));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isPermanentFocusOwner(Component c) {
/*  331 */     KeyboardFocusManager keyboardFocusManager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
/*      */     
/*  333 */     if (c instanceof JComponent) {
/*  334 */       Object value = ((JComponent)c).getClientProperty("JComponent.focusOwner");
/*  335 */       if (value instanceof Predicate) {
/*  336 */         return (((Predicate<JComponent>)value).test((JComponent)c) && 
/*  337 */           isInActiveWindow(c, keyboardFocusManager.getActiveWindow()));
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  343 */     if (c.hasFocus()) {
/*  344 */       return true;
/*      */     }
/*  346 */     return (keyboardFocusManager.getPermanentFocusOwner() == c && 
/*  347 */       isInActiveWindow(c, keyboardFocusManager.getActiveWindow()));
/*      */   }
/*      */   
/*      */   static boolean isInActiveWindow(Component c, Window activeWindow) {
/*  351 */     Window window = SwingUtilities.windowForComponent(c);
/*  352 */     return (window == activeWindow || (window != null && window
/*  353 */       .getType() == Window.Type.POPUP && window.getOwner() == activeWindow));
/*      */   }
/*      */ 
/*      */   
/*      */   static boolean isAWTPeer(Component c) {
/*  358 */     if (SystemInfo.isMacOS)
/*  359 */       return c.getClass().getName().startsWith("sun.lwawt.LW"); 
/*  360 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static boolean needsLightAWTPeer(JComponent c) {
/*  369 */     return (isAWTPeer(c) && FlatLaf.isLafDark());
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   static void runWithLightAWTPeerUIDefaults(Runnable runnable) {
/*  375 */     if (lightAWTPeerDefaults == null) {
/*      */ 
/*      */       
/*  378 */       FlatLaf lightLaf = (UIManager.getInt("Component.focusWidth") >= 2) ? (FlatLaf)new FlatIntelliJLaf() : (FlatLaf)new FlatLightLaf();
/*  379 */       lightAWTPeerDefaults = lightLaf.getDefaults();
/*      */     } 
/*      */     
/*  382 */     FlatLaf.runWithUIDefaultsGetter(key -> { Object value = lightAWTPeerDefaults.get(key); return (value != null) ? value : FlatLaf.NULL_VALUE; }runnable);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isFullScreen(Component c) {
/*  392 */     GraphicsConfiguration gc = c.getGraphicsConfiguration();
/*  393 */     GraphicsDevice gd = (gc != null) ? gc.getDevice() : null;
/*  394 */     Window fullScreenWindow = (gd != null) ? gd.getFullScreenWindow() : null;
/*  395 */     return (fullScreenWindow != null && fullScreenWindow == SwingUtilities.windowForComponent(c));
/*      */   }
/*      */   
/*      */   public static Boolean isRoundRect(Component c) {
/*  399 */     return (c instanceof JComponent) ? 
/*  400 */       FlatClientProperties.clientPropertyBooleanStrict((JComponent)c, "JComponent.roundRect", null) : 
/*      */       
/*  402 */       null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static float getBorderFocusWidth(JComponent c) {
/*  409 */     FlatBorder border = getOutsideFlatBorder(c);
/*  410 */     return (border != null) ? 
/*  411 */       UIScale.scale(border.getFocusWidth(c)) : 
/*  412 */       0.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static float getBorderLineWidth(JComponent c) {
/*  421 */     FlatBorder border = getOutsideFlatBorder(c);
/*  422 */     return (border != null) ? 
/*  423 */       UIScale.scale(border.getLineWidth(c)) : 
/*  424 */       0.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getBorderFocusAndLineWidth(JComponent c) {
/*  434 */     FlatBorder border = getOutsideFlatBorder(c);
/*  435 */     return (border != null) ? 
/*  436 */       Math.round(UIScale.scale(border.getFocusWidth(c)) + 
/*  437 */         UIScale.scale(border.getLineWidth(c))) : 
/*  438 */       0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static float getBorderArc(JComponent c) {
/*  445 */     FlatBorder border = getOutsideFlatBorder(c);
/*  446 */     return (border != null) ? 
/*  447 */       UIScale.scale(border.getArc(c)) : 
/*  448 */       0.0F;
/*      */   }
/*      */   
/*      */   public static boolean hasRoundBorder(JComponent c) {
/*  452 */     return (getBorderArc(c) >= c.getHeight());
/*      */   }
/*      */   
/*      */   public static FlatBorder getOutsideFlatBorder(JComponent c) {
/*  456 */     Border border = c.getBorder();
/*      */     while (true) {
/*  458 */       if (border instanceof FlatBorder)
/*  459 */         return (FlatBorder)border; 
/*  460 */       if (border instanceof CompoundBorder) {
/*  461 */         border = ((CompoundBorder)border).getOutsideBorder(); continue;
/*      */       }  break;
/*  463 */     }  return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Object[] setRenderingHints(Graphics g) {
/*  471 */     Graphics2D g2 = (Graphics2D)g;
/*      */ 
/*      */     
/*  474 */     Object[] oldRenderingHints = { g2.getRenderingHint(RenderingHints.KEY_ANTIALIASING), g2.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL) };
/*      */ 
/*      */     
/*  477 */     g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
/*  478 */     g2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_NORMALIZE);
/*      */     
/*  480 */     return oldRenderingHints;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void resetRenderingHints(Graphics g, Object[] oldRenderingHints) {
/*  487 */     Graphics2D g2 = (Graphics2D)g;
/*  488 */     if (oldRenderingHints[0] != null)
/*  489 */       g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, oldRenderingHints[0]); 
/*  490 */     if (oldRenderingHints[1] != null) {
/*  491 */       g2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, oldRenderingHints[1]);
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
/*      */   public static void runWithoutRenderingHints(Graphics g, Object[] oldRenderingHints, Runnable runnable) {
/*  508 */     if (oldRenderingHints == null) {
/*  509 */       runnable.run();
/*      */       
/*      */       return;
/*      */     } 
/*  513 */     Graphics2D g2 = (Graphics2D)g;
/*      */ 
/*      */     
/*  516 */     Object[] oldRenderingHints2 = { g2.getRenderingHint(RenderingHints.KEY_ANTIALIASING), g2.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL) };
/*      */ 
/*      */     
/*  519 */     resetRenderingHints(g2, oldRenderingHints);
/*  520 */     runnable.run();
/*  521 */     resetRenderingHints(g2, oldRenderingHints2);
/*      */   }
/*      */   
/*      */   public static Color deriveColor(Color color, Color baseColor) {
/*  525 */     return (color instanceof DerivedColor) ? (
/*  526 */       (DerivedColor)color).derive(baseColor) : 
/*  527 */       color;
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
/*      */   public static void paintComponentBackground(Graphics2D g, int x, int y, int width, int height, float focusWidth, float arc) {
/*  542 */     paintOutlinedComponent(g, x, y, width, height, focusWidth, 0.0F, 0.0F, 0.0F, arc, null, null, g.getPaint());
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
/*      */   public static void paintOutlinedComponent(Graphics2D g, int x, int y, int width, int height, float focusWidth, float focusWidthFraction, float focusInnerWidth, float borderWidth, float arc, Paint focusColor, Paint borderColor, Paint background) {
/*  605 */     double systemScaleFactor = UIScale.getSystemScaleFactor(g);
/*  606 */     if (systemScaleFactor != 1.0D && systemScaleFactor != 2.0D) {
/*      */       
/*  608 */       HiDPIUtils.paintAtScale1x(g, x, y, width, height, (g2d, x2, y2, width2, height2, scaleFactor) -> paintOutlinedComponentImpl(g2d, x2, y2, width2, height2, (float)(focusWidth * scaleFactor), focusWidthFraction, (float)(focusInnerWidth * scaleFactor), (float)(borderWidth * scaleFactor), (float)(arc * scaleFactor), focusColor, borderColor, background));
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  618 */     paintOutlinedComponentImpl(g, x, y, width, height, focusWidth, focusWidthFraction, focusInnerWidth, borderWidth, arc, focusColor, borderColor, background);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static void paintOutlinedComponentImpl(Graphics2D g, int x, int y, int width, int height, float focusWidth, float focusWidthFraction, float focusInnerWidth, float borderWidth, float arc, Paint focusColor, Paint borderColor, Paint background) {
/*  627 */     float x1 = x + focusWidth;
/*  628 */     float y1 = y + focusWidth;
/*  629 */     float w1 = width - focusWidth * 2.0F;
/*  630 */     float h1 = height - focusWidth * 2.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  635 */     if (background != null) {
/*  636 */       g.setPaint(background);
/*  637 */       g.fill(createComponentRectangle(x1, y1, w1, h1, arc));
/*      */     } 
/*      */ 
/*      */     
/*  641 */     if (borderColor != null && borderColor.equals(focusColor)) {
/*  642 */       borderColor = null;
/*  643 */       focusInnerWidth = Math.max(focusInnerWidth, borderWidth);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  651 */     float paintedFocusWidth = focusWidth * focusWidthFraction + focusInnerWidth;
/*  652 */     if (focusColor != null && paintedFocusWidth != 0.0F) {
/*      */       
/*  654 */       float inset = focusWidth - focusWidth * focusWidthFraction;
/*  655 */       float x2 = x + inset;
/*  656 */       float y2 = y + inset;
/*  657 */       float w2 = width - inset * 2.0F;
/*  658 */       float h2 = height - inset * 2.0F;
/*      */       
/*  660 */       float outerArc = arc + focusWidth * 2.0F;
/*  661 */       float innerArc = arc - focusInnerWidth * 2.0F;
/*      */ 
/*      */       
/*  664 */       if (focusWidth > 0.0F && arc > 0.0F && arc < UIScale.scale(10)) {
/*  665 */         outerArc -= UIScale.scale(2.0F);
/*      */       }
/*      */       
/*  668 */       if (focusWidthFraction != 1.0F) {
/*  669 */         outerArc = arc + (outerArc - arc) * focusWidthFraction;
/*      */       }
/*  671 */       g.setPaint(focusColor);
/*  672 */       paintOutline(g, x2, y2, w2, h2, paintedFocusWidth, outerArc, innerArc);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  680 */     if (borderColor != null && borderWidth != 0.0F) {
/*  681 */       g.setPaint(borderColor);
/*  682 */       paintOutline(g, x1, y1, w1, h1, borderWidth, arc);
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
/*      */   public static void paintOutline(Graphics2D g, float x, float y, float w, float h, float lineWidth, float arc) {
/*  703 */     paintOutline(g, x, y, w, h, lineWidth, arc, arc - lineWidth * 2.0F);
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
/*      */   public static void paintOutline(Graphics2D g, float x, float y, float w, float h, float lineWidth, float arc, float innerArc) {
/*  724 */     if (lineWidth == 0.0F || w <= 0.0F || h <= 0.0F) {
/*      */       return;
/*      */     }
/*  727 */     float t = lineWidth;
/*  728 */     float t2x = t * 2.0F;
/*      */     
/*  730 */     Path2D border = new Path2D.Float(0);
/*  731 */     border.append(createComponentRectangle(x, y, w, h, arc), false);
/*  732 */     border.append(createComponentRectangle(x + t, y + t, w - t2x, h - t2x, innerArc), false);
/*  733 */     g.fill(border);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Shape createComponentRectangle(float x, float y, float w, float h, float arc) {
/*  741 */     if (arc <= 0.0F) {
/*  742 */       return new Rectangle2D.Float(x, y, w, h);
/*      */     }
/*  744 */     if (w == h && arc >= w) {
/*  745 */       return new Ellipse2D.Float(x, y, w, h);
/*      */     }
/*  747 */     arc = Math.min(arc, Math.min(w, h));
/*  748 */     return new RoundRectangle2D.Float(x, y, w, h, arc, arc);
/*      */   }
/*      */   
/*      */   static void paintFilledRectangle(Graphics g, Color color, float x, float y, float w, float h) {
/*  752 */     Graphics2D g2 = (Graphics2D)g.create();
/*      */     try {
/*  754 */       setRenderingHints(g2);
/*  755 */       g2.setColor(color);
/*  756 */       g2.fill(new Rectangle2D.Float(x, y, w, h));
/*      */     } finally {
/*  758 */       g2.dispose();
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
/*      */   public static void paintSelection(Graphics2D g, int x, int y, int width, int height, Insets insets, float arcTopLeft, float arcTopRight, float arcBottomLeft, float arcBottomRight, int flags) {
/*  774 */     if (insets != null) {
/*  775 */       x += insets.left;
/*  776 */       y += insets.top;
/*  777 */       width -= insets.left + insets.right;
/*  778 */       height -= insets.top + insets.bottom;
/*      */     } 
/*      */     
/*  781 */     if (arcTopLeft > 0.0F || arcTopRight > 0.0F || arcBottomLeft > 0.0F || arcBottomRight > 0.0F) {
/*  782 */       double systemScaleFactor = UIScale.getSystemScaleFactor(g);
/*  783 */       if (systemScaleFactor != 1.0D && systemScaleFactor != 2.0D) {
/*      */         
/*  785 */         HiDPIUtils.paintAtScale1x(g, x, y, width, height, (g2d, x2, y2, width2, height2, scaleFactor) -> paintRoundedSelectionImpl(g2d, x2, y2, width2, height2, (float)(arcTopLeft * scaleFactor), (float)(arcTopRight * scaleFactor), (float)(arcBottomLeft * scaleFactor), (float)(arcBottomRight * scaleFactor)));
/*      */ 
/*      */       
/*      */       }
/*      */       else {
/*      */ 
/*      */         
/*  792 */         paintRoundedSelectionImpl(g, x, y, width, height, arcTopLeft, arcTopRight, arcBottomLeft, arcBottomRight);
/*      */       } 
/*      */     } else {
/*  795 */       g.fillRect(x, y, width, height);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private static void paintRoundedSelectionImpl(Graphics2D g, int x, int y, int width, int height, float arcTopLeft, float arcTopRight, float arcBottomLeft, float arcBottomRight) {
/*  801 */     Object[] oldRenderingHints = setRenderingHints(g);
/*  802 */     g.fill(createRoundRectanglePath(x, y, width, height, arcTopLeft, arcTopRight, arcBottomLeft, arcBottomRight));
/*  803 */     resetRenderingHints(g, oldRenderingHints);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void paintGrip(Graphics g, int x, int y, int width, int height, boolean horizontal, int dotCount, int dotSize, int gap, boolean centerPrecise) {
/*      */     float gx, gy;
/*  809 */     dotSize = UIScale.scale(dotSize);
/*  810 */     gap = UIScale.scale(gap);
/*  811 */     int gripSize = dotSize * dotCount + gap * (dotCount - 1);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  816 */     if (horizontal) {
/*  817 */       gx = (x + Math.round((width - gripSize) / 2.0F));
/*  818 */       gy = y + (height - dotSize) / 2.0F;
/*      */       
/*  820 */       if (!centerPrecise) {
/*  821 */         gy = Math.round(gy);
/*      */       }
/*      */     } else {
/*  824 */       gx = x + (width - dotSize) / 2.0F;
/*  825 */       gy = (y + Math.round((height - gripSize) / 2.0F));
/*      */       
/*  827 */       if (!centerPrecise) {
/*  828 */         gx = Math.round(gx);
/*      */       }
/*      */     } 
/*      */     
/*  832 */     for (int i = 0; i < dotCount; i++) {
/*  833 */       ((Graphics2D)g).fill(new Ellipse2D.Float(gx, gy, dotSize, dotSize));
/*  834 */       if (horizontal) {
/*  835 */         gx += (dotSize + gap);
/*      */       } else {
/*  837 */         gy += (dotSize + gap);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void paintParentBackground(Graphics g, JComponent c) {
/*  846 */     Color background = getParentBackground(c);
/*  847 */     if (background != null) {
/*  848 */       g.setColor(background);
/*  849 */       g.fillRect(0, 0, c.getWidth(), c.getHeight());
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Color getParentBackground(JComponent c) {
/*  857 */     Container parent = findOpaqueParent(c);
/*      */ 
/*      */     
/*  860 */     Color background = (parent != null) ? parent.getBackground() : null;
/*  861 */     if (background != null) {
/*  862 */       return background;
/*      */     }
/*  864 */     if (isAWTPeer(c))
/*      */     {
/*  866 */       return (c instanceof javax.swing.JTextField || c instanceof javax.swing.JScrollPane || c.getBackground() == null) ? 
/*  867 */         SystemColor.window : 
/*  868 */         c.getBackground();
/*      */     }
/*      */     
/*  871 */     return UIManager.getColor("Panel.background");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static Container findOpaqueParent(Container c) {
/*  878 */     while ((c = c.getParent()) != null) {
/*  879 */       if (c.isOpaque())
/*  880 */         return c; 
/*      */     } 
/*  882 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Path2D createRectangle(float x, float y, float width, float height, float lineWidth) {
/*  889 */     Path2D path = new Path2D.Float(0);
/*  890 */     path.append(new Rectangle2D.Float(x, y, width, height), false);
/*  891 */     path.append(new Rectangle2D.Float(x + lineWidth, y + lineWidth, width - lineWidth * 2.0F, height - lineWidth * 2.0F), false);
/*      */     
/*  893 */     return path;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Path2D createRoundRectangle(float x, float y, float width, float height, float lineWidth, float arcTopLeft, float arcTopRight, float arcBottomLeft, float arcBottomRight) {
/*  902 */     Path2D path = new Path2D.Float(0);
/*  903 */     path.append(createRoundRectanglePath(x, y, width, height, arcTopLeft, arcTopRight, arcBottomLeft, arcBottomRight), false);
/*  904 */     path.append(createRoundRectanglePath(x + lineWidth, y + lineWidth, width - lineWidth * 2.0F, height - lineWidth * 2.0F, arcTopLeft - lineWidth, arcTopRight - lineWidth, arcBottomLeft - lineWidth, arcBottomRight - lineWidth), false);
/*      */     
/*  906 */     return path;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Shape createRoundRectanglePath(float x, float y, float width, float height, float arcTopLeft, float arcTopRight, float arcBottomLeft, float arcBottomRight) {
/*  915 */     if (arcTopLeft <= 0.0F && arcTopRight <= 0.0F && arcBottomLeft <= 0.0F && arcBottomRight <= 0.0F) {
/*  916 */       return new Rectangle2D.Float(x, y, width, height);
/*      */     }
/*      */     
/*  919 */     float maxArc = Math.min(width, height) / 2.0F;
/*  920 */     arcTopLeft = (arcTopLeft > 0.0F) ? Math.min(arcTopLeft, maxArc) : 0.0F;
/*  921 */     arcTopRight = (arcTopRight > 0.0F) ? Math.min(arcTopRight, maxArc) : 0.0F;
/*  922 */     arcBottomLeft = (arcBottomLeft > 0.0F) ? Math.min(arcBottomLeft, maxArc) : 0.0F;
/*  923 */     arcBottomRight = (arcBottomRight > 0.0F) ? Math.min(arcBottomRight, maxArc) : 0.0F;
/*      */     
/*  925 */     float x2 = x + width;
/*  926 */     float y2 = y + height;
/*      */ 
/*      */     
/*  929 */     double c = 0.5522847498307933D;
/*  930 */     double ci = 1.0D - c;
/*  931 */     double ciTopLeft = arcTopLeft * ci;
/*  932 */     double ciTopRight = arcTopRight * ci;
/*  933 */     double ciBottomLeft = arcBottomLeft * ci;
/*  934 */     double ciBottomRight = arcBottomRight * ci;
/*      */     
/*  936 */     Path2D rect = new Path2D.Float(1, 16);
/*  937 */     rect.moveTo((x2 - arcTopRight), y);
/*  938 */     rect.curveTo(x2 - ciTopRight, y, x2, y + ciTopRight, x2, (y + arcTopRight));
/*      */ 
/*      */     
/*  941 */     rect.lineTo(x2, (y2 - arcBottomRight));
/*  942 */     rect.curveTo(x2, y2 - ciBottomRight, x2 - ciBottomRight, y2, (x2 - arcBottomRight), y2);
/*      */ 
/*      */     
/*  945 */     rect.lineTo((x + arcBottomLeft), y2);
/*  946 */     rect.curveTo(x + ciBottomLeft, y2, x, y2 - ciBottomLeft, x, (y2 - arcBottomLeft));
/*      */ 
/*      */     
/*  949 */     rect.lineTo(x, (y + arcTopLeft));
/*  950 */     rect.curveTo(x, y + ciTopLeft, x + ciTopLeft, y, (x + arcTopLeft), y);
/*      */ 
/*      */     
/*  953 */     rect.closePath();
/*      */     
/*  955 */     return rect;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Shape createRoundTrianglePath(float x1, float y1, float x2, float y2, float x3, float y3, float arc) {
/*  966 */     double averageSideLength = (distance(x1, y1, x2, y2) + distance(x2, y2, x3, y3) + distance(x3, y3, x1, y1)) / 3.0D;
/*  967 */     double t1 = 1.0D / averageSideLength * arc;
/*  968 */     double t2 = 1.0D - t1;
/*      */     
/*  970 */     return createPath(new double[] { 
/*  971 */           lerp(x3, x1, t2), lerp(y3, y1, t2), -1.000000000002E12D, x1, y1, 
/*  972 */           lerp(x1, x2, t1), lerp(y1, y2, t1), 
/*  973 */           lerp(x1, x2, t2), lerp(y1, y2, t2), -1.000000000002E12D, x2, y2, 
/*  974 */           lerp(x2, x3, t1), lerp(y2, y3, t1), 
/*  975 */           lerp(x2, x3, t2), lerp(y2, y3, t2), -1.000000000002E12D, x3, y3, 
/*  976 */           lerp(x3, x1, t1), lerp(y3, y1, t1) });
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
/*      */   public static void paintArrow(Graphics2D g, int x, int y, int width, int height, int direction, boolean chevron, int arrowSize, float arrowThickness, float xOffset, float yOffset) {
/* 1004 */     float aw = UIScale.scale(arrowSize + (chevron ? -1 : 0));
/* 1005 */     float ah = chevron ? (aw / 2.0F) : UIScale.scale(arrowSize / 2 + 1);
/*      */ 
/*      */     
/* 1008 */     boolean vert = (direction == 1 || direction == 5);
/* 1009 */     if (!vert) {
/* 1010 */       float temp = aw;
/* 1011 */       aw = ah;
/* 1012 */       ah = temp;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1017 */     int extra = chevron ? 1 : 0;
/*      */ 
/*      */     
/* 1020 */     float ox = (width - aw + extra) / 2.0F + UIScale.scale(xOffset);
/* 1021 */     float oy = (height - ah + extra) / 2.0F + UIScale.scale(yOffset);
/* 1022 */     float ax = x + ((direction == 7) ? (-Math.round(-(ox + aw)) - aw) : Math.round(ox));
/* 1023 */     float ay = y + ((direction == 1) ? (-Math.round(-(oy + ah)) - ah) : Math.round(oy));
/*      */ 
/*      */     
/* 1026 */     g.translate(ax, ay);
/*      */ 
/*      */ 
/*      */     
/* 1030 */     Shape arrowShape = createArrowShape(direction, chevron, aw, ah);
/* 1031 */     if (chevron) {
/* 1032 */       Stroke oldStroke = g.getStroke();
/* 1033 */       g.setStroke(new BasicStroke(UIScale.scale(arrowThickness)));
/* 1034 */       drawShapePure(g, arrowShape);
/* 1035 */       g.setStroke(oldStroke);
/*      */     } else {
/*      */       
/* 1038 */       g.fill(arrowShape);
/*      */     } 
/* 1040 */     g.translate(-ax, -ay);
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
/*      */   public static Shape createArrowShape(int direction, boolean chevron, float w, float h) {
/* 1058 */     switch (direction) { case 1:
/* 1059 */         return createPath(!chevron, new double[] { 0.0D, h, (w / 2.0F), 0.0D, w, h });
/* 1060 */       case 5: return createPath(!chevron, new double[] { 0.0D, 0.0D, (w / 2.0F), h, w, 0.0D });
/* 1061 */       case 7: return createPath(!chevron, new double[] { w, 0.0D, 0.0D, (h / 2.0F), w, h });
/* 1062 */       case 3: return createPath(!chevron, new double[] { 0.0D, 0.0D, w, (h / 2.0F), 0.0D, h }); }
/* 1063 */      return new Path2D.Float();
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
/*      */ 
/*      */ 
/*      */   
/*      */   public static Path2D createPath(double... points) {
/* 1100 */     return createPath(true, points);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Path2D createPath(boolean close, double... points) {
/* 1107 */     Path2D path = new Path2D.Float(1, points.length / 2 + (close ? 1 : 0));
/* 1108 */     path.moveTo(points[0], points[1]);
/* 1109 */     for (int i = 2; i < points.length; ) {
/* 1110 */       double p = points[i];
/* 1111 */       if (p == -1.000000000001E12D) {
/*      */ 
/*      */         
/* 1114 */         path.moveTo(points[i + 1], points[i + 2]);
/* 1115 */         i += 3; continue;
/* 1116 */       }  if (p == -1.000000000002E12D) {
/*      */ 
/*      */         
/* 1119 */         path.quadTo(points[i + 1], points[i + 2], points[i + 3], points[i + 4]);
/* 1120 */         i += 5; continue;
/* 1121 */       }  if (p == -1.000000000003E12D) {
/*      */ 
/*      */         
/* 1124 */         path.curveTo(points[i + 1], points[i + 2], points[i + 3], points[i + 4], points[i + 5], points[i + 6]);
/* 1125 */         i += 7; continue;
/* 1126 */       }  if (p == -1.000000000004E12D) {
/*      */ 
/*      */         
/* 1129 */         double x = points[i + 1];
/* 1130 */         double y = points[i + 2];
/* 1131 */         double arc = points[i + 3];
/*      */ 
/*      */         
/* 1134 */         int ip2 = i + 4;
/* 1135 */         if (points[ip2] == -1.000000000002E12D || points[ip2] == -1.000000000004E12D) {
/* 1136 */           ip2++;
/*      */         }
/*      */         
/* 1139 */         Point2D p1 = path.getCurrentPoint();
/* 1140 */         double x1 = p1.getX();
/* 1141 */         double y1 = p1.getY();
/* 1142 */         double x2 = points[ip2];
/* 1143 */         double y2 = points[ip2 + 1];
/*      */         
/* 1145 */         double d1 = distance(x, y, x1, y1);
/* 1146 */         double d2 = distance(x, y, x2, y2);
/* 1147 */         double t1 = 1.0D - 1.0D / d1 * arc;
/* 1148 */         double t2 = 1.0D / d2 * arc;
/*      */         
/* 1150 */         path.lineTo(lerp(x1, x, t1), lerp(y1, y, t1));
/* 1151 */         path.quadTo(x, y, lerp(x, x2, t2), lerp(y, y2, t2));
/*      */         
/* 1153 */         i += 4; continue;
/* 1154 */       }  if (p == -1.000000000005E12D) {
/*      */ 
/*      */         
/* 1157 */         path.closePath();
/* 1158 */         i++;
/*      */         
/*      */         continue;
/*      */       } 
/* 1162 */       path.lineTo(p, points[i + 1]);
/* 1163 */       i += 2;
/*      */     } 
/*      */     
/* 1166 */     if (close)
/* 1167 */       path.closePath(); 
/* 1168 */     return path;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static double lerp(double v1, double v2, double t) {
/* 1177 */     return v1 * (1.0D - t) + v2 * t;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static double distance(double x1, double y1, double x2, double y2) {
/* 1184 */     double dx = x2 - x1;
/* 1185 */     double dy = y2 - y1;
/* 1186 */     return Math.sqrt(dx * dx + dy * dy);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void drawShapePure(Graphics2D g, Shape shape) {
/* 1196 */     Object oldStrokeControl = g.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
/* 1197 */     g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
/*      */     
/* 1199 */     g.translate(0.5D, 0.5D);
/* 1200 */     g.draw(shape);
/* 1201 */     g.translate(-0.5D, -0.5D);
/*      */     
/* 1203 */     g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, oldStrokeControl);
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
/*      */   public static void drawString(JComponent c, Graphics g, String text, int x, int y) {
/* 1216 */     HiDPIUtils.drawStringWithYCorrection(c, (Graphics2D)g, text, x, y);
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
/*      */   public static void drawStringUnderlineCharAt(JComponent c, Graphics g, String text, int underlinedIndex, int x, int y) {
/*      */     Graphics2DProxy graphics2DProxy;
/* 1230 */     if (underlinedIndex >= 0 && UIScale.getUserScaleFactor() > 1.0F) {
/* 1231 */       graphics2DProxy = new Graphics2DProxy((Graphics2D)g)
/*      */         {
/*      */           public void fillRect(int x, int y, int width, int height) {
/* 1234 */             if (height == 1) {
/*      */ 
/*      */               
/* 1237 */               height = Math.round(UIScale.scale(0.9F));
/* 1238 */               y += height - 1;
/*      */             } 
/*      */             
/* 1241 */             super.fillRect(x, y, width, height);
/*      */           }
/*      */         };
/*      */     }
/*      */     
/* 1246 */     HiDPIUtils.drawStringUnderlineCharAtWithYCorrection(c, (Graphics2D)graphics2DProxy, text, underlinedIndex, x, y);
/*      */   }
/*      */   
/*      */   public static boolean hasOpaqueBeenExplicitlySet(JComponent c) {
/* 1250 */     boolean oldOpaque = c.isOpaque();
/* 1251 */     LookAndFeel.installProperty(c, "opaque", Boolean.valueOf(!oldOpaque));
/* 1252 */     boolean explicitlySet = (c.isOpaque() == oldOpaque);
/* 1253 */     LookAndFeel.installProperty(c, "opaque", Boolean.valueOf(oldOpaque));
/* 1254 */     return explicitlySet;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isUseSharedUIs() {
/* 1263 */     return useSharedUIs;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean setUseSharedUIs(boolean useSharedUIs) {
/* 1273 */     boolean old = FlatUIUtils.useSharedUIs;
/* 1274 */     FlatUIUtils.useSharedUIs = useSharedUIs;
/* 1275 */     return old;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static ComponentUI createSharedUI(Object key, Supplier<ComponentUI> newInstanceSupplier) {
/* 1286 */     if (!useSharedUIs) {
/* 1287 */       return newInstanceSupplier.get();
/*      */     }
/* 1289 */     return ((IdentityHashMap<Object, ComponentUI>)sharedUIinstances
/* 1290 */       .computeIfAbsent(UIManager.getLookAndFeel(), k -> new IdentityHashMap<>()))
/* 1291 */       .computeIfAbsent(key, k -> (ComponentUI)newInstanceSupplier.get());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean canUseSharedUI(JComponent c) {
/* 1299 */     return !FlatStylingSupport.hasStyleProperty(c);
/*      */   }
/*      */ 
/*      */   
/*      */   public static class RepaintFocusListener
/*      */     implements FocusListener
/*      */   {
/*      */     private final Component repaintComponent;
/*      */     
/*      */     private final Predicate<Component> repaintCondition;
/*      */     
/*      */     public RepaintFocusListener(Component repaintComponent, Predicate<Component> repaintCondition) {
/* 1311 */       this.repaintComponent = repaintComponent;
/* 1312 */       this.repaintCondition = repaintCondition;
/*      */     }
/*      */ 
/*      */     
/*      */     public void focusGained(FocusEvent e) {
/* 1317 */       if (this.repaintCondition == null || this.repaintCondition.test(this.repaintComponent)) {
/* 1318 */         this.repaintComponent.repaint();
/*      */       }
/*      */     }
/*      */     
/*      */     public void focusLost(FocusEvent e) {
/* 1323 */       if (this.repaintCondition == null || this.repaintCondition.test(this.repaintComponent)) {
/* 1324 */         this.repaintComponent.repaint();
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private static class NonUIResourceBorder
/*      */     implements Border
/*      */   {
/*      */     private final Border delegate;
/*      */     
/*      */     NonUIResourceBorder(Border delegate) {
/* 1336 */       this.delegate = delegate;
/*      */     }
/*      */ 
/*      */     
/*      */     public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
/* 1341 */       this.delegate.paintBorder(c, g, x, y, width, height);
/*      */     }
/*      */ 
/*      */     
/*      */     public Insets getBorderInsets(Component c) {
/* 1346 */       return this.delegate.getBorderInsets(c);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isBorderOpaque() {
/* 1351 */       return this.delegate.isBorderOpaque();
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatUIUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */