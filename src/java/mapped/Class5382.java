package mapped;

import com.mentalfrostbyte.jello.module.util.InDevelopment;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import totalcross.json.JSONArray;
import totalcross.json.JSONObject;

@InDevelopment
public class Class5382 extends Module {
   public HttpClient field24018 = null;
   public CookieStore field24019 = new BasicCookieStore();
   public HttpClientBuilder field24020 = HttpClientBuilder.create().setDefaultCookieStore(this.field24019);
   public String field24021 = "";

   public Class5382() {
      super(ModuleCategory.EXPLOIT, "Hypixel Unbanner", "Force unbans you from hypixel xD");
      this.field24018 = this.field24020.build();
   }

   @Override
   public void isInDevelopment() {
      try {
         String var3 = "D8374378";
         String var4 = mc.session.getUsername();
         String var5 = mc.session.getPlayerID().replaceAll("-", "");
         if (this.method16956() && this.method16961("CREEPAKILLER987@S0NY.IGG.BIZ", "3Qs-Cnt-Dec-Tee")) {
            this.method16959();
            JSONObject var6 = this.method16958(var3, var5);
            System.out.println(var6);
            var6.put("duration", "Permanent");
            var6.put("subType", "COMPROMISED_ACCOUNT");
            var6.put("reason", "Account Security Alert");
            var6.put("tags", new JSONArray().put("FI"));
            var6.put("type", "0");
            if (this.method16957(var6, var4.toLowerCase())) {
               this.method16959();
            }

            this.method16959();
         }
      } catch (IOException var7) {
         var7.printStackTrace();
      }
   }

   private boolean method16956() throws IOException {
      HttpPost var3 = new HttpPost("https://hypixel.net/forums");
      HttpResponse var4 = this.field24018.execute(var3);
      HttpEntity var5 = var4.getEntity();
      if (var5 == null) {
         return false;
      } else {
         InputStream var6 = var5.getContent();
         var6.close();
         System.out.println(this.field24019.getCookies());
         return true;
      }
   }

   private boolean method16957(JSONObject var1, String var2) throws IOException {
      HttpPost var5 = new HttpPost("https://hypixel.net/appeals/api/submit");
      ArrayList var6 = new ArrayList(2);
      var5.setHeader(":authority", "hypixel.net");
      var5.setHeader("accept", "application/json, text/plain, */*");
      var5.setHeader("x-requested-with", "XMLHttpRequest");
      var5.setHeader("referer", "https://hypixel.net/appeals/create");
      if (!var1.has("punishment_type")) {
         return false;
      } else {
         var6.add(new BasicNameValuePair("punishment_type", var1.method21773("punishment_type")));
         var6.add(new BasicNameValuePair("attachment_hash", "ecdfa37933135aa9c4cd995b98e25f83"));
         var6.add(new BasicNameValuePair("player[name]", var2));
         var6.add(new BasicNameValuePair("player[uuid]", var1.method21773("uuid")));
         var6.add(new BasicNameValuePair("punishment_id", var1.method21773("partialId")));
         Iterator var7 = var1.method21777();

         while (var7.hasNext()) {
            String var8 = (String)var7.next();
            if (!var8.equals("tags")) {
               if (!var8.equals("date") && !var8.equals("type")) {
                  var6.add(new BasicNameValuePair("punishment[" + var8 + "]", var1.method21773(var8)));
               } else {
                  var6.add(new BasicNameValuePair("punishment[" + var8 + "]", String.valueOf(var1.method21770(var8))));
               }
            } else {
               var6.add(new BasicNameValuePair("punishment[" + var8 + "][]", var1.getJSONArray(var8).getString(0)));
            }
         }

         var6.add(new BasicNameValuePair("appeal_justification", ""));
         var6.add(new BasicNameValuePair("server_rules_acknowledgement", ""));
         var6.add(new BasicNameValuePair("_xfToken", this.field24021));
         var6.add(new BasicNameValuePair("ban_category", "account_security_alert"));
         var6.add(new BasicNameValuePair("hacks_used", ""));
         var6.add(new BasicNameValuePair("hack_removal_acknowledgement", ""));
         var6.add(new BasicNameValuePair("comp_account_acknowledgement", ""));
         var6.add(new BasicNameValuePair("minecraft_password_change_acknowledgement", "Yes"));
         var6.add(new BasicNameValuePair("previous_ban_acknowledgement", "No"));
         var6.add(new BasicNameValuePair("account_security_alert_acknowledgement", "Yes"));
         var5.setEntity(new UrlEncodedFormEntity(var6, "UTF-8"));
         HttpResponse var11 = this.field24018.execute(var5);
         HttpEntity var9 = var11.getEntity();
         if (var9 == null) {
            return false;
         } else {
            InputStream var10 = var9.getContent();
            System.out.println(IOUtils.toString(var10, "UTF-8"));
            var10.close();
            return true;
         }
      }
   }

