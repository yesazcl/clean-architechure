package com.test.cleanarchitecture.usercreation.factory;

import com.test.cleanarchitecture.usercreation.entity.Mail;
//import com.baeldung.pattern.cleanarchitecture.usercreation.entity.V1Mail;
//import com.baeldung.pattern.cleanarchitecture.usercreation.entity.V2Mail;
//import com.baeldung.pattern.cleanarchitecture.usercreation.entity.V3Mail;
import com.test.cleanarchitecture.usercreation.usercases.V4Mail;
import com.test.cleanarchitecture.usercreation.model.MailInputModel;
import com.test.cleanarchitecture.usercreation.model.UserDsResponseModel;

public class BirthdayGreetingMailFactory implements MailFactory {
    @Override
    public Mail create(UserDsResponseModel userDsResponseMode) {
        /////////////////////////// V1 //////////////////////////////////
        /*V1Mail v1Mail =  new V1Mail();
        v1Mail.setMailInputModel(new MailInputModel(userDsResponseMode.getFirstName(), userDsResponseMode.getLastName() , userDsResponseMode.getGender(), userDsResponseMode.getBirthday()));
        return v1Mail;*/


//        V2Mail v2Mail =  new V2Mail();
//        v2Mail.setMailInputModel(new MailInputModel(userDsResponseMode.getFirstName(), userDsResponseMode.getLastName(), userDsResponseMode.getGender(), userDsResponseMode.getBirthday()));
//        return v2Mail;
//        V3Mail v3Mail =  new V3Mail();
//        v3Mail.setMailInputModel(new MailInputModel(userDsResponseMode.getFirstName(), userDsResponseMode.getLastName(), userDsResponseMode.getGender(), userDsResponseMode.getBirthday()));
//        return v3Mail;

        V4Mail v4Mail =  new V4Mail();
        v4Mail.setMailInputModel(new MailInputModel(userDsResponseMode.getFirstName(), userDsResponseMode.getLastName(), userDsResponseMode.getGender(), userDsResponseMode.getBirthday()));
        return v4Mail;
    }
}
