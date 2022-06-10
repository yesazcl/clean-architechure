package com.test.cleanarchitecture.usercreation.usercases;

import com.test.cleanarchitecture.usercreation.adapter.MailFormatAdapter;
import com.test.cleanarchitecture.usercreation.database.UserDsGateway;
import com.test.cleanarchitecture.usercreation.entity.Mail;
import com.test.cleanarchitecture.usercreation.factory.MailFactory;
import com.test.cleanarchitecture.usercreation.model.UserDsResponseModel;
import com.test.cleanarchitecture.usercreation.model.UserRequestModel;
import com.test.cleanarchitecture.usercreation.model.UserResponseModel;

import java.util.List;

public class MailNotificationInteractor implements UserInputBoundary {

    private final UserDsGateway userDsGateway;

    private final MailFactory mailFactory;
    private final MailFormatAdapter mailFormatAdapter;

    public MailNotificationInteractor(UserDsGateway userRegisterDfGateway,
                                      MailFactory mailFactory, MailFormatAdapter mailFormatAdapter) {
        this.userDsGateway = userRegisterDfGateway;
        this.mailFactory = mailFactory;
        this.mailFormatAdapter = mailFormatAdapter;
    }

//    @Override
//    public UserResponseModel create(UserRequestModel requestModel) {
//        if (userDsGateway.existsByName(requestModel.getName())) {
//            return userPresenter.prepareFailView("User already exists.");
//        }
//        User user = mailFactory.create(requestModel.getName(), requestModel.getPassword());
//        if (!user.passwordIsValid()) {
//            return userPresenter.prepareFailView("User password must have more than 5 characters.");
//        }
//        LocalDateTime now = LocalDateTime.now();
//        UserDsRequestModel userDsModel = new UserDsRequestModel(user.getName(), user.getPassword(), now);
//
//        userDsGateway.save(userDsModel);
//
//        UserResponseModel accountResponseModel = new UserResponseModel(user.getName(), now.toString());
//        return userPresenter.prepareSuccessView(accountResponseModel);
//    }

    private String prependZero(Integer num) {
        String number = "" + num;
        return number.length() == 1 ? "0" + number : number;
    }

    @Override
    public UserResponseModel findByBirthday(UserRequestModel requestModel) {

        UserResponseModel userResponseModel = new UserResponseModel();
        List<UserDsResponseModel> responseModels = userDsGateway.findBirthdayByDate(requestModel.getBirthMonth(), requestModel.getBirthDay());
        String finalResult = "";
        for (UserDsResponseModel userDsResponseModel : responseModels) {
            Mail mail = mailFactory.create(userDsResponseModel);
            String result = mailFormatAdapter.getMailContent(mail);
            finalResult = finalResult + "\n" + result;
        }
        userResponseModel.setResult(finalResult);
        return userResponseModel;

    }

    @Override
    public List<UserDsResponseModel> getAllUser() {
        List<UserDsResponseModel> responseModels = userDsGateway.findAll();

//        for (UserDsResponseModel userDsResponseModel : responseModels) {
//            Mail mail = mailFactory.create(userDsResponseModel);
//            String result = mailFormatAdapter.getMailContent(mail);
//            System.out.println("1");
//        }
        return responseModels;
    }
}