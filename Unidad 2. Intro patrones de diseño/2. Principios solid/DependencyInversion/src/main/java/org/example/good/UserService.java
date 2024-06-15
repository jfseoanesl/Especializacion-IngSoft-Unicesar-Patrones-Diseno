package org.example.good;

public class UserService {
    private IPersistencia persistence;

    public UserService(UserPersistence persistence) {
        this.persistence = persistence;
    }

    public void save(User user){

        this.persistence.save(user);

    }

    public void delete(String username){

        User user = this.persistence.find(username);
        this.persistence.delete(user);

    }

    public void edit(User user){
        this.persistence.edit(user);
    }

    public User find(String username){
        return this.persistence.find(username);
    }
}
