//package com.springboot.jpa.data.dao.impl;
//
//import com.springboot.jpa.data.dao.S_MenuDAO;
//import com.springboot.jpa.data.entity.S_Menu;
//import com.springboot.jpa.data.repository.S_MenuRepository;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//// 예제 6.10
//@Component
//public class S_MenuDAOImpl implements S_MenuDAO {
//
//    private S_MenuRepository s_menuRepository;
//
//    @Autowired
//    public S_MenuDAOImpl(S_MenuRepository s_menuRepository) {
//        this.s_menuRepository = s_menuRepository;
//    }
//
//    // 예제 6.11
//    @Override
//    public S_Menu insertS_Menu(S_Menu s_menu) {
//        S_Menu savedS_Menu = s_menuRepository.save(s_menu);
//
//        return savedS_Menu;
//    }
//
//    // 예제 6.12
//    @Override
//    public S_Menu selectS_Menu(Long SMENU_CD) {
//        S_Menu selectedS_Menu = s_menuRepository.getById(SMENU_CD);
//
//        return selectedS_Menu;
//    }
//
//    // 예제 6.15
//    @Override
//    public S_Menu updateS_MenuName(Long SMENU_CD, String SMENU_NM) throws Exception {
//        Optional<S_Menu> selectedS_Menu = s_menuRepository.findById(SMENU_CD);
//
//        S_Menu updatedS_Menu;
//        if (selectedS_Menu.isPresent()) {
//            S_Menu s_menu = selectedS_Menu.get();
//
//            s_menu.setSMENU_NM(SMENU_NM);
//
//            updatedS_Menu = s_menuRepository.save(s_menu);
//        } else {
//            throw new Exception();
//        }
//
//        return updatedS_Menu;
//    }
//
//    // 예제 6.17
//    @Override
//    public void deleteS_Menu(Long SMENU_CD) throws Exception {
//        Optional<S_Menu> selectedS_Menu = s_menuRepository.findById(SMENU_CD);
//
//        if (selectedS_Menu.isPresent()) {
//            S_Menu s_menu = selectedS_Menu.get();
//
//            s_menuRepository.delete(s_menu);
//        } else {
//            throw new Exception();
//        }
//    }
//}
