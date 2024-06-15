package org.example.good;

import java.util.ArrayList;

public class UserPersistence  implements IPersistencia{

    private ArrayList<User> users;

    public UserPersistence() {
        this.users = new ArrayList();

    }

    @Override
    public void save(User user){

        this.users.add(user);

    }
    @Override
    public void delete(User user){
        this.users.remove(user);
    }

    @Override
    public void edit(User user){

        User user2=this.users.stream().filter(o -> o.getUsername().equals(user.getUsername())).findFirst()
                .map(usuario->{
                    usuario.setPassword(user.getPassword());
                    return usuario;
                }).orElseThrow(()->{return new RuntimeException("El usuario no existe");});

        System.out.println(user2.getPassword());
    }

    @Override
    public User find(String username){
            return this.users.stream().filter(user -> user.getUsername().equals(username))
                    .findFirst()
                    .orElseThrow(()->{return new RuntimeException("El username no existe");});
    }

}
