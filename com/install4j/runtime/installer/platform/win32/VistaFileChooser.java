/*     */ package com.install4j.runtime.installer.platform.win32;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import java.awt.Window;
/*     */ import java.io.File;
/*     */ 
/*     */ public class VistaFileChooser
/*     */ {
/*     */   public static final int FOS_OVERWRITEPROMPT = 2;
/*     */   public static final int FOS_STRICTFILETYPES = 4;
/*     */   public static final int FOS_NOCHANGEDIR = 8;
/*     */   public static final int FOS_PICKFOLDERS = 32;
/*     */   public static final int FOS_FORCEFILESYSTEM = 64;
/*     */   public static final int FOS_ALLNONSTORAGEITEMS = 128;
/*     */   public static final int FOS_NOVALIDATE = 256;
/*     */   public static final int FOS_ALLOWMULTISELECT = 512;
/*     */   public static final int FOS_PATHMUSTEXIST = 2048;
/*     */   public static final int FOS_FILEMUSTEXIST = 4096;
/*     */   public static final int FOS_CREATEPROMPT = 8192;
/*     */   public static final int FOS_SHAREAWARE = 16384;
/*     */   public static final int FOS_NOREADONLYRETURN = 32768;
/*     */   public static final int FOS_NOTESTFILECREATE = 65536;
/*     */   public static final int FOS_HIDEMRUPLACES = 131072;
/*     */   public static final int FOS_HIDEPINNEDPLACES = 262144;
/*     */   public static final int FOS_NODEREFERENCELINKS = 1048576;
/*     */   public static final int FOS_DONTADDTORECENT = 33554432;
/*     */   public static final int FOS_FORCESHOWHIDDEN = 268435456;
/*     */   public static final int FOS_DEFAULTNOMINIMODE = 536870912;
/*     */   public static final int FOS_FORCEPREVIEWPANEON = 1073741824;
/*     */   public static final int FOS_SUPPORTSTREAMABLEITEMS = -2147483648;
/*     */   
/*     */   static {
/*  33 */     Common.init();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  43 */   private static ThreadLocal initializer = ThreadLocal.withInitial(() -> {
/*     */         initialize0();
/*     */         return null;
/*     */       }); private final boolean save; private File directory;
/*     */   
/*     */   private static void initialize() {
/*  49 */     initializer.get();
/*     */   }
/*     */ 
/*     */   
/*     */   private String fileName;
/*     */   
/*     */   private String defaultExtension;
/*     */   
/*     */   private String title;
/*     */   
/*     */   private String button;
/*     */   private int includedOptions;
/*     */   private int excludedOptions;
/*     */   private int selectedFilter;
/*     */   private Question[] questions;
/*     */   private Filter[] filter;
/*     */   
/*     */   public VistaFileChooser(boolean save) {
/*  67 */     if (!Util.isAtLeastWindowsVista()) {
/*  68 */       throw new RuntimeException("works only on Windows Vista or higher");
/*     */     }
/*  70 */     this.save = save;
/*     */   }
/*     */   
/*     */   public File[] show(Window parent) {
/*  74 */     initialize();
/*  75 */     String[] filterNames = null;
/*  76 */     String[] filterSpecs = null;
/*  77 */     if (this.filter != null) {
/*  78 */       filterNames = new String[this.filter.length];
/*  79 */       filterSpecs = new String[this.filter.length];
/*  80 */       for (int i = 0; i < this.filter.length; i++) {
/*  81 */         filterNames[i] = (this.filter[i]).name;
/*  82 */         filterSpecs[i] = (this.filter[i]).spec;
/*     */       } 
/*     */     } 
/*  85 */     String[] checkboxes = null;
/*  86 */     boolean[] states = null;
/*  87 */     if (this.questions != null) {
/*  88 */       checkboxes = new String[this.questions.length];
/*  89 */       states = new boolean[this.questions.length];
/*  90 */       for (int i = 0; i < this.questions.length; i++) {
/*  91 */         checkboxes[i] = (this.questions[i]).description;
/*  92 */         states[i] = (this.questions[i]).selected;
/*     */       } 
/*     */     } 
/*  95 */     String[] selection = displayDialog0(WinGuiHelper.getHwnd(parent), this.title, this.button, (this.directory == null) ? null : this.directory.getAbsolutePath(), this.fileName, this.includedOptions, this.excludedOptions, this.save, this.defaultExtension, filterNames, filterSpecs, this.selectedFilter, checkboxes, states);
/*  96 */     if (this.questions != null) {
/*  97 */       for (int i = 0; i < this.questions.length; i++) {
/*  98 */         assert states != null;
/*  99 */         (this.questions[i]).selected = states[i];
/*     */       } 
/*     */     }
/*     */     
/* 103 */     if (selection != null) {
/* 104 */       File[] ret = new File[selection.length];
/* 105 */       for (int i = 0; i < selection.length; i++) {
/* 106 */         ret[i] = new File(selection[i]);
/*     */       }
/*     */       
/* 109 */       return ret;
/*     */     } 
/* 111 */     return null;
/*     */   }
/*     */   
/*     */   public VistaFileChooser directory(File directory) {
/* 115 */     this.directory = directory;
/* 116 */     return this;
/*     */   }
/*     */   
/*     */   public VistaFileChooser fileName(String fileName) {
/* 120 */     this.fileName = fileName;
/* 121 */     return this;
/*     */   }
/*     */   
/*     */   public VistaFileChooser defaultExtension(String defaultExtension) {
/* 125 */     this.defaultExtension = defaultExtension;
/* 126 */     return this;
/*     */   }
/*     */   
/*     */   public VistaFileChooser title(String title) {
/* 130 */     this.title = title;
/* 131 */     return this;
/*     */   }
/*     */   
/*     */   public VistaFileChooser button(String button) {
/* 135 */     this.button = button;
/* 136 */     return this;
/*     */   }
/*     */   
/*     */   public VistaFileChooser includedOptions(int includedOptions) {
/* 140 */     this.includedOptions = includedOptions;
/* 141 */     return this;
/*     */   }
/*     */   
/*     */   public VistaFileChooser excludedOptions(int excludedOptions) {
/* 145 */     this.excludedOptions = excludedOptions;
/* 146 */     return this;
/*     */   }
/*     */   
/*     */   public VistaFileChooser selectedFilter(int selectedFilter) {
/* 150 */     this.selectedFilter = selectedFilter;
/* 151 */     return this;
/*     */   }
/*     */   
/*     */   public VistaFileChooser questions(Question[] questions) {
/* 155 */     this.questions = questions;
/* 156 */     return this;
/*     */   }
/*     */   
/*     */   public VistaFileChooser filter(Filter[] filter) {
/* 160 */     this.filter = filter;
/* 161 */     return this;
/*     */   }
/*     */   private static synchronized native void initialize0();
/*     */   private static native String[] displayDialog0(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2, boolean paramBoolean, String paramString5, String[] paramArrayOfString1, String[] paramArrayOfString2, int paramInt3, String[] paramArrayOfString3, boolean[] paramArrayOfboolean);
/*     */   
/*     */   public static class Filter { private final String name;
/*     */     
/*     */     public Filter(String name, String spec) {
/* 169 */       this.name = name;
/* 170 */       this.spec = spec;
/*     */     }
/*     */     
/*     */     private final String spec; }
/*     */   
/*     */   public static class Question { private final String description;
/*     */     private boolean selected;
/*     */     
/*     */     public Question(String description, boolean selected) {
/* 179 */       this.description = description;
/* 180 */       this.selected = selected;
/*     */     }
/*     */     
/*     */     public boolean isSelected() {
/* 184 */       return this.selected;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\VistaFileChooser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */