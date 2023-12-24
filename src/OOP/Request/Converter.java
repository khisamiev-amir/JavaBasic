package OOP.Request;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class Converter {
    public JSONObject jsonObjectResult(String urlExample) throws IOException, JSONException {
        URL url = new URL(urlExample);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("GET");
        System.out.println(httpURLConnection);
        InputStream inputStream = httpURLConnection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String jsonResultLine;
        StringBuilder jsonResult = new StringBuilder();
        while ((jsonResultLine = reader.readLine()) != null) {
            jsonResult.append(jsonResultLine);
        }
        reader.close();

        JSONObject jsonObject = new JSONObject(jsonResult.toString());
        return jsonObject;
    }

    public static void main(String[] args) throws JSONException, IOException {
        Converter converter = new Converter();
        JSONObject data = converter.jsonObjectResult("https://www.cbr-xml-daily.ru/daily_json.js");
        System.out.println(data);
    }
}
