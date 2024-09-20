/*     */ package com.ejt.internal.i18n;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.StringReader;
/*     */ import java.net.URL;
/*     */ import java.net.URLConnection;
/*     */ import java.security.AccessController;
/*     */ import java.security.PrivilegedActionException;
/*     */ import java.security.PrivilegedExceptionAction;
/*     */ import java.text.MessageFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.PropertyResourceBundle;
/*     */ import java.util.ResourceBundle;
/*     */ import javax.xml.parsers.DocumentBuilderFactory;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.w3c.dom.Document;
/*     */ import org.w3c.dom.Element;
/*     */ import org.w3c.dom.Node;
/*     */ import org.w3c.dom.NodeList;
/*     */ import org.xml.sax.InputSource;
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
/*     */ public abstract class AbstractMessages
/*     */ {
/*  50 */   private static final List<AbstractMessages> allMessages = new ArrayList<AbstractMessages>();
/*     */   public static final String XHTML_EXTENSION = ".xhtml";
/*  52 */   private static final ResourceBundle.Control CONTROL = new UtfPropertiesControl(); private ResourceBundle bundle;
/*     */   
/*     */   static void invalidateAll() {
/*  55 */     synchronized (allMessages) {
/*  56 */       for (AbstractMessages messages : allMessages)
/*  57 */         messages.clear(); 
/*     */     } 
/*     */   }
/*     */   private HtmlResourceBundle htmlBundle; private Boolean isReverse;
/*     */   
/*     */   public static boolean isDefaultLocale() {
/*  63 */     return Locale.getDefault().getLanguage().equals("en");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  69 */   private Map<String, String> htmlToPlainTextBuffer = new HashMap<String, String>();
/*     */   
/*     */   public AbstractMessages() {
/*  72 */     synchronized (allMessages) {
/*  73 */       allMessages.add(this);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private ResourceBundle getBundle() {
/*  81 */     if (this.bundle == null) {
/*  82 */       this.bundle = ResourceBundle.getBundle(getBundleName(), Locale.getDefault(), getClass().getClassLoader(), CONTROL);
/*     */     }
/*  84 */     return this.bundle;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private HtmlResourceBundle getHtmlBundle() {
/*  89 */     if (this.htmlBundle == null) {
/*  90 */       this.htmlBundle = loadHtmlBundle();
/*     */     }
/*  92 */     return this.htmlBundle;
/*     */   }
/*     */   
/*     */   private void clear() {
/*  96 */     this.bundle = null;
/*  97 */     this.htmlBundle = null;
/*  98 */     this.isReverse = null;
/*  99 */     this.htmlToPlainTextBuffer.clear();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected String getStringInternal(@NotNull String key, Object... args) {
/* 104 */     return applyFormat(getStringInternal(key), args);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected String getBoldArgumentsHtmlStringInternal(String key, Object[] args) {
/* 109 */     return "<html>" + applyFormat(getStringInternal(key).replaceAll("(\\{\\d})", "<b>$1</b>"), args);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected String getBoldArgumentsFormatStringInternal(String key, Object[] args) {
/* 114 */     return applyFormat(getStringInternal(key).replaceAll("(\\{\\d})", "#$1:b#"), escapeForFormatString(args)).replaceAll("#([^#]+)#", "{$1}");
/*     */   }
/*     */   
/*     */   private Object[] escapeForFormatString(Object[] args) {
/* 118 */     Object[] result = new Object[args.length];
/* 119 */     for (int i = 0; i < args.length; i++) {
/* 120 */       Object arg = args[i];
/* 121 */       if (arg instanceof String) {
/* 122 */         result[i] = escapeForFormatString((String)arg);
/*     */       } else {
/* 124 */         result[i] = arg;
/*     */       } 
/*     */     } 
/* 127 */     return result;
/*     */   }
/*     */   
/*     */   private String escapeForFormatString(String arg) {
/* 131 */     return arg.replace("\\", "\\\\").replace(":", "\\:").replace("{", "\\{");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private String getStringInternal(@NotNull String key) {
/* 136 */     return getString(key, getBundle());
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private String getString(@NotNull String key, ResourceBundle bundle) {
/* 141 */     String string = bundle.getString(key);
/* 142 */     if (this.isReverse == null) {
/* 143 */       this.isReverse = Boolean.valueOf(Locale.getDefault().getLanguage().equals("zz"));
/*     */     }
/* 145 */     return this.isReverse.booleanValue() ? reverse(string) : string;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private String reverse(String string) {
/* 150 */     StringBuilder wordBuffer = new StringBuilder();
/* 151 */     StringBuilder buffer = new StringBuilder();
/* 152 */     int length = string.length();
/* 153 */     boolean inTag = false;
/* 154 */     char tagEnd = ' ';
/* 155 */     int choiceQuantifier = 0;
/* 156 */     for (int i = 0; i < length; i++) {
/* 157 */       char c = string.charAt(i);
/* 158 */       if (choiceQuantifier == 0 && c == '|') {
/* 159 */         choiceQuantifier = 1;
/* 160 */       } else if (choiceQuantifier == 1 && Character.isDigit(c)) {
/* 161 */         choiceQuantifier = 2;
/* 162 */       } else if (choiceQuantifier == 2 && c == '<') {
/* 163 */         choiceQuantifier = 3;
/*     */       } else {
/* 165 */         choiceQuantifier = 0;
/*     */       } 
/* 167 */       if ((!inTag && ((choiceQuantifier < 3 && c == '<') || c == '{')) || c == '&') {
/* 168 */         appendWord(wordBuffer, buffer);
/* 169 */         inTag = true;
/* 170 */         tagEnd = getTagEnd(c);
/* 171 */         buffer.append(c);
/* 172 */       } else if (inTag) {
/* 173 */         buffer.append(c);
/* 174 */         if (isTagEnd(c, tagEnd)) {
/* 175 */           inTag = false;
/*     */         }
/* 177 */       } else if (isStopChar(c) || choiceQuantifier == 3) {
/* 178 */         appendWord(wordBuffer, buffer);
/* 179 */         buffer.append(c);
/*     */       } else {
/* 181 */         wordBuffer.append(c);
/*     */       } 
/*     */     } 
/* 184 */     appendWord(wordBuffer, buffer);
/* 185 */     return buffer.toString();
/*     */   }
/*     */   
/*     */   private boolean isTagEnd(char c, char tagEnd) {
/* 189 */     return (c == tagEnd || (tagEnd == '}' && (c == '#' || c == '<')));
/*     */   }
/*     */   
/*     */   private boolean isStopChar(char c) {
/* 193 */     if (Character.isDigit(c)) {
/* 194 */       return true;
/*     */     }
/* 196 */     switch (c) {
/*     */       case ' ':
/*     */       case '#':
/*     */       case '(':
/*     */       case ')':
/*     */       case ',':
/*     */       case '-':
/*     */       case '.':
/*     */       case ':':
/*     */       case '=':
/*     */       case '>':
/*     */       case '?':
/*     */       case '[':
/*     */       case ']':
/*     */       case '|':
/*     */       case '}':
/* 212 */         return true;
/*     */     } 
/* 214 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private void appendWord(StringBuilder wordBuffer, StringBuilder buffer) {
/* 219 */     wordBuffer.reverse();
/* 220 */     int length = wordBuffer.length();
/* 221 */     if (length > 1) {
/* 222 */       char lastCharacter = wordBuffer.charAt(length - 1);
/* 223 */       char secondLastCharacter = wordBuffer.charAt(length - 2);
/* 224 */       char firstCharacter = wordBuffer.charAt(0);
/* 225 */       if (Character.isUpperCase(lastCharacter) && Character.isLowerCase(secondLastCharacter)) {
/* 226 */         wordBuffer.setCharAt(0, Character.toUpperCase(firstCharacter));
/* 227 */         wordBuffer.setCharAt(length - 1, Character.toLowerCase(lastCharacter));
/*     */       } 
/*     */     } 
/* 230 */     buffer.append(wordBuffer);
/* 231 */     wordBuffer.setLength(0);
/*     */   }
/*     */   
/*     */   private char getTagEnd(char c) {
/* 235 */     switch (c) {
/*     */       case '<':
/* 237 */         return '>';
/*     */       case '{':
/* 239 */         return '}';
/*     */       case '&':
/* 241 */         return ';';
/*     */     } 
/* 243 */     throw new IllegalStateException("Unknown tag " + c);
/*     */   }
/*     */ 
/*     */   
/*     */   private String applyFormat(@NotNull String value, Object... args) {
/* 248 */     if (args != null && args.length > 0 && value.contains("{")) {
/* 249 */       return (new MessageFormat(removeComments(value))).format(args);
/*     */     }
/* 251 */     return value;
/*     */   }
/*     */ 
/*     */   
/*     */   private String removeComments(String text) {
/* 256 */     if (text.contains("comment:")) {
/* 257 */       return text.replaceAll("comment:[^,}]+", "");
/*     */     }
/* 259 */     return text;
/*     */   }
/*     */ 
/*     */   
/*     */   @XHTMLFragment
/*     */   @NotNull
/*     */   protected String htmlInternal(@NotNull String key, @XHTMLFragment @NotNull String text) {
/* 266 */     if (isDefaultLocale()) {
/* 267 */       return text;
/*     */     }
/* 269 */     return getString(key, getHtmlBundle());
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   protected HtmlBuilder buildHtmlInternal(@NotNull String key, @XHTMLFragment @NotNull String text) {
/* 275 */     return new HtmlBuilder(htmlInternal(key, text));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected String textInternal(@NotNull String key, @NotNull String text) {
/* 280 */     if (isDefaultLocale()) {
/* 281 */       return text;
/*     */     }
/* 283 */     return getText(key);
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String getText(@NotNull String key) {
/* 289 */     return htmlToPlainText(getString(key, getHtmlBundle()));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private String htmlToPlainText(String text) {
/* 294 */     String cachedPlainText = this.htmlToPlainTextBuffer.get(text);
/* 295 */     if (cachedPlainText == null) {
/*     */       try {
/* 297 */         Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader("<html>" + text
/* 298 */                 .replace("&nbsp;", "&#160;") + "</html>")));
/*     */         
/* 300 */         StringBuilder buffer = new StringBuilder();
/* 301 */         appendPlainText(document.getDocumentElement(), buffer);
/* 302 */         cachedPlainText = buffer.toString();
/* 303 */         this.htmlToPlainTextBuffer.put(text, cachedPlainText);
/* 304 */       } catch (Exception e) {
/* 305 */         throw new RuntimeException(e);
/*     */       } 
/*     */     }
/* 308 */     return cachedPlainText;
/*     */   }
/*     */   
/*     */   private void appendPlainText(Element parentElement, StringBuilder buffer) {
/* 312 */     NodeList childNodes = parentElement.getChildNodes();
/* 313 */     int nodeSize = childNodes.getLength();
/* 314 */     boolean firstParagraph = true;
/* 315 */     for (int i = 0; i < nodeSize; i++) {
/* 316 */       Node node = childNodes.item(i);
/* 317 */       if (node instanceof Element) {
/* 318 */         String nodeName = node.getNodeName();
/* 319 */         if (nodeName.equals("p")) {
/* 320 */           if (!firstParagraph) {
/* 321 */             buffer.append("\n\n");
/*     */           }
/* 323 */           appendPlainText((Element)node, buffer);
/* 324 */           firstParagraph = false;
/* 325 */         } else if (nodeName.equals("br")) {
/* 326 */           buffer.append("\n");
/*     */         } else {
/* 328 */           buffer.append(node.getTextContent());
/*     */         } 
/*     */       } else {
/* 331 */         buffer.append(node.getTextContent().trim());
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected TextBuilder buildTextInternal(@NotNull String key, @NotNull String text) {
/* 338 */     return new TextBuilder(textInternal(key, text));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private String getResourcePath() {
/* 343 */     return getBundleName().replace('.', '/').replace("/messages/", "/xhtml/") + ".xhtml";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private HtmlResourceBundle loadHtmlBundle() {
/* 348 */     Locale locale = Locale.getDefault();
/* 349 */     HtmlResourceBundle resourceBundle = loadHtmlBundle(getResourcePath(), null);
/* 350 */     HtmlResourceBundle languageResourceBundle = loadHtmlBundle(getLocaleResourcePath(locale.getLanguage()), resourceBundle);
/* 351 */     return loadHtmlBundle(getLocaleResourcePath(locale.getLanguage() + "_" + locale.getCountry()), languageResourceBundle);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private HtmlResourceBundle loadHtmlBundle(String resourcePath, @Nullable HtmlResourceBundle parentBundle) {
/* 356 */     ClassLoader classLoader = getClass().getClassLoader();
/* 357 */     if (classLoader.getResource(resourcePath) == null) {
/* 358 */       if (parentBundle == null) {
/* 359 */         throw new IllegalStateException("Resource " + resourcePath + " not found");
/*     */       }
/* 361 */       return parentBundle;
/*     */     } 
/*     */     
/*     */     try {
/* 365 */       return new HtmlResourceBundle(classLoader.getResourceAsStream(resourcePath), parentBundle);
/* 366 */     } catch (IOException e) {
/* 367 */       throw new RuntimeException(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private String getLocaleResourcePath(String localeCode) {
/* 373 */     return getResourcePath().replace(".xhtml", "_" + localeCode + ".xhtml");
/*     */   }
/*     */   protected abstract String getBundleName();
/*     */   
/*     */   public class TextBuilder { @NotNull
/*     */     private String text;
/*     */     
/*     */     private TextBuilder(String text) {
/* 381 */       this.text = text;
/*     */     }
/*     */ 
/*     */     
/*     */     @XHTMLFragment
/*     */     @NotNull
/*     */     public String withArgs(Object... args) {
/* 388 */       return AbstractMessages.this.applyFormat(this.text, args);
/*     */     } }
/*     */ 
/*     */   
/*     */   public class HtmlBuilder extends TextBuilder {
/*     */     private HtmlBuilder(String text) {
/* 394 */       super(text);
/*     */     }
/*     */ 
/*     */     
/*     */     @XHTMLFragment
/*     */     @NotNull
/*     */     public String withArgs(Object... args) {
/* 401 */       return super.withArgs(args);
/*     */     } }
/*     */   
/*     */   private static class UtfPropertiesControl extends ResourceBundle.Control { private UtfPropertiesControl() {}
/*     */     
/*     */     public ResourceBundle newBundle(String baseName, Locale locale, String format, final ClassLoader loader, boolean reload) throws IllegalAccessException, InstantiationException, IOException {
/*     */       InputStream stream;
/* 408 */       String bundleName = toBundleName(baseName, locale);
/* 409 */       if (bundleName.contains("://")) {
/* 410 */         return null;
/*     */       }
/* 412 */       final String resourceName = toResourceName(bundleName, "properties");
/* 413 */       final boolean reloadFlag = reload;
/*     */       
/*     */       try {
/* 416 */         stream = AccessController.<InputStream>doPrivileged(new PrivilegedExceptionAction<InputStream>()
/*     */             {
/*     */               public InputStream run() throws IOException {
/* 419 */                 URL url = loader.getResource(resourceName);
/* 420 */                 if (url == null) {
/* 421 */                   return null;
/*     */                 }
/* 423 */                 URLConnection connection = url.openConnection();
/* 424 */                 if (reloadFlag) {
/* 425 */                   connection.setUseCaches(false);
/*     */                 }
/* 427 */                 return connection.getInputStream();
/*     */               }
/*     */             });
/* 430 */       } catch (PrivilegedActionException e) {
/* 431 */         throw (IOException)e.getException();
/*     */       } 
/* 433 */       if (stream != null) {
/*     */         try {
/* 435 */           return new PropertyResourceBundle(new InputStreamReader(stream, "UTF-8"));
/*     */         } finally {
/* 437 */           stream.close();
/*     */         } 
/*     */       }
/* 440 */       return null;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\ejt\internal\i18n\AbstractMessages.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */