/*     */ package com.install4j.runtime.installer.helper.console;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.runtime.beans.applications.Application;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.UnattendedConsoleAccess;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.impl.HelperConsoleAccess;
/*     */ import com.install4j.runtime.util.HtmlTextHelper;
/*     */ import com.install4j.runtime.util.StringUtil;
/*     */ import java.io.File;
/*     */ import java.io.PrintWriter;
/*     */ import java.io.StringWriter;
/*     */ import java.text.MessageFormat;
/*     */ import java.util.HashSet;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
/*     */ import java.util.StringTokenizer;
/*     */ import org.jetbrains.annotations.Nls;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ConsoleImpl
/*     */   implements Console
/*     */ {
/*     */   private static ConsoleImpl instance;
/*     */   private static final int HORIZONTAL_SIZE = 75;
/*     */   private static final int VERTICAL_SIZE = 25;
/*     */   private String lastStatusMessage;
/*     */   private String lastDetailMessage;
/*     */   private ConsoleAccess consoleAccess;
/*     */   private String lastVal;
/*     */   
/*     */   public static ConsoleImpl getInstance() {
/*  44 */     if (instance == null) {
/*  45 */       instance = new ConsoleImpl();
/*     */     }
/*  47 */     return instance;
/*     */   }
/*     */   
/*     */   public ConsoleImpl() {
/*  51 */     if (HelperCommunication.getInstance().isElevatedHelper()) {
/*  52 */       this.consoleAccess = (ConsoleAccess)new HelperConsoleAccess();
/*  53 */     } else if (InstallerUtil.isUnattended()) {
/*  54 */       this.consoleAccess = (ConsoleAccess)new UnattendedConsoleAccess();
/*     */     } else {
/*  56 */       if (System.console() != null) {
/*  57 */         this.consoleAccess = new Console16Access();
/*     */       } else {
/*  59 */         this.consoleAccess = new SimpleConsoleAccess();
/*     */       } 
/*  61 */       if (!Util.isWindows())
/*     */       {
/*  63 */         this.consoleAccess.print("\033[?7h");
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void waitForEnter() throws UserCanceledException {
/*  70 */     println("[" + Messages.getString(".ConsoleEnter") + "]");
/*  71 */     readLine();
/*     */   }
/*     */ 
/*     */   
/*     */   public void printHeader(String title) throws UserCanceledException {
/*  76 */     Application application = InstallerConfig.getCurrentApplication();
/*     */     try {
/*  78 */       ContextImpl.getSingleContextInt().runScript(application.getConsoleScreenChangeHandler(), (Bean)application, new Object[] { this, title });
/*  79 */     } catch (UserCanceledException e) {
/*  80 */       throw e;
/*  81 */     } catch (Exception e) {
/*  82 */       Util.printAnnotatedStackTrace(e);
/*  83 */       Logger.getInstance().log(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void println() {
/*  89 */     println("");
/*     */   }
/*     */ 
/*     */   
/*     */   public void more(@Nls String text) throws UserCanceledException {
/*  94 */     if (text == null) {
/*  95 */       this.consoleAccess.println("null");
/*  96 */       this.consoleAccess.flush();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 112 */     text = text.replaceAll("©", "(C)").replaceAll("®", "(R)").replaceAll("•", "*").replace('‘', '\'').replace('’', '\'').replace('‚', '\'').replace('‛', '\'').replace('“', '"').replace('”', '"').replace('„', '"').replace('‟', '"');
/*     */     
/* 114 */     int lineCount = 0;
/*     */     
/* 116 */     boolean endedWithLineBreak = false;
/* 117 */     StringTokenizer lineTokenizer = new StringTokenizer(text, "\n\r", true);
/* 118 */     while (lineTokenizer.hasMoreTokens()) {
/* 119 */       String line = lineTokenizer.nextToken();
/* 120 */       if (line.length() == 1 && line.charAt(0) == '\n') {
/* 121 */         this.consoleAccess.println();
/* 122 */         endedWithLineBreak = true;
/* 123 */         lineCount++;
/* 124 */         if (lineCount % 23 == 0)
/* 125 */           waitForEnter();  continue;
/*     */       } 
/* 127 */       if (line.length() > 1 || line.charAt(0) != '\r') {
/* 128 */         endedWithLineBreak = false;
/* 129 */         StringTokenizer wordTokenizer = new StringTokenizer(line, " ");
/* 130 */         int charCount = 0;
/* 131 */         while (wordTokenizer.hasMoreTokens()) {
/* 132 */           String word = wordTokenizer.nextToken();
/* 133 */           if (charCount == 0 || charCount + word.length() <= 75) {
/* 134 */             if (charCount > 0) {
/* 135 */               this.consoleAccess.print(" ");
/* 136 */               charCount++;
/*     */             } 
/*     */           } else {
/* 139 */             this.consoleAccess.println();
/* 140 */             charCount = 0;
/* 141 */             lineCount++;
/* 142 */             if (lineCount % 23 == 0) {
/* 143 */               waitForEnter();
/*     */             }
/*     */           } 
/*     */           
/* 147 */           this.consoleAccess.print(word.replace(' ', ' '));
/* 148 */           charCount += word.length();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 153 */     if (!endedWithLineBreak) {
/* 154 */       this.consoleAccess.println();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void print(Object val) {
/* 161 */     print(val, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void println(Object val) {
/* 166 */     print(val, true);
/*     */   }
/*     */   
/*     */   private void print(Object val, boolean newLine) {
/*     */     String line;
/* 171 */     if (val == null) {
/* 172 */       line = "null";
/*     */     } else {
/*     */       
/* 175 */       line = val.toString().replace(' ', ' ').replace("(?raw)", "");
/*     */     } 
/* 177 */     if (this.lastVal != null && this.lastVal.startsWith("\r") && !line.startsWith("\r")) {
/* 178 */       this.consoleAccess.println();
/*     */     }
/* 180 */     if (newLine) {
/* 181 */       this.consoleAccess.println(line);
/*     */     } else {
/* 183 */       this.consoleAccess.print(line);
/*     */     } 
/* 185 */     this.lastVal = line;
/* 186 */     this.consoleAccess.flush();
/*     */   }
/*     */   
/*     */   public void cleanup() {
/* 190 */     if (this.lastVal != null && this.lastVal.startsWith("\r")) {
/* 191 */       this.consoleAccess.println();
/*     */     }
/*     */   }
/*     */   
/*     */   public String askWithDefault(@Nls String message, String defaultValue) throws UserCanceledException {
/* 196 */     println(message);
/* 197 */     println("[" + defaultValue + "]");
/* 198 */     String answer = readLine();
/* 199 */     if (answer.trim().length() == 0) {
/* 200 */       return defaultValue;
/*     */     }
/* 202 */     return answer;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean askYesNo(@Nls String message) throws UserCanceledException {
/* 208 */     return (askOption(message, new String[] { Messages.getString(".ButtonYes"), Messages.getString(".ButtonNo") }, new String[] { "y", "n" }) == 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean askYesNo(@Nls String message, boolean defaultValue) throws UserCanceledException {
/* 214 */     return (askOption(message, new String[] { Messages.getString(".ButtonYes"), Messages.getString(".ButtonNo") }, new String[] { "y", "n"
/* 215 */         }, defaultValue ? 0 : 1) == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean askOkCancel(@Nls String message) throws UserCanceledException {
/* 220 */     return (askOption(message, new String[] { Messages.getString(".ButtonOK"), Messages.getString(".ButtonCancel") }, new String[] { "o", "c" }) == 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean askOkCancel(@Nls String message, boolean defaultValue) throws UserCanceledException {
/* 226 */     return (askOption(message, new String[] { Messages.getString(".ButtonOK"), Messages.getString(".ButtonCancel") }, new String[] { "o", "c"
/* 227 */         }, defaultValue ? 0 : 1) == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public String askString(@Nls String message, String defaultValue) throws UserCanceledException {
/* 232 */     if (message != null && message.length() != 0) {
/* 233 */       println(message);
/*     */     }
/* 235 */     if (defaultValue != null) {
/* 236 */       println("[" + defaultValue + "]");
/*     */     }
/* 238 */     String answer = readLine();
/* 239 */     if (answer.trim().length() == 0 && defaultValue != null) {
/* 240 */       return defaultValue;
/*     */     }
/* 242 */     return answer;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String askPassword(@Nls String message, String defaultValue) throws UserCanceledException {
/* 248 */     if (message != null && message.length() != 0) {
/* 249 */       println(message);
/*     */     }
/* 251 */     String answer = this.consoleAccess.readPassword("");
/* 252 */     if (answer.trim().length() == 0 && defaultValue != null) {
/* 253 */       return defaultValue;
/*     */     }
/* 255 */     return answer;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int askOption(@Nls String message, @Nls String[] descriptions, String[] keys) throws UserCanceledException {
/* 261 */     return askOption(message, descriptions, keys, -1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int askOption(@Nls String message, @Nls String[] descriptions, String[] keys, int defaultValue) throws UserCanceledException {
/* 266 */     return askOption(message, descriptions, keys, defaultValue, false, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public int askOption(@Nls String message, @Nls String[] descriptions, String[] keys, int defaultValue, boolean allowNoSelection, boolean oneLinePerOption) throws UserCanceledException {
/* 271 */     return askOption(message, descriptions, keys, null, defaultValue, allowNoSelection, oneLinePerOption);
/*     */   }
/*     */ 
/*     */   
/*     */   public int askOption(@Nls String message, @Nls String[] descriptions, String[] keys, @Nls String[] helpTexts, int defaultValue, boolean allowNoSelection, boolean oneLinePerOption) throws UserCanceledException {
/* 276 */     if (keys == null) {
/* 277 */       keys = getDefaultKeys(descriptions.length);
/*     */     }
/*     */     
/* 280 */     String question = getQuestion(descriptions, keys, helpTexts, defaultValue, oneLinePerOption);
/*     */     
/*     */     while (true) {
/* 283 */       if (message != null && message.length() != 0) {
/* 284 */         println(message);
/*     */       }
/* 286 */       println(question);
/* 287 */       String answer = readLine().trim();
/* 288 */       for (int i = 0; i < descriptions.length; i++) {
/* 289 */         String key = keys[i];
/* 290 */         if (Objects.equals(key, answer))
/* 291 */           return i; 
/* 292 */         if (Objects.equals("*" + key, answer) && helpTexts != null) {
/* 293 */           println();
/* 294 */           println(descriptions[i] + ": " + helpTexts[i]);
/* 295 */           println();
/*     */         } 
/*     */       } 
/*     */       
/* 299 */       if (answer.length() == 0) {
/* 300 */         if (defaultValue > -1)
/* 301 */           return defaultValue; 
/* 302 */         if (allowNoSelection) {
/* 303 */           return -1;
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private String getQuestion(@Nls String[] descriptions, @Nls String[] keys, @Nls String[] helpTexts, int defaultValue, boolean oneLinePerOption) {
/* 311 */     StringBuilder question = new StringBuilder();
/* 312 */     for (int i = 0; i < descriptions.length; i++) {
/* 313 */       question.append(descriptions[i]);
/* 314 */       question.append(" [");
/* 315 */       if (Objects.equals(keys[i], "")) {
/* 316 */         question.append(Messages.getString(".ConsoleEnter"));
/*     */       } else {
/* 318 */         question.append(keys[i]);
/* 319 */         if (defaultValue == i) {
/* 320 */           question.append(", ");
/* 321 */           question.append(Messages.getString(".ConsoleEnter"));
/*     */         } 
/*     */       } 
/* 324 */       if (helpTexts != null) {
/* 325 */         String helpText = helpTexts[i];
/* 326 */         if (helpText != null) {
/* 327 */           question.append(", ");
/* 328 */           question.append(MessageFormat.format(Messages.getString(".ConsoleQuestionShowHelp"), new Object[] { "*" + keys[i] }));
/*     */         } 
/*     */       } 
/* 331 */       question.append("]");
/* 332 */       if (i < descriptions.length - 1) {
/* 333 */         if (oneLinePerOption) {
/* 334 */           question.append("\n");
/*     */         } else {
/* 336 */           question.append(", ");
/*     */         } 
/*     */       }
/*     */     } 
/* 340 */     return question.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public int[] askMultipleSelection(@Nls String message, @Nls String[] descriptions, String[] keys, int[] defaultValues, boolean oneLinePerOption) throws UserCanceledException {
/* 345 */     if (keys == null) {
/* 346 */       keys = getDefaultKeys(descriptions.length);
/*     */     }
/*     */     
/* 349 */     StringBuilder defaultSelection = new StringBuilder();
/* 350 */     if (defaultValues != null) {
/* 351 */       for (int i = 0; i < defaultValues.length; i++) {
/* 352 */         defaultSelection.append(keys[defaultValues[i]]);
/* 353 */         if (i < defaultValues.length - 1) {
/* 354 */           defaultSelection.append(",");
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 359 */     String question = getQuestion(descriptions, keys, null, -1, oneLinePerOption);
/* 360 */     question = question + "\n" + Messages.getString(".ConsoleMultipleSelectionLabel");
/*     */     while (true) {
/* 362 */       if (message != null && message.length() != 0) {
/* 363 */         println(message);
/*     */       }
/* 365 */       String answer = askString(question, defaultSelection.toString());
/*     */       
/* 367 */       boolean allValid = true;
/* 368 */       Set<Integer> selectedItems = new HashSet<>();
/* 369 */       for (StringTokenizer stringTokenizer = new StringTokenizer(answer, ","); stringTokenizer.hasMoreTokens(); ) {
/* 370 */         String token = stringTokenizer.nextToken().trim();
/* 371 */         boolean found = false;
/* 372 */         for (int i = 0; i < keys.length; i++) {
/* 373 */           if (Objects.equals(keys[i], token)) {
/* 374 */             selectedItems.add(Integer.valueOf(i));
/* 375 */             found = true;
/*     */             break;
/*     */           } 
/*     */         } 
/* 379 */         if (!found) {
/* 380 */           allValid = false;
/*     */           break;
/*     */         } 
/*     */       } 
/* 384 */       if (allValid) {
/* 385 */         int[] ret = new int[selectedItems.size()];
/* 386 */         int i = 0;
/* 387 */         for (Integer selectedItem : selectedItems) {
/* 388 */           ret[i++] = selectedItem.intValue();
/*     */         }
/* 390 */         return ret;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private String[] getDefaultKeys(int length) {
/* 396 */     String[] keys = new String[length];
/* 397 */     for (int i = 0; i < length; i++) {
/* 398 */       keys[i] = String.valueOf(i + 1);
/*     */     }
/* 400 */     return keys;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStatusMessage(@Nls String message) {
/* 405 */     if (message != null && !Objects.equals(message.trim(), "") && !Objects.equals(message, this.lastStatusMessage)) {
/* 406 */       println(HtmlTextHelper.formatTextWithoutHtmlTags(message));
/* 407 */       this.lastStatusMessage = message;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDetailMessage(@Nls String message) {
/* 413 */     if (message != null && (message.trim().length() > 0 || (this.lastDetailMessage != null && this.lastDetailMessage.trim().length() > 0))) {
/* 414 */       print(StringUtil.padRight("\r  " + HtmlTextHelper.formatTextWithoutHtmlTags(message), ' ', 76));
/* 415 */       this.lastDetailMessage = message;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPercentCompleted(int value) {}
/*     */ 
/*     */   
/*     */   public int getPercentCompleted() {
/* 425 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSecondaryPercentCompleted(int value) {
/* 430 */     if (this.lastDetailMessage != null && this.lastDetailMessage.trim().length() > 0) {
/* 431 */       printProgressMessage(value, this.lastDetailMessage);
/* 432 */     } else if (this.lastStatusMessage != null && this.lastStatusMessage.trim().length() > 0) {
/* 433 */       printProgressMessage(value, this.lastStatusMessage);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void printProgressMessage(int value, String message) {
/* 438 */     print(StringUtil.padRight("\r  " + message + " (" + value + " %)", ' ', 76));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIndeterminateProgress(boolean indeterminateProgress) {}
/*     */ 
/*     */   
/*     */   public void showFailure(@Nls String message) {
/* 447 */     println("ERROR: " + message);
/*     */   }
/*     */ 
/*     */   
/*     */   public int askOverwrite(File file) throws UserCanceledException {
/* 452 */     String message = file.getPath() + "\n\n" + Messages.getString(".FileExists");
/*     */     
/* 454 */     int result = askOption(message, new String[] {
/* 455 */           Messages.getString(".ButtonYes"), Messages.getString(".ButtonYesToAll"), Messages.getString(".ButtonNo"), Messages.getString(".ButtonNoToAll") }, new String[] { "y", "ya", "n", "na" });
/*     */ 
/*     */ 
/*     */     
/* 459 */     switch (result) {
/*     */       case 0:
/* 461 */         return 2;
/*     */       case 1:
/* 463 */         return 3;
/*     */       case 2:
/* 465 */         return 1;
/*     */       case 3:
/* 467 */         return 4;
/*     */     } 
/* 469 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int askRetry(File file) throws UserCanceledException {
/* 474 */     String message = Messages.format(Messages.getString(".AskRetryInstallFile"), new Object[] { file.getPath() });
/* 475 */     if (isRetryAllowNo()) {
/* 476 */       int result = askOption(message, new String[] {
/* 477 */             Messages.getString(".ButtonYes"), Messages.getString(".ButtonNo"), Messages.getString(".ButtonCancel") }, new String[] { "y", "n", "c" });
/*     */ 
/*     */       
/* 480 */       switch (result) {
/*     */         case 0:
/* 482 */           return 2;
/*     */         case 1:
/* 484 */           return 1;
/*     */         case 2:
/* 486 */           return 3;
/*     */       } 
/*     */     } else {
/* 489 */       int result = askOption(message, new String[] {
/* 490 */             Messages.getString(".ButtonYes"), Messages.getString(".ButtonCancel") }, new String[] { "y", "c" });
/*     */ 
/*     */       
/* 493 */       switch (result) {
/*     */         case 0:
/* 495 */           return 2;
/*     */         case 1:
/* 497 */           return 3;
/*     */       } 
/*     */     } 
/* 500 */     return 3;
/*     */   }
/*     */   
/*     */   public static boolean isRetryAllowNo() {
/* 504 */     Context currentContext = ContextImpl.getCurrentContext();
/* 505 */     return (currentContext != null && currentContext.getBooleanVariable("sys.fileRetryAllowNo"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean askContinue(File file) throws UserCanceledException {
/* 510 */     int result = askOption(Messages.format(Messages.getString(".AskContinue"), new Object[] { file.getPath() }), new String[] {
/* 511 */           Messages.getString(".ButtonOK"), Messages.getString(".ButtonCancel") }, new String[] { "", "c" });
/*     */ 
/*     */     
/* 514 */     return (result == 0);
/*     */   }
/*     */   
/*     */   public void printStackTrace(Throwable t) {
/* 518 */     StringWriter stringWriter = new StringWriter();
/* 519 */     t.printStackTrace(new PrintWriter(stringWriter));
/* 520 */     this.consoleAccess.print(stringWriter.toString());
/* 521 */     this.consoleAccess.flush();
/*     */   }
/*     */   
/*     */   public synchronized void cancel() {
/* 525 */     this.consoleAccess.cancel();
/*     */   }
/*     */ 
/*     */   
/*     */   public String readLine() throws UserCanceledException {
/* 530 */     return this.consoleAccess.readLine("");
/*     */   }
/*     */   
/*     */   public ConsoleAccess getConsoleAccess() {
/* 534 */     return this.consoleAccess;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\console\ConsoleImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */