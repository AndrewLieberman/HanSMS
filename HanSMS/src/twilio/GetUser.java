package twilio;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.resource.instance.Account;
import com.twilio.sdk.resource.list.AccountList;

public class GetUser {

    public static final String ACCOUNT_SID = "ACa423a86ce5df3fa4f6b12db3e220c98c";
    public static final String AUTH_TOKEN = "cabb42e5772c065736966978c6762001";

    public static void user() {
        TwilioRestClient client;
        Account mainAccount;
        
        client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
        mainAccount = client.getAccount();
        
    }
}
