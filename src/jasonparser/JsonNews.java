package jasonparser;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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

//public class JsonNews {
//    public static void main(String[] args) throws MalformedURLException, IOException {
//        String sURL = "https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=b54bac6314214f11967d58fccb5c0d25";
//        JsonClass news = null;
//        List<JsonClass> empList = new ArrayList<>();
//        URL url = new URL(sURL);
//        URLConnection request = url.openConnection();
//        request.connect();
//        JsonArray jsonclass = null;
//        JsonParser jp = new JsonParser();
//        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
//        if (root instanceof JsonObject) {
//            JsonObject rootObj = root.getAsJsonObject();
//        } else if (root instanceof JsonArray) {
//            jsonclass = root.getAsJsonArray();
//        }
//        for (int i = 0; i < jsonclass.size() - 1; i++) {
//            ObjectMapper objectMapper = new ObjectMapper();
//            try {
//                JsonObject jsonobject = jsonclass.get(i).getAsJsonObject();
//                //you code start here
//                String name = jsonobject.get("name").toString();
//                System.out.println(name);
//                String id = jsonobject.get("id").toString();
//                System.out.println(name);
//
//            } catch (Exception ex) {
//
//            }
//            for(JsonClass entry:empList){
//                System.out.println(entry.getStatus()+" "+entry.getTotalResults()+" "+entry.getArticles()+" "+entry.getSource()+" "+entry.getId()+" "+entry.getName()+" "+entry.getAuthor()+" "+entry.getTitle()+" "+entry.getDescription()
//                        +" "+entry.getUrl()+" "+entry.getUrlToImage()+" "+entry.getPublishedAt()+" "+entry.getContent());
//            }
//        }
//    }
//}
