package com.test.cleanarchitecture.usercreation.database;

import com.test.cleanarchitecture.usercreation.model.UserDsRequestModel;
import com.test.cleanarchitecture.usercreation.model.UserDsResponseModel;

import java.util.List;

public interface UserDsGateway {
    boolean existsByName(String identifier);

    void save(UserDsRequestModel requestModel);

    List<UserDsResponseModel> findBirthdayByDate(String birthMonth, String birthDay);

    List<UserDsResponseModel> findAll();

}
