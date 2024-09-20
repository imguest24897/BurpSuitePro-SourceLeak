/*     */ package com.formdev.flatlaf;
/*     */ 
/*     */ import com.formdev.flatlaf.util.LoggingFacade;
/*     */ import com.formdev.flatlaf.util.StringUtils;
/*     */ import com.formdev.flatlaf.util.SystemInfo;
/*     */ import com.formdev.flatlaf.util.UIScale;
/*     */ import java.awt.Font;
/*     */ import java.awt.FontMetrics;
/*     */ import java.awt.GraphicsConfiguration;
/*     */ import java.awt.GraphicsEnvironment;
/*     */ import java.awt.Toolkit;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.StringTokenizer;
/*     */ import javax.swing.text.StyleContext;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class LinuxFontPolicy
/*     */ {
/*     */   static Font getFont() {
/*  47 */     return SystemInfo.isKDE ? getKDEFont() : getGnomeFont();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Font getGnomeFont() {
/*  56 */     Object fontName = Toolkit.getDefaultToolkit().getDesktopProperty("gnome.Gtk/FontName");
/*  57 */     if (!(fontName instanceof String)) {
/*  58 */       fontName = "sans 10";
/*     */     }
/*  60 */     String family = "";
/*  61 */     int style = 0;
/*  62 */     double dsize = 10.0D;
/*     */ 
/*     */ 
/*     */     
/*  66 */     StringTokenizer st = new StringTokenizer((String)fontName);
/*  67 */     while (st.hasMoreTokens()) {
/*  68 */       String word = st.nextToken();
/*     */ 
/*     */       
/*  71 */       if (word.endsWith(",")) {
/*  72 */         word = word.substring(0, word.length() - 1).trim();
/*     */       }
/*  74 */       String lword = word.toLowerCase(Locale.ENGLISH);
/*  75 */       if (lword.equals("italic") || lword.equals("oblique")) {
/*  76 */         style |= 0x2; continue;
/*  77 */       }  if (lword.equals("bold")) {
/*  78 */         style |= 0x1; continue;
/*  79 */       }  if (Character.isDigit(word.charAt(0))) {
/*     */         try {
/*  81 */           dsize = Double.parseDouble(word);
/*  82 */         } catch (NumberFormatException numberFormatException) {}
/*     */         
/*     */         continue;
/*     */       } 
/*     */       
/*  87 */       if (lword.startsWith("semi-") || lword.startsWith("demi-")) {
/*  88 */         word = word.substring(0, 4) + word.substring(5);
/*  89 */       } else if (lword.startsWith("extra-") || lword.startsWith("ultra-")) {
/*  90 */         word = word.substring(0, 5) + word.substring(6);
/*     */       } 
/*  92 */       family = family.isEmpty() ? word : (family + ' ' + word);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  98 */     if (family.startsWith("Ubuntu") && !SystemInfo.isJetBrainsJVM && 
/*     */       
/* 100 */       !FlatSystemProperties.getBoolean("flatlaf.useUbuntuFont", false)) {
/* 101 */       family = "Liberation Sans";
/*     */     }
/*     */     
/* 104 */     dsize *= getGnomeFontScale();
/* 105 */     int size = (int)(dsize + 0.5D);
/* 106 */     if (size < 1) {
/* 107 */       size = 1;
/*     */     }
/*     */     
/* 110 */     String logicalFamily = mapFcName(family.toLowerCase(Locale.ENGLISH));
/* 111 */     if (logicalFamily != null) {
/* 112 */       family = logicalFamily;
/*     */     }
/* 114 */     return createFontEx(family, style, size, dsize);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Font createFontEx(String family, int style, int size, double dsize) {
/*     */     while (true) {
/* 126 */       Font font = createFont(family, style, size, dsize);
/*     */       
/* 128 */       if ("Dialog".equals(family)) {
/* 129 */         return font;
/*     */       }
/*     */       
/* 132 */       if (!"Dialog".equals(font.getFamily())) {
/*     */ 
/*     */ 
/*     */         
/* 136 */         FontMetrics fm = StyleContext.getDefaultStyleContext().getFontMetrics(font);
/* 137 */         if (fm.getHeight() > size * 2 || fm.stringWidth("a") == 0) {
/* 138 */           return createFont("Dialog", style, size, dsize);
/*     */         }
/* 140 */         return font;
/*     */       } 
/*     */ 
/*     */       
/* 144 */       int index = family.lastIndexOf(' ');
/* 145 */       if (index < 0) {
/* 146 */         return createFont("Dialog", style, size, dsize);
/*     */       }
/*     */       
/* 149 */       String lastWord = family.substring(index + 1).toLowerCase(Locale.ENGLISH);
/* 150 */       if (lastWord.contains("bold") || lastWord.contains("heavy") || lastWord.contains("black")) {
/* 151 */         style |= 0x1;
/*     */       }
/*     */       
/* 154 */       family = family.substring(0, index);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static Font createFont(String family, int style, int size, double dsize) {
/* 159 */     Font font = FlatLaf.createCompositeFont(family, style, size);
/*     */ 
/*     */     
/* 162 */     font = font.deriveFont(style, (float)dsize);
/*     */     
/* 164 */     return font;
/*     */   }
/*     */ 
/*     */   
/*     */   private static double getGnomeFontScale() {
/* 169 */     if (isSystemScaling()) {
/* 170 */       return 1.3333333333333333D;
/*     */     }
/*     */ 
/*     */     
/* 174 */     Object value = Toolkit.getDefaultToolkit().getDesktopProperty("gnome.Xft/DPI");
/* 175 */     if (value instanceof Integer) {
/* 176 */       int dpi = ((Integer)value).intValue() / 1024;
/* 177 */       if (dpi == -1)
/* 178 */         dpi = 96; 
/* 179 */       if (dpi < 50)
/* 180 */         dpi = 50; 
/* 181 */       return dpi / 72.0D;
/*     */     } 
/* 183 */     return GraphicsEnvironment.getLocalGraphicsEnvironment()
/* 184 */       .getDefaultScreenDevice().getDefaultConfiguration()
/* 185 */       .getNormalizingTransform().getScaleY();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static String mapFcName(String name) {
/* 193 */     switch (name) { case "sans":
/* 194 */         return "sansserif";
/* 195 */       case "sans-serif": return "sansserif";
/* 196 */       case "serif": return "serif";
/* 197 */       case "monospace": return "monospaced"; }
/*     */     
/* 199 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Font getKDEFont() {
/* 215 */     List<String> kdeglobals = readConfig("kdeglobals");
/* 216 */     List<String> kcmfonts = readConfig("kcmfonts");
/*     */     
/* 218 */     String generalFont = getConfigEntry(kdeglobals, "General", "font");
/* 219 */     String forceFontDPI = getConfigEntry(kcmfonts, "General", "forceFontDPI");
/*     */     
/* 221 */     String family = "sansserif";
/* 222 */     int style = 0;
/* 223 */     int size = 10;
/*     */     
/* 225 */     if (generalFont != null) {
/* 226 */       List<String> strs = StringUtils.split(generalFont, ',');
/*     */       try {
/* 228 */         family = strs.get(0);
/* 229 */         size = Integer.parseInt(strs.get(1));
/* 230 */         if ("75".equals(strs.get(4)))
/* 231 */           style |= 0x1; 
/* 232 */         if ("1".equals(strs.get(5)))
/* 233 */           style |= 0x2; 
/* 234 */       } catch (RuntimeException ex) {
/* 235 */         LoggingFacade.INSTANCE.logConfig("FlatLaf: Failed to parse 'font=" + generalFont + "'.", ex);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 240 */     int dpi = 96;
/* 241 */     if (forceFontDPI != null && !isSystemScaling()) {
/*     */       try {
/* 243 */         dpi = Integer.parseInt(forceFontDPI);
/* 244 */         if (dpi <= 0)
/* 245 */           dpi = 96; 
/* 246 */         if (dpi < 50)
/* 247 */           dpi = 50; 
/* 248 */       } catch (NumberFormatException ex) {
/* 249 */         LoggingFacade.INSTANCE.logConfig("FlatLaf: Failed to parse 'forceFontDPI=" + forceFontDPI + "'.", ex);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 254 */     double fontScale = dpi / 72.0D;
/* 255 */     double dsize = size * fontScale;
/* 256 */     size = (int)(dsize + 0.5D);
/* 257 */     if (size < 1) {
/* 258 */       size = 1;
/*     */     }
/* 260 */     return createFont(family, style, size, dsize);
/*     */   }
/*     */ 
/*     */   
/*     */   private static List<String> readConfig(String filename) {
/* 265 */     File userHome = new File(System.getProperty("user.home"));
/*     */ 
/*     */     
/* 268 */     String[] configDirs = { ".config", ".kde4/share/config", ".kde/share/config" };
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 273 */     File file = null;
/* 274 */     for (String configDir : configDirs) {
/* 275 */       file = new File(userHome, configDir + "/" + filename);
/* 276 */       if (file.isFile())
/*     */         break; 
/*     */     } 
/* 279 */     if (!file.isFile()) {
/* 280 */       return Collections.emptyList();
/*     */     }
/*     */     
/* 283 */     ArrayList<String> lines = new ArrayList<>(200); 
/* 284 */     try { BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.US_ASCII));
/*     */ 
/*     */       
/*     */       try { String line;
/* 288 */         while ((line = reader.readLine()) != null)
/* 289 */           lines.add(line); 
/* 290 */         reader.close(); } catch (Throwable throwable) { try { reader.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }  } catch (IOException ex)
/* 291 */     { LoggingFacade.INSTANCE.logConfig("FlatLaf: Failed to read '" + filename + "'.", ex); }
/*     */     
/* 293 */     return lines;
/*     */   }
/*     */   
/*     */   private static String getConfigEntry(List<String> config, String group, String key) {
/* 297 */     int groupLength = group.length();
/* 298 */     int keyLength = key.length();
/* 299 */     boolean inGroup = false;
/* 300 */     for (String line : config) {
/* 301 */       if (!inGroup) {
/* 302 */         if (line.length() >= groupLength + 2 && line
/* 303 */           .charAt(0) == '[' && line
/* 304 */           .charAt(groupLength + 1) == ']' && line
/* 305 */           .indexOf(group) == 1)
/*     */         {
/* 307 */           inGroup = true; } 
/*     */         continue;
/*     */       } 
/* 310 */       if (line.startsWith("[")) {
/* 311 */         return null;
/*     */       }
/* 313 */       if (line.length() >= keyLength + 2 && line
/* 314 */         .charAt(keyLength) == '=' && line
/* 315 */         .startsWith(key))
/*     */       {
/* 317 */         return line.substring(keyLength + 1);
/*     */       }
/*     */     } 
/*     */     
/* 321 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static boolean isSystemScaling() {
/* 330 */     if (GraphicsEnvironment.isHeadless()) {
/* 331 */       return true;
/*     */     }
/*     */     
/* 334 */     GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
/* 335 */     return (UIScale.getSystemScaleFactor(gc) > 1.0D);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\LinuxFontPolicy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */