package com.zep.cafemanagement.restimpl;

import com.zep.cafemanagement.constants.CafeConstants;
import com.zep.cafemanagement.rest.UserRest;
import com.zep.cafemanagement.service.UserService;
import com.zep.cafemanagement.utils.CafeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserRestImpl implements UserRest {
    @Autowired
    UserService userService;
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        //return null;
        try{
           return  userService.signUp(requestMap);
        }catch (Exception ex){
            ex.printStackTrace();}
return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
