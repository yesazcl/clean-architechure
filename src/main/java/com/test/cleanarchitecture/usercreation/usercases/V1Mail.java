//package com.baeldung.pattern.cleanarchitecture.usercreation.entity;
//
//import MailInputModel;
//
//public class V1Mail implements Mail {
//
//    private MailInputModel mailInputModel;
//
//    public MailInputModel getMailInputModel() {
//        return mailInputModel;
//    }
//
//    public void setMailInputModel(MailInputModel mailInputModel) {
//        this.mailInputModel = mailInputModel;
//    }
//
//    @Override
//    public String getSubject() {
//        return "Happy birthday!";
//    }
//
//    @Override
//    public String getContent() {
//        return String.format("Happy birthday, dear %s!", mailInputModel.getFirstName());
//    }
//}
