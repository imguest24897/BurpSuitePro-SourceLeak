/*     */ package com.install4j.runtime.installer.platform.unix;
/*     */ 
/*     */ import java.io.PrintWriter;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ public abstract class UnixConfigFile
/*     */ {
/*  13 */   private final List<Group> groups = new ArrayList<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void add(@NotNull String groupName, @NotNull String key, @Nullable String value) {
/*  20 */     if (value != null && !value.isEmpty()) {
/*  21 */       getOrAddGroup(groupName).add(key + "=" + value, true);
/*     */     }
/*     */   }
/*     */   
/*     */   public void addContent(@NotNull List<String> lines) {
/*  26 */     Group group = getMainGroup();
/*  27 */     for (String line : lines) {
/*  28 */       String newGroupName = getGroupName(line);
/*  29 */       if (newGroupName != null) {
/*  30 */         group = getOrAddGroup(newGroupName); continue;
/*  31 */       }  if (group == null) {
/*  32 */         throw new IllegalArgumentException("no group defined for " + lines);
/*     */       }
/*  34 */       group.add(line, false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void addContent(String content) {
/*  40 */     if (content != null && !content.trim().isEmpty()) {
/*  41 */       addContent(Arrays.asList(content.replaceAll("\\r", "").split("\\n")));
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected final Group getOrAddGroup(@NotNull String groupName) {
/*  47 */     for (Group group1 : this.groups) {
/*  48 */       if (group1.name.equals(groupName)) {
/*  49 */         return group1;
/*     */       }
/*     */     } 
/*  52 */     Group group = new Group(groupName);
/*  53 */     this.groups.add(group);
/*  54 */     return group;
/*     */   }
/*     */   
/*     */   public void print(PrintWriter pw) {
/*  58 */     boolean lastLineWasEmpty = true;
/*  59 */     for (Group group : this.groups) {
/*  60 */       if (!lastLineWasEmpty) {
/*  61 */         pw.println();
/*     */       }
/*  63 */       pw.println("[" + group.name + "]");
/*  64 */       lastLineWasEmpty = false;
/*  65 */       for (Line line : group.lines) {
/*  66 */         pw.println(line.value);
/*  67 */         lastLineWasEmpty = "".equals(line.value);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public List<String> getAsAdditional() {
/*  73 */     Group mainGroup = getMainGroup();
/*     */     
/*  75 */     List<String> ret = new ArrayList<>();
/*  76 */     for (Group group : this.groups) {
/*  77 */       if (group != mainGroup) {
/*  78 */         ret.add("[" + group.name + "]");
/*     */       }
/*  80 */       for (Line line : group.lines) {
/*  81 */         ret.add(line.value);
/*     */       }
/*     */     } 
/*  84 */     return ret;
/*     */   }
/*     */   
/*     */   public class Group {
/*     */     private final String name;
/*  89 */     private final List<UnixConfigFile.Line> lines = new ArrayList<>();
/*     */     
/*     */     public Group(String name) {
/*  92 */       this.name = name;
/*     */     }
/*     */     
/*     */     public void add(@NotNull String newLine, boolean isDefault) {
/*  96 */       if (!UnixConfigFile.isComment(newLine)) {
/*  97 */         String newKey = UnixConfigFile.getKey(newLine);
/*  98 */         if (newKey != null) {
/*  99 */           String value = UnixConfigFile.getValue(newLine);
/* 100 */           for (int i = 0; i < this.lines.size(); i++) {
/* 101 */             UnixConfigFile.Line previous = this.lines.get(i);
/* 102 */             if (Objects.equals(UnixConfigFile.getKey(previous.value), newKey) && (
/* 103 */               UnixConfigFile.this.isUniqueKeys() || previous.isDefault)) {
/* 104 */               if (value == null || value.isEmpty()) {
/* 105 */                 this.lines.remove(i);
/*     */               } else {
/* 107 */                 this.lines.set(i, new UnixConfigFile.Line(newLine, isDefault));
/*     */               } 
/*     */               
/*     */               return;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 115 */       this.lines.add(new UnixConfigFile.Line(newLine, isDefault));
/*     */     }
/*     */   }
/*     */   
/*     */   public static class Line {
/*     */     private final String value;
/*     */     private final boolean isDefault;
/*     */     
/*     */     public Line(String value, boolean isDefault) {
/* 124 */       this.value = value;
/* 125 */       this.isDefault = isDefault;
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static String getKey(@NotNull String line) {
/* 131 */     int equalPos = line.indexOf('=');
/* 132 */     if (equalPos == -1) {
/* 133 */       return null;
/*     */     }
/* 135 */     return line.substring(0, equalPos).trim();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private static String getValue(@NotNull String line) {
/* 141 */     int equalPos = line.indexOf('=');
/* 142 */     if (equalPos == -1) {
/* 143 */       return null;
/*     */     }
/* 145 */     return line.substring(equalPos + 1).trim();
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean isComment(@NotNull String line) {
/* 150 */     return (line.startsWith("#") || line.trim().isEmpty());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static String getGroupName(@NotNull String line) {
/* 155 */     line = line.trim();
/* 156 */     if (line.startsWith("[") && line.endsWith("]")) {
/* 157 */       return line.substring(1, line.length() - 1);
/*     */     }
/* 159 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected abstract Group getMainGroup();
/*     */   
/*     */   protected abstract boolean isUniqueKeys();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platfor\\unix\UnixConfigFile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */