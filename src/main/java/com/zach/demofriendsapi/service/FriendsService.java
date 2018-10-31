package com.zach.demofriendsapi.service;

import com.zach.demofriendsapi.domain.Friends;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class FriendsService {
    List<Friends>friendsList = new ArrayList<>(Arrays.asList(
            new Friends(1l,"Derian","Curly"),
            new Friends(2l,"Bobby","Bobby-San"),
            new Friends(3l,"Troy","Big ass Troy")
    ));
    public List<Friends> getListofFriends(){
        return friendsList;
    }

    public Friends getFriendsbyID(Long id){
        for (int x =0;x<friendsList.size();x++){

            Friends Friends = friendsList.get(x);
            if (Friends.getId().equals(id)){
                return Friends;
            }
        }
        return null;
    }
    public void addFriends(Friends friends){
        friendsList.add(friends);
    }

    public void updateFriends(Long id,Friends friends){
        for (int x =0;x<friendsList.size();x++){
            Friends a = friendsList.get(x);
            if (a.getId().equals(id)){
                friendsList.set(x,friends);
            }
        }
    }

    public void deleteFriendbyid(Long id){
        for (int x =0;x<friendsList.size();x++){
            Friends f = friendsList.get(x);
            if (f.getId().equals(id)){
                friendsList.remove(x);
            }
        }
    }
    
}
