/*      */ package com.formdev.flatlaf.extras;
/*      */ 
/*      */ import com.formdev.flatlaf.FlatIconColors;
/*      */ import com.formdev.flatlaf.FlatLaf;
/*      */ import com.formdev.flatlaf.util.Graphics2DProxy;
/*      */ import com.formdev.flatlaf.util.GrayFilter;
/*      */ import com.formdev.flatlaf.util.LoggingFacade;
/*      */ import com.formdev.flatlaf.util.MultiResolutionImageSupport;
/*      */ import com.formdev.flatlaf.util.SoftCache;
/*      */ import com.formdev.flatlaf.util.UIScale;
/*      */ import com.github.weisj.jsvg.SVGDocument;
/*      */ import com.github.weisj.jsvg.geometry.size.FloatSize;
/*      */ import com.github.weisj.jsvg.parser.SVGLoader;
/*      */ import java.awt.Color;
/*      */ import java.awt.Component;
/*      */ import java.awt.Dimension;
/*      */ import java.awt.Graphics;
/*      */ import java.awt.Graphics2D;
/*      */ import java.awt.Image;
/*      */ import java.awt.Paint;
/*      */ import java.awt.Rectangle;
/*      */ import java.awt.RenderingHints;
/*      */ import java.awt.image.BufferedImage;
/*      */ import java.awt.image.RGBImageFilter;
/*      */ import java.beans.PropertyChangeEvent;
/*      */ import java.io.File;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.net.MalformedURLException;
/*      */ import java.net.URI;
/*      */ import java.net.URL;
/*      */ import java.util.Collections;
/*      */ import java.util.HashMap;
/*      */ import java.util.Map;
/*      */ import java.util.function.Function;
/*      */ import javax.swing.Icon;
/*      */ import javax.swing.ImageIcon;
/*      */ import javax.swing.UIManager;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class FlatSVGIcon
/*      */   extends ImageIcon
/*      */   implements FlatLaf.DisabledIconProvider
/*      */ {
/*   66 */   private static final SoftCache<String, SVGDocument> svgCache = new SoftCache();
/*   67 */   private static final SVGLoader svgLoader = new SVGLoader();
/*      */ 
/*      */   
/*      */   private final String name;
/*      */ 
/*      */   
/*      */   private final int width;
/*      */ 
/*      */   
/*      */   private final int height;
/*      */   
/*      */   private final float scale;
/*      */   
/*      */   private final boolean disabled;
/*      */   
/*      */   private final ClassLoader classLoader;
/*      */   
/*      */   private final URL url;
/*      */   
/*      */   private ColorFilter colorFilter;
/*      */   
/*      */   private SVGDocument document;
/*      */   
/*      */   private boolean dark;
/*      */   
/*      */   private boolean loadFailed;
/*      */   
/*      */   private static Boolean darkLaf;
/*      */ 
/*      */   
/*      */   public FlatSVGIcon(String name) {
/*   98 */     this(name, -1, -1, 1.0F, false, null, null);
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
/*      */   public FlatSVGIcon(String name, ClassLoader classLoader) {
/*  118 */     this(name, -1, -1, 1.0F, false, classLoader, null);
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
/*      */   public FlatSVGIcon(String name, int width, int height) {
/*  137 */     this(name, width, height, 1.0F, false, null, null);
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
/*      */   public FlatSVGIcon(String name, int width, int height, ClassLoader classLoader) {
/*  158 */     this(name, width, height, 1.0F, false, classLoader, null);
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
/*      */   public FlatSVGIcon(String name, float scale) {
/*  178 */     this(name, -1, -1, scale, false, null, null);
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
/*      */   public FlatSVGIcon(String name, float scale, ClassLoader classLoader) {
/*  200 */     this(name, -1, -1, scale, false, classLoader, null);
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
/*      */   public FlatSVGIcon(URL url) {
/*  220 */     this(null, -1, -1, 1.0F, false, null, url);
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
/*      */   public FlatSVGIcon(URI uri) {
/*  236 */     this(null, -1, -1, 1.0F, false, null, uri2url(uri));
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
/*      */   public FlatSVGIcon(File file) {
/*  251 */     this(null, -1, -1, 1.0F, false, null, uri2url(file.toURI()));
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
/*      */   public FlatSVGIcon(InputStream in) throws IOException {
/*  267 */     this(null, -1, -1, 1.0F, false, null, null);
/*      */     
/*  269 */     InputStream in2 = in; try {
/*  270 */       this.document = svgLoader.load(in2);
/*      */       
/*  272 */       if (this.document == null) {
/*  273 */         this.loadFailed = true;
/*  274 */         LoggingFacade.INSTANCE.logSevere("FlatSVGIcon: failed to load SVG icon from input stream", null);
/*      */       } 
/*  276 */       if (in2 != null) in2.close(); 
/*      */     } catch (Throwable throwable) {
/*      */       if (in2 != null)
/*      */         try {
/*      */           in2.close();
/*      */         } catch (Throwable throwable1) {
/*      */           throwable.addSuppressed(throwable1);
/*      */         }  
/*      */       throw throwable;
/*      */     } 
/*      */   } public FlatSVGIcon(FlatSVGIcon icon) {
/*  287 */     this(icon.name, icon.width, icon.height, icon.scale, icon.disabled, icon.classLoader, icon.url);
/*  288 */     this.colorFilter = icon.colorFilter;
/*  289 */     this.document = icon.document;
/*  290 */     this.dark = icon.dark;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected FlatSVGIcon(String name, int width, int height, float scale, boolean disabled, ClassLoader classLoader, URL url) {
/*  296 */     this.name = name;
/*  297 */     this.width = width;
/*  298 */     this.height = height;
/*  299 */     this.scale = scale;
/*  300 */     this.disabled = disabled;
/*  301 */     this.classLoader = classLoader;
/*  302 */     this.url = url;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getName() {
/*  311 */     return this.name;
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
/*      */   public int getWidth() {
/*  324 */     return this.width;
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
/*      */   public int getHeight() {
/*  337 */     return this.height;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getScale() {
/*  346 */     return this.scale;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isDisabled() {
/*  356 */     return this.disabled;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ClassLoader getClassLoader() {
/*  365 */     return this.classLoader;
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
/*      */   public FlatSVGIcon derive(int width, int height) {
/*  378 */     if (width == this.width && height == this.height) {
/*  379 */       return this;
/*      */     }
/*  381 */     FlatSVGIcon icon = new FlatSVGIcon(this.name, width, height, this.scale, this.disabled, this.classLoader, this.url);
/*  382 */     icon.colorFilter = this.colorFilter;
/*  383 */     icon.document = this.document;
/*  384 */     icon.dark = this.dark;
/*  385 */     return icon;
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
/*      */   public FlatSVGIcon derive(float scale) {
/*  397 */     if (scale == this.scale) {
/*  398 */       return this;
/*      */     }
/*  400 */     FlatSVGIcon icon = new FlatSVGIcon(this.name, this.width, this.height, scale, this.disabled, this.classLoader, this.url);
/*  401 */     icon.colorFilter = this.colorFilter;
/*  402 */     icon.document = this.document;
/*  403 */     icon.dark = this.dark;
/*  404 */     return icon;
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
/*      */   public Icon getDisabledIcon() {
/*  416 */     if (this.disabled) {
/*  417 */       return this;
/*      */     }
/*  419 */     FlatSVGIcon icon = new FlatSVGIcon(this.name, this.width, this.height, this.scale, true, this.classLoader, this.url);
/*  420 */     icon.colorFilter = this.colorFilter;
/*  421 */     icon.document = this.document;
/*  422 */     icon.dark = this.dark;
/*  423 */     return icon;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ColorFilter getColorFilter() {
/*  432 */     return this.colorFilter;
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
/*      */   public void setColorFilter(ColorFilter colorFilter) {
/*  453 */     this.colorFilter = colorFilter;
/*      */   }
/*      */   
/*      */   private void update() {
/*  457 */     if (this.loadFailed) {
/*      */       return;
/*      */     }
/*  460 */     if (this.dark == isDarkLaf() && this.document != null) {
/*      */       return;
/*      */     }
/*  463 */     this.dark = isDarkLaf();
/*      */ 
/*      */     
/*  466 */     if (this.document != null && this.name == null) {
/*      */       return;
/*      */     }
/*  469 */     URL url = this.url;
/*  470 */     if (url == null) {
/*  471 */       url = getIconURL(this.name, this.dark);
/*  472 */       if (url == null && this.dark) {
/*  473 */         url = getIconURL(this.name, false);
/*      */       }
/*  475 */       if (url == null) {
/*  476 */         this.loadFailed = true;
/*  477 */         LoggingFacade.INSTANCE.logConfig("FlatSVGIcon: resource '" + this.name + "' not found (if using Java modules, check whether icon package is opened in module-info.java)", null);
/*      */         
/*      */         return;
/*      */       } 
/*      */     } 
/*  482 */     this.document = loadSVG(url);
/*  483 */     this.loadFailed = (this.document == null);
/*      */   }
/*      */ 
/*      */   
/*      */   static synchronized SVGDocument loadSVG(URL url) {
/*  488 */     String cacheKey = url.toString();
/*  489 */     SVGDocument document = (SVGDocument)svgCache.get(cacheKey);
/*  490 */     if (document != null) {
/*  491 */       return document;
/*      */     }
/*      */     
/*  494 */     document = svgLoader.load(url);
/*      */     
/*  496 */     if (document == null) {
/*  497 */       LoggingFacade.INSTANCE.logSevere("FlatSVGIcon: failed to load '" + url + "'", null);
/*  498 */       return null;
/*      */     } 
/*      */     
/*  501 */     svgCache.put(cacheKey, document);
/*      */     
/*  503 */     return document;
/*      */   }
/*      */   
/*      */   private URL getIconURL(String name, boolean dark) {
/*  507 */     if (dark) {
/*  508 */       int dotIndex = name.lastIndexOf('.');
/*  509 */       name = name.substring(0, dotIndex) + "_dark" + name.substring(dotIndex);
/*      */     } 
/*      */     
/*  512 */     ClassLoader cl = (this.classLoader != null) ? this.classLoader : FlatSVGIcon.class.getClassLoader();
/*  513 */     return cl.getResource(name);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasFound() {
/*  522 */     update();
/*  523 */     return (this.document != null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getIconWidth() {
/*  531 */     if (this.width > 0) {
/*  532 */       return scaleSize(this.width);
/*      */     }
/*  534 */     update();
/*  535 */     return scaleSize((this.document != null) ? Math.round((this.document.size()).width) : 16);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getIconHeight() {
/*  543 */     if (this.height > 0) {
/*  544 */       return scaleSize(this.height);
/*      */     }
/*  546 */     update();
/*  547 */     return scaleSize((this.document != null) ? Math.round((this.document.size()).height) : 16);
/*      */   }
/*      */   
/*      */   private int scaleSize(int size) {
/*  551 */     int scaledSize = UIScale.scale(size);
/*  552 */     if (this.scale != 1.0F)
/*  553 */       scaledSize = Math.round(scaledSize * this.scale); 
/*  554 */     return scaledSize;
/*      */   }
/*      */ 
/*      */   
/*      */   public void paintIcon(Component c, Graphics g, int x, int y) {
/*  559 */     update();
/*      */ 
/*      */     
/*  562 */     Rectangle clipBounds = g.getClipBounds();
/*  563 */     if (clipBounds != null && !clipBounds.intersects(new Rectangle(x, y, getIconWidth(), getIconHeight()))) {
/*      */       return;
/*      */     }
/*      */     
/*  567 */     RGBImageFilter grayFilter = null;
/*  568 */     if (this.disabled) {
/*  569 */       Object grayFilterObj = UIManager.get("Component.grayFilter");
/*      */ 
/*      */       
/*  572 */       grayFilter = (grayFilterObj instanceof RGBImageFilter) ? (RGBImageFilter)grayFilterObj : (RGBImageFilter)GrayFilter.createDisabledIconFilter(this.dark);
/*      */     } 
/*      */     
/*  575 */     GraphicsFilter graphicsFilter = new GraphicsFilter((Graphics2D)g.create(), this.colorFilter, ColorFilter.getInstance(), grayFilter);
/*      */     
/*      */     try {
/*  578 */       setRenderingHints((Graphics2D)graphicsFilter);
/*      */       
/*  580 */       paintSvg((Graphics2D)graphicsFilter, x, y);
/*      */     } finally {
/*  582 */       graphicsFilter.dispose();
/*      */     } 
/*      */   }
/*      */   
/*      */   private void paintSvg(Graphics2D g, int x, int y) {
/*  587 */     if (this.document == null) {
/*  588 */       paintSvgError(g, x, y);
/*      */       
/*      */       return;
/*      */     } 
/*  592 */     g.translate(x, y);
/*  593 */     g.clipRect(0, 0, getIconWidth(), getIconHeight());
/*      */     
/*  595 */     UIScale.scaleGraphics(g);
/*  596 */     if (this.width > 0 || this.height > 0) {
/*  597 */       FloatSize svgSize = this.document.size();
/*  598 */       double sx = (this.width > 0) ? (this.width / svgSize.width) : 1.0D;
/*  599 */       double sy = (this.height > 0) ? (this.height / svgSize.height) : 1.0D;
/*  600 */       if (sx != 1.0D || sy != 1.0D)
/*  601 */         g.scale(sx, sy); 
/*      */     } 
/*  603 */     if (this.scale != 1.0F) {
/*  604 */       g.scale(this.scale, this.scale);
/*      */     }
/*      */     try {
/*  607 */       this.document.render(null, g);
/*  608 */     } catch (Exception ex) {
/*  609 */       paintSvgError(g, 0, 0);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void paintSvgError(Graphics2D g, int x, int y) {
/*  614 */     g.setColor(Color.red);
/*  615 */     g.fillRect(x, y, getIconWidth(), getIconHeight());
/*      */   }
/*      */ 
/*      */   
/*      */   public Image getImage() {
/*  620 */     update();
/*      */ 
/*      */     
/*  623 */     int iconWidth = getIconWidth();
/*  624 */     int iconHeight = getIconHeight();
/*      */     
/*  626 */     Dimension[] dimensions = { new Dimension(iconWidth, iconHeight), new Dimension(iconWidth * 2, iconHeight * 2) };
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  631 */     Function<Dimension, Image> producer = size -> {
/*      */         BufferedImage image = new BufferedImage(size.width, size.height, 2);
/*      */         
/*      */         Graphics2D g = image.createGraphics();
/*      */         
/*      */         try {
/*      */           double sx = (size.width > 0) ? (size.width / iconWidth) : 1.0D;
/*      */           double sy = (size.height > 0) ? (size.height / iconHeight) : 1.0D;
/*      */           if (sx != 1.0D || sy != 1.0D) {
/*      */             g.scale(sx, sy);
/*      */           }
/*      */           paintIcon(null, g, 0, 0);
/*      */         } finally {
/*      */           g.dispose();
/*      */         } 
/*      */         return image;
/*      */       };
/*  648 */     return MultiResolutionImageSupport.create(0, dimensions, producer);
/*      */   }
/*      */ 
/*      */   
/*      */   static void setRenderingHints(Graphics2D g) {
/*  653 */     g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
/*      */ 
/*      */     
/*  656 */     g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
/*      */ 
/*      */     
/*  659 */     g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
/*      */   }
/*      */   
/*      */   static URL uri2url(URI uri) {
/*      */     try {
/*  664 */       return uri.toURL();
/*  665 */     } catch (MalformedURLException ex) {
/*  666 */       throw new IllegalArgumentException(ex);
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
/*      */   public static boolean isDarkLaf() {
/*  680 */     if (darkLaf == null) {
/*  681 */       lafChanged();
/*      */       
/*  683 */       UIManager.addPropertyChangeListener(e -> lafChanged());
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  688 */     return darkLaf.booleanValue();
/*      */   }
/*      */   
/*      */   private static void lafChanged() {
/*  692 */     darkLaf = Boolean.valueOf(FlatLaf.isLafDark());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class ColorFilter
/*      */   {
/*      */     private static ColorFilter instance;
/*      */ 
/*      */ 
/*      */     
/*      */     private Map<Integer, String> rgb2keyMap;
/*      */ 
/*      */ 
/*      */     
/*      */     private Map<Color, Color> colorMap;
/*      */ 
/*      */ 
/*      */     
/*      */     private Map<Color, Color> darkColorMap;
/*      */ 
/*      */ 
/*      */     
/*      */     private Function<Color, Color> mapper;
/*      */ 
/*      */ 
/*      */     
/*      */     public static ColorFilter getInstance() {
/*  721 */       if (instance == null) {
/*  722 */         instance = new ColorFilter();
/*      */ 
/*      */         
/*  725 */         instance.rgb2keyMap = new HashMap<>();
/*  726 */         for (FlatIconColors c : FlatIconColors.values())
/*  727 */           instance.rgb2keyMap.put(Integer.valueOf(c.rgb), c.key); 
/*      */       } 
/*  729 */       return instance;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ColorFilter() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ColorFilter(Function<Color, Color> mapper) {
/*  753 */       setMapper(mapper);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Function<Color, Color> getMapper() {
/*  762 */       return this.mapper;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setMapper(Function<Color, Color> mapper) {
/*  780 */       this.mapper = mapper;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Map<Color, Color> getLightColorMap() {
/*  789 */       return (this.colorMap != null) ? 
/*  790 */         Collections.<Color, Color>unmodifiableMap(this.colorMap) : 
/*  791 */         Collections.<Color, Color>emptyMap();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Map<Color, Color> getDarkColorMap() {
/*  800 */       return (this.darkColorMap != null) ? 
/*  801 */         Collections.<Color, Color>unmodifiableMap(this.darkColorMap) : 
/*  802 */         getLightColorMap();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ColorFilter addAll(Map<Color, Color> from2toMap) {
/*  809 */       ensureColorMap();
/*      */       
/*  811 */       this.colorMap.putAll(from2toMap);
/*  812 */       if (this.darkColorMap != null)
/*  813 */         this.darkColorMap.putAll(from2toMap); 
/*  814 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ColorFilter addAll(Map<Color, Color> from2toLightMap, Map<Color, Color> from2toDarkMap) {
/*  823 */       ensureColorMap();
/*  824 */       ensureDarkColorMap();
/*      */       
/*  826 */       this.colorMap.putAll(from2toLightMap);
/*  827 */       this.darkColorMap.putAll(from2toDarkMap);
/*  828 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ColorFilter add(Color from, Color to) {
/*  835 */       ensureColorMap();
/*      */       
/*  837 */       this.colorMap.put(from, to);
/*  838 */       if (this.darkColorMap != null)
/*  839 */         this.darkColorMap.put(from, to); 
/*  840 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ColorFilter add(Color from, Color toLight, Color toDark) {
/*  849 */       ensureColorMap();
/*  850 */       ensureDarkColorMap();
/*      */       
/*  852 */       if (toLight != null)
/*  853 */         this.colorMap.put(from, toLight); 
/*  854 */       if (toDark != null)
/*  855 */         this.darkColorMap.put(from, toDark); 
/*  856 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ColorFilter remove(Color from) {
/*  863 */       if (this.colorMap != null)
/*  864 */         this.colorMap.remove(from); 
/*  865 */       if (this.darkColorMap != null)
/*  866 */         this.darkColorMap.remove(from); 
/*  867 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ColorFilter removeAll() {
/*  876 */       this.colorMap = null;
/*  877 */       this.darkColorMap = null;
/*  878 */       return this;
/*      */     }
/*      */     
/*      */     private void ensureColorMap() {
/*  882 */       if (this.colorMap == null)
/*  883 */         this.colorMap = new HashMap<>(); 
/*      */     }
/*      */     
/*      */     private void ensureDarkColorMap() {
/*  887 */       if (this.darkColorMap == null) {
/*  888 */         this.darkColorMap = new HashMap<>(this.colorMap);
/*      */       }
/*      */     }
/*      */     
/*      */     public Color filter(Color color) {
/*  893 */       color = applyMappings(color);
/*      */ 
/*      */       
/*  896 */       if (this.mapper != null) {
/*  897 */         color = this.mapper.apply(color);
/*      */       }
/*  899 */       return color;
/*      */     }
/*      */     
/*      */     private Color applyMappings(Color color) {
/*  903 */       if (this.colorMap != null) {
/*  904 */         Map<Color, Color> map = (this.darkColorMap != null && FlatSVGIcon.isDarkLaf()) ? this.darkColorMap : this.colorMap;
/*  905 */         Color newColor = map.get(color);
/*  906 */         if (newColor != null) {
/*  907 */           return newColor;
/*      */         }
/*      */       } 
/*  910 */       if (this.rgb2keyMap != null) {
/*      */ 
/*      */         
/*  913 */         String colorKey = this.rgb2keyMap.get(Integer.valueOf(color.getRGB() & 0xFFFFFF));
/*  914 */         if (colorKey == null) {
/*  915 */           return color;
/*      */         }
/*  917 */         Color newColor = UIManager.getColor(colorKey);
/*  918 */         if (newColor == null) {
/*  919 */           return color;
/*      */         }
/*      */         
/*  922 */         return (newColor.getAlpha() != color.getAlpha()) ? 
/*  923 */           new Color(newColor.getRGB() & 0xFFFFFF | color.getRGB() & 0xFF000000) : 
/*  924 */           newColor;
/*      */       } 
/*      */       
/*  927 */       return color;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static Function<Color, Color> createRGBImageFilterFunction(RGBImageFilter rgbImageFilter) {
/*  938 */       return color -> {
/*      */           int oldRGB = color.getRGB();
/*      */           int newRGB = rgbImageFilter.filterRGB(0, 0, oldRGB);
/*      */           return (newRGB != oldRGB) ? new Color(newRGB, true) : color;
/*      */         };
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private static class GraphicsFilter
/*      */     extends Graphics2DProxy
/*      */   {
/*      */     private final FlatSVGIcon.ColorFilter colorFilter;
/*      */     
/*      */     private final FlatSVGIcon.ColorFilter globalColorFilter;
/*      */     
/*      */     private final RGBImageFilter grayFilter;
/*      */ 
/*      */     
/*      */     GraphicsFilter(Graphics2D delegate, FlatSVGIcon.ColorFilter colorFilter, FlatSVGIcon.ColorFilter globalColorFilter, RGBImageFilter grayFilter) {
/*  958 */       super(delegate);
/*  959 */       this.colorFilter = colorFilter;
/*  960 */       this.globalColorFilter = globalColorFilter;
/*  961 */       this.grayFilter = grayFilter;
/*      */     }
/*      */ 
/*      */     
/*      */     public Graphics create() {
/*  966 */       return (Graphics)new GraphicsFilter((Graphics2D)super.create(), this.colorFilter, this.globalColorFilter, this.grayFilter);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public Graphics create(int x, int y, int width, int height) {
/*  972 */       return (Graphics)new GraphicsFilter((Graphics2D)super.create(x, y, width, height), this.colorFilter, this.globalColorFilter, this.grayFilter);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public void setColor(Color c) {
/*  978 */       super.setColor(filterColor(c));
/*      */     }
/*      */ 
/*      */     
/*      */     public void setPaint(Paint paint) {
/*  983 */       if (paint instanceof Color)
/*  984 */         paint = filterColor((Color)paint); 
/*  985 */       super.setPaint(paint);
/*      */     }
/*      */     
/*      */     private Color filterColor(Color color) {
/*  989 */       if (this.colorFilter != null) {
/*  990 */         Color newColor = this.colorFilter.filter(color);
/*      */ 
/*      */         
/*  993 */         color = (newColor != color) ? newColor : this.globalColorFilter.filter(color);
/*      */       } else {
/*  995 */         color = this.globalColorFilter.filter(color);
/*      */       } 
/*  997 */       if (this.grayFilter != null) {
/*  998 */         int oldRGB = color.getRGB();
/*  999 */         int newRGB = this.grayFilter.filterRGB(0, 0, oldRGB);
/* 1000 */         color = (newRGB != oldRGB) ? new Color(newRGB, true) : color;
/*      */       } 
/* 1002 */       return color;
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\extras\FlatSVGIcon.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */