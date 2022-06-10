//package com.baeldung.pattern.cleanarchitecture.usercreation.adapter;
//
//import Mail;
//import org.json.JSONObject;
//
//public class JsonMailContent implements MailContent {
//    private String result;
//
//    public JsonMailContent(Mail mail) {
//
//    }
//
//
//    @Override
//    public String getResult(Mail mail) {
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("title", mail.getSubject());
//        jsonObject.put("content", mail.getContent());
//        return jsonObject.toString();
//    }
//}
