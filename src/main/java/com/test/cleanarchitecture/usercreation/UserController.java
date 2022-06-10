package com.test.cleanarchitecture.usercreation;

import com.test.cleanarchitecture.usercreation.usercases.UserInputBoundary;
import com.test.cleanarchitecture.usercreation.model.UserDsResponseModel;
import com.test.cleanarchitecture.usercreation.model.UserRequestModel;
import com.test.cleanarchitecture.usercreation.model.UserResponseModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserInputBoundary userInput;

    public UserController(UserInputBoundary accountGateway) {
        this.userInput = accountGateway;
    }

    @GetMapping("/user")
    public UserResponseModel getUserByBirthday(@RequestParam String birthdayOfMonth, @RequestParam String birthdayOfDay) {
        UserRequestModel userRequestModel = new UserRequestModel();
        userRequestModel.setBirthMonth(birthdayOfMonth);
        userRequestModel.setBirthDay(birthdayOfDay);
        return userInput.findByBirthday(userRequestModel);
    }

    @GetMapping("/user/all")
    public List<UserDsResponseModel> getAll() {
        return userInput.getAllUser();
    }
}
