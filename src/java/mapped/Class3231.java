// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.client.methods.HttpGet;
import java.io.InputStream;
import java.util.Iterator;
import org.apache.commons.io.IOUtils;
import java.util.List;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import java.util.ArrayList;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.HttpPost;
import java.io.IOException;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import com.mentalfrostbyte.jello.mods.util.InDevelopment;

@InDevelopment
public class Class3231 extends Class3167
{
    public HttpClient field15699;
    public CookieStore field15700;
    public HttpClientBuilder field15701;
    public String field15702;
    
    public Class3231() {
        super(Class8013.field32989, "Hypixel Unbanner", "Force unbans you from hypixel xD");
        this.field15699 = null;
        this.field15700 = (CookieStore)new BasicCookieStore();
        this.field15701 = HttpClientBuilder.create().setDefaultCookieStore(this.field15700);
        this.field15702 = "";
        this.field15699 = (HttpClient)this.field15701.build();
    }
    
    @Override
    public void method9879() {
        try {
            final String s = "D8374378";
            final String method33692 = Class3231.field15514.field4642.method33692();
            final String replaceAll = Class3231.field15514.field4642.method33691().replaceAll("-", "");
            if (this.method10185() && this.method10190("CREEPAKILLER987@S0NY.IGG.BIZ", "3Qs-Cnt-Dec-Tee")) {
                this.method10188();
                final Class4405 method33693 = this.method10187(s, replaceAll);
                System.out.println(method33693);
                method33693.method13301("duration", "Permanent");
                method33693.method13301("subType", "COMPROMISED_ACCOUNT");
                method33693.method13301("reason", "Account Security Alert");
                method33693.method13301("tags", new Class88().method486("FI"));
                method33693.method13301("type", "0");
                if (this.method10186(method33693, method33692.toLowerCase())) {
                    this.method10188();
                }
                this.method10188();
            }
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private boolean method10185() throws IOException {
        final HttpEntity entity = this.field15699.execute((HttpUriRequest)new HttpPost("https://hypixel.net/forums")).getEntity();
        if (entity == null) {
            return false;
        }
        entity.getContent().close();
        System.out.println(this.field15700.getCookies());
        return true;
    }
    
    private boolean method10186(final Class4405 class4405, final String s) throws IOException {
        final HttpPost httpPost = new HttpPost("https://hypixel.net/appeals/api/submit");
        final ArrayList list = new ArrayList(2);
        httpPost.setHeader(":authority", "hypixel.net");
        httpPost.setHeader("accept", "application/json, text/plain, */*");
        httpPost.setHeader("x-requested-with", "XMLHttpRequest");
        httpPost.setHeader("referer", "https://hypixel.net/appeals/create");
        if (!class4405.method13269("punishment_type")) {
            return false;
        }
        list.add(new BasicNameValuePair("punishment_type", class4405.method13268("punishment_type")));
        list.add(new BasicNameValuePair("attachment_hash", "ecdfa37933135aa9c4cd995b98e25f83"));
        list.add(new BasicNameValuePair("player[name]", s));
        list.add(new BasicNameValuePair("player[uuid]", class4405.method13268("uuid")));
        list.add(new BasicNameValuePair("punishment_id", class4405.method13268("partialId")));
        final Iterator<String> method13272 = class4405.method13272();
        while (method13272.hasNext()) {
            final String str = method13272.next();
            if (!str.equals("tags")) {
                if (!str.equals("date") && !str.equals("type")) {
                    list.add(new BasicNameValuePair("punishment[" + str + "]", class4405.method13268(str)));
                }
                else {
                    list.add(new BasicNameValuePair("punishment[" + str + "]", String.valueOf(class4405.method13265(str))));
                }
            }
            else {
                list.add(new BasicNameValuePair("punishment[" + str + "][]", class4405.method13263(str).method459(0)));
            }
        }
        list.add(new BasicNameValuePair("appeal_justification", ""));
        list.add(new BasicNameValuePair("server_rules_acknowledgement", ""));
        list.add(new BasicNameValuePair("_xfToken", this.field15702));
        list.add(new BasicNameValuePair("ban_category", "account_security_alert"));
        list.add(new BasicNameValuePair("hacks_used", ""));
        list.add(new BasicNameValuePair("hack_removal_acknowledgement", ""));
        list.add(new BasicNameValuePair("comp_account_acknowledgement", ""));
        list.add(new BasicNameValuePair("minecraft_password_change_acknowledgement", "Yes"));
        list.add(new BasicNameValuePair("previous_ban_acknowledgement", "No"));
        list.add(new BasicNameValuePair("account_security_alert_acknowledgement", "Yes"));
        httpPost.setEntity((HttpEntity)new UrlEncodedFormEntity((List)list, "UTF-8"));
        final HttpEntity entity = this.field15699.execute((HttpUriRequest)httpPost).getEntity();
        if (entity == null) {
            return false;
        }
        final InputStream content = entity.getContent();
        System.out.println(IOUtils.toString(content, "UTF-8"));
        content.close();
        return true;
    }
    
    private Class4405 method10187(final String str, final String s) throws IOException {
        final HttpGet httpGet = new HttpGet("https://hypixel.net/api/account/punishment?type=ban&id=" + str + "&player_uuid=" + s.replaceAll("-", ""));
        httpGet.setHeader(":authority", "hypixel.net");
        httpGet.setHeader("accept", "application/json, text/plain, */*");
        httpGet.setHeader("x-requested-with", "XMLHttpRequest");
        httpGet.setHeader("referer", "https://hypixel.net/appeals/create");
        final HttpEntity entity = this.field15699.execute((HttpUriRequest)httpGet).getEntity();
        if (entity == null) {
            return null;
        }
        final InputStream content = entity.getContent();
        final String string = IOUtils.toString(content, "UTF-8");
        System.out.println(string);
        content.close();
        return new Class4405(string);
    }
    
    private boolean method10188() throws IOException {
        final HttpGet httpGet = new HttpGet("https://hypixel.net/account/unlink-minecraft");
        httpGet.setHeader(":authority", "hypixel.net");
        httpGet.setHeader("accept", "application/json, text/plain, */*");
        httpGet.setHeader("x-requested-with", "XMLHttpRequest");
        httpGet.setHeader("referer", "https://hypixel.net/account/minecraft");
        final HttpEntity entity = this.field15699.execute((HttpUriRequest)httpGet).getEntity();
        if (entity == null) {
            return false;
        }
        entity.getContent().close();
        return true;
    }
    
    private boolean method10189() throws IOException {
        final HttpGet httpGet = new HttpGet("https://hypixel.net/account/unlink-minecraft");
        httpGet.setHeader(":authority", "hypixel.net");
        httpGet.setHeader("accept", "application/json, text/plain, */*");
        httpGet.setHeader("x-requested-with", "XMLHttpRequest");
        httpGet.setHeader("referer", "https://hypixel.net/account/minecraft");
        final HttpEntity entity = this.field15699.execute((HttpUriRequest)httpGet).getEntity();
        if (entity == null) {
            return false;
        }
        entity.getContent().close();
        return true;
    }
    
    private boolean method10190(final String s, final String s2) throws IOException {
        final HttpPost httpPost = new HttpPost("https://hypixel.net/login/login");
        final ArrayList list = new ArrayList(2);
        list.add(new BasicNameValuePair("login", s));
        list.add(new BasicNameValuePair("register", "0"));
        list.add(new BasicNameValuePair("password", s2));
        list.add(new BasicNameValuePair("cookie_check", "1"));
        list.add(new BasicNameValuePair("_xfToken", this.field15702));
        list.add(new BasicNameValuePair("redirect", "https://hypixel.net/forums/"));
        httpPost.setEntity((HttpEntity)new UrlEncodedFormEntity((List)list, "UTF-8"));
        final HttpEntity entity = this.field15699.execute((HttpUriRequest)httpPost).getEntity();
        if (entity == null) {
            return false;
        }
        final InputStream content = entity.getContent();
        final Matcher matcher = Pattern.compile("<input type=\"hidden\" name=\"_xfToken\" value=\"([^\\n]+)\" \\/>", 8).matcher(IOUtils.toString(content, "UTF-8"));
        if (matcher.find()) {
            this.field15702 = matcher.group(1);
        }
        content.close();
        return true;
    }
}
