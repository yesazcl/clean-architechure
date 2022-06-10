//package com.baeldung.pattern.cleanarchitecture.usercreation.entity;
//
//import MailInputModel;
//
//public class V2Mail implements Mail {
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
//        if ("Male".equals(mailInputModel.getGender())) {
//            return "Happy birthday, dear Robert!\n" +
//                    "We offer special discount 20% off for the following items:\n" +
//                    "White Wine, iPhone X";
//        } else if ("Female".equals(mailInputModel.getGender())) {
//            return "Happy birthday, dear Miki!\n" +
//                    "We offer special discount 50% off for the following items:\n" +
//                    "Cosmetic, LV Handbags";
//
//        }
//
//        return "";
//
//    }
//}
