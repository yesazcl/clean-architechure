package com.test.cleanarchitecture.usercreation.database;


import com.test.cleanarchitecture.usercreation.repository.JpaUserRepository;
import com.test.cleanarchitecture.usercreation.entity.UserDataMapper;
import com.test.cleanarchitecture.usercreation.model.UserDsRequestModel;
import com.test.cleanarchitecture.usercreation.model.UserDsResponseModel;

import java.util.List;
import java.util.stream.Collectors;

public class JpaUser implements UserDsGateway {

    private final JpaUserRepository repository;

    public JpaUser(JpaUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean existsByName(String name) {
        return repository.existsById(name);
    }

    @Override
    public void save(UserDsRequestModel requestModel) {
        UserDataMapper accountDataMapper = new UserDataMapper(requestModel.getName(), requestModel.getPassword(), requestModel.getCreationTime());
        repository.save(accountDataMapper);
    }

    @Override
    public List<UserDsResponseModel> findBirthdayByDate(String birthMonth, String birthDay) {
        List<UserDataMapper> result = repository.findBirthdayByDate(birthMonth, birthDay);
        return result.stream().map(s -> new UserDsResponseModel(s.getLastName(), s.getFirstName(), s.getGender(), s.getBirthday(), s.getEmail())).collect(Collectors.toList());

    }

    @Override
    public List<UserDsResponseModel> findAll() {
        List<UserDataMapper> result = repository.findAll();
        return result.stream().map(s -> new UserDsResponseModel(s.getLastName(), s.getFirstName(), s.getGender(), s.getBirthday(), s.getEmail())).collect(Collectors.toList());
    }
}
