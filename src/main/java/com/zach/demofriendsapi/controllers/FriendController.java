package com.zach.demofriendsapi.controllers;

import com.zach.demofriendsapi.domain.Friends;
import com.zach.demofriendsapi.service.FriendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FriendController {
    @Autowired
    private FriendsService friendsService;


     //get list
   @RequestMapping(value = "/friends",method = RequestMethod.GET)
   public List<Friends> getAllFriends(){
       return friendsService.getListofFriends();
   }
   //get friend by id
    @RequestMapping(value = "/friends/{id}", method = RequestMethod.GET)
    public Friends getAnFriendsByID(@PathVariable Long id){
        return friendsService.getFriendsbyID(id);
    }

    //add friend
    @RequestMapping(value = "/friends",method = RequestMethod.POST)
public void addFriend(@RequestBody Friends friends){
    friendsService.addFriends(friends);
}

//Update friend
@RequestMapping(value = "/friends/{id}",method = RequestMethod.PUT)
public void update(@PathVariable Long id, @RequestBody Friends friends){
    friendsService.updateFriends(id,friends);
}

//unfriend friend
@RequestMapping(value = "/friends/{id}",method = RequestMethod.DELETE)
public void delete(@PathVariable Long id){
    friendsService.deleteFriendbyid(id);
}


}
