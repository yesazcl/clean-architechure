package com.test.cleanarchitecture.usercreation.usercases;

import com.test.cleanarchitecture.usercreation.model.UserDsResponseModel;
import com.test.cleanarchitecture.usercreation.model.UserRequestModel;
import com.test.cleanarchitecture.usercreation.model.UserResponseModel;

import java.util.List;

public interface UserInputBoundary {
    UserResponseModel findByBirthday(UserRequestModel requestModel);

    List<UserDsResponseModel> getAllUser();
}
