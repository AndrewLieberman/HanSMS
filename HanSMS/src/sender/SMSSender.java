/*
 * Uses account information in order to send 
 * proper texts regarding the queried menu.
 */

package sender;
 
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.twilio.sdk.resource.instance.Account;
import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Message;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
 
public class SMSSender {
 
    // Find your sid and token at twilio.com/user/account 
    public static final String ACCOUNT_SID = "ACa423a86ce5df3fa4f6b12db3e220c98c";
    public static final String AUTH_TOKEN = "cabb42e5772c065736966978c6762001";
 
    public static void sender(String text) {
        TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
        Account account = client.getAccount();
        MessageFactory messageFactory = account.getMessageFactory();
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("To", "2159834413")); // Replace with a valid phone number for your account. --> 2403517705
        params.add(new BasicNameValuePair("From", "4844585238")); // Replace with a valid phone number for your account.
        params.add(new BasicNameValuePair("Body", text));
        try {
            Message sms = messageFactory.create(params);
        } catch (TwilioRestException ex) {
            Logger.getLogger(SMSSender.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}