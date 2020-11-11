package jasonparser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 *Autor: ALAEDDINE Kramou
 *date: 10/19/2020
 */
public class Cnn_API {
    public static void main(String[] args)throws MalformedURLException, IOException {
        String sURL = "http://newsapi.org/v2/everything?q=bitcoin&from=2020-09-20&sortBy=publishedAt&apiKey=b54bac6314214f11967d58fccb5c0d25";
        CnnNews news = null;
        List<CnnNews> cnnNewsList = new ArrayList<>();
        URL url = new URL(sURL);
        URLConnection request = url.openConnection();
        request.connect();
        JsonArray jsonArray = null;
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        if (root instanceof JsonObject) {
            JsonObject rootObj = root.getAsJsonObject();
        } else if (root instanceof JsonArray) {
            jsonArray =  root.getAsJsonArray();
        }
        for (int i = 0; i < jsonArray.size()-1; i++) {
            try {
                JsonObject jsonobject = jsonArray.get(i).getAsJsonObject();
                //you code start here
                String empEmail = jsonobject.get("status" ).toString();

            }catch(Exception ex){

            }
        }
        //Print to the console.
        for(CnnNews entry:cnnNewsList){
            System.out.println(entry.getStatus()+" "+entry.getTotalResults()+" "+entry.getArticles()+" "+entry.getSource()+" "+entry.getId()+" "+entry.getName()+" "+entry.getAuthor()+" "+entry.getTitle()+" "+entry.getDescription()
                    +" "+entry.getUrl()+" "+entry.getUrlToImage()+" "+entry.getPublishedAt()+" "+entry.getContent());
        }
    }
}
