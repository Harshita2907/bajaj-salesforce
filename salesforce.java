OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
MediaType mediaType = MediaType.parse(" application/json");
RequestBody body = RequestBody.create(mediaType, "{\r\n \"name\": \"Harshita Khatri\",\r\n \"email\": \"your_colle@example.com\",\r\n \"rollNumber\": 2110990591,\r\n \"phone\": 9588521722\r\n}");
Request request = new Request.Builder()
  .url("https://customer-analytics-34146.my.salesforce-sites.com/services/apexrest/createAccount")
  .method("POST", body)
  .addHeader("Content-Type", " application/json")
  .addHeader("Cookie", "BrowserId=xxJBBuUKEe66Boff58BL6A; CookieConsentPolicy=0:1; LSKey-c$CookieConsentPolicy=0:1")
  .build();
Response response = client.newCall(request).execute();
