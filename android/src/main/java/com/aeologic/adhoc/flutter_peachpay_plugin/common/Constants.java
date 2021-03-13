package com.aeologic.adhoc.flutter_peachpay_plugin.common;

import java.util.LinkedHashSet;
import java.util.Set;


public class Constants {

    /* The configuration values to change across the app */
    public static class Config {

        /* The payment brands for Ready-to-Use UI and Payment Button */
        public static final Set<String> PAYMENT_BRANDS;



        static {
            PAYMENT_BRANDS = new LinkedHashSet<>();

          //  PAYMENT_BRANDS.add("VISA");
          //  PAYMENT_BRANDS.add("MASTER");
            PAYMENT_BRANDS.add("MADA");
            //PAYMENT_BRANDS.add("PAYPAL");
         //   PAYMENT_BRANDS.add("GOOGLEPAY");


        }
        public static void setBrands(){
            PAYMENT_BRANDS.clear();
           // PAYMENT_BRANDS.add("GOOGLEPAY");
            if(METHOD.equals("MADA")){

                PAYMENT_BRANDS.add("MADA");

            }else  if(METHOD.equals( "VISA")){
                  PAYMENT_BRANDS.add("VISA");
                  PAYMENT_BRANDS.add("MASTER");
            }

        }
        /* The default payment brand for payment button */
        public static final String PAYMENT_BUTTON_BRAND = "GOOGLEPAY";

        public static String CHECKOUTID;
        /* The default amount and currency */
        public static        String AMOUNT = "00.00";
        public static final String CURRENCY = "SAR";
        public static String CARTID = "0" ;
        public static String TOKEN;
        public static  String ORDERTOKEN;
        public static String USERTIME ;
        public static String DELIVERTYPE ;
        public static  String USERCOMMENTS ;
        public static String COMPANY ;
        public static String LOCATION;
        /* The card info for SDK & Your Own UI*/
        public static final String CARD_BRAND = "VISA";
        public static final String CARD_HOLDER_NAME = "JOHN DOE";
        public static final String CARD_NUMBER = "4200000000000000";
        public static final String CARD_EXPIRY_MONTH = "07";
        public static final String CARD_EXPIRY_YEAR = "21";
        public static final String CARD_CVV = "123";
        public static String METHOD = "MADA";
    }

    public static final int CONNECTION_TIMEOUT = 5000;

    public static String NOTIFICATION_URL = "https://shop.alamer-market.com/api/checkout/notification/";

    public static final String BASE_URL = "https://shop.alamer-market.com/api/checkout";
    public static final String MERCHANT_ID = "8acda4ce7292fabc0172a35715b54872";
    public static final String LOG_TAG = "msdk.demo";
}
