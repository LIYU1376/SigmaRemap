package com.mentalfrostbyte.jello.command.impl;

import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import com.mentalfrostbyte.jello.Client;
import mapped.Class2193;
import mapped.Class6669;
import mapped.Class7286;
import mapped.ChatCommandArguments;
import org.apache.commons.io.IOUtils;
import totalcross.json.JSONException2;
import totalcross.json.JSONObject;

public class Config extends Command {
   private final String folder = "/configs/";
   private final String fileType = ".config";
   private final ArrayList<String> field25714 = new ArrayList<String>(Arrays.asList("add", "create", "new", "save"));
   private final ArrayList<String> field25715 = new ArrayList<String>(Arrays.asList("remove", "delete", "del", "rem"));

   public Config() {
      super("config", "Manage configs", "configs", "profiles", "profile");
      this.registerSubCommands(new String[]{"load/save/remove/list"});
   }

   @Override
   public void run(String var1, ChatCommandArguments[] args, Class6669 var3) throws CommandException {
      if (args.length == 0) {
         throw new CommandException();
      } else if (args.length <= 2) {
         if (args[0].method30895() != Class2193.field14335) {
            throw new CommandException();
         } else {
            String action = args[0].getArguments().toLowerCase();
            if (!action.equalsIgnoreCase("load")) {
               if (!this.field25714.contains(action)) {
                  if (!this.field25715.contains(action)) {
                     if (!action.equalsIgnoreCase("list")) {
                        throw new CommandException();
                     }

                     var3.send("§l" + Client.getInstance().getModuleManager().method14667().method20772().size() + " " + this.method18342() + " :");

                     for (Class7286 var8 : Client.getInstance().getModuleManager().method14667().method20772()) {
                        boolean var9 = Client.getInstance().getModuleManager().method14667().method20770() == var8;
                        if (Client.getInstance().getClientMode() != ClientMode.CLASSIC || !var9) {
                           var3.send((!var9 ? "" : "§n") + var8.field31263);
                        }
                     }
                  } else if (args.length != 1) {
                     String var10 = args[1].getArguments().toLowerCase();
                     if (!Client.getInstance().getModuleManager().method14667().method20765(var10)) {
                        var3.send(this.method18342() + " not found!");
                     } else {
                        var3.send("Removed " + this.method18342());
                     }
                  } else {
                     var3.send("Usage : .config remove <name>");
                  }
               } else if (args.length != 1) {
                  String var11 = args[1].getArguments().toLowerCase();
                  Class7286 var13 = Client.getInstance().getModuleManager().method14667().method20770();
                  var13.field31262 = Client.getInstance().getModuleManager().method14657(new JSONObject());
                  Client.getInstance().getModuleManager().method14667().method20765(var11);
                  Client.getInstance().getModuleManager().method14667().method20763(new Class7286(var11, var13.field31262));
                  var3.send("Saved " + this.method18342());
               } else {
                  var3.send("Usage : .config save <name>");
               }
            } else if (args.length != 1) {
               String var12 = args[1].getArguments().toLowerCase();
               Class7286 var14 = Client.getInstance().getModuleManager().method14667().method20766(var12);
               if (var14 == null) {
                  var3.send(this.method18342() + " not found!");
               } else {
                  Client.getInstance().getModuleManager().method14667().method20771(var14);
                  var3.send(this.method18342() + " was loaded!");
               }
            } else {
               var3.send("Usage : .config load <name>");
            }
         }
      } else {
         throw new CommandException("Too many arguments");
      }
   }

   public String method18342() {
      return Client.getInstance().getClientMode() != ClientMode.CLASSIC ? "Profile" : "Config";
   }

   public void method18343(String var1) {
      JSONObject var4 = Client.getInstance().getModuleManager().method14657(new JSONObject());
      File var5 = new File(Client.getInstance().getFile() + "/configs/");
      if (!var5.exists()) {
         var5.mkdirs();
      }

      File var6 = new File(Client.getInstance().getFile() + "/configs/" + var1 + ".config");
      if (!var6.exists()) {
         try {
            var6.createNewFile();
         } catch (IOException var9) {
            var9.printStackTrace();
         }
      }

      try {
         IOUtils.write(new JSONObject().toString(0), new FileOutputStream(var6));
      } catch (IOException | JSONException2 var8) {
         var8.printStackTrace();
      }
   }
}
