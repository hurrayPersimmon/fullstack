package com.multi.solid.dip;

public class UserService {

    //Interface를 return 해주는 design 패턴이 factory pattern이 된다.

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    public void register(String name){
        userRepository.save(name);
    }

    public static void main(String[] args) {
        new UserService(new OracleRepository());
    }



}