   private JSONObject method16958(String var1, String var2) throws IOException {
      HttpGet var5 = new HttpGet("https://hypixel.net/api/account/punishment?type=ban&id=" + var1 + "&player_uuid=" + var2.replaceAll("-", ""));
      var5.setHeader(":authority", "hypixel.net");
      var5.setHeader("accept", "application/json, text/plain, */*");
      var5.setHeader("x-requested-with", "XMLHttpRequest");
      var5.setHeader("referer", "https://hypixel.net/appeals/create");
      HttpResponse var6 = this.field24018.execute(var5);
      HttpEntity var7 = var6.getEntity();
      if (var7 == null) {
         return null;
      } else {
         InputStream var8 = var7.getContent();
         String var9 = IOUtils.toString(var8, "UTF-8");
         System.out.println(var9);
         var8.close();
         return new JSONObject(var9);
      }
   }

   private boolean method16959() throws IOException {
      HttpGet var3 = new HttpGet("https://hypixel.net/account/unlink-minecraft");
      var3.setHeader(":authority", "hypixel.net");
      var3.setHeader("accept", "application/json, text/plain, */*");
      var3.setHeader("x-requested-with", "XMLHttpRequest");
      var3.setHeader("referer", "https://hypixel.net/account/minecraft");
      HttpResponse var4 = this.field24018.execute(var3);
      HttpEntity var5 = var4.getEntity();
      if (var5 == null) {
         return false;
      } else {
         InputStream var6 = var5.getContent();
         var6.close();
         return true;
      }
   }

   private boolean method16960() throws IOException {
      HttpGet var3 = new HttpGet("https://hypixel.net/account/unlink-minecraft");
      var3.setHeader(":authority", "hypixel.net");
      var3.setHeader("accept", "application/json, text/plain, */*");
      var3.setHeader("x-requested-with", "XMLHttpRequest");
      var3.setHeader("referer", "https://hypixel.net/account/minecraft");
      HttpResponse var4 = this.field24018.execute(var3);
      HttpEntity var5 = var4.getEntity();
      if (var5 == null) {
         return false;
      } else {
         InputStream var6 = var5.getContent();
         var6.close();
         return true;
      }
   }

   private boolean method16961(String var1, String var2) throws IOException {
      HttpPost var5 = new HttpPost("https://hypixel.net/login/login");
      ArrayList var6 = new ArrayList(2);
      var6.add(new BasicNameValuePair("login", var1));
      var6.add(new BasicNameValuePair("register", "0"));
      var6.add(new BasicNameValuePair("password", var2));
      var6.add(new BasicNameValuePair("cookie_check", "1"));
      var6.add(new BasicNameValuePair("_xfToken", this.field24021));
      var6.add(new BasicNameValuePair("redirect", "https://hypixel.net/forums/"));
      var5.setEntity(new UrlEncodedFormEntity(var6, "UTF-8"));
      HttpResponse var7 = this.field24018.execute(var5);
      HttpEntity var8 = var7.getEntity();
      if (var8 == null) {
         return false;
      } else {
         InputStream var9 = var8.getContent();
         String var10 = "<input type=\"hidden\" name=\"_xfToken\" value=\"([^\\n]+)\" \\/>";
         String var11 = IOUtils.toString(var9, "UTF-8");
         Pattern var12 = Pattern.compile("<input type=\"hidden\" name=\"_xfToken\" value=\"([^\\n]+)\" \\/>", 8);
         Matcher var13 = var12.matcher(var11);
         if (var13.find()) {
            this.field24021 = var13.group(1);
         }

         var9.close();
         return true;
      }
   }
}
