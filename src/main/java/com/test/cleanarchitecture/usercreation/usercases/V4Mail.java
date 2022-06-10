package com.test.cleanarchitecture.usercreation.usercases;


import com.test.cleanarchitecture.usercreation.entity.Mail;
import com.test.cleanarchitecture.usercreation.model.MailInputModel;

public class V4Mail implements Mail {

    private MailInputModel mailInputModel;

    public MailInputModel getMailInputModel() {
        return mailInputModel;
    }

    public void setMailInputModel(MailInputModel mailInputModel) {
        this.mailInputModel = mailInputModel;
    }

    @Override
    public String getSubject() {
        return "Happy birthday!";
    }

    @Override
    public String getContent() {
        return String.format("Happy birthday, dear %s %s!", mailInputModel.getFirstName(), mailInputModel.getLastName());
    }
}
