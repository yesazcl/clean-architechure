package com.test.cleanarchitecture.usercreation.adapter;

import com.test.cleanarchitecture.usercreation.entity.Mail;

public class MailFormatAdapter {
    private MailContent mailContent;

    public MailFormatAdapter(MailContent mailContent) {
        this.mailContent = mailContent;
    }

    public String getMailContent(Mail mail) {
        return mailContent.getResult(mail);
    }
}
