package com.test.cleanarchitecture.usercreation.factory;

import com.test.cleanarchitecture.usercreation.entity.Mail;
import com.test.cleanarchitecture.usercreation.model.UserDsResponseModel;

public interface MailFactory {
    Mail create(UserDsResponseModel userDsResponseModel);
}
